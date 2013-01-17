/*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
*/

package de.ipbhalle.metfrag.similarity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.tools.CDKHydrogenAdder;
import org.openscience.cdk.tools.manipulator.AtomContainerManipulator;

import de.ipbhalle.metfrag.fragmenter.Candidates;

public class SimilarityMetFusion {
	
	public static void main(String[] args) {
		
		if(args == null || args.length < 3)
		{
			System.err.println("not all parameters given");
			System.exit(1);
		}
		
		String folder = args[0];
		String file = args[1];
		String correctCandidateID = args[2];
		
		Map<String, IAtomContainer> candidateToStructure = new HashMap<String, IAtomContainer>();
		Map<Double, Vector<String>> realScoreMap = new HashMap<Double, Vector<String>>();

		try 
		{
			//use buffering, reading one line at a time
			BufferedReader input =  new BufferedReader(new FileReader(new File(folder + file)));
			try {
				String line = null; 
				boolean first = true;
				while (( line = input.readLine()) != null){
					if(first)
						first = false;
					else
					{
						String[] lineArr = line.split("\t");
						
						try
						{
							IAtomContainer molecule = Candidates.getCompoundLocally("pubchem", lineArr[4], "jdbc:mysql://rdbms/MetFrag", "swolf", "populusromanus", true, "");
							//add hydrogens
							
							if(molecule == null)
								continue;
							
					        AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(molecule);
					        CDKHydrogenAdder hAdder = CDKHydrogenAdder.getInstance(molecule.getBuilder());
					        hAdder.addImplicitHydrogens(molecule);
					        AtomContainerManipulator.convertImplicitToExplicitHydrogens(molecule);
							candidateToStructure.put(lineArr[4], molecule);
						}
						//there is a bug in cdk??
				        catch(IllegalArgumentException e)
			            {
				        	System.err.println("Error with mol");
			            }
						
						
						Double currentScore = Double.parseDouble(lineArr[6]);
						if(realScoreMap.containsKey(currentScore))
				        {
				        	Vector<String> tempList = realScoreMap.get(currentScore);
				        	tempList.add(lineArr[4]);
				        	realScoreMap.put(currentScore, tempList);
				        }
				        else
				        {
				        	Vector<String> temp = new Vector<String>();
				        	temp.add(lineArr[4]);
				        	realScoreMap.put(currentScore, temp);
				        }
						
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CDKException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				input.close();
			}
		}
	    catch (IOException ex){
	      ex.printStackTrace();
		}
		    
		    		    
	    Double[] keysScore = new Double[realScoreMap.keySet().size()];
		keysScore = realScoreMap.keySet().toArray(keysScore);
		Arrays.sort(keysScore);
	    Similarity sim = null;
		try {
			sim = new Similarity(candidateToStructure, true, false);
		} catch (CDKException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean stop = false;
	    int rankTanimotoGroup = 0;
	    
	    System.out.println("\n\n\n");
	    
		for (int i = keysScore.length-1; i >= 0; i--) {
			
//			System.out.println("\nScore: " + keysScore[i] + "\n");
			
			List<String> candidateGroup = new ArrayList<String>();
			for (int j = 0; j < realScoreMap.get(keysScore[i]).size(); j++) {
				candidateGroup.add(realScoreMap.get(keysScore[i]).get(j));
			}

			//now cluster 
			TanimotoClusterer tanimoto = new TanimotoClusterer(sim.getSimilarityMatrix(), sim.getCandidateToPosition());
			List<SimilarityGroup> clusteredCpds = tanimoto.clusterCandididates(candidateGroup, 0.95f);
			List<SimilarityGroup> groupedCandidates = tanimoto.getCleanedClusters(clusteredCpds);
			
			List<String> groups = new ArrayList<String>();
			for (SimilarityGroup similarityGroup : groupedCandidates) {				
				List<SimilarityCompound> tempSimilar = similarityGroup.getSimilarCompounds();
				
//				groups.add(similarityGroup.getCandidateTocompare());
//				System.out.print(similarityGroup.getCandidateTocompare() + ": ");
				
//				if(correctCandidateID.equals(similarityGroup.getCandidateTocompare()))
//					stop = true;	

				for (int k = 0; k < tempSimilar.size(); k++) {
					if(correctCandidateID.equals(tempSimilar.get(k).getCompoundID()))
						stop = true;
					
//					System.out.print(tempSimilar.get(k) + "(" +  tempSimilarTanimoto.get(k) + ")");
//					System.out.println(tempSimilar.get(k) + "\t" + rankTanimotoGroup);
					groups.add(tempSimilar.get(k).getCompoundID());
				}	
//				System.out.println("");
				rankTanimotoGroup++;
			}
			for (String string : groups) {
				//DAS IST ENDERGEBNISTABELLE
				System.out.println(string + "\t" + rankTanimotoGroup);
			}
			
//			if(stop)
//				break;
		}
		
//		System.out.println("Tanimoto rank: " + rankTanimotoGroup);

	}

}

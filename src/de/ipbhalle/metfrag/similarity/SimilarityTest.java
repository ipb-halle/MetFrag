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
import java.io.IOException;
import java.io.StringReader;
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

public class SimilarityTest {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
//		String ids = "14982:0.93275\n3495:0.93275\n128229:0.93275\n158471:0.93275\n174708:0.93275\n163744:0.93275\n362492:0.93275\n451751:0.93275\n3077574:0.93275\n3083268:0.93275\n3085104:0.93275\n5284400:0.93275\n9811242:0.93275\n9853994:0.93275\n9897518:0.93275\n" +
//					"10259863:0.93275\n11216627:0.93275\n11968701:0.93275\n11968702:0.93275\n12889141:0.93275\n16213698:0.93275\n16394502:0.93275\n16395512:0.93275\n16398468:0.93275\n17756944:0.93275\n20846886:0.93275\n21124245:0.93275\n21550461:0.93275\n" +
//					"21550462:0.93275\n23304412:0.93275\n25087722:0.93275\n25210703:0.93275\n42598620:0.93275\n30832970.33725\n3313627:0.2995\n6629848:0.2995\n9579214:0.259";
		
		
		String ids = "18000547:0.952\n73306:0.93625\n73305:0.93625\n124355:0.93625\n194586:0.93625\n410240:0.93625\n429614:0.93625\n519178:0.93625\n638969:0.93625\n656716:0.93625\n" +
				"1502034:0.93625\n1502035:0.93625\n3060518:0.93625\n3017096:0.93625\n5288385:0.93625\n5702611:0.93625\n6441491:0.93625\n6951383:0.93625\n9209421:0.93625\n9989294:0.93625\n" +
				"10154063:0.93625\n";
		
//		String ids = "14982:0.93275\n3077574:0.93275";
		String correctCandidateID = "14982";
		
		Map<String, IAtomContainer> candidateToStructure = new HashMap<String, IAtomContainer>();
		Map<Double, Vector<String>> realScoreMap = new HashMap<Double, Vector<String>>();

		try 
		{
			//use buffering, reading one line at a time
			StringReader sr = new StringReader(ids);
			BufferedReader input = new BufferedReader(sr);
			try {
				String line = null; 
				while (( line = input.readLine()) != null){

					String[] lineArr = line.split(":");
					
					try
					{
						IAtomContainer molecule = Candidates.getCompoundLocally("pubchem", lineArr[0], "jdbc:mysql://rdbms/MetFrag", "swolf", "populusromanus", true, "");
						//add hydrogens
						
						if(molecule == null)
							continue;
						
				        AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(molecule);
				        CDKHydrogenAdder hAdder = CDKHydrogenAdder.getInstance(molecule.getBuilder());
				        hAdder.addImplicitHydrogens(molecule);
				        AtomContainerManipulator.convertImplicitToExplicitHydrogens(molecule);
						candidateToStructure.put(lineArr[0], molecule);
					}
					//there is a bug in cdk??
			        catch(IllegalArgumentException e)
		            {
			        	System.err.println("Error with mol");
		            }
					
					
					Double currentScore = Double.parseDouble(lineArr[1]);
					if(realScoreMap.containsKey(currentScore))
			        {
			        	Vector<String> tempList = realScoreMap.get(currentScore);
			        	tempList.add(lineArr[0]);
			        	realScoreMap.put(currentScore, tempList);
			        }
			        else
			        {
			        	Vector<String> temp = new Vector<String>();
			        	temp.add(lineArr[0]);
			        	realScoreMap.put(currentScore, temp);
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
		    
	    
	    Similarity sim = null;
		try {
			sim = new Similarity(candidateToStructure, true, false);
		} catch (CDKException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		    		    
	    Double[] keysScore = new Double[realScoreMap.keySet().size()];
		keysScore = realScoreMap.keySet().toArray(keysScore);
		Arrays.sort(keysScore);
	    
	    boolean stop = false;
	    int rankTanimotoGroup = 0;
	    
	    System.out.println("\n\n\n");
	    
		for (int i = keysScore.length-1; i >= 0; i--) {
			
//			System.out.println("\nScore: " + keysScore[i] + "\n");
			
			List<String> candidateGroup = new ArrayList<String>();
			for (int j = 0; j < realScoreMap.get(keysScore[i]).size(); j++) {
				candidateGroup.add(realScoreMap.get(keysScore[i]).get(j));
			}
			
			
//			List<SimilarityGroup> groupedCandidates = sim.getTanimotoDistanceList(candidateGroup);
			
			TanimotoClusterer tanimoto = new TanimotoClusterer(sim.getSimilarityMatrix(), sim.getCandidateToPosition());
			List<SimilarityGroup> clusteredCpds = tanimoto.clusterCandididates(candidateGroup, 0.95f);
			List<SimilarityGroup> groupedCandidates = tanimoto.getCleanedClusters(clusteredCpds);
			
			List<String> groups = new ArrayList<String>();
			for (SimilarityGroup similarityGroup : groupedCandidates) {				
				List<SimilarityCompound> tempSimilar = similarityGroup.getSimilarCompounds();
				List<Float> tempSimilarTanimoto = similarityGroup.getTanimotoSimilarities();
				
//				groups.add(similarityGroup.getCandidateTocompare());
//				System.out.print(similarityGroup.getCandidateTocompare() + ": ");
				
//				if(correctCandidateID.equals(similarityGroup.getCandidateTocompare()))
//					stop = true;	

				for (int k = 0; k < tempSimilar.size(); k++) {
					if(correctCandidateID.equals(tempSimilar.get(k)))
						stop = true;
					
//					System.out.print(tempSimilar.get(k).getCompoundID() + "(" +  tempSimilarTanimoto.get(k) + ")");
					System.out.print(tempSimilar.get(k).getCompoundID() + " ");
//					System.out.println(tempSimilar.get(k) + "\t" + rankTanimotoGroup);
					groups.add(tempSimilar.get(k).getCompoundID());
				}	
				System.out.println("");
				rankTanimotoGroup++;
			}
			
			
			for (String string : groups) {
				//DAS IST ENDERGEBNISTABELLE
				System.out.println(string + "\t" + rankTanimotoGroup);
			}
			System.out.println("\n\n\n");
//			if(stop)
//				break;
		}
		
//		System.out.println("Tanimoto rank: " + rankTanimotoGroup);

	}

}

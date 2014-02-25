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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.tools.CDKHydrogenAdder;
import org.openscience.cdk.tools.manipulator.AtomContainerManipulator;

import de.ipbhalle.metfrag.fragmenter.Candidates;

public class HierarchicalClusterer {
	
	float[][] distanceMatrix;
	float[][] inputMatrix;
	int[] minimumDistances;
	List<List<String>> clusters;
	
	public HierarchicalClusterer(float[][] inputMatrix)
	{
		this.inputMatrix = inputMatrix;
		this.minimumDistances = new int[distanceMatrix.length];
		clusters = new ArrayList<List<String>>();
		singleLinkage();
		algorithm();
	}
	
	
	private void algorithm()
	{
		int N = distanceMatrix.length;
		for(int s = 0; s < N - 1; s++)
		{
			//find closest pair of clusters (i1, i2)
			int i1 = 0;
			for(int i =0; i < N; i++)
				if(distanceMatrix[i][minimumDistances[i]] < distanceMatrix[i1][minimumDistances[i1]]) 
					i1 = i;
			
			int i2 = minimumDistances[i1];
			
			// overwrite row i1 with minimum of entries in row i1 and i2
			for(int j =0; j < N; j++)
				if(distanceMatrix[i2][j] < distanceMatrix[i1][j]) 
					distanceMatrix[i1][j] = distanceMatrix[j][i1] = distanceMatrix[i2][j];
			
			distanceMatrix[i1][i1] = Float.POSITIVE_INFINITY;
			// infinity-out old row i2 and column i2
			for(int i =0;i < N; i++)
				distanceMatrix[i2][i] = distanceMatrix[i][i2] = Float.POSITIVE_INFINITY;
			
			// update dmin and replace ones that previous pointed to i2 to point to i1
			for(int j = 0; j < N; j++){
				if(minimumDistances[j] == i2)
					minimumDistances[j] = i1;
				if(distanceMatrix[i1][j] < distanceMatrix[i1][minimumDistances[i1]])
					minimumDistances[i1] = j;
			} 
		}
	}
	
	
	private void singleLinkage()
	{
		for (int i = 0; i < minimumDistances.length; i++) {
			minimumDistances[i] = 0;
		}
		
		for (int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix.length; j++) {
				if(i == j)
					distanceMatrix[i][j] = Float.POSITIVE_INFINITY;
				else
				{
					float dist = inputMatrix[i][0] - inputMatrix[j][0];
					
					if(distanceMatrix[i][minimumDistances[i]] > dist)
						minimumDistances[i] = j;
				}
			}
		}
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		String ids = "14982:0.93275\n3495:0.93275\n128229:0.93275\n158471:0.93275\n174708:0.93275\n163744:0.93275\n362492:0.93275\n451751:0.93275\n3077574:0.93275\n3083268:0.93275\n3085104:0.93275\n5284400:0.93275\n9811242:0.93275\n9853994:0.93275\n9897518:0.93275\n" +
		"10259863:0.93275\n11216627:0.93275\n11968701:0.93275\n11968702:0.93275\n12889141:0.93275\n16213698:0.93275\n16394502:0.93275\n16395512:0.93275\n16398468:0.93275\n17756944:0.93275\n20846886:0.93275\n21124245:0.93275\n21550461:0.93275\n" +
		"21550462:0.93275\n23304412:0.93275\n25087722:0.93275\n25210703:0.93275\n42598620:0.93275\n30832970.33725\n3313627:0.2995\n6629848:0.2995\n9579214:0.259";
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
		
		System.out.print("\n");
		System.out.print("\n");
		float[][] similarityMatrix = sim.getSimilarityMatrix();
		for (int i = 0; i < similarityMatrix.length; i++) {
			for (int j = 0; j < similarityMatrix.length; j++) {
				System.out.print(similarityMatrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
//		HierarchicalClusterer hc = new HierarchicalClusterer(similarityMatrix);
		
		
		
		
	}
	
	

}

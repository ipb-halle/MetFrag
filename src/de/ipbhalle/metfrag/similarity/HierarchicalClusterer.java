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

}

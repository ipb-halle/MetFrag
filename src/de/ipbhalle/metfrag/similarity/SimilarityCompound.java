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

public class SimilarityCompound {
	
	private boolean isAlreadyInCluster;
	private String compoundID;
	
	/**
	 * Instantiates a new similarity compound.
	 * 
	 * @param compoundID the compound id
	 */
	public SimilarityCompound(String compoundID)
	{
		this.setCompoundID(compoundID);
	}

	/**
	 * Sets the already in cluster.
	 * 
	 * @param isAlreadyInCluster the new already in cluster
	 */
	public void setAlreadyInCluster(boolean isAlreadyInCluster) {
		this.isAlreadyInCluster = isAlreadyInCluster;
	}

	/**
	 * Checks if is already in cluster.
	 * 
	 * @return true, if is already in cluster
	 */
	public boolean isAlreadyInCluster() {
		return isAlreadyInCluster;
	}

	/**
	 * Sets the compound id.
	 * 
	 * @param compoundID the new compound id
	 */
	public void setCompoundID(String compoundID) {
		this.compoundID = compoundID;
	}

	/**
	 * Gets the compound id.
	 * 
	 * @return the compound id
	 */
	public String getCompoundID() {
		return compoundID;
	}

}

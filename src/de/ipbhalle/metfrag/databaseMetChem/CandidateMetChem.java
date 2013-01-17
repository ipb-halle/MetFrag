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

package de.ipbhalle.metfrag.databaseMetChem;

public class CandidateMetChem {
	
	private Integer compoundID;
	private String accession;
	
	public CandidateMetChem(Integer compoundID, String accession)
	{
		setAccession(accession);
		setCompoundID(compoundID);
	}

	public void setCompoundID(Integer compoundID) {
		this.compoundID = compoundID;
	}

	public Integer getCompoundID() {
		return compoundID;
	}

	public void setAccession(String accession) {
		this.accession = accession;
	}

	public String getAccession() {
		return accession;
	}

}

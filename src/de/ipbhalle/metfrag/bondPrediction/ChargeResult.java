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

package de.ipbhalle.metfrag.bondPrediction;

import org.openscience.cdk.interfaces.IAtomContainer;

public class ChargeResult {
	
	private IAtomContainer originalMol = null;
	private IAtomContainer molWithProton = null;
	private IAtomContainer molWithCharge = null;
	private String chargeString = "";
	
	/**
	 * Instantiates a new charge result.
	 * 
	 * @param mol the mol
	 * @param chargeString the charge string
	 */
	public ChargeResult(IAtomContainer originalMol, IAtomContainer molWithProton, IAtomContainer molWithCharge, String chargeString)
	{
		this.setOriginalMol(originalMol);
		this.setMol(molWithProton);
		this.setChargeString(chargeString);
		this.setMolWithCharge(molWithCharge);
	}

	public void setMol(IAtomContainer molWithProton) {
		this.molWithProton = molWithProton;
	}

	public IAtomContainer getMolWithProton() {
		return molWithProton;
	}

	public void setChargeString(String chargeString) {
		this.chargeString = chargeString;
	}

	public String getChargeString() {
		return chargeString;
	}

	public void setOriginalMol(IAtomContainer originalMol) {
		this.originalMol = originalMol;
	}

	public IAtomContainer getOriginalMol() {
		return originalMol;
	}

	public void setMolWithCharge(IAtomContainer molWithCharge) {
		this.molWithCharge = molWithCharge;
	}

	public IAtomContainer getMolWithCharge() {
		return molWithCharge;
	}

}

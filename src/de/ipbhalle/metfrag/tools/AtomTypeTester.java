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

package de.ipbhalle.metfrag.tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.tools.CDKHydrogenAdder;
import org.openscience.cdk.tools.manipulator.AtomContainerManipulator;
import org.openscience.cdk.tools.manipulator.MolecularFormulaManipulator;

import de.ipbhalle.metfrag.read.SDFFile;

public class AtomTypeTester {
	
	public static void main(String[] args) {
		try
        {
			List<IAtomContainer> candidates = new ArrayList<IAtomContainer>();
			try {
				candidates = SDFFile.ReadSDFFile("/home/swolf/src/MetFragCommandLine/Test/030_160559_C4H13N1P2_struct_wM_END.sdf");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println(candidates.size());
			boolean error = false;
			for (int i = 0; i < candidates.size(); i++) {
				
				IAtomContainer container1 = (IAtomContainer)candidates.get(i).clone();
				IAtomContainer container2 = (IAtomContainer)candidates.get(i).clone();
				
				//first method
				try
				{
					//add hydrogens
			        AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(container1);
			        CDKHydrogenAdder hAdder = CDKHydrogenAdder.getInstance(container1.getBuilder());
			        hAdder.addImplicitHydrogens(container1);
			        AtomContainerManipulator.convertImplicitToExplicitHydrogens(container1);
				}
				catch(CDKException e)
				{
					error = true;
					System.err.println("Candidate #" + i + " Formula: " + MolecularFormulaManipulator.getString(MolecularFormulaManipulator.getMolecularFormula(container1)) + " Hydrogen count (Total): " + AtomContainerManipulator.getTotalHydrogenCount(container1) + " Error:" + e.getMessage());
				}
				
				//second method
				try
				{
					//add hydrogens
			        AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(container2);
			        AtomContainerManipulator.convertImplicitToExplicitHydrogens(container2);
				}
				catch(CDKException e)
				{
					System.err.println("Candidate #" + i + " Formula: " + MolecularFormulaManipulator.getString(MolecularFormulaManipulator.getMolecularFormula(container2)) + " Hydrogen count (Total): " + AtomContainerManipulator.getTotalHydrogenCount(container2));
				}
				
				if(error)
				{
					System.out.println("-- Comparison: Candidate #" + i + " Formula: " + MolecularFormulaManipulator.getString(MolecularFormulaManipulator.getMolecularFormula(container2)) + " Hydrogen count (Total): " + AtomContainerManipulator.getTotalHydrogenCount(container2));
					error = false;
				}
					
				
					
			}
	        
        }
        //there is a bug in cdk??
        catch(IllegalArgumentException e)
        {
        	System.err.println("Error");
        	e.printStackTrace();
        	//skip it
        	return;
        } catch (CDKException e) {
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

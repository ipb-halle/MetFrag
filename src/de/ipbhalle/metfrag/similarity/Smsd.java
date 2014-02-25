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

import java.io.IOException;
import java.util.Map;

import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.smiles.SmilesParser;
import org.openscience.cdk.smsd.Isomorphism;
import org.openscience.cdk.smsd.interfaces.Algorithm;

import de.ipbhalle.metfrag.tools.renderer.StructureRenderer;

public class Smsd {

	public static void main(String[] args) throws CDKException, IOException, CloneNotSupportedException {
		
		
		
//		//Substructure Search!
//		SmilesParser sp = new SmilesParser(DefaultChemObjectBuilder.getInstance());
//		// Benzene
//		IAtomContainer A1 = sp.parseSmiles("C1=CC=CC=C1");
//		// Napthalene
//		IAtomContainer A2 = sp.parseSmiles("C1=CC2=C(C=C1)C=CC=C2");
//		//Turbo mode search
//		//Bond Sensitive is set true
//		SMSD comparison = new SMSD(Algorithm.SubStructure, true);
//		// set molecules and remove hydrogens
//		comparison.init(A1, A2, true);
//		// set chemical filter true
//		comparison.setChemFilters(false, false, false);
//		if (comparison.isSubgraph()) {
//		//Get similarity score
//		System.out.println("Tanimoto coefficient:  " + comparison.getTanimotoSimilarity());
//		System.out.println("A1 is a subgraph of A2:  " + comparison.isSubgraph());
//		System.out.println("Euclidean Distance:  " + comparison.getEuclideanDistance());
//		//Get Modified AtomContainer
//		IAtomContainer Mol1 = comparison.getReactantMolecule();
//		IAtomContainer Mol2 = comparison.getProductMolecule();
//		// Print the mapping between molecules
//		System.out.println(" Mappings: ");
//		for (Map.Entry<Integer, Integer> mapping : comparison.getFirstMapping().entrySet()) {
//			System.out.println((mapping.getKey() + 1) + " " + (mapping.getValue() + 1));
//		
//			IAtom eAtom = Mol1.getAtom(mapping.getKey());
//			IAtom pAtom = Mol2.getAtom(mapping.getValue());
//			System.out.println(eAtom.getSymbol() + " " + pAtom.getSymbol());
//		   	}
//		   	System.out.println("");
//		}
		
		
		
		//MCS Search
		SmilesParser sp1 = new SmilesParser(DefaultChemObjectBuilder.getInstance());
		// Benzene
		IAtomContainer A11 = sp1.parseSmiles("C1C(OC2=CC(=CC(=C2C1=O)O)O)C3=CC=C(C=C3)O");
		// Napthalene
		IAtomContainer A21 = sp1.parseSmiles("C1=CC(=CC=C1C=CC(=O)C2=C(C=C(C=C2O)O)O)O");
		
		new StructureRenderer(A11, "NAringenin");
		new StructureRenderer(A21, "NaringeninChalcone");
		
		//{ 0: Default SMSD Algorithm, 1: MCSPlus Algorithm, 2: VFLibMCS Algorithm, 3: CDKMCS Algorithm}
		//Bond Sensitive is set true
		

		Isomorphism comparison1 = new Isomorphism(Algorithm.MCSPlus, true);
		// set molecules and remove hydrogens
		comparison1.init(A11, A21, true, true);
		// set chemical filter true
		comparison1.setChemFilters(true, true, true);
		
		//Get similarity score
		System.out.println("Tanimoto coefficient:  " + comparison1.getTanimotoSimilarity());
		System.out.println("A1 is a subgraph of A2:  " + comparison1.isSubgraph());
		System.out.println("Euclidean Distance:  " + comparison1.getEuclideanDistance());
		//Get Modified AtomContainer
		IAtomContainer Mol11 = comparison1.getReactantMolecule();
		IAtomContainer Mol21 = comparison1.getProductMolecule();
		// Print the mapping between molecules
		System.out.println(" Mappings: ");
		for (Map.Entry<Integer, Integer>  mapping : comparison1.getFirstMapping().entrySet()) {
		    System.out.println((mapping.getKey() + 1) + " " + (mapping.getValue() + 1));
		    IAtom eAtom = Mol11.getAtom(mapping.getKey());
		    IAtom pAtom = Mol21.getAtom(mapping.getValue());
		    System.out.println(eAtom.getSymbol() + " " + pAtom.getSymbol());
		}
		System.out.println("");
		
	}
	
}

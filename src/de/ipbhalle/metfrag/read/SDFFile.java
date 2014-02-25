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

package de.ipbhalle.metfrag.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.io.iterator.IteratingSDFReader;

public class SDFFile {
	
	/**
	 * Read sdf file.
	 * 
	 * @param path the path
	 * 
	 * @return the list< i atom container>
	 * 
	 * @throws CDKException the CDK exception
	 * @throws IOException 
	 */
	public static List<IAtomContainer> ReadSDFFile(String path) throws CDKException, IOException
	{
		IteratingSDFReader reader;
		List<IAtomContainer> ret = new ArrayList<IAtomContainer>();
		
		File f = new File(path);
		
		if(f.isFile())
		{
			reader = new IteratingSDFReader(new FileReader(f), DefaultChemObjectBuilder.getInstance());
			while (reader.hasNext()) {
				IAtomContainer container = (IAtomContainer)reader.next();
				ret.add(container);
			}
	        reader.close();
		}
		
        return ret;
	}
	
	/**
	 * exclude molecules with forbidden atoms
	 * 
	 * @author c-ruttkies
	 * 
	 * @param path
	 * @param forbiddenAtoms
	 * @return
	 * @throws CDKException
	 * @throws IOException 
	 */
	public static List<IAtomContainer> ReadSDFFile(String path, Vector<String> forbiddenAtoms) throws CDKException, IOException
	{
		IteratingSDFReader reader;
		List<IAtomContainer> ret = new ArrayList<IAtomContainer>();
		
		File f = new File(path);
		
		if(f.isFile())
		{
			reader = new IteratingSDFReader(new FileReader(f), DefaultChemObjectBuilder.getInstance());
			while (reader.hasNext()) {
	        	IAtomContainer container = (IAtomContainer)reader.next();
				boolean contains = false;
	        	Iterable<IAtom> it_atoms = container.atoms();
	        	Iterator<IAtom> atoms = it_atoms.iterator();
	        	while(atoms.hasNext()) {
	        		IAtom atom = atoms.next();
	        		for(String atomName : forbiddenAtoms) {
		        		if(atom.getSymbol().compareTo(atomName) == 0) {
	        				contains = true;
	        				break;
		        		}
		        		if(contains) break;
	        		}
	        	}
	        	if(!contains) ret.add(container);
			}
	        reader.close();
		}
		
        return ret;
	}	
	
	public static List<IAtomContainer> ReadSDFFileIteratively(String path, Vector<String> forbiddenAtoms) throws CDKException, IOException
	{
		IteratingSDFReader reader;
		List<IAtomContainer> ret = new ArrayList<IAtomContainer>();
		
		File f = new File(path);
		
		if(f.isFile())
		{
			reader = new IteratingSDFReader(new FileReader(f), DefaultChemObjectBuilder.getInstance());
	        while (reader.hasNext()) {
	        	IAtomContainer con = (IAtomContainer)reader.next();
	        	boolean contains = false;
	        	Iterable<IAtom> it_atoms = con.atoms();
	        	Iterator<IAtom> atoms = it_atoms.iterator();
	        	while(atoms.hasNext()) {
	        		IAtom atom = atoms.next();
	        		for(String atomName : forbiddenAtoms) {
		        		if(atom.getSymbol().compareTo(atomName) == 0) {
	        				contains = true;
	        				break;
		        		}
		        		if(contains) break;
	        		}
	        	}
	        	if(!contains) ret.add(con);
			}
	        reader.close();
		}
		
        return ret;
	}
}

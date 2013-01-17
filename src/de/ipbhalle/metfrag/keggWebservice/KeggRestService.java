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

package de.ipbhalle.metfrag.keggWebservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Vector;

import org.openscience.cdk.ChemFile;
import org.openscience.cdk.ChemObject;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.exception.InvalidSmilesException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.io.MDLV2000Reader;
import org.openscience.cdk.smiles.SmilesGenerator;
import org.openscience.cdk.tools.manipulator.ChemFileManipulator;

import de.ipbhalle.metfrag.tools.MolecularFormulaTools;

/**
 * 
 * @author c-ruttkies
 *
 */
public class KeggRestService {
	
	/**
	 * 
	 * @param mass
	 * @param error
	 * @param verbose
	 * @return
	 */
	public static Vector<String> KEGGbyMass(double mass, double error)
	{
		Vector<String> cids = new Vector<String>();
		String urlname = "http://rest.kegg.jp/find/compound/"+(mass-error)+"-"+(mass+error)+"/exact_mass";
		InputStream stream = getInputStreamFromURL(urlname);
		if(stream == null) return cids;
		try {
			BufferedReader breader = new BufferedReader(new InputStreamReader(stream));
			String line = "";
			while((line = breader.readLine()) != null) {
				if(line.length() != 0) {
					String[] tmp = line.split("\\s+");
					if(tmp != null && tmp.length != 0) cids.add(tmp[0]);
				}
			}
			stream.close();
			breader.close();
		} catch (IOException e) {
			System.err.println("Error: Could not open result stream when using KEGG REST mass search!");
			System.err.println(urlname);
			e.printStackTrace();
		}
		return cids;
	}
	
	/**
	 * 
	 * @param sumFormula
	 * @return
	 */
	public static Vector<String> KEGGbySumFormula(String sumFormula)
	{
		Vector<String> cids = new Vector<String>();
		InputStream stream = getInputStreamFromURL("http://rest.kegg.jp/find/compound/"+sumFormula+"/formula");
		try {
			BufferedReader breader = new BufferedReader(new InputStreamReader(stream));
			String line = "";
			while((line = breader.readLine()) != null) {
				if(line.length() != 0) {
					String[] tmp = line.split("\\s+");
					if(tmp != null && tmp.length != 0) cids.add(tmp[0]);
				}
			}
			stream.close();
			breader.close();
		} catch (IOException e) {
			System.err.println("Error: Could not open result stream when using KEGG REST sum formula search!");
		}
		return cids;
	}
	
	/**
	 * 
	 * @param cid
	 * @return
	 */
	public static IAtomContainer getMolOnline(String cid, boolean getAll) {
		InputStream stream = getInputStreamFromURL("http://rest.kegg.jp/get/"+cid+"/mol");
		if(stream == null) return null;
		MDLV2000Reader reader = new MDLV2000Reader(stream);
		ChemFile chemFile = null;
		try {
			chemFile = (ChemFile)reader.read((ChemObject)new ChemFile());
		} catch (CDKException e) {
			System.err.println("Error: Could not create atomcontainer!");
			return null;
		}
		List<IAtomContainer> containersList = ChemFileManipulator.getAllAtomContainers(chemFile);
		if(containersList == null || containersList.size() == 0) return null;
		if(getAll)
        	return containersList.get(0);
        try {
			if(!MolecularFormulaTools.isBiologicalCompound(containersList.get(0)))
				return null;
		} catch (InvalidSmilesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        return containersList.get(0);
	}
	
	/**
	 * 
	 * @param cids
	 * @return
	 */
	public static Vector<IAtomContainer> getMolsOnline(Vector<String> cids) {
		Vector<IAtomContainer> molecules = new Vector<IAtomContainer>();
		MDLV2000Reader reader = null;
		ChemFile chemFile = null;
		for(String cid : cids) {
			String urlname = "http://rest.kegg.jp/get/"+cid+"/mol";
			InputStream stream = getInputStreamFromURL(urlname);
			reader = new MDLV2000Reader(stream);
			try {
				chemFile = (ChemFile)reader.read((ChemObject)new ChemFile());
			} catch (CDKException e) {
				System.err.println("Error: Could not create atomcontainer for id "+cid+"!");
				continue;
			}
			List<IAtomContainer> containersList = ChemFileManipulator.getAllAtomContainers(chemFile);
			if(containersList == null || containersList.size() == 0) {
				System.err.println("Error: Could not create atomcontainer for id "+cid+"!");
				continue;
			}
			molecules.add(containersList.get(0));
        }        
		return molecules;
	}
	/**
	 * 
	 * @param cid
	 * @return
	 */
	public static String KEGGgetMol(String cid) {
		InputStream stream = getInputStreamFromURL("http://rest.kegg.jp/get/"+cid+"/mol");
		if(stream == null) return null;
		BufferedReader breader = new BufferedReader(new InputStreamReader(stream));
		StringBuilder sb = new StringBuilder();
		String line;
    	try {
			while ((line = breader.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
		} catch (IOException e) {
			System.err.println("Error: Reading mol information out of stream failed.");
			return "";
		} 
    	return sb.toString();
	}
	
	/**
	 * identifier as kegg cid
	 * 
	 * @param identifier
	 * @return
	 */
	public static String KEGGgetNameByCpd(String identifier)
	{
		InputStream stream = getInputStreamFromURL("http://rest.kegg.jp/get/"+identifier);
		String name = "";
		if(stream == null) return name;
		try {
			BufferedReader breader = new BufferedReader(new InputStreamReader(stream));
			String line = "";
			boolean startNames = false;
			while((line = breader.readLine()) != null) {
				if(line.length() != 0) {
					if(startNames && line.charAt(0) != ' ') break;
					if(line.startsWith("NAME")) {
						startNames = true;
						line = line.replace("NAME", "");
					}
					if(startNames) {
						line = line.trim().split(";")[0];
						name += line + "\n";
					}
				}
			}
			stream.close();
			breader.close();
		} catch (IOException e) {
			System.err.println("Error: Could not open result stream when using KEGG REST mass search!");
		}
		return name;
	}
	
	/**
	 * identifier as kegg cid
	 * 
	 * @param identifier
	 * @return
	 */
	public static String[] KEGGgetNameByCpdAsArray(String identifier)
	{
		InputStream stream = getInputStreamFromURL("http://rest.kegg.jp/get/"+identifier);
		String[] names = new String[0];
		if(stream == null) return names;
		Vector<String> namesAsVector = new Vector<String>(); 
		try {
			BufferedReader breader = new BufferedReader(new InputStreamReader(stream));
			String line = "";
			boolean startNames = false;
			while((line = breader.readLine()) != null) {
				if(line.length() != 0) {
					if(startNames && line.charAt(0) != ' ') break;
					if(line.startsWith("NAME")) {
						startNames = true;
						line = line.replace("NAME", "");
					}
					if(startNames) {
						line = line.trim().split(";")[0];
						namesAsVector.add(line);
					}
				}
			}
			stream.close();
			breader.close();
		} catch (IOException e) {
			System.err.println("Error: Could not open result stream when using KEGG REST mass search!");
		}
		names = new String[namesAsVector.size()];
		for(int i = 0; i < names.length; i++)
			names[i] = namesAsVector.get(i);
		return names;
	}
	
	/**
	 * 
	 * @param urlname
	 * @return
	 */
	private static InputStream getInputStreamFromURL(String urlname) {
		InputStream stream = null;
		
		try {
			URL url = new URL(urlname);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
			if (conn.getResponseCode() != 200) {
				throw new IOException(conn.getResponseMessage());
			}
			stream = conn.getInputStream();
		} catch(MalformedURLException mue) {
			System.err.println("Error: Could create URL object!");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Error: Could not open URL connection!");
			System.exit(2);
		}
		
		return stream;
	}
	
	/**
	 * 
	 * @param molString
	 * @return
	 */
	public static IAtomContainer getAtomContainerFromString(String molString) {
		MDLV2000Reader reader = new MDLV2000Reader(new StringReader(molString));
		ChemFile chemFile = null;
		try {
			chemFile = (ChemFile)reader.read((ChemObject)new ChemFile());
		} catch (CDKException e) {
			System.err.println("Error: Could not create atomcontainer!");
			return null;
		}
		List<IAtomContainer> containersList = ChemFileManipulator.getAllAtomContainers(chemFile);
		if(containersList == null || containersList.size() == 0) return null;
		return containersList.get(0);
	}
	
}

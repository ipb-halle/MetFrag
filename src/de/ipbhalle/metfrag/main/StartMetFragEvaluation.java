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

package de.ipbhalle.metfrag.main;

import java.io.File;
import java.util.Arrays;

import de.ipbhalle.metfrag.spectrum.WrapperSpectrum;

public class StartMetFragEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String spectraFolder = "";
		String outputFolder = "";
		String database = "kegg";
		
		if(args != null && args.length == 3)
		{
			spectraFolder = args[0];
			outputFolder = args[1];
			database = args[2];
		}
		else
		{
			System.err.println("Not all parameters given! (Needs spectraFolder and outputFolder and database)\n\n\nExample:\n java -Xms1500m -Xmx4500m -Dproperty.file.path=/home/swolf/src/MetFragSDF/ -jar MetFragToSDF.jar \"/home/swolf/src/MetFragSDF/spectra/\" \"/home/swolf/src/MetFragSDF/results/\" \"kegg\"");
			System.exit(1);
		}
		
		
		//loop over all files in folder
		File f = new File(spectraFolder);
		File files[] = f.listFiles();
		Arrays.sort(files);
		for(int i=0;i<files.length;i++)
		{
			if(files[i].isFile())
			{
				WrapperSpectrum spectrum = new WrapperSpectrum(files[i].toString());

				String output = "";
				//start MetFrag
				try {
					boolean useIPBProxy = false;
					//possible databases: kegg, pubchem, chemspider
					output = MetFrag.start(database, "", "", spectrum.getExactMass(), spectrum, useIPBProxy, outputFolder);
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
					e.printStackTrace();
				}
			}
		}

	}

}

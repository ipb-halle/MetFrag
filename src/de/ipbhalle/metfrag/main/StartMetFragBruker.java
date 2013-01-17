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

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import de.ipbhalle.metfrag.spectrum.WrapperSpectrum;


public class StartMetFragBruker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int length = args.length;
		
		Double exactMass = 0.;
		if ( 1 < length )
			exactMass = Double.parseDouble( args[1] );
		String formula = "";
		
		if ( 2 < length )
			formula = args[2];
		
		
		//alternatively read peaklist from file
		String peaks2 = "";
		try
		{
			String filename = "";
			
			if ( 0 < length )
				filename = args[0];
			
			if ("" == filename)
				return;
			
			FileInputStream fstream = new FileInputStream(args[0]);
		    DataInputStream in = new DataInputStream(fstream);
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    String strLine;
		    //Read File Line By Line
		    while ((strLine = br.readLine()) != null)   {
		    	peaks2 += strLine;
		    	peaks2 += "\n";
		    }
		    in.close();
		    
		    System.err.println( peaks2 );
		}
		catch(IOException e)
		{
			System.err.println("File not found! " + e.getMessage());
		}
		
		//create spectrum
		WrapperSpectrum spectrum = new WrapperSpectrum(peaks2, 1, exactMass, true);
		
		
		String output = "";
		String outFilename = args[0] + ".sdf";
		//start MetFrag
		try {
			boolean useIPBProxy = false;
			//possible databases: kegg, pubchem, chemspider
			output = MetFrag.start("pubchem", "89", formula, exactMass, spectrum, useIPBProxy, outFilename);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("\n\n\nMetFrag Results\n\n" + output);
		
		
	}

}

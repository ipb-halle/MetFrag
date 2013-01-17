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

package de.ipbhalle.metfrag.mainTools;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class CountFiles {
	
	public static void main(String[] args) {
		
		String pathToScan = "/home/swolf/MOPAC/100spec_SDF_GC-EIMS/sdf_calculated/";
		String[] ext = {"cml"};
		
		Collection<File> filesRecursively = (Collection<File>)FileUtils.listFiles(new File(pathToScan), ext, true);
		int count = 0;
		for (File file : filesRecursively) {
			if(file.getName().contains("_Combined"))
				count++;
		}
		
		System.out.println(count);
	}
}

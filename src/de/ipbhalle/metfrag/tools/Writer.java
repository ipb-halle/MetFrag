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

import org.apache.commons.io.output.LockableFileWriter;

public class Writer {
	
	/**
	 * Write to file and prevent that this file is overwritten by another thread while writing to it.
	 * 
	 * @param file the file
	 * @param content the content
	 * 
	 * @throws InterruptedException the interrupted exception
	 */
	public static void writeToFile(String file, String content) throws InterruptedException
	{
		try
		{
			LockableFileWriter lfw = new LockableFileWriter(file, true, "/home/swolf/locks/");
			lfw.write(content);
			lfw.close();
		}
		catch (Exception e) {			
			Thread.sleep(10);
			writeToFile(file, content);
		}
	}

}

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

package de.ipbhalle.metfrag.database;

import org.openscience.cdk.io.IChemObjectReaderErrorHandler;

public class ErrorHandler implements IChemObjectReaderErrorHandler{
	

		  public void handleError(String message) {
		    System.out.println(message);
		  };
		  public void handleError(String message, Exception exception) {
		    System.out.println(message + "\n -> " + exception.getMessage());
		  };
		  public void handleError(String message, int row, int col) {
		    System.out.print("location: " + row + ", " + col + ": ");
		    System.out.println(message);
		  };
		  public void handleError(String message, int row, int col, Exception exception) {
		    System.out.print("location: " + row + ", " + col + ": ");
		    System.out.println(message + "\n -> " + exception.getMessage());
		  }
		@Override
		public void handleError(String message, int row, int colStart,
				int colEnd) {
			System.out.print("location: " + row + ", " + colStart + " " + colEnd + ": ");
		    System.out.println(message);
			
		}
		@Override
		public void handleError(String message, int row, int colStart,
				int colEnd, Exception exception) {
			System.out.print("location: " + row + ", " + colStart + " " + colEnd + ": ");
			System.out.println(message + "\n -> " + exception.getMessage());
			
		}

}

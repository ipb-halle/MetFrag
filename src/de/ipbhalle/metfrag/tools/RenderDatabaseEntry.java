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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.exception.InvalidSmilesException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.smiles.SmilesParser;

import de.ipbhalle.metfrag.main.Config;
import de.ipbhalle.metfrag.tools.renderer.StructureRenderer;

public class RenderDatabaseEntry {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		try {
			
			
			
			
			
			String driver = "org.postgresql.Driver"; 
			Connection con;
			Class.forName(driver);
			DriverManager.registerDriver(new org.postgresql.Driver()); 
	        //database data
	        Config c = new Config();
	        String url = c.getJdbcPostgres();
	        String username = c.getUsernamePostgres();
	        String password = c.getPasswordPostgres();
	        con = DriverManager.getConnection(url, username, password);
		    con.setAutoCommit(false);
		    
		    
			Statement stmt = con.createStatement();
			stmt.execute("select structure from structures where id = '249'");
			while(stmt.getResultSet().next())
			{
				ResultSet rs = stmt.getResultSet();
				Object mol = rs.getObject(1);
				SmilesParser sp = new SmilesParser(DefaultChemObjectBuilder.getInstance());
				IAtomContainer molecule = sp.parseSmiles(mol.toString().trim());
				new StructureRenderer(molecule, "");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidSmilesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

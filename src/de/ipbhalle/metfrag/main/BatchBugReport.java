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

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openscience.cdk.atomtype.CDKAtomTypeMatcher;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IAtomType;
import org.openscience.cdk.interfaces.IChemObjectBuilder;
import org.openscience.cdk.interfaces.IPseudoAtom;
import org.openscience.cdk.nonotify.NoNotificationChemObjectBuilder;
import org.openscience.cdk.smiles.SmilesParser;
import org.openscience.cdk.tools.manipulator.AtomTypeManipulator;

import de.ipbhalle.metfrag.read.SDFFile;

public class BatchBugReport {
	
	public static void main(String[] args) {
//		int threads = Runtime.getRuntime().availableProcessors();
	    //thread executor
	    ExecutorService threadExecutor = Executors.newFixedThreadPool(4);
		List<IAtomContainer> candidates = null;
		try
		{
			candidates = SDFFile.ReadSDFFile("/home/swolf/src/MetFragCommandLine/Test/084_1614_C8H16_struct_wM_END.sdf");
			System.out.println(candidates.size());
		}
		catch(FileNotFoundException e)
		{
			System.err.println("SDF file not found!");
			e.printStackTrace();
		} catch (CDKException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int c = 0; c < candidates.size(); c++) {					
			threadExecutor.execute(new TestThread(candidates.get(c)));
		}
		
		threadExecutor.shutdown();
		
		//wait until all threads are finished
		while(!threadExecutor.isTerminated())
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class TestThread implements Runnable{

	private IAtomContainer mol;
	
	public TestThread(IAtomContainer mol) {
		this.mol = mol;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep((long)Math.random() * 1000);
			IChemObjectBuilder builder = this.mol.getBuilder();
			CDKAtomTypeMatcher matcher = CDKAtomTypeMatcher.getInstance(builder);
			
			if(builder == null)
				System.err.println("Builder is null");
			
			if(matcher == null)
				System.err.println("CDKAtommatcher is null");
			
	        for (IAtom atom : this.mol.atoms()) {
	            if (!(atom instanceof IPseudoAtom)) {
	                IAtomType matched = matcher.findMatchingAtomType(this.mol, atom);
	                if (matched != null) AtomTypeManipulator.configure(atom, matched);
	            }
	        }
	        
			Thread.sleep((long)Math.random() * 1000);
		} catch (CDKException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
}

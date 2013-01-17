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

package de.ipbhalle.metfrag.r;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.io.File;

import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IMolecularFormula;
import org.openscience.cdk.tools.CDKHydrogenAdder;
import org.openscience.cdk.tools.manipulator.AtomContainerManipulator;
import org.openscience.cdk.tools.manipulator.MolecularFormulaManipulator;

import de.ipbhalle.metfrag.main.MetFrag;
import de.ipbhalle.metfrag.main.MetFragResult;
import de.ipbhalle.metfrag.spectrum.PeakMolPair;
import de.ipbhalle.metfrag.spectrum.WrapperSpectrum;
import de.ipbhalle.metfrag.tools.MolecularFormulaTools;

/**
 * 
 * @author c-ruttkies
 *
 */
class MetfRag {
	
	public static IAtomContainer[] scoreMoleculesAgainstSpectrum(String _pathToSDF, double[] _masses, double[] _intensities, 
			double _exactMass, int _numberThreads, double _mzabs, double _mzppm, double _searchppm, boolean _posCharge, 
			int _mode, int _treeDepth) {
		
		double mzabs = _mzabs;
		double mzppm = _mzppm;
		double searchppm = _searchppm;
		double exactMass = _exactMass;
		int treeDepth = _treeDepth;
		int mode = _mode;
		String sdfFile = _pathToSDF;
		int numberThreads = _numberThreads;
		boolean posCharge = _posCharge;
		double[] masses = _masses;
		double[] intensities = _intensities;
		
		IAtomContainer[] resultMols = new IAtomContainer[0];
		if(masses == null) return resultMols;
		if(intensities == null) return resultMols;
		if(masses.length != intensities.length) return resultMols;
		if(exactMass <= 0.0) return resultMols;
		if(numberThreads < -1 || numberThreads > 8) return resultMols;
		if(mzabs < 0.0 || mzppm < 0.0 || searchppm < 0.0) return resultMols;
		if(mode != -1 && mode != 0 && mode != 1) return resultMols;
		if(treeDepth < 1 || treeDepth > 5) return resultMols;
		File sdf = new File(_pathToSDF);
		if(!sdf.exists() || !sdf.canRead()) return resultMols;

		String peaks = "";
		for(int i = 0; i < _masses.length; i++) {
			peaks += _masses[i] + " " + _intensities[i] + "\n";
		}
		
		WrapperSpectrum spec = new WrapperSpectrum(peaks, mode, exactMass, posCharge);
		
		
		try {
			List<MetFragResult> results = MetFrag.startConvenienceSDF(
					spec, mzabs, mzppm, searchppm, true, true, treeDepth,
					true, false, true, false, Integer.MAX_VALUE, 
					false, sdfFile, "", null, true, 
					"", numberThreads, false, "", false);
			
			resultMols = new IAtomContainer[results.size()];
			int rank = 1;
			for(int i = 0; i < results.size(); i++) {
				IAtomContainer tmp = results.get(i).getStructure();
				
				AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(tmp);
		        CDKHydrogenAdder hAdder = CDKHydrogenAdder.getInstance(tmp.getBuilder());
		        for(int k = 0; k < tmp.getAtomCount(); k++)
		        	try { 
		        		hAdder.addImplicitHydrogens(tmp, tmp.getAtom(k));
		        	} catch(Exception e) {
		        		continue;
		        	}
		        AtomContainerManipulator.convertImplicitToExplicitHydrogens(tmp);
	
		        Map<Object, Object> props = tmp.getProperties();
				Set<Object> keys = props.keySet();
				Iterator<Object> it = keys.iterator();
				Vector<Object> obs = new Vector<Object>();
				while(it.hasNext()) {
					obs.add(it.next());
				}
				for(int j = 0; j < obs.size(); j++)
					tmp.removeProperty(obs.get(j));
					
				
			//	tmp = AtomContainerManipulator.removeHydrogens(tmp);
				tmp.setProperty("DatabaseID", results.get(i).getCandidateID());
				IMolecularFormula molFormula = MolecularFormulaManipulator.getMolecularFormula(results.get(i).getStructure());
				Double massDoubleOrig = MolecularFormulaTools.getMonoisotopicMass(molFormula);
				massDoubleOrig = (double)Math.round((massDoubleOrig)*10000)/10000;
				tmp.setProperty("MonoisotopicMass", massDoubleOrig);
				tmp.setProperty("Score", results.get(i).getScore());
				tmp.setProperty("Formula", MolecularFormulaManipulator.getString(molFormula));
				tmp.setProperty("NoPeaksExplained", results.get(i).getPeaksExplained());
				tmp.setProperty("Rank", rank);
				rank++;
				String matchedPeaksString = "";
				Vector<PeakMolPair> pairs = results.get(i).getFragments();
				for (int k = 0; k < pairs.size(); k++) {
					PeakMolPair fragment = pairs.get(k);
					if(k == results.get(i).getFragments().size())
						matchedPeaksString += fragment.getPeak().getMass() + " " + fragment.getPeak().getRelIntensity();
					else
						matchedPeaksString += fragment.getPeak().getMass() + " " + fragment.getPeak().getRelIntensity() + " ";
				}
				if(!matchedPeaksString.equals(""))
					tmp.setProperty("PeaksExplained", matchedPeaksString);
				
				resultMols[i] = tmp;
			}
			
			return resultMols;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
	
	
}

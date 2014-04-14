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
public class MetfRag {
	
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
		if(masses == null) {
			System.err.println("Error: No mz values given!");
			return resultMols;
		}
		if(intensities == null) {
			System.err.println("Error: No intensity values given!");
			return resultMols;
		}
		if(masses.length != intensities.length) {
			System.err.println("Error: Number of mz and intensity values differ!");
			return resultMols;
		}
		if(exactMass <= 0.0) {
			System.err.println("Error: Precursor mass has to be a positive value!");
			return resultMols;
		}
		if(numberThreads < -1 || numberThreads > 8) {
			System.err.println("Error: The given number of threads has to be between 1 and 8!");
			return resultMols;
		}
		if(mzabs < 0.0 || mzppm < 0.0 || searchppm < 0.0) {
			System.err.println("Error: Values for mzabs, mzppm and searchppm have to be positive!");
			return resultMols;
		}
		if(mode != -1 && mode != 0 && mode != 1) {
			System.err.println("Error: Valid values for mode are -1, 0 and 1!");
			return resultMols;
		}
		if(treeDepth < 1 || treeDepth > 5) {
			System.err.println("Error: The given number for tree depth has to be between 1 and 5!");
			return resultMols;
		}
		File sdf = new File(_pathToSDF);
		if(!sdf.exists() || !sdf.canRead()) {
			System.err.println("Error: SDF file does not exist or is not readable!");
			return resultMols;
		}

		String peaks = "";
		for(int i = 0; i < _masses.length; i++) {
			peaks += _masses[i] + " " + _intensities[i] + "\n";
		}
		
		WrapperSpectrum spec = new WrapperSpectrum(peaks, mode, exactMass, posCharge);
		System.out.println("Read " + spec.getPeakList().size() + " mass peaks");
		
		try {
			List<MetFragResult> results = MetFrag.startConvenienceSDF(
					spec, mzabs, mzppm, searchppm, true, true, treeDepth,
					true, true, true, false, Integer.MAX_VALUE, 
					true, sdfFile, "", null, true, 
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
				tmp.setProperty("PeakScore", results.get(i).getRawPeakMatchScore());
				tmp.setProperty("BondEnergyScore", results.get(i).getRawBondEnergyScore());
				tmp.setProperty("Score", results.get(i).getScore());
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

	public static IAtomContainer[] scoreMoleculesAgainstSpectrum(IAtomContainer[] candidates, double[] _masses, double[] _intensities, 
			double _exactMass, int _numberThreads, double _mzabs, double _mzppm, boolean _posCharge, 
			int _mode, int _treeDepth) {
		double mzabs = _mzabs;
		double mzppm = _mzppm;
		double exactMass = _exactMass;
		int treeDepth = _treeDepth;
		int mode = _mode;
		int numberThreads = _numberThreads;
		boolean posCharge = _posCharge;
		double[] masses = _masses;
		double[] intensities = _intensities;
		
		IAtomContainer[] resultMols = new IAtomContainer[0];
		if(masses == null) {
			System.err.println("Error: No mz values given!");
			return resultMols;
		}
		if(intensities == null) {
			System.err.println("Error: No intensity values given!");
			return resultMols;
		}
		if(masses.length != intensities.length) {
			System.err.println("Error: Number of mz and intensity values differ!");
			return resultMols;
		}
		if(exactMass <= 0.0) {
			System.err.println("Error: Precursor mass has to be a positive value!");
			return resultMols;
		}
		if(numberThreads < -1 || numberThreads > 8) {
			System.err.println("Error: The given number of threads has to be between 1 and 8!");
			return resultMols;
		}
		if(mode != -1 && mode != 0 && mode != 1) {
			System.err.println("Error: Valid values for mode are -1, 0 and 1!");
			return resultMols;
		}
		if(treeDepth < 1 || treeDepth > 5) {
			System.err.println("Error: The given number for tree depth has to be between 1 and 5!");
			return resultMols;
		}
		if(candidates == null || candidates.length == 0) {
			System.err.println("Error: No candidate molecules given!");
			return resultMols;
		}

		String peaks = "";
		for(int i = 0; i < _masses.length; i++) {
			peaks += _masses[i] + " " + _intensities[i] + "\n";
		}
		
		WrapperSpectrum spec = new WrapperSpectrum(peaks, mode, exactMass, posCharge);
		System.out.println("Read " + spec.getPeakList().size() + " mass peaks");
		
		try {
			List<MetFragResult> results = MetFrag.startConvenienceMetFragR(
					spec, mzabs, mzppm, true, true, treeDepth,
					true, true, true, false, Integer.MAX_VALUE, 
					true, candidates, "", null, 
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
				tmp.setProperty("PeakScore", results.get(i).getRawPeakMatchScore());
				tmp.setProperty("BondEnergyScore", results.get(i).getRawBondEnergyScore());
				tmp.setProperty("Score", results.get(i).getScore());
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
	public static void main(String[] args) {
		double[] mzs = {96.0447,96.0684,104.0495,105.0701,106.0651,111.0553,117.0576,117.07,118.0652,120.0808,129.0702,130.0652,131.0729,132.0808,133.0076,133.0523,133.076,134.0964,135.0552,144.0808,145.0647,145.0887,146.0838,146.0964,147.0917,148.0757,149.0708,158.0599,159.0912,160.0994,161.1073,162.0915,172.0757,174.0788,189.1021};
		double[] ints = {1,2,4,1,1,2,1,2,14,15,1,24,70,15,13,1,8,1,3,52,5,1,40,34,38,9,1,3,1,1,59,2,25,22,999};
		IAtomContainer[] resultMols = scoreMoleculesAgainstSpectrum("/home/cruttkie/github/Tools/results_UF406803.sdf", mzs, ints, 188.0950,
			1, 0.01, 10.0, 10.0, true, 1, 2);
		
		
	}
	
}

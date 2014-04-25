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


package de.ipbhalle.metfrag.fragmenter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.openscience.cdk.AtomContainerSet;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.graph.ConnectivityChecker;
import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.io.SDFWriter;
import org.openscience.cdk.tools.CDKHydrogenAdder;
import org.openscience.cdk.tools.manipulator.AtomContainerManipulator;

import de.ipbhalle.metfrag.databaseMetChem.Query;
import de.ipbhalle.metfrag.fragmenter.Fragmenter;
import de.ipbhalle.metfrag.main.Config;
import de.ipbhalle.metfrag.main.MetFrag;
import de.ipbhalle.metfrag.massbankParser.Peak;
import de.ipbhalle.metfrag.pubchem.PubChemWebService;
import de.ipbhalle.metfrag.read.Molfile;
import de.ipbhalle.metfrag.scoring.Scoring;
import de.ipbhalle.metfrag.spectrum.AssignFragmentPeak;
import de.ipbhalle.metfrag.spectrum.CleanUpPeakList;
import de.ipbhalle.metfrag.spectrum.PeakMolPair;
import de.ipbhalle.metfrag.spectrum.WrapperSpectrum;

public class FragmenterThread implements Runnable{
	
	private String database = null;
	private PubChemWebService pw = null;
	private String candidate = null;
	private double mzabs;
	private double mzppm;
	private boolean sumFormulaRedundancyCheck = true;
	private boolean breakAromaticRings = true;
	private int treeDepth = 2;
	private WrapperSpectrum spectrum = null;
	private boolean hydrogenTest = true;
	private boolean neutralLossAdd = false;
	private boolean bondEnergyScoring = false;
	private boolean isOnlyBreakSelectedBonds = false;
	private Config c = null;
	private boolean generateFragmentsInMemory = true;
	private String jdbc, username, password = "";
	private IAtomContainer candidateStructure = null;
	private String saveFragmentsPath = "";
	private String sampleName = "";
	private boolean localdb = false;
	
	private String chemSpiderToken = "";
	private static boolean verbose;
	private static int candidateNumber = 1;
	private static int sizeCandidates;
	private boolean onlyChnopsCompounds = false;
	
	static int percent = 0;
	
	/**
	 * Instantiates a new pubChem search thread.
	 * 
	 * @param candidate the candidate
	 * @param mzabs the mzabs
	 * @param mzppm the mzppm
	 * @param sumFormulaRedundancyCheck the sum formula redundancy check
	 * @param breakAromaticRings the break aromatic rings
	 * @param treeDepth the tree depth
	 * @param showDiagrams the show diagrams
	 * @param spectrum the spectrum
	 * @param hydrogenTest the hydrogen test
	 * @param database the database
	 * @param pw the pw
	 * @param neutralLossAdd the neutral loss add
	 * @param bondEnergyScoring the bond energy scoring
	 * @param isOnlyBreakSelectedBonds the is only break selected bonds
	 * @param c the c
	 * @param generateFragmentsInMemory the generate fragments in memory
	 */
	public FragmenterThread(String candidate, String database, PubChemWebService pw,
			WrapperSpectrum spectrum, double mzabs, double mzppm, boolean sumFormulaRedundancyCheck,
			boolean breakAromaticRings, int treeDepth, boolean showDiagrams, boolean hydrogenTest,
			boolean neutralLossAdd, boolean bondEnergyScoring, boolean isOnlyBreakSelectedBonds, Config c,
			boolean generateFragmentsInMemory)
	{
		this.candidate = candidate;
		this.pw = pw;
		this.database = database;
		this.mzabs = mzabs;
		this.mzppm = mzppm;
		this.sumFormulaRedundancyCheck = sumFormulaRedundancyCheck;
		this.breakAromaticRings = breakAromaticRings;
		this.spectrum = spectrum;
		this.hydrogenTest = hydrogenTest;
		this.neutralLossAdd = neutralLossAdd;
		this.bondEnergyScoring = bondEnergyScoring;
		this.isOnlyBreakSelectedBonds = isOnlyBreakSelectedBonds;
		this.treeDepth = treeDepth;
		this.c = c;
		this.generateFragmentsInMemory = generateFragmentsInMemory;
	}
	
	/**
	 * 
	 * @param candidateStructure
	 * @param candidate
	 * @param database
	 * @param pw
	 * @param spectrum
	 * @param mzabs
	 * @param mzppm
	 * @param sumFormulaRedundancyCheck
	 * @param breakAromaticRings
	 * @param treeDepth
	 * @param showDiagrams
	 * @param hydrogenTest
	 * @param neutralLossAdd
	 * @param bondEnergyScoring
	 * @param isOnlyBreakSelectedBonds
	 * @param c
	 * @param generateFragmentsInMemory
	 */
	public FragmenterThread(IAtomContainer candidateStructure, String candidate, String database, PubChemWebService pw,
			WrapperSpectrum spectrum, double mzabs, double mzppm, boolean sumFormulaRedundancyCheck,
			boolean breakAromaticRings, int treeDepth, boolean showDiagrams, boolean hydrogenTest,
			boolean neutralLossAdd, boolean bondEnergyScoring, boolean isOnlyBreakSelectedBonds, Config c,
			boolean generateFragmentsInMemory)
	{
		this.candidate = candidate;
		this.pw = pw;
		this.database = database;
		this.mzabs = mzabs;
		this.mzppm = mzppm;
		this.sumFormulaRedundancyCheck = sumFormulaRedundancyCheck;
		this.breakAromaticRings = breakAromaticRings;
		this.spectrum = spectrum;
		this.hydrogenTest = hydrogenTest;
		this.neutralLossAdd = neutralLossAdd;
		this.bondEnergyScoring = bondEnergyScoring;
		this.isOnlyBreakSelectedBonds = isOnlyBreakSelectedBonds;
		this.treeDepth = treeDepth;
		this.c = c;
		this.generateFragmentsInMemory = generateFragmentsInMemory;
		this.candidateStructure = candidateStructure;
	}
	
	
	
	/**
	 * Instantiates a new pubChem search thread.
	 * 
	 * @param candidate the candidate
	 * @param mzabs the mzabs
	 * @param mzppm the mzppm
	 * @param sumFormulaRedundancyCheck the sum formula redundancy check
	 * @param breakAromaticRings the break aromatic rings
	 * @param treeDepth the tree depth
	 * @param showDiagrams the show diagrams
	 * @param spectrum the spectrum
	 * @param hydrogenTest the hydrogen test
	 * @param database the database
	 * @param pw the pw
	 * @param neutralLossAdd the neutral loss add
	 * @param bondEnergyScoring the bond energy scoring
	 * @param isOnlyBreakSelectedBonds the is only break selected bonds
	 * @param c the c
	 * @param generateFragmentsInMemory the generate fragments in memory
	 */
	public FragmenterThread(String candidate, String database, PubChemWebService pw,
			WrapperSpectrum spectrum, double mzabs, double mzppm, boolean sumFormulaRedundancyCheck,
			boolean breakAromaticRings, int treeDepth, boolean showDiagrams, boolean hydrogenTest,
			boolean neutralLossAdd, boolean bondEnergyScoring, boolean isOnlyBreakSelectedBonds, Config c,
			boolean generateFragmentsInMemory, String jdbc, String username, String password)
	{
		this.candidate = candidate;
		this.pw = pw;
		this.database = database;
		this.mzabs = mzabs;
		this.mzppm = mzppm;
		this.sumFormulaRedundancyCheck = sumFormulaRedundancyCheck;
		this.breakAromaticRings = breakAromaticRings;
		this.spectrum = spectrum;
		this.hydrogenTest = hydrogenTest;
		this.neutralLossAdd = neutralLossAdd;
		this.bondEnergyScoring = bondEnergyScoring;
		this.isOnlyBreakSelectedBonds = isOnlyBreakSelectedBonds;
		this.treeDepth = treeDepth;
		this.generateFragmentsInMemory = generateFragmentsInMemory;
		this.username = username;
		this.password = password;
		this.jdbc = jdbc;
	}
	
	/**
	 * used by database search of command line tool
	 * 
	 * @param database
	 * @param candidate
	 * @param pubchem
	 * @param spec
	 * @param mzabs
	 * @param mzppm
	 * @param molredundancycheck
	 * @param breakAromaticRings
	 * @param treeDepth
	 * @param hydrogenTest
	 * @param neutralLossInEveryLayer
	 * @param bondEnergyScoring
	 * @param breakOnlySelectedBonds
	 * @param chemSpiderToken
	 * @param generateFragmentsInMemory
	 * @param pathToStoreFrags
	 * @param sampleName
	 * @param localdb
	 * @param dblink
	 * @param dbuser
	 * @param dbpass
	 */
	public FragmenterThread(String candidate, String database,
			PubChemWebService pubchem, WrapperSpectrum spec, double mzabs,
			double mzppm, boolean molredundancycheck,
			boolean breakAromaticRings, int treeDepth, boolean hydrogenTest, 
			boolean neutralLossInEveryLayer, boolean bondEnergyScoring, 
			boolean breakOnlySelectedBonds, String chemSpiderToken, boolean generateFragmentsInMemory,
			String pathToStoreFrags, String sampleName, boolean localdb, boolean onlyChnopsCompounds,
			String dblink, String dbuser, String dbpass) {
		this.candidate = candidate;
		this.onlyChnopsCompounds = onlyChnopsCompounds;
		this.pw = pubchem;
		this.database = database;
		this.mzabs = mzabs;
		this.mzppm = mzppm;
		this.sumFormulaRedundancyCheck = molredundancycheck;
		this.breakAromaticRings = breakAromaticRings;
		this.spectrum = spec;
		this.hydrogenTest = hydrogenTest;
		this.neutralLossAdd = neutralLossInEveryLayer;
		this.bondEnergyScoring = bondEnergyScoring;
		this.isOnlyBreakSelectedBonds = breakOnlySelectedBonds;
		this.treeDepth = treeDepth;
		this.generateFragmentsInMemory = generateFragmentsInMemory;
		this.saveFragmentsPath = pathToStoreFrags;
		this.chemSpiderToken = chemSpiderToken;
		this.sampleName = sampleName;
		this.localdb = localdb;
		this.jdbc = dblink;
		this.username = dbuser;
		this.password = dbpass;
		
		
	}

	/**
	 * used for sdf database of command line tool
	 * 
	 * @param candidateStructure
	 * @param candidate
	 * @param database
	 * @param pw
	 * @param spectrum
	 * @param mzabs
	 * @param mzppm
	 * @param sumFormulaRedundancyCheck
	 * @param breakAromaticRings
	 * @param treeDepth
	 * @param showDiagrams
	 * @param hydrogenTest
	 * @param neutralLossAdd
	 * @param bondEnergyScoring
	 * @param isOnlyBreakSelectedBonds
	 * @param c
	 * @param generateFragmentsInMemory
	 * @param filenameprefix
	 * @param ids
	 * @param numCandidates
	 * @param sampleName
	 * @param onlyChnopsCompounds
	 */
	public FragmenterThread(IAtomContainer candidateStructure, String candidate, String database, 
			WrapperSpectrum spectrum, double mzabs, double mzppm, boolean sumFormulaRedundancyCheck,
			boolean breakAromaticRings, int treeDepth, boolean showDiagrams, boolean hydrogenTest,
			boolean neutralLossAdd, boolean bondEnergyScoring, boolean isOnlyBreakSelectedBonds, 
			boolean generateFragmentsInMemory, String sampleName, 
			boolean onlyChnopsCompounds, String pathToStoreFrags)
	{
		percent = 0;
		candidateNumber = 1;
		this.onlyChnopsCompounds = onlyChnopsCompounds;
		this.candidate = candidate;
		this.database = database;
		this.mzabs = mzabs;
		this.mzppm = mzppm;
		this.sumFormulaRedundancyCheck = sumFormulaRedundancyCheck;
		this.breakAromaticRings = breakAromaticRings;
		this.spectrum = spectrum;
		this.hydrogenTest = hydrogenTest;
		this.neutralLossAdd = neutralLossAdd;
		this.bondEnergyScoring = bondEnergyScoring;
		this.isOnlyBreakSelectedBonds = isOnlyBreakSelectedBonds;
		this.treeDepth = treeDepth;
		this.generateFragmentsInMemory = generateFragmentsInMemory;
		this.candidateStructure = candidateStructure;
		this.sampleName = sampleName;
		this.saveFragmentsPath = pathToStoreFrags;
	}
	
	@Override public void run()
	{		
		IAtomContainer molecule = null;
		
		try
		{	    
			if(this.candidateStructure != null) {
				molecule = this.candidateStructure;
			} else if(this.localdb) {
				Query query = MetFrag.getQuery();
				if(query != null) molecule = query.getCompoundUsingIdentifierConnectionOpen(this.candidate, this.database);
			}
			else if(pw == null && c == null) {
				molecule = Candidates.getCompoundLocally(this.database, candidate, jdbc, username, password, false, chemSpiderToken);
			} else if(pw == null) {
				molecule = Candidates.getCompoundLocally(this.database, candidate, c.getJdbc(), c.getUsername(), c.getPassword(), false, chemSpiderToken);
			} else
			{
				if(c != null) {
					molecule = Candidates.getCompound(this.database, this.candidate, this.pw, this.c.getChemspiderToken());
				}
				else if(this.chemSpiderToken.length() != 0) {
					molecule = Candidates.getCompound(this.database, this.candidate, this.pw, this.chemSpiderToken);
				}
				else {
					molecule = Candidates.getCompound(this.database, this.candidate, this.pw, "");
				}
			}
			
			if(molecule == null) {
				incrementCandidateNumber();
				int num = (int)Math.floor(((double)candidateNumber / sizeCandidates) * 10.0);
				if(num > percent) {
					System.out.print(num + " %  ");
					percent = num;
				}
				incrementCandidateNumber();
				return;
			}
			else if(!ConnectivityChecker.isConnected(molecule)) {
				incrementCandidateNumber();
				int num = (int)Math.floor(((double)candidateNumber / sizeCandidates) * 10.0);
				if(num > percent) {
					System.out.print(num + " %  ");
					percent = num;
				}
				return;
			}
			else if(this.onlyChnopsCompounds && !isCHNOPSCompound(molecule)) {
				incrementCandidateNumber();
				int num = (int)Math.floor(((double)candidateNumber / sizeCandidates) * 10.0);
				if(num > percent) {
					System.out.print(num + " %  ");
					percent = num;
				}
				return;
			}
	        
	         
	        try
	        {
		        //add hydrogens
	        	while(true) {
	        		try {
	        			AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(molecule);
	        			//bad workaround for non-reproducible NullPointerException in this function
	        			//seems like a cdk bug?!
	        		} catch(NullPointerException e) {
	        			continue;
	        		}
	        		break;
	        	}
		        
		        CDKHydrogenAdder hAdder = CDKHydrogenAdder.getInstance(molecule.getBuilder());
		        for(int i = 0; i < molecule.getAtomCount(); i++) { 	
		        	hAdder.addImplicitHydrogens(molecule, molecule.getAtom(i));
		        }
		        AtomContainerManipulator.convertImplicitToExplicitHydrogens(molecule);
	        }
	        catch(IllegalArgumentException e)
            {
	        	MetFrag.results.addToCompleteLog("Error: " + candidate + " Message: " + e.getMessage());
            	return;
            }
	        
	        
	        Vector<Peak> peakList = spectrum.getPeakList();
	        
	        Fragmenter fragmenter = new Fragmenter((Vector<Peak>)peakList.clone(), mzabs, mzppm, spectrum.getMode(), breakAromaticRings, sumFormulaRedundancyCheck, neutralLossAdd, isOnlyBreakSelectedBonds);
	      
	        List<IAtomContainer> generatedFrags = null;
	        try
	        {
	        	if(generateFragmentsInMemory)
	        		generatedFrags = fragmenter.generateFragmentsInMemory(molecule, true, treeDepth);
	        	else
	        	{
	        		List<File> fragsFiles = fragmenter.generateFragmentsEfficient(molecule, false, treeDepth, candidate);
	        		generatedFrags = Molfile.ReadfolderTemp(fragsFiles);
	        	}
	        }
	        catch(OutOfMemoryError e)
	        {
	        	System.out.println("OUT OF MEMORY ERROR! " + treeDepth);
	        	MetFrag.results.addToCompleteLog("Error: " + candidate + " Message: " + e.getMessage());
	        	return;
	        }

	        List<IAtomContainer> l = generatedFrags;
	                

	        try
			{					
				//clean up peak list
				CleanUpPeakList cList = new CleanUpPeakList((Vector<Peak>)peakList.clone());
				Vector<Peak> cleanedPeakList = cList.getCleanedPeakList(spectrum.getExactMass());
				
				//now find corresponding fragments to the mass
				AssignFragmentPeak afp = new AssignFragmentPeak();
				afp.setHydrogenTest(hydrogenTest);
				afp.assignFragmentPeak(l, cleanedPeakList, mzabs, mzppm, spectrum.getMode(), false, spectrum.isPositive());
				Vector<PeakMolPair> hits = afp.getHits();
				if(this.saveFragmentsPath != "") saveFragments(hits);
				
				//now "real" scoring --> depends on intensities
				Scoring score = new Scoring(spectrum, candidate);
				double currentScore = 0.0;
				if(this.bondEnergyScoring)
//					currentScore = score.computeScoringWithBondEnergies(hits);
					currentScore = score.computeScoringOptimized(hits, spectrum.getExactMass());
				else
					currentScore = score.computeScoringPeakMolPair(hits);
				
				double currentBondEnergy = score.getBDE();
	
				if(currentBondEnergy > 0)
					currentBondEnergy = currentBondEnergy / afp.getHits().size();
				
				//set the added up energy of every fragment
				MetFrag.results.getMapCandidateToEnergy().put(candidate, currentBondEnergy);
				MetFrag.results.getMapCandidateToHydrogenPenalty().put(candidate, score.getPenalty());
				MetFrag.results.getMapCandidateToPartialChargesDiff().put(candidate, score.getPartialChargesDiff());
				
				//also output the optimization matrix if needed
				MetFrag.results.getCandidateToOptimizationMatrixEntries().put(candidate, score.getOptimizationMatrixEntries());	
				
				//also add the structure to results file
				MetFrag.results.getMapCandidateToStructure().put(candidate, molecule);
				MetFrag.results.getMapCandidateToFragments().put(candidate, afp.getHits());
				
				
				
				Map<Double, Vector<String>> realScoreMap = MetFrag.results.getRealScoreMap();
				//save score in hashmap...if there are several hits with the same score --> vector of strings
				if(realScoreMap.containsKey(currentScore))
		        {
		        	Vector<String> tempList = realScoreMap.get(currentScore);
		        	tempList.add(candidate);
		        	realScoreMap.put(currentScore, tempList);
		        }
		        else
		        {
		        	Vector<String> temp = new Vector<String>();
		        	temp.add(candidate);
		        	realScoreMap.put(currentScore, temp);
		        }
				
				Map<Integer, List<String>> scoreMap = MetFrag.results.getScoreMap();
				if(scoreMap.containsKey(hits.size()))
		        {
		        	List<String> tempList = scoreMap.get(hits.size());
		        	tempList.add(candidate);
		        	scoreMap.put(hits.size(), tempList);
		        }
		        else
		        {
		        	List<String> temp = new ArrayList<String>();
		        	temp.add(candidate);
		        	scoreMap.put(hits.size(), temp);
		        }

			
				//get all the identified peaks
				String peaks = "";
				Double bondEnergy = 0.0;
				for (int i = 0; i < hits.size(); i++) {
					bondEnergy += Fragmenter.getCombinedEnergy((String)hits.get(i).getFragment().getProperty("BondEnergy"));
					peaks += hits.get(i).getPeak().getMass() + "[" + hits.get(i).getFragment().getProperty("BondEnergy") + "]" +  " ";
				}
				

				//write things to log file
				MetFrag.results.addToCompleteLog("\nCandidate: " + candidate + "\t #Peaks: " + spectrum.getPeakList().size() + "\t #Found: " + hits.size());
				MetFrag.results.addToCompleteLog("\tPeaks: " + peaks);
				
				List<IAtomContainer> hitsListTest = new ArrayList<IAtomContainer>();
				for (int i = 0; i < hits.size(); i++) {
					List<IAtomContainer> hitsList = new ArrayList<IAtomContainer>();
					hitsList.add(AtomContainerManipulator.removeHydrogens(hits.get(i).getFragment()));
					hitsListTest.add(hits.get(i).getFragment());
				}
				
				if(verbose) {
					System.out.println((candidateNumber) + " of " + sizeCandidates + " - ID: " + this.candidate);
				}

				int num = (int)Math.floor(((double)candidateNumber / sizeCandidates) * 10.0);
				if(num > percent) {
					System.out.print((num * 10) + " %  ");
					percent = num;
				}
				incrementCandidateNumber();
			}
			catch(CDKException e)
			{
				System.out.println("CDK error!" + e.getMessage());
				MetFrag.results.addToCompleteLog("CDK Error! " + e.getMessage() + " File: " + candidate);
			}
			catch(OutOfMemoryError e)
			{
				System.out.println("Out of memory: " + e.getMessage() + "\n" + e.getStackTrace());
				System.gc();
				MetFrag.results.addToCompleteLog("Out of memory! "+ e.getMessage() + " File: " + candidate);
			}
			catch(Exception e)
			{
				System.out.println("Error: " + e.getMessage());
				e.printStackTrace();
				MetFrag.results.addToCompleteLog("Error! "+ e.getMessage() + " File: " + candidate);
			}
		}
		catch(CDKException e)
		{
			System.out.println("CDK error!" + e.getMessage());
			MetFrag.results.addToCompleteLog("CDK Error! " + e.getMessage() + "File: " + candidate);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found" + e.getMessage());
			MetFrag.results.addToCompleteLog("File not found error! "+ e.getMessage() + "File: " + candidate);
		}
		catch(IOException e)
		{
			System.out.println("IO error: " + e.getMessage());
			MetFrag.results.addToCompleteLog("IO Error! "+ e.getMessage() + "File: " + candidate);
		}
		catch(OutOfMemoryError e)
		{
			System.out.println("Out of memory: " + e.getMessage() + "\n" + e.getStackTrace());
			System.gc();
			MetFrag.results.addToCompleteLog("Out of memory! "+ e.getMessage() + "File: " + candidate);
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			MetFrag.results.addToCompleteLog("Error! "+ e.getMessage() + "File: " + candidate);
		}
	}

	public static void setVerbose(boolean _verbose) {
		verbose = _verbose;
	}

	/**
	 * 
	 * @param hits
	 * @throws CDKException
	 * @throws CloneNotSupportedException 
	 */
	private void saveFragments(List<IAtomContainer> hits) throws CDKException, CloneNotSupportedException {
		File path = new File(this.saveFragmentsPath);
		if(!path.exists()) {
			System.err.println("Error: "+this.saveFragmentsPath+" does not exist.");
			return;
		}
		if(!path.isDirectory()) {
			System.err.println("Error: "+this.saveFragmentsPath+" is not a directory.");
			return;
		}
		if(!path.canRead()) {
			System.err.println("Error: "+this.saveFragmentsPath+" is not readable.");
			return;
		}
		
		AtomContainerSet molSet = new AtomContainerSet();
		for(int i = 0; i < hits.size(); i++) {
			IAtomContainer molecule = hits.get(i);
			AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(molecule);
			IAtomContainer molOrig = AtomContainerManipulator.removeHydrogens(molecule).clone();
			molSet.addAtomContainer(molOrig);
		}
	
		SDFWriter writer1;
		try {
			writer1 = new SDFWriter(new FileWriter(new File(this.saveFragmentsPath+"/"+this.sampleName+"_"+this.candidate+"_fragments.sdf")));
			try {
				writer1.write(molSet);
			} catch (CDKException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @param hits
	 * @throws CDKException
	 * @throws CloneNotSupportedException 
	 */
	private void saveFragments(Vector<PeakMolPair> hits) throws CDKException, CloneNotSupportedException {
		File path = new File(this.saveFragmentsPath);
		Vector<IAtomContainer> fragments = new Vector<IAtomContainer>();
		if(!path.exists()) {
			System.err.println("Error: "+this.saveFragmentsPath+" does not exist.");
			return;
		}
		if(!path.isDirectory()) {
			System.err.println("Error: "+this.saveFragmentsPath+" is not a directory.");
			return;
		}
		if(!path.canRead()) {
			System.err.println("Error: "+this.saveFragmentsPath+" is not readable.");
			return;
		}
		
		AtomContainerSet molSet = new AtomContainerSet();
		for(int i = 0; i < hits.size(); i++) {
			IAtomContainer molecule = hits.get(i).getFragment();
			AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(molecule);
			IAtomContainer molOrig = AtomContainerManipulator.removeHydrogens(molecule).clone();
			molOrig.setProperty("PeakMass", hits.get(i).getPeak().getMass());
			molSet.addAtomContainer(molOrig);
			fragments.add(molOrig);
		}
		
		SDFWriter writer1;
		try {
			writer1 = new SDFWriter(new FileWriter(new File(this.saveFragmentsPath+System.getProperty("file.separator")+this.sampleName+"_"+this.candidate+"_fragments.sdf")));
			try {
				writer1.write(molSet);
			} catch (CDKException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @param mol
	 * @return
	 */
	public static boolean isCHNOPSCompound(IAtomContainer mol) {
		String[] chnops = {"C", "H", "N", "O", "P", "S"};
		Iterable<IAtom> it_atoms = mol.atoms();
    	Iterator<IAtom> atoms = it_atoms.iterator();
    	while(atoms.hasNext()) {
			IAtom atom = atoms.next();
			boolean isInside = false;
			for(String val : chnops) {
				if(val.compareTo(atom.getSymbol()) == 0) {
					isInside = true;
				}
				if(isInside) break;
			}
			if(!isInside) return false;
    	}
    	return true;
	}

	public static synchronized void incrementCandidateNumber() {
		candidateNumber++;
	}
	
	/**
	 * 
	 * @param _candidateNumber
	 */
	public static void setCandidateNumber(int _candidateNumber) {
		candidateNumber = _candidateNumber;
	}
	
	/**
	 * 
	 * @param _candidateSize
	 */
	public static void setSizeCandidates(int _candidateSize) {
		sizeCandidates = _candidateSize;
	}
}

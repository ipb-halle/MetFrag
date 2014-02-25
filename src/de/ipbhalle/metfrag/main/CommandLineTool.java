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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Vector;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.openscience.cdk.MoleculeSet;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IBond;
import org.openscience.cdk.interfaces.IBond.Stereo;
import org.openscience.cdk.io.SDFWriter;
import org.openscience.cdk.smiles.SmilesGenerator;
import org.openscience.cdk.tools.manipulator.AtomContainerManipulator;

import de.ipbhalle.metfrag.spectrum.WrapperSpectrum;
import de.ipbhalle.metfrag.spectrum.PeakMolPair;


/**
 * command line tool for metfrag
 * for local database search functionality contact cruttkie@ipb-halle.de
 * 
 * @author c-ruttkies
 * 
 **/
public class CommandLineTool {
	
	public static String database = "kegg";
	public static MutualDouble mzabs = new MutualDouble(0.01);
	public static MutualDouble mzppm = new MutualDouble(10.0);
	public static MutualDouble searchppm = new MutualDouble(10.0);
	public static MutualDouble exactMass = new MutualDouble(0.0);
	public static boolean onlyBiologicalCompounds = false;
	public static String[] databaseIDs = null;
	public static MutualInteger treeDepth = new MutualInteger(2);
	public static MutualInteger mode = new MutualInteger(3, -2);
	public static String formula = "";
	public static boolean breakRings = false;
	public static boolean storeFragments = false;
	public static String resultspath = System.getProperty("java.io.tmpdir");
	public static String sdfFile = "";
	public static String spectrumfile = "";
	public static MutualInteger numberThreads = new MutualInteger(-1);
	public static String chemSpiderToken = "";
	public static boolean verbose = false;
	public static String sampleName = "";
	public static boolean useProxy = false;
	public static boolean saveParameters = false;
	public static boolean localdb = false;
	public static String settingsfile = "";
	public static MutualInteger charge = new MutualInteger(1);
	public static boolean uniquebyinchi = false;
	public static MutualInteger startindex = new MutualInteger(1);
	public static MutualInteger endindex = new MutualInteger(Integer.MAX_VALUE);
	
	public static boolean databaseIsSet = false;
	public static boolean locationIsSet = false;
	public static boolean mzabsIsSet = false;
	public static boolean mzppmIsSet = false;
	public static boolean searchppmIsSet = false;
	public static boolean exactMassIsSet = false;
	public static boolean onlyBiologicalCompoundsIsSet = false; 
	public static boolean databaseIDsIsSet = false;
	public static boolean treedepthIsSet = false;
	public static boolean modeIsSet = false;
	public static boolean formulaIsSet = false;
	public static boolean breakRingsIsSet = false;
	public static boolean storeFragmentsIsSet = false;
	public static boolean resultPathIsSet = false;
	public static boolean sdfFileIsSet = false;
	public static boolean spectrumfileIsSet = false;
	public static boolean numberThreadsIsSet = false;
	public static boolean chemSpiderTokenIsSet = false;
	public static boolean verboseIsSet = false;
	public static boolean sampleNameIsSet = false;
	public static boolean saveParametersIsSet = false;
	public static boolean localdbIsSet = false;
	public static boolean chargeIsSet = false;
	public static boolean rangeIsSet = false;
	
	public static boolean usesdf = false;

	public static String dblink = "";
	public static String dbuser = "";
	public static String dbpass = "";
	
	public static WrapperSpectrum spec = null;
	public static String peaksString = "";
	
	
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		
		CommandLineParser parser = new PosixParser();
	
		// create the Options
		Options options = new Options();
		
		options.addOption("d", "database", true, "database: "+Databases.getString()+" (default: kegg)");
		options.addOption("l", "localdb", true, "use a local database together with a settings file for candidate search (default: not used) note: only usable if pubchem database is selected (-d)");
		options.addOption("a", "mzabs", true, "allowed absolute (Da) mass deviation of fragment and peak masses (default: 0.01)");
		options.addOption("p", "mzppm", true, "allowed relative (ppm) mass deviation of fragment and peak masses (default: 10)");
		options.addOption("s", "searchppm", true, "relative (ppm) mass deviation used for candidate search in given compound database (-d) (default: 10; not used by default if sdf database is selected (-d))\n");
		options.addOption("n", "exactmass", true, "neutral mass of measured compound used for candidate search in database (-d) (mandatory)");
		options.addOption("b", "biological", false, "only consider compounds including CHNOPS atoms (not used by default)");
		options.addOption("i", "databaseids", true, "database ids of compounds used for in silico fragmentation (separated by ,) (not used by default; not used if sdf database is selected (-d)) note: given ids must be valid ids of given database (-d)");
		options.addOption("t", "treedepth", true, "treedepth used for in silico fragmentation (default: 2) note: high values result in high computation time");
		options.addOption("M", "mode", true, "mode used for measured ms/ms spectrum:\n"+Modes.getString()+"(default: 3)");
		options.addOption("f", "formula", true, "molecular formula of measured compound used for candidate search in database (-d) (not used by default; not used if sdf database is selected (-d))");
		options.addOption("B", "breakrings", false, "allow splitting of aromatic rings of candidate structures during in silico fragmentation (not used by default)");
		options.addOption("F", "storefragments", false, "store in silico generated fragments of candidate molecules (not used by default)");
		options.addOption("R", "resultspath", true, "directory where result files are stored (default: /tmp)");
		options.addOption("L", "sdffile", true, "location of the local sdf file (mandatory if sdf database (-d) is selected)");
		options.addOption("h", "help", false, "print help");
		options.addOption("D", "spectrumfile", true, "file containing peak data (mandatory) note: commandline options overwrite parameters given in the spectrum data file");
		options.addOption("T", "threads", true, "number of threads used for fragment calculation (default: number of available cpu cores)");
		options.addOption("c", "chemspidertoken", true, "Token for ChemSpider database search (not used by default; only necessary (mandatory) if ChemSpider database (-d) is selected)");
		options.addOption("v", "verbose", false, "get more output information during the processing (not used by default)");
		options.addOption("S", "samplename", true, "name of the sample measured (mandatory) note: result files are stored with given value");
		options.addOption("P", "saveparameters", false, "save used parameters (not used by default)");
		options.addOption("e", "printexamplespecfile", false, "print an example spectrum data file (not used by default)");
		options.addOption("C", "charge", true, "charge used in combination with mode (-M):\n"+Charges.getString()+" (default: 1)");
		options.addOption("r", "range", true, "range of candidates that will be processed: N (first N), M-N (from M to N), M- (from M), -N (till N); if N is greater than the number of candidates it will be set accordingly");
		
		// parse the command line arguments
		CommandLine line = null;
		try {
			line = parser.parse( options, args );
		} catch (ParseException e1) {
			System.out.println(e1.getMessage());
			System.out.println("Error: Could not parse option parameters.");
			System.out.println("Use help -h (--help) for information.");
			System.exit(1);
		}
		
		if(line == null) {
			System.out.println("Error: Could not parse option parameters.");
			System.out.println("Use help -h (--help) for information.");
			System.exit(1);
		}
		if(checkInitialParamsPresent(line, options)) System.exit(0);

		if(!checkSpectrumFile(line)) {
			System.out.println("Error: Option parameters are not set correctly.");
			System.out.println("Use help -h (--help) for information.");
			System.exit(1);
		}
		if(!parseSpectrumFile(spectrumfile)) {
			System.out.println("Error: Could not correctly parse the spectrum data file.");
			System.out.println("Use help -h (--help) for information.");
			System.exit(1);
		}
		
		int successfulSet = setParameters(line, options);
		if(successfulSet == 2) System.exit(0);
		if(successfulSet != 0) {
			System.out.println("Error: Option parameters are not set correctly.");
			System.out.println("Use help -h (--help) for information.");
			System.exit(1);
		}
		
		boolean successfulChecked = true;
		if(successfulSet == 0) successfulChecked = checkParameters();
		if(saveParametersIsSet) {
			try {
				BufferedWriter bwriter = new BufferedWriter(new FileWriter(new File(resultspath+System.getProperty("file.separator")+"parameters_"+sampleName+".txt")));
				bwriter.write(getParameters());
				bwriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			boolean isPositive = true;
			if(charge.getValue() == 2) isPositive = false;
			spec = new WrapperSpectrum(peaksString, mode.getValue(), exactMass.getValue(), isPositive);
		}
		catch(Exception e) {
			System.out.println("Error: Could not parse spectrum correctly. Check the given peak list.");
			System.exit(1);
		}
		
		if(!successfulChecked) {
			System.out.println("Error: Option parameters are not set correctly.");
			System.out.println("Use help -h (--help) for information.");
			System.exit(1);
		}
		
		List<MetFragResult> results = null;
		String pathToStoreFrags = "";
		if(storeFragments) pathToStoreFrags = resultspath;
		//run metfrag when all checks were successful
		
		if(usesdf) {
			try {
				if(verbose) {
					System.out.println("start fragmenter with local database");
					System.out.println("using database "+database);
				}
				results = MetFrag.startConvenienceSDF(spec, mzabs.getValue(), mzppm.getValue(), searchppm.getValue(), 
							true, breakRings, treeDepth.getValue(), true, true, true, false, 
							Integer.MAX_VALUE, true, sdfFile, "", null, searchppmIsSet, pathToStoreFrags,
							numberThreads.getValue(), verbose, sampleName, onlyBiologicalCompounds);
			} catch(Exception e) {
				System.out.println("Error: "+e.getMessage());
				System.out.println("Error: Could not perform in silico fragmentation step.");
				System.exit(1);
			}
		}
		else {
			try {
				if(verbose) {
					if(!localdbIsSet) System.out.println("start fragmenter with web database");
					else System.out.println("start fragmenter with local database");
					System.out.println("using database "+database);
				}
				results = MetFrag.startConvenience(database, databaseIDs, formula, exactMass.getValue(), spec, 
						useProxy, mzabs.getValue(), mzppm.getValue(), searchppm.getValue(), true, 
						breakRings, treeDepth.getValue(), true, false, true, false, startindex.getValue(), 
						endindex.getValue(), true, pathToStoreFrags, numberThreads.getValue(), chemSpiderToken, 
						verbose, sampleName, localdb, onlyBiologicalCompounds, dblink, dbuser, dbpass, uniquebyinchi);
			} catch(Exception e) {
				System.out.println("Error: "+e.getMessage());
				System.out.println("Error: Could not perform in silico fragmentation step.");
				System.exit(1);
			}
		}
		
		saveResults(results);
				
	}

	/**
	 * setting all parameter given via command line
	 * 
	 * @param line
	 * @return
	 */
	public static int setParameters(CommandLine line, Options options) {
		Option[] opts = line.getOptions();
		int correct = 0;
		for(int j = 0; j < opts.length; j++) {
			if(correct != 0) return correct;
			if(opts[j].getOpt().length() != 1) {
				System.out.println("Warning: Unknown option "+opts[j].getOpt());
			}
			switch(opts[j].getOpt().charAt(0)) {
				case 'r':
					String startToSet = "1";
					String endToSet = String.valueOf(Integer.MAX_VALUE);
					String[] split = opts[j].getValue().trim().split("-");
					if(split.length == 1) {
						if(opts[j].getValue().trim().contains("-")) startToSet = split[0];
						else endToSet = split[0];
					}
					if(split.length == 2) {
						if(split[0].length() == 0 && split[1].length() == 0) {
							correct = 2;
							System.out.println("Error: Wrong value for range (-r) given!");
						}
						if(split[0].length() == 0) endToSet = split[1];
						else {
							startToSet = split[0];
							endToSet = split[1];
						}
					}
					correct = setIntegerValue(startToSet, true, "startindex", startindex);
					correct = setIntegerValue(endToSet, true, "endindex", endindex);
					rangeIsSet = true;
					break;
				case 'C':
					correct = setIntegerValue(opts[j].getValue().trim(), true, "charge", charge);
					chargeIsSet = true;
					break;
				case 'l': //setting molredundancycheck
					localdb = true;
					localdbIsSet = true;
					settingsfile = opts[j].getValue().trim();
					break;
				case 'd': //setting database
					database = opts[j].getValue().trim();
					databaseIsSet = true;
					break;
				case 'a': //setting mzabs
					correct = setDoubleValue(opts[j].getValue().trim(), true, "mzabs", mzabs);
					mzabsIsSet = true;
					break;
				case 'p': //setting mzppm
					correct = setDoubleValue(opts[j].getValue().trim(), true, "mzppm", mzppm);
					mzppmIsSet = true;
					break;
				case 's': //setting searchppm
					correct = setDoubleValue(opts[j].getValue().trim(), true, "searchppm", searchppm);
					searchppmIsSet = true;
					break;
				case 'n': //setting exactmass
					correct = setDoubleValue(opts[j].getValue().trim(), true, "exactmass", exactMass);
					exactMassIsSet = true;
					break;
				case 'b': //setting onlyBiologicalCompound
					onlyBiologicalCompounds = true;
					onlyBiologicalCompoundsIsSet = true;
					break;
				case 'i': //setting databaseids
					databaseIDs = opts[j].getValue().trim().split(",");
					databaseIDsIsSet = true;
					break;
				case 'S': //setting databaseids
					sampleName = opts[j].getValue().trim();
					sampleNameIsSet = true;
					break;
				case 't': //setting treedepth
					correct = setIntegerValue(opts[j].getValue().trim(), true, "treedepth", treeDepth);
					treedepthIsSet = true;
					break;
				case 'M': //setting mode
					correct = setIntegerValue(opts[j].getValue().trim(), false, "mode", mode);
					modeIsSet = true;
					break;
				case 'f': //setting formula
					formula = opts[j].getValue().trim();
					formulaIsSet = true;
					break;
				case 'P': //setting formula
					saveParameters = true;
					saveParametersIsSet = true;
					break;
				case 'v': //setting molredundancycheck
					verbose = true;
					verboseIsSet = true;
					break;
				case 'B': //setting breakrings
					breakRings = true;
					breakRingsIsSet = true;
					break;
				case 'F': //setting storefragments
					storeFragments = true;
					storeFragmentsIsSet = true;
					break;
				case 'R': //setting resultspath
					resultspath = opts[j].getValue().trim();
					resultPathIsSet = true;
					break;
				case 'L':
					sdfFile = opts[j].getValue().trim();
					usesdf = true;
					sdfFileIsSet = true;
					break;
				case 'T':
					setIntegerValue(opts[j].getValue().trim(), true, "numberThreads", numberThreads);
					numberThreadsIsSet = true;
					break;
				case 'c':
					chemSpiderToken = opts[j].getValue().trim();
					chemSpiderTokenIsSet = true;
					break;
				case 'h':
				
					return 2;
				case 'e':
				
					return 2;
				case 'D':
					
					break;
				default: 
					System.out.println("Warning: Unknown option "+opts[j].getOpt());
				break;
			}
		}
		
		return correct;
	}
	
	/**
	 * 
	 * first checking if parameters -h or -e are set so that no metfrag must be run
	 * 
	 * @param line
	 * @param options
	 * @return
	 */
	public static boolean checkInitialParamsPresent(CommandLine line, Options options) {
		if(line.hasOption('h')) {
		    HelpFormatter formatter = new HelpFormatter();
			PrintWriter pw = new PrintWriter(System.out);
			 
			String syntax = "java -jar metfrag.jar [options] [args]";
			 
			String header = "\nAvailable options:\n";
			 
			String footer = "\nexample: java -jar metfrag.jar -d pubchem -D example_spectrum_file.mb -S example -R /tmp/results -n 271.2 -a 0.01 -p 10 -v -r -B\n" +
					"\n\r" +
					"\nThe SDF result files include scores and number of declared peaks of the candidate molecules.\n" +
			        "For further information visit official website on http://c-ruttkies.github.io/MetFrag\n" +
			        "Bug Reports to <cruttkie@ipb-halle.de>";                      
			 
			 
			formatter.printHelp(pw, 80, syntax, header, options, 3, 5, footer, false);
			pw.close();
			return true;
		}
		if(line.hasOption('e'))	{
			printValidSpectrumFile();
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * check all set and necessary parameters
	 * 
	 * @return
	 */
	public static boolean checkParameters() {
		boolean correct = true;
		//is valid database
		if(!Databases.contains(database)) {
			System.out.println("Error: "+database+" is not a valid database value.");
			correct = false;
		}
		//check for localdb and settings file
		if(localdbIsSet && correct) {
			if(database.compareTo("pubchem") != 0) {
				System.out.println("Error: Local database can only used together with pubchem.");
				correct = false;
			}
			if(correct) correct = checkSettingsFile(settingsfile);
			if(correct && formulaIsSet) {
				System.out.println("Warning: Local database is used. The value of formula is ignored.");
			}
		}
		//check number threads
		if(numberThreadsIsSet) {
			if(numberThreads.getValue() == 0) {
				System.out.println("Error: Number threads is 0. Set a minimum value of 1.");
				correct = false;
			}
		}
		if(rangeIsSet) {
			if(startindex.getValue() < 1) {
				System.out.println("Error: Start index is smaller than 1.");
				correct = false;
			}
			if(startindex.getValue() > endindex.getValue()) {
				System.out.println("Error: Start index ("+startindex.getValue()+") is greater than end index ("+endindex.getValue()+").");
				correct = false;
			}
		}
		//check chemspidertoken
		if(database.compareTo("chemspider") == 0) {
			if(!chemSpiderTokenIsSet) {
				System.out.println("Error: No chemspider token specified. When using ChemSpider database a valid token is needed (-c).");
				correct = false;
			}
		}
		else if(correct && chemSpiderTokenIsSet) { 
			System.out.println("Warning: Using database "+database+". ChemSpider token is ignored.");
		}
		//if sdf file is selected
		//check for existing and readable file
		//check for database location -> produce warning
		if(database.compareTo("sdf") == 0) {
			if(sdfFileIsSet) {
				File file = new File(sdfFile);
				if(!file.exists()) {
					System.out.println("Error: Can not read sdf file "+sdfFile+". Not found.");
					correct = false;
				}
				else if(!file.canRead()) {
					System.out.println("Error: Can not read sdf file "+sdfFile+". No permissions.");
					correct = false;
				}
			}
			else {
				System.out.println("Error: No sdf file location specified. Use -L (--sdffile) option.");
				correct = false;
			}
		}
		//check for treedepth
		if(treedepthIsSet) {
			if(treeDepth.getValue() > 4) {
				System.out.println("Warning: High tree depth values can cause long running times.");
			}
		}
		//check for mode
		if(modeIsSet) {
			if(!Modes.contains(mode)) {
				System.out.println("Error: "+mode+" is not a correct value for mode.");
				correct = false;
			}
		}
		//check for charge
		if(chargeIsSet) {
			if(!Charges.contains(charge)) {
				System.out.println("Error: "+charge+" is not a correct value for charge.");
				correct = false;
			}
		}
		//check for sample name (mandatory)
		if(!sampleNameIsSet || sampleName.length() == 0) {
			System.out.println("Error: No valid sample name given. Use -S (--samplename) option.");
			correct = false;
		}
		//check for database ids
		if(databaseIDsIsSet) {
			if(databaseIDs == null) {
				System.out.println("Error: Database ids could not set correctly.");
				correct = false;
			}
			else {
				for(int i = 0; i < databaseIDs.length; i++) {
					if(databaseIDs[i] == null || databaseIDs[i].length() == 0) {
						System.out.println("Error: Database ids could not set correctly.");
						correct = false;
					}
				}
			}
		}
		if(formulaIsSet && usesdf) {
			System.out.println("Warning: Using sdf file as candidate database. Formula is ignored.");
		}
		else if(formulaIsSet && searchppmIsSet) {
			System.out.println("Warning: A relative mass deviation (searchppm) together with a formula is specified. Formula is used for database search. The searchppm value is ignored.");
		}
		if(verbose && usesdf && searchppmIsSet) {
			System.out.println("sdf file "+sdfFile+" is filtered by exactmass "+exactMass+" and a relative mass deviation of "+searchppm);	
		}
		else if(verbose && usesdf && !searchppmIsSet) {
			System.out.println("candidates of sdf file "+sdfFile+" are not filtered -> searchppm not set");
		}
		//check for result path
		if(resultPathIsSet) checkForDir(resultspath, false, true);
		
		if(!exactMassIsSet) {
			System.out.println("Error: No value for exactmass is set. Use -n (--exactmass) option.");
			correct = false;
		}
		
		return correct;
	}
	
	/**
	 * 
	 * set a MutualDouble parameter
	 * 
	 * @param value
	 * @param isPositive
	 * @param valueName
	 * @param valueToSet
	 * @return
	 */
	public static int setDoubleValue(String value, boolean isPositive, String valueName, MutualDouble valueToSet) {
		try {
			valueToSet.setValue(Double.parseDouble(value));
		} catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Error: "+value+" is not a correct value for "+valueName+".");
			return 1;
		}
		if(isPositive && Double.parseDouble(value) < 0) {
			System.out.println("Error: The value of "+valueName+" is smaller than 0.");
			return 1;
		}
		return 0;
	}
	
	/**
	 * 
	 * @param value
	 * @param isPositive
	 * @param valueName
	 * @param valueToSet
	 * @return
	 */
	public static int setIntegerValue(String value, boolean isPositive, String valueName, MutualInteger valueToSet) {
		try {
			valueToSet.setValue(Integer.parseInt(value));
		} catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Error: "+value+" is not a correct value for "+valueName+".");
			return 1;
		}
		if(isPositive && Integer.parseInt(value) < 0) {
			System.out.println("Error: The value of "+valueName+" is smaller than 0.");
			return 1;
		}
		return 0;
	}
	
	/**
	 * 
	 * check file for existence etc.
	 * 
	 * @param filename
	 * @param shouldBeWriteable
	 * @return
	 */
	public static boolean checkForFile(String filename, boolean shouldBeReadable, boolean shouldBeWriteable) {
		File file = new File(filename);
		if(!file.exists()) {
			System.out.println("Error: Can not access file "+filename+". Not found.");
			return false;
		}
		else if(!file.isFile()) {
			System.out.println("Error: Can not access file "+filename+". No file.");
			return false;
		}
		else if(shouldBeReadable && !file.canRead()) {
			System.out.println("Error: Can not read file "+filename+". No permissions.");
			return false;
		}
		if(shouldBeWriteable && !file.canWrite()) {
			System.out.println("Error: Can not write into file "+filename+". No permissions.");
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * check directory for existence etc.
	 * 
	 * @param filename
	 * @param shouldBeReadable
	 * @param shouldBeWriteable
	 * @return
	 */
	public static boolean checkForDir(String filename, boolean shouldBeReadable, boolean shouldBeWriteable) {
		File file = new File(filename);
		if(!file.exists()) {
			System.out.println("Error: Can not access directory "+filename+". Not found.");
			return false;
		}
		else if(!file.isDirectory()) {
			System.out.println("Error: Can not access directory "+filename+". No Directory.");
			return false;
		}
		else if(shouldBeReadable && !file.canRead()) {
			System.out.println("Error: Can not read directory "+filename+". No permissions.");
			return false;
		}
		if(shouldBeWriteable && !file.canWrite()) {
			System.out.println("Error: Can not write into directory "+filename+". No permissions.");
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * parse the given spectrum file
	 * following parameters can bes set:
	 * # Mode: -> Mode
	 * # Charge -> Charge
	 * # Sample -> Sample name
	 * # Search PPM: -> Śearch ppm
	 * # Parent Mass: -> Parent mass
	 * # ID: -> Database IDs
	 * 
	 * @param specFile
	 * @return
	 */
	public static boolean parseSpectrumFile(String specFile) {
		File file = new File(specFile);
		boolean correct = checkForFile(specFile, true, false);
		if(!correct) return false;
		BufferedReader breader;
		try {
			breader = new BufferedReader(new FileReader(file));
			String line = "";
			while((line = breader.readLine()) != null) {
				if(line.charAt(0) == '#' && line.contains("Sample:")) {
					sampleName = line.split("Sample:")[1].trim();
					sampleNameIsSet = true;
				}
				else if(line.charAt(0) == '#' && line.contains("ID:")) {
					databaseIDs = line.split("ID:")[1].trim().split(",");
					databaseIDsIsSet = true;
				}
				else if(line.charAt(0) == '#' && line.contains("Parent Mass:")) {
					if(setDoubleValue(line.split("Parent Mass:")[1].trim(), true, "exactmass", exactMass) != 0) correct = false;
					exactMassIsSet = true; 
				}
				else if(line.charAt(0) == '#' && line.contains("Search PPM:")) {
					if(setDoubleValue(line.split("Search PPM:")[1].trim(), true, "searchppm", searchppm) != 0) correct = false;
					searchppmIsSet = true;
				}
				else if(line.charAt(0) == '#' && line.contains("Charge:")) {
					if(setIntegerValue(line.split("Charge:")[1].trim(), true, "charge", charge) != 0) correct = false;
					chargeIsSet = true;
				}
				else if(line.charAt(0) == '#' && line.contains("Mode:")) {
					mode.setOffset(-2);
					if(setIntegerValue(line.split("Mode:")[1].trim(), true, "mode", mode) != 0) correct = false;
					modeIsSet = true;
				}
				else if(line.charAt(0) == '#' && line.split("#")[1].trim().length() != 0) {
					System.out.println("Warning: Option "+line.split("#")[1].trim()+" in spectrum data file not known.");
				}
				else if(line.charAt(0) != '#' && line.length() != 0) peaksString += line + "\n";
			}
			breader.close();
		} catch (IOException e) {
			return false;
		}
/*		if(!exactMassIsSet) {
			System.out.println("Error: No value for exact mass is specified. Use -n (--exactmass) option or the specification in the spectrum data file.");
			correct = false;
		}*/
		return correct;
	}
	
	/**
	 * TODO adding inchi and inchi key generation
	 * 
	 * save the results of the metfrag run
	 * 
	 * @param results
	 * @throws CDKException 
	 */
	public static void saveResults(List<MetFragResult> results) {
		if(results == null || results.size() == 0) {
			System.out.println("Error: No results.");
			return;
		}
		MoleculeSet setOfMolecules = new MoleculeSet();
		SmilesGenerator sg = new SmilesGenerator();
		//uncomment if inchi generation is avaiable on your system - jni-inchi
		/*org.openscience.cdk.inchi.InChIGeneratorFactory factory = null;
		try {
			factory = org.openscience.cdk.inchi.InChIGeneratorFactory.getInstance();
		} catch (CDKException e3) {
			e3.printStackTrace();
		}*/
		for(MetFragResult result : results) {
			IAtomContainer tmp = result.getStructure();
			tmp = AtomContainerManipulator.removeHydrogens(tmp);
			String smiles = sg.createSMILES(tmp);
			tmp.setProperty("DatabaseID", result.getCandidateID());
			tmp.setProperty("NoPeaksExplained", result.getPeaksExplained());
			tmp.setProperty("SMILES", smiles);
			//uncomment if inchi generation is avaiable on your system - jni-inchi
		/*	IAtomContainer tmp_clone = null;
			try {
				tmp_clone = (IAtomContainer)tmp.clone();
			} catch (CloneNotSupportedException e2) {
				e2.printStackTrace();
			}
			if(factory != null && tmp_clone != null) {	
				try {
					AtomContainerManipulator.percieveAtomTypesAndConfigureAtoms(tmp_clone);
				} catch (CDKException e1) {
					
				}
				org.openscience.cdk.tools.CDKHydrogenAdder hAdder = org.openscience.cdk.tools.CDKHydrogenAdder.getInstance(tmp_clone.getBuilder());
		        for(int i = 0; i < tmp_clone.getAtomCount(); i++) {
		        	try {
		        		hAdder.addImplicitHydrogens(tmp_clone, tmp_clone.getAtom(i));
		        	} catch(Exception e) {
		        		continue;
		        	}
		        }
		        AtomContainerManipulator.convertImplicitToExplicitHydrogens(tmp_clone);
		        try {
		        	org.openscience.cdk.inchi.InChIGenerator gen = factory.getInChIGenerator(tmp_clone);
					if(gen != null) {
						String inchi = gen.getInchi();
						tmp.setProperty("InChI", inchi);
					}
				} catch (CDKException e) {
					
				}
			}*/

			tmp.setProperty("PeakScore", result.getRawPeakMatchScore());
			tmp.setProperty("BondEnergyScore", result.getRawBondEnergyScore());
			tmp.setProperty("Score", result.getScore());
	        for (IBond bond : tmp.bonds()) {
				if(bond.getStereo() == null)
					bond.setStereo(Stereo.UP_OR_DOWN);		
			}
			String matchedPeaksString = "";
			Vector<PeakMolPair> pairs = result.getFragments();
			for (int k = 0; k < pairs.size(); k++) {
				PeakMolPair fragment = pairs.get(k);
				if(k == result.getFragments().size())
					matchedPeaksString += fragment.getPeak().getMass() + " " + fragment.getPeak().getRelIntensity();
				else
					matchedPeaksString += fragment.getPeak().getMass() + " " + fragment.getPeak().getRelIntensity() + " ";
			}
			if(!matchedPeaksString.equals(""))
				tmp.setProperty("PeaksExplained", matchedPeaksString);

			setOfMolecules.addAtomContainer(tmp);
		}
		try {
			SDFWriter writer = new SDFWriter(new FileWriter(new File(resultspath + System.getProperty("file.separator") + "results_" + sampleName + ".sdf")));
			try {
				writer.write(setOfMolecules);
			} catch (CDKException e) {
				System.out.println("Error: Could not write results file.");
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Error: Could not write results file.");
		}
		if(verbose) System.out.println("wrote " + setOfMolecules.getAtomContainerCount() + " molecules to "+resultspath);
	}
	
	/**
	 * 
	 * check if spectrum file is present 
	 * 
	 * @param line
	 * @return
	 */
	public static boolean checkSpectrumFile(CommandLine line) {
		if(line.hasOption('D')) {
			String filename = line.getOptionValue('D');
			if(checkForFile(filename, true, false)) {
				spectrumfile = filename;
				spectrumfileIsSet = true;
				return true;
			}
		}
		else System.out.println("Error: No spectrum data file is specified. Use -D (--spectrumfile) option and select a valid file.");
		
		return false;
	}
	
	/**
	 * print an example spectrum file
	 * 
	 */
	public static void printValidSpectrumFile() {
		System.out.println("# Sample: Naringenin");
		System.out.println("# ID: C06561,C00509,C16232");
		System.out.println("# Parent Mass: 272.06847");
		System.out.println("# Search PPM: 10");
		System.out.println("# Mode: 3");
		System.out.println("# Charge: 1");
		System.out.println("119.051 467.616");
		System.out.println("123.044 370.662");
		System.out.println("147.044 6078.145");
		System.out.println("153.019 10000.0");
		System.out.println("179.036 141.192");
		System.out.println("189.058 176.358");
		System.out.println("273.076 10000.000");
		System.out.println("274.083 318.003");
	}
	
	/**
	 * 
	 * function to get parameters used for metfrag run
	 *  
	 * 
	 * @return
	 */
	public static String getParameters() {
		String params = "database:\t" + database + "\n";
		params += searchppmIsSet ? "searchppm:\t "+ searchppm +" \n" : "searchppm:\tnot used\n";
		params += "exactmass:\t" + exactMass + "\n";
		params += "mzppm:\t" + mzppm + "\n";
		params += "mzabs:\t" + mzabs + "\n";
		params += "formula:\t";
		if(formulaIsSet && formula.length() != 0) params += formula + "\n";
		else params += "not used\n";
		params += "chemspidertoken:\t";
		if(chemSpiderTokenIsSet && chemSpiderToken.length() != 0) params += chemSpiderToken + "\n";
		else params += "not used\n";
		params += numberThreadsIsSet ? "numberthreads:\t" + numberThreads + "\n" : "numberthreads:\t all available cpu cores\n";
		params += "samplename:\t" + sampleName + "\n";
		params += "resultspath:\t" + resultspath + "\n";
		params += "mode:\t" + mode + "\n";
		params += "charge:\t" + charge + "\n";
		params += "treeDepth:\t" + treeDepth + "\n";
		params += "databaseids:\t";
		if(databaseIDs == null || databaseIDs.length == 0) {
			params += "not used\n";
		}
		else {
			for(int i = 0; i < databaseIDs.length; i++)
				params += databaseIDs[i]+" ";
			params += "\n";
		}
		params += "spectrumfile:\t" + spectrumfile + "\n";
		params += (sdfFileIsSet && sdfFile.length() != 0) ? "sdffile:\t" + sdfFile + "\n" : "sdffile:\tnot used\n";
		params += onlyBiologicalCompounds ? "onlybiologicalcompounds:\tyes\n" : "onlybiologicalcompounds:\tno\n";
		params += breakRings ? "breakrings:\tyes\n" : "breakrings:\tno\n";
		params += storeFragments ? "storefragments:\tyes\n" : "storefragments:\tno\n";
		params += verbose ? "verbose:\tyes\n" : "verbose:\tno\n";
		//params += "version: "+getMetFragVersionNumber()+"\n";
		return params;
	}
	
	/**
	 * 
	 * wrapper class for double value
	 * 
	 * @author c-ruttkies
	 *
	 */
	public static class MutualDouble {
		
		private double value;
		private double offset = 0.0;
		
		public MutualDouble(double value) {
			this.value = value;
		}

		public MutualDouble(double value, double offset) {
			this.value = value;
			this.offset = offset;
		}
		
		public void setValue(double value) {
			this.value = value;
		}

		public void setOffset(double value) {
			this.offset = value;
		}
		
		public double getValue() {
			return this.value + this.offset;
		}

		public double getOffset() {
			return this.offset;
		}

		public int compareTo(double value) {
			if(this.value == value) return 0;
			else if(this.value > value) return 1;
			else return -1;
		}
		
		public String toString() {
			return this.value+"";
		}
	}

	/**
	 * 
	 * wrapper class for integer value
	 * 
	 * @author c-ruttkies
	 *
	 */
	public static class MutualInteger {

		private int value;
		private int offset = 0;
		
		public MutualInteger(int value) {
			this.value = value;
		}
		
		public MutualInteger(int value, int offset) {
			this.value = value;
			this.offset = offset;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
		
		public void setOffset(int value) {
			this.offset = value;
		}
		
		public int getValue() {
			return this.value + this.offset;
		}
		
		public int getOffset() {
			return this.offset;
		}
		
		public int compareTo(int value) {
			if(this.value == value) return 0;
			else if(this.value > value) return 1;
			else return -1;
		}
		
		public String toString() {
			return this.value + "";
		}
	}
	
	/**
	 * 
	 * @author c-ruttkies
	 *
	 */
	public static class Databases {
		
		private static String[] validDatabases = {"kegg", "pubchem", "sdf", "chemspider"};
		
		public static boolean contains(String value) {
			for(int i = 0; i < validDatabases.length; i++) {
				if(value.compareTo(validDatabases[i]) == 0) { 
					return true;
				}
			}
			return false;
		}
		
		public static String getString() {
			String string = "";
			for(int i = 0; i < validDatabases.length; i++) {
				string += validDatabases[i];
				if(i < validDatabases.length - 1) string += ", ";
			}
			return string;
		}
	}

	/**
	 * 
	 * @author c-ruttkies
	 *
	 */
	public static class Modes {
		
		private static int[] validModes = {1, 0 ,-1};
		private static int[] validModesHelp = {3, 2 ,1};
		private static String[] modeValues = {"[M + H]","[M]","[M - H]"};
		
		public static boolean contains(MutualInteger value) {
			for(int i = 0; i < validModes.length; i++) {
				if(validModes[i] == value.getValue() + value.getOffset()) return true;
			}
			return false;
		}
		
		public static String getString() {
			String string = "";
			for(int i = 0; i < validModes.length; i++) {
				string += validModesHelp[i]+"\t -> \t"+modeValues[i]+"\n";
			}
			return string;
		}
	}

	/**
	 * 
	 * @author cruttkie
	 *
	 */
	public static class Charges {
		
		private static int[] validCharges = {1, 2};
		private static String[] modeValues = {"positive", "negative"};
		
		public static boolean contains(MutualInteger value) {
			for(int i = 0; i < validCharges.length; i++) {
				if(validCharges[i] == value.getValue() + value.getOffset()) return true;
			}
			return false;
		}
		
		public static String getString() {
			String string = "";
			for(int i = 0; i < validCharges.length; i++) {
				string += validCharges[i] + "\t -> \t"+modeValues[i]+"\n";
			}
			return string;
		}
	}

	/**
	 * 
	 * @author c-ruttkies
	 *
	 */
	public static boolean checkSettingsFile(String settingsfile) {
		
		boolean userSet = false;
		boolean passSet = false;
		boolean linkSet = false;
		if(checkForFile(settingsfile, true, false)) {
			try {
				BufferedReader breader = new BufferedReader(new FileReader(new File(settingsfile)));
				String line = "";
				while((line = breader.readLine()) != null) {
					String[] tmp = line.split("=");
					if(line.startsWith("dbPostgres")) {
						if(tmp.length == 2) {
							dblink = tmp[1].trim();
							linkSet = true;
						}
					}
					if(line.startsWith("userPostgres")) {
						dbuser = tmp.length == 2 ? tmp[1].trim() : "";
						userSet = true;
					}
					if(line.startsWith("passwordPostgres")) {
						dbpass = tmp.length == 2 ? tmp[1].trim() : "";
						passSet = true;
					}
				}
				breader.close();
			} catch (IOException e) {
				System.out.println("Error: Could not read settings file.");
			}	
		}
		else return false;
		
		if(!userSet) System.out.println("Error: Database username could be not set. Check for correct settings file.");
		if(!passSet) System.out.println("Error: Database password could be not set. Check for correct settings file.");
		if(!linkSet) System.out.println("Error: Database location could be not set. Check for correct settings file.");
		if(!userSet || !passSet || !linkSet) return false;
		
		
		return true;
	}

	/**
	 * 
	 * @author c-ruttkies
	 *
	 */
	public static String getMetFragVersionNumber() {
		String version = "";
		InputStream stream = CommandLineTool.class.getClassLoader().getResourceAsStream("version");
		try {
			BufferedReader breader = new BufferedReader(new InputStreamReader(stream));
			version = breader.readLine();
			breader.close();
		}
		catch (Exception e) {
			return version;
		}
		return version;
	}


}

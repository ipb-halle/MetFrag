---
layout: main
title: project
nav:
  about: active
---

### MetFrag2.2 CL

The new MetFrag commandline tool is availabler.

<a class="btn btn-primary" href="http://msbi.ipb-halle.de/~cruttkie/metfrag/MetFrag2.2-CL.jar" role="button">Download MetFrag2.2 CL</a>

<hr>

<h3>Usage</h3>
After downloading the executable jar MetFrag can generally be run by
<div class="code">
  # java -jar MetFrag2.2-CL.jar [parameter file]
</div>
<p><p>
<h4>Parameter file</h4>
MetFrag2.2 CL needs a <span style="font-weight:bold">parameter file</span> of specific layout as input. The parameter file contains all necessary information for the processing of a given MS/MS peak list. An example parameter file can be downloaded <a class="btn btn-primary" href="http://msbi.ipb-halle.de/~cruttkie/metfrag/example_parameter_file.txt">here</a> and corresponding example <a class="btn btn-primary" href="http://msbi.ipb-halle.de/~cruttkie/metfrag/example_data.txt">data</a> file containg the mz peak list is also needed.
<p>
To view the contents of the example file it can be opened with a text editor. Lines starting with # are comments and not used by MetFrag.
<div class="code">
  <table>
	<tr><td>#</td><td>
	<tr><td># data file containing mz intensity peak pairs (one per line)</td><td>
	<tr><td>#</td><td>
	<tr><td>PeakListPath = example_data.txt</td><td>
	<tr><td></td><td>
	<tr><td>#</td><td>
	<tr><td># database parameters -> how to retrieve candidates</td><td>
	<tr><td>#</td><td>
	<tr><td>#</td><td>
	<tr><td>MetFragDatabaseType = PubChem</td><td>
	<tr><td>NeutralPrecursorMolecularFormula = C9H11Cl3NO3PS</td><td>
	<tr><td>NeutralPrecursorMass = 348.926284</td><td>
	<tr><td></td><td>
	<tr><td>#</td><td>
	<tr><td># peak matching parameters</td><td>
	<tr><td>#</td><td>
	<tr><td>FragmentPeakMatchAbsoluteMassDeviation = 0.001</td><td>
	<tr><td>FragmentPeakMatchRelativeMassDeviation = 5</td><td>
	<tr><td>PrecursorIonMode = 1</td><td>
	<tr><td>IsPositiveIonMode = True</td><td>
	<tr><td></td><td>
	<tr><td>#</td><td>
	<tr><td># scoring parameters</td><td>
	<tr><td>#</td><td>
	<tr><td>MetFragScoreTypes = FragmenterScore</td><td>
	<tr><td>MetFragScoreWeights = 1.0</td><td>
	<tr><td></td><td>
	<tr><td>#</td><td>
	<tr><td># output</td><td>
	<tr><td># SDF, XLS, CSV, ExtendedXLS, ExtendedFragmentsXLS</td><td>
	<tr><td>#	MetFragCandidateWriter = XLS</td><td>
	<tr><td>SampleName = example_1</td><td>
	<tr><td>ResultsPath = .</td><td>
	<tr><td></td><td>
	<tr><td>#</td><td>
	<tr><td># following parameteres can be kept as they are</td><td>
	<tr><td>#</td><td>
	<tr><td>MaximumTreeDepth = 2</td><td>
	<tr><td>MetFragPreProcessingCandidateFilter = UnconnectedCompoundFilter</td><td>
	<tr><td>MetFragPostProcessingCandidateFilter = InChIKeyFilter</td><td>
	<tr><td># NumberThreads = 1</td><td>
  </table>
</div>
<p><p>
A first example run can be 
<div class="code">
  # java -jar MetFrag2.2-CL.jar example_parameter_file.txt
</div>
<p><p>
<h4>Databases</h4>
There are different databases available that can be queried for candidate molecules (MetFragDatabaseType)<p>
<ul>
<il>KEGG</il><br>
<il>PubChem</il><br>
<il>ExtendedPubChem</il><br>
<il>ChemSpider (only available with a valid token -> ChemSpiderToken)</il><br>
<il>LocalInChI</il><br>
<il>LocalSDF</il><br>
</ul>
The KEGG, PubChem and ChemSpider databases are queried either by <span style="font-weight:bold">database dependent compound ids (PrecursorCompoundIDs)</span>, <span style="font-weight:bold">molecular formula (NeutralPrecursorMolecularFormula)</span> or 
<span style="font-weight:bold">neutral monoisotopic mass (NeutralPrecursorMass) together with a relative mass deviation (DatabaseSearchRelativeMassDeviation)</span> in the given order if more than one is defined.
<p><p>
</div>
<p><p>
<h4></h4>

<h4>Known issues</h4>
If you are getting the java exception when using the commandline version<p>
<div class="code">
  # java.lang.IllegalArgumentException: Comparison method violates its general contract!
</div>
<p><p>
there is a quick workaround for java-1.6 users
<p>
<div class="code">
  # java <span style="font-weight:bold">-Djava.util.Arrays.useLegacyMergeSort=true</span> -jar MetFragCommandLineTool.jar
</div>
<p>

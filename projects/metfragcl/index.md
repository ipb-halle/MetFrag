---
layout: main
title: project
nav:
  about: active
---

### MetFrag CL

MetFrag is available as a command line tool, which matches the functionality present on <a href="https://msbi.ipb-halle.de/MetFrag/">MetFragWeb</a>. It combines the efficient fragmenter and additional scoring functions to rank the retrieved candidates. The inclusion of mass spectrtal match, retention time information from liquid chromatography and reference information is also possible.

<a class="btn btn-primary" href="https://github.com/ipb-halle/MetFragRelaunched/releases/latest" role="button">Download MetFrag CL (latest)</a>
<a class="btn btn-primary" href="https://github.com/ipb-halle/MetFragRelaunched" role="button">MetFrag CL on GitHub</a>

<hr>

<h3>Usage</h3>
Once downloaded, the executable MetFrag jar can be run via a parameter file (see next section) using the following command (where X.Y.Z should be replaced by the version number matching the downloaded jar files):
<div class="code">
  # java -jar MetFragCommandLine-X.Y.Z.jar [parameter file]
</div>
<p><p>
<h3>Defining Parameters</h3>
All input parameters for MetFrag CL are specified in a <span style="font-weight:bold">parameter file</span>, which contains all necessary settings to process a given MS/MS peak list. An example parameter file for querying PubChem can be downloaded <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_parameter_file.txt">here</a>, while the corresponding example MS/MS peak list can be downloaded <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_data.txt">here</a>. Further example files are given below. Note that it is also possible to use the <a href="https://msbi.ipb-halle.de/MetFrag/">MetFrag Web</a> interface to generate parameter files by selecting all desired settings and pressing the "download parameters" button.
<p>
The example file (full example printed below) can be viewed using a text editor. Lines starting with # are comments and are not used by MetFrag. The following headings describe the main groups of parameters. 

<h4>Peak list path</h4>
This parameter defines the path to the peak list (MS/MS fragments), which can be a two or three column text file containing m/z in the first column and intensities in the second (and optionally third column, to read files that contain both absolute and relative intensities). 
<div class="code">
 <table>
	<tr><td>PeakListPath = example_data.txt</td></tr>
 </table>
</div>
<p><p>

<h4>Database parameters - retrieving candidates</h4>
These parameters define the settings for candidate retrieval. By default, neutral species are queried (i.e., neutral exact mass or molecular formula). Settings to enable querying of charged mass (i.e. m/z values) are given below. The settings are a combination of database and retrieval parameters. If multiple candidate retrieval options are defined, PrecursorCompoundIDs over-rides NeutralPrecursorMolecularFormula, which over-rides NeutralPrecursorMass.
<div class="code">
 <table>
	<tr><td># Database settings</td></tr>
	<tr><td>MetFragDatabaseType = ... </td></tr>
	<tr><td>LocalDatabasePath = ... (only needed for LocalSDF, LocalCSV or LocalPSV) </td></tr>
	<tr><td>ChemSpiderToken = ... (only needed for ChemSpiderRest) </td></tr>
 </table>
</div>
<p><p>

<div class="code">
 <table>
	<tr><td># Retrieval settings (at least one of these three groups must be defined)</td></tr>
	<tr><td>NeutralPrecursorMass = ...</td></tr>
	<tr><td>DatabaseSearchRelativeMassDeviation = ... (a value in ppm)</td></tr>
	<tr><td>OR</td></tr>
	<tr><td>NeutralPrecursorMolecularFormula = ...</td></tr>
	<tr><td>OR</td></tr>
	<tr><td>PrecursorCompoundIDs = ... </td></tr>
 </table>
</div>
<p><p>

Different database (MetFragDatabaseType) options for retrieving candidate molecules include:<p>
<ul>
<il>KEGG</il><br>
<il>PubChem</il><br>
<il>ExtendedPubChem</il><br>
<il>ChemSpiderRest (only available with a valid token -> ChemSpiderToken)</il><br>
<il>LocalSDF</il><br>
<il>LocalPSV (<a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_local_inchi_file.txt">example</a>)</il><br>
<il>LocalCSV (<a href="https://msbi.ipb-halle.de/~cruttkie/databases/">example</a>)</il><br>
</ul>
Using a database from a local file (LocalSDF, LocalCSV, LocalPSV) requires setting a file path to the database file (LocalDatabasePath). The KEGG, PubChem and ChemSpider databases can be queried either by database dependent compound ids <span style="font-weight:bold">(PrecursorCompoundIDs)</span>, molecular formula <span style="font-weight:bold">(NeutralPrecursorMolecularFormula)</span> or neutral monoisotopic mass and relative mass deviation <span style="font-weight:bold">(NeutralPrecursorMass, DatabaseSearchRelativeMassDeviation)</span>. 

This is an example query to retrieve candidates from PubChem via molecular formula:
<div class="code">
 <table>
	<tr><td>MetFragDatabaseType = PubChem</td></tr>
	<tr><td>NeutralPrecursorMolecularFormula = C9H11Cl3NO3PS</td></tr>
 </table>
</div>
<p><p>

while here is an example query to retrieve candidates from PubChemLite (localCSV option, file downloaded into the same directory as the jar file) via exact mass:
<div class="code">
 <table>
	<tr><td>MetFragDatabaseType = localCSV</td></tr>
	<tr><td>LocalDatabasePath = PubChemLite_exposomics_20241025.csv </td></tr>
	<tr><td>NeutralPrecursorMass = 253.966126</td></tr>
	<tr><td>DatabaseSearchRelativeMassDeviation = 5</td></tr>
 </table>
</div>
<p><p>

<h4>Peak matching parameters (fragmentation settings)</h4>
The peak matching parameters, or fragmentation settings, are defined with the following options. The absolute and relative deviations are additive. For PrecursorIonMode options, see below. 

<div class="code">
 <table>
	<tr><td>FragmentPeakMatchAbsoluteMassDeviation = 0.001</td></tr>
	<tr><td>FragmentPeakMatchRelativeMassDeviation = 5</td></tr>
	<tr><td>PrecursorIonMode = 1</td></tr>
	<tr><td>IsPositiveIonMode = True</td></tr>
 </table>
</div>
<p><p>

<h4>Output parameters</h4>
The output options are defined using the following three parameters. SampleName defines the name of the results file, and the output file path is defined using "ResultsPath". The output options are one or more of SDF, XLS, CSV, ExtendedXLS, ExtendedFragmentsXLS. The latter two options give additional outputs (including images) not possible in CSV or SDF formats. 

<div class="code">
 <table>
	<tr><td>MetFragCandidateWriter = XLS</td></tr>
	<tr><td>SampleName = example_1</td></tr>
	<tr><td>ResultsPath = .</td></tr>
 </table>
</div>
<p><p>

<h4>Additional parameters</h4>
For advanced users, the following parameters offer additional options, such as increasing the number of fragmentation steps (MaximumTreeDepth) or threads used (NumberThreads), or different post-processing options. For most use cases, these parameters should remain at the default settings given below: 

<div class="code">
 <table>
	<tr><td>MaximumTreeDepth = 2</td></tr>
	<tr><td>MetFragPreProcessingCandidateFilter = UnconnectedCompoundFilter</td></tr>
	<tr><td>MetFragPostProcessingCandidateFilter = InChIKeyFilter</td></tr>
	<tr><td># NumberThreads = 1</td></tr>
 </table>
</div>
<p><p>

<h4>Advanced Database Scoring Options</h4>
For basic MetFrag use, the following score settings could be used: 

<div class="code">
  <table>
	<tr><td>MetFragScoreTypes = FragmenterScore</td></tr>
	<tr><td>MetFragScoreWeights = 1.0</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

However, there are several different options for more advanced scoring schemes, depending on the database. Selecting ExtendedPubChem enables the inclusion of patent (PubChemNumberPatents) and reference/literature information (PubChemNumberPubMedReferences) for the retrieved candidates. This can be defined as follows:

<div class="code">
  <table>
	<tr><td>MetFragDatabaseType = ExtendedPubChem</td></tr>
	<tr><td>MetFragScoreTypes = FragmenterScore,PubChemNumberPatents,PubChemNumberPubMedReferences</td></tr>
	<tr><td>MetFragScoreWeights = 1.0,1.0,1.0</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

For local file databases (LocalSDF, LocalCSV, LocalPSV), additional numerical scoring terms can be included using unique column headers (PSV, CSV) or tags (SDF). The recommended scoring terms for PubChemLite are as follows (with the addition of spectral library matching, see next section):

<div class="code">
  <table>
	<tr><td>MetFragDatabaseType = localCSV</td></tr>
	<tr><td>LocalDatabasePath = PubChemLite_exposomics_20241025.csv </td></tr>
	<tr><td>MetFragScoreTypes = FragmenterScore,OfflineIndividualMoNAScore,AnnoTypeCount,Patent_Count,PubMed_Count</td></tr>
	<tr><td>MetFragScoreWeights = 1.0,1.0,1.0,1.0,1.0</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

It is possible to adjust the weights. For example, several reference scores can be retrieved from ChemSpider, which can be weighted to form a total score of 1: 

<div class="code">
  <table>
	<tr><td>MetFragDatabaseType = ChemSpiderRest</td></tr>
	<tr><td>ChemSpiderToken = ... </td></tr>
	<tr><td>MetFragScoreTypes = FragmenterScore,ChemSpiderReferenceCount,ChemSpiderNumberExternalReferences,ChemSpiderRSCCount,ChemSpiderNumberPubMedReferences,ChemSpiderDataSourceCount</td></tr>
	<tr><td>MetFragScoreWeights = 1.0,0.2,0.2,0.2,0.2,0.2</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>
 
The parameter file tells MetFrag which information to include in the final scoring via the database, scoring term and associated weight. If in doubt, use the <a href="https://msbi.ipb-halle.de/MetFrag/">MetFrag Web</a> interface to generate parameter files by selecting all desired settings (it is also possible to adjust the weights) and pressing the "download parameters" button.


<h4>Statistical Scoring</h4>
MetFrag now includes scoring parameters based on a statistical learning approach (Bayesian model). The new scores can be used along with the FragmenterScore as follows:

<div class="code">
 <table>
        <tr><td>MetFragScoreTypes = FragmenterScore,AutomatedPeakFingerprintAnnotationScore,AutomatedLossFingerprintAnnotationScore</td></tr>
 </table>
</div>

You can find examples of the CASMI2016 contest for <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/Challenge-087.txt">positive</a> and <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/Challenge-039.txt">negative</a> mode. Starting with MetFrag2.4.5-CL.jar the tool includes a trained model which can directly be used with the provided parameter files. The new scoring parameters improved MetFrag's annotation results.

More examples can be found on <a href="https://github.com/c-ruttkies/metfrag_statistical_annotation">GitHub</a>.

<h4>Spectral library scores</h4>
<div style="font-style: italic; margin-bottom: 5px;">OfflineSpectralDatabaseFile</div>
MetFrag has two kinds of scores to take spectral library matches into account, using local
files created from MassBank of North America (MoNA) download files. It is possible to use zero, one or both spectral library terms by including these options in the MetFragScoreTypes (shown here in combination with the FragmenterScore):

<div class="code">
  <table>
	<tr><td>MetFragScoreTypes = FragmenterScore,OfflineIndividualMoNAScore,OfflineMetFusionScore</td></tr>
	<tr><td>MetFragScoreWeights = 1.0,1.0,1.0</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

The spectral library to use can be defined as a single file:<br>
<br>OfflineSpectralDatabaseFile = /path/to/MoNA-export-LC-MS.mb<br>
or a directory and MetFrag will read all .mb files in that directory:<br>
<br>OfflineSpectralDatabaseFile = /path/to/<br>

The OfflineIndividualMoNAScore matches spectra to the candidates using the InChIKey, reporting the best similarity match if multiple spectra with the same InChIKey exist. This option allows the generation of "Level 2a" annotations (spectral similarity match) with sufficiently high match values (>0.8, or >0.9 for same instrument if Orbitrap). The OfflineMetFusionScore uses the MetFusion scoring approach and will return spectral match values even if no spectrum exists, using both spectral and structural similarity (see Gerlich et al, DOI: <a href="https://doi.org/10.1002/jms.3123">10.1002/jms.3123</a>). 

<h4>Further Parameters</h4>
<div style="font-style: italic; margin-bottom: 5px;">PrecursorIonMode</div>
The adduct type of the precursor is used to calculate fragment masses. Following adduct types can be set by their appropriate numerical value encoding the following types:<br>
<br>positive (IsPositiveIonMode = True)<br>
<table class="params">
	<tr><td>1</td><td>-</td><td>[M+H]<sup>+</sup></td></tr>
	<tr><td>18</td><td>-</td><td>[M+NH4]<sup>+</sup></td></tr>
	<tr><td>23</td><td>-</td><td>[M+Na]<sup>+</sup></td></tr>
	<tr><td>39</td><td>-</td><td>[M+K]<sup>+</sup></td></tr>
	<tr><td>33</td><td>-</td><td>[M+CH3OH+H]<sup>+</sup></td></tr>
	<tr><td>42</td><td>-</td><td>[M+ACN+H]<sup>+</sup></td></tr>
	<tr><td>64</td><td>-</td><td>[M+ACN+Na]<sup>+</sup></td></tr>
	<tr><td>83</td><td>-</td><td>[M+2ACN+H]<sup>+</sup></td></tr>
</table>
<br>negative (IsPositiveIonMode = False)<br>
<table class="params">
	<tr><td>-1</td><td>-</td><td>[M-H]<sup>-</sup></td></tr>
	<tr><td>35</td><td>-</td><td>[M+Cl]<sup>-</sup></td></tr>
	<tr><td>45</td><td>-</td><td>[M+HCOO]<sup>-</sup></td></tr>
	<tr><td>59</td><td>-</td><td>[M+CH3COO]<sup>-</sup></td></tr>
</table>
<br>no adduct (IsPositiveIonMode = True/False)<br>
<table class="params">
	<tr><td>0</td><td>-</td><td>[M]<sup>+/-</sup></td></tr>
</table>

<h3>Running the Example</h3>
The <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_parameter_file.txt">example parameter file</a> for running MetFrag looks like this:
<p><p>
<div class="code">
  <table>
	<tr><td>#</td></tr>
	<tr><td># data file containing mz intensity peak pairs (one per line)</td></tr>
	<tr><td>#</td></tr>
	<tr><td>PeakListPath = example_data.txt</td></tr>
	<tr><td></td></tr>
	<tr><td>#</td></tr>
	<tr><td># database parameters -> how to retrieve candidates</td></tr>
	<tr><td>#</td></tr>
	<tr><td>#</td></tr>
	<tr><td>MetFragDatabaseType = PubChem</td></tr>
	<tr><td>NeutralPrecursorMolecularFormula = C9H11Cl3NO3PS</td></tr>
	<tr><td>NeutralPrecursorMass = 348.926284</td></tr>
	<tr><td></td></tr>
	<tr><td>#</td></tr>
	<tr><td># peak matching parameters</td></tr>
	<tr><td>#</td></tr>
	<tr><td>FragmentPeakMatchAbsoluteMassDeviation = 0.001</td></tr>
	<tr><td>FragmentPeakMatchRelativeMassDeviation = 5</td></tr>
	<tr><td>PrecursorIonMode = 1</td></tr>
	<tr><td>IsPositiveIonMode = True</td></tr>
	<tr><td></td></tr>
	<tr><td>#</td></tr>
	<tr><td># scoring parameters</td></tr>
	<tr><td>#</td></tr>
	<tr><td>MetFragScoreTypes = FragmenterScore</td></tr>
	<tr><td>MetFragScoreWeights = 1.0</td></tr>
	<tr><td></td></tr>
	<tr><td>#</td></tr>
	<tr><td># output</td></tr>
	<tr><td># SDF, XLS, CSV, ExtendedXLS, ExtendedFragmentsXLS</td></tr>
	<tr><td>#</td></tr>
	<tr><td>MetFragCandidateWriter = XLS</td></tr>
	<tr><td>SampleName = example_1</td></tr>
	<tr><td>ResultsPath = .</td></tr>
	<tr><td></td></tr>
	<tr><td>#</td></tr>
	<tr><td># following parameteres can be kept as they are</td></tr>
	<tr><td>#</td></tr>
	<tr><td>MaximumTreeDepth = 2</td></tr>
	<tr><td>MetFragPreProcessingCandidateFilter = UnconnectedCompoundFilter</td></tr>
	<tr><td>MetFragPostProcessingCandidateFilter = InChIKeyFilter</td></tr>
	<tr><td># NumberThreads = 1</td></tr>
  </table>
</div>
<p><p>
This example can be run using the following command (for MetFragCL v2.4.5):
<div class="code">
  # java -jar MetFrag2.4.5-CL.jar example_parameter_file.txt
</div>
<p><p>
This will generate the following output:
<div class="code">
INFO  de.ipbhalle.metfraglib.database.OnlinePubChemDatabase - Fetching candidates from PubChem<br>
INFO  de.ipbhalle.metfraglib.process.CombinedMetFragProcess - Got 8 candidate(s)<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 10 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 30 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 40 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 50 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 60 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 80 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 90 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedSingleCandidateMetFragProcess - 100 %<br>
INFO  de.ipbhalle.metfraglib.process.CombinedMetFragProcess - 0 candidate(s) were discarded before processing due to pre-filtering<br>
INFO  de.ipbhalle.metfraglib.process.CombinedMetFragProcess - 0 candidate(s) discarded during processing due to errors<br>
INFO  de.ipbhalle.metfraglib.process.CombinedMetFragProcess - 1 candidate(s) discarded after processing due to post-filtering<br>
INFO  de.ipbhalle.metfraglib.process.CombinedMetFragProcess - Stored 7 candidate(s)<br>
</div>
<p><p>
First MetFrag uses the defined database parameters to retrieve candidates. In this case the molecular formula C<sub>9</sub>H<sub>11</sub>Cl<sub>3</sub>NO<sub>3</sub>PS is used, resulting in 8 matching candidates. Then the processing starts. The progress is given in percent. After the processing is finished, MetFrag gives you a small summary about the number of discarded candidates due to the defined pre- and post-processing filters and errors occured during the processing. The latter can be caused by e.g. InChI parsing errors. <br>
The result file(s) is/are stored in the result directory given in the parameter file (ResultsPath). The format(s) of the result file(s) is given by the parameter <span style="font-weight:bold">MetFragCandidateWriter</span>.

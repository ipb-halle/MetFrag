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
Once downloaded, the executable MetFrag jar can be run using the following command (where X.Y.Z should be replaced by the version number matching the downloaded jar files):
<div class="code">
  # java -jar MetFragCommandLine-X.Y.Z.jar [parameter file]
</div>
<p>
All input parameters for MetFrag CL are specified in a <span style="font-weight:bold">parameter file</span>, which contains all necessary settings to process a given MS/MS peak list. An example parameter file for querying PubChem can be downloaded <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_parameter_file.txt">here</a>, while the corresponding example MS/MS peak list can be downloaded <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_data.txt">here</a>. Further details about the parameter options are given in the section "Defining Parameters" below. Note that it is also possible to use the <a href="https://msbi.ipb-halle.de/MetFrag/">MetFrag Web</a> interface to generate parameter files by selecting all desired settings and pressing the "download parameters" button.
<p><p>

<h3>Running the Example</h3>
The <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_parameter_file.txt">example parameter file</a> for running MetFrag can be viewed using a text editor and looks like this. 
Lines starting with # are comments and are not used by MetFrag. 
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
The result file(s) is/are stored in the result directory given in the parameter file (<span style="font-weight:bold">ResultsPath</span>). The format(s) of the result file(s) is given by the parameter <span style="font-weight:bold">MetFragCandidateWriter</span>.


<p><p>
<h3>Defining Parameters</h3>

The following headings describe the main groups of parameters. 

<h4>Peak List Path</h4>
This parameter defines the path to the peak list (MS/MS fragments), which can be a two or three column text file containing m/z in the first column and intensities in the second (and optionally third column, to read files that contain both absolute and relative intensities). 
<div class="code">
 <table>
	<tr><td>PeakListPath = example_data.txt</td></tr>
 </table>
</div>
<p><p>

<h4>Database Parameters - Retrieving Candidates</h4>
These parameters define the settings for candidate retrieval. By default, neutral species are queried (i.e., neutral exact mass or molecular formula). Settings to enable querying of charged mass (i.e. m/z values) are given below. The settings are a combination of database and retrieval parameters. If multiple candidate retrieval options are defined, <span style="font-weight:bold">PrecursorCompoundIDs</span> over-rides <span style="font-weight:bold">NeutralPrecursorMolecularFormula</span>, which over-rides <span style="font-weight:bold">NeutralPrecursorMass</span>.
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
	<tr><td># AND/OR</td></tr>
	<tr><td>NeutralPrecursorMolecularFormula = ...</td></tr>
	<tr><td># AND/OR</td></tr>
	<tr><td>PrecursorCompoundIDs = ... </td></tr>
 </table>
</div>
<p><p>

Different database (<span style="font-weight:bold">MetFragDatabaseType</span>) options for retrieving candidate molecules include:<p>
<ul>
<il>KEGG</il><br>
<il>PubChem</il><br>
<il>ExtendedPubChem</il><br>
<il>ChemSpiderRest (only available with a valid token -> ChemSpiderToken)</il><br>
<il>LocalSDF</il><br>
<il>LocalPSV (<a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_local_inchi_file.txt">example</a>)</il><br>
<il>LocalCSV (<a href="https://msbi.ipb-halle.de/~cruttkie/databases/">example</a>)</il><br>
</ul>
Using a database from a local file (<span style="font-weight:bold">LocalSDF, LocalCSV, LocalPSV</span>) requires setting a file path to the database file (<span style="font-weight:bold">LocalDatabasePath</span>). The KEGG, PubChem and ChemSpider databases can be queried either by database dependent compound ids <span style="font-weight:bold">(PrecursorCompoundIDs)</span>, molecular formula <span style="font-weight:bold">(NeutralPrecursorMolecularFormula)</span> or neutral monoisotopic mass and relative mass deviation <span style="font-weight:bold">(NeutralPrecursorMass, DatabaseSearchRelativeMassDeviation)</span>. 

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

<h4>Peak Matching Parameters (Fragmentation Settings)</h4>
The peak matching parameters, or fragmentation settings, are defined with the following options. The absolute and relative deviations are additive. For <span style="font-weight:bold">PrecursorIonMode</span> options, see below. 

<div class="code">
 <table>
	<tr><td>FragmentPeakMatchAbsoluteMassDeviation = 0.001</td></tr>
	<tr><td>FragmentPeakMatchRelativeMassDeviation = 5</td></tr>
	<tr><td>PrecursorIonMode = 1</td></tr>
	<tr><td>IsPositiveIonMode = True</td></tr>
 </table>
</div>
<p><p>

<h4>Output Parameters</h4>
The output options are defined using the following three parameters. <span style="font-weight:bold">SampleName</span> defines the name of the results file, and the output file path is defined using <span style="font-weight:bold">ResultsPath</span>. The output options are one or more of SDF, XLS, CSV, ExtendedXLS, ExtendedFragmentsXLS. The latter two options give additional outputs (including images) not possible in CSV or SDF formats. 

<div class="code">
 <table>
	<tr><td>MetFragCandidateWriter = XLS</td></tr>
	<tr><td>SampleName = example_1</td></tr>
	<tr><td>ResultsPath = .</td></tr>
 </table>
</div>
<p><p>

<h4>Additional Parameters</h4>
For advanced users, the following parameters offer additional options, such as different pre- or post-processing options, increasing the number of fragmentation steps (<span style="font-weight:bold">MaximumTreeDepth</span>) or threads used (<span style="font-weight:bold">NumberThreads</span>). 
The pre-processing option UnconnectedCompoundFilter will eliminate salts and mixtures, while the IsotopeFilter option will remove non-standard isotope forms (containing deuterium, <sup>13</sup>C, <sup>15</sup>N etc.) that would not be observed at the query mass/formula. The post-processing InChIKey filter collapses all candidates with the same InChIKey first block (structural skeleton) together with the results from the best-scoring candidate.
For most use cases, these parameters should remain at the default settings given below: 

<div class="code">
 <table>
	<tr><td>MaximumTreeDepth = 2</td></tr>
	<tr><td>MetFragPreProcessingCandidateFilter = UnconnectedCompoundFilter,IsotopeFilter</td></tr>
	<tr><td>MetFragPostProcessingCandidateFilter = InChIKeyFilter</td></tr>
	<tr><td>NumberThreads = 1</td></tr>
 </table>
</div>
<p><p>

<h4>Advanced Database Scoring Options</h4>
For basic MetFrag use, the following score settings could be used. 
However, using more advanced scoring settings such as spectral match or other additional scoring terms described below will improve the performance. 

<div class="code">
  <table>
	<tr><td>MetFragScoreTypes = FragmenterScore</td></tr>
	<tr><td>MetFragScoreWeights = 1.0</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

There are several different options for more advanced scoring schemes, depending on the database. Selecting ExtendedPubChem enables the inclusion of patent (PubChemNumberPatents) and reference/literature information (PubChemNumberPubMedReferences) for the retrieved candidates. This can be defined as follows:

<div class="code">
  <table>
	<tr><td>MetFragDatabaseType = ExtendedPubChem</td></tr>
	<tr><td>MetFragScoreTypes = FragmenterScore,PubChemNumberPatents,PubChemNumberPubMedReferences</td></tr>
	<tr><td>MetFragScoreWeights = 1.0,1.0,1.0</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

For local file databases (LocalSDF, LocalCSV, LocalPSV), additional numerical scoring terms can be included using unique column headers (PSV, CSV) or tags (SDF). As an example, the recommended scoring terms for PubChemLite (DOI: <a href="https://doi.org/10.1186/s13321-021-00489-0">10.1186/s13321-021-00489-0</a>) are as follows (including the recommended spectral library matching option, see next section):

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

It is possible to adjust the weights. For example, up to 5 reference scores can be retrieved from ChemSpider, which can be weighted to form a combined reference score total of maximum 1 (total score maximum 2) as follows: 

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
 
The parameter file tells MetFrag which information to include in the final scoring via the database, scoring term and associated weight. If in doubt, use the <a href="https://msbi.ipb-halle.de/MetFrag/">MetFrag Web</a> interface to generate example parameter files by selecting all desired settings (it is also possible to adjust the weights) and pressing the "download parameters" button. For local databases, suitable additional scoring terms, if available, will appear automatically on the web interface in the "Candidate Filter & Score Settings" section (bottom right). 


<h4>Statistical Scoring</h4>
MetFrag also includes scoring parameters based on a statistical learning approach (Bayesian model). The new scores can be used along with the FragmenterScore as follows:

<div class="code">
 <table>
        <tr><td>MetFragScoreTypes = FragmenterScore,AutomatedPeakFingerprintAnnotationScore,AutomatedLossFingerprintAnnotationScore</td></tr>
 </table>
</div>

This new model is included since MetFrag2.4.5-CL.jar. Examples to try include spectra from the CASMI2016 contest for <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/Challenge-087.txt">positive</a> and <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/Challenge-039.txt">negative</a> mode. More examples can be found on <a href="https://github.com/c-ruttkies/metfrag_statistical_annotation">GitHub</a>.

<h4>Spectral Library Match Scores</h4>
MetFrag has two kinds of scores to take spectral library matches into account, using local
files created from MassBank of North America (<a href="https://mona.fiehnlab.ucdavis.edu/downloads">MoNA</a>) download files. DOI:<a href="https://doi.org/10.5281/zenodo.13951786">10.5281/zenodo.13951786</a> redirects to the latest LC-MS mb file for download, while the conversion script used to create these mb files is available <a href="https://github.com/sneumann/weizfrag/blob/main/convert-mona.R">here</a>. Note that this is a slightly non-standard format due to the fingerprint required for MetFusion. 

It is possible to use zero, one or both spectral library terms by including these options in the <span style="font-weight:bold">MetFragScoreTypes</span> (shown here in combination with the FragmenterScore):

<div class="code">
  <table>
	<tr><td>MetFragScoreTypes = FragmenterScore,OfflineIndividualMoNAScore,OfflineMetFusionScore</td></tr>
	<tr><td>MetFragScoreWeights = 1.0,1.0,1.0</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

<div style="font-style: bold; margin-bottom: 5px;">OfflineSpectralDatabaseFile</div>
The spectral library to use can be defined as a single file or a directory and MetFrag will read all .mb files in that directory:<br>
<div class="code">
  <table>
	<tr><td>OfflineSpectralDatabaseFile = /path/to/MoNA-export-LC-MS.mb</td></tr>
	<tr><td># OR</td></tr>
	<tr><td>OfflineSpectralDatabaseFile = /path/to/</td></tr>
	<tr><td></td></tr>
  </table>
</div>
<p><p>

The OfflineIndividualMoNAScore matches spectra to the candidates using the InChIKey, reporting the best similarity match if multiple spectra with the same InChIKey exist. This option allows the generation of "Level 2a" annotations (spectral similarity match, according to DOI: <a href="https://doi.org/10.1021/es5002105">10.1021/es5002105</a>) with sufficiently high match values (e.g., >0.9). The OfflineMetFusionScore uses the MetFusion scoring approach and will return spectral match values even if no spectrum exists, using both spectral and structural similarity (see Gerlich et al, DOI: <a href="https://doi.org/10.1002/jms.3123">10.1002/jms.3123</a>). 

<h4>Further Parameters</h4>
<div style="font-style: italic; margin-bottom: 5px;">PrecursorIonMode</div>
The adduct type of the precursor is used to calculate fragment masses. The following adduct types can be set by using the appropriate numerical value encoding the following types:<br>
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

As mentioned above, it is possible to use the <a href="https://msbi.ipb-halle.de/MetFrag/">MetFrag Web</a> interface to generate parameter files by selecting all desired settings and pressing the "download parameters" button. Should you require more details about any parameters, please post a <a href="https://github.com/ipb-halle/MetFragRelaunched/issues">GitHub issue</a>.
If you are having issues with the settings, please check the MetFrag log file or inline output (which usually provide informative but rather verbose error messages) and previous issue postings before posting a <a href="https://github.com/ipb-halle/MetFragRelaunched/issues">GitHub issue</a>. Please include as many details as possible, such as parameter settings, log messages, version number and operating system.  
<p><p>
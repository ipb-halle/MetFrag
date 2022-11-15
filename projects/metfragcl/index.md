---
layout: main
title: project
nav:
  about: active
---

### MetFrag CL

MetFrag is available as a commandline tool. It combines the efficient fragmenter and functionalities to include additional information to score the retrieved candidates. The inclusion of retention time information from liquid chromatography and reference information is possible.

<a class="btn btn-primary" href="https://github.com/ipb-halle/MetFragRelaunched/releases/latest" role="button">Download MetFrag CL</a>
<a class="btn btn-primary" href="https://github.com/ipb-halle/MetFragRelaunched" role="button">MetFrag CL on github</a>

<hr>

<h3>Usage</h3>
After downloading the executable jar MetFrag can generally be run by
<div class="code">
  # java -jar MetFragCommandLine-VERSION-jar-with-dependencies.jar [parameter file]
</div>
<p><p>
<h4>Parameter file</h4>
MetFrag CL needs a <span style="font-weight:bold">parameter file</span> of specific layout as input. The parameter file contains all necessary information for the processing of a given MS/MS peak list. An example parameter file can be downloaded <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_parameter_file.txt">here</a> and corresponding example <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_data.txt">data</a> file containg the mz peak list is also needed.
<p>
To view the contents of the example file it can be opened with a text editor. Lines starting with # are comments and not used by MetFrag.
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
A first example run can be realized by the following command:
<div class="code">
  # java -jar MetFrag2.4.5-CL.jar example_parameter_file.txt
</div>
<p><p>
You will get the following output:
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
First MetFrag uses the defined database parameters to retrieve candidate. In this case the molecular formula is used (C<sub>9</sub>H<sub>11</sub>Cl<sub>3</sub>NO<sub>3</sub>PS) resulting in 8 matching candidates. Then the processing starts and the progress is given in percent numbers. After the processing is finished MetFrag gives you small summary about the number of discarded candidates due to the defined pre- and post-processing filters and errors occured during the processing. The latter can be caused by e.g. InChI parsing errors. <br>
The result file(s) is/are stored in the result directory given in the parameter file (ResultsPath). The format of the result file is given by the parameter MetFragCandidateWriter
<p><p>
<h4>Databases</h4>
There are different databases available that can be queried for candidate molecules (MetFragDatabaseType)<p>
<ul>
<il>KEGG</il><br>
<il>PubChem</il><br>
<il>ExtendedPubChem</il><br>
<il>ChemSpiderRest (only available with a valid token -> ChemSpiderToken)</il><br>
<il>LocalSDF</il><br>
<il>LocalPSV (<a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/example_local_inchi_file.txt">example</a>)</il><br>
<il>LocalCSV (<a href="https://msbi.ipb-halle.de/~cruttkie/databases/">example</a>)</il><br>
</ul>
If you use a local file database (LocalSDF, LocalCSV, LocalPSV) you have to provide the path to the file database (LocalDatabasePath). The KEGG, PubChem and ChemSpider databases are queried either by <span style="font-weight:bold">database dependent compound ids (PrecursorCompoundIDs)</span>, <span style="font-weight:bold">molecular formula (NeutralPrecursorMolecularFormula)</span> or 
<span style="font-weight:bold">neutral monoisotopic mass (NeutralPrecursorMass) together with a relative mass deviation (DatabaseSearchRelativeMassDeviation)</span> in the given order if more than one is defined. Next to PubChem there is also an extended PubChem database available that fetches patent (PubChemNumberPatents) and reference (PubChemNumberPubMedReferences) information for the retrieved candidates. These can then be used as an additional scoring term like the additional information that comes with a ChemSpider database query. These are the number of references (ChemSpiderReferenceCount), external references (ChemSpiderNumberExternalReferences), citations in Royal Society of Chemistry journals (ChemSpiderRSCCount), references in PubMed (ChemSpiderNumberPubMedReferences) and data sources (ChemSpiderDataSourceCount). 
To tell MetFrag which information you want to be included in the final scoring, you just need to adapt the parameter file. First set the proper database (ExtendedPubChem) and add the additional scoring term (PubChemNumberPatents) and a weight defining the influence of the additional scoring term in the final scoring.

<div class="code">
 <table>
	<tr><td>MetFragDatabaseType = ExtendedPubChem</td></tr>
	<tr><td>MetFragScoreTypes = FragmenterScore,PubChemNumberPatents</td></tr>
        <tr><td>MetFragScoreWeights = 1.0,0.2</td></tr>
 </table>
</div>
<p><p>
<h4>Statistical Scoring <span style="color: red; font-style: italic">(new)</span></h4>
MetFrag now includes new scoring parameters which are based on a statistical learning approach. Therefore annotations of fragment-structures and m/z-peaks are learned by a bayesian model. 

The new scores can be used along with the FragmenterScore:

<div class="code">
 <table>
        <tr><td>MetFragScoreTypes = FragmenterScore,AutomatedPeakFingerprintAnnotationScore,AutomatedLossFingerprintAnnotationScore</td></tr>
 </table>
</div>

You can find examples of the CASMI2016 contest for <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/Challenge-087.txt">positive</a> and <a href="https://msbi.ipb-halle.de/~cruttkie/metfrag/Challenge-039.txt">negative</a> mode. The MetFrag2.4.5-CL.jar tool includes a trained model which can directly be used with the provided parameter files. The new scoring parameters have shown to improve MetFrag's annotation results.

More examples can be found on <a href="https://github.com/c-ruttkies/metfrag_statistical_annotation">GitHub</a>.

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

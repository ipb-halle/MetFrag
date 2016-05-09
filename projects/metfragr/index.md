---
layout: main
title: project
nav:
  about: active
---

### MetFragR

MetFrag is available as R-package.

<a class="btn btn-primary" href="https://github.com/c-ruttkies/MetFragR" role="button">MetFragR on github</a> <a class="btn btn-primary" href="https://github.com/c-ruttkies/MetFragR/issues"
role="button">Submit an issue</a>

<hr>

The R package enables functionalities from the MetFrag Commandline tool to be used within the R programming language. 

<h3>Install</h3>
<h4 style="padding-top: 10px">Local Install</h4>
First, check out the MetFragR GitHub repository and build the package (on command line):
<div class="code">
  <table>
    <tr><td>git clone https://github.com/c-ruttkies/MetFragR.git</td><td>
    <tr><td>cd MetFragR</td><td>
    <tr><td></td><td>
    <tr><td>R CMD check metfRag</td><td>
    <tr><td>R CMD build metfRag</td><td>
</table>
</div>
After the succesful build turn into R and install the package:
<div class="code">
  <table>
    <tr><td>install.packages("metfRag",repos=NULL,type="source")</td><td>
    <tr><td>library(metfRag)</td><td>
</table>
</div>
<h4 style="padding-top: 10px">Net Install (over GitHub)</h4>
The easiest way to install MetFragR is to use the GitHub link: 
<div class="code">
  <table>
    <tr><td>library(devtools)</td><td>
    <tr><td>install_github("c-ruttkies/MetFragR/metfRag")</td><td>
    <tr><td>library(metfRag)</td><td>
</table>
</div>

<h3>Example</h3>

The following example shows how to run a simple MetFrag query in R.
<div class="code">
  <table>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># first define the settings object</td><td>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject<-list()</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># set database parameters to select candidates</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["DatabaseSearchRelativeMassDeviation"]]<-5.0</td></tr>
 <tr><td>settingsObject[["FragmentPeakMatchAbsoluteMassDeviation"]]<-0.001</td></tr>
 <tr><td>settingsObject[["FragmentPeakMatchRelativeMassDeviation"]]<-5.0</td></tr>
 <tr><td>settingsObject[["MetFragDatabaseType"]]<-"PubChem"</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># the more information about the precurosr is available</td></tr>
 <tr><td style="font-weight: bold"># the more precise is the candidate selection</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["NeutralPrecursorMass"]]<-253.966126</td></tr>
 <tr><td>settingsObject[["NeutralPrecursorMolecularFormula"]]<-"C7H5Cl2FN2O3"</td></tr>
 <tr><td>settingsObject[["PrecursorCompoundIDs"]]<-c("50465", "57010914", "56974741", "88419651", "23354334")</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># pre and post-processing filter</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># define filters to filter unconnected compounds (e.g. salts)</td></tr>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("UnconnectedCompoundFilter","IsotopeFilter")</td></tr>
 <tr><td>settingsObject[["MetFragPostProcessingCandidateFilter"]]<-c("InChIKeyFilter")</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># define the peaklist as 2-dimensional matrix</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["PeakList"]]<-matrix(c(</td><td>
 <tr><td>90.97445, 681,</td><td>
 <tr><td>106.94476, 274,</td><td>
 <tr><td>110.02750, 110,</td><td>
 <tr><td>115.98965, 95,</td><td>
 <tr><td>117.98540, 384,</td><td>
 <tr><td>124.93547, 613,</td><td>
 <tr><td>124.99015, 146,</td><td>
 <tr><td>125.99793, 207,</td><td>
 <tr><td>133.95592, 777,</td><td>
 <tr><td>143.98846, 478,</td><td>
 <tr><td>144.99625, 352,</td><td>
 <tr><td>146.00410, 999,</td><td>
 <tr><td>151.94641, 962,</td><td>
 <tr><td>160.96668, 387,</td><td>
 <tr><td>163.00682, 782,</td><td>
 <tr><td>172.99055, 17,</td><td>
 <tr><td>178.95724, 678,</td><td>
 <tr><td>178.97725, 391,</td><td>
 <tr><td>180.97293, 999,</td><td>
 <tr><td>196.96778, 720,</td><td>
 <tr><td>208.96780, 999,</td><td>
 <tr><td>236.96245, 999,</td><td>
 <tr><td>254.97312, 999), ncol=2, byrow=TRUE)</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># run MetFrag</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>scored.candidates<-run.metfrag(settingsObject)</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># scored.candidates is a data.frame with scores and candidate properties </td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
</table>
</div>


<h3>Candidate Filters</h3>
<h4 style="padding-top: 10px">Pre-pocessing Candidate Filters</h4>
Filters can be defined to filter candidates prior to fragmentation. Following filters are available:<br>
<table style="margin-left: 10px;">
 <tr><td>UnconnectedCompoundFilter</td><td>-</td><td>filter non-connected compounds (e.g. salts)</td></tr>
 <tr><td>IsotopeFilter</td><td>-</td><td>filter compounds containing non-standard isotopes</td></tr>
 <tr><td></td><td></td><td></td></tr>
 <tr><td>MinimumElementsFilter</td><td>-</td><td>filter by minimum of contained elements</td></tr>
 <tr><td>MaximumElementsFilter</td><td>-</td><td>filter by maximum of contained elements</td></tr>
 <tr><td></td><td></td><td></td></tr>
 <tr><td>SmartsSubstructureInclusionFilter</td><td>-</td><td>filter by presence of defined sub-structures</td></tr>
 <tr><td>SmartsSubstructureExclusionFilter</td><td>-</td><td>filter by absence of defined sub-structures</td></tr>
 <tr><td></td><td></td><td></td></tr>
 <tr><td>ElementInclusionFilter</td><td>-</td><td>filter by presence of defined elements (other elements are allowed)</td></tr>
 <tr><td>ElementInclusionExclusiveFilter</td><td>-</td><td>filter by presence of defined elements (no other elements are allowed)</td></tr>
 <tr><td>ElementExclusionFilter</td><td>-</td><td>filter by absence of defined sub-structures</td></tr>
</table><br>
When defining pre-processing filters further parameters have to be defined:<br><br>
<table style="margin-left: 10px;">
 <tr><td>MinimumElementsFilter</td><td>-</td><td>FilterMinimumElements</td></tr>
 <tr><td>MaximumElementsFilter</td><td>-</td><td>FilterMaximumElements</td></tr>
 <tr><td></td><td></td><td></td></tr>
 <tr><td>SmartsSubstructureInclusionFilter</td><td>-</td><td>SmartsSubstructureInclusionScoreSmartsList</td></tr>
 <tr><td>SmartsSubstructureExclusionFilter</td><td>-</td><td>SmartsSubstructureExclusionScoreSmartsList</td></tr>
 <tr><td></td><td></td><td></td></tr>
 <tr><td>ElementInclusionFilter</td><td>-</td><td>FilterIncludedElements</td></tr>
 <tr><td>ElementInclusionExclusiveFilter</td><td>-</td><td>FilterIncludedElements</td></tr>
 <tr><td>ElementExclusionFilter</td><td>-</td><td>FilterExcludedElements</td></tr>
</table><br>
<span style="font-weight: bold">Examples:</span><br><br>
<div class="code">
<table>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># MinimumElementsFilter</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("MinimumElementsFilter")</td></tr>
 <tr><td style="font-weight: bold"># include compounds with at least 2 nitrogens and 3 oxygens</td></tr>
 <tr><td>settingsObject[["FilterMinimumElements"]]<-"N2O3"</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># MaximumElementsFilter</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("MaximumElementsFilter")</td></tr>
 <tr><td style="font-weight: bold"># filter out compounds with at maximum 5 nitrogens and 7 oxygens</td></tr>
 <tr><td>settingsObject[["FilterMinimumElements"]]<-"N5O7"</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># SmartsSubstructureInclusionFilter</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("SmartsSubstructureInclusionFilter")</td></tr>
 <tr><td style="font-weight: bold"># include compounds containing benzene</td></tr>
 <tr><td>settingsObject[["SmartsSubstructureInclusionScoreSmartsList"]]<-c("c1ccccc1")</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># SmartsSubstructureExclusionFilter</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("SmartsSubstructureExclusionFilter")</td></tr>
 <tr><td style="font-weight: bold"># filter out compounds containing hydroxyl groups</td></tr>
 <tr><td>settingsObject[["SmartsSubstructureInclusionScoreSmartsList"]]<-c("[OX2H]")</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># ElementInclusionFilter</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("ElementInclusionFilter")</td></tr>
 <tr><td style="font-weight: bold"># include compounds containing nitrogen and oxygen</td></tr>
 <tr><td>settingsObject[["FilterIncludedElements"]]<-c("N","O")</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td style="font-weight: bold"># ElementExclusionFilter</td></tr>
 <tr><td style="font-weight: bold">#</td></tr>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("ElementExclusionFilter")</td></tr>
 <tr><td style="font-weight: bold"># filter out compounds including bromine or chlorine</td></tr>
 <tr><td>settingsObject[["FilterExcludedElements"]]<-c("Cl","Br")</td></tr>
</table><br>
</div>
Defining multiple filters at once is possible:<br><br>
<div class="code">
<table>
 <tr><td>settingsObject[["MetFragPreProcessingCandidateFilter"]]<-c("MinimumElementsFilter", "MaximumElementsFilter")</td></tr>
 <tr><td>settingsObject[["FilterMinimumElements"]]<-"N2O3"</td></tr>
 <tr><td>settingsObject[["FilterMinimumElements"]]<-"N5O7"</td></tr>
</table>
</div>
<h4 style="padding-top: 10px">Post-pocessing Candidate Filters</h4>
Filters can be defined to filter candidates after fragmentation and scoring. Following filters are available:<br>
<table style="margin-left: 10px;">
 <tr><td>InChIKeyFilter</td><td>-</td><td>filter stereoisomers by comparing first part of compounds' InChIKeys</td></tr>
 <tr><td></td><td></td><td>only the best-scored candidate remains in the result list</td></tr>
</table><br>

<h3>Candidate Scores</h3>
MetFrag is able to include different scores used to calculate a final score which is used to rank candidates within the candidate list. Besides pre-defined scores database dependent scores can be defined. <br>
<table style="margin-left: 10px;">
 <tr><td>FragmenterScore</td><td>-</td><td>Uses intensities, m/z values and bond energies of fragment-peak-matches</td></tr>
 <tr><td>SmartsSubstructureInclusionScore</td><td>-</td><td>Score candiates by presence of defined substructures</td></tr>
 <tr><td>SmartsSubstructureExclusionScore</td><td>-</td><td>Score candiates by absence of defined substructures</td></tr>
 <tr><td>SuspectListScore</td><td>-</td><td>Score candidates by presence in defined suspect list</td></tr>
 <tr><td>RetentionTimeScore</td><td>-</td><td>Score candidate with retention time information</td></tr>
 <tr><td>OfflineMetFusionScore</td><td>-</td><td>Uses predifined spectral library to calculate MetFusion like similarity score</td></tr>
</table><br>
When defining additional scores further parameters need to be defined:<br><br>
<table style="margin-left: 10px;">
 <tr><td>SmartsSubstructureInclusionScore</td><td>-</td><td>ScoreSmartsInclusionList</td></tr>
 <tr><td>SmartsSubstructureExclusionScore</td><td>-</td><td>ScoreSmartsExclusionList</td></tr>
 <tr><td></td><td></td><td></td></tr>
 <tr><td>SuspectListScore</td><td>-</td><td>ScoreSuspectLists</td></tr>
 <tr><td></td><td></td><td>File path of file containing InChIKeys of suspect list one per line</td></tr>
 <tr><td></td><td></td><td></td></tr>
 <tr><td>RetentionTimeScore</td><td>-</td><td>RetentionTimeTrainingFile, ExperimentalRetentionTimeValue</td></tr>
 <tr><td></td><td></td><td>RetentionTimeTrainingFile is the file path of file containing retention time and InChI for logP calculation -> one per line</td></tr>
 <tr><td></td><td></td><td>e.g.:</td></tr>
 <tr><td></td><td></td><td>RetentionTime|InChI</td></tr>
 <tr><td></td><td></td><td>14.7|InChI=1S/C10H6F17O4P/c11-3(12,1-2-31-32(28,29)30)4(13,14)5(15,16)6(17,18)7(19,20)8(21,22)9(23,24)10(25,26)27/h1-2H2,(H2,28,29,30)</td></tr>
 <tr><td></td><td></td><td>7.7|InChI=1S/C14H21NO5S/c1-4-11-7-6-8-12(5-2)14(11)15(10-20-3)13(16)9-21(17,18)19/h6-8H,4-5,9-10H2,1-3H3,(H,17,18,19)</td></tr>
 <tr><td></td><td></td><td>4.8|InChI=1S/C16H25NO2/c1-17(2)12-15(13-6-8-14(18)9-7-13)16(19)10-4-3-5-11-16/h6-9,15,18-19H,3-5,10-12H2,1-2H3</td></tr><tr><td></td><td></td><td>...</td></tr>
</table><br>

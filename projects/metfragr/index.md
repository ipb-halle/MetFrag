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


<h3>Candidates Filter</h3>
<h4 style="padding-top: 10px">Pre-pocessing Candidate Filters</h4>
Filters can be defined to filter candidate prior to fragmentation. Following filters are available:
<table>
 <tr><td>MinimumElementsFilter</td><td>-</td><td>filter by minimum of contained elements</td></tr>
 <tr><td>MaximumElementsFilter</td><td>-</td><td>filter by maximum of contained elements</td></tr>
 <tr><td></td><td></td></tr>
 <tr><td>SmartsSubstructureInclusionFilter</td>-<td></td><td>filter by presence of defined sub-structures</td></tr>
 <tr><td>SmartsSubstructureExclusionFilter</td>-<td></td><td>filter by absence of defined sub-structures</td></tr>
 <tr><td></td><td></td></tr>
 <tr><td>ElementInclusionFilter</td><td>-</td><td>filter by presence of defined elements (other elements are allowed)</td></tr>
 <tr><td>ElementInclusionExclusiveFilter</td><td>-</td><td>filter by presence of defined elements (no other elements are allowed)</td></tr>
 <tr><td>ElementExclusionFilter</td><td>-</td><td>filter by absence of defined sub-structures</td></tr>
</table>

<div class="code">

</div>

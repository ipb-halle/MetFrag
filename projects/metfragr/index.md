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

The R package enables functionalities from the MetFrag Commandline tool to be used within R prgramming language. 

<h3>Install</h3>
<p>
<h4>Local Install</h4>
First, check out the MetFragR GitHub repository and build the package (on command line):
<div class="code">
  <table>
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
<p>
<h4>Net Install (over GitHub)</h4>
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
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td style="font-weight: bold"># first define the settings object</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td>settingsObject<-list()</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td style="font-weight: bold"># set database parameters to select candidates</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td>settingsObject[["DatabaseSearchRelativeMassDeviation"]]<-5.0</td><td>
 <tr><td>settingsObject[["FragmentPeakMatchAbsoluteMassDeviation"]]<-0.001</td><td>
 <tr><td>settingsObject[["FragmentPeakMatchRelativeMassDeviation"]]<-5.0</td><td>
 <tr><td>settingsObject[["MetFragDatabaseType"]]<-"PubChem"</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td style="font-weight: bold"># the more information about the precurosr is available</td><td>
 <tr><td style="font-weight: bold"># the more precise is the candidate selection</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td>settingsObject[["NeutralPrecursorMass"]]<-253.966126</td><td>
 <tr><td>settingsObject[["NeutralPrecursorMolecularFormula"]]<-"C7H5Cl2FN2O3"</td><td>
 <tr><td>settingsObject[["PrecursorCompoundIDs"]]<-c("50465", "57010914", "56974741", "88419651", "23354334")</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td style="font-weight: bold"># define the peaklist as 2-dimensional matrix</td><td>
 <tr><td style="font-weight: bold">#</td><td>
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
 <tr><td>254.97312, 999), ncol=2, byrow=TRUE)</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td style="font-weight: bold"># run MetFrag</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td>scored.candidates<-run.metfrag(settingsObject)</td><td>
 <tr><td style="font-weight: bold">#</td><td>
 <tr><td style="font-weight: bold"># scored.candidates is a data.frame with scores and candidate properties </td><td>
 <tr><td style="font-weight: bold">#</td><td>
</table>
</div>

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

- checkout the MetFragR git repository
- build the package (on command line):

 R CMD check metfRag
 R CMD build metfRag

- install the package (in R):

 install.packages("metfRag",repos=NULL,type="source")
 library(metfRag)
 
<h3>Example</h3>

The following example shows how to run a simple MetFrag query in R.

 #first define the settings object
 settingsObject<-list()
 #set database parameters to select candidates
 settingsObject[["DatabaseSearchRelativeMassDeviation"]]<-5.0
 settingsObject[["FragmentPeakMatchAbsoluteMassDeviation"]]<-0.001
 settingsObject[["FragmentPeakMatchRelativeMassDeviation"]]<-5.0
 settingsObject[["MetFragDatabaseType"]]<-"PubChem"
 #the more information about the precurosr is available
 #the more precise is the candidate selection
 settingsObject[["NeutralPrecursorMass"]]<-253.966126
 settingsObject[["NeutralPrecursorMolecularFormula"]]<-"C7H5Cl2FN2O3"
 settingsObject[["PrecursorCompoundIDs"]]<-c("50465", "57010914", "56974741", "88419651", "23354334")
 #define the peaklist as 2-dimensional matrix
 settingsObject[["PeakList"]]<-matrix(c(
 90.97445, 681,
 106.94476, 274,
 110.02750, 110,
 115.98965, 95,
 117.98540, 384,
 124.93547, 613,
 124.99015, 146,
 125.99793, 207,
 133.95592, 777,
 143.98846, 478,
 144.99625, 352,
 146.00410, 999,
 151.94641, 962,
 160.96668, 387,
 163.00682, 782,
 172.99055, 17,
 178.95724, 678,
 178.97725, 391,
 180.97293, 999,
 196.96778, 720,
 208.96780, 999,
 236.96245, 999,
 254.97312, 999), ncol=2, byrow=TRUE)
 #run MetFrag
 scored.candidates<-run.metfrag(settingsObject)
 #scored.candidates is a data.frame with scores and candidate properties 

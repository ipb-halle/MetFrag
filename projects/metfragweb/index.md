---
layout: main
title: project
nav:
  about: active
---

### MetFrag Web
<a class="btn btn-primary" href="https://msbi.ipb-halle.de/MetFrag/" role="button">MetFrag Web tool</a> 
<a class="btn btn-primary" href="https://msbi.ipb-halle.de/MetFrag/landing.xhtml?NeutralPrecursorMass=272.06847&FragmentPeakMatchAbsoluteMassDeviation=0.01&FragmentPeakMatchRelativeMassDeviation=10&DatabaseSearchRelativeMassDeviation=10&IonizedPrecursorMass=273.076&MetFragDatabaseType=KEGG&PeakList=67.019_186.967;68.998_126.366;69.036_97.117;91.054_732.733;95.050_204.264;97.029_119.880;107.051_222.102;119.050_3386.787;123.044_394.715;147.044_2275.676;153.018_10000.000;154.023_356.697" role="button">Landing Page call</a> 
<hr>
<div>
The new web tool of MetFrag uses a new fragmentation algorithm which allows faster and more efficient processing of the compounds. It has additional fields for setting parameters that depend on your experimental conditions during the MS acquisition. At first the parameters for the candidate database query have to be defined under <span style="border-bottom: 1px black dotted;">Database Settings</span>. The candidate database has to be selected which can be queried either by a monoisotopic mass, a molecular formula or comma separated database dependent identifiers. The first has to be defined together with a mass deviation in ppm. A variaty of databases can be selected including PubChem, KEGG, ChEBI and a derivatised version of the KEGG database generated by in silico TMS (trimethylsilylation) and MeOx (methoximation) derivatization.
</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image1.png">
</div>
<div style="margin-top: 20px;">
After setting the parameters for the database query the "Retrieve Candidates" button can be pushed to submit the database query.
</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image2.png">
</div>
<div style="margin-top: 20px;">
After a short processing time the number of candidates found in the database with the defined filter criteria is displayed. The next step is to define parameters for the MetFrag processing under the <span style="border-bottom: 1px black dotted;">Fragmentation Settings & Processing</span>.</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image3.png">
</div>
<div style="margin-top: 20px;">This includes the adduct type of the precursor ion. Based on this fragment massed will be calculated. Additionally, the a relative and absolute mass deviation has to be defined with which <span style="font-style: italic;">in silico</span> generated fragments will be mapped to the experimental data defined in the "MS/MS Peak list" text field. After all parameters are defined correctly, the button "Process Candidates" has to be pushed to start the processing.<br> 
MetFrag then starts the <span style="font-style: italic;">in silico</span> fragmentation, the mapping of the fragments to the given mass peaks and the scoring for each retrieved
candidates.</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image4.png">
</div>
<div style="margin-top: 20px;">After processing has finished successfully, the score ranked list of candidates will be displayed. Each row in this list includes the candidate image, identifier (database link), exact mass, molecualr formula, score and number of explained together with more details about fragments and scores for each candiate.</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image5.png">
</div>
<div style="margin-top: 20px;">The fragments view shows the assigned fragments for a specific candidate of the list. The substructure from which the fragment was created is highlighted in green color. Each fragment can be viewed by scrolling through the list or by clicking on the apex of an explained peak (green highlighted). With clicking on the peak apex the fragment will be displayed automatically.</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image6.png">
</div>
<div style="margin-top: 20px;">A new feature of the new MetFrag web tool includes the inclusion of additonal candidate filters and scoring terms. This includes candidate filtering by given substructures or by elemental composition or adding several scoring terms by which candidates will be ranked. This includes e.g. scoring by spectral similarity or retention time.</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image7.png">
</div>
<div style="margin-top: 20px;">Besides predifined scoring terms, there are also database scoring terms depending on the specified database. PubChem includes PubMed references and patent information that can be used as scoring term. Scoring terms can also be defined by uploaded CSV or SDF files.</div>
<div style="padding: 20px">
<img width="75%" height="75%" src="/MetFrag/images/metfragwebbeta/image8.png">
</div>
### MetFrag Landing Page

The Landing page can save the tedious cut+paste experience. All parameters are passed as part of the URL, 
everything else done in the browser. This allows to link to a query, and even to launch a MetFrag query from another application:

[https://msbi.ipb-halle.de/MetFrag/landing.xhtml?NeutralPrecursorMass=272.06847&FragmentPeakMatchAbsoluteMassDeviation=0.01&FragmentPeakMatchRelativeMassDeviation=10&DatabaseSearchRelativeMassDeviation=10&IonizedPrecursorMass=273.076&MetFragDatabaseType=KEGG&PeakList=67.019_186.967;68.998_126.366;69.036_97.117;91.054_732.733;95.050_204.264;97.029_119.880;107.051_222.102;119.050_3386.787;123.044_394.715;147.044_2275.676;153.018_10000.000;154.023_356.697](https://msbi.ipb-halle.de/MetFrag/landing.xhtml?NeutralPrecursorMass=272.06847&FragmentPeakMatchAbsoluteMassDeviation=0.01&FragmentPeakMatchRelativeMassDeviation=10&DatabaseSearchRelativeMassDeviation=10&IonizedPrecursorMass=273.076&MetFragDatabaseType=KEGG&PeakList=67.019_186.967;68.998_126.366;69.036_97.117;91.054_732.733;95.050_204.264;97.029_119.880;107.051_222.102;119.050_3386.787;123.044_394.715;147.044_2275.676;153.018_10000.000;154.023_356.697)

[https://msbi.ipb-halle.de/MetFrag/landing.xhtml?NeutralPrecursorMass=415.3086&NeutralPrecursorMolecularFormula=C26H41NO3&FragmentPeakMatchAbsoluteMassDeviation=0.01&FragmentPeakMatchRelativeMassDeviation=10&DatabaseSearchRelativeMassDeviation=10&MetFragDatabaseType=PubChem&PeakList=121.0650_265;121.1012_239;127.1120_543;159.0823_267;159.1171_1237;171.1173_375;173.0962_535;173.1322_623;182.1175_663;185.0960_393;187.1121_941;187.1481_2427;189.1639_973;190.1227_612;194.1540_703;196.1337_515;197.1329_1267;201.1270_461;201.1636_1052;203.1788_1377;208.1330_13841;211.1112_804;211.1478_663;213.1271_940;213.1635_544;215.1431_15109;216.1865_4133;225.1272_1835;225.1640_731;227.1421_1065;227.1792_1493;229.1593_965;239.1425_807;239.1793_1009;241.1948_2240;243.2110_884;249.1654_571;253.1584_2228;267.1741_2833;267.2105_829;281.1892_760;289.2031_1331;290.2111_9046;295.2418_2769;302.2111_1276;304.2267_856;323.2366_9151;328.2267_497;342.2430_832;398.3048_11501
](https://msbi.ipb-halle.de/MetFrag/landing.xhtml?NeutralPrecursorMass=415.3086&NeutralPrecursorMolecularFormula=C26H41NO3&FragmentPeakMatchAbsoluteMassDeviation=0.01&FragmentPeakMatchRelativeMassDeviation=10&DatabaseSearchRelativeMassDeviation=10&MetFragDatabaseType=PubChem&PeakList=121.0650_265;121.1012_239;127.1120_543;159.0823_267;159.1171_1237;171.1173_375;173.0962_535;173.1322_623;182.1175_663;185.0960_393;187.1121_941;187.1481_2427;189.1639_973;190.1227_612;194.1540_703;196.1337_515;197.1329_1267;201.1270_461;201.1636_1052;203.1788_1377;208.1330_13841;211.1112_804;211.1478_663;213.1271_940;213.1635_544;215.1431_15109;216.1865_4133;225.1272_1835;225.1640_731;227.1421_1065;227.1792_1493;229.1593_965;239.1425_807;239.1793_1009;241.1948_2240;243.2110_884;249.1654_571;253.1584_2228;267.1741_2833;267.2105_829;281.1892_760;289.2031_1331;290.2111_9046;295.2418_2769;302.2111_1276;304.2267_856;323.2366_9151;328.2267_497;342.2430_832;398.3048_11501
)


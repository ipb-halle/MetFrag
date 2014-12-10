---
layout: main
title: project
nav:
  about: active
---

### MetFrag Web
<a class="btn btn-primary" href="http://msbi.ipb-halle.de/MetFrag" role="button">MetFrag Web tool</a> 
<hr>

The web tool of MetFrag has several fields for setting parameters that depend on your experimental conditions during the MS acquisition. At first the parameters for the 
structure database query have to be defined under <span style="border-bottom: 1px black dotted;">Database Settings</span>. The structure database has to be selected that can be queried either by 
a monoisotopic mass, a molecular formula or comma separated database dependent identifiers. The first has to be defined together with a mass deviation in ppm.

<div>
<img width="75%" height="75%" src="/MetFrag/images/metfragweb/metfrag1_commented.png">
</div>

After setting the parameters for the database query the "Search upstream DB" button can be pushed to submit the database query.
<div>
<img width="75%" height="75%" src="/MetFrag/images/metfragweb/metfrag1_dbsearch.png">
</div>
After a short processing time the number of candidates found in the database with the defined filter criteria is displayed.
<div>
<img width="75%" height="75%" src="/MetFrag/images/metfragweb/metfrag2_commented.png">
</div>
Then the parameters for MetFrag processing have to be defined under the <span style="border-bottom: 1px black dotted;">MetFrag Settings</span>. This includes the ionisation mode as together 
with the charge the data has been acquired. Additionally, the a relative and absolute mass deviation has to be defined with which <span style="font-style: italic;">in silico</span> generated
fragments will be mapped to the experimental data defined in the "Peaks" text field. After all parameters are defined correctly, the button "Process all x compounds! START" has to be pushed to start
the processing. 
<div>
<img width="75%" height="75%" src="/MetFrag/images/metfragweb/metfrag2_process.png">
</div>
Then MetFrag starts the <span style="font-style: italic;">in silico</span> fragmentation, the mapping of the fragments to the given mass peaks and the scoring for each retrieved
candidate, respectively. Finally, the score ranked list of candidates will be displayed after the processing has finshed successfully. Each row in this list includes the score, number of explained
peaks, name, molecular formula, monoisotopic mass, image and database identifier of the candiate. Additionally, in the last column links are given to download or display the fragments
assigned to the given mass peaks for specific candidate. The database identifier is a external link to the entry of the selected database.
<div>
<img width="75%" height="75%" src="/MetFrag/images/metfragweb/metfrag3_commented.png">
</div>
<div style="padding-bottom:10px">The fragments view shows the assigned fragments for a specific candidate of the list.</div>
<div>
<img width="75%" height="75%" src="/MetFrag/images/metfragweb/metfrag4.png">
</div>

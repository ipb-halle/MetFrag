---
layout: main
title: project
nav:
  about: active
---

### Commandline Tool

MetFrag can be used from the commandline of your local computer.

<a class="btn btn-primary" href="https://github.com/c-ruttkies/Tools" role="button">MetFragCL on github</a> <a class="btn btn-primary" href="https://github.com/c-ruttkies/Tools/issues"
role="button">Submit an issue</a>

<hr>

<h3>Usage</h3>
After downloading the executable jar MetFrag can generally be run by
<div class="code">
  # java -jar MetFragCommandLineTool.jar [parameters]
</div>
<p><p>
<h4>First run</h4>
MetFragCL needs a <span style="font-weight:bold">query file (-D)</span> of specific layout as input, <span style="font-weight:bold">the monoisotopic mass of the precursor (-n)</span> and 
<span style="font-weight:bold">the name of the sample (-S)</span>. This query file contains the mass-to-charge (m/z) and intensity values and as option several additional parameters that 
can also be given on the commandline. An example of a query input file can be displayed by typing
<p>
<div class="code">
  # java -jar MetFragCommandLineTool.jar -e
</div>
<p><p>
The output looks as follows with additional //-marked comments:
<div class="code">
  <table>
  <tr><td># Sample: Naringenin</td><td>//name of the sample (result files will be named accordingly)</td></tr>
  <tr><td># ID: C06561,C00509,C16232</td><td>//database dependent (here: KEGG) compound ids (will be used for database query)</td></tr>
  <tr><td># Parent Mass: 272.06847</td><td>//Monoisotopic precursor mass</td></tr>
  <tr><td># Search PPM: 10</td><td>//Relative mass deviation for database querying</td></tr>
  <tr><td># Mode: 3</td><td>//Ionisation mode of MS instrument (1->[M-H] 2->[M] 3->[M+H])</td></tr>
 <tr><td> # Charge: 1</td><td>//Charge of precursor ion (1->+ 2->-)</td></tr>
  <tr><td>119.051 467.616</td><td>//Start of peaklist table (m/z intensity)</td></tr>
 <tr><td> 123.044 370.662</td><td></td></tr>
  <tr><td>147.044 6078.145</td><td></td></tr>
 <tr><td> 153.019 10000.0</td><td></td></tr>
 <tr><td> 179.036 141.192</td><td></td></tr>
  <tr><td>189.058 176.358</td><td></td></tr>
 <tr><td> 273.076 10000.000</td><td></td></tr>
 <tr><td> 274.083 318.003</td><td></td></tr>
  </table>
</div>
<p><p>
A first example run can be 
<div class="code">
  # java -jar MetFragCommandLineTool.jar -D example.mf -n 272.06847 -S Naringenin
</div>
<p><p>
where parameters given on the commandline overwrite parameters given in the query file. Parameters defined in the query file do not need to be given additionally on the commandline.
<p><p>
<h4>Databases</h4>
There are different databases available that can be queried for candidate molecules (-d)<p>
<ul>
<il>KEGG</il><br>
<il>PubChem</il><br>
<il>ChemSpider (only available with a valid token)</il><br>
<il>Local SDF file</il><br>
</ul>
The KEGG, PubChem and ChemSpider databases are queried either by <span style="font-weight:bold">database dependent compound ids (-i)</span>, <span style="font-weight:bold">molecular formula (-f)</span> or 
<span style="font-weight:bold">monoisotopic mass (-n) together with a relative mass deviation (-s)</span> in the given order if more than one is defined. 
<p><p>
<h4>Help</h4>
All available parameters can be displayed by<p>
<div class="code">
  # java -jar MetFragCommandLineTool.jar -h
</div>
<p><p>
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
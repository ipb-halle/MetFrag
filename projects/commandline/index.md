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
  # java -jar MetFragCommandLineTool.jar -h<br>
  usage: java -jar metfrag.jar [options] [args]<br>
<br>
  Available options:<br>
  <table>
   <tr><td>-M,--mode</td><td>                mode used for measured ms/ms spectrum:</td></tr>
      <tr><td>                          </td><td> 3       ->     [M + H]</td></tr>
     <tr><td>                           </td><td> 2       ->     [M]</td></tr>
     <tr><td>                           </td><td> 1       ->     [M - H]</td></tr>
      <tr><td>                          </td><td> (default: 3)</td></tr>
   <tr><td>-C,--charge                  </td><td> charge used in combination with mode (-M):</td></tr>
     <tr><td>                           </td><td> 1       ->     positive</td></tr>
     <tr><td>                          </td><td>  2       ->     negative</td></tr>
      <tr><td>                          </td><td> (default: 1)</td></tr>
   <tr><td>-r,--range                   </td><td> range of candidates that will be processed: N (first N), M-N (from M to N), M- (from M), -N (till N); if N is greater than the</td></tr>
     <tr><td>                           </td><td> number of candidates it will be set accordingly</td></tr>
   <tr><td>-n,--exactmass               </td><td> neutral mass of measured compound used for candidate search in database (-d) (mandatory)</td></tr>
   <tr><td>-l,--localdb                 </td><td> use a local database together with a settings file for candidate search (default: not used) note: only usable if pubchem database is selected (-d)</td></tr>
  <tr><td> -i,--databaseids             </td><td> database ids of compounds used for in silico fragmentation (separated by ,) (not used by default; not used if sdf database is selected (-d)) note: given ids must be valid ids of given database (-d)</td></tr>
   <tr><td>-c,--chemspidertoken         </td><td> Token for ChemSpider database search (not used by default; only necessary (mandatory) if ChemSpider database (-d) is selected)</td></tr>
  <tr><td> -L,--sdffile                 </td><td> location of the local sdf file (mandatory if sdf database (-d) is selected)</td></tr>
   <tr><td>-s,--searchppm              </td><td>  relative (ppm) mass deviation used for candidate search in given compound database (-d) (default: 10; not used by default if sdf database is selected (-d))</td></tr>
  <tr><td> -f,--formula                 </td><td> molecular formula of measured compound used for candidate search in database (-d) (not used by default; not used if sdf database is selected (-d))</td></tr>
  <tr><td> -B,--breakrings              </td><td> allow splitting of aromatic rings of candidate structures during in silico fragmentation (not used by default)</td></tr>
 <tr><td>  -D,--spectrumfile            </td><td> file containing peak data (mandatory) note: commandline options overwrite parameters given in the spectrum data file</td></tr>
  <tr><td> -F,--storefragments          </td><td> store in silico generated fragments of candidate molecules (not used by default)</td></tr>
 <tr><td>  -P,--saveparameters          </td><td> save used parameters (not used by default)</td></tr>
 <tr><td>  -R,--resultspath             </td><td> directory where result files are stored (default: /tmp)</td></tr>
 <tr><td>  -S,--samplename              </td><td> name of the sample measured (mandatory) note: result files are stored with given value</td></tr>
<tr><td>   -T,--threads                </td><td>  number of threads used for fragment calculation (default: number of available cpu cores)</td></tr>
 <tr><td>  -a,--mzabs                  </td><td>  allowed absolute (Da) mass deviation of fragment and peak masses (default: 0.01)</td></tr>
 <tr><td>  -b,--biological             </td><td>  only consider compounds including CHNOPS atoms (not used by default)</td></tr>
 <tr><td>  -d,--database                </td><td> database: kegg, pubchem, sdf, chemspider (default: kegg)</td></tr>
 <tr><td>  -e,--printexamplespecfile    </td><td> print an example spectrum data file (not used by default)</td></tr>
 <tr><td>  -h,--help                    </td><td> print help</td></tr>
 <tr><td>  -p,--mzppm                   </td><td> allowed relative (ppm) mass deviation of fragment and peak masses (default: 10)</td></tr>
 <tr><td>  -t,--treedepth               </td><td> treedepth used for in silico fragmentation (default: 2) note: high values result in high computation time</td></tr>
 <tr><td>  -v,--verbose                  </td><td>get more output information during the processing (not used by default)</td></tr>
  </table>
  example: java -jar metfrag.jar -d pubchem -D example_spectrum_file.mb -S example -R /tmp/results -n 271.2 -a 0.01 -p 10 -v -r -B<br>
  The SDF result files include scores and number of declared peaks of the candidate molecules.<br>
  For further information visit official website on http://c-ruttkies.github.io/MetFrag<br>
  Bug Reports to <cruttkie@ipb-halle.de>
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

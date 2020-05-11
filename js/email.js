<script type="text/javascript" language="javascript">
// Email obfuscator script 2.1 by Tim Williams, University of Arizona
// Random encryption key feature coded by Andrew Moulden
// This code is freeware provided these four comment lines remain intact
// A wizard to generate this code is at http://www.jottings.com/obfuscator/
{ coded = "1fvBG-LOC9@GlB-9O22f.1f"
  key = "goRZjfaw0ApnhqSbIVLsKHdJzDxY4OkPMlv93iB5QuCUe18yWt7XEcNT2m6FGr"
  shift=coded.length
  link=""
  for (i=0; i<coded.length; i++) {
    if (key.indexOf(coded.charAt(i))==-1) {
      ltr = coded.charAt(i)
      link += (ltr)
    }
    else {
      ltr = (key.indexOf(coded.charAt(i))-shift+key.length) % key.length
      link += (key.charAt(ltr))
    }
  }
document.write("<a href='mailto:"+link+"'>de.NBI Team @ IPB</a>")
}
</script><noscript>Sorry, you need Javascript on to email me.</noscript>

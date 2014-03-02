Examples for Chapter 7, Section 1.2
===================================
This example illustrates the use of a jBPM SubProcess. When you run the
ant target subprocess.test, it will instantiate the business
process located in the main/jpdl/main subdirectory. This is superprocess
insofar as it will also instantiate a subprocess instance (defined
in the main/jpdl/security). If you open up the main diagram in the 
Eclipse jBPM editor, you will see the subprocess identified as 
<<Process-State>>. 

The jUnit test for this can be run through ant as subprocess.test target.
It will initiate an instance of the main superprocess, and then verify
that a subprocess instance was also initiated. It will also check to
verify that the 3 variables passed to the subprocess are being
properly popualted.




Examples for Chapter 12
=======================

The examples for both chapters 11 & 12 were setup with the Drools 5.0CR1 
release. There are a lot of new features in the 5.0 release, and being
that is so near release, using this version was preferably than using
4.0.

When the 5.0 version is released, I will update the ivy scripts 
accordingly to pull down the latest version.

***
NOTE for Paul - I am going to try and standardize on 4.2.3 for everything, but
haven't tested jBPM under it yet, but will.
***

Running the Embedded Examples
-----------------------------
The examples in chapter 12 do not require Guvnor to run and test.
Instead, you can run the ant target run.embedded.test, which will
run a jUnit test. This uses the RuleFlow file called "PricingCaculator.rf".

NOTE: You can only have one ruleflow per package, so the Ant script identifies
which one to use. In Guvnor, you will need to specifically add or remove the
ruleflow you want, and then rebuild the binary package (as a convenience,
the PriceCalculatorDSL.rf is included in the import for Guvnor, but just
archived -- you can unarchive it and use it, but just archive the other). 


Running in Guvnor
-----------------

Chapter 12 covers Guvnor, the Drools BRMS. This can be downloaded, 
along with the other parts of Drools, at: http://www.jboss.org/drools/downloads.html.

To keep things simple, I would download the "Drools 5.0.0.CR1 Guvnor Standalone"
version, which comes with JBoss 4.2.3

To load the examples into Guvnor, unzip the file repository_export.zip located in
the GuvnorRepository directory. Then, within Guvnor, select the Administration
menu option, then "Import Export". In the text box for "Import for an XML file", 
use the Browse button to navigate to the unzipped XML. Import it. Then, choose
the Packages menu option, and navigate to opensoa->drools. Then, 
"Save and validate configuration", "Build Package" and export snapshot. Then, 
update your rules.properties file accordingly, to reflect the URL.

NOTE: If you want to refresh your repository, stop JBoss, and navigate to the 
$JBOSS_HOME/bin directory. Remove the directory called "repository", and restart
JBoss.

Running the Rule Service
-----------------------------
To run the rules service examples, do the following:

1. Start the PojoCache Server. This is used to transmit data to the Drools
   working memory. To start the PojoCache Server:
      a. Open up a command window and navigate to this directory.
      b. Run "ant pojoServer".
      
2. 
Examples for Chapter 11, Section 11.7
=====================================
This example demonstrates some of the RuleFlow
functionality. 

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run ant target "run.test" through the command window (or 
   through Eclipse, which in this case is fine).  
   
Please look at section 11.7 in the book for a more 
detailed explanation.

NOTE: If you are using the 4.x Drools Eclipse plugin to create a ruleflow, 
      please note that this won't compile, "as-is" under the 5.0CR1 binaries, 
      which we are using in these examples. This is because they changed
      the namespace related to the ruleflow. For example, under 5.0, it appears as:
      
<process xmlns="http://drools.org/drools-5.0/process"
         xmlns:xs="http://www.w3.org/2001/XMLSchema-instance"
         xs:schemaLocation="http://drools.org/drools-5.0/process drools-processes-5.0.xsd"
         type="RuleFlow" name="flow" id="opensoa.drools.hellodrools" package-name="opensoa.drools.hellodrools" version="1.0"> 
         
And under 4.0:

<process xmlns="http://drools.org/drools-4.0/process"
         xmlns:xs="http://www.w3.org/2001/XMLSchema-instance"
         xs:schemaLocation="http://drools.org/drools-4.0/process drools-processes-4.0.xsd"
         type="RuleFlow" name="flow" id="opensoa.drools.hellodrools" package-name="opensoa.drools.hellodrools" version="1.0" >
         
         
So, in the compile ant target, I apply an XSLT to convert the 4.0 to 5.0. 

If you are running the 5.0 plugin version, the first time through you will need to update the ruleflow process element
to correspond to what I show above. The easiest way to accomplish this is to run ant compile, then copy the *.rf file
that exists in target/classes back to src/main/rules. Then, comment out the following in the ant build.xml file:

		<xslt basedir="src\main\rules" destdir="target\classes"
			  includes="**\*.rf"
			  extension=".rf"
		      style="src\main\resources\Convert40To50.xslt">
			  <outputproperty name="method" value="xml"/>
			  <outputproperty name="standalone" value="yes"/>
			  <outputproperty name="encoding" value="iso8859_1"/>
			  <outputproperty name="indent" value="yes"/>

        </xslt>		
        



INSTRUCTIONS FOR CHAPTER 9 SAMPLES
==================================
Chapter 9 introduces Apache Synapse. For a normal Synapse installation, you
can download and install from: http://synapse.apache.org/. Then, to run
the samples, you can copy over the definitions found in the src/definitions
folder to $SYNAPSE_HOME/repository/conf/sample directory. Then, to launch
a specific example, you could then start Synapse with the sample you want to 
run by using "synapse.[bat|sh] opensoa_<sample #>". So, for example, to run
the first sample in Windows, you'd use "synapse.bat opensoa_1", which will
use the definition called synapse_sample_opensoa_1.xml.

To eliminate the need to seperately download Synapse, we've set it up
so that you can run it directly through Ant using the libraries already
downloaded for this workspace. To start up Synapse through ant, you can 
launch Synapse using one of the example ant targets. So, to start
Synapse using the first example's definition (synapse_sample_opensoa_1.xml), 
you would run "ant run.example.1". This will launch the Syanpse server.

NOTE: I recommend NOT running this ant target through Eclipse directly 
(i.e., the Ant view), but instead run it from a command console. The  
reason being is that, even when you indicate to stop the ant target in 
Eclipse, the Java process for Synapse does not actually stop, for some reason
(at least on my instance -- I had to resort to killing via Task Manager
on Windows).

For testing, we have setup a soapUI project that you can import. It's found
in the soapUI subdirectory. This assumes that you have soapUI installed
locally. If you don't, you can still run soapUI using the ant target
run.soapui.gui -- We've included the soapUI libraries into the workspace.
If running through the GUI, you would import the project file located in the
soapUI subdirectory.

You can either submit requests manually through soapUI, or, instead, run
an automated test using soapUI via the ant targets that start with the
prefix test.example.* (the isn't test.example.1 or 2, since there are no
SOAP response received for for those samples). For example, to run 
sample 3's automated test, you would:

1) Start Synapse from a command console using "ant run.example.1".
2) Run the ant target "test.example.3" (this can be run through 
   Eclipse or from a command winoow).
   
BOOK EXAMPLE/CODE CROSS-REFERENCE 
-------------------------------------------
Listing 9.1 -> synapse_sample_opensoa_1.xml, URL: http://localhost:8280/CreateOrderService
Listing 9.2 -> synapse_sample_opensoa_2.xml, URL: http://localhost:8280/CreateOrderService
Listing 9.3 -> synapse_sample_opensoa_3.xml, URL: http://localhost:8280/soap/CreateOrderService
Listing 9.4 -> synapse_sample_opensoa_4.xml, URL: http://localhost:8280/soap/CreateOrderService
Listing 9.5 -> synapse_sample_opensoa_5.xml, URL: http://localhost:8280/soap/CreateOrderService

NOTE: If you want to read about how the tests were created using soapUI, please 
      refer to their reference documentation found at: 
      http://www.soapui.org/userguide/index.html. Look under the section
      titled "Functional Testing of Web Service".
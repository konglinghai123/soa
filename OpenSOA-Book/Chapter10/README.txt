
INSTRUCTIONS FOR CHAPTER 10 SAMPLES
==================================
Please see the README.txt from chapter 9. It contains detailed instructions
on setting up/running the examples.

NOTE: Instead of restarting the number sequence, I resumed the number
      from where we left off in chapter 9. The reason being is, that way,
      if you want to run them all through a standalone instance of Synapse,
      the files won't over-write each other.

Example's 8 & 9 require ActiveMQ to be running on your box, so you will need to have
      that in order to run all these examples since they all use the same axis2.xml
      file. Or, you can comment out the JMS section in the axis2.xml file 
      (located under repository/conf). No special configuration
      is required when running ActiveMQ -- just launch it. You can monitor the
      ActiveMQ queue using it's web console at:  
      	http://localhost:8161/admin/. 
      Note: You will receive no response for Example 7, but should in chapter 8.
      
Example 13 (synapse_sample_opensoa_12.xml) requires SMTP. In order to run,
	  you will need to update your axis2.xml per the instructions found in:
	  http://synapse.apache.org/Synapse_Samples_Setup.html#mailsender. To 
	  test, I suggest simply getting Apache James and running it locally.
	  
      
BOOK EXAMPLE/CODE CROSS-REFERENCE 
-------------------------------------------
Listing 10.1 -> synapse_sample_opensoa_06.xml, URL: http://localhost:8280/soap/CreateOrderService

Section 10.2.3 -> synapse_sample_opensoa_07.xml, URL: http://localhost:8280/soap/CreateOrderService

Section 10.2.4 -> synapse_sample_opensoa_08.xml, URL: http://localhost:8280/soap/CreateOrderService
    (This won't return a response, but you can see message waiting in activmq console)
    
Section 10.2.5 -> synapse_sample_opensoa_09.xml, URL: http://localhost:8280/soap/CreateOrderService
   (This should return a a response if activemq is properly configured)
   
Section 10.2.5 -> synapse_sample_opensoa_10.xml, URL: http://localhost:8280/soap/CreateOrderService   
   (This example uses WSDL to capture JMS port details)
   
Section 10.3 -> synapse_sample_opensoa_11.xml, FILE DROP 
   (This example uses VFS to read a SOAP document from the filesystem. Please update 
   synapse_sample_opensoa_11.xml to point to your proper directory location). I couldn't figure
   out how to get relative path names to work :-(. When configured, copy the order.xml file from
   the samples directory into the in directory you specified. Search for "file" within the xml
   to locate the places you'll need to update. In run successfully, the out folder specified 
   will contain the results.
   
** NOTE: THE REMAINING CHAPTERS ALSO REQUIRE THE VFS SETTINGS BE CONFIGURED **   
   
Section 10.3.2 -> synapse_sample_opensoa_12.xml, FILE DROP  
   (This example is nearly identical to the above, but you are using a CSV file. You'll have to update
   synapse_sample_opensoa_13.xml in a similar way, but this time, use the CSVOrder.csv file in the 
   samples directory).
   
Section 10.3.3 -> synapse_sample_opensoa_13.xml, FILE DROP  
   (This example is pretty much identical to the above, but configures an email message
    to be sent if a processing error occurs.).
      
Section 10.3.4 -> synapse_sample_opensoa_14.xml, FILE DROP  
   (Same as last, but will clone a message and send to a phony Esper service).
   
Section 10.3.4 -> synapse_sample_opensoa_15.xml, FILE DROP  
   (Expands the use of the wire-tap, or clone EIP).
      
Section 10.3.4 -> synapse_sample_opensoa_16.xml, FILE DROP  
   (Sample as last example, but splits about the sequences and makes them
   more modular through the use of the switch mediator -- see esper.xml in the 
   repository/conf/resources/sequences directory). 
   
Section 10.4.1 -> synapse_sample_opensoa_17.xml, TIMER INVOKED
   (Demonstrates use of the task/timer mediator to initiate an action. 
   In this simple case, doesn't do much but just print out the message
   that was initiated through the timer.).  
    
Section 10.4.2 -> synapse_sample_opensoa_18.xml, TIMER INVOKED 
   (Illustrates use of the iterator mediator used to split apart a message. Inbound
   message is invoked via a task timer mediator).
   
Section 10.4.3 -> synapse_sample_opensoa_19.xml
   (Illustrates use of the DB mediator. Currently this requires you to launch a 
   Derby network server database and then load the script in the src/db directory. 
   See: http://db.apache.org/derby/papers/DerbyTut/ns_intro.html. I will be updating 
   so that this can be done automatically.).
   
Section 10.5.1 -> synapse_sample_opensoa_20.xml. 
   (Use "Example20" in soapUI project to test this example of using WS-Security
   with Synapse. In soapUI's properties panel, you can turn off security to
   see what the impact is.). 
   
Section 10.5.2 -> synapse_sample_opensoa_21.xml. http://localhost:8280/soap/TestWSSecurityService
   (Use "Example20UsesWSSecurity" in soapUI project to test this example of using WS-Security
   with Synapse. In soapUI's properties panel, you can turn off security to
   see what the impact is.). 
     
Section 10.5.3 -> synapse_sample_opensoa_21.xml.    
   (Illustrates the use of Synapse throttling support. In order to test this, you will
   need to modify the /repository/conf/opensoa/resources/policy/throttle_policy.xml
   and follow the instructions provided in the book. The endpoint URL is:
   http://localhost:8280/soap/ThrottledProxy).
   
   
****************
HOW TO RUN EXAMPLE:
****************
To run example 6, which corresponds to listing 10.1 in the book, you would:

1) From a command console, run "ant run.example.06" to start the Synapse server.

2) From within Eclipse Ant View mode or from the command line, run the automated
   test using test.example.06.
   
   

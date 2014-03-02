Examples for Chapter 8, Section 7
=================================

This example illustrates how an Esper web service can be used to capture
inbound events. It uses Apache Tuscany, the topic of chapters 3 & 4,
for service enablement. In this example, we use SOAP as the binding, but
any of the supported Tuscany bindings can be used. 

To run the example:

1) Run the ant target esper.main. This will start the embedded Tuscany 
   engine, which, in turn, starts up an Esper instance. 
   
2) Test requests can be submitted wither through the ant target jbpm.client, 
   which is a SCA client used to submit requests, or
  
3) (optional) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-04.1" 
   for testing.


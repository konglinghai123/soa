Examples for Chapter 3, Section 2.2
===================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run "ant problem.ticket.server" to run the domain which hosts the 
   ProblemTicketService. This will launch an embedded Tuscany instance
   which is configured to accept inbound SOAP requests. 
   
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-03.2.2" 
   for testing.
   
Note: The WSDL for the running Tuscany services is: 
	http://localhost:8085/ProblemTicketService?wsdl
   
   

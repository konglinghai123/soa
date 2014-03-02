Examples for Chapter 4, Section 4.2
===================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-04.4.2" 
   for testing.
   
This example demonstrates using Service Data Objects, or SDO, as the binding
technology use for working with more complex data objects. See the book
for more details on SDO.

Notice that the WSDL used for testing has changed, as the problem ticket 
XSD is more rich in format. Be sure to use the soapUI project associated
with this project. Also, you can also see the console logs the 
inbound XML being logged via log4j. 
   

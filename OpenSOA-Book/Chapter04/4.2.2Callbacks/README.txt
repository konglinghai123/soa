Examples for Chapter 4, Section 2.2
===================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-04.2.2" 
   for testing.
   
This example demonstrates the use of callbacks. The EventNotificationComponentImpl 
will receive an asynchronous call from the CreateTicketComponentImpl class. After
a brief simulated delay, the EventNotificationComponentImpl class will invoke 
the success method belonging to the calling client (CreateTicketComponentImpl).

To run this example, start the ProblemTicketService (ant problem.ticket.server), then
use the soapUI project to initiate SOAP requests.

   

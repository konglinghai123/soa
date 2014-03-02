Examples for Chapter 4, Section 2.1
===================================
To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-04.2.1" 
   for testing.
   
This section demonstrates the use of conversations. In this example,
the SessionManagementImpl class is initiated when the SCA domain is run, 
and it keeps, as an instance variable, a sessionId. Subsequent 
calls will continue to use that sessionId. This is an example of a 
COMPOSITE scoped class, as it persists as long as the composite within
that domain is running.

To test this, start the ProblemTicketService using "ant problem.ticket.server",
then use the soapUI project to issue SOAP requests. You'll notice
in the Java log associated with the "ant problem.ticket.server" a 
recurring log entry such as:
   
createTicket sessionManager: 92309

The same sessionId should be present for each SOAP request that is made.


   

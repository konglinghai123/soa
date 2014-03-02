Examples for Chapter 3, Section 2.5
===================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-03.2.5" 
   for testing.
   
   
The take-away from 3.2.5 is how you can create higher-level compositions
by referencing lower-level compositions as a single component. In this
case, the composition assembly defined in issueMgmt.composite references
the service exposed by problemMgmt.composite.

Note that, when we start up issueMgmt.composite, it will automatically 
start the services in problemMgmt.composite, since it references it.
Because of this, since two embedded jetty servers can't use the same
port address, I changed the ProblemTicketService to run under 8086.

The new "higher-level" service for reporting system-related errors/issues 
can be found at: http://localhost:8085/SystemErrorService?wsdl. You 
still can start it using "ant problem.ticket.server". 





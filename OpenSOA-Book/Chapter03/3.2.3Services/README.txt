Examples for Chapter 3, Section 2.3
===================================
To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-03.2.3" 
   for testing.
   
The key thing to take away from 3.3.3 is that you can control
which services are exposed by way of the interface.java or 
interface.wsdl. In this example, ProblemTicketComponentImpl actually
implements ProblemTicketComponent2, which specifies 2 operations.
However, in the problemMgmt.composite file, we explicitly
specify a  service interface, ProblemTicketComponent, which has only
1 operation specified. In the previous examples, we did not
specify a service interface in the composite.

You can see the services defined by interrogating the WSDL, in this
example, it is: http://localhost:8085/ProblemTicketService?wsdl.
If you remove the service interface tag so that the service element
is defined as:

	<service name="ProblemTicketComponent"
		promote="ProblemTicketComponent">
		<binding.ws uri="http://localhost:8085/ProblemTicketService" />
	</service>
	
An again run the server, you'll see 2 operations specified instead
of just the one.




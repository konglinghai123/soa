Examples for Chapter 3, Section 2.6
===================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant system.error.server to run the domain which hosts the 
   SystemErrorService.
   
3) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
4) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-03.2.6" 
   for testing.
   
References are the topic for section 3.2.6. The only change made between
this and the code shown in section 3.2.5 is that I am now referring the
reference at the global level within the issueMgmt.composite file:

NEW:

	<reference name="ProblemTicket
		promote="SystemErrorComponent/problemTicket">
		<binding.ws uri="http://localhost:8086/ProblemTicketService" />
	</reference>
	
When the reference is specified globally, you don't need to 
directly reference it within the component:

	<component name="SystemErrorComponent">
		<implementation.java
			class="opensoa.book.chapter3.impl.SystemErrorComponentImpl" />
	</component>

Also illustrated was how to use a web service binding instead of using an
implementation.composite. This was shown in listing 3.12. To run this example,
you need to start the domain associated with the ProblemTicketService and the
domain associated with IssueManagementService. So, run both of these ant targets 
in separate command windows (you must navigate to this subdirectory location):

ant problem.ticket.server
ant system.error.server



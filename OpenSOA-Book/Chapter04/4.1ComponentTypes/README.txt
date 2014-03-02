Examples for Chapter 4, Section 1
=================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-04.1" 
   for testing.
   
This example demonstrates how to use ComponentTypes instead of Java
annotations. It is functionally equivalent to the example code
found in 3.2.4, but the annotations were removed for 
ProblemTicketComponentImplNA and a corresponding .componentType 
file was created under the resources directory. Notice that it
has uses the same directory structure as the Java package (this
is required).


   

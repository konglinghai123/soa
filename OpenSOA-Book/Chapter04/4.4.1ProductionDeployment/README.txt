Examples for Chapter 4, Section 4.1
===================================
To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run "ant compile" to generate a war file within the target directory.
   Copy this file to the Tomcat 5.5 webapps directory. Start Tomcat.
  
3) Test to verify that it's working properly by issue a soapUI request
   using the ProblemTicketComponentSOAP11Binding.  It should return 
   back a result with no error.
   
4) Run the "ant problem.ticket.server" to run the domain which, in this
   case, is running the IssueManagementComposite, which contains a remote
   reference to the ProblemTicketService deployed under Tomcat.
   
5) Test to verify that it's working properly by issue a soapUI request
   using the SystemErrorComponentSOAP11Binding.  It should return 
   back a result with no error. If a value response is returned, that 
   means that the request was received in the local Jetty domain and 
   forwarded, by way of a reference, to the domain running under Tomcat.
   
The purpose of this exercise is really twofold:

1) Describes how to deploy a domain within a web application server, 
   in this case Tomcat 5.5
   
2) Describes how to configure a distributed domain.



   

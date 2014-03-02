Examples for Chapter 3, Section 2.7
===================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
   
3) Test using the ant target "jms.client".
   
ACTIVEMQ
========

The examples for 3.2.7 assume that you have an ActiveMQ instance running 
locally on your machine. If you need to download it, you can get it
from the apache.org web site. Then, simply unzip/untar and run it.   

Once you have the ProblemTicketService running (step 2 above), you can
then test out the JMS functionality by running "ant jms.client". This will
invoke a JMS request to the ProblemTicketService. 



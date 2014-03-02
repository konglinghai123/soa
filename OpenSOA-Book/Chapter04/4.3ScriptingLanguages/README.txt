Examples for Chapter 4, Section 3
=================================

To run the examples, do the following:

1) Open up a command window and change directory to this location.

2) Run the ant problem.ticket.server to run the domain which hosts the 
   ProblemTicketService.
      
3) You can test using soapUI. Run the ant target "run.soapui.gui". This 
   will launch soapUI, and you can use the project called "OpenSoa-04.3" 
   for testing.
   
This example explores the use of scripting languages, specifically Ruby. 
A Ruby email sender script is used to send out an email confirmation
following the hypothetical creation of the a case. 

See the Email.componentType file for changing your SMTP username/password. 
In order for the email to send properly, you'll have to configure an SMTP
account for a public service such as Google's email, or use a local
SMTP server such as Apache James. 

   

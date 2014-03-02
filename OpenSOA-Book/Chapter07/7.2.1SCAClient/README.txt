Examples for Chapter 7, Section 2.1
===================================
This example illustrates how an SCA client can be used to call a
remote web service from within a jBPM process. The jUnit
test SCAClientSOAPTest.java is invoked when the ant target
clientSCA.test is run (I'd recommend looking at it).

Since the example simulates running a web service call against
a remote service, there are two steps involved in running
the exmaple:

1) Open run "ant problem.ticket.server" to start the sample web 
   service that will be called by the jBPM Node.
   
2) In another window (or in Eclipse, you can just run as
   target through ant view), run "ant clientSCA.test". This
   will run the jUnit test. 
   
If you like, after starting the server, you can also just
run the ant target "soap.client", which will send a 
test request to the running web service.


   
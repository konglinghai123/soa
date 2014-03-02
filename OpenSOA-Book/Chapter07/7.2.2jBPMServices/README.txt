Examples for Chapter 7, Section 2.2
===================================
This example demonstrates how a jBPM functionality can be exposed
through web services using Apache Tuscany. The example is meant
as a starting point, and by no means has been throughly tested
or completed (that may be something I pursue when I have some 
chance in the summer of 09). The intention is to enable you to
see how jBPM and Tuscany can work together to form a powerful
force.

To keep things as straightforward as possible, I have created the
examples so that they can be run stand-alone without requiring 
jBPM Enterprise (Console) to be running. However, we still do need
a server database running so that both the Tuscany process
can run while allowing you to interrogate the database to see
the results.

To run this example, follow these steps:

1. First, run the ant target "run.hsqldb.server". This will
   launch a server instance of the hsqldb database. It will
   fork and run in the background, so leave it run.
   
2. Run the ant target, IN A COMMAND WINDOW CONSOLE, the target
   drop.rebuild.hsqldb.tables. When run, you have to press return to 
   actually install the database schema (I haven't found a way
   to avoid the return, which doesn't work when running the target
   through Eclipse).
   
3. Run the ant target populate.processes. This will actually run
   the jUnit class JbpmServerTest.java, which actually loads 
   up the jBPM Context/database with several of our previous 
   business processes. This is helpful for testing.
   
4. Run the ant target run.server. This will start the Tuscany embedded
   web service. Leave running.
   
5. Lastly, run the ant target "run.soapui.gui". This will launch soapUI.
   You can run the various web service calls, which will hit the 
   Tuscany embedded web server. You can see that, exposed as web services,
   are the ability to do such things as view installed processes, 
   process instances, tasks and some other things. It's by no means
   comprehensive, but gives you a good flavor of what can be done. 


   
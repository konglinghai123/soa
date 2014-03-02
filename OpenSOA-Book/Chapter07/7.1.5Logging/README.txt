Examples for Chapter 7, Section 1.5
===================================

This example illustrates the use logging. The book covers this in some 
detail. To run the example, run the ant target logging.test. This runs
the LoggingProcessTest.java jUnit test.

Of particular note for this example is that we had to define our custom
logging handler within the jbpm.cfg.xml file, located within the 
src/main/config subdirectory. You will find this entry:

    <service name="logging" factory="org.jbpm.logging.db.CustomDbLoggingServiceFactoryCh7" />
    
This defines the custom logger, which can be found under the /src/main/java 
subdirectory.





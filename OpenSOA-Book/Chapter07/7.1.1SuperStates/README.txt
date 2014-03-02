Examples for Chapter 7, Section 1.2
===================================

This example illustrates the use of a jBPM SuperState. When you run the
ant target superstate.process.test, it will instantiate the business
process located in the main/jpdl/employeeTermination subdir. If you open that 
business process using the jBPM Eclipse plugin, you will see the 
design of the process.

The jUnit tests starts the process, and then performs some simple checks
to verify that the superstate mechanism is working. Superstates can be
identified because items within the superstate are reference by 
<superstate_name>/. For example: finance/appr timecard shown in the diagram.

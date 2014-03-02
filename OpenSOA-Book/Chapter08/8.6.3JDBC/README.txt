Examples for Chapter 8, Section 6.3
===================================

This example illustrates how JDBC calls can be integrated with standard 
Esper EQL queries. In this example, which can be run through the ant
target jdbc.test, uses an embedded hsqldb database to lookup a 
customer name based upon a customer Id that was received as part 
of an event sent to Esper. See the class ProcessStartEnd for the 
EQL statement assigned to EXAMPLE_VIEW1. 









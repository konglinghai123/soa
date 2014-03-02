Examples for Chapter 8, Section 5.1
===================================

This example demonstrates a very simple Esper query. Events
are generated against an Esper instance, with the Esper
select statements (filters) defined within the ProcessStartEnd
class. 

The jUnit test, EsperTest851, can be run through the ant
target basic.query.test. It generates 6 events, with 3 
qualifying for the statement/filter that is defined
in ProcessStartEnd.



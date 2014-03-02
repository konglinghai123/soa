Examples for Chapter 7, Section 1.7
===================================

This example illustrates how asynchronous continuations can be used. The 
process definition in the src/main/jpdl/async directory contains the 
process we are using for the test. Notice that, within that process,
there is a node called asyn-node. This is where the asynchronous 
continuation occurs. 

Since I wanted to keep this lesson as simple to configure as possible, 
I did not set it up so that it requires to be run under jBPM Enterprise
(i.e., jBPM Console). Normally, this server process has a task manager
that listens for new async "jobs", and then processes them. In this 
example, we'll simple look at the contents of the jobs table to determine
whether it's working correctly. Of course, you can also deploy the process
to jBPM Console if you want to test it through there as well (which
I've done).

To run the example, run the ant task async.test. Also, you might want to 
review the jUnit test case, AsyncProcessTest.java, which contains a lot
of in-line comments.




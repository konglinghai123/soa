Examples for Chapter 5
======================

The examples for chapter 5 can all be run using jBPM in an embedded fashion. 
By that, we mean that it doesn't require the jBPM console to be running. As
a consequence, these examples are very simple to run. 

Within each of the three subdirectories are a build.xml file. It is 
recommended that you use it to run the examples, instead of just 
running the Java main through the Eclipse (i.e., "Run As..."). 
To run the ant script through Eclipse, in the Java Eclipse perspective, 
choose Window -> Show View -> Ant. Then, drag each build.xml into that
view window. From there, you can easily run each respective Ant target.

5.5Actions Example
==================

Valid ant targets are:

- compile. Compiles the Java source and deploys to the target directory.
- simple.process.test. Runs the jUnit examples for the Simple jBPM process.
- salary.process.test. Runs the jUnit examples for the Salary jBPM process.
- run.tests (default). Runs both jUnit tests. 

The Java classes located in the src/test/java are those that are used for 
running the above samples. 

5.6Events Example
==================

Valid ant targets are:

- compile. Compiles the Java source and deploys to the target directory.
- event.process.test. Runs the jUnit test associated with the event jBPM process.

The Java classes located in the src/test/java are those that are used for 
running the above samples. 

5.7Variables Example
====================

Valid ant targets are:

- compile. Compiles the Java source and deploys to the target directory.
- variable.process.test. Runs the jUnit test associated with the variable example jBPM process.

The Java classes located in the src/test/java are those that are used for 
running the above samples. 

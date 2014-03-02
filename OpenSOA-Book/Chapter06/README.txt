PRE-REQUISITES
==============
- jBPM Eclipse Graphical Process Designer (instructions for installing
  are found in README.pdf at the top-level of the project directory). 
  This is required for both visually designing processes and packaging
  processes for deployment to the jBPM Console.
  
- JBoss app server. Tested with 4.2.2.
  
NOTE
====
Examples for this chapter should be be run through ant, as opposed to running
them directly through explorer. This is because, since a single project is
used for all of the book examples, classpath issues can arise due to how
Eclipse automatically constructs classpaths.


INSTRUCTIONS FOR CHAPTER 6 SAMPLES
==================================

1. The Chapter 6 samples, since they illustrate the use of tasks
   that required human interaction, must be used in tandem with
   the jbpm-console. 
   
6.2Tasks Instructions
=====================
While jBPM Console can be installed using an in-memory HSQLDB database
(in addition to most others like Oracle, Postgres, MySQL etc), we don't want
to use the in-memory one, since our API examples will require that 
we instantiate a jBPM client context that connects to the same database
as the Console. So, in an attempt to make this as easy as possible, ant
targets have been configured that will start a local server HSQLDB instance.
Then, both the Console and API examples will connect into that database.

To start the database and populate the database, do the following:

1) Open 2 command windows, and change directory for both where this file resides.

2) In the first window, run "ant run.hsqldb.server".

3) In the second window, run "ant drop.rebuild.hsqldb.tables". After 
   launching, hit return to process (which returns blank for the prompted
   password).
   
4) (optional) You can also run the target run.hsqldb.manager to launch the 
   hsqldb database GUI manager. Unlike the other two targets, this can be
   conveniently run from within Eclipse.

5) Update the build.properties file located in the root of the source code.
   Enter the proper location of your JBOSS_HOME directory (the 
   InstallationInstructions.pdf  in the root directory contains information on how to 
   install JBoss App Server and the jBPM Eclipse Plugin).

6) In the second command window, run "ant install.hsqldb.conf". This will
   copy of the resources/jbpm-hsqldb-ds.xml file, which is configured so
   that jBPM Console uses the hsqldb server instance started in step 2. 
   A copy of the original jbpm-hsqldb-ds.xml file can still be found in the
   jBPM installation directory (in the database subdirectory are different
   default configurations for a slew of different RDBMs).
   
7) Start the JBoss app server. To do so, change directory to JBOSS_HOME/bin.
   Then, at a command line issue "run.bat -b 0.0.0.0" (or run.sh on Linux).
   
   NOTE: Using "-b 0.0.0.0" simply binds the P JBoss is listening to all available, 
   and can be left off if your box has only a single IP address (for example,
   if using VPN, you probably have 2 IP addresses assigned your box).

8) In a command window, run "ant load.identities" (from this directory location). 
   This will populate the user identity tables in the database so that you can authenticate 
   successfully when logging into jBPM Console. 
      
9) Within a web browser, enter as the URL: http://localhost:8080/jbpm-console.
   This will launch the jBPM Console. You can login using manager/manger.
   At this point, you should not see any processes listed, since we started
   with a fresh database, and haven't loaded processes yet. We'll do that next.
   
10a) To load the Task examples (section 6.2 in the book), in your command
     window, change directory to the "6.2Tasks" subdirectory. Then enter:
     "ant deploy.examples.to.jboss". This will do several things: a) zip the process
     files into what are known as process archives (.par files); b) run 
     an ant target which deploys them to the jBPM console database instance
     running under the hsqldb server you started in step 2; and c) compile,
     jar archive and deploy the Java classes used within the business processes
     (such as ActionHandler implementations).
     
     Once the processes are deployed, you can click on the "Processes" tab
     within the jBPM Console. You should see the "task-example" and 
     "swimlane-example" present. When viewing a process, you can then instantiate
     an instance of it by clicking the "start" link. This will then take you to
     the "Process Instance Summary" window. In the case of the task-example process
     instance you are shown a poDetails task (you can visually see where a process
     instances is at by clicking on the "Process Image" link on the left-hand menu
     bar). 
     
     After the task-example process has been started, click on the "Examine" link adjacent
     to the poDetails task that was created. By doing so, you bring up a form. Enter
     "jdoe" as the submitter, and for the rest, some bogus value in the form and click 
     on the "Submit" button. This will complete the task and move it on it's process workflow.
     
     The reason that jdoe was used as the submitter is that the AssignmentExample.java 
     assignment handler uses the submitter value to determine who gets assigned the
     PO for approval. After submitting the task form, you can click on the identifier
     next to the "Process Instance" left-hand menu bar. This represents the unique
     identifier associated with the process instance in which you are working. When
     you return back to the "Process Instance Summary" window, you can then click
     again on the "Process Image" menu option, which shows that the PO has been submitted
     and is awaiting approval. You can click on the "Running" link associated to the 
     task to view the options avaible to the approver.
     
     Since the task now belongs to "djohnson" for approval, you can logout as manager
     and login as djohnson (password also djohnson). Then, click on "Personal/Group Tasks"
     tab, and you'll see the work item listed. You can click on the "Examine" link to 
     either approve or disapprove of the requisition. This will end that process
     instance (so to view it again as manager, be sure to click on the "E" checkmark
     under the status filter located in the "Process Instances" view.
     
NOTE: To see all of the available ant targets for each respective build.xml file, issue 
      "ant -projecthelp" in the directory the build.xml file resides.
      
10b) The ant target "deploy.examples.to.jboss" will also install the swimlane example.
     This will create a process called "swimlane-example". You can instantiate a
     process instance of it using the same instructions use for the task-example process
     described in 10a. Once the start task is created (poDetails), the process flow 
     will proceed to the approve task. You can then login as either user jdavis
     or dgenkin (both passwords are the same as the username),and assign the approve
     task to yourself. Then, run the approve task and submit the task. You will notice
     that the next task node, assign-charge-codes, is also automatically then assigned
     to that user. This demonstrates the swimlane functionality. Also, if you don't
     approve the task within about 10 mins, the timer will kick in, and will send
     the flow into the pastdue node/task. This demonstrates the timer funtionality.
     
11) The task API functionality examples are found in the 6.5API subfolder. You
    can run the example by running the ant target located in the  subdirectory
    called "run.main". This will use the Task API to interrogate the jBPM Console
    database instance (see examples 10a and 10b above). To truly test the functionality
    of the API, you should have some running process instances. When the task, you 
    can then see the processes and process instances print out to the console.
    
    In addition to run.main are:
    
    run.tasks - This will return a list of tasks for a given task instance. Requires a 
    process instance Id as an input (found in jBPM Console, but omit the ID_ part) and
    task status. You will be prompted for these values.
    
    run.actor.tasks - Prompts for an actor id, and will then bring  back a list of 
    all process instance ids that have tasks assigned to that individual (or as a 
    pooled actor).
    
    run.process.instances - Prompts for a process Id and a process instance status,
    and then returns a list of all process instances that belong to the process
    with the provided status. 
    
    run.instance.tasks - provides detailed task details for a given process instance
    id (which you are prompted for, always a numeric value). Shows transition paths.
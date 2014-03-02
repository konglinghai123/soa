package com.sample;

import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.taskmgmt.def.AssignmentHandler;
import org.jbpm.taskmgmt.exe.Assignable;

public class AssignmentExample implements AssignmentHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void assign(Assignable assignable, ExecutionContext executionContext)
			throws Exception {

		String submitter = (String) executionContext.getContextInstance()
				.getVariable("submitter");

		if (submitter.equalsIgnoreCase("jdoe"))
			assignable.setActorId("djohnson");
		else if (submitter.equalsIgnoreCase("msmith"))
			assignable.setActorId("ltaylor");
		else
			assignable.setActorId("rharris");
	}

}

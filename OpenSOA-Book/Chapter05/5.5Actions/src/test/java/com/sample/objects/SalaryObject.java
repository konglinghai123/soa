package com.sample.objects;

import java.io.Serializable;

import org.jbpm.context.exe.ContextInstance;
import org.jbpm.graph.exe.ExecutionContext;

public class SalaryObject implements Serializable {

	private static final long serialVersionUID = 1L;

	public String fname;
	public String lname;
	public String approvedBy;
	public int currentSalary;
	public int proposedSalary;

	public void populateVars() {
		System.out.println("in populateVars()");
		fname = "John";
		lname = "Doe";
		currentSalary = 50000;
		proposedSalary = 55000;
	}

	public void logApprovedSalary() {
		System.out.println("in logApprovedSalary()");
		ContextInstance contextInstance = ExecutionContext
				.currentExecutionContext().getContextInstance();
		approvedBy = (String) contextInstance.getVariable("approver");

//		if ((float)proposedSalary / currentSalary > 1.0) {
		if (proposedSalary > currentSalary) {
			System.out.println("That's a nice increase");
		} else
			System.out.println("Maybe next year :-(");
	}
}

package com.sample;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.scheduler.SchedulerService;
import org.jbpm.scheduler.def.CancelTimerAction;
import org.jbpm.svc.Services;

public class CancelTimerService implements ActionHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String timer;
	
	public void execute(ExecutionContext executionContext) throws Exception {

		System.err.println("actinoName: " + executionContext.getProcessDefinition().getNode("approve").getName());
		System.err.println("actinoName2: " + executionContext.getProcessDefinition().getNode("approve").getEvent("node-enter").getActions().get(0));
		System.err.println("actinoName3: " + executionContext.getProcessDefinition().getNode("approve").hasEvents());
		CancelTimerAction cancelTimer = (CancelTimerAction) executionContext.getProcessDefinition().getNode("approve").getEvent("node-leave").getActions().get(0);
		System.err.println("actinoName: " + cancelTimer.getTimerName());
		SchedulerService schedulerService = (SchedulerService) Services.getCurrentService(Services.SERVICENAME_SCHEDULER);
		schedulerService.deleteTimersByName("approveAmt", executionContext.getToken());
	}

}

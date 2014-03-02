package opensoa.sca.impl;

import java.util.List;

import opensoa.sca.CreateProcessInstance;
import opensoa.sca.DBHelper;
import opensoa.sca.JBPMHelper;
import opensoa.sca.vo.xsd.ProcessType;
import opensoa.sca.vo.xsd.ProcessVarsType;
import opensoa.sca.vo.xsd.var;

import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

@Service(CreateProcessInstance.class)
public class CreateProcessInstanceImpl implements CreateProcessInstance  {
	
	@Reference
	protected JBPMHelper jbpmContextHelper;
	
	@Reference
	protected DBHelper dbHelper;
	
	JbpmContext jbpmContext;
	

	public Long createProcessInstance(ProcessType process) throws Exception {
		System.out.println("Inside CreateProcessInstace ");
		ProcessInstance instance;
		long processId = 0;
		
		jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();
		
		ProcessDefinition definition = checkProcessId(process.getProcessName());
		
		if (definition == null) {
			throw new Exception("Unable to find existing process definition...please reload");			
		}
		instance = definition.createProcessInstance();
		processId = instance.getId();

		ProcessVarsType processVars = process.getProcessVars();
		if (processVars != null) {
			List<var> varvals = processVars.getVar();
			for (var varval : varvals) {
				instance.getContextInstance().setVariable(varval.getName(),varval.getValue());
			}
		}
		
		instance.setKey(process.getKey());
		
		TaskInstance taskInstance = instance.getTaskMgmtInstance().createStartTaskInstance();
		
		if (taskInstance != null)
			taskInstance.end();
		
		/*
		if (process.getProcessName().equalsIgnoreCase("NewHireProcess")) {
			System.out.println("definition is: " + definition);
			
			process.getEmployee().setObjectId(processId);

			dbHelper.saveClass(process.getEmployee());
			
		} 
		*/

		jbpmContext.close();
		return Long.valueOf(processId);
	}
	
	private ProcessDefinition checkProcessId(String processName) throws java.rmi.RemoteException {
		
		ProcessDefinition processDef = jbpmContext.getGraphSession().findLatestProcessDefinition(processName);
		if (processDef == null)
			throw new java.rmi.RemoteException("Unable to find process definition for: " + processName);
	
		return processDef;
	}
	
}

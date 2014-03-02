package opensoa.sca.impl;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import opensoa.sca.JBPMHelper;
import opensoa.sca.ListProcessInstances;
import opensoa.sca.vo.xsd.ProcessInstanceVO;
import opensoa.sca.vo.xsd.ProcessInstanceVOType;
import opensoa.sca.vo.xsd.ProcessVarsType;
import opensoa.sca.vo.xsd.XsdFactory;
import opensoa.sca.vo.xsd.var;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.hibernate.Query;
import org.jbpm.JbpmContext;
import org.jbpm.command.AbstractGetObjectBaseCommand;
import org.jbpm.graph.exe.ProcessInstance;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

import commonj.sdo.helper.HelperContext;

@Service(ListProcessInstances.class)

public class ListProcessInstancesImpl extends AbstractGetObjectBaseCommand  implements ListProcessInstances  {
	
	private static final long serialVersionUID = 1L;

	private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z");

	@Reference
	protected JBPMHelper jbpmContextHelper;
	
	private transient boolean firstExpression = true;
	private final static String RUNNING = "RUNNING";
	private final static String ALL = "ALL";
	private final static String SUSPENDED = "SUSPENDED";
	private final static String ENDED = "ENDED";

	public ProcessInstanceVOType listProcessInstances(long id, String filter) {
		
		JbpmContext jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();
		
        StringBuffer queryText = new StringBuffer("select pi" + " from org.jbpm.graph.exe.ProcessInstance as pi ");
        
        if (id != 0)
        	queryText.append(getConcatExpression()).append(" pi.processDefinition = "  + String.valueOf(id));
        
        if (filter.equalsIgnoreCase(ENDED)) {
            queryText.append(getConcatExpression()).append(" pi.end != null");
        }
        if (filter.equalsIgnoreCase(RUNNING)) {
            queryText.append(getConcatExpression()).append(" pi.end = null");
        }
        if (filter.equalsIgnoreCase(SUSPENDED)) {
            queryText.append(getConcatExpression()).append(" pi.isSuspended = true");
        }

        queryText.append(" order by pi.start desc");

        Query query = jbpmContext.getSession().createQuery(queryText.toString());
        
        List<ProcessInstance> processInstanceList = retrieveProcessInstanceDetails(query.list());

		// if no results are returned, return null
        if (processInstanceList == null) {
        	return null;
        }
		
		XsdFactory factory = XsdFactory.INSTANCE;
		HelperContext scope = SDOUtil.createHelperContext();
		XsdFactory.INSTANCE.register(scope);
		
		ProcessInstanceVOType processList = (ProcessInstanceVOType) factory.createProcessInstanceVOType();
		
		ProcessVarsType processVars = factory.createProcessVarsType();
		
//		processInstance = factory.createProcessInstanceVO();
		
		for (ProcessInstance processInst : processInstanceList) {
			ProcessInstanceVO processInstance = factory.createProcessInstanceVO();
			
			//processInst.getProcessDefinition().getName()
			if (processInst.getEnd() != null)
				processInstance.setEnd(FORMAT.format(processInst.getEnd()));
			processInstance.setStart(FORMAT.format(processInst.getStart()));
			processInstance.setHasEnded(processInst.hasEnded());
			processInstance.setIsTerminatedImplicitly(processInst.isTerminatedImplicitly());
			processInstance.setIsSuspended(processInst.isSuspended());
			processInstance.setId(processInst.getId());
			processInstance.setKey(processInst.getKey());
			processInstance.setVersion(processInst.getVersion());
			processInstance.setName(processInst.getProcessDefinition().getName());
			processInstance.setVer(processInst.getProcessDefinition().getVersion());
			
			Map<String,Object> variableMap = processInst.getContextInstance().getVariables();
			if (variableMap != null) {
			    for (String key : variableMap.keySet()) {
			    	var pvar = factory.createvar();
			        pvar.setName(key);
			        pvar.setValue((String) variableMap.get(key).toString());
			        processVars.getVar().add(pvar);
			    }
			    processInstance.setProcessVariables(processVars);
			}
		    
			processList.getInstance().add(processInstance);
		}
		jbpmContext.close();
		return processList;
	}
	
    public List<ProcessInstance> retrieveProcessInstanceDetails(List<ProcessInstance> processInstanceList) {
        for (ProcessInstance pi : processInstanceList) {
            retrieveProcessInstance(pi);        	
        }
        return processInstanceList;
    }

	public Object execute(JbpmContext jbpmContext) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
    
    private String getConcatExpression() {
        if (firstExpression) {
            firstExpression = false;
            return " where ";
        }
        return " and ";
    }
	
}

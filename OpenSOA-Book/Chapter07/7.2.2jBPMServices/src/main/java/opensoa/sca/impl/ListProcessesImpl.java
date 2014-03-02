package opensoa.sca.impl;

import java.util.List;
import opensoa.sca.JBPMHelper;
import opensoa.sca.ListProcesses;
import opensoa.sca.vo.xsd.*;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.hibernate.Query;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.osoa.sca.annotations.*;
import commonj.sdo.helper.HelperContext;

@Service(ListProcesses.class)
public class ListProcessesImpl implements ListProcesses {

  @Reference
  protected JBPMHelper jbpmContextHelper;

  private final static String RUNNING = "select count(*) from org.jbpm.graph.exe.ProcessInstance pi where "
      + "pi.processDefinition = ? and pi.end = null";
  private final static String ENDED = "select count(*) from org.jbpm.graph.exe.ProcessInstance pi where "
      + "pi.processDefinition = ? and pi.end != null";
  private final static String SUSPENDED = "select count(*) from org.jbpm.graph.exe.ProcessInstance pi where "
      + "pi.processDefinition = ? and pi.isSuspended = true";

  public ProcessVOType listProcesses() {
	JbpmContext jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();

    List<ProcessDefinition> processDefinitionList = jbpmContext
        .getGraphSession().findAllProcessDefinitions();

    XsdFactory factory = XsdFactory.INSTANCE;
    HelperContext scope = SDOUtil.createHelperContext();
    XsdFactory.INSTANCE.register(scope);

    ProcessVOType processList = (ProcessVOType) factory
        .createProcessVOType();

    for (ProcessDefinition processDef : processDefinitionList) {
      long pid = processDef.getId();
      ProcessVO process = factory.createProcessVO();
      process.setDescription(processDef.getDescription());
      process.setName(processDef.getName());
      process.setId(pid);
      process.setVersion(processDef.getVersion());
      process.setHasActions(processDef.hasActions());
      process.setHasEvents(processDef.hasEvents());
      process.setRunning(queryCount(RUNNING, pid, jbpmContext));
      process.setSuspended(queryCount(SUSPENDED, pid, jbpmContext));
      process.setEnded(queryCount(ENDED, pid, jbpmContext));
      processList.getProcess().add(process);
    }
    jbpmContext.close();
    return processList;
  }

  private int queryCount(String querystring, long pid, JbpmContext jbpmContext) {
    Query query = jbpmContext.getSession().createQuery(querystring);
    query.setLong(0, pid);
    Long i = (Long) query.list().iterator().next();
    return i.intValue();
  }
}

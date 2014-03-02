package opensoa.sca.impl;

import org.jbpm.JbpmConfiguration;
import org.jbpm.persistence.db.DbPersistenceServiceFactory;
import org.jbpm.taskmgmt.exe.TaskMgmtInstance;
import org.osoa.sca.annotations.EagerInit;
import org.osoa.sca.annotations.Init;
import org.osoa.sca.annotations.Scope;
import org.osoa.sca.annotations.Service;

import opensoa.sca.JBPMHelper;

@Service (JBPMHelper.class)
@Scope ("COMPOSITE")
@EagerInit
public class JBPMContextHelperImpl implements JBPMHelper {

	TaskMgmtInstance taskMgmtInstance = null;

	JbpmConfiguration jbpmConfiguration = null;
	
	private final static String CONFIG_FILE = "jbpm.cfg.xml";
	
	public JbpmConfiguration getConfiguration() {
		return jbpmConfiguration;
	}

	@Init
	public void initialize() {
		jbpmConfiguration = JbpmConfiguration.getInstance(CONFIG_FILE);
//		DbPersistenceServiceFactory dbPersistenceServiceFactory = (DbPersistenceServiceFactory) jbpmConfiguration
//				.getServiceFactory(org.jbpm.svc.Services.SERVICENAME_PERSISTENCE);
//		
//		jbpmConfiguration = JbpmConfiguration.getInstance(CONFIG_FILE);
	}

}

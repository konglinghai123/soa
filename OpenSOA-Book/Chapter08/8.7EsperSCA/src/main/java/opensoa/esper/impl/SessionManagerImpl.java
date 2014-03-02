package opensoa.esper.impl;

import opensoa.esper.SessionManager;
import opensoa.esper.StatementManager;

import org.osoa.sca.annotations.EagerInit;
import org.osoa.sca.annotations.Init;
import org.osoa.sca.annotations.Property;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;
import org.osoa.sca.annotations.Service;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;

@Service (SessionManager.class)
@Scope ("COMPOSITE")
@EagerInit
public class SessionManagerImpl implements SessionManager {
  
  private EPServiceProvider epService;
  
  @Property
  protected String configurationFile;
  @Property
  protected String providerName;
  @Reference
  protected StatementManager statementMgr;
  
  public EPServiceProvider getEPSession() {
    return epService;
  }
  
  @Init
  public void initialize() {
    Configuration esperConf = new Configuration();
    esperConf.configure(configurationFile);
    
    epService = EPServiceProviderManager.getProvider(providerName, esperConf);
    
    statementMgr.initializeStatements();
    statementMgr.register(epService);
    
    System.out.println("Initiatlization completed...");
    
  }

}

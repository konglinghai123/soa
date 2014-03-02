package opensoa.drools.service.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import opensoa.drools.dto.Product;
import opensoa.drools.service.SessionManager;
import opensoa.drools.utility.SessionHelper;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.StatefulSession;
import org.drools.WorkingMemory;
import org.drools.compiler.DroolsParserException;
import org.drools.compiler.PackageBuilder;
import org.drools.event.AfterActivationFiredEvent;
import org.drools.event.DefaultAgendaEventListener;
import org.drools.rule.Package;
import org.jboss.cache.pojo.PojoCache;
import org.jboss.cache.pojo.PojoCacheFactory;
import org.osoa.sca.annotations.EagerInit;
import org.osoa.sca.annotations.Init;
import org.osoa.sca.annotations.Property;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;
import org.osoa.sca.annotations.Service;

@Service (SessionManager.class)
@Scope ("COMPOSITE")
@EagerInit

public class SessionManagerImpl implements SessionManager {
  private WorkingMemory workingMemory;
  
  @Property
  protected Collection<String> drls;
  @Property
  protected Collection<String> ruleflows;
  @Property 
  protected String pojoServiceConfig;
  @Property
  protected String pojoAOPConfig;
  

  RuleBase rulebase;
  boolean status;
  
  public WorkingMemory getWorkingMemory() {
	  return workingMemory;
  }
  
  @Init
  public void initialize() {
	  System.out.println("Loading working memory...");
	  status = true;
	  
	  try {
		  rulebase = instantiateRuleBase();
		  workingMemory = rulebase.newStatefulSession();
		  
		  Integer counter = 0;
		  workingMemory.setGlobal("counter", counter);
		  
		  // These are really only used for junit tests, but must be present or an error will occur
	      workingMemory.setGlobal( "price_calc_results", new ArrayList());
	      workingMemory.setGlobal( "shipment_calc_results", new ArrayList() );
	      workingMemory.setGlobal( "special_calc_results", new ArrayList() );
	      workingMemory.setGlobal( "price_calc_results_dsl", new ArrayList() );
	        
		
		  loadWM();
		  
		  //SessionHelper.loadNVWorkingMemory(workingMemory);
		  
		  for (Iterator iter = workingMemory.iterateFactHandles(); iter.hasNext(); ) {	 
				System.out.println("iter: " + iter.next());
		  }
		  
		  workingMemory.addEventListener( new DefaultAgendaEventListener() {
				public void afterActivationFired(AfterActivationFiredEvent event, WorkingMemory workingMemory) {
					super.afterActivationFired( event, workingMemory );
					System.out.println( "Event: " + event.getActivation().getRule().getName()) ;
				}
			});
				
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

private void loadWM () {
	  boolean toStart = false;
	  System.out.println("Config is: " + pojoServiceConfig);
	  PojoCache pcache = PojoCacheFactory.createCache(pojoServiceConfig, toStart);
	  pcache.start();
	  
	  Map workingObjs = pcache.findAll("/opensoa/drools/salesorder/");
	  
	  Iterator it = workingObjs.entrySet().iterator();
	  while (it.hasNext()) {
		  Map.Entry pairs = (Map.Entry) it.next();
		  System.out.println("Loading: " + pairs.getKey());
		  workingMemory.insert(pairs.getValue());
	  }

  }
  
  private RuleBase instantiateRuleBase() throws DroolsParserException, IOException {
	  Reader reader;
	  PackageBuilder builder = new PackageBuilder();
	  Package pkg;
	  RuleBase ruleBase;
	  
	  /* Process DRLS */
	  Iterator iter = drls.iterator(); 
	  while (iter.hasNext()) {
		  reader = new InputStreamReader( SessionManagerImpl.class.getResourceAsStream( (String) iter.next() ) );
		  builder.addPackageFromDrl( reader );
	  }
	  
	  /* Process RuleFlows */
	  iter = ruleflows.iterator();
	  while (iter.hasNext()) {
		  reader = new InputStreamReader( SessionManagerImpl.class.getResourceAsStream( (String) iter.next() ) );
		  builder.addProcessFromXml( reader );
	  }
	  
		//get the compiled package (which is serializable)
		pkg = builder.getPackage();

		//add the package to a rulebase (deploy the rule package).
		ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage( pkg );
		
		return ruleBase;
  }
}

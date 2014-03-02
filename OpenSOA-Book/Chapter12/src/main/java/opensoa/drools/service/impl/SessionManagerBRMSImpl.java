package opensoa.drools.service.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import opensoa.drools.dto.Product;
import opensoa.drools.service.SessionManager;
import opensoa.drools.utility.SessionHelper;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.StatefulSession;
import org.drools.WorkingMemory;
import org.drools.agent.RuleAgent;
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

public class SessionManagerBRMSImpl implements SessionManager {
	private WorkingMemory workingMemory;

	@Property
	protected String rulePropertyFile;
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
		System.out.println("Loading working memory");
		status = true;

		try {
			rulebase = loadRuleBaseFromRuleAgent(rulePropertyFile);
			workingMemory = rulebase.newStatefulSession();
			Integer counter = 0;
			
			workingMemory.setGlobal("counter", counter);
		    workingMemory.setGlobal("price_calc_results", new ArrayList());
		    workingMemory.setGlobal("shipment_calc_results", new ArrayList() );
		    workingMemory.setGlobal("special_calc_results", new ArrayList() );
		    workingMemory.setGlobal("price_calc_results_dsl", new ArrayList() );
			
		    loadWM();

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
		boolean toStart = true;
		System.out.println("Config is: " + pojoServiceConfig);
		PojoCache pcache = PojoCacheFactory.createCache(pojoServiceConfig, toStart);
		//pcache.start();

		Map workingObjs = pcache.findAll("/opensoa/drools/salesorder/");

		Iterator it = workingObjs.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println("Loading: " + pairs.getKey());
			workingMemory.insert(pairs.getValue());
		}
	}

	private static RuleBase loadRuleBaseFromRuleAgent(String rulePropertyFile) {
		RuleAgent agent = RuleAgent.newRuleAgent( rulePropertyFile );
		RuleBase rulebase = agent.getRuleBase();
		return rulebase;
	}
}
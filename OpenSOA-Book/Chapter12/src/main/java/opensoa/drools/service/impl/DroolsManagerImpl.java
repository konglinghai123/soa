package opensoa.drools.service.impl;

import java.rmi.RemoteException;

import org.apache.tuscany.sdo.api.SDOUtil;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

import commonj.sdo.helper.HelperContext;

import opensoa.drools.DroolsFactory;
import opensoa.drools.impl.ManageResponseTypeImpl;
import opensoa.drools.impl.ManageServiceTypeImpl;
import opensoa.drools.salesorder.impl.PriceCalculatorRequestImpl;
import opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl;
import opensoa.drools.service.DroolsManager;
import opensoa.drools.service.SessionManager;

@Service (DroolsManager.class)

public class DroolsManagerImpl implements DroolsManager {
	
	@Reference
    protected SessionManager sessionManager;
	
	DroolsFactory dfactory;
	HelperContext scope;
	
	public PriceCalculatorResponseImpl Decision(PriceCalculatorRequestImpl order) throws Exception {
		
		// if service is suspended

		if (sessionManager.isStatus() == false) {
			throw (new Exception("Service unavailable"));
			
		}
		PriceCalculatorProcessor processor = new PriceCalculatorProcessor(order);
		
		return processor.process(sessionManager);
	}
	
	public ManageResponseTypeImpl Suspend(ManageServiceTypeImpl service) throws RemoteException, Exception {
		
		sessionManager.setStatus(false);
		
		scope = SDOUtil.createHelperContext();;		
		dfactory = DroolsFactory.INSTANCE;
		DroolsFactory.INSTANCE.register(scope);
		ManageResponseTypeImpl response = (ManageResponseTypeImpl) dfactory.createManageResponseType();
		response.setResultCode(200);
		response.setResult("SUCCESS");
		return response;
		
	}	
	
	public ManageResponseTypeImpl Resume(ManageServiceTypeImpl service) throws RemoteException, Exception {
		sessionManager.setStatus(true);
		
		scope = SDOUtil.createHelperContext();;		
		dfactory = DroolsFactory.INSTANCE;
		DroolsFactory.INSTANCE.register(scope);
		ManageResponseTypeImpl response = (ManageResponseTypeImpl) dfactory.createManageResponseType();
		response.setResultCode(200);
		response.setResult("SUCCESS");
		return response;
	}
	
	public ManageResponseTypeImpl Load(ManageServiceTypeImpl service) throws RemoteException, Exception {
		sessionManager.setStatus(false);
		scope = SDOUtil.createHelperContext();
		dfactory = DroolsFactory.INSTANCE;
		DroolsFactory.INSTANCE.register(scope);
		ManageResponseTypeImpl response = (ManageResponseTypeImpl) dfactory.createManageResponseType();
		response.setResultCode(200);
		response.setResult("SUCCESS");
		sessionManager.initialize();
		sessionManager.setStatus(true);
		return response;
	}
}

package opensoa.drools.service;

import java.rmi.RemoteException;

import opensoa.drools.DecisionRequestType;
import opensoa.drools.DecisionResponseType;

import opensoa.drools.impl.DecisionRequestTypeImpl;
import opensoa.drools.impl.ManageResponseTypeImpl;
import opensoa.drools.impl.ManageServiceTypeImpl;
import opensoa.drools.salesorder.*;
import opensoa.drools.salesorder.impl.OrderImpl;
import opensoa.drools.salesorder.impl.PriceCalculatorRequestImpl;
import opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface DroolsManager {
  public PriceCalculatorResponseImpl Decision(PriceCalculatorRequestImpl order)  throws Exception;
  public ManageResponseTypeImpl Suspend(ManageServiceTypeImpl service) throws RemoteException, Exception;
  public ManageResponseTypeImpl Resume(ManageServiceTypeImpl service) throws RemoteException, Exception;
  public ManageResponseTypeImpl Load(ManageServiceTypeImpl service) throws RemoteException, Exception;
}
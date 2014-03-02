package opensoa.sca;

import java.rmi.RemoteException;

import opensoa.sca.vo.xsd.ProcessType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface CreateProcessInstance {
	public Long createProcessInstance (ProcessType process) throws RemoteException, Exception;
}

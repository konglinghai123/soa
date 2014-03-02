package opensoa.sca;

import opensoa.sca.vo.xsd.ObjectRequestType;
import opensoa.sca.vo.xsd.ObjectResponseType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface DBGetObject {
	public ObjectResponseType getObject(ObjectRequestType objRequest);
	
}

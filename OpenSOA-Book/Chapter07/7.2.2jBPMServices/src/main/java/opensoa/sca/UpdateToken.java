package opensoa.sca;

import opensoa.sca.vo.xsd.UpdateTokenRequest;
import opensoa.sca.vo.xsd.UpdateTokenResponseType;


import org.osoa.sca.annotations.Remotable;

@Remotable
public interface UpdateToken {
	public UpdateTokenResponseType updateToken (UpdateTokenRequest request) throws Exception;
}

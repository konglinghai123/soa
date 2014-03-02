package opensoa.sca.impl;

import java.util.List;
import opensoa.sca.JBPMHelper;
import opensoa.sca.UpdateToken;
import opensoa.sca.vo.xsd.ProcessVarsType;
import opensoa.sca.vo.xsd.UpdateTokenRequest;
import opensoa.sca.vo.xsd.UpdateTokenResponseType;
import opensoa.sca.vo.xsd.XsdFactory;
import opensoa.sca.vo.xsd.var;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

import commonj.sdo.helper.HelperContext;

@Service(UpdateToken.class)
public class UpdateTokenImpl implements UpdateToken {

	@Reference
	protected JBPMHelper jbpmContextHelper;

	private final static String SIGNAL = "SIGNAL";
	private final static String RESUME = "RESUME";
	private final static String SUSPEND = "SUSPEND";
	private final static String END = "END";
	
	public UpdateTokenResponseType updateToken(UpdateTokenRequest request) throws Exception {
		XsdFactory factory = XsdFactory.INSTANCE;
		HelperContext scope = SDOUtil.createHelperContext();
		XsdFactory.INSTANCE.register(scope);
		UpdateTokenResponseType response = factory.createUpdateTokenResponseType();
		ProcessVarsType processVars;
		
		JbpmContext jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();
		
		ProcessInstance instance = jbpmContext.getGraphSession().getProcessInstance(request.getProcessId());
		
		Token token = instance.findToken(request.getTokenPath());

		if (token == null) 
			throw new Exception("Unable to find Token by the name of: " + request.getTokenPath());
		
		if (request.getLocalVariables() != null) {
			processVars = request.getLocalVariables();
			List<var> varvals = processVars.getVar();
			for (var varval : varvals) {
				//instance.getContextInstance().setVariable(varval.getName(),varval.getValue(), token);
				instance.getContextInstance().createVariable(varval.getName(),varval.getValue(), token);
			}
		}
		
		if (request.getProcessVariables() != null) {
			processVars = request.getProcessVariables();
			List<var> varvals = processVars.getVar();
			for (var varval : varvals) {
				//instance.getContextInstance().setVariable(varval.getName(),varval.getValue(), token);
				instance.getContextInstance().createVariable(varval.getName(),varval.getValue());
			}
		}		
		
		
		if (request.getComment() != null)
			token.addComment(request.getComment());
		
		if (request.getAction().equals(SIGNAL)) {
			if (request.getTransitionName() != null)
			{		
				
				token.signal(request.getTransitionName());
			}
			else
				token.signal();
		} else if (request.getAction().equals(RESUME)) {
			token.resume();
		} else if (request.getAction().equals(END)) {
			token.end();
		} else if (request.getAction().equals(SUSPEND)) {
			token.suspend();
		}
		
		jbpmContext.close();
		response.setSuccess(true);
		return response;
	}

}

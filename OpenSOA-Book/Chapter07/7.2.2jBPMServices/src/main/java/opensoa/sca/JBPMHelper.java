package opensoa.sca;

import org.jbpm.JbpmConfiguration;
import org.osoa.sca.annotations.Conversational;

@Conversational
public interface JBPMHelper {
	public void initialize();
	public JbpmConfiguration getConfiguration();
	
}

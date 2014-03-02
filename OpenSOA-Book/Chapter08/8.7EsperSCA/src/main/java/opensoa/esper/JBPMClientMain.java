package opensoa.esper;

import java.util.HashMap;

import opensoa.esper.jbpm.event.ProcessEvent;

import org.apache.tuscany.sca.host.embedded.SCADomain;

public class JBPMClientMain {

	public static void main(String[] args) {
		SCADomain scaDomain = SCADomain.newInstance("jBPMClient.composite");
		JBPMClient jbpmClient = scaDomain.getService(JBPMClient.class,
				"JBPMComponent");

		HashMap<String, String> properties = new HashMap<String, String>();
		properties.put("totalPrice", "50.25");
		properties.put("custId", "101");

		ProcessEvent event = new ProcessEvent("SalesOrder", (long) 1.0, 1, 2,
				properties);
		jbpmClient.sendProcessStartEndEvent(event);
	}

}

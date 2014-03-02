package opensoa.registry.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import opensoa.registry.SDORegistryHelper;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osoa.xmlns.sca._1.Composite;
import org.wso2.registry.Resource;
import org.wso2.registry.exceptions.RegistryException;
import org.wso2.registry.jdbc.Repository;
import org.wso2.registry.jdbc.handlers.Handler;
import org.wso2.registry.jdbc.handlers.RequestContext;

public class SCACompositeHandler extends Handler {
	private static final Log log = LogFactory.getLog(SCACompositeHandler.class);
	
	public void put (RequestContext requestContext) throws RegistryException {
		Resource resource = requestContext.getResource();
		Repository repository = requestContext.getRepository();
		log.info("Processing SCACompositeHandlert for file: " + requestContext.getResourcePath().getPath());
		
		String path = requestContext.getResourcePath().getPath();

		// process composite 
		String contents;
		Composite composite;
		try {
			contents = IOUtils.toString(resource.getContentStream());
			composite = SDORegistryHelper.getCompositeFromString(contents);
			// add properties for services & components
			HashMap<String, String> props = getProperties(composite);
			log.info("Properties to add are: " + props);
			for (Iterator i = props.keySet().iterator(); i.hasNext();) {
				String key = (String) i.next();
				String value = (String) props.get(key);
				resource.addProperty(key, value);
			}
			resource.setDescription(composite.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		repository.put(path, resource);
		requestContext.getRegistry().applyTag(path, "SCA");
		requestContext.getRegistry().applyTag(path, "composite");
		
		requestContext.setProcessingComplete(true);
	}
	
	public static HashMap<String, String> getProperties (Composite composite) throws IOException {
		int counter = 1;
		HashMap<String, String> props = new HashMap<String, String>();
		
		List<String> services = SDORegistryHelper.getServiceNames(composite);
		for (String service : services) {
			props.put("Service" + counter++ , service);
		}

		counter = 1;
		ArrayList<String> components = SDORegistryHelper.getComponentNames(composite);
		for (String component : components) {
			props.put("Component" + counter++, component);
		}		
		return props;
	}
}

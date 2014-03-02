package opensoa.registry.tests;

import opensoa.registry.SDORegistryHelper;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.osoa.xmlns.sca._1.Composite;
import org.wso2.registry.Resource;
import org.wso2.registry.ResourceImpl;
import org.wso2.registry.app.Property;
import org.wso2.registry.app.RemoteRegistry;
import org.wso2.registry.utils.RegistryClientUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * This class is used as utility class for ant build
 */
public class TestRemoteRegistry {

	public static void main(String[] args) throws Exception {

		RemoteRegistry remoteRegistry;

		remoteRegistry = new RemoteRegistry(new URL("http://192.168.2.107:8080/wso2registry"), "admin", "admin");

		/* example of querying from registry
		Resource resource =  remoteRegistry.get("/Test/Order.wsdl");
		System.out.println("resource is " + resource.getAuthorUserName());
		*/
		
		String patht = FilenameUtils.getPath(SDOTestLoader.class.getResource("SDOTestLoader.class").toString()); 	
		String path = patht.substring(6) + "../../../examples/esper.composite";
		File file = new File(path);
		//File file = new File("C:/Users/jdavis/workspace/OpenSOA-Book/Chapter13/bin/examples/esper.composite");

		System.out.println("File is: " + file.length());

		ResourceImpl rimpl = new ResourceImpl();

		InputStream in = new FileInputStream(file);
		rimpl.setContentStream(in);
		
		Composite composite = SDORegistryHelper.getCompositeFile(path);
		
		// add properties for services & components
		HashMap<String, String> props = getProperties(composite);
		for (Iterator i = props.keySet().iterator(); i.hasNext();) {
			String key = (String) i.next();
			String value = (String) props.get(key);
			rimpl.addProperty(key, value);
		}
		rimpl.setDescription(composite.getName());
		
		remoteRegistry.put("/Tester/esper6.composite", rimpl);

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

package opensoa.registry;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import opensoa.registry.tests.SDOTestLoader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.osoa.xmlns.sca._1.Binding;
import org.osoa.xmlns.sca._1.Component;
import org.osoa.xmlns.sca._1.ComponentService;
import org.osoa.xmlns.sca._1.Composite;
import org.osoa.xmlns.sca._1.Service;
import org.osoa.xmlns.sca._1.impl._1FactoryImpl;

import commonj.sdo.helper.HelperContext;
import commonj.sdo.helper.XMLDocument;
import commonj.sdo.helper.XMLHelper;

public class SDORegistryHelper {
	
	public static String getBindings (List<Binding> bindings) {
		String bindstr = new String();
		String bindClass;
		for (Binding binding : bindings) {
			//if (binding.getClass().get)
			bindClass = binding.getClass().getName().substring(binding.getClass().getName().lastIndexOf(".") + 1);

			if (bindClass.equalsIgnoreCase("WebServiceBindingImpl")) {
				bindstr += "WebService" + ",";
			} else if (bindClass.equalsIgnoreCase("JMSBindingImpl")) {
				bindstr += "JMS" + ",";
			} else if (bindClass.equalsIgnoreCase("SCABindingImpl")) {
				bindstr += "SCA" + ",";
			}
			
		}
		if (bindstr.length() > 0) 
			return bindstr.substring(0, bindstr.length() - 1);
		else
			return bindstr;
	}
	
	public static Composite getCompositeFile (String path) throws IOException {

		File file = new File(path);
		String fileContents = FileUtils.readFileToString(file, "UTF-8");
		
		HelperContext scope = SDOUtil.createHelperContext();
		XMLHelper helper = scope.getXMLHelper();
		_1FactoryImpl.INSTANCE.register(scope);
		
		XMLDocument doc = helper.load(fileContents);

		Composite composite = (Composite) doc.getRootObject();
		return composite;
	}
	
	public static Composite getCompositeFromString (String content) throws IOException {
	
		HelperContext scope = SDOUtil.createHelperContext();
		XMLHelper helper = scope.getXMLHelper();
		_1FactoryImpl.INSTANCE.register(scope);
		
		XMLDocument doc = helper.load(content);

		Composite composite = (Composite) doc.getRootObject();
		return composite;
	}
	
	public static ArrayList<String> getComponentNames(Composite composite) {

		ArrayList<String> componentStrs = new ArrayList<String>();
		List<Component> components = composite.getComponent();
		for (Component component : components) {
			componentStrs.add(component.getName());
		}
		return componentStrs;
	}
	
	public static ArrayList<String> getServiceNames(Composite composite) {
		ArrayList<String> serviceStrs = new ArrayList<String>();
		List<Service> services = composite.getService();
		for (Service service : services) {
			serviceStrs.add(service.getName() + " (" + SDORegistryHelper.getBindings(service.getBinding()) + ")");
		}
		
		// get any services that are defined within each of the components
		List<Component> components = composite.getComponent();
		List<ComponentService> componentServices;
		for (Component component : components) {
			componentServices = component.getService();
			for (ComponentService service : componentServices) {
				serviceStrs.add(service.getName() + " (" + SDORegistryHelper.getBindings(service.getBinding()) + ")");
			}
		}
		return serviceStrs;
	}

}

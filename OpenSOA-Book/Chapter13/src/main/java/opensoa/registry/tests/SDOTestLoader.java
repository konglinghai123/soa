package opensoa.registry.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import opensoa.registry.SDORegistryHelper;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.osoa.xmlns.sca._1.Binding;
import org.osoa.xmlns.sca._1.Component;
import org.osoa.xmlns.sca._1.Composite;
import org.osoa.xmlns.sca._1.Service;
import org.osoa.xmlns.sca._1._1Factory;
import org.osoa.xmlns.sca._1.impl._1FactoryImpl;

import commonj.sdo.helper.HelperContext;
import commonj.sdo.helper.XMLDocument;
import commonj.sdo.helper.XMLHelper;

public class SDOTestLoader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		int counter = 1;
		String path = FilenameUtils.getPath(SDOTestLoader.class.getResource("SDOTestLoader.class").toString()); 		

		Composite composite = SDORegistryHelper.getCompositeFile(path.substring(6) + "../../../examples/esper.composite");
		
		System.out.println("Services...");
		List<String> services = SDORegistryHelper.getServiceNames(composite);
		for (String service : services) {
			System.out.println("   service " + counter++ + " is: " + service);

		}
		
		System.out.println("Components...");
		counter = 1;
		ArrayList<String> components = SDORegistryHelper.getComponentNames(composite);
		for (String component : components) {
			System.out.println("   component " + counter++ + " is: " + component);
		}
	}


}

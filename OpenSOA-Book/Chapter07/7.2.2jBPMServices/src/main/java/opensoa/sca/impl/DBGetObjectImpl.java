package opensoa.sca.impl;

import opensoa.sca.DBGetObject;
import opensoa.sca.vo.xsd.EmployeeType;
import opensoa.sca.vo.xsd.ObjectRequestType;
import opensoa.sca.vo.xsd.ObjectResponseType;
import opensoa.sca.vo.xsd.XsdFactory;

import org.apache.tuscany.sdo.api.SDOUtil;
import org.osoa.sca.annotations.Property;
import org.osoa.sca.annotations.Service;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import commonj.sdo.helper.HelperContext;

@Service (DBGetObject.class)
public class DBGetObjectImpl implements DBGetObject {

	@Property
	protected String dbfile;

	private final static String EMPLOYEE = "opensoa.sca.vo.xsd.EmployeeType";
	
	public ObjectResponseType getObject(ObjectRequestType objRequest) {
		
		ObjectContainer db=Db4o.openFile(dbfile);
		
		XsdFactory factory = XsdFactory.INSTANCE;
		HelperContext scope = SDOUtil.createHelperContext();
		XsdFactory.INSTANCE.register(scope);
		
		ObjectResponseType resp = factory.createObjectResponseType();
		
		if (objRequest.getObjectClassName().equals("opensoa.sca.vo.xsd.EmployeeType")) {
			EmployeeType employee = (EmployeeType) factory.createEmployeeType();
			employee.setObjectId(Long.valueOf(objRequest.getObjectId()).longValue());
			
	        ObjectSet result=db.get(employee);
	        
	        while(result.hasNext()) {
	              employee = (EmployeeType)result.next() ;
	        }
	        resp.setEmployee(employee);
		}
		db.close();
		
		return resp;
	}
	
}

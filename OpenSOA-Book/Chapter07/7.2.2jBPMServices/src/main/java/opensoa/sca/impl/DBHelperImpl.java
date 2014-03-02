package opensoa.sca.impl;

import opensoa.sca.DBHelper;

import org.osoa.sca.annotations.Property;
import org.osoa.sca.annotations.Scope;
import org.osoa.sca.annotations.Service;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

@Service (DBHelper.class)
@Scope ("COMPOSITE")
public class DBHelperImpl implements DBHelper {

	@Property
	protected String dbfile;
	
	public void saveClass(Object obj) {
		
		System.out.println("dbfile is: " + dbfile);
		
		ObjectContainer db=Db4o.openFile(dbfile);

		db.set(obj);
		db.close();
	}
	
}

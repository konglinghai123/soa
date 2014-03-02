package opensoa.sca;

import org.osoa.sca.annotations.Conversational;

@Conversational 
public interface DBHelper {
	public void saveClass(Object obj);
	
}

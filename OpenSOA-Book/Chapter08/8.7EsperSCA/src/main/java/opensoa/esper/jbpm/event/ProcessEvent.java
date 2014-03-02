package opensoa.esper.jbpm.event;

import java.io.Serializable;
import java.util.HashMap;

public class ProcessEvent implements Serializable {

  private static final long serialVersionUID = 1L;

  private String processName;
  private long processVersion;
  private long processInstanceId;
  private int state;
  private HashMap<String, String> properties;
  private Property props[];

  public ProcessEvent() {
    super();
  }

  public ProcessEvent(String processName, long processVersion,
      long processInstanceId, int state, HashMap<String, String> properties) {
    super();
    this.processName = processName;
    this.processVersion = processVersion;
    this.processInstanceId = processInstanceId;
    this.state = state;
    
    if (properties == null)
      this.properties = new HashMap<String, String>();
    else
      this.properties = properties;
    
    props = new Property[properties.keySet().size()];
    Property property;
    int i = 0;
  
    for (String key : properties.keySet()) {
      System.out.println(" key: " + key);
      property = new Property();
      property.setKey(key);
      property.setValue(properties.get(key));
      props[i++] = property; 
    }
  }

  public String getProcessName() {
    return processName;
  }

  public void setProcessName(String processName) {
    this.processName = processName;
  }

  public long getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(long processInstanceId) {
    this.processInstanceId = processInstanceId;
  }
  
  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public long getProcessVersion() {
    return processVersion;
  }

  public void setProcessVersion(long processVersion) {
    this.processVersion = processVersion;
  }

  public HashMap<String, String> getProperties() {
    return properties;
  }
  
  public void setProperties(HashMap<String, String> properties) {
    this.properties = properties;
  }
  
  /* Following pertain to return mapped value for process instance variables */
  public String getProperty(String key) {
    return (String) this.properties.get(key);
  }

  public Property[] getProps() {
    return props;
  }

  public void setProps(Property[] props) {
    this.props = props;
  }
}

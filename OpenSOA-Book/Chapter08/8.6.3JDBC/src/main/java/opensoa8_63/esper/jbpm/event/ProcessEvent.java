package opensoa8_63.esper.jbpm.event;

import java.util.Date;
import java.util.HashMap;

public class ProcessEvent {

  private String processName;
  long processVersion;
  long processInstanceId;
  int state;
  HashMap<String, Object> properties;

  public ProcessEvent() {
    super();
  }

  public ProcessEvent(String processName, long processVersion,
      long processInstanceId, int state, HashMap<String, Object> properties) {
    super();
    this.processName = processName;
    this.processVersion = processVersion;
    this.processInstanceId = processInstanceId;
    this.state = state;
    if (properties == null)
      this.properties = new HashMap<String, Object>();
    else
      this.properties = properties;
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

  public HashMap<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(HashMap<String, Object> properties) {
    this.properties = properties;
  }
  
  /* Following pertain to return mapped value for process instance variables */
  public String getStringProperty(String key) {
    return (String) this.properties.get(key);
  }
  
  public Boolean getBooleanProperty(String key) {
    return (Boolean) this.properties.get(key);
  }
  
  public Double getDoubleProperty(String key) {
    return (Double) this.properties.get(key);
  }
  
  public Long getLongProperty(String key) {
    return (Long) this.properties.get(key);
  }

  public Date getDateProperty(String key) {
    return (Date) this.properties.get(key);
  }
  
  public Integer getIntegerProperty(String key) {
    return (Integer) this.properties.get(key);
  }
  
  public Float getFloagProperty(String key) {
    return (Float) this.properties.get(key);
  }
}

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.sca.vo.xsd;

import commonj.sdo.Type;

import java.io.Serializable;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessType#getKey <em>Key</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessType#getProcessVars <em>Process Vars</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessType#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessType#getProcessName <em>Process Name</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ProcessType extends DataObjectBase implements Serializable
{

	public final static int KEY = 0;

	public final static int PROCESS_VARS = 1;

	public final static int ACTOR_ID = 2;

	public final static int PROCESS_NAME = 3;

	public final static int SDO_PROPERTY_COUNT = 4;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_KEY = 0;

	/**
	 * The internal feature id for the '<em><b>Process Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_VARS = 1;

	/**
	 * The internal feature id for the '<em><b>Actor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ACTOR_ID = 2;

	/**
	 * The internal feature id for the '<em><b>Process Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_NAME = 3;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 4;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_KEY: return KEY;
			case _INTERNAL_PROCESS_VARS: return PROCESS_VARS;
			case _INTERNAL_ACTOR_ID: return ACTOR_ID;
			case _INTERNAL_PROCESS_NAME: return PROCESS_NAME;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_DEFAULT_;

	/**
	 * This is true if the Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean key_set_ = false;

	/**
	 * The cached value of the '{@link #getProcessVars() <em>Process Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessVars()
	 * @generated
	 * @ordered
	 */
	
	protected ProcessVarsType processVars = null;
	
	/**
	 * This is true if the Process Vars containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processVars_set_ = false;

	/**
	 * The default value of the '{@link #getActorId() <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getActorId() <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorId()
	 * @generated
	 * @ordered
	 */
	protected String actorId = ACTOR_ID_DEFAULT_;

	/**
	 * This is true if the Actor Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actorId_set_ = false;

	/**
	 * The default value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessName()
	 * @generated
	 * @ordered
	 */
	protected String processName = PROCESS_NAME_DEFAULT_;

	/**
	 * This is true if the Process Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processName_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getStaticType()
	{
		return ((XsdFactory)XsdFactory.INSTANCE).getProcessType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStaticPropertyCount()
	{
		return INTERNAL_PROPERTY_COUNT;
	}

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(String)
	 * @generated
	 */
	public String getKey()
	{
		return key;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	public void setKey(String newKey)
	{
		String oldKey = key;
		key = newKey;
		boolean oldKey_set_ = key_set_;
		key_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_KEY, oldKey, key, !oldKey_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	public void unsetKey()
	{
		String oldKey = key;
		boolean oldKey_set_ = key_set_;
		key = KEY_DEFAULT_;
		key_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_KEY, oldKey, KEY_DEFAULT_, oldKey_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	public boolean isSetKey()
	{
		return key_set_;
	}

	/**
	 * Returns the value of the '<em><b>Process Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Vars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Vars</em>' containment reference.
	 * @see #isSetProcessVars()
	 * @see #unsetProcessVars()
	 * @see #setProcessVars(ProcessVarsType)
	 * @generated
	 */
	public ProcessVarsType getProcessVars()
	{
		return processVars;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetProcessVars(ProcessVarsType newProcessVars, ChangeContext changeContext)
	{
		ProcessVarsType oldProcessVars = processVars;
		processVars = newProcessVars;
		boolean oldProcessVars_set_ = processVars_set_;
		processVars_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_PROCESS_VARS, oldProcessVars, newProcessVars, !oldProcessVars_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getProcessVars <em>Process Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Vars</em>' containment reference.
	 * @see #isSetProcessVars()
	 * @see #unsetProcessVars()
	 * @see #getProcessVars()
	 * @generated
	 */
	public void setProcessVars(ProcessVarsType newProcessVars)
	{
		if (newProcessVars != processVars)
		{
			ChangeContext changeContext = null;
			if (processVars != null)
				changeContext = inverseRemove(processVars, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_VARS, null, changeContext);
			if (newProcessVars != null)
				changeContext = inverseAdd(newProcessVars, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_VARS, null, changeContext);
			changeContext = basicSetProcessVars(newProcessVars, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldProcessVars_set_ = processVars_set_;
			processVars_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_PROCESS_VARS, newProcessVars, newProcessVars, !oldProcessVars_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetProcessVars(ChangeContext changeContext)
	{
		ProcessVarsType oldProcessVars = processVars;
		processVars = null;
		boolean oldProcessVars_set_ = processVars_set_;
		processVars_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_PROCESS_VARS, oldProcessVars, null, !oldProcessVars_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getProcessVars <em>Process Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessVars()
	 * @see #getProcessVars()
	 * @see #setProcessVars(ProcessVarsType)
	 * @generated
	 */
	public void unsetProcessVars()
	{
		if (processVars != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(processVars, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_VARS, null, changeContext);
			changeContext = basicUnsetProcessVars(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldProcessVars_set_ = processVars_set_;
			processVars_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_PROCESS_VARS, null, null, oldProcessVars_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getProcessVars <em>Process Vars</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Vars</em>' containment reference is set.
	 * @see #unsetProcessVars()
	 * @see #getProcessVars()
	 * @see #setProcessVars(ProcessVarsType)
	 * @generated
	 */
	public boolean isSetProcessVars()
	{
		return processVars_set_;
	}

	/**
	 * Returns the value of the '<em><b>Actor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Id</em>' attribute.
	 * @see #isSetActorId()
	 * @see #unsetActorId()
	 * @see #setActorId(String)
	 * @generated
	 */
	public String getActorId()
	{
		return actorId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getActorId <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Id</em>' attribute.
	 * @see #isSetActorId()
	 * @see #unsetActorId()
	 * @see #getActorId()
	 * @generated
	 */
	public void setActorId(String newActorId)
	{
		String oldActorId = actorId;
		actorId = newActorId;
		boolean oldActorId_set_ = actorId_set_;
		actorId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ACTOR_ID, oldActorId, actorId, !oldActorId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getActorId <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActorId()
	 * @see #getActorId()
	 * @see #setActorId(String)
	 * @generated
	 */
	public void unsetActorId()
	{
		String oldActorId = actorId;
		boolean oldActorId_set_ = actorId_set_;
		actorId = ACTOR_ID_DEFAULT_;
		actorId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ACTOR_ID, oldActorId, ACTOR_ID_DEFAULT_, oldActorId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getActorId <em>Actor Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actor Id</em>' attribute is set.
	 * @see #unsetActorId()
	 * @see #getActorId()
	 * @see #setActorId(String)
	 * @generated
	 */
	public boolean isSetActorId()
	{
		return actorId_set_;
	}

	/**
	 * Returns the value of the '<em><b>Process Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Name</em>' attribute.
	 * @see #isSetProcessName()
	 * @see #unsetProcessName()
	 * @see #setProcessName(String)
	 * @generated
	 */
	public String getProcessName()
	{
		return processName;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getProcessName <em>Process Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Name</em>' attribute.
	 * @see #isSetProcessName()
	 * @see #unsetProcessName()
	 * @see #getProcessName()
	 * @generated
	 */
	public void setProcessName(String newProcessName)
	{
		String oldProcessName = processName;
		processName = newProcessName;
		boolean oldProcessName_set_ = processName_set_;
		processName_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROCESS_NAME, oldProcessName, processName, !oldProcessName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getProcessName <em>Process Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessName()
	 * @see #getProcessName()
	 * @see #setProcessName(String)
	 * @generated
	 */
	public void unsetProcessName()
	{
		String oldProcessName = processName;
		boolean oldProcessName_set_ = processName_set_;
		processName = PROCESS_NAME_DEFAULT_;
		processName_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_PROCESS_NAME, oldProcessName, PROCESS_NAME_DEFAULT_, oldProcessName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessType#getProcessName <em>Process Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Name</em>' attribute is set.
	 * @see #unsetProcessName()
	 * @see #getProcessName()
	 * @see #setProcessName(String)
	 * @generated
	 */
	public boolean isSetProcessName()
	{
		return processName_set_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext inverseRemove(Object otherEnd, int propertyIndex, ChangeContext changeContext)
	{
		switch (propertyIndex)
		{
			case PROCESS_VARS:
				return basicUnsetProcessVars(changeContext);
		}
		return super.inverseRemove(otherEnd, propertyIndex, changeContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object get(int propertyIndex, boolean resolve)
	{
		switch (propertyIndex)
		{
			case KEY:
				return getKey();
			case PROCESS_VARS:
				return getProcessVars();
			case ACTOR_ID:
				return getActorId();
			case PROCESS_NAME:
				return getProcessName();
		}
		return super.get(propertyIndex, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(int propertyIndex, Object newValue)
	{
		switch (propertyIndex)
		{
			case KEY:
				setKey((String)newValue);
				return;
			case PROCESS_VARS:
				setProcessVars((ProcessVarsType)newValue);
				return;
			case ACTOR_ID:
				setActorId((String)newValue);
				return;
			case PROCESS_NAME:
				setProcessName((String)newValue);
				return;
		}
		super.set(propertyIndex, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(int propertyIndex)
	{
		switch (propertyIndex)
		{
			case KEY:
				unsetKey();
				return;
			case PROCESS_VARS:
				unsetProcessVars();
				return;
			case ACTOR_ID:
				unsetActorId();
				return;
			case PROCESS_NAME:
				unsetProcessName();
				return;
		}
		super.unset(propertyIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSet(int propertyIndex)
	{
		switch (propertyIndex)
		{
			case KEY:
				return isSetKey();
			case PROCESS_VARS:
				return isSetProcessVars();
			case ACTOR_ID:
				return isSetActorId();
			case PROCESS_NAME:
				return isSetProcessName();
		}
		return super.isSet(propertyIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString()
	{
		if (isProxy(this)) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		if (key_set_) result.append(key); else result.append("<unset>");
		result.append(", actorId: ");
		if (actorId_set_) result.append(actorId); else result.append("<unset>");
		result.append(", processName: ");
		if (processName_set_) result.append(processName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProcessType

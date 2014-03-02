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
 * A representation of the model object '<em><b>list Process Instances Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.listProcessInstancesResponse#getProcessInstances <em>Process Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class listProcessInstancesResponse extends DataObjectBase implements Serializable
{

	public final static int PROCESS_INSTANCES = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Process Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_INSTANCES = 0;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 1;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_PROCESS_INSTANCES: return PROCESS_INSTANCES;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getProcessInstances() <em>Process Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstances()
	 * @generated
	 * @ordered
	 */
	
	protected ProcessInstanceVOType processInstances = null;
	
	/**
	 * This is true if the Process Instances containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processInstances_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listProcessInstancesResponse()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getlistProcessInstancesResponse();
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
	 * Returns the value of the '<em><b>Process Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instances</em>' containment reference.
	 * @see #isSetProcessInstances()
	 * @see #unsetProcessInstances()
	 * @see #setProcessInstances(ProcessInstanceVOType)
	 * @generated
	 */
	public ProcessInstanceVOType getProcessInstances()
	{
		return processInstances;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetProcessInstances(ProcessInstanceVOType newProcessInstances, ChangeContext changeContext)
	{
		ProcessInstanceVOType oldProcessInstances = processInstances;
		processInstances = newProcessInstances;
		boolean oldProcessInstances_set_ = processInstances_set_;
		processInstances_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_PROCESS_INSTANCES, oldProcessInstances, newProcessInstances, !oldProcessInstances_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listProcessInstancesResponse#getProcessInstances <em>Process Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instances</em>' containment reference.
	 * @see #isSetProcessInstances()
	 * @see #unsetProcessInstances()
	 * @see #getProcessInstances()
	 * @generated
	 */
	public void setProcessInstances(ProcessInstanceVOType newProcessInstances)
	{
		if (newProcessInstances != processInstances)
		{
			ChangeContext changeContext = null;
			if (processInstances != null)
				changeContext = inverseRemove(processInstances, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_INSTANCES, null, changeContext);
			if (newProcessInstances != null)
				changeContext = inverseAdd(newProcessInstances, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_INSTANCES, null, changeContext);
			changeContext = basicSetProcessInstances(newProcessInstances, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldProcessInstances_set_ = processInstances_set_;
			processInstances_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_PROCESS_INSTANCES, newProcessInstances, newProcessInstances, !oldProcessInstances_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetProcessInstances(ChangeContext changeContext)
	{
		ProcessInstanceVOType oldProcessInstances = processInstances;
		processInstances = null;
		boolean oldProcessInstances_set_ = processInstances_set_;
		processInstances_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_PROCESS_INSTANCES, oldProcessInstances, null, !oldProcessInstances_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listProcessInstancesResponse#getProcessInstances <em>Process Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessInstances()
	 * @see #getProcessInstances()
	 * @see #setProcessInstances(ProcessInstanceVOType)
	 * @generated
	 */
	public void unsetProcessInstances()
	{
		if (processInstances != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(processInstances, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_INSTANCES, null, changeContext);
			changeContext = basicUnsetProcessInstances(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldProcessInstances_set_ = processInstances_set_;
			processInstances_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_PROCESS_INSTANCES, null, null, oldProcessInstances_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listProcessInstancesResponse#getProcessInstances <em>Process Instances</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Instances</em>' containment reference is set.
	 * @see #unsetProcessInstances()
	 * @see #getProcessInstances()
	 * @see #setProcessInstances(ProcessInstanceVOType)
	 * @generated
	 */
	public boolean isSetProcessInstances()
	{
		return processInstances_set_;
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
			case PROCESS_INSTANCES:
				return basicUnsetProcessInstances(changeContext);
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
			case PROCESS_INSTANCES:
				return getProcessInstances();
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
			case PROCESS_INSTANCES:
				setProcessInstances((ProcessInstanceVOType)newValue);
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
			case PROCESS_INSTANCES:
				unsetProcessInstances();
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
			case PROCESS_INSTANCES:
				return isSetProcessInstances();
		}
		return super.isSet(propertyIndex);
	}

} // listProcessInstancesResponse

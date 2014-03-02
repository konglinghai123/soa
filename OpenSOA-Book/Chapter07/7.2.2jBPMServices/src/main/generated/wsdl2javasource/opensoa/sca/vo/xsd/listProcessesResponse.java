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
 * A representation of the model object '<em><b>list Processes Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.listProcessesResponse#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class listProcessesResponse extends DataObjectBase implements Serializable
{

	public final static int PROCESSES = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESSES = 0;

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
			case _INTERNAL_PROCESSES: return PROCESSES;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	
	protected ProcessVOType processes = null;
	
	/**
	 * This is true if the Processes containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processes_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listProcessesResponse()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getlistProcessesResponse();
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
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference.
	 * @see #isSetProcesses()
	 * @see #unsetProcesses()
	 * @see #setProcesses(ProcessVOType)
	 * @generated
	 */
	public ProcessVOType getProcesses()
	{
		return processes;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetProcesses(ProcessVOType newProcesses, ChangeContext changeContext)
	{
		ProcessVOType oldProcesses = processes;
		processes = newProcesses;
		boolean oldProcesses_set_ = processes_set_;
		processes_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_PROCESSES, oldProcesses, newProcesses, !oldProcesses_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listProcessesResponse#getProcesses <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processes</em>' containment reference.
	 * @see #isSetProcesses()
	 * @see #unsetProcesses()
	 * @see #getProcesses()
	 * @generated
	 */
	public void setProcesses(ProcessVOType newProcesses)
	{
		if (newProcesses != processes)
		{
			ChangeContext changeContext = null;
			if (processes != null)
				changeContext = inverseRemove(processes, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESSES, null, changeContext);
			if (newProcesses != null)
				changeContext = inverseAdd(newProcesses, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESSES, null, changeContext);
			changeContext = basicSetProcesses(newProcesses, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldProcesses_set_ = processes_set_;
			processes_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_PROCESSES, newProcesses, newProcesses, !oldProcesses_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetProcesses(ChangeContext changeContext)
	{
		ProcessVOType oldProcesses = processes;
		processes = null;
		boolean oldProcesses_set_ = processes_set_;
		processes_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_PROCESSES, oldProcesses, null, !oldProcesses_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listProcessesResponse#getProcesses <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcesses()
	 * @see #getProcesses()
	 * @see #setProcesses(ProcessVOType)
	 * @generated
	 */
	public void unsetProcesses()
	{
		if (processes != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(processes, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_PROCESSES, null, changeContext);
			changeContext = basicUnsetProcesses(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldProcesses_set_ = processes_set_;
			processes_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_PROCESSES, null, null, oldProcesses_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listProcessesResponse#getProcesses <em>Processes</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processes</em>' containment reference is set.
	 * @see #unsetProcesses()
	 * @see #getProcesses()
	 * @see #setProcesses(ProcessVOType)
	 * @generated
	 */
	public boolean isSetProcesses()
	{
		return processes_set_;
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
			case PROCESSES:
				return basicUnsetProcesses(changeContext);
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
			case PROCESSES:
				return getProcesses();
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
			case PROCESSES:
				setProcesses((ProcessVOType)newValue);
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
			case PROCESSES:
				unsetProcesses();
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
			case PROCESSES:
				return isSetProcesses();
		}
		return super.isSet(propertyIndex);
	}

} // listProcessesResponse

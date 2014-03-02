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
 * A representation of the model object '<em><b>create Process Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.createProcessInstance#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class createProcessInstance extends DataObjectBase implements Serializable
{

	public final static int PROCESS = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS = 0;

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
			case _INTERNAL_PROCESS: return PROCESS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	
	protected ProcessType process = null;
	
	/**
	 * This is true if the Process containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean process_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public createProcessInstance()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getcreateProcessInstance();
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
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #isSetProcess()
	 * @see #unsetProcess()
	 * @see #setProcess(ProcessType)
	 * @generated
	 */
	public ProcessType getProcess()
	{
		return process;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetProcess(ProcessType newProcess, ChangeContext changeContext)
	{
		ProcessType oldProcess = process;
		process = newProcess;
		boolean oldProcess_set_ = process_set_;
		process_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_PROCESS, oldProcess, newProcess, !oldProcess_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.createProcessInstance#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #isSetProcess()
	 * @see #unsetProcess()
	 * @see #getProcess()
	 * @generated
	 */
	public void setProcess(ProcessType newProcess)
	{
		if (newProcess != process)
		{
			ChangeContext changeContext = null;
			if (process != null)
				changeContext = inverseRemove(process, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS, null, changeContext);
			if (newProcess != null)
				changeContext = inverseAdd(newProcess, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS, null, changeContext);
			changeContext = basicSetProcess(newProcess, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldProcess_set_ = process_set_;
			process_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_PROCESS, newProcess, newProcess, !oldProcess_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetProcess(ChangeContext changeContext)
	{
		ProcessType oldProcess = process;
		process = null;
		boolean oldProcess_set_ = process_set_;
		process_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_PROCESS, oldProcess, null, !oldProcess_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.createProcessInstance#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcess()
	 * @see #getProcess()
	 * @see #setProcess(ProcessType)
	 * @generated
	 */
	public void unsetProcess()
	{
		if (process != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(process, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS, null, changeContext);
			changeContext = basicUnsetProcess(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldProcess_set_ = process_set_;
			process_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_PROCESS, null, null, oldProcess_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.createProcessInstance#getProcess <em>Process</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process</em>' containment reference is set.
	 * @see #unsetProcess()
	 * @see #getProcess()
	 * @see #setProcess(ProcessType)
	 * @generated
	 */
	public boolean isSetProcess()
	{
		return process_set_;
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
			case PROCESS:
				return basicUnsetProcess(changeContext);
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
			case PROCESS:
				return getProcess();
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
			case PROCESS:
				setProcess((ProcessType)newValue);
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
			case PROCESS:
				unsetProcess();
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
			case PROCESS:
				return isSetProcess();
		}
		return super.isSet(propertyIndex);
	}

} // createProcessInstance

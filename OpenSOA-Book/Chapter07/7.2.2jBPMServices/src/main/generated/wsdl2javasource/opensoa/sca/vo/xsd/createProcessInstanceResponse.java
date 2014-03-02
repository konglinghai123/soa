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
 * A representation of the model object '<em><b>create Process Instance Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.createProcessInstanceResponse#getProcessInstanceId <em>Process Instance Id</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class createProcessInstanceResponse extends DataObjectBase implements Serializable
{

	public final static int PROCESS_INSTANCE_ID = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Process Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_INSTANCE_ID = 0;

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
			case _INTERNAL_PROCESS_INSTANCE_ID: return PROCESS_INSTANCE_ID;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getProcessInstanceId() <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final long PROCESS_INSTANCE_ID_DEFAULT_ = 0L;

	/**
	 * The cached value of the '{@link #getProcessInstanceId() <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstanceId()
	 * @generated
	 * @ordered
	 */
	protected long processInstanceId = PROCESS_INSTANCE_ID_DEFAULT_;

	/**
	 * This is true if the Process Instance Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processInstanceId_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public createProcessInstanceResponse()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getcreateProcessInstanceResponse();
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
	 * Returns the value of the '<em><b>Process Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instance Id</em>' attribute.
	 * @see #isSetProcessInstanceId()
	 * @see #unsetProcessInstanceId()
	 * @see #setProcessInstanceId(long)
	 * @generated
	 */
	public long getProcessInstanceId()
	{
		return processInstanceId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.createProcessInstanceResponse#getProcessInstanceId <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instance Id</em>' attribute.
	 * @see #isSetProcessInstanceId()
	 * @see #unsetProcessInstanceId()
	 * @see #getProcessInstanceId()
	 * @generated
	 */
	public void setProcessInstanceId(long newProcessInstanceId)
	{
		long oldProcessInstanceId = processInstanceId;
		processInstanceId = newProcessInstanceId;
		boolean oldProcessInstanceId_set_ = processInstanceId_set_;
		processInstanceId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROCESS_INSTANCE_ID, oldProcessInstanceId, processInstanceId, !oldProcessInstanceId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.createProcessInstanceResponse#getProcessInstanceId <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessInstanceId()
	 * @see #getProcessInstanceId()
	 * @see #setProcessInstanceId(long)
	 * @generated
	 */
	public void unsetProcessInstanceId()
	{
		long oldProcessInstanceId = processInstanceId;
		boolean oldProcessInstanceId_set_ = processInstanceId_set_;
		processInstanceId = PROCESS_INSTANCE_ID_DEFAULT_;
		processInstanceId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_PROCESS_INSTANCE_ID, oldProcessInstanceId, PROCESS_INSTANCE_ID_DEFAULT_, oldProcessInstanceId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.createProcessInstanceResponse#getProcessInstanceId <em>Process Instance Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Instance Id</em>' attribute is set.
	 * @see #unsetProcessInstanceId()
	 * @see #getProcessInstanceId()
	 * @see #setProcessInstanceId(long)
	 * @generated
	 */
	public boolean isSetProcessInstanceId()
	{
		return processInstanceId_set_;
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
			case PROCESS_INSTANCE_ID:
				return new Long(getProcessInstanceId());
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
			case PROCESS_INSTANCE_ID:
				setProcessInstanceId(((Long)newValue).longValue());
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
			case PROCESS_INSTANCE_ID:
				unsetProcessInstanceId();
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
			case PROCESS_INSTANCE_ID:
				return isSetProcessInstanceId();
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
		result.append(" (processInstanceId: ");
		if (processInstanceId_set_) result.append(processInstanceId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // createProcessInstanceResponse

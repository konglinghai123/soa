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
 * A representation of the model object '<em><b>list Instance Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.listInstanceTasks#getProcessInstanceId <em>Process Instance Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.listInstanceTasks#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class listInstanceTasks extends DataObjectBase implements Serializable
{

	public final static int PROCESS_INSTANCE_ID = 0;

	public final static int FILTER = 1;

	public final static int SDO_PROPERTY_COUNT = 2;

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
	 * The internal feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_FILTER = 1;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 2;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_PROCESS_INSTANCE_ID: return PROCESS_INSTANCE_ID;
			case _INTERNAL_FILTER: return FILTER;
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
	protected static final Long PROCESS_INSTANCE_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getProcessInstanceId() <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstanceId()
	 * @generated
	 * @ordered
	 */
	protected Long processInstanceId = PROCESS_INSTANCE_ID_DEFAULT_;

	/**
	 * This is true if the Process Instance Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processInstanceId_set_ = false;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_DEFAULT_;

	/**
	 * This is true if the Filter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filter_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listInstanceTasks()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getlistInstanceTasks();
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
	 * @see #setProcessInstanceId(Long)
	 * @generated
	 */
	public Long getProcessInstanceId()
	{
		return processInstanceId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasks#getProcessInstanceId <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instance Id</em>' attribute.
	 * @see #isSetProcessInstanceId()
	 * @see #unsetProcessInstanceId()
	 * @see #getProcessInstanceId()
	 * @generated
	 */
	public void setProcessInstanceId(Long newProcessInstanceId)
	{
		Long oldProcessInstanceId = processInstanceId;
		processInstanceId = newProcessInstanceId;
		boolean oldProcessInstanceId_set_ = processInstanceId_set_;
		processInstanceId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROCESS_INSTANCE_ID, oldProcessInstanceId, processInstanceId, !oldProcessInstanceId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasks#getProcessInstanceId <em>Process Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessInstanceId()
	 * @see #getProcessInstanceId()
	 * @see #setProcessInstanceId(Long)
	 * @generated
	 */
	public void unsetProcessInstanceId()
	{
		Long oldProcessInstanceId = processInstanceId;
		boolean oldProcessInstanceId_set_ = processInstanceId_set_;
		processInstanceId = PROCESS_INSTANCE_ID_DEFAULT_;
		processInstanceId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_PROCESS_INSTANCE_ID, oldProcessInstanceId, PROCESS_INSTANCE_ID_DEFAULT_, oldProcessInstanceId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasks#getProcessInstanceId <em>Process Instance Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Instance Id</em>' attribute is set.
	 * @see #unsetProcessInstanceId()
	 * @see #getProcessInstanceId()
	 * @see #setProcessInstanceId(Long)
	 * @generated
	 */
	public boolean isSetProcessInstanceId()
	{
		return processInstanceId_set_;
	}

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(String)
	 * @generated
	 */
	public String getFilter()
	{
		return filter;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasks#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @generated
	 */
	public void setFilter(String newFilter)
	{
		String oldFilter = filter;
		filter = newFilter;
		boolean oldFilter_set_ = filter_set_;
		filter_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_FILTER, oldFilter, filter, !oldFilter_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasks#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #getFilter()
	 * @see #setFilter(String)
	 * @generated
	 */
	public void unsetFilter()
	{
		String oldFilter = filter;
		boolean oldFilter_set_ = filter_set_;
		filter = FILTER_DEFAULT_;
		filter_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_FILTER, oldFilter, FILTER_DEFAULT_, oldFilter_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasks#getFilter <em>Filter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' attribute is set.
	 * @see #unsetFilter()
	 * @see #getFilter()
	 * @see #setFilter(String)
	 * @generated
	 */
	public boolean isSetFilter()
	{
		return filter_set_;
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
				return getProcessInstanceId();
			case FILTER:
				return getFilter();
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
				setProcessInstanceId((Long)newValue);
				return;
			case FILTER:
				setFilter((String)newValue);
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
			case FILTER:
				unsetFilter();
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
			case FILTER:
				return isSetFilter();
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
		result.append(" (ProcessInstanceId: ");
		if (processInstanceId_set_) result.append(processInstanceId); else result.append("<unset>");
		result.append(", Filter: ");
		if (filter_set_) result.append(filter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // listInstanceTasks

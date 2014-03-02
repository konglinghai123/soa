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
 * A representation of the model object '<em><b>list Process Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.listProcessInstances#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.listProcessInstances#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class listProcessInstances extends DataObjectBase implements Serializable
{

	public final static int PROCESS_ID = 0;

	public final static int FILTER = 1;

	public final static int SDO_PROPERTY_COUNT = 2;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_ID = 0;

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
			case _INTERNAL_PROCESS_ID: return PROCESS_ID;
			case _INTERNAL_FILTER: return FILTER;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROCESS_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected Long processId = PROCESS_ID_DEFAULT_;

	/**
	 * This is true if the Process Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processId_set_ = false;

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
	public listProcessInstances()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getlistProcessInstances();
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
	 * Returns the value of the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Id</em>' attribute.
	 * @see #isSetProcessId()
	 * @see #unsetProcessId()
	 * @see #setProcessId(Long)
	 * @generated
	 */
	public Long getProcessId()
	{
		return processId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listProcessInstances#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Id</em>' attribute.
	 * @see #isSetProcessId()
	 * @see #unsetProcessId()
	 * @see #getProcessId()
	 * @generated
	 */
	public void setProcessId(Long newProcessId)
	{
		Long oldProcessId = processId;
		processId = newProcessId;
		boolean oldProcessId_set_ = processId_set_;
		processId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROCESS_ID, oldProcessId, processId, !oldProcessId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listProcessInstances#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessId()
	 * @see #getProcessId()
	 * @see #setProcessId(Long)
	 * @generated
	 */
	public void unsetProcessId()
	{
		Long oldProcessId = processId;
		boolean oldProcessId_set_ = processId_set_;
		processId = PROCESS_ID_DEFAULT_;
		processId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_PROCESS_ID, oldProcessId, PROCESS_ID_DEFAULT_, oldProcessId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listProcessInstances#getProcessId <em>Process Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Id</em>' attribute is set.
	 * @see #unsetProcessId()
	 * @see #getProcessId()
	 * @see #setProcessId(Long)
	 * @generated
	 */
	public boolean isSetProcessId()
	{
		return processId_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listProcessInstances#getFilter <em>Filter</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listProcessInstances#getFilter <em>Filter</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listProcessInstances#getFilter <em>Filter</em>}' attribute is set.
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
			case PROCESS_ID:
				return getProcessId();
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
			case PROCESS_ID:
				setProcessId((Long)newValue);
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
			case PROCESS_ID:
				unsetProcessId();
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
			case PROCESS_ID:
				return isSetProcessId();
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
		result.append(" (ProcessId: ");
		if (processId_set_) result.append(processId); else result.append("<unset>");
		result.append(", Filter: ");
		if (filter_set_) result.append(filter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // listProcessInstances

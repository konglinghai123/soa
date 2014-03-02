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
 * A representation of the model object '<em><b>list Actor Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.listActorTasks#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.listActorTasks#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class listActorTasks extends DataObjectBase implements Serializable
{

	public final static int ACTOR_ID = 0;

	public final static int FILTER = 1;

	public final static int SDO_PROPERTY_COUNT = 2;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Actor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ACTOR_ID = 0;

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
			case _INTERNAL_ACTOR_ID: return ACTOR_ID;
			case _INTERNAL_FILTER: return FILTER;
		}
		return super.internalConvertIndex(internalIndex);
	}


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
	public listActorTasks()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getlistActorTasks();
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listActorTasks#getActorId <em>Actor Id</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listActorTasks#getActorId <em>Actor Id</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listActorTasks#getActorId <em>Actor Id</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listActorTasks#getFilter <em>Filter</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listActorTasks#getFilter <em>Filter</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listActorTasks#getFilter <em>Filter</em>}' attribute is set.
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
			case ACTOR_ID:
				return getActorId();
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
			case ACTOR_ID:
				setActorId((String)newValue);
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
			case ACTOR_ID:
				unsetActorId();
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
			case ACTOR_ID:
				return isSetActorId();
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
		result.append(" (actorId: ");
		if (actorId_set_) result.append(actorId); else result.append("<unset>");
		result.append(", Filter: ");
		if (filter_set_) result.append(filter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // listActorTasks

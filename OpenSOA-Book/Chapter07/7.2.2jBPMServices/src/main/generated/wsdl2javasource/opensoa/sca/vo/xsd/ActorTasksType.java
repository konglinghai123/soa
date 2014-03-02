/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.sca.vo.xsd;

import commonj.sdo.Type;

import java.io.Serializable;

import java.util.Collection;
import java.util.List;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Tasks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ActorTasksType#getPooled <em>Pooled</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ActorTasksType#getAssigned <em>Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ActorTasksType extends DataObjectBase implements Serializable
{

	public final static int POOLED = 0;

	public final static int ASSIGNED = 1;

	public final static int SDO_PROPERTY_COUNT = 2;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Pooled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POOLED = 0;

	/**
	 * The internal feature id for the '<em><b>Assigned</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ASSIGNED = 1;

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
			case _INTERNAL_POOLED: return POOLED;
			case _INTERNAL_ASSIGNED: return ASSIGNED;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getPooled() <em>Pooled</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooled()
	 * @generated
	 * @ordered
	 */
	
	protected List pooled = null;
	
	/**
	 * The cached value of the '{@link #getAssigned() <em>Assigned</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigned()
	 * @generated
	 * @ordered
	 */
	
	protected List assigned = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorTasksType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getActorTasksType();
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
	 * Returns the value of the '<em><b>Pooled</b></em>' containment reference list.
	 * The list contents are of type {@link opensoa.sca.vo.xsd.TaskVO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pooled</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pooled</em>' containment reference list.
	 * @generated
	 */
	public List getPooled()
	{
		if (pooled == null)
		{
		  pooled = createPropertyList(ListKind.CONTAINMENT, TaskVO.class, POOLED, 0);
		}
		return pooled;
	}
	/**
	 * Returns the value of the '<em><b>Assigned</b></em>' containment reference list.
	 * The list contents are of type {@link opensoa.sca.vo.xsd.TaskVO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned</em>' containment reference list.
	 * @generated
	 */
	public List getAssigned()
	{
		if (assigned == null)
		{
		  assigned = createPropertyList(ListKind.CONTAINMENT, TaskVO.class, ASSIGNED, 0);
		}
		return assigned;
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
			case POOLED:
				return removeFromList(getPooled(), otherEnd, changeContext);
			case ASSIGNED:
				return removeFromList(getAssigned(), otherEnd, changeContext);
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
			case POOLED:
				return getPooled();
			case ASSIGNED:
				return getAssigned();
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
			case POOLED:
				getPooled().clear();
				getPooled().addAll((Collection)newValue);
				return;
			case ASSIGNED:
				getAssigned().clear();
				getAssigned().addAll((Collection)newValue);
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
			case POOLED:
				getPooled().clear();
				return;
			case ASSIGNED:
				getAssigned().clear();
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
			case POOLED:
				return pooled != null && !pooled.isEmpty();
			case ASSIGNED:
				return assigned != null && !assigned.isEmpty();
		}
		return super.isSet(propertyIndex);
	}

} // ActorTasksType

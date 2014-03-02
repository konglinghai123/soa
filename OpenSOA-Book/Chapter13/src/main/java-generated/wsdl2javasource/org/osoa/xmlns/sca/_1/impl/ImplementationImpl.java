/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Type;

import java.util.List;

import org.apache.tuscany.sdo.impl.DataObjectBase;

import org.osoa.xmlns.sca._1.Implementation;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ImplementationImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ImplementationImpl#getPolicySets <em>Policy Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ImplementationImpl extends DataObjectBase implements Implementation
{

	public final static int REQUIRES = 0;

	public final static int POLICY_SETS = 1;

	public final static int SDO_PROPERTY_COUNT = 2;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REQUIRES = 0;

	/**
	 * The internal feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POLICY_SETS = 1;

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
			case _INTERNAL_REQUIRES: return REQUIRES;
			case _INTERNAL_POLICY_SETS: return POLICY_SETS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected static final List REQUIRES_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected List requires = REQUIRES_DEFAULT_;

	/**
	 * The default value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicySets()
	 * @generated
	 * @ordered
	 */
	protected static final List POLICY_SETS_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicySets()
	 * @generated
	 * @ordered
	 */
	protected List policySets = POLICY_SETS_DEFAULT_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getImplementation();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getRequires()
	{
		return requires;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequires(List newRequires)
	{
		List oldRequires = requires;
		requires = newRequires;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_REQUIRES, oldRequires, requires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPolicySets()
	{
		return policySets;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicySets(List newPolicySets)
	{
		List oldPolicySets = policySets;
		policySets = newPolicySets;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_POLICY_SETS, oldPolicySets, policySets);
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
			case REQUIRES:
				return getRequires();
			case POLICY_SETS:
				return getPolicySets();
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
			case REQUIRES:
				setRequires((List)newValue);
				return;
			case POLICY_SETS:
				setPolicySets((List)newValue);
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
			case REQUIRES:
				setRequires(REQUIRES_DEFAULT_);
				return;
			case POLICY_SETS:
				setPolicySets(POLICY_SETS_DEFAULT_);
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
			case REQUIRES:
				return REQUIRES_DEFAULT_ == null ? requires != null : !REQUIRES_DEFAULT_.equals(requires);
			case POLICY_SETS:
				return POLICY_SETS_DEFAULT_ == null ? policySets != null : !POLICY_SETS_DEFAULT_.equals(policySets);
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
		result.append(" (requires: ");
		result.append(requires);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(')');
		return result.toString();
	}

	public static class ConcreteBase extends ImplementationImpl
	{
		public ConcreteBase()
		{
			super();
		}
	}
	
} //ImplementationImpl

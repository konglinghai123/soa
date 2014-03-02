/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Type;

import java.util.Collection;
import java.util.List;

import org.apache.tuscany.sdo.impl.DataObjectBase;

import org.osoa.xmlns.sca._1.Binding;
import org.osoa.xmlns.sca._1.Operation;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingImpl#getPolicySets <em>Policy Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BindingImpl extends DataObjectBase implements Binding
{

	public final static int OPERATION = 0;

	public final static int URI = 1;

	public final static int NAME = 2;

	public final static int REQUIRES = 3;

	public final static int POLICY_SETS = 4;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OPERATION = 0;

	/**
	 * The internal feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_URI = 1;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 2;

	/**
	 * The internal feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REQUIRES = 3;

	/**
	 * The internal feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POLICY_SETS = 4;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 5;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_OPERATION: return OPERATION;
			case _INTERNAL_URI: return URI;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_REQUIRES: return REQUIRES;
			case _INTERNAL_POLICY_SETS: return POLICY_SETS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	
	protected List operation = null;
	
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_DEFAULT_;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_DEFAULT_;

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
	public BindingImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getBinding();
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
	public List getOperation()
	{
		if (operation == null)
		{
		  operation = createPropertyList(ListKind.NONCONTAINMENT, Operation.class, OPERATION, 0);
		}
		return operation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri()
	{
		return uri;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri)
	{
		String oldUri = uri;
		uri = newUri;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_URI, oldUri, uri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_NAME, oldName, name);
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
			case OPERATION:
				return getOperation();
			case URI:
				return getUri();
			case NAME:
				return getName();
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
			case OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection)newValue);
				return;
			case URI:
				setUri((String)newValue);
				return;
			case NAME:
				setName((String)newValue);
				return;
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
			case OPERATION:
				getOperation().clear();
				return;
			case URI:
				setUri(URI_DEFAULT_);
				return;
			case NAME:
				setName(NAME_DEFAULT_);
				return;
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
			case OPERATION:
				return operation != null && !operation.isEmpty();
			case URI:
				return URI_DEFAULT_ == null ? uri != null : !URI_DEFAULT_.equals(uri);
			case NAME:
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", name: ");
		result.append(name);
		result.append(", requires: ");
		result.append(requires);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(')');
		return result.toString();
	}

	public static class ConcreteBase extends BindingImpl
	{
		public ConcreteBase()
		{
			super();
		}
	}
	
} //BindingImpl

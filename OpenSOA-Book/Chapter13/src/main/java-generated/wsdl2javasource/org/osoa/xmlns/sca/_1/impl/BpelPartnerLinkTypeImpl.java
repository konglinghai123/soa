/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Sequence;
import commonj.sdo.Type;

import org.osoa.xmlns.sca._1.BpelPartnerLinkType;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bpel Partner Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BpelPartnerLinkTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BpelPartnerLinkTypeImpl#getType_ <em>Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BpelPartnerLinkTypeImpl#getServiceRole <em>Service Role</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BpelPartnerLinkTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BpelPartnerLinkTypeImpl extends InterfaceImpl implements BpelPartnerLinkType
{

	public final static int ANY = InterfaceImpl.EXTENDED_PROPERTY_COUNT + -1;

	public final static int TYPE = InterfaceImpl.SDO_PROPERTY_COUNT + 0;

	public final static int SERVICE_ROLE = InterfaceImpl.SDO_PROPERTY_COUNT + 1;

	public final static int ANY_ATTRIBUTE = InterfaceImpl.EXTENDED_PROPERTY_COUNT + -2;

	public final static int SDO_PROPERTY_COUNT = InterfaceImpl.SDO_PROPERTY_COUNT + 2;

	public final static int EXTENDED_PROPERTY_COUNT = InterfaceImpl.EXTENDED_PROPERTY_COUNT - 2;


	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 0;

	/**
	 * The internal feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TYPE = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 1;

	/**
	 * The internal feature id for the '<em><b>Service Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SERVICE_ROLE = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 2;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 3;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 4;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_TYPE: return TYPE;
			case _INTERNAL_SERVICE_ROLE: return SERVICE_ROLE;
			case _INTERNAL_ANY_ATTRIBUTE: return ANY_ATTRIBUTE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence any = null;
	
	/**
	 * The default value of the '{@link #getType_() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getType_() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_DEFAULT_;

	/**
	 * The default value of the '{@link #getServiceRole() <em>Service Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRole()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ROLE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getServiceRole() <em>Service Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRole()
	 * @generated
	 * @ordered
	 */
	protected String serviceRole = SERVICE_ROLE_DEFAULT_;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence anyAttribute = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpelPartnerLinkTypeImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getBpelPartnerLinkType();
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
	public Sequence getAny()
	{
		if (any == null)
		{
		  any = createSequence(_INTERNAL_ANY);
		}
		return any;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_()
	{
		return type;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TYPE, oldType, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceRole()
	{
		return serviceRole;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRole(String newServiceRole)
	{
		String oldServiceRole = serviceRole;
		serviceRole = newServiceRole;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SERVICE_ROLE, oldServiceRole, serviceRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getAnyAttribute()
	{
		if (anyAttribute == null)
		{
		  anyAttribute = createSequence(_INTERNAL_ANY_ATTRIBUTE);
		}
		return anyAttribute;
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
			case ANY:
				return removeFromSequence(getAny(), otherEnd, changeContext);
			case ANY_ATTRIBUTE:
				return removeFromSequence(getAnyAttribute(), otherEnd, changeContext);
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
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case TYPE:
				return getType_();
			case SERVICE_ROLE:
				return getServiceRole();
			case ANY_ATTRIBUTE:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAnyAttribute();
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
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case TYPE:
				setType((String)newValue);
				return;
			case SERVICE_ROLE:
				setServiceRole((String)newValue);
				return;
			case ANY_ATTRIBUTE:
      	setSequence(getAnyAttribute(), newValue);
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
			case ANY:
				unsetSequence(getAny());
				return;
			case TYPE:
				setType(TYPE_DEFAULT_);
				return;
			case SERVICE_ROLE:
				setServiceRole(SERVICE_ROLE_DEFAULT_);
				return;
			case ANY_ATTRIBUTE:
				unsetSequence(getAnyAttribute());
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
			case ANY:
				return any != null && !isSequenceEmpty(getAny());
			case TYPE:
				return TYPE_DEFAULT_ == null ? type != null : !TYPE_DEFAULT_.equals(type);
			case SERVICE_ROLE:
				return SERVICE_ROLE_DEFAULT_ == null ? serviceRole != null : !SERVICE_ROLE_DEFAULT_.equals(serviceRole);
			case ANY_ATTRIBUTE:
				return anyAttribute != null && !isSequenceEmpty(getAnyAttribute());
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
		result.append(" (any: ");
		result.append(any);
		result.append(", type: ");
		result.append(type);
		result.append(", serviceRole: ");
		result.append(serviceRole);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //BpelPartnerLinkTypeImpl

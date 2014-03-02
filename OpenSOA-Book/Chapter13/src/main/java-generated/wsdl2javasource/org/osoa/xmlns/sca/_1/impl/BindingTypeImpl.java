/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Sequence;
import commonj.sdo.Type;

import java.util.List;

import org.apache.tuscany.sdo.impl.DataObjectBase;

import org.osoa.xmlns.sca._1.BindingType;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingTypeImpl#getType_ <em>Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingTypeImpl#getAlwaysProvides <em>Always Provides</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingTypeImpl#getMayProvide <em>May Provide</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.BindingTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingTypeImpl extends DataObjectBase implements BindingType
{

	public final static int GROUP = -1;

	public final static int ANY = -2;

	public final static int TYPE = 0;

	public final static int ALWAYS_PROVIDES = 1;

	public final static int MAY_PROVIDE = 2;

	public final static int ANY_ATTRIBUTE = -3;

	public final static int SDO_PROPERTY_COUNT = 3;

	public final static int EXTENDED_PROPERTY_COUNT = -3;


	/**
	 * The internal feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_GROUP = 0;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 1;

	/**
	 * The internal feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TYPE = 2;

	/**
	 * The internal feature id for the '<em><b>Always Provides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ALWAYS_PROVIDES = 3;

	/**
	 * The internal feature id for the '<em><b>May Provide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_MAY_PROVIDE = 4;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = 5;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 6;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_GROUP: return GROUP;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_TYPE: return TYPE;
			case _INTERNAL_ALWAYS_PROVIDES: return ALWAYS_PROVIDES;
			case _INTERNAL_MAY_PROVIDE: return MAY_PROVIDE;
			case _INTERNAL_ANY_ATTRIBUTE: return ANY_ATTRIBUTE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence group = null;
	
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
	 * The default value of the '{@link #getAlwaysProvides() <em>Always Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysProvides()
	 * @generated
	 * @ordered
	 */
	protected static final List ALWAYS_PROVIDES_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getAlwaysProvides() <em>Always Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysProvides()
	 * @generated
	 * @ordered
	 */
	protected List alwaysProvides = ALWAYS_PROVIDES_DEFAULT_;

	/**
	 * The default value of the '{@link #getMayProvide() <em>May Provide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayProvide()
	 * @generated
	 * @ordered
	 */
	protected static final List MAY_PROVIDE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getMayProvide() <em>May Provide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayProvide()
	 * @generated
	 * @ordered
	 */
	protected List mayProvide = MAY_PROVIDE_DEFAULT_;

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
	public BindingTypeImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getBindingType();
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
	public Sequence getGroup()
	{
		if (group == null)
		{
		  group = createSequence(_INTERNAL_GROUP);
		}
		return group;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getAny()
	{
		return createSequence(getGroup(), getType(), _INTERNAL_ANY);
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
	public List getAlwaysProvides()
	{
		return alwaysProvides;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlwaysProvides(List newAlwaysProvides)
	{
		List oldAlwaysProvides = alwaysProvides;
		alwaysProvides = newAlwaysProvides;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ALWAYS_PROVIDES, oldAlwaysProvides, alwaysProvides);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMayProvide()
	{
		return mayProvide;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayProvide(List newMayProvide)
	{
		List oldMayProvide = mayProvide;
		mayProvide = newMayProvide;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_MAY_PROVIDE, oldMayProvide, mayProvide);
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
			case GROUP:
				return removeFromSequence(getGroup(), otherEnd, changeContext);
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
			case GROUP:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getGroup();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case TYPE:
				return getType_();
			case ALWAYS_PROVIDES:
				return getAlwaysProvides();
			case MAY_PROVIDE:
				return getMayProvide();
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
			case GROUP:
      	setSequence(getGroup(), newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case TYPE:
				setType((String)newValue);
				return;
			case ALWAYS_PROVIDES:
				setAlwaysProvides((List)newValue);
				return;
			case MAY_PROVIDE:
				setMayProvide((List)newValue);
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
			case GROUP:
				unsetSequence(getGroup());
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case TYPE:
				setType(TYPE_DEFAULT_);
				return;
			case ALWAYS_PROVIDES:
				setAlwaysProvides(ALWAYS_PROVIDES_DEFAULT_);
				return;
			case MAY_PROVIDE:
				setMayProvide(MAY_PROVIDE_DEFAULT_);
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
			case GROUP:
				return group != null && !isSequenceEmpty(getGroup());
			case ANY:
				return !isSequenceEmpty(getAny());
			case TYPE:
				return TYPE_DEFAULT_ == null ? type != null : !TYPE_DEFAULT_.equals(type);
			case ALWAYS_PROVIDES:
				return ALWAYS_PROVIDES_DEFAULT_ == null ? alwaysProvides != null : !ALWAYS_PROVIDES_DEFAULT_.equals(alwaysProvides);
			case MAY_PROVIDE:
				return MAY_PROVIDE_DEFAULT_ == null ? mayProvide != null : !MAY_PROVIDE_DEFAULT_.equals(mayProvide);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", type: ");
		result.append(type);
		result.append(", alwaysProvides: ");
		result.append(alwaysProvides);
		result.append(", mayProvide: ");
		result.append(mayProvide);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //BindingTypeImpl

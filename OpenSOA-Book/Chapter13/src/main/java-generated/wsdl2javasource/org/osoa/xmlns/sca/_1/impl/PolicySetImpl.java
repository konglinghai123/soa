/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Sequence;
import commonj.sdo.Type;

import java.util.Collection;
import java.util.List;

import org.apache.tuscany.sdo.impl.DataObjectBase;

import org.osoa.xmlns.sca._1.PolicySet;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getPolicySetReference <em>Policy Set Reference</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getIntentMap <em>Intent Map</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PolicySetImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicySetImpl extends DataObjectBase implements PolicySet
{

	public final static int GROUP = -1;

	public final static int POLICY_SET_REFERENCE = 0;

	public final static int INTENT_MAP = 1;

	public final static int ANY = -2;

	public final static int NAME = 2;

	public final static int PROVIDES = 3;

	public final static int APPLIES_TO = 4;

	public final static int ANY_ATTRIBUTE = -3;

	public final static int SDO_PROPERTY_COUNT = 5;

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
	 * The internal feature id for the '<em><b>Policy Set Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POLICY_SET_REFERENCE = 1;

	/**
	 * The internal feature id for the '<em><b>Intent Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INTENT_MAP = 2;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 3;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 4;

	/**
	 * The internal feature id for the '<em><b>Provides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROVIDES = 5;

	/**
	 * The internal feature id for the '<em><b>Applies To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_APPLIES_TO = 6;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = 7;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 8;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_GROUP: return GROUP;
			case _INTERNAL_POLICY_SET_REFERENCE: return POLICY_SET_REFERENCE;
			case _INTERNAL_INTENT_MAP: return INTENT_MAP;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_PROVIDES: return PROVIDES;
			case _INTERNAL_APPLIES_TO: return APPLIES_TO;
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
	 * The default value of the '{@link #getProvides() <em>Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected static final List PROVIDES_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected List provides = PROVIDES_DEFAULT_;

	/**
	 * The default value of the '{@link #getAppliesTo() <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIES_TO_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected String appliesTo = APPLIES_TO_DEFAULT_;

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
	public PolicySetImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getPolicySet();
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
	public List getPolicySetReference()
	{
		return getList(getGroup(), getType(), _INTERNAL_POLICY_SET_REFERENCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getIntentMap()
	{
		return getList(getGroup(), getType(), _INTERNAL_INTENT_MAP);
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
	public List getProvides()
	{
		return provides;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvides(List newProvides)
	{
		List oldProvides = provides;
		provides = newProvides;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROVIDES, oldProvides, provides);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppliesTo()
	{
		return appliesTo;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesTo(String newAppliesTo)
	{
		String oldAppliesTo = appliesTo;
		appliesTo = newAppliesTo;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_APPLIES_TO, oldAppliesTo, appliesTo);
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
			case POLICY_SET_REFERENCE:
				return getPolicySetReference();
			case INTENT_MAP:
				return getIntentMap();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case NAME:
				return getName();
			case PROVIDES:
				return getProvides();
			case APPLIES_TO:
				return getAppliesTo();
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
			case POLICY_SET_REFERENCE:
				getPolicySetReference().clear();
				getPolicySetReference().addAll((Collection)newValue);
				return;
			case INTENT_MAP:
				getIntentMap().clear();
				getIntentMap().addAll((Collection)newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case NAME:
				setName((String)newValue);
				return;
			case PROVIDES:
				setProvides((List)newValue);
				return;
			case APPLIES_TO:
				setAppliesTo((String)newValue);
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
			case POLICY_SET_REFERENCE:
				getPolicySetReference().clear();
				return;
			case INTENT_MAP:
				getIntentMap().clear();
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case NAME:
				setName(NAME_DEFAULT_);
				return;
			case PROVIDES:
				setProvides(PROVIDES_DEFAULT_);
				return;
			case APPLIES_TO:
				setAppliesTo(APPLIES_TO_DEFAULT_);
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
			case POLICY_SET_REFERENCE:
				return !getPolicySetReference().isEmpty();
			case INTENT_MAP:
				return !getIntentMap().isEmpty();
			case ANY:
				return !isSequenceEmpty(getAny());
			case NAME:
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
			case PROVIDES:
				return PROVIDES_DEFAULT_ == null ? provides != null : !PROVIDES_DEFAULT_.equals(provides);
			case APPLIES_TO:
				return APPLIES_TO_DEFAULT_ == null ? appliesTo != null : !APPLIES_TO_DEFAULT_.equals(appliesTo);
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
		result.append(", name: ");
		result.append(name);
		result.append(", provides: ");
		result.append(provides);
		result.append(", appliesTo: ");
		result.append(appliesTo);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PolicySetImpl

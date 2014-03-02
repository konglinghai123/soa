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

import org.osoa.xmlns.sca._1.IntentMap;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentMapImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentMapImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentMapImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentMapImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentMapImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentMapImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentMapImpl extends DataObjectBase implements IntentMap
{

	public final static int GROUP = -1;

	public final static int QUALIFIER = 0;

	public final static int ANY = -2;

	public final static int PROVIDES = 1;

	public final static int DEFAULT = 2;

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
	 * The internal feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_QUALIFIER = 1;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 2;

	/**
	 * The internal feature id for the '<em><b>Provides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROVIDES = 3;

	/**
	 * The internal feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DEFAULT = 4;

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
			case _INTERNAL_QUALIFIER: return QUALIFIER;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_PROVIDES: return PROVIDES;
			case _INTERNAL_DEFAULT: return DEFAULT;
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
	 * The default value of the '{@link #getProvides() <em>Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDES_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected String provides = PROVIDES_DEFAULT_;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_DEFAULT_;

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
	public IntentMapImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getIntentMap();
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
	public List getQualifier()
	{
		return getList(getGroup(), getType(), _INTERNAL_QUALIFIER);
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
	public String getProvides()
	{
		return provides;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvides(String newProvides)
	{
		String oldProvides = provides;
		provides = newProvides;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROVIDES, oldProvides, provides);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault()
	{
		return default_;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault)
	{
		String oldDefault = default_;
		default_ = newDefault;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DEFAULT, oldDefault, default_);
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
			case QUALIFIER:
				return getQualifier();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case PROVIDES:
				return getProvides();
			case DEFAULT:
				return getDefault();
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
			case QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection)newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case PROVIDES:
				setProvides((String)newValue);
				return;
			case DEFAULT:
				setDefault((String)newValue);
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
			case QUALIFIER:
				getQualifier().clear();
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case PROVIDES:
				setProvides(PROVIDES_DEFAULT_);
				return;
			case DEFAULT:
				setDefault(DEFAULT_DEFAULT_);
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
			case QUALIFIER:
				return !getQualifier().isEmpty();
			case ANY:
				return !isSequenceEmpty(getAny());
			case PROVIDES:
				return PROVIDES_DEFAULT_ == null ? provides != null : !PROVIDES_DEFAULT_.equals(provides);
			case DEFAULT:
				return DEFAULT_DEFAULT_ == null ? default_ != null : !DEFAULT_DEFAULT_.equals(default_);
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
		result.append(", provides: ");
		result.append(provides);
		result.append(", default: ");
		result.append(default_);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //IntentMapImpl

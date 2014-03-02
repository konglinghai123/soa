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

import org.osoa.xmlns.sca._1.Intent;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentImpl#getConstrains <em>Constrains</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.IntentImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentImpl extends DataObjectBase implements Intent
{

	public final static int DESCRIPTION = 0;

	public final static int ANY = -1;

	public final static int NAME = 1;

	public final static int CONSTRAINS = 2;

	public final static int REQUIRES = 3;

	public final static int EXCLUDES = 4;

	public final static int ANY_ATTRIBUTE = -2;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = -2;


	/**
	 * The internal feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DESCRIPTION = 0;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 1;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 2;

	/**
	 * The internal feature id for the '<em><b>Constrains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CONSTRAINS = 3;

	/**
	 * The internal feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REQUIRES = 4;

	/**
	 * The internal feature id for the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_EXCLUDES = 5;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = 6;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 7;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_DESCRIPTION: return DESCRIPTION;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_CONSTRAINS: return CONSTRAINS;
			case _INTERNAL_REQUIRES: return REQUIRES;
			case _INTERNAL_EXCLUDES: return EXCLUDES;
			case _INTERNAL_ANY_ATTRIBUTE: return ANY_ATTRIBUTE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_DEFAULT_;

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
	 * The default value of the '{@link #getConstrains() <em>Constrains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrains()
	 * @generated
	 * @ordered
	 */
	protected static final List CONSTRAINS_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getConstrains() <em>Constrains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrains()
	 * @generated
	 * @ordered
	 */
	protected List constrains = CONSTRAINS_DEFAULT_;

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
	 * The default value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected static final List EXCLUDES_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected List excludes = EXCLUDES_DEFAULT_;

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
	public IntentImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getIntent();
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
	public String getDescription()
	{
		return description;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DESCRIPTION, oldDescription, description);
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
	public List getConstrains()
	{
		return constrains;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrains(List newConstrains)
	{
		List oldConstrains = constrains;
		constrains = newConstrains;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CONSTRAINS, oldConstrains, constrains);
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
	public List getExcludes()
	{
		return excludes;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludes(List newExcludes)
	{
		List oldExcludes = excludes;
		excludes = newExcludes;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_EXCLUDES, oldExcludes, excludes);
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
			case DESCRIPTION:
				return getDescription();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case NAME:
				return getName();
			case CONSTRAINS:
				return getConstrains();
			case REQUIRES:
				return getRequires();
			case EXCLUDES:
				return getExcludes();
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
			case DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case NAME:
				setName((String)newValue);
				return;
			case CONSTRAINS:
				setConstrains((List)newValue);
				return;
			case REQUIRES:
				setRequires((List)newValue);
				return;
			case EXCLUDES:
				setExcludes((List)newValue);
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
			case DESCRIPTION:
				setDescription(DESCRIPTION_DEFAULT_);
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case NAME:
				setName(NAME_DEFAULT_);
				return;
			case CONSTRAINS:
				setConstrains(CONSTRAINS_DEFAULT_);
				return;
			case REQUIRES:
				setRequires(REQUIRES_DEFAULT_);
				return;
			case EXCLUDES:
				setExcludes(EXCLUDES_DEFAULT_);
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
			case DESCRIPTION:
				return DESCRIPTION_DEFAULT_ == null ? description != null : !DESCRIPTION_DEFAULT_.equals(description);
			case ANY:
				return any != null && !isSequenceEmpty(getAny());
			case NAME:
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
			case CONSTRAINS:
				return CONSTRAINS_DEFAULT_ == null ? constrains != null : !CONSTRAINS_DEFAULT_.equals(constrains);
			case REQUIRES:
				return REQUIRES_DEFAULT_ == null ? requires != null : !REQUIRES_DEFAULT_.equals(requires);
			case EXCLUDES:
				return EXCLUDES_DEFAULT_ == null ? excludes != null : !EXCLUDES_DEFAULT_.equals(excludes);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", any: ");
		result.append(any);
		result.append(", name: ");
		result.append(name);
		result.append(", constrains: ");
		result.append(constrains);
		result.append(", requires: ");
		result.append(requires);
		result.append(", excludes: ");
		result.append(excludes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //IntentImpl

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

import org.osoa.xmlns.sca._1.ConstrainingType;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraining Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ConstrainingTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstrainingTypeImpl extends DataObjectBase implements ConstrainingType
{

	public final static int GROUP = -1;

	public final static int SERVICE = 0;

	public final static int REFERENCE = 1;

	public final static int PROPERTY = 2;

	public final static int ANY = -2;

	public final static int NAME = 3;

	public final static int TARGET_NAMESPACE = 4;

	public final static int REQUIRES = 5;

	public final static int ANY_ATTRIBUTE = -3;

	public final static int SDO_PROPERTY_COUNT = 6;

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
	 * The internal feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SERVICE = 1;

	/**
	 * The internal feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REFERENCE = 2;

	/**
	 * The internal feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROPERTY = 3;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 4;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 5;

	/**
	 * The internal feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TARGET_NAMESPACE = 6;

	/**
	 * The internal feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REQUIRES = 7;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = 8;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 9;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_GROUP: return GROUP;
			case _INTERNAL_SERVICE: return SERVICE;
			case _INTERNAL_REFERENCE: return REFERENCE;
			case _INTERNAL_PROPERTY: return PROPERTY;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_TARGET_NAMESPACE: return TARGET_NAMESPACE;
			case _INTERNAL_REQUIRES: return REQUIRES;
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
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_DEFAULT_;

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
	public ConstrainingTypeImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getConstrainingType();
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
	public List getService()
	{
		return getList(getGroup(), getType(), _INTERNAL_SERVICE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getReference()
	{
		return getList(getGroup(), getType(), _INTERNAL_REFERENCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getProperty()
	{
		return getList(getGroup(), getType(), _INTERNAL_PROPERTY);
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
	public String getTargetNamespace()
	{
		return targetNamespace;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace)
	{
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TARGET_NAMESPACE, oldTargetNamespace, targetNamespace);
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
			case SERVICE:
				return getService();
			case REFERENCE:
				return getReference();
			case PROPERTY:
				return getProperty();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case NAME:
				return getName();
			case TARGET_NAMESPACE:
				return getTargetNamespace();
			case REQUIRES:
				return getRequires();
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
			case SERVICE:
				getService().clear();
				getService().addAll((Collection)newValue);
				return;
			case REFERENCE:
				getReference().clear();
				getReference().addAll((Collection)newValue);
				return;
			case PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection)newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case NAME:
				setName((String)newValue);
				return;
			case TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case REQUIRES:
				setRequires((List)newValue);
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
			case SERVICE:
				getService().clear();
				return;
			case REFERENCE:
				getReference().clear();
				return;
			case PROPERTY:
				getProperty().clear();
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case NAME:
				setName(NAME_DEFAULT_);
				return;
			case TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_DEFAULT_);
				return;
			case REQUIRES:
				setRequires(REQUIRES_DEFAULT_);
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
			case SERVICE:
				return !getService().isEmpty();
			case REFERENCE:
				return !getReference().isEmpty();
			case PROPERTY:
				return !getProperty().isEmpty();
			case ANY:
				return any != null && !isSequenceEmpty(getAny());
			case NAME:
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
			case TARGET_NAMESPACE:
				return TARGET_NAMESPACE_DEFAULT_ == null ? targetNamespace != null : !TARGET_NAMESPACE_DEFAULT_.equals(targetNamespace);
			case REQUIRES:
				return REQUIRES_DEFAULT_ == null ? requires != null : !REQUIRES_DEFAULT_.equals(requires);
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
		result.append(", any: ");
		result.append(any);
		result.append(", name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", requires: ");
		result.append(requires);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ConstrainingTypeImpl

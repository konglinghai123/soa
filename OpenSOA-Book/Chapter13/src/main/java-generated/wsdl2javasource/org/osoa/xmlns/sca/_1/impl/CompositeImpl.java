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

import org.osoa.xmlns.sca._1.Composite;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.CompositeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends DataObjectBase implements Composite
{

	public final static int GROUP = -1;

	public final static int INCLUDE = 0;

	public final static int SERVICE = 1;

	public final static int PROPERTY = 2;

	public final static int COMPONENT = 3;

	public final static int REFERENCE = 4;

	public final static int WIRE = 5;

	public final static int ANY = -2;

	public final static int NAME = 6;

	public final static int TARGET_NAMESPACE = 7;

	public final static int LOCAL = 8;

	public final static int AUTOWIRE = 9;

	public final static int CONSTRAINING_TYPE = 10;

	public final static int REQUIRES = 11;

	public final static int POLICY_SETS = 12;

	public final static int ANY_ATTRIBUTE = -3;

	public final static int SDO_PROPERTY_COUNT = 13;

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
	 * The internal feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INCLUDE = 1;

	/**
	 * The internal feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SERVICE = 2;

	/**
	 * The internal feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROPERTY = 3;

	/**
	 * The internal feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_COMPONENT = 4;

	/**
	 * The internal feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REFERENCE = 5;

	/**
	 * The internal feature id for the '<em><b>Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_WIRE = 6;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 7;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 8;

	/**
	 * The internal feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TARGET_NAMESPACE = 9;

	/**
	 * The internal feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_LOCAL = 10;

	/**
	 * The internal feature id for the '<em><b>Autowire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_AUTOWIRE = 11;

	/**
	 * The internal feature id for the '<em><b>Constraining Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CONSTRAINING_TYPE = 12;

	/**
	 * The internal feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REQUIRES = 13;

	/**
	 * The internal feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POLICY_SETS = 14;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = 15;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 16;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_GROUP: return GROUP;
			case _INTERNAL_INCLUDE: return INCLUDE;
			case _INTERNAL_SERVICE: return SERVICE;
			case _INTERNAL_PROPERTY: return PROPERTY;
			case _INTERNAL_COMPONENT: return COMPONENT;
			case _INTERNAL_REFERENCE: return REFERENCE;
			case _INTERNAL_WIRE: return WIRE;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_TARGET_NAMESPACE: return TARGET_NAMESPACE;
			case _INTERNAL_LOCAL: return LOCAL;
			case _INTERNAL_AUTOWIRE: return AUTOWIRE;
			case _INTERNAL_CONSTRAINING_TYPE: return CONSTRAINING_TYPE;
			case _INTERNAL_REQUIRES: return REQUIRES;
			case _INTERNAL_POLICY_SETS: return POLICY_SETS;
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
	 * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean local = LOCAL_DEFAULT_;

	/**
	 * The default value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOWIRE_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowire()
	 * @generated
	 * @ordered
	 */
	protected boolean autowire = AUTOWIRE_DEFAULT_;

	/**
	 * The default value of the '{@link #getConstrainingType() <em>Constraining Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINING_TYPE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getConstrainingType() <em>Constraining Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingType()
	 * @generated
	 * @ordered
	 */
	protected String constrainingType = CONSTRAINING_TYPE_DEFAULT_;

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
	public CompositeImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getComposite();
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
	public List getInclude()
	{
		return getList(getGroup(), getType(), _INTERNAL_INCLUDE);
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
	public List getProperty()
	{
		return getList(getGroup(), getType(), _INTERNAL_PROPERTY);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getComponent()
	{
		return getList(getGroup(), getType(), _INTERNAL_COMPONENT);
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
	public List getWire()
	{
		return getList(getGroup(), getType(), _INTERNAL_WIRE);
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
	public boolean isLocal()
	{
		return local;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(boolean newLocal)
	{
		boolean oldLocal = local;
		local = newLocal;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_LOCAL, oldLocal, local);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutowire()
	{
		return autowire;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutowire(boolean newAutowire)
	{
		boolean oldAutowire = autowire;
		autowire = newAutowire;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_AUTOWIRE, oldAutowire, autowire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstrainingType()
	{
		return constrainingType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainingType(String newConstrainingType)
	{
		String oldConstrainingType = constrainingType;
		constrainingType = newConstrainingType;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CONSTRAINING_TYPE, oldConstrainingType, constrainingType);
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
			case INCLUDE:
				return getInclude();
			case SERVICE:
				return getService();
			case PROPERTY:
				return getProperty();
			case COMPONENT:
				return getComponent();
			case REFERENCE:
				return getReference();
			case WIRE:
				return getWire();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case NAME:
				return getName();
			case TARGET_NAMESPACE:
				return getTargetNamespace();
			case LOCAL:
				return isLocal() ? Boolean.TRUE : Boolean.FALSE;
			case AUTOWIRE:
				return isAutowire() ? Boolean.TRUE : Boolean.FALSE;
			case CONSTRAINING_TYPE:
				return getConstrainingType();
			case REQUIRES:
				return getRequires();
			case POLICY_SETS:
				return getPolicySets();
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
			case INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection)newValue);
				return;
			case SERVICE:
				getService().clear();
				getService().addAll((Collection)newValue);
				return;
			case PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection)newValue);
				return;
			case COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection)newValue);
				return;
			case REFERENCE:
				getReference().clear();
				getReference().addAll((Collection)newValue);
				return;
			case WIRE:
				getWire().clear();
				getWire().addAll((Collection)newValue);
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
			case LOCAL:
				setLocal(((Boolean)newValue).booleanValue());
				return;
			case AUTOWIRE:
				setAutowire(((Boolean)newValue).booleanValue());
				return;
			case CONSTRAINING_TYPE:
				setConstrainingType((String)newValue);
				return;
			case REQUIRES:
				setRequires((List)newValue);
				return;
			case POLICY_SETS:
				setPolicySets((List)newValue);
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
			case INCLUDE:
				getInclude().clear();
				return;
			case SERVICE:
				getService().clear();
				return;
			case PROPERTY:
				getProperty().clear();
				return;
			case COMPONENT:
				getComponent().clear();
				return;
			case REFERENCE:
				getReference().clear();
				return;
			case WIRE:
				getWire().clear();
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
			case LOCAL:
				setLocal(LOCAL_DEFAULT_);
				return;
			case AUTOWIRE:
				setAutowire(AUTOWIRE_DEFAULT_);
				return;
			case CONSTRAINING_TYPE:
				setConstrainingType(CONSTRAINING_TYPE_DEFAULT_);
				return;
			case REQUIRES:
				setRequires(REQUIRES_DEFAULT_);
				return;
			case POLICY_SETS:
				setPolicySets(POLICY_SETS_DEFAULT_);
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
			case INCLUDE:
				return !getInclude().isEmpty();
			case SERVICE:
				return !getService().isEmpty();
			case PROPERTY:
				return !getProperty().isEmpty();
			case COMPONENT:
				return !getComponent().isEmpty();
			case REFERENCE:
				return !getReference().isEmpty();
			case WIRE:
				return !getWire().isEmpty();
			case ANY:
				return !isSequenceEmpty(getAny());
			case NAME:
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
			case TARGET_NAMESPACE:
				return TARGET_NAMESPACE_DEFAULT_ == null ? targetNamespace != null : !TARGET_NAMESPACE_DEFAULT_.equals(targetNamespace);
			case LOCAL:
				return local != LOCAL_DEFAULT_;
			case AUTOWIRE:
				return autowire != AUTOWIRE_DEFAULT_;
			case CONSTRAINING_TYPE:
				return CONSTRAINING_TYPE_DEFAULT_ == null ? constrainingType != null : !CONSTRAINING_TYPE_DEFAULT_.equals(constrainingType);
			case REQUIRES:
				return REQUIRES_DEFAULT_ == null ? requires != null : !REQUIRES_DEFAULT_.equals(requires);
			case POLICY_SETS:
				return POLICY_SETS_DEFAULT_ == null ? policySets != null : !POLICY_SETS_DEFAULT_.equals(policySets);
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
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", local: ");
		result.append(local);
		result.append(", autowire: ");
		result.append(autowire);
		result.append(", constrainingType: ");
		result.append(constrainingType);
		result.append(", requires: ");
		result.append(requires);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CompositeImpl

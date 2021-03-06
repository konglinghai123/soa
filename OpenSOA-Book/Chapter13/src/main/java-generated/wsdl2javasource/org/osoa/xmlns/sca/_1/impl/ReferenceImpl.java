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

import org.osoa.xmlns.sca._1.Callback;
import org.osoa.xmlns.sca._1.Interface;
import org.osoa.xmlns.sca._1.Operation;
import org.osoa.xmlns.sca._1.Reference;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getInterfaceGroup <em>Interface Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getCallback <em>Callback</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#isWiredByImpl <em>Wired By Impl</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getPromote <em>Promote</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ReferenceImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends DataObjectBase implements Reference
{

	public final static int INTERFACE_GROUP = -1;

	public final static int INTERFACE = 0;

	public final static int OPERATION = 1;

	public final static int GROUP = -2;

	public final static int BINDING_GROUP = -3;

	public final static int BINDING = 2;

	public final static int ANY = -4;

	public final static int CALLBACK = 3;

	public final static int NAME = 4;

	public final static int TARGET = 5;

	public final static int WIRED_BY_IMPL = 6;

	public final static int MULTIPLICITY = 7;

	public final static int PROMOTE = 8;

	public final static int REQUIRES = 9;

	public final static int POLICY_SETS = 10;

	public final static int ANY_ATTRIBUTE = -5;

	public final static int SDO_PROPERTY_COUNT = 11;

	public final static int EXTENDED_PROPERTY_COUNT = -5;


	/**
	 * The internal feature id for the '<em><b>Interface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INTERFACE_GROUP = 0;

	/**
	 * The internal feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INTERFACE = 1;

	/**
	 * The internal feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OPERATION = 2;

	/**
	 * The internal feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_GROUP = 3;

	/**
	 * The internal feature id for the '<em><b>Binding Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_BINDING_GROUP = 4;

	/**
	 * The internal feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_BINDING = 5;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 6;

	/**
	 * The internal feature id for the '<em><b>Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CALLBACK = 7;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 8;

	/**
	 * The internal feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TARGET = 9;

	/**
	 * The internal feature id for the '<em><b>Wired By Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_WIRED_BY_IMPL = 10;

	/**
	 * The internal feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_MULTIPLICITY = 11;

	/**
	 * The internal feature id for the '<em><b>Promote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROMOTE = 12;

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
			case _INTERNAL_INTERFACE_GROUP: return INTERFACE_GROUP;
			case _INTERNAL_INTERFACE: return INTERFACE;
			case _INTERNAL_OPERATION: return OPERATION;
			case _INTERNAL_GROUP: return GROUP;
			case _INTERNAL_BINDING_GROUP: return BINDING_GROUP;
			case _INTERNAL_BINDING: return BINDING;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_CALLBACK: return CALLBACK;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_TARGET: return TARGET;
			case _INTERNAL_WIRED_BY_IMPL: return WIRED_BY_IMPL;
			case _INTERNAL_MULTIPLICITY: return MULTIPLICITY;
			case _INTERNAL_PROMOTE: return PROMOTE;
			case _INTERNAL_REQUIRES: return REQUIRES;
			case _INTERNAL_POLICY_SETS: return POLICY_SETS;
			case _INTERNAL_ANY_ATTRIBUTE: return ANY_ATTRIBUTE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getInterfaceGroup() <em>Interface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceGroup()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence interfaceGroup = null;
	
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence group = null;
	
	/**
	 * The cached value of the '{@link #getCallback() <em>Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallback()
	 * @generated
	 * @ordered
	 */
	
	protected Callback callback = null;
	
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
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final List TARGET_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected List target = TARGET_DEFAULT_;

	/**
	 * The default value of the '{@link #isWiredByImpl() <em>Wired By Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWiredByImpl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WIRED_BY_IMPL_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isWiredByImpl() <em>Wired By Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWiredByImpl()
	 * @generated
	 * @ordered
	 */
	protected boolean wiredByImpl = WIRED_BY_IMPL_DEFAULT_;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_DEFAULT_ = "1..1";

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_DEFAULT_;

	/**
	 * The default value of the '{@link #getPromote() <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected static final List PROMOTE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getPromote() <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected List promote = PROMOTE_DEFAULT_;

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
	public ReferenceImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getReference();
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
	public Sequence getInterfaceGroup()
	{
		if (interfaceGroup == null)
		{
		  interfaceGroup = createSequence(_INTERNAL_INTERFACE_GROUP);
		}
		return interfaceGroup;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface()
	{
		return (Interface)get(getInterfaceGroup(), getType(), _INTERNAL_INTERFACE);
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
	public Sequence getBindingGroup()
	{
		return createSequence(getGroup(), getType(), _INTERNAL_BINDING_GROUP);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBinding()
	{
		return getList(getBindingGroup(), getType(), _INTERNAL_BINDING);
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
	public Callback getCallback()
	{
		return callback;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallback(Callback newCallback)
	{
		Callback oldCallback = callback;
		callback = newCallback;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CALLBACK, oldCallback, callback);
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
	public List getTarget()
	{
		return target;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(List newTarget)
	{
		List oldTarget = target;
		target = newTarget;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TARGET, oldTarget, target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWiredByImpl()
	{
		return wiredByImpl;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWiredByImpl(boolean newWiredByImpl)
	{
		boolean oldWiredByImpl = wiredByImpl;
		wiredByImpl = newWiredByImpl;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_WIRED_BY_IMPL, oldWiredByImpl, wiredByImpl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity()
	{
		return multiplicity;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity)
	{
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_MULTIPLICITY, oldMultiplicity, multiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPromote()
	{
		return promote;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromote(List newPromote)
	{
		List oldPromote = promote;
		promote = newPromote;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROMOTE, oldPromote, promote);
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
			case INTERFACE_GROUP:
				return removeFromSequence(getInterfaceGroup(), otherEnd, changeContext);
			case GROUP:
				return removeFromSequence(getGroup(), otherEnd, changeContext);
			case BINDING_GROUP:
				return removeFromSequence(getBindingGroup(), otherEnd, changeContext);
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
			case INTERFACE_GROUP:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getInterfaceGroup();
			case INTERFACE:
				return getInterface();
			case OPERATION:
				return getOperation();
			case GROUP:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getGroup();
			case BINDING_GROUP:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getBindingGroup();
			case BINDING:
				return getBinding();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case CALLBACK:
				return getCallback();
			case NAME:
				return getName();
			case TARGET:
				return getTarget();
			case WIRED_BY_IMPL:
				return isWiredByImpl() ? Boolean.TRUE : Boolean.FALSE;
			case MULTIPLICITY:
				return getMultiplicity();
			case PROMOTE:
				return getPromote();
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
			case INTERFACE_GROUP:
      	setSequence(getInterfaceGroup(), newValue);
				return;
			case OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection)newValue);
				return;
			case GROUP:
      	setSequence(getGroup(), newValue);
				return;
			case BINDING_GROUP:
      	setSequence(getBindingGroup(), newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case CALLBACK:
				setCallback((Callback)newValue);
				return;
			case NAME:
				setName((String)newValue);
				return;
			case TARGET:
				setTarget((List)newValue);
				return;
			case WIRED_BY_IMPL:
				setWiredByImpl(((Boolean)newValue).booleanValue());
				return;
			case MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case PROMOTE:
				setPromote((List)newValue);
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
			case INTERFACE_GROUP:
				unsetSequence(getInterfaceGroup());
				return;
			case OPERATION:
				getOperation().clear();
				return;
			case GROUP:
				unsetSequence(getGroup());
				return;
			case BINDING_GROUP:
				unsetSequence(getBindingGroup());
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case CALLBACK:
				setCallback((Callback)null);
				return;
			case NAME:
				setName(NAME_DEFAULT_);
				return;
			case TARGET:
				setTarget(TARGET_DEFAULT_);
				return;
			case WIRED_BY_IMPL:
				setWiredByImpl(WIRED_BY_IMPL_DEFAULT_);
				return;
			case MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_DEFAULT_);
				return;
			case PROMOTE:
				setPromote(PROMOTE_DEFAULT_);
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
			case INTERFACE_GROUP:
				return interfaceGroup != null && !isSequenceEmpty(getInterfaceGroup());
			case INTERFACE:
				return getInterface() != null;
			case OPERATION:
				return operation != null && !operation.isEmpty();
			case GROUP:
				return group != null && !isSequenceEmpty(getGroup());
			case BINDING_GROUP:
				return !isSequenceEmpty(getBindingGroup());
			case BINDING:
				return !getBinding().isEmpty();
			case ANY:
				return !isSequenceEmpty(getAny());
			case CALLBACK:
				return callback != null;
			case NAME:
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
			case TARGET:
				return TARGET_DEFAULT_ == null ? target != null : !TARGET_DEFAULT_.equals(target);
			case WIRED_BY_IMPL:
				return wiredByImpl != WIRED_BY_IMPL_DEFAULT_;
			case MULTIPLICITY:
				return MULTIPLICITY_DEFAULT_ == null ? multiplicity != null : !MULTIPLICITY_DEFAULT_.equals(multiplicity);
			case PROMOTE:
				return PROMOTE_DEFAULT_ == null ? promote != null : !PROMOTE_DEFAULT_.equals(promote);
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
		result.append(" (interfaceGroup: ");
		result.append(interfaceGroup);
		result.append(", group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", target: ");
		result.append(target);
		result.append(", wiredByImpl: ");
		result.append(wiredByImpl);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(", promote: ");
		result.append(promote);
		result.append(", requires: ");
		result.append(requires);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl

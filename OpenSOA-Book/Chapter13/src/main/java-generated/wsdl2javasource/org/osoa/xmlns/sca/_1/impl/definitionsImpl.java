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

import org.osoa.xmlns.sca._1._1Factory;
import org.osoa.xmlns.sca._1.definitions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.definitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class definitionsImpl extends DataObjectBase implements definitions
{

	public final static int GROUP = -1;

	public final static int INTENT = 0;

	public final static int POLICY_SET = 1;

	public final static int BINDING_GROUP = -2;

	public final static int BINDING = 2;

	public final static int BINDING_TYPE = 3;

	public final static int IMPLEMENTATION_TYPE = 4;

	public final static int ANY = -3;

	public final static int TARGET_NAMESPACE = 5;

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
	 * The internal feature id for the '<em><b>Intent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INTENT = 1;

	/**
	 * The internal feature id for the '<em><b>Policy Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POLICY_SET = 2;

	/**
	 * The internal feature id for the '<em><b>Binding Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_BINDING_GROUP = 3;

	/**
	 * The internal feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_BINDING = 4;

	/**
	 * The internal feature id for the '<em><b>Binding Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_BINDING_TYPE = 5;

	/**
	 * The internal feature id for the '<em><b>Implementation Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IMPLEMENTATION_TYPE = 6;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 7;

	/**
	 * The internal feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TARGET_NAMESPACE = 8;

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
			case _INTERNAL_INTENT: return INTENT;
			case _INTERNAL_POLICY_SET: return POLICY_SET;
			case _INTERNAL_BINDING_GROUP: return BINDING_GROUP;
			case _INTERNAL_BINDING: return BINDING;
			case _INTERNAL_BINDING_TYPE: return BINDING_TYPE;
			case _INTERNAL_IMPLEMENTATION_TYPE: return IMPLEMENTATION_TYPE;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_TARGET_NAMESPACE: return TARGET_NAMESPACE;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public definitionsImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getdefinitions();
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
	public List getIntent()
	{
		return getList(getGroup(), getType(), _INTERNAL_INTENT);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPolicySet()
	{
		return getList(getGroup(), getType(), _INTERNAL_POLICY_SET);
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
	public List getBindingType()
	{
		return getList(getGroup(), getType(), _INTERNAL_BINDING_TYPE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getImplementationType()
	{
		return getList(getGroup(), getType(), _INTERNAL_IMPLEMENTATION_TYPE);
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
	public ChangeContext inverseRemove(Object otherEnd, int propertyIndex, ChangeContext changeContext)
	{
		switch (propertyIndex)
		{
			case GROUP:
				return removeFromSequence(getGroup(), otherEnd, changeContext);
			case BINDING_GROUP:
				return removeFromSequence(getBindingGroup(), otherEnd, changeContext);
			case ANY:
				return removeFromSequence(getAny(), otherEnd, changeContext);
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
			case INTENT:
				return getIntent();
			case POLICY_SET:
				return getPolicySet();
			case BINDING_GROUP:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getBindingGroup();
			case BINDING:
				return getBinding();
			case BINDING_TYPE:
				return getBindingType();
			case IMPLEMENTATION_TYPE:
				return getImplementationType();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case INTENT:
				getIntent().clear();
				getIntent().addAll((Collection)newValue);
				return;
			case POLICY_SET:
				getPolicySet().clear();
				getPolicySet().addAll((Collection)newValue);
				return;
			case BINDING_GROUP:
      	setSequence(getBindingGroup(), newValue);
				return;
			case BINDING_TYPE:
				getBindingType().clear();
				getBindingType().addAll((Collection)newValue);
				return;
			case IMPLEMENTATION_TYPE:
				getImplementationType().clear();
				getImplementationType().addAll((Collection)newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
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
			case INTENT:
				getIntent().clear();
				return;
			case POLICY_SET:
				getPolicySet().clear();
				return;
			case BINDING_GROUP:
				unsetSequence(getBindingGroup());
				return;
			case BINDING_TYPE:
				getBindingType().clear();
				return;
			case IMPLEMENTATION_TYPE:
				getImplementationType().clear();
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_DEFAULT_);
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
			case INTENT:
				return !getIntent().isEmpty();
			case POLICY_SET:
				return !getPolicySet().isEmpty();
			case BINDING_GROUP:
				return !isSequenceEmpty(getBindingGroup());
			case BINDING:
				return !getBinding().isEmpty();
			case BINDING_TYPE:
				return !getBindingType().isEmpty();
			case IMPLEMENTATION_TYPE:
				return !getImplementationType().isEmpty();
			case ANY:
				return !isSequenceEmpty(getAny());
			case TARGET_NAMESPACE:
				return TARGET_NAMESPACE_DEFAULT_ == null ? targetNamespace != null : !TARGET_NAMESPACE_DEFAULT_.equals(targetNamespace);
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
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //definitionsImpl

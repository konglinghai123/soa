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

import org.osoa.xmlns.sca._1.ComponentType;
import org.osoa.xmlns.sca._1.Implementation;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getImplementationGroup <em>Implementation Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ComponentTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends DataObjectBase implements ComponentType
{

	public final static int IMPLEMENTATION_GROUP = -1;

	public final static int IMPLEMENTATION = 0;

	public final static int ANY = -2;

	public final static int GROUP = -3;

	public final static int SERVICE = 1;

	public final static int REFERENCE = 2;

	public final static int PROPERTY = 3;

	public final static int CONSTRAINING_TYPE = 4;

	public final static int ANY_ATTRIBUTE = -4;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = -4;


	/**
	 * The internal feature id for the '<em><b>Implementation Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IMPLEMENTATION_GROUP = 0;

	/**
	 * The internal feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IMPLEMENTATION = 1;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 2;

	/**
	 * The internal feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_GROUP = 3;

	/**
	 * The internal feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SERVICE = 4;

	/**
	 * The internal feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REFERENCE = 5;

	/**
	 * The internal feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROPERTY = 6;

	/**
	 * The internal feature id for the '<em><b>Constraining Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CONSTRAINING_TYPE = 7;

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
			case _INTERNAL_IMPLEMENTATION_GROUP: return IMPLEMENTATION_GROUP;
			case _INTERNAL_IMPLEMENTATION: return IMPLEMENTATION;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_GROUP: return GROUP;
			case _INTERNAL_SERVICE: return SERVICE;
			case _INTERNAL_REFERENCE: return REFERENCE;
			case _INTERNAL_PROPERTY: return PROPERTY;
			case _INTERNAL_CONSTRAINING_TYPE: return CONSTRAINING_TYPE;
			case _INTERNAL_ANY_ATTRIBUTE: return ANY_ATTRIBUTE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getImplementationGroup() <em>Implementation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGroup()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence implementationGroup = null;
	
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence group = null;
	
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
	public ComponentTypeImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getComponentType();
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
	public Sequence getImplementationGroup()
	{
		if (implementationGroup == null)
		{
		  implementationGroup = createSequence(_INTERNAL_IMPLEMENTATION_GROUP);
		}
		return implementationGroup;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation()
	{
		return (Implementation)get(getImplementationGroup(), getType(), _INTERNAL_IMPLEMENTATION);
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
			case IMPLEMENTATION_GROUP:
				return removeFromSequence(getImplementationGroup(), otherEnd, changeContext);
			case ANY:
				return removeFromSequence(getAny(), otherEnd, changeContext);
			case GROUP:
				return removeFromSequence(getGroup(), otherEnd, changeContext);
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
			case IMPLEMENTATION_GROUP:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getImplementationGroup();
			case IMPLEMENTATION:
				return getImplementation();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
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
			case CONSTRAINING_TYPE:
				return getConstrainingType();
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
			case IMPLEMENTATION_GROUP:
      	setSequence(getImplementationGroup(), newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
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
			case CONSTRAINING_TYPE:
				setConstrainingType((String)newValue);
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
			case IMPLEMENTATION_GROUP:
				unsetSequence(getImplementationGroup());
				return;
			case ANY:
				unsetSequence(getAny());
				return;
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
			case CONSTRAINING_TYPE:
				setConstrainingType(CONSTRAINING_TYPE_DEFAULT_);
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
			case IMPLEMENTATION_GROUP:
				return implementationGroup != null && !isSequenceEmpty(getImplementationGroup());
			case IMPLEMENTATION:
				return getImplementation() != null;
			case ANY:
				return any != null && !isSequenceEmpty(getAny());
			case GROUP:
				return group != null && !isSequenceEmpty(getGroup());
			case SERVICE:
				return !getService().isEmpty();
			case REFERENCE:
				return !getReference().isEmpty();
			case PROPERTY:
				return !getProperty().isEmpty();
			case CONSTRAINING_TYPE:
				return CONSTRAINING_TYPE_DEFAULT_ == null ? constrainingType != null : !CONSTRAINING_TYPE_DEFAULT_.equals(constrainingType);
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
		result.append(" (implementationGroup: ");
		result.append(implementationGroup);
		result.append(", any: ");
		result.append(any);
		result.append(", group: ");
		result.append(group);
		result.append(", constrainingType: ");
		result.append(constrainingType);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl

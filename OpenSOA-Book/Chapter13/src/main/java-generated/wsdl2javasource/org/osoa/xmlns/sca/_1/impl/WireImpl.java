/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Sequence;
import commonj.sdo.Type;

import org.apache.tuscany.sdo.impl.DataObjectBase;

import org.osoa.xmlns.sca._1.Wire;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.WireImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.WireImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.WireImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.WireImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireImpl extends DataObjectBase implements Wire
{

	public final static int ANY = -1;

	public final static int SOURCE = 0;

	public final static int TARGET = 1;

	public final static int ANY_ATTRIBUTE = -2;

	public final static int SDO_PROPERTY_COUNT = 2;

	public final static int EXTENDED_PROPERTY_COUNT = -2;


	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = 0;

	/**
	 * The internal feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SOURCE = 1;

	/**
	 * The internal feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TARGET = 2;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = 3;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 4;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_SOURCE: return SOURCE;
			case _INTERNAL_TARGET: return TARGET;
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
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_DEFAULT_;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_DEFAULT_;

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
	public WireImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getWire();
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
	public String getSource()
	{
		return source;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource)
	{
		String oldSource = source;
		source = newSource;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SOURCE, oldSource, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget()
	{
		return target;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget)
	{
		String oldTarget = target;
		target = newTarget;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TARGET, oldTarget, target);
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
			case SOURCE:
				return getSource();
			case TARGET:
				return getTarget();
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
			case SOURCE:
				setSource((String)newValue);
				return;
			case TARGET:
				setTarget((String)newValue);
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
			case SOURCE:
				setSource(SOURCE_DEFAULT_);
				return;
			case TARGET:
				setTarget(TARGET_DEFAULT_);
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
			case SOURCE:
				return SOURCE_DEFAULT_ == null ? source != null : !SOURCE_DEFAULT_.equals(source);
			case TARGET:
				return TARGET_DEFAULT_ == null ? target != null : !TARGET_DEFAULT_.equals(target);
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
		result.append(", source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //WireImpl

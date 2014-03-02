/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Sequence;
import commonj.sdo.Type;

import org.osoa.xmlns.sca._1.JavaInterface;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JavaInterfaceImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JavaInterfaceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JavaInterfaceImpl#getCallbackInterface <em>Callback Interface</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JavaInterfaceImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaInterfaceImpl extends InterfaceImpl implements JavaInterface
{

	public final static int ANY = InterfaceImpl.EXTENDED_PROPERTY_COUNT + -1;

	public final static int INTERFACE = InterfaceImpl.SDO_PROPERTY_COUNT + 0;

	public final static int CALLBACK_INTERFACE = InterfaceImpl.SDO_PROPERTY_COUNT + 1;

	public final static int ANY_ATTRIBUTE = InterfaceImpl.EXTENDED_PROPERTY_COUNT + -2;

	public final static int SDO_PROPERTY_COUNT = InterfaceImpl.SDO_PROPERTY_COUNT + 2;

	public final static int EXTENDED_PROPERTY_COUNT = InterfaceImpl.EXTENDED_PROPERTY_COUNT - 2;


	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 0;

	/**
	 * The internal feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INTERFACE = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 1;

	/**
	 * The internal feature id for the '<em><b>Callback Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CALLBACK_INTERFACE = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 2;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 3;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = InterfaceImpl.INTERNAL_PROPERTY_COUNT + 4;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_INTERFACE: return INTERFACE;
			case _INTERNAL_CALLBACK_INTERFACE: return CALLBACK_INTERFACE;
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
	 * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected String interface_ = INTERFACE_DEFAULT_;

	/**
	 * The default value of the '{@link #getCallbackInterface() <em>Callback Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLBACK_INTERFACE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getCallbackInterface() <em>Callback Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackInterface()
	 * @generated
	 * @ordered
	 */
	protected String callbackInterface = CALLBACK_INTERFACE_DEFAULT_;

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
	public JavaInterfaceImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getJavaInterface();
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
	public String getInterface()
	{
		return interface_;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(String newInterface)
	{
		String oldInterface = interface_;
		interface_ = newInterface;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_INTERFACE, oldInterface, interface_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallbackInterface()
	{
		return callbackInterface;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallbackInterface(String newCallbackInterface)
	{
		String oldCallbackInterface = callbackInterface;
		callbackInterface = newCallbackInterface;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CALLBACK_INTERFACE, oldCallbackInterface, callbackInterface);
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
			case INTERFACE:
				return getInterface();
			case CALLBACK_INTERFACE:
				return getCallbackInterface();
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
			case INTERFACE:
				setInterface((String)newValue);
				return;
			case CALLBACK_INTERFACE:
				setCallbackInterface((String)newValue);
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
			case INTERFACE:
				setInterface(INTERFACE_DEFAULT_);
				return;
			case CALLBACK_INTERFACE:
				setCallbackInterface(CALLBACK_INTERFACE_DEFAULT_);
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
			case INTERFACE:
				return INTERFACE_DEFAULT_ == null ? interface_ != null : !INTERFACE_DEFAULT_.equals(interface_);
			case CALLBACK_INTERFACE:
				return CALLBACK_INTERFACE_DEFAULT_ == null ? callbackInterface != null : !CALLBACK_INTERFACE_DEFAULT_.equals(callbackInterface);
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
		result.append(", interface: ");
		result.append(interface_);
		result.append(", callbackInterface: ");
		result.append(callbackInterface);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //JavaInterfaceImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.sca.vo.xsd;

import commonj.sdo.Type;

import java.io.Serializable;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ContactInfoType#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ContactInfoType#getPhones <em>Phones</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ContactInfoType#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ContactInfoType extends DataObjectBase implements Serializable
{

	public final static int EMAIL_ADDRESS = 0;

	public final static int PHONES = 1;

	public final static int ADDRESS = 2;

	public final static int SDO_PROPERTY_COUNT = 3;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_EMAIL_ADDRESS = 0;

	/**
	 * The internal feature id for the '<em><b>Phones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PHONES = 1;

	/**
	 * The internal feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ADDRESS = 2;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 3;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_EMAIL_ADDRESS: return EMAIL_ADDRESS;
			case _INTERNAL_PHONES: return PHONES;
			case _INTERNAL_ADDRESS: return ADDRESS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected String emailAddress = EMAIL_ADDRESS_DEFAULT_;

	/**
	 * This is true if the Email Address attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emailAddress_set_ = false;

	/**
	 * The cached value of the '{@link #getPhones() <em>Phones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhones()
	 * @generated
	 * @ordered
	 */
	
	protected PhonesType phones = null;
	
	/**
	 * This is true if the Phones containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phones_set_ = false;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	
	protected AddressType address = null;
	
	/**
	 * This is true if the Address containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean address_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInfoType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getContactInfoType();
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
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #isSetEmailAddress()
	 * @see #unsetEmailAddress()
	 * @see #setEmailAddress(String)
	 * @generated
	 */
	public String getEmailAddress()
	{
		return emailAddress;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #isSetEmailAddress()
	 * @see #unsetEmailAddress()
	 * @see #getEmailAddress()
	 * @generated
	 */
	public void setEmailAddress(String newEmailAddress)
	{
		String oldEmailAddress = emailAddress;
		emailAddress = newEmailAddress;
		boolean oldEmailAddress_set_ = emailAddress_set_;
		emailAddress_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_EMAIL_ADDRESS, oldEmailAddress, emailAddress, !oldEmailAddress_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmailAddress()
	 * @see #getEmailAddress()
	 * @see #setEmailAddress(String)
	 * @generated
	 */
	public void unsetEmailAddress()
	{
		String oldEmailAddress = emailAddress;
		boolean oldEmailAddress_set_ = emailAddress_set_;
		emailAddress = EMAIL_ADDRESS_DEFAULT_;
		emailAddress_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_EMAIL_ADDRESS, oldEmailAddress, EMAIL_ADDRESS_DEFAULT_, oldEmailAddress_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getEmailAddress <em>Email Address</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Email Address</em>' attribute is set.
	 * @see #unsetEmailAddress()
	 * @see #getEmailAddress()
	 * @see #setEmailAddress(String)
	 * @generated
	 */
	public boolean isSetEmailAddress()
	{
		return emailAddress_set_;
	}

	/**
	 * Returns the value of the '<em><b>Phones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phones</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phones</em>' containment reference.
	 * @see #isSetPhones()
	 * @see #unsetPhones()
	 * @see #setPhones(PhonesType)
	 * @generated
	 */
	public PhonesType getPhones()
	{
		return phones;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetPhones(PhonesType newPhones, ChangeContext changeContext)
	{
		PhonesType oldPhones = phones;
		phones = newPhones;
		boolean oldPhones_set_ = phones_set_;
		phones_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_PHONES, oldPhones, newPhones, !oldPhones_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getPhones <em>Phones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phones</em>' containment reference.
	 * @see #isSetPhones()
	 * @see #unsetPhones()
	 * @see #getPhones()
	 * @generated
	 */
	public void setPhones(PhonesType newPhones)
	{
		if (newPhones != phones)
		{
			ChangeContext changeContext = null;
			if (phones != null)
				changeContext = inverseRemove(phones, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PHONES, null, changeContext);
			if (newPhones != null)
				changeContext = inverseAdd(newPhones, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PHONES, null, changeContext);
			changeContext = basicSetPhones(newPhones, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldPhones_set_ = phones_set_;
			phones_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_PHONES, newPhones, newPhones, !oldPhones_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetPhones(ChangeContext changeContext)
	{
		PhonesType oldPhones = phones;
		phones = null;
		boolean oldPhones_set_ = phones_set_;
		phones_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_PHONES, oldPhones, null, !oldPhones_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getPhones <em>Phones</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhones()
	 * @see #getPhones()
	 * @see #setPhones(PhonesType)
	 * @generated
	 */
	public void unsetPhones()
	{
		if (phones != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(phones, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_PHONES, null, changeContext);
			changeContext = basicUnsetPhones(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldPhones_set_ = phones_set_;
			phones_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_PHONES, null, null, oldPhones_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getPhones <em>Phones</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phones</em>' containment reference is set.
	 * @see #unsetPhones()
	 * @see #getPhones()
	 * @see #setPhones(PhonesType)
	 * @generated
	 */
	public boolean isSetPhones()
	{
		return phones_set_;
	}

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #isSetAddress()
	 * @see #unsetAddress()
	 * @see #setAddress(AddressType)
	 * @generated
	 */
	public AddressType getAddress()
	{
		return address;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetAddress(AddressType newAddress, ChangeContext changeContext)
	{
		AddressType oldAddress = address;
		address = newAddress;
		boolean oldAddress_set_ = address_set_;
		address_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_ADDRESS, oldAddress, newAddress, !oldAddress_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #isSetAddress()
	 * @see #unsetAddress()
	 * @see #getAddress()
	 * @generated
	 */
	public void setAddress(AddressType newAddress)
	{
		if (newAddress != address)
		{
			ChangeContext changeContext = null;
			if (address != null)
				changeContext = inverseRemove(address, this, OPPOSITE_FEATURE_BASE - _INTERNAL_ADDRESS, null, changeContext);
			if (newAddress != null)
				changeContext = inverseAdd(newAddress, this, OPPOSITE_FEATURE_BASE - _INTERNAL_ADDRESS, null, changeContext);
			changeContext = basicSetAddress(newAddress, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldAddress_set_ = address_set_;
			address_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_ADDRESS, newAddress, newAddress, !oldAddress_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetAddress(ChangeContext changeContext)
	{
		AddressType oldAddress = address;
		address = null;
		boolean oldAddress_set_ = address_set_;
		address_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_ADDRESS, oldAddress, null, !oldAddress_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddress()
	 * @see #getAddress()
	 * @see #setAddress(AddressType)
	 * @generated
	 */
	public void unsetAddress()
	{
		if (address != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(address, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_ADDRESS, null, changeContext);
			changeContext = basicUnsetAddress(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldAddress_set_ = address_set_;
			address_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_ADDRESS, null, null, oldAddress_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ContactInfoType#getAddress <em>Address</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Address</em>' containment reference is set.
	 * @see #unsetAddress()
	 * @see #getAddress()
	 * @see #setAddress(AddressType)
	 * @generated
	 */
	public boolean isSetAddress()
	{
		return address_set_;
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
			case PHONES:
				return basicUnsetPhones(changeContext);
			case ADDRESS:
				return basicUnsetAddress(changeContext);
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
			case EMAIL_ADDRESS:
				return getEmailAddress();
			case PHONES:
				return getPhones();
			case ADDRESS:
				return getAddress();
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
			case EMAIL_ADDRESS:
				setEmailAddress((String)newValue);
				return;
			case PHONES:
				setPhones((PhonesType)newValue);
				return;
			case ADDRESS:
				setAddress((AddressType)newValue);
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
			case EMAIL_ADDRESS:
				unsetEmailAddress();
				return;
			case PHONES:
				unsetPhones();
				return;
			case ADDRESS:
				unsetAddress();
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
			case EMAIL_ADDRESS:
				return isSetEmailAddress();
			case PHONES:
				return isSetPhones();
			case ADDRESS:
				return isSetAddress();
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
		result.append(" (emailAddress: ");
		if (emailAddress_set_) result.append(emailAddress); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ContactInfoType

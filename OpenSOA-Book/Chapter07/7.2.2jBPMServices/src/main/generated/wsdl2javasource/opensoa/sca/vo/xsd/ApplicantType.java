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
 * A representation of the model object '<em><b>Applicant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ApplicantType#getIndicative <em>Indicative</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ApplicantType#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ApplicantType#getObjectId <em>Object Id</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ApplicantType extends DataObjectBase implements Serializable
{

	public final static int INDICATIVE = 0;

	public final static int CONTACT_INFO = 1;

	public final static int OBJECT_ID = 2;

	public final static int SDO_PROPERTY_COUNT = 3;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Indicative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INDICATIVE = 0;

	/**
	 * The internal feature id for the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CONTACT_INFO = 1;

	/**
	 * The internal feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OBJECT_ID = 2;

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
			case _INTERNAL_INDICATIVE: return INDICATIVE;
			case _INTERNAL_CONTACT_INFO: return CONTACT_INFO;
			case _INTERNAL_OBJECT_ID: return OBJECT_ID;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getIndicative() <em>Indicative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicative()
	 * @generated
	 * @ordered
	 */
	
	protected IndicativeType indicative = null;
	
	/**
	 * This is true if the Indicative containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicative_set_ = false;

	/**
	 * The cached value of the '{@link #getContactInfo() <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInfo()
	 * @generated
	 * @ordered
	 */
	
	protected ContactInfoType contactInfo = null;
	
	/**
	 * This is true if the Contact Info containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contactInfo_set_ = false;

	/**
	 * The default value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected String objectId = OBJECT_ID_DEFAULT_;

	/**
	 * This is true if the Object Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectId_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicantType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getApplicantType();
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
	 * Returns the value of the '<em><b>Indicative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicative</em>' containment reference.
	 * @see #isSetIndicative()
	 * @see #unsetIndicative()
	 * @see #setIndicative(IndicativeType)
	 * @generated
	 */
	public IndicativeType getIndicative()
	{
		return indicative;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetIndicative(IndicativeType newIndicative, ChangeContext changeContext)
	{
		IndicativeType oldIndicative = indicative;
		indicative = newIndicative;
		boolean oldIndicative_set_ = indicative_set_;
		indicative_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_INDICATIVE, oldIndicative, newIndicative, !oldIndicative_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getIndicative <em>Indicative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicative</em>' containment reference.
	 * @see #isSetIndicative()
	 * @see #unsetIndicative()
	 * @see #getIndicative()
	 * @generated
	 */
	public void setIndicative(IndicativeType newIndicative)
	{
		if (newIndicative != indicative)
		{
			ChangeContext changeContext = null;
			if (indicative != null)
				changeContext = inverseRemove(indicative, this, OPPOSITE_FEATURE_BASE - _INTERNAL_INDICATIVE, null, changeContext);
			if (newIndicative != null)
				changeContext = inverseAdd(newIndicative, this, OPPOSITE_FEATURE_BASE - _INTERNAL_INDICATIVE, null, changeContext);
			changeContext = basicSetIndicative(newIndicative, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldIndicative_set_ = indicative_set_;
			indicative_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_INDICATIVE, newIndicative, newIndicative, !oldIndicative_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetIndicative(ChangeContext changeContext)
	{
		IndicativeType oldIndicative = indicative;
		indicative = null;
		boolean oldIndicative_set_ = indicative_set_;
		indicative_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_INDICATIVE, oldIndicative, null, !oldIndicative_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getIndicative <em>Indicative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicative()
	 * @see #getIndicative()
	 * @see #setIndicative(IndicativeType)
	 * @generated
	 */
	public void unsetIndicative()
	{
		if (indicative != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(indicative, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_INDICATIVE, null, changeContext);
			changeContext = basicUnsetIndicative(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldIndicative_set_ = indicative_set_;
			indicative_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_INDICATIVE, null, null, oldIndicative_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getIndicative <em>Indicative</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicative</em>' containment reference is set.
	 * @see #unsetIndicative()
	 * @see #getIndicative()
	 * @see #setIndicative(IndicativeType)
	 * @generated
	 */
	public boolean isSetIndicative()
	{
		return indicative_set_;
	}

	/**
	 * Returns the value of the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Info</em>' containment reference.
	 * @see #isSetContactInfo()
	 * @see #unsetContactInfo()
	 * @see #setContactInfo(ContactInfoType)
	 * @generated
	 */
	public ContactInfoType getContactInfo()
	{
		return contactInfo;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetContactInfo(ContactInfoType newContactInfo, ChangeContext changeContext)
	{
		ContactInfoType oldContactInfo = contactInfo;
		contactInfo = newContactInfo;
		boolean oldContactInfo_set_ = contactInfo_set_;
		contactInfo_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_CONTACT_INFO, oldContactInfo, newContactInfo, !oldContactInfo_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getContactInfo <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Info</em>' containment reference.
	 * @see #isSetContactInfo()
	 * @see #unsetContactInfo()
	 * @see #getContactInfo()
	 * @generated
	 */
	public void setContactInfo(ContactInfoType newContactInfo)
	{
		if (newContactInfo != contactInfo)
		{
			ChangeContext changeContext = null;
			if (contactInfo != null)
				changeContext = inverseRemove(contactInfo, this, OPPOSITE_FEATURE_BASE - _INTERNAL_CONTACT_INFO, null, changeContext);
			if (newContactInfo != null)
				changeContext = inverseAdd(newContactInfo, this, OPPOSITE_FEATURE_BASE - _INTERNAL_CONTACT_INFO, null, changeContext);
			changeContext = basicSetContactInfo(newContactInfo, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldContactInfo_set_ = contactInfo_set_;
			contactInfo_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_CONTACT_INFO, newContactInfo, newContactInfo, !oldContactInfo_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetContactInfo(ChangeContext changeContext)
	{
		ContactInfoType oldContactInfo = contactInfo;
		contactInfo = null;
		boolean oldContactInfo_set_ = contactInfo_set_;
		contactInfo_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_CONTACT_INFO, oldContactInfo, null, !oldContactInfo_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getContactInfo <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContactInfo()
	 * @see #getContactInfo()
	 * @see #setContactInfo(ContactInfoType)
	 * @generated
	 */
	public void unsetContactInfo()
	{
		if (contactInfo != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(contactInfo, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_CONTACT_INFO, null, changeContext);
			changeContext = basicUnsetContactInfo(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldContactInfo_set_ = contactInfo_set_;
			contactInfo_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_CONTACT_INFO, null, null, oldContactInfo_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getContactInfo <em>Contact Info</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contact Info</em>' containment reference is set.
	 * @see #unsetContactInfo()
	 * @see #getContactInfo()
	 * @see #setContactInfo(ContactInfoType)
	 * @generated
	 */
	public boolean isSetContactInfo()
	{
		return contactInfo_set_;
	}

	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #isSetObjectId()
	 * @see #unsetObjectId()
	 * @see #setObjectId(String)
	 * @generated
	 */
	public String getObjectId()
	{
		return objectId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #isSetObjectId()
	 * @see #unsetObjectId()
	 * @see #getObjectId()
	 * @generated
	 */
	public void setObjectId(String newObjectId)
	{
		String oldObjectId = objectId;
		objectId = newObjectId;
		boolean oldObjectId_set_ = objectId_set_;
		objectId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_OBJECT_ID, oldObjectId, objectId, !oldObjectId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectId()
	 * @see #getObjectId()
	 * @see #setObjectId(String)
	 * @generated
	 */
	public void unsetObjectId()
	{
		String oldObjectId = objectId;
		boolean oldObjectId_set_ = objectId_set_;
		objectId = OBJECT_ID_DEFAULT_;
		objectId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_OBJECT_ID, oldObjectId, OBJECT_ID_DEFAULT_, oldObjectId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ApplicantType#getObjectId <em>Object Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Id</em>' attribute is set.
	 * @see #unsetObjectId()
	 * @see #getObjectId()
	 * @see #setObjectId(String)
	 * @generated
	 */
	public boolean isSetObjectId()
	{
		return objectId_set_;
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
			case INDICATIVE:
				return basicUnsetIndicative(changeContext);
			case CONTACT_INFO:
				return basicUnsetContactInfo(changeContext);
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
			case INDICATIVE:
				return getIndicative();
			case CONTACT_INFO:
				return getContactInfo();
			case OBJECT_ID:
				return getObjectId();
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
			case INDICATIVE:
				setIndicative((IndicativeType)newValue);
				return;
			case CONTACT_INFO:
				setContactInfo((ContactInfoType)newValue);
				return;
			case OBJECT_ID:
				setObjectId((String)newValue);
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
			case INDICATIVE:
				unsetIndicative();
				return;
			case CONTACT_INFO:
				unsetContactInfo();
				return;
			case OBJECT_ID:
				unsetObjectId();
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
			case INDICATIVE:
				return isSetIndicative();
			case CONTACT_INFO:
				return isSetContactInfo();
			case OBJECT_ID:
				return isSetObjectId();
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
		result.append(" (objectId: ");
		if (objectId_set_) result.append(objectId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ApplicantType

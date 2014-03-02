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
 * A representation of the model object '<em><b>Indicative Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.IndicativeType#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.IndicativeType#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.IndicativeType#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.IndicativeType#getDob <em>Dob</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.IndicativeType#getIds <em>Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class IndicativeType extends DataObjectBase implements Serializable
{

	public final static int FAMILY_NAME = 0;

	public final static int GIVEN_NAME = 1;

	public final static int MIDDLE_NAME = 2;

	public final static int DOB = 3;

	public final static int IDS = 4;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_FAMILY_NAME = 0;

	/**
	 * The internal feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_GIVEN_NAME = 1;

	/**
	 * The internal feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_MIDDLE_NAME = 2;

	/**
	 * The internal feature id for the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DOB = 3;

	/**
	 * The internal feature id for the '<em><b>Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IDS = 4;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 5;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_FAMILY_NAME: return FAMILY_NAME;
			case _INTERNAL_GIVEN_NAME: return GIVEN_NAME;
			case _INTERNAL_MIDDLE_NAME: return MIDDLE_NAME;
			case _INTERNAL_DOB: return DOB;
			case _INTERNAL_IDS: return IDS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected String familyName = FAMILY_NAME_DEFAULT_;

	/**
	 * This is true if the Family Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean familyName_set_ = false;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_DEFAULT_;

	/**
	 * This is true if the Given Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean givenName_set_ = false;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_DEFAULT_;

	/**
	 * This is true if the Middle Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean middleName_set_ = false;

	/**
	 * The default value of the '{@link #getDob() <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDob()
	 * @generated
	 * @ordered
	 */
	protected static final String DOB_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getDob() <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDob()
	 * @generated
	 * @ordered
	 */
	protected String dob = DOB_DEFAULT_;

	/**
	 * This is true if the Dob attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dob_set_ = false;

	/**
	 * The cached value of the '{@link #getIds() <em>Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	
	protected idsType ids = null;
	
	/**
	 * This is true if the Ids containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ids_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicativeType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getIndicativeType();
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
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #setFamilyName(String)
	 * @generated
	 */
	public String getFamilyName()
	{
		return familyName;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @generated
	 */
	public void setFamilyName(String newFamilyName)
	{
		String oldFamilyName = familyName;
		familyName = newFamilyName;
		boolean oldFamilyName_set_ = familyName_set_;
		familyName_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_FAMILY_NAME, oldFamilyName, familyName, !oldFamilyName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(String)
	 * @generated
	 */
	public void unsetFamilyName()
	{
		String oldFamilyName = familyName;
		boolean oldFamilyName_set_ = familyName_set_;
		familyName = FAMILY_NAME_DEFAULT_;
		familyName_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_FAMILY_NAME, oldFamilyName, FAMILY_NAME_DEFAULT_, oldFamilyName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getFamilyName <em>Family Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Family Name</em>' attribute is set.
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(String)
	 * @generated
	 */
	public boolean isSetFamilyName()
	{
		return familyName_set_;
	}

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #setGivenName(String)
	 * @generated
	 */
	public String getGivenName()
	{
		return givenName;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @generated
	 */
	public void setGivenName(String newGivenName)
	{
		String oldGivenName = givenName;
		givenName = newGivenName;
		boolean oldGivenName_set_ = givenName_set_;
		givenName_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_GIVEN_NAME, oldGivenName, givenName, !oldGivenName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(String)
	 * @generated
	 */
	public void unsetGivenName()
	{
		String oldGivenName = givenName;
		boolean oldGivenName_set_ = givenName_set_;
		givenName = GIVEN_NAME_DEFAULT_;
		givenName_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_GIVEN_NAME, oldGivenName, GIVEN_NAME_DEFAULT_, oldGivenName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getGivenName <em>Given Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Given Name</em>' attribute is set.
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(String)
	 * @generated
	 */
	public boolean isSetGivenName()
	{
		return givenName_set_;
	}

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #isSetMiddleName()
	 * @see #unsetMiddleName()
	 * @see #setMiddleName(String)
	 * @generated
	 */
	public String getMiddleName()
	{
		return middleName;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #isSetMiddleName()
	 * @see #unsetMiddleName()
	 * @see #getMiddleName()
	 * @generated
	 */
	public void setMiddleName(String newMiddleName)
	{
		String oldMiddleName = middleName;
		middleName = newMiddleName;
		boolean oldMiddleName_set_ = middleName_set_;
		middleName_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_MIDDLE_NAME, oldMiddleName, middleName, !oldMiddleName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMiddleName()
	 * @see #getMiddleName()
	 * @see #setMiddleName(String)
	 * @generated
	 */
	public void unsetMiddleName()
	{
		String oldMiddleName = middleName;
		boolean oldMiddleName_set_ = middleName_set_;
		middleName = MIDDLE_NAME_DEFAULT_;
		middleName_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_MIDDLE_NAME, oldMiddleName, MIDDLE_NAME_DEFAULT_, oldMiddleName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getMiddleName <em>Middle Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Middle Name</em>' attribute is set.
	 * @see #unsetMiddleName()
	 * @see #getMiddleName()
	 * @see #setMiddleName(String)
	 * @generated
	 */
	public boolean isSetMiddleName()
	{
		return middleName_set_;
	}

	/**
	 * Returns the value of the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dob</em>' attribute.
	 * @see #isSetDob()
	 * @see #unsetDob()
	 * @see #setDob(String)
	 * @generated
	 */
	public String getDob()
	{
		return dob;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getDob <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dob</em>' attribute.
	 * @see #isSetDob()
	 * @see #unsetDob()
	 * @see #getDob()
	 * @generated
	 */
	public void setDob(String newDob)
	{
		String oldDob = dob;
		dob = newDob;
		boolean oldDob_set_ = dob_set_;
		dob_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DOB, oldDob, dob, !oldDob_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getDob <em>Dob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDob()
	 * @see #getDob()
	 * @see #setDob(String)
	 * @generated
	 */
	public void unsetDob()
	{
		String oldDob = dob;
		boolean oldDob_set_ = dob_set_;
		dob = DOB_DEFAULT_;
		dob_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_DOB, oldDob, DOB_DEFAULT_, oldDob_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getDob <em>Dob</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dob</em>' attribute is set.
	 * @see #unsetDob()
	 * @see #getDob()
	 * @see #setDob(String)
	 * @generated
	 */
	public boolean isSetDob()
	{
		return dob_set_;
	}

	/**
	 * Returns the value of the '<em><b>Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' containment reference.
	 * @see #isSetIds()
	 * @see #unsetIds()
	 * @see #setIds(idsType)
	 * @generated
	 */
	public idsType getIds()
	{
		return ids;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetIds(idsType newIds, ChangeContext changeContext)
	{
		idsType oldIds = ids;
		ids = newIds;
		boolean oldIds_set_ = ids_set_;
		ids_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_IDS, oldIds, newIds, !oldIds_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getIds <em>Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ids</em>' containment reference.
	 * @see #isSetIds()
	 * @see #unsetIds()
	 * @see #getIds()
	 * @generated
	 */
	public void setIds(idsType newIds)
	{
		if (newIds != ids)
		{
			ChangeContext changeContext = null;
			if (ids != null)
				changeContext = inverseRemove(ids, this, OPPOSITE_FEATURE_BASE - _INTERNAL_IDS, null, changeContext);
			if (newIds != null)
				changeContext = inverseAdd(newIds, this, OPPOSITE_FEATURE_BASE - _INTERNAL_IDS, null, changeContext);
			changeContext = basicSetIds(newIds, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldIds_set_ = ids_set_;
			ids_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_IDS, newIds, newIds, !oldIds_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetIds(ChangeContext changeContext)
	{
		idsType oldIds = ids;
		ids = null;
		boolean oldIds_set_ = ids_set_;
		ids_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_IDS, oldIds, null, !oldIds_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getIds <em>Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIds()
	 * @see #getIds()
	 * @see #setIds(idsType)
	 * @generated
	 */
	public void unsetIds()
	{
		if (ids != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(ids, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_IDS, null, changeContext);
			changeContext = basicUnsetIds(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldIds_set_ = ids_set_;
			ids_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_IDS, null, null, oldIds_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.IndicativeType#getIds <em>Ids</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ids</em>' containment reference is set.
	 * @see #unsetIds()
	 * @see #getIds()
	 * @see #setIds(idsType)
	 * @generated
	 */
	public boolean isSetIds()
	{
		return ids_set_;
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
			case IDS:
				return basicUnsetIds(changeContext);
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
			case FAMILY_NAME:
				return getFamilyName();
			case GIVEN_NAME:
				return getGivenName();
			case MIDDLE_NAME:
				return getMiddleName();
			case DOB:
				return getDob();
			case IDS:
				return getIds();
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
			case FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
			case GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case DOB:
				setDob((String)newValue);
				return;
			case IDS:
				setIds((idsType)newValue);
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
			case FAMILY_NAME:
				unsetFamilyName();
				return;
			case GIVEN_NAME:
				unsetGivenName();
				return;
			case MIDDLE_NAME:
				unsetMiddleName();
				return;
			case DOB:
				unsetDob();
				return;
			case IDS:
				unsetIds();
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
			case FAMILY_NAME:
				return isSetFamilyName();
			case GIVEN_NAME:
				return isSetGivenName();
			case MIDDLE_NAME:
				return isSetMiddleName();
			case DOB:
				return isSetDob();
			case IDS:
				return isSetIds();
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
		result.append(" (familyName: ");
		if (familyName_set_) result.append(familyName); else result.append("<unset>");
		result.append(", givenName: ");
		if (givenName_set_) result.append(givenName); else result.append("<unset>");
		result.append(", middleName: ");
		if (middleName_set_) result.append(middleName); else result.append("<unset>");
		result.append(", dob: ");
		if (dob_set_) result.append(dob); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // IndicativeType

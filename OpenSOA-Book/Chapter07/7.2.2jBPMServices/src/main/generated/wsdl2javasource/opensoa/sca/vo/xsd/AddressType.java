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
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.AddressType#getAddressline1 <em>Addressline1</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.AddressType#getAddressline2 <em>Addressline2</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.AddressType#getMunicipality <em>Municipality</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.AddressType#getRegion <em>Region</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.AddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.AddressType#getPostalCode <em>Postal Code</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class AddressType extends DataObjectBase implements Serializable
{

	public final static int ADDRESSLINE1 = 0;

	public final static int ADDRESSLINE2 = 1;

	public final static int MUNICIPALITY = 2;

	public final static int REGION = 3;

	public final static int COUNTRY = 4;

	public final static int POSTAL_CODE = 5;

	public final static int SDO_PROPERTY_COUNT = 6;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Addressline1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ADDRESSLINE1 = 0;

	/**
	 * The internal feature id for the '<em><b>Addressline2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ADDRESSLINE2 = 1;

	/**
	 * The internal feature id for the '<em><b>Municipality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_MUNICIPALITY = 2;

	/**
	 * The internal feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REGION = 3;

	/**
	 * The internal feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_COUNTRY = 4;

	/**
	 * The internal feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POSTAL_CODE = 5;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 6;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_ADDRESSLINE1: return ADDRESSLINE1;
			case _INTERNAL_ADDRESSLINE2: return ADDRESSLINE2;
			case _INTERNAL_MUNICIPALITY: return MUNICIPALITY;
			case _INTERNAL_REGION: return REGION;
			case _INTERNAL_COUNTRY: return COUNTRY;
			case _INTERNAL_POSTAL_CODE: return POSTAL_CODE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getAddressline1() <em>Addressline1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressline1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESSLINE1_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getAddressline1() <em>Addressline1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressline1()
	 * @generated
	 * @ordered
	 */
	protected String addressline1 = ADDRESSLINE1_DEFAULT_;

	/**
	 * This is true if the Addressline1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addressline1_set_ = false;

	/**
	 * The default value of the '{@link #getAddressline2() <em>Addressline2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressline2()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESSLINE2_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getAddressline2() <em>Addressline2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressline2()
	 * @generated
	 * @ordered
	 */
	protected String addressline2 = ADDRESSLINE2_DEFAULT_;

	/**
	 * This is true if the Addressline2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addressline2_set_ = false;

	/**
	 * The default value of the '{@link #getMunicipality() <em>Municipality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipality()
	 * @generated
	 * @ordered
	 */
	protected static final String MUNICIPALITY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getMunicipality() <em>Municipality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipality()
	 * @generated
	 * @ordered
	 */
	protected String municipality = MUNICIPALITY_DEFAULT_;

	/**
	 * This is true if the Municipality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean municipality_set_ = false;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_DEFAULT_;

	/**
	 * This is true if the Region attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean region_set_ = false;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_DEFAULT_;

	/**
	 * This is true if the Country attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean country_set_ = false;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_DEFAULT_;

	/**
	 * This is true if the Postal Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postalCode_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getAddressType();
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
	 * Returns the value of the '<em><b>Addressline1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addressline1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addressline1</em>' attribute.
	 * @see #isSetAddressline1()
	 * @see #unsetAddressline1()
	 * @see #setAddressline1(String)
	 * @generated
	 */
	public String getAddressline1()
	{
		return addressline1;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getAddressline1 <em>Addressline1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressline1</em>' attribute.
	 * @see #isSetAddressline1()
	 * @see #unsetAddressline1()
	 * @see #getAddressline1()
	 * @generated
	 */
	public void setAddressline1(String newAddressline1)
	{
		String oldAddressline1 = addressline1;
		addressline1 = newAddressline1;
		boolean oldAddressline1_set_ = addressline1_set_;
		addressline1_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ADDRESSLINE1, oldAddressline1, addressline1, !oldAddressline1_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getAddressline1 <em>Addressline1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddressline1()
	 * @see #getAddressline1()
	 * @see #setAddressline1(String)
	 * @generated
	 */
	public void unsetAddressline1()
	{
		String oldAddressline1 = addressline1;
		boolean oldAddressline1_set_ = addressline1_set_;
		addressline1 = ADDRESSLINE1_DEFAULT_;
		addressline1_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ADDRESSLINE1, oldAddressline1, ADDRESSLINE1_DEFAULT_, oldAddressline1_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.AddressType#getAddressline1 <em>Addressline1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Addressline1</em>' attribute is set.
	 * @see #unsetAddressline1()
	 * @see #getAddressline1()
	 * @see #setAddressline1(String)
	 * @generated
	 */
	public boolean isSetAddressline1()
	{
		return addressline1_set_;
	}

	/**
	 * Returns the value of the '<em><b>Addressline2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addressline2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addressline2</em>' attribute.
	 * @see #isSetAddressline2()
	 * @see #unsetAddressline2()
	 * @see #setAddressline2(String)
	 * @generated
	 */
	public String getAddressline2()
	{
		return addressline2;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getAddressline2 <em>Addressline2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressline2</em>' attribute.
	 * @see #isSetAddressline2()
	 * @see #unsetAddressline2()
	 * @see #getAddressline2()
	 * @generated
	 */
	public void setAddressline2(String newAddressline2)
	{
		String oldAddressline2 = addressline2;
		addressline2 = newAddressline2;
		boolean oldAddressline2_set_ = addressline2_set_;
		addressline2_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ADDRESSLINE2, oldAddressline2, addressline2, !oldAddressline2_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getAddressline2 <em>Addressline2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddressline2()
	 * @see #getAddressline2()
	 * @see #setAddressline2(String)
	 * @generated
	 */
	public void unsetAddressline2()
	{
		String oldAddressline2 = addressline2;
		boolean oldAddressline2_set_ = addressline2_set_;
		addressline2 = ADDRESSLINE2_DEFAULT_;
		addressline2_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ADDRESSLINE2, oldAddressline2, ADDRESSLINE2_DEFAULT_, oldAddressline2_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.AddressType#getAddressline2 <em>Addressline2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Addressline2</em>' attribute is set.
	 * @see #unsetAddressline2()
	 * @see #getAddressline2()
	 * @see #setAddressline2(String)
	 * @generated
	 */
	public boolean isSetAddressline2()
	{
		return addressline2_set_;
	}

	/**
	 * Returns the value of the '<em><b>Municipality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Municipality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Municipality</em>' attribute.
	 * @see #isSetMunicipality()
	 * @see #unsetMunicipality()
	 * @see #setMunicipality(String)
	 * @generated
	 */
	public String getMunicipality()
	{
		return municipality;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getMunicipality <em>Municipality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Municipality</em>' attribute.
	 * @see #isSetMunicipality()
	 * @see #unsetMunicipality()
	 * @see #getMunicipality()
	 * @generated
	 */
	public void setMunicipality(String newMunicipality)
	{
		String oldMunicipality = municipality;
		municipality = newMunicipality;
		boolean oldMunicipality_set_ = municipality_set_;
		municipality_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_MUNICIPALITY, oldMunicipality, municipality, !oldMunicipality_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getMunicipality <em>Municipality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMunicipality()
	 * @see #getMunicipality()
	 * @see #setMunicipality(String)
	 * @generated
	 */
	public void unsetMunicipality()
	{
		String oldMunicipality = municipality;
		boolean oldMunicipality_set_ = municipality_set_;
		municipality = MUNICIPALITY_DEFAULT_;
		municipality_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_MUNICIPALITY, oldMunicipality, MUNICIPALITY_DEFAULT_, oldMunicipality_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.AddressType#getMunicipality <em>Municipality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Municipality</em>' attribute is set.
	 * @see #unsetMunicipality()
	 * @see #getMunicipality()
	 * @see #setMunicipality(String)
	 * @generated
	 */
	public boolean isSetMunicipality()
	{
		return municipality_set_;
	}

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #isSetRegion()
	 * @see #unsetRegion()
	 * @see #setRegion(String)
	 * @generated
	 */
	public String getRegion()
	{
		return region;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #isSetRegion()
	 * @see #unsetRegion()
	 * @see #getRegion()
	 * @generated
	 */
	public void setRegion(String newRegion)
	{
		String oldRegion = region;
		region = newRegion;
		boolean oldRegion_set_ = region_set_;
		region_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_REGION, oldRegion, region, !oldRegion_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegion()
	 * @see #getRegion()
	 * @see #setRegion(String)
	 * @generated
	 */
	public void unsetRegion()
	{
		String oldRegion = region;
		boolean oldRegion_set_ = region_set_;
		region = REGION_DEFAULT_;
		region_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_REGION, oldRegion, REGION_DEFAULT_, oldRegion_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.AddressType#getRegion <em>Region</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Region</em>' attribute is set.
	 * @see #unsetRegion()
	 * @see #getRegion()
	 * @see #setRegion(String)
	 * @generated
	 */
	public boolean isSetRegion()
	{
		return region_set_;
	}

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	public String getCountry()
	{
		return country;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @generated
	 */
	public void setCountry(String newCountry)
	{
		String oldCountry = country;
		country = newCountry;
		boolean oldCountry_set_ = country_set_;
		country_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_COUNTRY, oldCountry, country, !oldCountry_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	public void unsetCountry()
	{
		String oldCountry = country;
		boolean oldCountry_set_ = country_set_;
		country = COUNTRY_DEFAULT_;
		country_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_COUNTRY, oldCountry, COUNTRY_DEFAULT_, oldCountry_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.AddressType#getCountry <em>Country</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Country</em>' attribute is set.
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	public boolean isSetCountry()
	{
		return country_set_;
	}

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	public String getPostalCode()
	{
		return postalCode;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @generated
	 */
	public void setPostalCode(String newPostalCode)
	{
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		boolean oldPostalCode_set_ = postalCode_set_;
		postalCode_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_POSTAL_CODE, oldPostalCode, postalCode, !oldPostalCode_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.AddressType#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	public void unsetPostalCode()
	{
		String oldPostalCode = postalCode;
		boolean oldPostalCode_set_ = postalCode_set_;
		postalCode = POSTAL_CODE_DEFAULT_;
		postalCode_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_POSTAL_CODE, oldPostalCode, POSTAL_CODE_DEFAULT_, oldPostalCode_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.AddressType#getPostalCode <em>Postal Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Postal Code</em>' attribute is set.
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	public boolean isSetPostalCode()
	{
		return postalCode_set_;
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
			case ADDRESSLINE1:
				return getAddressline1();
			case ADDRESSLINE2:
				return getAddressline2();
			case MUNICIPALITY:
				return getMunicipality();
			case REGION:
				return getRegion();
			case COUNTRY:
				return getCountry();
			case POSTAL_CODE:
				return getPostalCode();
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
			case ADDRESSLINE1:
				setAddressline1((String)newValue);
				return;
			case ADDRESSLINE2:
				setAddressline2((String)newValue);
				return;
			case MUNICIPALITY:
				setMunicipality((String)newValue);
				return;
			case REGION:
				setRegion((String)newValue);
				return;
			case COUNTRY:
				setCountry((String)newValue);
				return;
			case POSTAL_CODE:
				setPostalCode((String)newValue);
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
			case ADDRESSLINE1:
				unsetAddressline1();
				return;
			case ADDRESSLINE2:
				unsetAddressline2();
				return;
			case MUNICIPALITY:
				unsetMunicipality();
				return;
			case REGION:
				unsetRegion();
				return;
			case COUNTRY:
				unsetCountry();
				return;
			case POSTAL_CODE:
				unsetPostalCode();
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
			case ADDRESSLINE1:
				return isSetAddressline1();
			case ADDRESSLINE2:
				return isSetAddressline2();
			case MUNICIPALITY:
				return isSetMunicipality();
			case REGION:
				return isSetRegion();
			case COUNTRY:
				return isSetCountry();
			case POSTAL_CODE:
				return isSetPostalCode();
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
		result.append(" (addressline1: ");
		if (addressline1_set_) result.append(addressline1); else result.append("<unset>");
		result.append(", addressline2: ");
		if (addressline2_set_) result.append(addressline2); else result.append("<unset>");
		result.append(", municipality: ");
		if (municipality_set_) result.append(municipality); else result.append("<unset>");
		result.append(", region: ");
		if (region_set_) result.append(region); else result.append("<unset>");
		result.append(", country: ");
		if (country_set_) result.append(country); else result.append("<unset>");
		result.append(", postalCode: ");
		if (postalCode_set_) result.append(postalCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AddressType

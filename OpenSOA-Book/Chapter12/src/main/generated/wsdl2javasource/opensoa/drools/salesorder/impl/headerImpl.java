/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.salesorder.impl;

import commonj.sdo.Type;

import opensoa.drools.salesorder.SalesorderFactory;
import opensoa.drools.salesorder.header;
import opensoa.drools.salesorder.shipping;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opensoa.drools.salesorder.impl.headerImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.headerImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.headerImpl#getPartyContactId <em>Party Contact Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.headerImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.headerImpl#getShipping <em>Shipping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class headerImpl extends DataObjectBase implements header
{

	public final static int ORDER_ID = 0;

	public final static int PARTY_ID = 1;

	public final static int PARTY_CONTACT_ID = 2;

	public final static int CURRENCY = 3;

	public final static int SHIPPING = 4;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ORDER_ID = 0;

	/**
	 * The internal feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PARTY_ID = 1;

	/**
	 * The internal feature id for the '<em><b>Party Contact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PARTY_CONTACT_ID = 2;

	/**
	 * The internal feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CURRENCY = 3;

	/**
	 * The internal feature id for the '<em><b>Shipping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SHIPPING = 4;

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
			case _INTERNAL_ORDER_ID: return ORDER_ID;
			case _INTERNAL_PARTY_ID: return PARTY_ID;
			case _INTERNAL_PARTY_CONTACT_ID: return PARTY_CONTACT_ID;
			case _INTERNAL_CURRENCY: return CURRENCY;
			case _INTERNAL_SHIPPING: return SHIPPING;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_DEFAULT_;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_DEFAULT_;

	/**
	 * The default value of the '{@link #getPartyContactId() <em>Party Contact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyContactId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_CONTACT_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getPartyContactId() <em>Party Contact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyContactId()
	 * @generated
	 * @ordered
	 */
	protected String partyContactId = PARTY_CONTACT_ID_DEFAULT_;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_DEFAULT_;

	/**
	 * The cached value of the '{@link #getShipping() <em>Shipping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipping()
	 * @generated
	 * @ordered
	 */
	
	protected shipping shipping = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public headerImpl()
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
		return ((SalesorderFactoryImpl)SalesorderFactory.INSTANCE).getheader();
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
	public String getOrderId()
	{
		return orderId;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderId(String newOrderId)
	{
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ORDER_ID, oldOrderId, orderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartyId()
	{
		return partyId;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyId(String newPartyId)
	{
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PARTY_ID, oldPartyId, partyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartyContactId()
	{
		return partyContactId;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyContactId(String newPartyContactId)
	{
		String oldPartyContactId = partyContactId;
		partyContactId = newPartyContactId;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PARTY_CONTACT_ID, oldPartyContactId, partyContactId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrency()
	{
		return currency;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(String newCurrency)
	{
		String oldCurrency = currency;
		currency = newCurrency;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CURRENCY, oldCurrency, currency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public shipping getShipping()
	{
		return shipping;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipping(shipping newShipping)
	{
		shipping oldShipping = shipping;
		shipping = newShipping;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SHIPPING, oldShipping, shipping);
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
			case ORDER_ID:
				return getOrderId();
			case PARTY_ID:
				return getPartyId();
			case PARTY_CONTACT_ID:
				return getPartyContactId();
			case CURRENCY:
				return getCurrency();
			case SHIPPING:
				return getShipping();
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
			case ORDER_ID:
				setOrderId((String)newValue);
				return;
			case PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PARTY_CONTACT_ID:
				setPartyContactId((String)newValue);
				return;
			case CURRENCY:
				setCurrency((String)newValue);
				return;
			case SHIPPING:
				setShipping((shipping)newValue);
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
			case ORDER_ID:
				setOrderId(ORDER_ID_DEFAULT_);
				return;
			case PARTY_ID:
				setPartyId(PARTY_ID_DEFAULT_);
				return;
			case PARTY_CONTACT_ID:
				setPartyContactId(PARTY_CONTACT_ID_DEFAULT_);
				return;
			case CURRENCY:
				setCurrency(CURRENCY_DEFAULT_);
				return;
			case SHIPPING:
				setShipping((shipping)null);
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
			case ORDER_ID:
				return ORDER_ID_DEFAULT_ == null ? orderId != null : !ORDER_ID_DEFAULT_.equals(orderId);
			case PARTY_ID:
				return PARTY_ID_DEFAULT_ == null ? partyId != null : !PARTY_ID_DEFAULT_.equals(partyId);
			case PARTY_CONTACT_ID:
				return PARTY_CONTACT_ID_DEFAULT_ == null ? partyContactId != null : !PARTY_CONTACT_ID_DEFAULT_.equals(partyContactId);
			case CURRENCY:
				return CURRENCY_DEFAULT_ == null ? currency != null : !CURRENCY_DEFAULT_.equals(currency);
			case SHIPPING:
				return shipping != null;
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", partyContactId: ");
		result.append(partyContactId);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}

} //headerImpl

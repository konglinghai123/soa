/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.salesorder.impl;

import commonj.sdo.Type;

import opensoa.drools.salesorder.PriceCalculatorResponse;
import opensoa.drools.salesorder.SalesorderFactory;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price Calculator Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl#getSalePrice <em>Sale Price</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl#getShippingPrice <em>Shipping Price</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriceCalculatorResponseImpl extends DataObjectBase implements PriceCalculatorResponse
{

	public final static int ORDER_ID = 0;

	public final static int SALE_PRICE = 1;

	public final static int SHIPPING_PRICE = 2;

	public final static int TOTAL_PRICE = 3;

	public final static int COMMENTS = 4;

	public final static int CURRENCY = 5;

	public final static int SDO_PROPERTY_COUNT = 6;

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
	 * The internal feature id for the '<em><b>Sale Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SALE_PRICE = 1;

	/**
	 * The internal feature id for the '<em><b>Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SHIPPING_PRICE = 2;

	/**
	 * The internal feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOTAL_PRICE = 3;

	/**
	 * The internal feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_COMMENTS = 4;

	/**
	 * The internal feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CURRENCY = 5;

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
			case _INTERNAL_ORDER_ID: return ORDER_ID;
			case _INTERNAL_SALE_PRICE: return SALE_PRICE;
			case _INTERNAL_SHIPPING_PRICE: return SHIPPING_PRICE;
			case _INTERNAL_TOTAL_PRICE: return TOTAL_PRICE;
			case _INTERNAL_COMMENTS: return COMMENTS;
			case _INTERNAL_CURRENCY: return CURRENCY;
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
	 * The default value of the '{@link #getSalePrice() <em>Sale Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalePrice()
	 * @generated
	 * @ordered
	 */
	protected static final float SALE_PRICE_DEFAULT_ = 0.0F;

	/**
	 * The cached value of the '{@link #getSalePrice() <em>Sale Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalePrice()
	 * @generated
	 * @ordered
	 */
	protected float salePrice = SALE_PRICE_DEFAULT_;

	/**
	 * The default value of the '{@link #getShippingPrice() <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float SHIPPING_PRICE_DEFAULT_ = 0.0F;

	/**
	 * The cached value of the '{@link #getShippingPrice() <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected float shippingPrice = SHIPPING_PRICE_DEFAULT_;

	/**
	 * The default value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_PRICE_DEFAULT_ = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected float totalPrice = TOTAL_PRICE_DEFAULT_;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_DEFAULT_;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceCalculatorResponseImpl()
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
		return ((SalesorderFactoryImpl)SalesorderFactory.INSTANCE).getPriceCalculatorResponse();
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
	public float getSalePrice()
	{
		return salePrice;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalePrice(float newSalePrice)
	{
		float oldSalePrice = salePrice;
		salePrice = newSalePrice;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SALE_PRICE, oldSalePrice, salePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShippingPrice()
	{
		return shippingPrice;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShippingPrice(float newShippingPrice)
	{
		float oldShippingPrice = shippingPrice;
		shippingPrice = newShippingPrice;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SHIPPING_PRICE, oldShippingPrice, shippingPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalPrice()
	{
		return totalPrice;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPrice(float newTotalPrice)
	{
		float oldTotalPrice = totalPrice;
		totalPrice = newTotalPrice;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TOTAL_PRICE, oldTotalPrice, totalPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComments()
	{
		return comments;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(String newComments)
	{
		String oldComments = comments;
		comments = newComments;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_COMMENTS, oldComments, comments);
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
	public Object get(int propertyIndex, boolean resolve)
	{
		switch (propertyIndex)
		{
			case ORDER_ID:
				return getOrderId();
			case SALE_PRICE:
				return new Float(getSalePrice());
			case SHIPPING_PRICE:
				return new Float(getShippingPrice());
			case TOTAL_PRICE:
				return new Float(getTotalPrice());
			case COMMENTS:
				return getComments();
			case CURRENCY:
				return getCurrency();
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
			case SALE_PRICE:
				setSalePrice(((Float)newValue).floatValue());
				return;
			case SHIPPING_PRICE:
				setShippingPrice(((Float)newValue).floatValue());
				return;
			case TOTAL_PRICE:
				setTotalPrice(((Float)newValue).floatValue());
				return;
			case COMMENTS:
				setComments((String)newValue);
				return;
			case CURRENCY:
				setCurrency((String)newValue);
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
			case SALE_PRICE:
				setSalePrice(SALE_PRICE_DEFAULT_);
				return;
			case SHIPPING_PRICE:
				setShippingPrice(SHIPPING_PRICE_DEFAULT_);
				return;
			case TOTAL_PRICE:
				setTotalPrice(TOTAL_PRICE_DEFAULT_);
				return;
			case COMMENTS:
				setComments(COMMENTS_DEFAULT_);
				return;
			case CURRENCY:
				setCurrency(CURRENCY_DEFAULT_);
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
			case SALE_PRICE:
				return salePrice != SALE_PRICE_DEFAULT_;
			case SHIPPING_PRICE:
				return shippingPrice != SHIPPING_PRICE_DEFAULT_;
			case TOTAL_PRICE:
				return totalPrice != TOTAL_PRICE_DEFAULT_;
			case COMMENTS:
				return COMMENTS_DEFAULT_ == null ? comments != null : !COMMENTS_DEFAULT_.equals(comments);
			case CURRENCY:
				return CURRENCY_DEFAULT_ == null ? currency != null : !CURRENCY_DEFAULT_.equals(currency);
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
		result.append(", salePrice: ");
		result.append(salePrice);
		result.append(", shippingPrice: ");
		result.append(shippingPrice);
		result.append(", totalPrice: ");
		result.append(totalPrice);
		result.append(", comments: ");
		result.append(comments);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}

} //PriceCalculatorResponseImpl

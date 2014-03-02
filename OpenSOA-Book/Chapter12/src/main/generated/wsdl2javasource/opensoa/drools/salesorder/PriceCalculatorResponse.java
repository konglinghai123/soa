/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.salesorder;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price Calculator Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.drools.salesorder.PriceCalculatorResponse#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.PriceCalculatorResponse#getSalePrice <em>Sale Price</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.PriceCalculatorResponse#getShippingPrice <em>Shipping Price</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.PriceCalculatorResponse#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.PriceCalculatorResponse#getComments <em>Comments</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.PriceCalculatorResponse#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface PriceCalculatorResponse extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.PriceCalculatorResponse#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Sale Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sale Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sale Price</em>' attribute.
	 * @see #setSalePrice(float)
	 * @generated
	 */
	float getSalePrice();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.PriceCalculatorResponse#getSalePrice <em>Sale Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sale Price</em>' attribute.
	 * @see #getSalePrice()
	 * @generated
	 */
	void setSalePrice(float value);

	/**
	 * Returns the value of the '<em><b>Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Price</em>' attribute.
	 * @see #setShippingPrice(float)
	 * @generated
	 */
	float getShippingPrice();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.PriceCalculatorResponse#getShippingPrice <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Price</em>' attribute.
	 * @see #getShippingPrice()
	 * @generated
	 */
	void setShippingPrice(float value);

	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(float)
	 * @generated
	 */
	float getTotalPrice();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.PriceCalculatorResponse#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(float value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.PriceCalculatorResponse#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.PriceCalculatorResponse#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

} // PriceCalculatorResponse

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
 * A representation of the model object '<em><b>shipping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.drools.salesorder.shipping#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.shipping#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface shipping extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' attribute.
	 * @see #setCarrier(String)
	 * @generated
	 */
	String getCarrier();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.shipping#getCarrier <em>Carrier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' attribute.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.shipping#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // shipping

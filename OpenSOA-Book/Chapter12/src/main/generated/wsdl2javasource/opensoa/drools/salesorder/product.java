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
 * A representation of the model object '<em><b>product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.drools.salesorder.product#getLineId <em>Line Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.product#getProductId <em>Product Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.product#getCnt <em>Cnt</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface product extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Line Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Id</em>' attribute.
	 * @see #setLineId(String)
	 * @generated
	 */
	String getLineId();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.product#getLineId <em>Line Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Id</em>' attribute.
	 * @see #getLineId()
	 * @generated
	 */
	void setLineId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.product#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cnt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cnt</em>' attribute.
	 * @see #setCnt(int)
	 * @generated
	 */
	int getCnt();

	/**
	 * Sets the value of the '{@link opensoa.drools.salesorder.product#getCnt <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cnt</em>' attribute.
	 * @see #getCnt()
	 * @generated
	 */
	void setCnt(int value);

} // product

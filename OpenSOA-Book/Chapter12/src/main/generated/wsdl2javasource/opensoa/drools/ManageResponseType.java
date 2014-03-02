/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manage Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.drools.ManageResponseType#getResultCode <em>Result Code</em>}</li>
 *   <li>{@link opensoa.drools.ManageResponseType#getResult <em>Result</em>}</li>
 *   <li>{@link opensoa.drools.ManageResponseType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface ManageResponseType extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Code</em>' attribute.
	 * @see #setResultCode(int)
	 * @generated
	 */
	int getResultCode();

	/**
	 * Sets the value of the '{@link opensoa.drools.ManageResponseType#getResultCode <em>Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Code</em>' attribute.
	 * @see #getResultCode()
	 * @generated
	 */
	void setResultCode(int value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link opensoa.drools.ManageResponseType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link opensoa.drools.ManageResponseType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // ManageResponseType

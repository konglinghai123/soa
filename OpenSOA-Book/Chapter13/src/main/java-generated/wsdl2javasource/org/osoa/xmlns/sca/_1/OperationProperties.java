/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1;

import java.io.Serializable;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.OperationProperties#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.OperationProperties#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.OperationProperties#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.OperationProperties#getNativeOperation <em>Native Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface OperationProperties extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute list.
	 * @generated
	 */
	List getProperty();

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference.
	 * @see #setHeaders(Headers)
	 * @generated
	 */
	Headers getHeaders();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.OperationProperties#getHeaders <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' containment reference.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(Headers value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.OperationProperties#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Native Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Operation</em>' attribute.
	 * @see #setNativeOperation(String)
	 * @generated
	 */
	String getNativeOperation();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.OperationProperties#getNativeOperation <em>Native Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Operation</em>' attribute.
	 * @see #getNativeOperation()
	 * @generated
	 */
	void setNativeOperation(String value);

} // OperationProperties

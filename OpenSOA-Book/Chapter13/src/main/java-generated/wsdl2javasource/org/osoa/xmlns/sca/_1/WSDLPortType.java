/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1;

import commonj.sdo.Sequence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSDL Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.WSDLPortType#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.WSDLPortType#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.WSDLPortType#getCallbackInterface <em>Callback Interface</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.WSDLPortType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface WSDLPortType extends Interface
{
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @generated
	 */
	Sequence getAny();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(String)
	 * @generated
	 */
	String getInterface();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.WSDLPortType#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(String value);

	/**
	 * Returns the value of the '<em><b>Callback Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Interface</em>' attribute.
	 * @see #setCallbackInterface(String)
	 * @generated
	 */
	String getCallbackInterface();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.WSDLPortType#getCallbackInterface <em>Callback Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback Interface</em>' attribute.
	 * @see #getCallbackInterface()
	 * @generated
	 */
	void setCallbackInterface(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @generated
	 */
	Sequence getAnyAttribute();

} // WSDLPortType

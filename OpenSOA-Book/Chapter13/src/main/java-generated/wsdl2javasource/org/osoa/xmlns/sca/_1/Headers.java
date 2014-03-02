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
 * A representation of the model object '<em><b>Headers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.Headers#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Headers#getJMSType <em>JMS Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Headers#getJMSCorrelationID <em>JMS Correlation ID</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Headers#getJMSDeliveryMode <em>JMS Delivery Mode</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Headers#getJMSTimeToLive <em>JMS Time To Live</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Headers#getJMSPriority <em>JMS Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface Headers extends Serializable
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
	 * Returns the value of the '<em><b>JMS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JMS Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JMS Type</em>' attribute.
	 * @see #setJMSType(String)
	 * @generated
	 */
	String getJMSType();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Headers#getJMSType <em>JMS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JMS Type</em>' attribute.
	 * @see #getJMSType()
	 * @generated
	 */
	void setJMSType(String value);

	/**
	 * Returns the value of the '<em><b>JMS Correlation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JMS Correlation ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JMS Correlation ID</em>' attribute.
	 * @see #setJMSCorrelationID(String)
	 * @generated
	 */
	String getJMSCorrelationID();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Headers#getJMSCorrelationID <em>JMS Correlation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JMS Correlation ID</em>' attribute.
	 * @see #getJMSCorrelationID()
	 * @generated
	 */
	void setJMSCorrelationID(String value);

	/**
	 * Returns the value of the '<em><b>JMS Delivery Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JMS Delivery Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JMS Delivery Mode</em>' attribute.
	 * @see #setJMSDeliveryMode(String)
	 * @generated
	 */
	String getJMSDeliveryMode();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Headers#getJMSDeliveryMode <em>JMS Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JMS Delivery Mode</em>' attribute.
	 * @see #getJMSDeliveryMode()
	 * @generated
	 */
	void setJMSDeliveryMode(String value);

	/**
	 * Returns the value of the '<em><b>JMS Time To Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JMS Time To Live</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JMS Time To Live</em>' attribute.
	 * @see #setJMSTimeToLive(int)
	 * @generated
	 */
	int getJMSTimeToLive();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Headers#getJMSTimeToLive <em>JMS Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JMS Time To Live</em>' attribute.
	 * @see #getJMSTimeToLive()
	 * @generated
	 */
	void setJMSTimeToLive(int value);

	/**
	 * Returns the value of the '<em><b>JMS Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JMS Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JMS Priority</em>' attribute.
	 * @see #setJMSPriority(String)
	 * @generated
	 */
	String getJMSPriority();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Headers#getJMSPriority <em>JMS Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JMS Priority</em>' attribute.
	 * @see #getJMSPriority()
	 * @generated
	 */
	void setJMSPriority(String value);

} // Headers

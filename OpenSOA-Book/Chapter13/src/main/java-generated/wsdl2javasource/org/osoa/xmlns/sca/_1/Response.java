/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.Response#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Response#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Response#getActivationSpec <em>Activation Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface Response extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Destination)
	 * @generated
	 */
	Destination getDestination();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Response#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Destination value);

	/**
	 * Returns the value of the '<em><b>Connection Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Factory</em>' containment reference.
	 * @see #setConnectionFactory(ConnectionFactory)
	 * @generated
	 */
	ConnectionFactory getConnectionFactory();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Response#getConnectionFactory <em>Connection Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Factory</em>' containment reference.
	 * @see #getConnectionFactory()
	 * @generated
	 */
	void setConnectionFactory(ConnectionFactory value);

	/**
	 * Returns the value of the '<em><b>Activation Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Spec</em>' containment reference.
	 * @see #setActivationSpec(ActivationSpec)
	 * @generated
	 */
	ActivationSpec getActivationSpec();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Response#getActivationSpec <em>Activation Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Spec</em>' containment reference.
	 * @see #getActivationSpec()
	 * @generated
	 */
	void setActivationSpec(ActivationSpec value);

} // Response

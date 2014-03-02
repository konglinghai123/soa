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
 * A representation of the model object '<em><b>Allow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.Allow#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface Allow extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute.
	 * @see #setRoles(String)
	 * @generated
	 */
	String getRoles();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Allow#getRoles <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' attribute.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(String value);

} // Allow

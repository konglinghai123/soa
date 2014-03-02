/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1;

import commonj.sdo.Sequence;

import java.io.Serializable;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getImplementationGroup <em>Implementation Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getService <em>Service</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.ComponentType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface ComponentType extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Implementation Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Group</em>' attribute list.
	 * @generated
	 */
	Sequence getImplementationGroup();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @generated
	 */
	Implementation getImplementation();

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
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @generated
	 */
	Sequence getGroup();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.ComponentService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @generated
	 */
	List getService();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.ComponentReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @generated
	 */
	List getReference();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @generated
	 */
	List getProperty();

	/**
	 * Returns the value of the '<em><b>Constraining Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraining Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraining Type</em>' attribute.
	 * @see #setConstrainingType(String)
	 * @generated
	 */
	String getConstrainingType();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.ComponentType#getConstrainingType <em>Constraining Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Type</em>' attribute.
	 * @see #getConstrainingType()
	 * @generated
	 */
	void setConstrainingType(String value);

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

} // ComponentType

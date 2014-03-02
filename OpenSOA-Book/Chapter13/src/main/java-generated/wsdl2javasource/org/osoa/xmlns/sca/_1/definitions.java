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
 * A representation of the model object '<em><b>definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getBindingGroup <em>Binding Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.definitions#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface definitions extends Serializable
{
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
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference list.
	 * @generated
	 */
	List getIntent();

	/**
	 * Returns the value of the '<em><b>Policy Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.PolicySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Set</em>' containment reference list.
	 * @generated
	 */
	List getPolicySet();

	/**
	 * Returns the value of the '<em><b>Binding Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Group</em>' attribute list.
	 * @generated
	 */
	Sequence getBindingGroup();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @generated
	 */
	List getBinding();

	/**
	 * Returns the value of the '<em><b>Binding Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.BindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Type</em>' containment reference list.
	 * @generated
	 */
	List getBindingType();

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.ImplementationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' containment reference list.
	 * @generated
	 */
	List getImplementationType();

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
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.definitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

} // definitions

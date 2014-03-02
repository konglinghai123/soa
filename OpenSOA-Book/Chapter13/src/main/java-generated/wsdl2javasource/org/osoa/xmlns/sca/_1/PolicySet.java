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
 * A representation of the model object '<em><b>Policy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getPolicySetReference <em>Policy Set Reference</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getIntentMap <em>Intent Map</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.PolicySet#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface PolicySet extends Serializable
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
	 * Returns the value of the '<em><b>Policy Set Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.PolicySetReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Set Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Set Reference</em>' containment reference list.
	 * @generated
	 */
	List getPolicySetReference();

	/**
	 * Returns the value of the '<em><b>Intent Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.IntentMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent Map</em>' containment reference list.
	 * @generated
	 */
	List getIntentMap();

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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.PolicySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' attribute.
	 * @see #setProvides(List)
	 * @generated
	 */
	List getProvides();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.PolicySet#getProvides <em>Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' attribute.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(List value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' attribute.
	 * @see #setAppliesTo(String)
	 * @generated
	 */
	String getAppliesTo();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.PolicySet#getAppliesTo <em>Applies To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' attribute.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(String value);

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

} // PolicySet

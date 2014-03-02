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
 * A representation of the model object '<em><b>Bpel Partner Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.BpelPartnerLinkType#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BpelPartnerLinkType#getType_ <em>Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BpelPartnerLinkType#getServiceRole <em>Service Role</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BpelPartnerLinkType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface BpelPartnerLinkType extends Interface
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @generated
	 */
	String getType_();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.BpelPartnerLinkType#getType_ <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType_()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Service Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Role</em>' attribute.
	 * @see #setServiceRole(String)
	 * @generated
	 */
	String getServiceRole();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.BpelPartnerLinkType#getServiceRole <em>Service Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Role</em>' attribute.
	 * @see #getServiceRole()
	 * @generated
	 */
	void setServiceRole(String value);

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

} // BpelPartnerLinkType

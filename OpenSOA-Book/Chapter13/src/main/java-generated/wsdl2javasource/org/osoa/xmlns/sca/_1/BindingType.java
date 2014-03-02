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
 * A representation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.BindingType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BindingType#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BindingType#getType_ <em>Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BindingType#getAlwaysProvides <em>Always Provides</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BindingType#getMayProvide <em>May Provide</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.BindingType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface BindingType extends Serializable
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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.BindingType#getType_ <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType_()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Always Provides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Always Provides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Provides</em>' attribute.
	 * @see #setAlwaysProvides(List)
	 * @generated
	 */
	List getAlwaysProvides();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.BindingType#getAlwaysProvides <em>Always Provides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Provides</em>' attribute.
	 * @see #getAlwaysProvides()
	 * @generated
	 */
	void setAlwaysProvides(List value);

	/**
	 * Returns the value of the '<em><b>May Provide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Provide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Provide</em>' attribute.
	 * @see #setMayProvide(List)
	 * @generated
	 */
	List getMayProvide();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.BindingType#getMayProvide <em>May Provide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Provide</em>' attribute.
	 * @see #getMayProvide()
	 * @generated
	 */
	void setMayProvide(List value);

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

} // BindingType

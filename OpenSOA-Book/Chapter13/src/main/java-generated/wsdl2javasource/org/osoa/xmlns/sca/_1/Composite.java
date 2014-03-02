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
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getGroup <em>Group</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getInclude <em>Include</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getService <em>Service</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getReference <em>Reference</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getWire <em>Wire</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#isLocal <em>Local</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.Composite#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface Composite extends Serializable
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
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Include}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @generated
	 */
	List getInclude();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Service}.
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
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @generated
	 */
	List getComponent();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Reference}.
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
	 * Returns the value of the '<em><b>Wire</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.Wire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' containment reference list.
	 * @generated
	 */
	List getWire();

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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Composite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Composite#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Composite#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Autowire</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autowire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autowire</em>' attribute.
	 * @see #setAutowire(boolean)
	 * @generated
	 */
	boolean isAutowire();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Composite#isAutowire <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autowire</em>' attribute.
	 * @see #isAutowire()
	 * @generated
	 */
	void setAutowire(boolean value);

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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Composite#getConstrainingType <em>Constraining Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Type</em>' attribute.
	 * @see #getConstrainingType()
	 * @generated
	 */
	void setConstrainingType(String value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' attribute.
	 * @see #setRequires(List)
	 * @generated
	 */
	List getRequires();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Composite#getRequires <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' attribute.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(List value);

	/**
	 * Returns the value of the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Sets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Sets</em>' attribute.
	 * @see #setPolicySets(List)
	 * @generated
	 */
	List getPolicySets();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.Composite#getPolicySets <em>Policy Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Sets</em>' attribute.
	 * @see #getPolicySets()
	 * @generated
	 */
	void setPolicySets(List value);

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

} // Composite

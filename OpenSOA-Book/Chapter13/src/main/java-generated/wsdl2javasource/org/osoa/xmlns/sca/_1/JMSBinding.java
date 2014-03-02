/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1;

import commonj.sdo.Sequence;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMS Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getActivationSpec <em>Activation Spec</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getResponse <em>Response</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getOperationProperties <em>Operation Properties</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getCorrelationScheme <em>Correlation Scheme</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getJndiURL <em>Jndi URL</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getRequestConnection <em>Request Connection</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getResponseConnection <em>Response Connection</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getOperationProperties1 <em>Operation Properties1</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.JMSBinding#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public interface JMSBinding extends Binding
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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getDestination <em>Destination</em>}' containment reference.
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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getConnectionFactory <em>Connection Factory</em>}' containment reference.
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
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getActivationSpec <em>Activation Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Spec</em>' containment reference.
	 * @see #getActivationSpec()
	 * @generated
	 */
	void setActivationSpec(ActivationSpec value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Response)
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference.
	 * @see #setHeaders(Headers)
	 * @generated
	 */
	Headers getHeaders();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getHeaders <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' containment reference.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(Headers value);

	/**
	 * Returns the value of the '<em><b>Resource Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Adapter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Adapter</em>' containment reference.
	 * @see #setResourceAdapter(ResourceAdapter)
	 * @generated
	 */
	ResourceAdapter getResourceAdapter();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getResourceAdapter <em>Resource Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Adapter</em>' containment reference.
	 * @see #getResourceAdapter()
	 * @generated
	 */
	void setResourceAdapter(ResourceAdapter value);

	/**
	 * Returns the value of the '<em><b>Operation Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.osoa.xmlns.sca._1.OperationProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Properties</em>' containment reference list.
	 * @generated
	 */
	List getOperationProperties();

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
	 * Returns the value of the '<em><b>Correlation Scheme</b></em>' attribute.
	 * The default value is <code>"RequestMsgIDToCorrelID"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Scheme</em>' attribute.
	 * @see #setCorrelationScheme(String)
	 * @generated
	 */
	String getCorrelationScheme();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getCorrelationScheme <em>Correlation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Scheme</em>' attribute.
	 * @see #getCorrelationScheme()
	 * @generated
	 */
	void setCorrelationScheme(String value);

	/**
	 * Returns the value of the '<em><b>Initial Context Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Context Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Context Factory</em>' attribute.
	 * @see #setInitialContextFactory(String)
	 * @generated
	 */
	String getInitialContextFactory();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getInitialContextFactory <em>Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Context Factory</em>' attribute.
	 * @see #getInitialContextFactory()
	 * @generated
	 */
	void setInitialContextFactory(String value);

	/**
	 * Returns the value of the '<em><b>Jndi URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi URL</em>' attribute.
	 * @see #setJndiURL(String)
	 * @generated
	 */
	String getJndiURL();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getJndiURL <em>Jndi URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi URL</em>' attribute.
	 * @see #getJndiURL()
	 * @generated
	 */
	void setJndiURL(String value);

	/**
	 * Returns the value of the '<em><b>Request Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Connection</em>' attribute.
	 * @see #setRequestConnection(String)
	 * @generated
	 */
	String getRequestConnection();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getRequestConnection <em>Request Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Connection</em>' attribute.
	 * @see #getRequestConnection()
	 * @generated
	 */
	void setRequestConnection(String value);

	/**
	 * Returns the value of the '<em><b>Response Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Connection</em>' attribute.
	 * @see #setResponseConnection(String)
	 * @generated
	 */
	String getResponseConnection();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getResponseConnection <em>Response Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Connection</em>' attribute.
	 * @see #getResponseConnection()
	 * @generated
	 */
	void setResponseConnection(String value);

	/**
	 * Returns the value of the '<em><b>Operation Properties1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Properties1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Properties1</em>' attribute.
	 * @see #setOperationProperties1(String)
	 * @generated
	 */
	String getOperationProperties1();

	/**
	 * Sets the value of the '{@link org.osoa.xmlns.sca._1.JMSBinding#getOperationProperties1 <em>Operation Properties1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Properties1</em>' attribute.
	 * @see #getOperationProperties1()
	 * @generated
	 */
	void setOperationProperties1(String value);

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

} // JMSBinding

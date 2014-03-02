/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Sequence;
import commonj.sdo.Type;

import java.util.Collection;
import java.util.List;

import org.osoa.xmlns.sca._1.ActivationSpec;
import org.osoa.xmlns.sca._1.ConnectionFactory;
import org.osoa.xmlns.sca._1.Destination;
import org.osoa.xmlns.sca._1.Headers;
import org.osoa.xmlns.sca._1.JMSBinding;
import org.osoa.xmlns.sca._1.OperationProperties;
import org.osoa.xmlns.sca._1.ResourceAdapter;
import org.osoa.xmlns.sca._1.Response;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getActivationSpec <em>Activation Spec</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getOperationProperties <em>Operation Properties</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getCorrelationScheme <em>Correlation Scheme</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getJndiURL <em>Jndi URL</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getRequestConnection <em>Request Connection</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getResponseConnection <em>Response Connection</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getOperationProperties1 <em>Operation Properties1</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.JMSBindingImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSBindingImpl extends BindingImpl implements JMSBinding
{

	public final static int DESTINATION = BindingImpl.SDO_PROPERTY_COUNT + 0;

	public final static int CONNECTION_FACTORY = BindingImpl.SDO_PROPERTY_COUNT + 1;

	public final static int ACTIVATION_SPEC = BindingImpl.SDO_PROPERTY_COUNT + 2;

	public final static int RESPONSE = BindingImpl.SDO_PROPERTY_COUNT + 3;

	public final static int HEADERS = BindingImpl.SDO_PROPERTY_COUNT + 4;

	public final static int RESOURCE_ADAPTER = BindingImpl.SDO_PROPERTY_COUNT + 5;

	public final static int OPERATION_PROPERTIES = BindingImpl.SDO_PROPERTY_COUNT + 6;

	public final static int ANY = BindingImpl.EXTENDED_PROPERTY_COUNT + -1;

	public final static int CORRELATION_SCHEME = BindingImpl.SDO_PROPERTY_COUNT + 7;

	public final static int INITIAL_CONTEXT_FACTORY = BindingImpl.SDO_PROPERTY_COUNT + 8;

	public final static int JNDI_URL = BindingImpl.SDO_PROPERTY_COUNT + 9;

	public final static int REQUEST_CONNECTION = BindingImpl.SDO_PROPERTY_COUNT + 10;

	public final static int RESPONSE_CONNECTION = BindingImpl.SDO_PROPERTY_COUNT + 11;

	public final static int OPERATION_PROPERTIES1 = BindingImpl.SDO_PROPERTY_COUNT + 12;

	public final static int ANY_ATTRIBUTE = BindingImpl.EXTENDED_PROPERTY_COUNT + -2;

	public final static int SDO_PROPERTY_COUNT = BindingImpl.SDO_PROPERTY_COUNT + 13;

	public final static int EXTENDED_PROPERTY_COUNT = BindingImpl.EXTENDED_PROPERTY_COUNT - 2;


	/**
	 * The internal feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OPERATION = BindingImpl._INTERNAL_OPERATION;

	/**
	 * The internal feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_URI = BindingImpl._INTERNAL_URI;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = BindingImpl._INTERNAL_NAME;

	/**
	 * The internal feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REQUIRES = BindingImpl._INTERNAL_REQUIRES;

	/**
	 * The internal feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POLICY_SETS = BindingImpl._INTERNAL_POLICY_SETS;

	/**
	 * The internal feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DESTINATION = BindingImpl.INTERNAL_PROPERTY_COUNT + 0;

	/**
	 * The internal feature id for the '<em><b>Connection Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CONNECTION_FACTORY = BindingImpl.INTERNAL_PROPERTY_COUNT + 1;

	/**
	 * The internal feature id for the '<em><b>Activation Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ACTIVATION_SPEC = BindingImpl.INTERNAL_PROPERTY_COUNT + 2;

	/**
	 * The internal feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_RESPONSE = BindingImpl.INTERNAL_PROPERTY_COUNT + 3;

	/**
	 * The internal feature id for the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HEADERS = BindingImpl.INTERNAL_PROPERTY_COUNT + 4;

	/**
	 * The internal feature id for the '<em><b>Resource Adapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_RESOURCE_ADAPTER = BindingImpl.INTERNAL_PROPERTY_COUNT + 5;

	/**
	 * The internal feature id for the '<em><b>Operation Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OPERATION_PROPERTIES = BindingImpl.INTERNAL_PROPERTY_COUNT + 6;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = BindingImpl.INTERNAL_PROPERTY_COUNT + 7;

	/**
	 * The internal feature id for the '<em><b>Correlation Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CORRELATION_SCHEME = BindingImpl.INTERNAL_PROPERTY_COUNT + 8;

	/**
	 * The internal feature id for the '<em><b>Initial Context Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_INITIAL_CONTEXT_FACTORY = BindingImpl.INTERNAL_PROPERTY_COUNT + 9;

	/**
	 * The internal feature id for the '<em><b>Jndi URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_JNDI_URL = BindingImpl.INTERNAL_PROPERTY_COUNT + 10;

	/**
	 * The internal feature id for the '<em><b>Request Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_REQUEST_CONNECTION = BindingImpl.INTERNAL_PROPERTY_COUNT + 11;

	/**
	 * The internal feature id for the '<em><b>Response Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_RESPONSE_CONNECTION = BindingImpl.INTERNAL_PROPERTY_COUNT + 12;

	/**
	 * The internal feature id for the '<em><b>Operation Properties1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OPERATION_PROPERTIES1 = BindingImpl.INTERNAL_PROPERTY_COUNT + 13;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = BindingImpl.INTERNAL_PROPERTY_COUNT + 14;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = BindingImpl.INTERNAL_PROPERTY_COUNT + 15;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_OPERATION: return OPERATION;
			case _INTERNAL_URI: return URI;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_REQUIRES: return REQUIRES;
			case _INTERNAL_POLICY_SETS: return POLICY_SETS;
			case _INTERNAL_DESTINATION: return DESTINATION;
			case _INTERNAL_CONNECTION_FACTORY: return CONNECTION_FACTORY;
			case _INTERNAL_ACTIVATION_SPEC: return ACTIVATION_SPEC;
			case _INTERNAL_RESPONSE: return RESPONSE;
			case _INTERNAL_HEADERS: return HEADERS;
			case _INTERNAL_RESOURCE_ADAPTER: return RESOURCE_ADAPTER;
			case _INTERNAL_OPERATION_PROPERTIES: return OPERATION_PROPERTIES;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_CORRELATION_SCHEME: return CORRELATION_SCHEME;
			case _INTERNAL_INITIAL_CONTEXT_FACTORY: return INITIAL_CONTEXT_FACTORY;
			case _INTERNAL_JNDI_URL: return JNDI_URL;
			case _INTERNAL_REQUEST_CONNECTION: return REQUEST_CONNECTION;
			case _INTERNAL_RESPONSE_CONNECTION: return RESPONSE_CONNECTION;
			case _INTERNAL_OPERATION_PROPERTIES1: return OPERATION_PROPERTIES1;
			case _INTERNAL_ANY_ATTRIBUTE: return ANY_ATTRIBUTE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	
	protected Destination destination = null;
	
	/**
	 * The cached value of the '{@link #getConnectionFactory() <em>Connection Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionFactory()
	 * @generated
	 * @ordered
	 */
	
	protected ConnectionFactory connectionFactory = null;
	
	/**
	 * The cached value of the '{@link #getActivationSpec() <em>Activation Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationSpec()
	 * @generated
	 * @ordered
	 */
	
	protected ActivationSpec activationSpec = null;
	
	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	
	protected Response response = null;
	
	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	
	protected Headers headers = null;
	
	/**
	 * The cached value of the '{@link #getResourceAdapter() <em>Resource Adapter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAdapter()
	 * @generated
	 * @ordered
	 */
	
	protected ResourceAdapter resourceAdapter = null;
	
	/**
	 * The cached value of the '{@link #getOperationProperties() <em>Operation Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationProperties()
	 * @generated
	 * @ordered
	 */
	
	protected List operationProperties = null;
	
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence any = null;
	
	/**
	 * The default value of the '{@link #getCorrelationScheme() <em>Correlation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_SCHEME_DEFAULT_ = "RequestMsgIDToCorrelID";

	/**
	 * The cached value of the '{@link #getCorrelationScheme() <em>Correlation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationScheme()
	 * @generated
	 * @ordered
	 */
	protected String correlationScheme = CORRELATION_SCHEME_DEFAULT_;

	/**
	 * The default value of the '{@link #getInitialContextFactory() <em>Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialContextFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_CONTEXT_FACTORY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getInitialContextFactory() <em>Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialContextFactory()
	 * @generated
	 * @ordered
	 */
	protected String initialContextFactory = INITIAL_CONTEXT_FACTORY_DEFAULT_;

	/**
	 * The default value of the '{@link #getJndiURL() <em>Jndi URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiURL()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_URL_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getJndiURL() <em>Jndi URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiURL()
	 * @generated
	 * @ordered
	 */
	protected String jndiURL = JNDI_URL_DEFAULT_;

	/**
	 * The default value of the '{@link #getRequestConnection() <em>Request Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestConnection()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_CONNECTION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getRequestConnection() <em>Request Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestConnection()
	 * @generated
	 * @ordered
	 */
	protected String requestConnection = REQUEST_CONNECTION_DEFAULT_;

	/**
	 * The default value of the '{@link #getResponseConnection() <em>Response Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseConnection()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_CONNECTION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getResponseConnection() <em>Response Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseConnection()
	 * @generated
	 * @ordered
	 */
	protected String responseConnection = RESPONSE_CONNECTION_DEFAULT_;

	/**
	 * The default value of the '{@link #getOperationProperties1() <em>Operation Properties1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationProperties1()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_PROPERTIES1_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getOperationProperties1() <em>Operation Properties1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationProperties1()
	 * @generated
	 * @ordered
	 */
	protected String operationProperties1 = OPERATION_PROPERTIES1_DEFAULT_;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence anyAttribute = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSBindingImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getStaticType()
	{
		return ((_1FactoryImpl)_1Factory.INSTANCE).getJMSBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStaticPropertyCount()
	{
		return INTERNAL_PROPERTY_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destination getDestination()
	{
		return destination;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Destination newDestination)
	{
		Destination oldDestination = destination;
		destination = newDestination;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DESTINATION, oldDestination, destination);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionFactory getConnectionFactory()
	{
		return connectionFactory;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionFactory(ConnectionFactory newConnectionFactory)
	{
		ConnectionFactory oldConnectionFactory = connectionFactory;
		connectionFactory = newConnectionFactory;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CONNECTION_FACTORY, oldConnectionFactory, connectionFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationSpec getActivationSpec()
	{
		return activationSpec;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationSpec(ActivationSpec newActivationSpec)
	{
		ActivationSpec oldActivationSpec = activationSpec;
		activationSpec = newActivationSpec;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ACTIVATION_SPEC, oldActivationSpec, activationSpec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponse()
	{
		return response;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Response newResponse)
	{
		Response oldResponse = response;
		response = newResponse;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_RESPONSE, oldResponse, response);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Headers getHeaders()
	{
		return headers;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaders(Headers newHeaders)
	{
		Headers oldHeaders = headers;
		headers = newHeaders;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_HEADERS, oldHeaders, headers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAdapter getResourceAdapter()
	{
		return resourceAdapter;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAdapter(ResourceAdapter newResourceAdapter)
	{
		ResourceAdapter oldResourceAdapter = resourceAdapter;
		resourceAdapter = newResourceAdapter;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_RESOURCE_ADAPTER, oldResourceAdapter, resourceAdapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOperationProperties()
	{
		if (operationProperties == null)
		{
		  operationProperties = createPropertyList(ListKind.NONCONTAINMENT, OperationProperties.class, OPERATION_PROPERTIES, 0);
		}
		return operationProperties;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getAny()
	{
		if (any == null)
		{
		  any = createSequence(_INTERNAL_ANY);
		}
		return any;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrelationScheme()
	{
		return correlationScheme;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationScheme(String newCorrelationScheme)
	{
		String oldCorrelationScheme = correlationScheme;
		correlationScheme = newCorrelationScheme;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CORRELATION_SCHEME, oldCorrelationScheme, correlationScheme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialContextFactory()
	{
		return initialContextFactory;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialContextFactory(String newInitialContextFactory)
	{
		String oldInitialContextFactory = initialContextFactory;
		initialContextFactory = newInitialContextFactory;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_INITIAL_CONTEXT_FACTORY, oldInitialContextFactory, initialContextFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiURL()
	{
		return jndiURL;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiURL(String newJndiURL)
	{
		String oldJndiURL = jndiURL;
		jndiURL = newJndiURL;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_JNDI_URL, oldJndiURL, jndiURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestConnection()
	{
		return requestConnection;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestConnection(String newRequestConnection)
	{
		String oldRequestConnection = requestConnection;
		requestConnection = newRequestConnection;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_REQUEST_CONNECTION, oldRequestConnection, requestConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseConnection()
	{
		return responseConnection;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseConnection(String newResponseConnection)
	{
		String oldResponseConnection = responseConnection;
		responseConnection = newResponseConnection;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_RESPONSE_CONNECTION, oldResponseConnection, responseConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationProperties1()
	{
		return operationProperties1;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationProperties1(String newOperationProperties1)
	{
		String oldOperationProperties1 = operationProperties1;
		operationProperties1 = newOperationProperties1;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_OPERATION_PROPERTIES1, oldOperationProperties1, operationProperties1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getAnyAttribute()
	{
		if (anyAttribute == null)
		{
		  anyAttribute = createSequence(_INTERNAL_ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext inverseRemove(Object otherEnd, int propertyIndex, ChangeContext changeContext)
	{
		switch (propertyIndex)
		{
			case ANY:
				return removeFromSequence(getAny(), otherEnd, changeContext);
			case ANY_ATTRIBUTE:
				return removeFromSequence(getAnyAttribute(), otherEnd, changeContext);
		}
		return super.inverseRemove(otherEnd, propertyIndex, changeContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object get(int propertyIndex, boolean resolve)
	{
		switch (propertyIndex)
		{
			case DESTINATION:
				return getDestination();
			case CONNECTION_FACTORY:
				return getConnectionFactory();
			case ACTIVATION_SPEC:
				return getActivationSpec();
			case RESPONSE:
				return getResponse();
			case HEADERS:
				return getHeaders();
			case RESOURCE_ADAPTER:
				return getResourceAdapter();
			case OPERATION_PROPERTIES:
				return getOperationProperties();
			case ANY:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAny();
			case CORRELATION_SCHEME:
				return getCorrelationScheme();
			case INITIAL_CONTEXT_FACTORY:
				return getInitialContextFactory();
			case JNDI_URL:
				return getJndiURL();
			case REQUEST_CONNECTION:
				return getRequestConnection();
			case RESPONSE_CONNECTION:
				return getResponseConnection();
			case OPERATION_PROPERTIES1:
				return getOperationProperties1();
			case ANY_ATTRIBUTE:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAnyAttribute();
		}
		return super.get(propertyIndex, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(int propertyIndex, Object newValue)
	{
		switch (propertyIndex)
		{
			case DESTINATION:
				setDestination((Destination)newValue);
				return;
			case CONNECTION_FACTORY:
				setConnectionFactory((ConnectionFactory)newValue);
				return;
			case ACTIVATION_SPEC:
				setActivationSpec((ActivationSpec)newValue);
				return;
			case RESPONSE:
				setResponse((Response)newValue);
				return;
			case HEADERS:
				setHeaders((Headers)newValue);
				return;
			case RESOURCE_ADAPTER:
				setResourceAdapter((ResourceAdapter)newValue);
				return;
			case OPERATION_PROPERTIES:
				getOperationProperties().clear();
				getOperationProperties().addAll((Collection)newValue);
				return;
			case ANY:
      	setSequence(getAny(), newValue);
				return;
			case CORRELATION_SCHEME:
				setCorrelationScheme((String)newValue);
				return;
			case INITIAL_CONTEXT_FACTORY:
				setInitialContextFactory((String)newValue);
				return;
			case JNDI_URL:
				setJndiURL((String)newValue);
				return;
			case REQUEST_CONNECTION:
				setRequestConnection((String)newValue);
				return;
			case RESPONSE_CONNECTION:
				setResponseConnection((String)newValue);
				return;
			case OPERATION_PROPERTIES1:
				setOperationProperties1((String)newValue);
				return;
			case ANY_ATTRIBUTE:
      	setSequence(getAnyAttribute(), newValue);
				return;
		}
		super.set(propertyIndex, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(int propertyIndex)
	{
		switch (propertyIndex)
		{
			case DESTINATION:
				setDestination((Destination)null);
				return;
			case CONNECTION_FACTORY:
				setConnectionFactory((ConnectionFactory)null);
				return;
			case ACTIVATION_SPEC:
				setActivationSpec((ActivationSpec)null);
				return;
			case RESPONSE:
				setResponse((Response)null);
				return;
			case HEADERS:
				setHeaders((Headers)null);
				return;
			case RESOURCE_ADAPTER:
				setResourceAdapter((ResourceAdapter)null);
				return;
			case OPERATION_PROPERTIES:
				getOperationProperties().clear();
				return;
			case ANY:
				unsetSequence(getAny());
				return;
			case CORRELATION_SCHEME:
				setCorrelationScheme(CORRELATION_SCHEME_DEFAULT_);
				return;
			case INITIAL_CONTEXT_FACTORY:
				setInitialContextFactory(INITIAL_CONTEXT_FACTORY_DEFAULT_);
				return;
			case JNDI_URL:
				setJndiURL(JNDI_URL_DEFAULT_);
				return;
			case REQUEST_CONNECTION:
				setRequestConnection(REQUEST_CONNECTION_DEFAULT_);
				return;
			case RESPONSE_CONNECTION:
				setResponseConnection(RESPONSE_CONNECTION_DEFAULT_);
				return;
			case OPERATION_PROPERTIES1:
				setOperationProperties1(OPERATION_PROPERTIES1_DEFAULT_);
				return;
			case ANY_ATTRIBUTE:
				unsetSequence(getAnyAttribute());
				return;
		}
		super.unset(propertyIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSet(int propertyIndex)
	{
		switch (propertyIndex)
		{
			case DESTINATION:
				return destination != null;
			case CONNECTION_FACTORY:
				return connectionFactory != null;
			case ACTIVATION_SPEC:
				return activationSpec != null;
			case RESPONSE:
				return response != null;
			case HEADERS:
				return headers != null;
			case RESOURCE_ADAPTER:
				return resourceAdapter != null;
			case OPERATION_PROPERTIES:
				return operationProperties != null && !operationProperties.isEmpty();
			case ANY:
				return any != null && !isSequenceEmpty(getAny());
			case CORRELATION_SCHEME:
				return CORRELATION_SCHEME_DEFAULT_ == null ? correlationScheme != null : !CORRELATION_SCHEME_DEFAULT_.equals(correlationScheme);
			case INITIAL_CONTEXT_FACTORY:
				return INITIAL_CONTEXT_FACTORY_DEFAULT_ == null ? initialContextFactory != null : !INITIAL_CONTEXT_FACTORY_DEFAULT_.equals(initialContextFactory);
			case JNDI_URL:
				return JNDI_URL_DEFAULT_ == null ? jndiURL != null : !JNDI_URL_DEFAULT_.equals(jndiURL);
			case REQUEST_CONNECTION:
				return REQUEST_CONNECTION_DEFAULT_ == null ? requestConnection != null : !REQUEST_CONNECTION_DEFAULT_.equals(requestConnection);
			case RESPONSE_CONNECTION:
				return RESPONSE_CONNECTION_DEFAULT_ == null ? responseConnection != null : !RESPONSE_CONNECTION_DEFAULT_.equals(responseConnection);
			case OPERATION_PROPERTIES1:
				return OPERATION_PROPERTIES1_DEFAULT_ == null ? operationProperties1 != null : !OPERATION_PROPERTIES1_DEFAULT_.equals(operationProperties1);
			case ANY_ATTRIBUTE:
				return anyAttribute != null && !isSequenceEmpty(getAnyAttribute());
		}
		return super.isSet(propertyIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString()
	{
		if (isProxy(this)) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(", correlationScheme: ");
		result.append(correlationScheme);
		result.append(", initialContextFactory: ");
		result.append(initialContextFactory);
		result.append(", jndiURL: ");
		result.append(jndiURL);
		result.append(", requestConnection: ");
		result.append(requestConnection);
		result.append(", responseConnection: ");
		result.append(responseConnection);
		result.append(", operationProperties1: ");
		result.append(operationProperties1);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //JMSBindingImpl

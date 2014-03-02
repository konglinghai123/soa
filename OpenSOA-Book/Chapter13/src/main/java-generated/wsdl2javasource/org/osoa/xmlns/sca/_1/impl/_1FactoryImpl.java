/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;
import org.apache.tuscany.sdo.helper.TypeHelperImpl;

import commonj.sdo.DataObject;
import commonj.sdo.Type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.tuscany.sdo.impl.FactoryBase;

import org.apache.tuscany.sdo.model.ModelFactory;

import org.apache.tuscany.sdo.model.impl.ModelFactoryImpl;

import org.apache.tuscany.sdo.model.internal.InternalFactory;

import org.apache.tuscany.sdo.model.internal.impl.InternalFactoryImpl;

import org.osoa.xmlns.sca._1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * Generator information:
 * patternVersion=1.2; -prefix _1 -noContainment -noUnsettable
 * <!-- end-user-doc -->
 * @generated
 */
public class _1FactoryImpl extends FactoryBase implements _1Factory
{

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_URI = "http://www.osoa.org/xmlns/sca/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_PREFIX = "sca";

	/**
	 * The version of the generator pattern used to generate this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String PATTERN_VERSION = "1.2";
	
	public static final int ACTIVATION_SPEC = 1;	
	public static final int ALLOW = 2;	
	public static final int BINDING = 3;	
	public static final int BINDING_TYPE = 4;	
	public static final int IMPLEMENTATION = 5;	
	public static final int BPEL_IMPLEMENTATION = 6;	
	public static final int INTERFACE = 7;	
	public static final int BPEL_PARTNER_LINK_TYPE = 8;	
	public static final int CALLBACK = 9;	
	public static final int COMPONENT = 10;	
	public static final int COMPONENT_REFERENCE = 11;	
	public static final int COMPONENT_SERVICE = 12;	
	public static final int COMPONENT_TYPE = 13;	
	public static final int COMPOSITE = 14;	
	public static final int CONNECTION_FACTORY = 15;	
	public static final int CONSTRAINING_TYPE = 16;	
	public static final int DEFINITIONS = 17;	
	public static final int DENY_ALL = 18;	
	public static final int DESTINATION = 19;	
	public static final int HEADERS = 20;	
	public static final int IMPLEMENTATION_TYPE = 21;	
	public static final int INCLUDE = 22;	
	public static final int INTENT = 23;	
	public static final int INTENT_MAP = 24;	
	public static final int JAVA_IMPLEMENTATION = 25;	
	public static final int JAVA_INTERFACE = 26;	
	public static final int JMS_BINDING = 27;	
	public static final int OPERATION = 28;	
	public static final int OPERATION_PROPERTIES = 29;	
	public static final int PERMIT_ALL = 30;	
	public static final int POLICY_SET = 31;	
	public static final int POLICY_SET_REFERENCE = 32;	
	public static final int SCA_PROPERTY_BASE = 33;	
	public static final int PROPERTY = 34;	
	public static final int PROPERTY_VALUE = 35;	
	public static final int QUALIFIER = 36;	
	public static final int REFERENCE = 37;	
	public static final int RESOURCE_ADAPTER = 38;	
	public static final int RESPONSE = 39;	
	public static final int RUN_AS = 40;	
	public static final int SCA_BINDING = 41;	
	public static final int SCA_IMPLEMENTATION = 42;	
	public static final int SERVICE = 43;	
	public static final int SPRING_IMPLEMENTATION = 44;	
	public static final int WEB_SERVICE_BINDING = 45;	
	public static final int WIRE = 46;	
	public static final int WSDL_PORT_TYPE = 47;	
	public static final int CORRELATION_SCHEME = 48;	
	public static final int CREATE_RESOURCE = 49;	
	public static final int LIST_OF_ANY_UR_IS = 50;	
	public static final int LIST_OF_QNAMES = 51;	
	public static final int MULTIPLICITY = 52;	
	public static final int OVERRIDE_OPTIONS = 53;	
	public static final int TYPE = 54;
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1FactoryImpl()
	{
		super(NAMESPACE_URI, NAMESPACE_PREFIX, "org.osoa.xmlns.sca._1");
	}

	/**
	 * Registers the Factory instance so that it is available within the supplied scope.
   * @argument scope a HelperContext instance that will make the types supported by this Factory available.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void register(HelperContext scope) 
	{
		if(scope == null) {
			throw new IllegalArgumentException("Scope can not be null");
		}

		if (((HelperContextImpl)scope).getExtendedMetaData().getPackage(NAMESPACE_URI) != null)
			return;
    
		// Register this package with provided scope   
		((HelperContextImpl)scope).getExtendedMetaData().putPackage(NAMESPACE_URI, this);
		
		//Register dependent packages with provided scope
		ModelFactory.INSTANCE.register(scope);
		InternalFactory.INSTANCE.register(scope);
  }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject create(int typeNumber)
	{
		switch (typeNumber)
		{
			case ACTIVATION_SPEC: return (DataObject)createActivationSpec();
			case ALLOW: return (DataObject)createAllow();
			case BINDING_TYPE: return (DataObject)createBindingType();
			case BPEL_IMPLEMENTATION: return (DataObject)createBpelImplementation();
			case BPEL_PARTNER_LINK_TYPE: return (DataObject)createBpelPartnerLinkType();
			case CALLBACK: return (DataObject)createCallback();
			case COMPONENT: return (DataObject)createComponent();
			case COMPONENT_REFERENCE: return (DataObject)createComponentReference();
			case COMPONENT_SERVICE: return (DataObject)createComponentService();
			case COMPONENT_TYPE: return (DataObject)createComponentType();
			case COMPOSITE: return (DataObject)createComposite();
			case CONNECTION_FACTORY: return (DataObject)createConnectionFactory();
			case CONSTRAINING_TYPE: return (DataObject)createConstrainingType();
			case DEFINITIONS: return (DataObject)createdefinitions();
			case DENY_ALL: return (DataObject)createDenyAll();
			case DESTINATION: return (DataObject)createDestination();
			case HEADERS: return (DataObject)createHeaders();
			case IMPLEMENTATION_TYPE: return (DataObject)createImplementationType();
			case INCLUDE: return (DataObject)createInclude();
			case INTENT: return (DataObject)createIntent();
			case INTENT_MAP: return (DataObject)createIntentMap();
			case JAVA_IMPLEMENTATION: return (DataObject)createJavaImplementation();
			case JAVA_INTERFACE: return (DataObject)createJavaInterface();
			case JMS_BINDING: return (DataObject)createJMSBinding();
			case OPERATION: return (DataObject)createOperation();
			case OPERATION_PROPERTIES: return (DataObject)createOperationProperties();
			case PERMIT_ALL: return (DataObject)createPermitAll();
			case POLICY_SET: return (DataObject)createPolicySet();
			case POLICY_SET_REFERENCE: return (DataObject)createPolicySetReference();
			case PROPERTY: return (DataObject)createProperty();
			case PROPERTY_VALUE: return (DataObject)createPropertyValue();
			case QUALIFIER: return (DataObject)createQualifier();
			case REFERENCE: return (DataObject)createReference();
			case RESOURCE_ADAPTER: return (DataObject)createResourceAdapter();
			case RESPONSE: return (DataObject)createResponse();
			case RUN_AS: return (DataObject)createRunAs();
			case SCA_BINDING: return (DataObject)createSCABinding();
			case SCA_IMPLEMENTATION: return (DataObject)createSCAImplementation();
			case SCA_PROPERTY_BASE: return (DataObject)createSCAPropertyBase();
			case SERVICE: return (DataObject)createService();
			case SPRING_IMPLEMENTATION: return (DataObject)createSpringImplementation();
			case WEB_SERVICE_BINDING: return (DataObject)createWebServiceBinding();
			case WIRE: return (DataObject)createWire();
			case WSDL_PORT_TYPE: return (DataObject)createWSDLPortType();
			default:
				return super.create(typeNumber);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(int typeNumber, String initialValue)
	{
		switch (typeNumber)
		{
			case CORRELATION_SCHEME:
				return createcorrelationSchemeFromString(initialValue);
			case CREATE_RESOURCE:
				return createCreateResourceFromString(initialValue);
			case LIST_OF_ANY_UR_IS:
				return createlistOfAnyURIsFromString(initialValue);
			case LIST_OF_QNAMES:
				return createlistOfQNamesFromString(initialValue);
			case MULTIPLICITY:
				return createMultiplicityFromString(initialValue);
			case OVERRIDE_OPTIONS:
				return createOverrideOptionsFromString(initialValue);
			case TYPE:
				return createtypeFromString(initialValue);
			default:
				throw new IllegalArgumentException("The type number '" + typeNumber + "' is not a valid datatype");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(int typeNumber, Object instanceValue)
	{
		switch (typeNumber)
		{
			case CORRELATION_SCHEME:
				return convertcorrelationSchemeToString(instanceValue);
			case CREATE_RESOURCE:
				return convertCreateResourceToString(instanceValue);
			case LIST_OF_ANY_UR_IS:
				return convertlistOfAnyURIsToString(instanceValue);
			case LIST_OF_QNAMES:
				return convertlistOfQNamesToString(instanceValue);
			case MULTIPLICITY:
				return convertMultiplicityToString(instanceValue);
			case OVERRIDE_OPTIONS:
				return convertOverrideOptionsToString(instanceValue);
			case TYPE:
				return converttypeToString(instanceValue);
			default:
				throw new IllegalArgumentException("The type number '" + typeNumber + "' is not a valid datatype");
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationSpec createActivationSpec()
	{
		ActivationSpecImpl activationSpec = new ActivationSpecImpl();
		return activationSpec;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allow createAllow()
	{
		AllowImpl allow = new AllowImpl();
		return allow;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingType createBindingType()
	{
		BindingTypeImpl bindingType = new BindingTypeImpl();
		return bindingType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpelImplementation createBpelImplementation()
	{
		BpelImplementationImpl bpelImplementation = new BpelImplementationImpl();
		return bpelImplementation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpelPartnerLinkType createBpelPartnerLinkType()
	{
		BpelPartnerLinkTypeImpl bpelPartnerLinkType = new BpelPartnerLinkTypeImpl();
		return bpelPartnerLinkType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback createCallback()
	{
		CallbackImpl callback = new CallbackImpl();
		return callback;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent()
	{
		ComponentImpl component = new ComponentImpl();
		return component;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentReference createComponentReference()
	{
		ComponentReferenceImpl componentReference = new ComponentReferenceImpl();
		return componentReference;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentService createComponentService()
	{
		ComponentServiceImpl componentService = new ComponentServiceImpl();
		return componentService;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType()
	{
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite()
	{
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionFactory createConnectionFactory()
	{
		ConnectionFactoryImpl connectionFactory = new ConnectionFactoryImpl();
		return connectionFactory;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainingType createConstrainingType()
	{
		ConstrainingTypeImpl constrainingType = new ConstrainingTypeImpl();
		return constrainingType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public definitions createdefinitions()
	{
		definitionsImpl definitions = new definitionsImpl();
		return definitions;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DenyAll createDenyAll()
	{
		DenyAllImpl denyAll = new DenyAllImpl();
		return denyAll;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destination createDestination()
	{
		DestinationImpl destination = new DestinationImpl();
		return destination;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Headers createHeaders()
	{
		HeadersImpl headers = new HeadersImpl();
		return headers;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType createImplementationType()
	{
		ImplementationTypeImpl implementationType = new ImplementationTypeImpl();
		return implementationType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude()
	{
		IncludeImpl include = new IncludeImpl();
		return include;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intent createIntent()
	{
		IntentImpl intent = new IntentImpl();
		return intent;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentMap createIntentMap()
	{
		IntentMapImpl intentMap = new IntentMapImpl();
		return intentMap;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaImplementation createJavaImplementation()
	{
		JavaImplementationImpl javaImplementation = new JavaImplementationImpl();
		return javaImplementation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaInterface createJavaInterface()
	{
		JavaInterfaceImpl javaInterface = new JavaInterfaceImpl();
		return javaInterface;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSBinding createJMSBinding()
	{
		JMSBindingImpl jmsBinding = new JMSBindingImpl();
		return jmsBinding;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation()
	{
		OperationImpl operation = new OperationImpl();
		return operation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProperties createOperationProperties()
	{
		OperationPropertiesImpl operationProperties = new OperationPropertiesImpl();
		return operationProperties;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermitAll createPermitAll()
	{
		PermitAllImpl permitAll = new PermitAllImpl();
		return permitAll;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySet createPolicySet()
	{
		PolicySetImpl policySet = new PolicySetImpl();
		return policySet;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySetReference createPolicySetReference()
	{
		PolicySetReferenceImpl policySetReference = new PolicySetReferenceImpl();
		return policySetReference;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty()
	{
		PropertyImpl property = new PropertyImpl();
		return property;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValue createPropertyValue()
	{
		PropertyValueImpl propertyValue = new PropertyValueImpl();
		return propertyValue;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualifier createQualifier()
	{
		QualifierImpl qualifier = new QualifierImpl();
		return qualifier;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference()
	{
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAdapter createResourceAdapter()
	{
		ResourceAdapterImpl resourceAdapter = new ResourceAdapterImpl();
		return resourceAdapter;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse()
	{
		ResponseImpl response = new ResponseImpl();
		return response;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunAs createRunAs()
	{
		RunAsImpl runAs = new RunAsImpl();
		return runAs;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCABinding createSCABinding()
	{
		SCABindingImpl scaBinding = new SCABindingImpl();
		return scaBinding;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCAImplementation createSCAImplementation()
	{
		SCAImplementationImpl scaImplementation = new SCAImplementationImpl();
		return scaImplementation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCAPropertyBase createSCAPropertyBase()
	{
		SCAPropertyBaseImpl scaPropertyBase = new SCAPropertyBaseImpl();
		return scaPropertyBase;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService()
	{
		ServiceImpl service = new ServiceImpl();
		return service;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringImplementation createSpringImplementation()
	{
		SpringImplementationImpl springImplementation = new SpringImplementationImpl();
		return springImplementation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebServiceBinding createWebServiceBinding()
	{
		WebServiceBindingImpl webServiceBinding = new WebServiceBindingImpl();
		return webServiceBinding;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire createWire()
	{
		WireImpl wire = new WireImpl();
		return wire;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLPortType createWSDLPortType()
	{
		WSDLPortTypeImpl wsdlPortType = new WSDLPortTypeImpl();
		return wsdlPortType;
	}
	
	// Following creates and initializes SDO metadata for the supported types.		
	protected Type activationSpecType = null;

	public Type getActivationSpec()
	{
		return activationSpecType;
	}
		
	protected Type allowType = null;

	public Type getAllow()
	{
		return allowType;
	}
		
	protected Type bindingType = null;

	public Type getBinding()
	{
		return bindingType;
	}
		
	protected Type bindingTypeType = null;

	public Type getBindingType()
	{
		return bindingTypeType;
	}
		
	protected Type implementationType = null;

	public Type getImplementation()
	{
		return implementationType;
	}
		
	protected Type bpelImplementationType = null;

	public Type getBpelImplementation()
	{
		return bpelImplementationType;
	}
		
	protected Type interface_Type = null;

	public Type getInterface()
	{
		return interface_Type;
	}
		
	protected Type bpelPartnerLinkTypeType = null;

	public Type getBpelPartnerLinkType()
	{
		return bpelPartnerLinkTypeType;
	}
		
	protected Type callbackType = null;

	public Type getCallback()
	{
		return callbackType;
	}
		
	protected Type componentType = null;

	public Type getComponent()
	{
		return componentType;
	}
		
	protected Type componentReferenceType = null;

	public Type getComponentReference()
	{
		return componentReferenceType;
	}
		
	protected Type componentServiceType = null;

	public Type getComponentService()
	{
		return componentServiceType;
	}
		
	protected Type componentTypeType = null;

	public Type getComponentType()
	{
		return componentTypeType;
	}
		
	protected Type compositeType = null;

	public Type getComposite()
	{
		return compositeType;
	}
		
	protected Type connectionFactoryType = null;

	public Type getConnectionFactory()
	{
		return connectionFactoryType;
	}
		
	protected Type constrainingTypeType = null;

	public Type getConstrainingType()
	{
		return constrainingTypeType;
	}
		
	protected Type definitionsType = null;

	public Type getdefinitions()
	{
		return definitionsType;
	}
		
	protected Type denyAllType = null;

	public Type getDenyAll()
	{
		return denyAllType;
	}
		
	protected Type destinationType = null;

	public Type getDestination()
	{
		return destinationType;
	}
			
	protected Type headersType = null;

	public Type getHeaders()
	{
		return headersType;
	}
		
	protected Type implementationTypeType = null;

	public Type getImplementationType()
	{
		return implementationTypeType;
	}
		
	protected Type includeType = null;

	public Type getInclude()
	{
		return includeType;
	}
		
	protected Type intentType = null;

	public Type getIntent()
	{
		return intentType;
	}
		
	protected Type intentMapType = null;

	public Type getIntentMap()
	{
		return intentMapType;
	}
		
	protected Type javaImplementationType = null;

	public Type getJavaImplementation()
	{
		return javaImplementationType;
	}
		
	protected Type javaInterfaceType = null;

	public Type getJavaInterface()
	{
		return javaInterfaceType;
	}
		
	protected Type jmsBindingType = null;

	public Type getJMSBinding()
	{
		return jmsBindingType;
	}
		
	protected Type operationType = null;

	public Type getOperation()
	{
		return operationType;
	}
		
	protected Type operationPropertiesType = null;

	public Type getOperationProperties()
	{
		return operationPropertiesType;
	}
		
	protected Type permitAllType = null;

	public Type getPermitAll()
	{
		return permitAllType;
	}
		
	protected Type policySetType = null;

	public Type getPolicySet()
	{
		return policySetType;
	}
		
	protected Type policySetReferenceType = null;

	public Type getPolicySetReference()
	{
		return policySetReferenceType;
	}
		
	protected Type scaPropertyBaseType = null;

	public Type getSCAPropertyBase()
	{
		return scaPropertyBaseType;
	}
		
	protected Type propertyType = null;

	public Type getProperty()
	{
		return propertyType;
	}
		
	protected Type propertyValueType = null;

	public Type getPropertyValue()
	{
		return propertyValueType;
	}
		
	protected Type qualifierType = null;

	public Type getQualifier()
	{
		return qualifierType;
	}
		
	protected Type referenceType = null;

	public Type getReference()
	{
		return referenceType;
	}
		
	protected Type resourceAdapterType = null;

	public Type getResourceAdapter()
	{
		return resourceAdapterType;
	}
		
	protected Type responseType = null;

	public Type getResponse()
	{
		return responseType;
	}
		
	protected Type runAsType = null;

	public Type getRunAs()
	{
		return runAsType;
	}
		
	protected Type scaBindingType = null;

	public Type getSCABinding()
	{
		return scaBindingType;
	}
		
	protected Type scaImplementationType = null;

	public Type getSCAImplementation()
	{
		return scaImplementationType;
	}
		
	protected Type serviceType = null;

	public Type getService()
	{
		return serviceType;
	}
		
	protected Type springImplementationType = null;

	public Type getSpringImplementation()
	{
		return springImplementationType;
	}
		
	protected Type webServiceBindingType = null;

	public Type getWebServiceBinding()
	{
		return webServiceBindingType;
	}
		
	protected Type wireType = null;

	public Type getWire()
	{
		return wireType;
	}
		
	protected Type wsdlPortTypeType = null;

	public Type getWSDLPortType()
	{
		return wsdlPortTypeType;
	}
		
	protected Type correlationSchemeType = null;

	public Type getcorrelationScheme()
	{
		return correlationSchemeType;
	}
		
	protected Type createResourceType = null;

	public Type getCreateResource()
	{
		return createResourceType;
	}
		
	protected Type listOfAnyURIsType = null;

	public Type getlistOfAnyURIs()
	{
		return listOfAnyURIsType;
	}
		
	protected Type listOfQNamesType = null;

	public Type getlistOfQNames()
	{
		return listOfQNamesType;
	}
		
	protected Type multiplicityType = null;

	public Type getMultiplicity()
	{
		return multiplicityType;
	}
		
	protected Type overrideOptionsType = null;

	public Type getOverrideOptions()
	{
		return overrideOptionsType;
	}
		
	protected Type typeType = null;

	public Type gettype()
	{
		return typeType;
	}
	

	private static _1FactoryImpl instance = null; 
	public static _1FactoryImpl init()
	{
		if (instance != null ) return instance;
		instance = new _1FactoryImpl();

		// Create package meta-data objects
		instance.createMetaData();

		// Initialize created meta-data
		instance.initializeMetaData();
		
		// Mark meta-data to indicate it can't be changed
		//the_1FactoryImpl.freeze(); //FB do we need to freeze / should we freeze ????

		return instance;
	}
  
	private boolean isCreated = false;

	public void createMetaData()
	{
		if (isCreated) return;
		isCreated = true;	

		// Create types and their properties
		activationSpecType = createType(false, ACTIVATION_SPEC);
		createProperty(true, activationSpecType,ActivationSpecImpl._INTERNAL_PROPERTY); 
		createProperty(true, activationSpecType,ActivationSpecImpl._INTERNAL_NAME); 
		createProperty(true, activationSpecType,ActivationSpecImpl._INTERNAL_CREATE); 
		allowType = createType(false, ALLOW);
		createProperty(true, allowType,AllowImpl._INTERNAL_ROLES); 
		bindingType = createType(false, BINDING);
		createProperty(false, bindingType,BindingImpl._INTERNAL_OPERATION); 
		createProperty(true, bindingType,BindingImpl._INTERNAL_URI); 
		createProperty(true, bindingType,BindingImpl._INTERNAL_NAME); 
		createProperty(true, bindingType,BindingImpl._INTERNAL_REQUIRES); 
		createProperty(true, bindingType,BindingImpl._INTERNAL_POLICY_SETS); 
		bindingTypeType = createType(false, BINDING_TYPE);
		createProperty(true, bindingTypeType,BindingTypeImpl._INTERNAL_GROUP); 
		createProperty(true, bindingTypeType,BindingTypeImpl._INTERNAL_ANY); 
		createProperty(true, bindingTypeType,BindingTypeImpl._INTERNAL_TYPE); 
		createProperty(true, bindingTypeType,BindingTypeImpl._INTERNAL_ALWAYS_PROVIDES); 
		createProperty(true, bindingTypeType,BindingTypeImpl._INTERNAL_MAY_PROVIDE); 
		createProperty(true, bindingTypeType,BindingTypeImpl._INTERNAL_ANY_ATTRIBUTE); 
		bpelImplementationType = createType(false, BPEL_IMPLEMENTATION);
		createProperty(true, bpelImplementationType,BpelImplementationImpl._INTERNAL_ANY); 
		createProperty(true, bpelImplementationType,BpelImplementationImpl._INTERNAL_PROCESS); 
		createProperty(true, bpelImplementationType,BpelImplementationImpl._INTERNAL_ANY_ATTRIBUTE); 
		bpelPartnerLinkTypeType = createType(false, BPEL_PARTNER_LINK_TYPE);
		createProperty(true, bpelPartnerLinkTypeType,BpelPartnerLinkTypeImpl._INTERNAL_ANY); 
		createProperty(true, bpelPartnerLinkTypeType,BpelPartnerLinkTypeImpl._INTERNAL_TYPE); 
		createProperty(true, bpelPartnerLinkTypeType,BpelPartnerLinkTypeImpl._INTERNAL_SERVICE_ROLE); 
		createProperty(true, bpelPartnerLinkTypeType,BpelPartnerLinkTypeImpl._INTERNAL_ANY_ATTRIBUTE); 
		callbackType = createType(false, CALLBACK);
		createProperty(true, callbackType,CallbackImpl._INTERNAL_GROUP); 
		createProperty(true, callbackType,CallbackImpl._INTERNAL_BINDING_GROUP); 
		createProperty(false, callbackType,CallbackImpl._INTERNAL_BINDING); 
		createProperty(true, callbackType,CallbackImpl._INTERNAL_ANY); 
		createProperty(true, callbackType,CallbackImpl._INTERNAL_REQUIRES); 
		createProperty(true, callbackType,CallbackImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, callbackType,CallbackImpl._INTERNAL_ANY_ATTRIBUTE); 
		componentType = createType(false, COMPONENT);
		createProperty(true, componentType,ComponentImpl._INTERNAL_IMPLEMENTATION_GROUP); 
		createProperty(false, componentType,ComponentImpl._INTERNAL_IMPLEMENTATION); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_ANY); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_GROUP); 
		createProperty(false, componentType,ComponentImpl._INTERNAL_SERVICE); 
		createProperty(false, componentType,ComponentImpl._INTERNAL_REFERENCE); 
		createProperty(false, componentType,ComponentImpl._INTERNAL_PROPERTY); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_NAME); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_AUTOWIRE); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_CONSTRAINING_TYPE); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_REQUIRES); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, componentType,ComponentImpl._INTERNAL_ANY_ATTRIBUTE); 
		componentReferenceType = createType(false, COMPONENT_REFERENCE);
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_INTERFACE_GROUP); 
		createProperty(false, componentReferenceType,ComponentReferenceImpl._INTERNAL_INTERFACE); 
		createProperty(false, componentReferenceType,ComponentReferenceImpl._INTERNAL_OPERATION); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_GROUP); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_BINDING_GROUP); 
		createProperty(false, componentReferenceType,ComponentReferenceImpl._INTERNAL_BINDING); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_ANY); 
		createProperty(false, componentReferenceType,ComponentReferenceImpl._INTERNAL_CALLBACK); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_NAME); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_TARGET); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_MULTIPLICITY); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_REQUIRES); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, componentReferenceType,ComponentReferenceImpl._INTERNAL_ANY_ATTRIBUTE); 
		componentServiceType = createType(false, COMPONENT_SERVICE);
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_INTERFACE_GROUP); 
		createProperty(false, componentServiceType,ComponentServiceImpl._INTERNAL_INTERFACE); 
		createProperty(false, componentServiceType,ComponentServiceImpl._INTERNAL_OPERATION); 
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_GROUP); 
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_BINDING_GROUP); 
		createProperty(false, componentServiceType,ComponentServiceImpl._INTERNAL_BINDING); 
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_ANY); 
		createProperty(false, componentServiceType,ComponentServiceImpl._INTERNAL_CALLBACK); 
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_NAME); 
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_REQUIRES); 
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, componentServiceType,ComponentServiceImpl._INTERNAL_ANY_ATTRIBUTE); 
		componentTypeType = createType(false, COMPONENT_TYPE);
		createProperty(true, componentTypeType,ComponentTypeImpl._INTERNAL_IMPLEMENTATION_GROUP); 
		createProperty(false, componentTypeType,ComponentTypeImpl._INTERNAL_IMPLEMENTATION); 
		createProperty(true, componentTypeType,ComponentTypeImpl._INTERNAL_ANY); 
		createProperty(true, componentTypeType,ComponentTypeImpl._INTERNAL_GROUP); 
		createProperty(false, componentTypeType,ComponentTypeImpl._INTERNAL_SERVICE); 
		createProperty(false, componentTypeType,ComponentTypeImpl._INTERNAL_REFERENCE); 
		createProperty(false, componentTypeType,ComponentTypeImpl._INTERNAL_PROPERTY); 
		createProperty(true, componentTypeType,ComponentTypeImpl._INTERNAL_CONSTRAINING_TYPE); 
		createProperty(true, componentTypeType,ComponentTypeImpl._INTERNAL_ANY_ATTRIBUTE); 
		compositeType = createType(false, COMPOSITE);
		createProperty(true, compositeType,CompositeImpl._INTERNAL_GROUP); 
		createProperty(false, compositeType,CompositeImpl._INTERNAL_INCLUDE); 
		createProperty(false, compositeType,CompositeImpl._INTERNAL_SERVICE); 
		createProperty(false, compositeType,CompositeImpl._INTERNAL_PROPERTY); 
		createProperty(false, compositeType,CompositeImpl._INTERNAL_COMPONENT); 
		createProperty(false, compositeType,CompositeImpl._INTERNAL_REFERENCE); 
		createProperty(false, compositeType,CompositeImpl._INTERNAL_WIRE); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_ANY); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_NAME); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_TARGET_NAMESPACE); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_LOCAL); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_AUTOWIRE); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_CONSTRAINING_TYPE); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_REQUIRES); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, compositeType,CompositeImpl._INTERNAL_ANY_ATTRIBUTE); 
		connectionFactoryType = createType(false, CONNECTION_FACTORY);
		createProperty(true, connectionFactoryType,ConnectionFactoryImpl._INTERNAL_PROPERTY); 
		createProperty(true, connectionFactoryType,ConnectionFactoryImpl._INTERNAL_NAME); 
		createProperty(true, connectionFactoryType,ConnectionFactoryImpl._INTERNAL_CREATE); 
		constrainingTypeType = createType(false, CONSTRAINING_TYPE);
		createProperty(true, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_GROUP); 
		createProperty(false, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_SERVICE); 
		createProperty(false, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_REFERENCE); 
		createProperty(false, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_PROPERTY); 
		createProperty(true, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_ANY); 
		createProperty(true, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_NAME); 
		createProperty(true, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_TARGET_NAMESPACE); 
		createProperty(true, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_REQUIRES); 
		createProperty(true, constrainingTypeType,ConstrainingTypeImpl._INTERNAL_ANY_ATTRIBUTE); 
		definitionsType = createType(false, DEFINITIONS);
		createProperty(true, definitionsType,definitionsImpl._INTERNAL_GROUP); 
		createProperty(false, definitionsType,definitionsImpl._INTERNAL_INTENT); 
		createProperty(false, definitionsType,definitionsImpl._INTERNAL_POLICY_SET); 
		createProperty(true, definitionsType,definitionsImpl._INTERNAL_BINDING_GROUP); 
		createProperty(false, definitionsType,definitionsImpl._INTERNAL_BINDING); 
		createProperty(false, definitionsType,definitionsImpl._INTERNAL_BINDING_TYPE); 
		createProperty(false, definitionsType,definitionsImpl._INTERNAL_IMPLEMENTATION_TYPE); 
		createProperty(true, definitionsType,definitionsImpl._INTERNAL_ANY); 
		createProperty(true, definitionsType,definitionsImpl._INTERNAL_TARGET_NAMESPACE); 
		denyAllType = createType(false, DENY_ALL);
		destinationType = createType(false, DESTINATION);
		createProperty(true, destinationType,DestinationImpl._INTERNAL_PROPERTY); 
		createProperty(true, destinationType,DestinationImpl._INTERNAL_NAME); 
		createProperty(true, destinationType,DestinationImpl._INTERNAL_TYPE); 
		createProperty(true, destinationType,DestinationImpl._INTERNAL_CREATE); 
		headersType = createType(false, HEADERS);
		createProperty(true, headersType,HeadersImpl._INTERNAL_PROPERTY); 
		createProperty(true, headersType,HeadersImpl._INTERNAL_JMS_TYPE); 
		createProperty(true, headersType,HeadersImpl._INTERNAL_JMS_CORRELATION_ID); 
		createProperty(true, headersType,HeadersImpl._INTERNAL_JMS_DELIVERY_MODE); 
		createProperty(true, headersType,HeadersImpl._INTERNAL_JMS_TIME_TO_LIVE); 
		createProperty(true, headersType,HeadersImpl._INTERNAL_JMS_PRIORITY); 
		implementationType = createType(false, IMPLEMENTATION);
		createProperty(true, implementationType,ImplementationImpl._INTERNAL_REQUIRES); 
		createProperty(true, implementationType,ImplementationImpl._INTERNAL_POLICY_SETS); 
		implementationTypeType = createType(false, IMPLEMENTATION_TYPE);
		createProperty(true, implementationTypeType,ImplementationTypeImpl._INTERNAL_GROUP); 
		createProperty(true, implementationTypeType,ImplementationTypeImpl._INTERNAL_ANY); 
		createProperty(true, implementationTypeType,ImplementationTypeImpl._INTERNAL_TYPE); 
		createProperty(true, implementationTypeType,ImplementationTypeImpl._INTERNAL_ALWAYS_PROVIDES); 
		createProperty(true, implementationTypeType,ImplementationTypeImpl._INTERNAL_MAY_PROVIDE); 
		createProperty(true, implementationTypeType,ImplementationTypeImpl._INTERNAL_ANY_ATTRIBUTE); 
		includeType = createType(false, INCLUDE);
		createProperty(true, includeType,IncludeImpl._INTERNAL_NAME); 
		createProperty(true, includeType,IncludeImpl._INTERNAL_ANY_ATTRIBUTE); 
		intentType = createType(false, INTENT);
		createProperty(true, intentType,IntentImpl._INTERNAL_DESCRIPTION); 
		createProperty(true, intentType,IntentImpl._INTERNAL_ANY); 
		createProperty(true, intentType,IntentImpl._INTERNAL_NAME); 
		createProperty(true, intentType,IntentImpl._INTERNAL_CONSTRAINS); 
		createProperty(true, intentType,IntentImpl._INTERNAL_REQUIRES); 
		createProperty(true, intentType,IntentImpl._INTERNAL_EXCLUDES); 
		createProperty(true, intentType,IntentImpl._INTERNAL_ANY_ATTRIBUTE); 
		intentMapType = createType(false, INTENT_MAP);
		createProperty(true, intentMapType,IntentMapImpl._INTERNAL_GROUP); 
		createProperty(false, intentMapType,IntentMapImpl._INTERNAL_QUALIFIER); 
		createProperty(true, intentMapType,IntentMapImpl._INTERNAL_ANY); 
		createProperty(true, intentMapType,IntentMapImpl._INTERNAL_PROVIDES); 
		createProperty(true, intentMapType,IntentMapImpl._INTERNAL_DEFAULT); 
		createProperty(true, intentMapType,IntentMapImpl._INTERNAL_ANY_ATTRIBUTE); 
		interface_Type = createType(false, INTERFACE);
		javaImplementationType = createType(false, JAVA_IMPLEMENTATION);
		createProperty(true, javaImplementationType,JavaImplementationImpl._INTERNAL_ANY); 
		createProperty(true, javaImplementationType,JavaImplementationImpl._INTERNAL_CLASS); 
		createProperty(true, javaImplementationType,JavaImplementationImpl._INTERNAL_ANY_ATTRIBUTE); 
		javaInterfaceType = createType(false, JAVA_INTERFACE);
		createProperty(true, javaInterfaceType,JavaInterfaceImpl._INTERNAL_ANY); 
		createProperty(true, javaInterfaceType,JavaInterfaceImpl._INTERNAL_INTERFACE); 
		createProperty(true, javaInterfaceType,JavaInterfaceImpl._INTERNAL_CALLBACK_INTERFACE); 
		createProperty(true, javaInterfaceType,JavaInterfaceImpl._INTERNAL_ANY_ATTRIBUTE); 
		jmsBindingType = createType(false, JMS_BINDING);
		createProperty(false, jmsBindingType,JMSBindingImpl._INTERNAL_DESTINATION); 
		createProperty(false, jmsBindingType,JMSBindingImpl._INTERNAL_CONNECTION_FACTORY); 
		createProperty(false, jmsBindingType,JMSBindingImpl._INTERNAL_ACTIVATION_SPEC); 
		createProperty(false, jmsBindingType,JMSBindingImpl._INTERNAL_RESPONSE); 
		createProperty(false, jmsBindingType,JMSBindingImpl._INTERNAL_HEADERS); 
		createProperty(false, jmsBindingType,JMSBindingImpl._INTERNAL_RESOURCE_ADAPTER); 
		createProperty(false, jmsBindingType,JMSBindingImpl._INTERNAL_OPERATION_PROPERTIES); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_ANY); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_CORRELATION_SCHEME); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_INITIAL_CONTEXT_FACTORY); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_JNDI_URL); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_REQUEST_CONNECTION); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_RESPONSE_CONNECTION); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_OPERATION_PROPERTIES1); 
		createProperty(true, jmsBindingType,JMSBindingImpl._INTERNAL_ANY_ATTRIBUTE); 
		operationType = createType(false, OPERATION);
		createProperty(true, operationType,OperationImpl._INTERNAL_NAME); 
		createProperty(true, operationType,OperationImpl._INTERNAL_REQUIRES); 
		createProperty(true, operationType,OperationImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, operationType,OperationImpl._INTERNAL_ANY_ATTRIBUTE); 
		operationPropertiesType = createType(false, OPERATION_PROPERTIES);
		createProperty(true, operationPropertiesType,OperationPropertiesImpl._INTERNAL_PROPERTY); 
		createProperty(false, operationPropertiesType,OperationPropertiesImpl._INTERNAL_HEADERS); 
		createProperty(true, operationPropertiesType,OperationPropertiesImpl._INTERNAL_NAME); 
		createProperty(true, operationPropertiesType,OperationPropertiesImpl._INTERNAL_NATIVE_OPERATION); 
		permitAllType = createType(false, PERMIT_ALL);
		policySetType = createType(false, POLICY_SET);
		createProperty(true, policySetType,PolicySetImpl._INTERNAL_GROUP); 
		createProperty(false, policySetType,PolicySetImpl._INTERNAL_POLICY_SET_REFERENCE); 
		createProperty(false, policySetType,PolicySetImpl._INTERNAL_INTENT_MAP); 
		createProperty(true, policySetType,PolicySetImpl._INTERNAL_ANY); 
		createProperty(true, policySetType,PolicySetImpl._INTERNAL_NAME); 
		createProperty(true, policySetType,PolicySetImpl._INTERNAL_PROVIDES); 
		createProperty(true, policySetType,PolicySetImpl._INTERNAL_APPLIES_TO); 
		createProperty(true, policySetType,PolicySetImpl._INTERNAL_ANY_ATTRIBUTE); 
		policySetReferenceType = createType(false, POLICY_SET_REFERENCE);
		createProperty(true, policySetReferenceType,PolicySetReferenceImpl._INTERNAL_NAME); 
		createProperty(true, policySetReferenceType,PolicySetReferenceImpl._INTERNAL_ANY_ATTRIBUTE); 
		propertyType = createType(false, PROPERTY);
		createProperty(true, propertyType,PropertyImpl._INTERNAL_NAME); 
		createProperty(true, propertyType,PropertyImpl._INTERNAL_TYPE); 
		createProperty(true, propertyType,PropertyImpl._INTERNAL_ELEMENT); 
		createProperty(true, propertyType,PropertyImpl._INTERNAL_MANY); 
		createProperty(true, propertyType,PropertyImpl._INTERNAL_NO_DEFAULT); 
		createProperty(true, propertyType,PropertyImpl._INTERNAL_ANY_ATTRIBUTE); 
		propertyValueType = createType(false, PROPERTY_VALUE);
		createProperty(true, propertyValueType,PropertyValueImpl._INTERNAL_NAME); 
		createProperty(true, propertyValueType,PropertyValueImpl._INTERNAL_TYPE); 
		createProperty(true, propertyValueType,PropertyValueImpl._INTERNAL_ELEMENT); 
		createProperty(true, propertyValueType,PropertyValueImpl._INTERNAL_MANY); 
		createProperty(true, propertyValueType,PropertyValueImpl._INTERNAL_SOURCE); 
		createProperty(true, propertyValueType,PropertyValueImpl._INTERNAL_FILE); 
		createProperty(true, propertyValueType,PropertyValueImpl._INTERNAL_ANY_ATTRIBUTE); 
		qualifierType = createType(false, QUALIFIER);
		createProperty(true, qualifierType,QualifierImpl._INTERNAL_GROUP); 
		createProperty(false, qualifierType,QualifierImpl._INTERNAL_INTENT_MAP); 
		createProperty(true, qualifierType,QualifierImpl._INTERNAL_ANY); 
		createProperty(true, qualifierType,QualifierImpl._INTERNAL_NAME); 
		createProperty(true, qualifierType,QualifierImpl._INTERNAL_ANY_ATTRIBUTE); 
		referenceType = createType(false, REFERENCE);
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_INTERFACE_GROUP); 
		createProperty(false, referenceType,ReferenceImpl._INTERNAL_INTERFACE); 
		createProperty(false, referenceType,ReferenceImpl._INTERNAL_OPERATION); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_GROUP); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_BINDING_GROUP); 
		createProperty(false, referenceType,ReferenceImpl._INTERNAL_BINDING); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_ANY); 
		createProperty(false, referenceType,ReferenceImpl._INTERNAL_CALLBACK); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_NAME); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_TARGET); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_WIRED_BY_IMPL); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_MULTIPLICITY); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_PROMOTE); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_REQUIRES); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, referenceType,ReferenceImpl._INTERNAL_ANY_ATTRIBUTE); 
		resourceAdapterType = createType(false, RESOURCE_ADAPTER);
		createProperty(true, resourceAdapterType,ResourceAdapterImpl._INTERNAL_PROPERTY); 
		createProperty(true, resourceAdapterType,ResourceAdapterImpl._INTERNAL_NAME); 
		responseType = createType(false, RESPONSE);
		createProperty(false, responseType,ResponseImpl._INTERNAL_DESTINATION); 
		createProperty(false, responseType,ResponseImpl._INTERNAL_CONNECTION_FACTORY); 
		createProperty(false, responseType,ResponseImpl._INTERNAL_ACTIVATION_SPEC); 
		runAsType = createType(false, RUN_AS);
		createProperty(true, runAsType,RunAsImpl._INTERNAL_ROLE); 
		scaBindingType = createType(false, SCA_BINDING);
		createProperty(true, scaBindingType,SCABindingImpl._INTERNAL_ANY); 
		createProperty(true, scaBindingType,SCABindingImpl._INTERNAL_ANY_ATTRIBUTE); 
		scaImplementationType = createType(false, SCA_IMPLEMENTATION);
		createProperty(true, scaImplementationType,SCAImplementationImpl._INTERNAL_ANY); 
		createProperty(true, scaImplementationType,SCAImplementationImpl._INTERNAL_NAME); 
		createProperty(true, scaImplementationType,SCAImplementationImpl._INTERNAL_ANY_ATTRIBUTE); 
		scaPropertyBaseType = createType(false, SCA_PROPERTY_BASE);
		createProperty(true, scaPropertyBaseType,SCAPropertyBaseImpl._INTERNAL_MIXED); 
		createProperty(true, scaPropertyBaseType,SCAPropertyBaseImpl._INTERNAL_ANY); 
		serviceType = createType(false, SERVICE);
		createProperty(true, serviceType,ServiceImpl._INTERNAL_INTERFACE_GROUP); 
		createProperty(false, serviceType,ServiceImpl._INTERNAL_INTERFACE); 
		createProperty(false, serviceType,ServiceImpl._INTERNAL_OPERATION); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_GROUP); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_BINDING_GROUP); 
		createProperty(false, serviceType,ServiceImpl._INTERNAL_BINDING); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_ANY); 
		createProperty(false, serviceType,ServiceImpl._INTERNAL_CALLBACK); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_NAME); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_PROMOTE); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_REQUIRES); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_POLICY_SETS); 
		createProperty(true, serviceType,ServiceImpl._INTERNAL_ANY_ATTRIBUTE); 
		springImplementationType = createType(false, SPRING_IMPLEMENTATION);
		createProperty(true, springImplementationType,SpringImplementationImpl._INTERNAL_ANY); 
		createProperty(true, springImplementationType,SpringImplementationImpl._INTERNAL_LOCATION); 
		createProperty(true, springImplementationType,SpringImplementationImpl._INTERNAL_ANY_ATTRIBUTE); 
		webServiceBindingType = createType(false, WEB_SERVICE_BINDING);
		createProperty(true, webServiceBindingType,WebServiceBindingImpl._INTERNAL_ANY); 
		createProperty(true, webServiceBindingType,WebServiceBindingImpl._INTERNAL_WSDL_ELEMENT); 
		createProperty(true, webServiceBindingType,WebServiceBindingImpl._INTERNAL_ANY_ATTRIBUTE); 
		wireType = createType(false, WIRE);
		createProperty(true, wireType,WireImpl._INTERNAL_ANY); 
		createProperty(true, wireType,WireImpl._INTERNAL_SOURCE); 
		createProperty(true, wireType,WireImpl._INTERNAL_TARGET); 
		createProperty(true, wireType,WireImpl._INTERNAL_ANY_ATTRIBUTE); 
		wsdlPortTypeType = createType(false, WSDL_PORT_TYPE);
		createProperty(true, wsdlPortTypeType,WSDLPortTypeImpl._INTERNAL_ANY); 
		createProperty(true, wsdlPortTypeType,WSDLPortTypeImpl._INTERNAL_INTERFACE); 
		createProperty(true, wsdlPortTypeType,WSDLPortTypeImpl._INTERNAL_CALLBACK_INTERFACE); 
		createProperty(true, wsdlPortTypeType,WSDLPortTypeImpl._INTERNAL_ANY_ATTRIBUTE); 

		// Create data types
		correlationSchemeType = createType(true, CORRELATION_SCHEME );
		createResourceType = createType(true, CREATE_RESOURCE );
		listOfAnyURIsType = createType(true, LIST_OF_ANY_UR_IS );
		listOfQNamesType = createType(true, LIST_OF_QNAMES );
		multiplicityType = createType(true, MULTIPLICITY );
		overrideOptionsType = createType(true, OVERRIDE_OPTIONS );
		typeType = createType(true, TYPE );
	}
	
	private boolean isInitialized = false;

	public void initializeMetaData()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Obtain other dependent packages
		ModelFactoryImpl theModelPackageImpl = (ModelFactoryImpl)ModelFactoryImpl.init();
		InternalFactoryImpl theInternalPackageImpl = (InternalFactoryImpl)InternalFactoryImpl.init();
		commonj.sdo.Property property = null;

		// Add supertypes to types
		addSuperType(bpelImplementationType, this.getImplementation());
		addSuperType(bpelPartnerLinkTypeType, this.getInterface());
		addSuperType(javaImplementationType, this.getImplementation());
		addSuperType(javaInterfaceType, this.getInterface());
		addSuperType(jmsBindingType, this.getBinding());
		addSuperType(propertyType, this.getSCAPropertyBase());
		addSuperType(propertyValueType, this.getSCAPropertyBase());
		addSuperType(scaBindingType, this.getBinding());
		addSuperType(scaImplementationType, this.getImplementation());
		addSuperType(springImplementationType, this.getImplementation());
		addSuperType(webServiceBindingType, this.getBinding());
		addSuperType(wsdlPortTypeType, this.getInterface());

		// Initialize types and properties
		initializeType(activationSpecType, ActivationSpec.class, "ActivationSpec", false);
		property = getLocalProperty(activationSpecType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "property", null, 0, -1, ActivationSpec.class, false, false, false);

		property = getLocalProperty(activationSpecType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "name", null, 1, 1, ActivationSpec.class, false, false, false);

		property = getLocalProperty(activationSpecType, 2);
		initializeProperty(property, this.getCreateResource(), "create", "ifnotexist", 0, 1, ActivationSpec.class, false, false, false);

		initializeType(allowType, Allow.class, "Allow", false);
		property = getLocalProperty(allowType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "roles", null, 1, 1, Allow.class, false, false, false);

		initializeType(bindingType, Binding.class, "Binding", true);
		property = getLocalProperty(bindingType, 0);
		initializeProperty(property, this.getOperation(), "operation", null, 0, -1, Binding.class, false, false, false, true , null);

		property = getLocalProperty(bindingType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "uri", null, 0, 1, Binding.class, false, false, false);

		property = getLocalProperty(bindingType, 2);
		initializeProperty(property, theInternalPackageImpl.getQName(), "name", null, 0, 1, Binding.class, false, false, false);

		property = getLocalProperty(bindingType, 3);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Binding.class, false, false, false);

		property = getLocalProperty(bindingType, 4);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Binding.class, false, false, false);

		initializeType(bindingTypeType, BindingType.class, "BindingType", false);
		property = getLocalProperty(bindingTypeType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, BindingType.class, false, false, false);

		property = getLocalProperty(bindingTypeType, 1);
		initializeProperty(property, getSequence(), "any", null, 0, -1, BindingType.class, false, false, true);

		property = getLocalProperty(bindingTypeType, 2);
		initializeProperty(property, theInternalPackageImpl.getQName(), "type", null, 1, 1, BindingType.class, false, false, false);

		property = getLocalProperty(bindingTypeType, 3);
		initializeProperty(property, this.getlistOfQNames(), "alwaysProvides", null, 0, 1, BindingType.class, false, false, false);

		property = getLocalProperty(bindingTypeType, 4);
		initializeProperty(property, this.getlistOfQNames(), "mayProvide", null, 0, 1, BindingType.class, false, false, false);

		property = getLocalProperty(bindingTypeType, 5);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, BindingType.class, false, false, false);

		initializeType(bpelImplementationType, BpelImplementation.class, "BpelImplementation", false);
		property = getLocalProperty(bpelImplementationType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, BpelImplementation.class, false, false, false);

		property = getLocalProperty(bpelImplementationType, 1);
		initializeProperty(property, theInternalPackageImpl.getQName(), "process", null, 1, 1, BpelImplementation.class, false, false, false);

		property = getLocalProperty(bpelImplementationType, 2);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, BpelImplementation.class, false, false, false);

		initializeType(bpelPartnerLinkTypeType, BpelPartnerLinkType.class, "BpelPartnerLinkType", false);
		property = getLocalProperty(bpelPartnerLinkTypeType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, BpelPartnerLinkType.class, false, false, false);

		property = getLocalProperty(bpelPartnerLinkTypeType, 1);
		initializeProperty(property, theInternalPackageImpl.getQName(), "type", null, 1, 1, BpelPartnerLinkType.class, false, false, false);

		property = getLocalProperty(bpelPartnerLinkTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "serviceRole", null, 0, 1, BpelPartnerLinkType.class, false, false, false);

		property = getLocalProperty(bpelPartnerLinkTypeType, 3);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, BpelPartnerLinkType.class, false, false, false);

		initializeType(callbackType, Callback.class, "Callback", false);
		property = getLocalProperty(callbackType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, Callback.class, false, false, false);

		property = getLocalProperty(callbackType, 1);
		initializeProperty(property, getSequence(), "bindingGroup", null, 0, -1, Callback.class, false, false, true);

		property = getLocalProperty(callbackType, 2);
		initializeProperty(property, this.getBinding(), "binding", null, 0, -1, Callback.class, true, false, true, true , null);

		property = getLocalProperty(callbackType, 3);
		initializeProperty(property, getSequence(), "any", null, 0, -1, Callback.class, false, false, true);

		property = getLocalProperty(callbackType, 4);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Callback.class, false, false, false);

		property = getLocalProperty(callbackType, 5);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Callback.class, false, false, false);

		property = getLocalProperty(callbackType, 6);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Callback.class, false, false, false);

		initializeType(componentType, Component.class, "Component", false);
		property = getLocalProperty(componentType, 0);
		initializeProperty(property, getSequence(), "implementationGroup", null, 0, 1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 1);
		initializeProperty(property, this.getImplementation(), "implementation", null, 0, 1, Component.class, true, false, true, true , null);

		property = getLocalProperty(componentType, 2);
		initializeProperty(property, getSequence(), "any", null, 0, 1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 3);
		initializeProperty(property, getSequence(), "group", null, 0, -1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 4);
		initializeProperty(property, this.getComponentService(), "service", null, 0, -1, Component.class, false, false, true, true , null);

		property = getLocalProperty(componentType, 5);
		initializeProperty(property, this.getComponentReference(), "reference", null, 0, -1, Component.class, false, false, true, true , null);

		property = getLocalProperty(componentType, 6);
		initializeProperty(property, this.getPropertyValue(), "property", null, 0, -1, Component.class, false, false, true, true , null);

		property = getLocalProperty(componentType, 7);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 8);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "autowire", "false", 0, 1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 9);
		initializeProperty(property, theInternalPackageImpl.getQName(), "constrainingType", null, 0, 1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 10);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 11);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Component.class, false, false, false);

		property = getLocalProperty(componentType, 12);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Component.class, false, false, false);

		initializeType(componentReferenceType, ComponentReference.class, "ComponentReference", false);
		property = getLocalProperty(componentReferenceType, 0);
		initializeProperty(property, getSequence(), "interfaceGroup", null, 0, 1, ComponentReference.class, false, false, false);

		property = getLocalProperty(componentReferenceType, 1);
		initializeProperty(property, this.getInterface(), "interface", null, 0, 1, ComponentReference.class, true, false, true, true , null);

		property = getLocalProperty(componentReferenceType, 2);
		initializeProperty(property, this.getOperation(), "operation", null, 0, -1, ComponentReference.class, false, false, false, true , null);

		property = getLocalProperty(componentReferenceType, 3);
		initializeProperty(property, getSequence(), "group", null, 0, -1, ComponentReference.class, false, false, false);

		property = getLocalProperty(componentReferenceType, 4);
		initializeProperty(property, getSequence(), "bindingGroup", null, 0, -1, ComponentReference.class, false, false, true);

		property = getLocalProperty(componentReferenceType, 5);
		initializeProperty(property, this.getBinding(), "binding", null, 0, -1, ComponentReference.class, true, false, true, true , null);

		property = getLocalProperty(componentReferenceType, 6);
		initializeProperty(property, getSequence(), "any", null, 0, -1, ComponentReference.class, false, false, true);

		property = getLocalProperty(componentReferenceType, 7);
		initializeProperty(property, this.getCallback(), "callback", null, 0, 1, ComponentReference.class, false, false, false, true , null);

		property = getLocalProperty(componentReferenceType, 8);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, ComponentReference.class, false, false, false);

		property = getLocalProperty(componentReferenceType, 9);
		initializeProperty(property, this.getlistOfAnyURIs(), "target", null, 0, 1, ComponentReference.class, false, false, false);

		property = getLocalProperty(componentReferenceType, 10);
		initializeProperty(property, this.getMultiplicity(), "multiplicity", "1..1", 0, 1, ComponentReference.class, false, false, false);

		property = getLocalProperty(componentReferenceType, 11);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, ComponentReference.class, false, false, false);

		property = getLocalProperty(componentReferenceType, 12);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, ComponentReference.class, false, false, false);

		property = getLocalProperty(componentReferenceType, 13);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, ComponentReference.class, false, false, false);

		initializeType(componentServiceType, ComponentService.class, "ComponentService", false);
		property = getLocalProperty(componentServiceType, 0);
		initializeProperty(property, getSequence(), "interfaceGroup", null, 0, 1, ComponentService.class, false, false, false);

		property = getLocalProperty(componentServiceType, 1);
		initializeProperty(property, this.getInterface(), "interface", null, 0, 1, ComponentService.class, true, false, true, true , null);

		property = getLocalProperty(componentServiceType, 2);
		initializeProperty(property, this.getOperation(), "operation", null, 0, -1, ComponentService.class, false, false, false, true , null);

		property = getLocalProperty(componentServiceType, 3);
		initializeProperty(property, getSequence(), "group", null, 0, -1, ComponentService.class, false, false, false);

		property = getLocalProperty(componentServiceType, 4);
		initializeProperty(property, getSequence(), "bindingGroup", null, 0, -1, ComponentService.class, false, false, true);

		property = getLocalProperty(componentServiceType, 5);
		initializeProperty(property, this.getBinding(), "binding", null, 0, -1, ComponentService.class, true, false, true, true , null);

		property = getLocalProperty(componentServiceType, 6);
		initializeProperty(property, getSequence(), "any", null, 0, -1, ComponentService.class, false, false, true);

		property = getLocalProperty(componentServiceType, 7);
		initializeProperty(property, this.getCallback(), "callback", null, 0, 1, ComponentService.class, false, false, false, true , null);

		property = getLocalProperty(componentServiceType, 8);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, ComponentService.class, false, false, false);

		property = getLocalProperty(componentServiceType, 9);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, ComponentService.class, false, false, false);

		property = getLocalProperty(componentServiceType, 10);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, ComponentService.class, false, false, false);

		property = getLocalProperty(componentServiceType, 11);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, ComponentService.class, false, false, false);

		initializeType(componentTypeType, ComponentType.class, "ComponentType", false);
		property = getLocalProperty(componentTypeType, 0);
		initializeProperty(property, getSequence(), "implementationGroup", null, 0, 1, ComponentType.class, false, false, false);

		property = getLocalProperty(componentTypeType, 1);
		initializeProperty(property, this.getImplementation(), "implementation", null, 0, 1, ComponentType.class, true, false, true, true , null);

		property = getLocalProperty(componentTypeType, 2);
		initializeProperty(property, getSequence(), "any", null, 0, 1, ComponentType.class, false, false, false);

		property = getLocalProperty(componentTypeType, 3);
		initializeProperty(property, getSequence(), "group", null, 0, -1, ComponentType.class, false, false, false);

		property = getLocalProperty(componentTypeType, 4);
		initializeProperty(property, this.getComponentService(), "service", null, 0, -1, ComponentType.class, false, false, true, true , null);

		property = getLocalProperty(componentTypeType, 5);
		initializeProperty(property, this.getComponentReference(), "reference", null, 0, -1, ComponentType.class, false, false, true, true , null);

		property = getLocalProperty(componentTypeType, 6);
		initializeProperty(property, this.getProperty(), "property", null, 0, -1, ComponentType.class, false, false, true, true , null);

		property = getLocalProperty(componentTypeType, 7);
		initializeProperty(property, theInternalPackageImpl.getQName(), "constrainingType", null, 0, 1, ComponentType.class, false, false, false);

		property = getLocalProperty(componentTypeType, 8);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, ComponentType.class, false, false, false);

		initializeType(compositeType, Composite.class, "Composite", false);
		property = getLocalProperty(compositeType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 1);
		initializeProperty(property, this.getInclude(), "include", null, 0, -1, Composite.class, false, false, true, true , null);

		property = getLocalProperty(compositeType, 2);
		initializeProperty(property, this.getService(), "service", null, 0, -1, Composite.class, false, false, true, true , null);

		property = getLocalProperty(compositeType, 3);
		initializeProperty(property, this.getProperty(), "property", null, 0, -1, Composite.class, false, false, true, true , null);

		property = getLocalProperty(compositeType, 4);
		initializeProperty(property, this.getComponent(), "component", null, 0, -1, Composite.class, false, false, true, true , null);

		property = getLocalProperty(compositeType, 5);
		initializeProperty(property, this.getReference(), "reference", null, 0, -1, Composite.class, false, false, true, true , null);

		property = getLocalProperty(compositeType, 6);
		initializeProperty(property, this.getWire(), "wire", null, 0, -1, Composite.class, false, false, true, true , null);

		property = getLocalProperty(compositeType, 7);
		initializeProperty(property, getSequence(), "any", null, 0, -1, Composite.class, false, false, true);

		property = getLocalProperty(compositeType, 8);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 9);
		initializeProperty(property, theModelPackageImpl.getURI(), "targetNamespace", null, 0, 1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 10);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "local", "false", 0, 1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 11);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "autowire", "false", 0, 1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 12);
		initializeProperty(property, theInternalPackageImpl.getQName(), "constrainingType", null, 0, 1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 13);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 14);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Composite.class, false, false, false);

		property = getLocalProperty(compositeType, 15);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Composite.class, false, false, false);

		initializeType(connectionFactoryType, ConnectionFactory.class, "ConnectionFactory", false);
		property = getLocalProperty(connectionFactoryType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "property", null, 0, -1, ConnectionFactory.class, false, false, false);

		property = getLocalProperty(connectionFactoryType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "name", null, 1, 1, ConnectionFactory.class, false, false, false);

		property = getLocalProperty(connectionFactoryType, 2);
		initializeProperty(property, this.getCreateResource(), "create", "ifnotexist", 0, 1, ConnectionFactory.class, false, false, false);

		initializeType(constrainingTypeType, ConstrainingType.class, "ConstrainingType", false);
		property = getLocalProperty(constrainingTypeType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, ConstrainingType.class, false, false, false);

		property = getLocalProperty(constrainingTypeType, 1);
		initializeProperty(property, this.getComponentService(), "service", null, 0, -1, ConstrainingType.class, false, false, true, true , null);

		property = getLocalProperty(constrainingTypeType, 2);
		initializeProperty(property, this.getComponentReference(), "reference", null, 0, -1, ConstrainingType.class, false, false, true, true , null);

		property = getLocalProperty(constrainingTypeType, 3);
		initializeProperty(property, this.getProperty(), "property", null, 0, -1, ConstrainingType.class, false, false, true, true , null);

		property = getLocalProperty(constrainingTypeType, 4);
		initializeProperty(property, getSequence(), "any", null, 0, -1, ConstrainingType.class, false, false, false);

		property = getLocalProperty(constrainingTypeType, 5);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, ConstrainingType.class, false, false, false);

		property = getLocalProperty(constrainingTypeType, 6);
		initializeProperty(property, theModelPackageImpl.getURI(), "targetNamespace", null, 0, 1, ConstrainingType.class, false, false, false);

		property = getLocalProperty(constrainingTypeType, 7);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, ConstrainingType.class, false, false, false);

		property = getLocalProperty(constrainingTypeType, 8);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, ConstrainingType.class, false, false, false);

		initializeType(definitionsType, definitions.class, "definitions", false);
		property = getLocalProperty(definitionsType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, definitions.class, false, false, false);

		property = getLocalProperty(definitionsType, 1);
		initializeProperty(property, this.getIntent(), "intent", null, 0, -1, definitions.class, false, false, true, true , null);

		property = getLocalProperty(definitionsType, 2);
		initializeProperty(property, this.getPolicySet(), "policySet", null, 0, -1, definitions.class, false, false, true, true , null);

		property = getLocalProperty(definitionsType, 3);
		initializeProperty(property, getSequence(), "bindingGroup", null, 0, -1, definitions.class, false, false, true);

		property = getLocalProperty(definitionsType, 4);
		initializeProperty(property, this.getBinding(), "binding", null, 0, -1, definitions.class, true, false, true, true , null);

		property = getLocalProperty(definitionsType, 5);
		initializeProperty(property, this.getBindingType(), "bindingType", null, 0, -1, definitions.class, false, false, true, true , null);

		property = getLocalProperty(definitionsType, 6);
		initializeProperty(property, this.getImplementationType(), "implementationType", null, 0, -1, definitions.class, false, false, true, true , null);

		property = getLocalProperty(definitionsType, 7);
		initializeProperty(property, getSequence(), "any", null, 0, -1, definitions.class, false, false, true);

		property = getLocalProperty(definitionsType, 8);
		initializeProperty(property, theModelPackageImpl.getURI(), "targetNamespace", null, 0, 1, definitions.class, false, false, false);

		initializeType(denyAllType, DenyAll.class, "DenyAll", false);
		initializeType(destinationType, Destination.class, "Destination", false);
		property = getLocalProperty(destinationType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "property", null, 0, -1, Destination.class, false, false, false);

		property = getLocalProperty(destinationType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "name", null, 1, 1, Destination.class, false, false, false);

		property = getLocalProperty(destinationType, 2);
		initializeProperty(property, this.gettype(), "type", "queue", 0, 1, Destination.class, false, false, false);

		property = getLocalProperty(destinationType, 3);
		initializeProperty(property, this.getCreateResource(), "create", "ifnotexist", 0, 1, Destination.class, false, false, false);

		initializeType(headersType, Headers.class, "Headers", false);
		property = getLocalProperty(headersType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "property", null, 0, -1, Headers.class, false, false, false);

		property = getLocalProperty(headersType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "JMSType", null, 0, 1, Headers.class, false, false, false);

		property = getLocalProperty(headersType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "JMSCorrelationID", null, 0, 1, Headers.class, false, false, false);

		property = getLocalProperty(headersType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "JMSDeliveryMode", null, 0, 1, Headers.class, false, false, false);

		property = getLocalProperty(headersType, 4);
		initializeProperty(property, theModelPackageImpl.getInt(), "JMSTimeToLive", null, 0, 1, Headers.class, false, false, false);

		property = getLocalProperty(headersType, 5);
		initializeProperty(property, theModelPackageImpl.getString(), "JMSPriority", null, 0, 1, Headers.class, false, false, false);

		initializeType(implementationType, Implementation.class, "Implementation", true);
		property = getLocalProperty(implementationType, 0);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Implementation.class, false, false, false);

		property = getLocalProperty(implementationType, 1);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Implementation.class, false, false, false);

		initializeType(implementationTypeType, ImplementationType.class, "ImplementationType", false);
		property = getLocalProperty(implementationTypeType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, ImplementationType.class, false, false, false);

		property = getLocalProperty(implementationTypeType, 1);
		initializeProperty(property, getSequence(), "any", null, 0, -1, ImplementationType.class, false, false, true);

		property = getLocalProperty(implementationTypeType, 2);
		initializeProperty(property, theInternalPackageImpl.getQName(), "type", null, 1, 1, ImplementationType.class, false, false, false);

		property = getLocalProperty(implementationTypeType, 3);
		initializeProperty(property, this.getlistOfQNames(), "alwaysProvides", null, 0, 1, ImplementationType.class, false, false, false);

		property = getLocalProperty(implementationTypeType, 4);
		initializeProperty(property, this.getlistOfQNames(), "mayProvide", null, 0, 1, ImplementationType.class, false, false, false);

		property = getLocalProperty(implementationTypeType, 5);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, ImplementationType.class, false, false, false);

		initializeType(includeType, Include.class, "Include", false);
		property = getLocalProperty(includeType, 0);
		initializeProperty(property, theInternalPackageImpl.getQName(), "name", null, 0, 1, Include.class, false, false, false);

		property = getLocalProperty(includeType, 1);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Include.class, false, false, false);

		initializeType(intentType, Intent.class, "Intent", false);
		property = getLocalProperty(intentType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "description", null, 0, 1, Intent.class, false, false, false);

		property = getLocalProperty(intentType, 1);
		initializeProperty(property, getSequence(), "any", null, 0, -1, Intent.class, false, false, false);

		property = getLocalProperty(intentType, 2);
		initializeProperty(property, theInternalPackageImpl.getQName(), "name", null, 1, 1, Intent.class, false, false, false);

		property = getLocalProperty(intentType, 3);
		initializeProperty(property, this.getlistOfQNames(), "constrains", null, 0, 1, Intent.class, false, false, false);

		property = getLocalProperty(intentType, 4);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Intent.class, false, false, false);

		property = getLocalProperty(intentType, 5);
		initializeProperty(property, this.getlistOfQNames(), "excludes", null, 0, 1, Intent.class, false, false, false);

		property = getLocalProperty(intentType, 6);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Intent.class, false, false, false);

		initializeType(intentMapType, IntentMap.class, "IntentMap", false);
		property = getLocalProperty(intentMapType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, IntentMap.class, false, false, false);

		property = getLocalProperty(intentMapType, 1);
		initializeProperty(property, this.getQualifier(), "qualifier", null, 0, -1, IntentMap.class, false, false, true, true , null);

		property = getLocalProperty(intentMapType, 2);
		initializeProperty(property, getSequence(), "any", null, 0, -1, IntentMap.class, false, false, true);

		property = getLocalProperty(intentMapType, 3);
		initializeProperty(property, theInternalPackageImpl.getQName(), "provides", null, 1, 1, IntentMap.class, false, false, false);

		property = getLocalProperty(intentMapType, 4);
		initializeProperty(property, theModelPackageImpl.getString(), "default", null, 0, 1, IntentMap.class, false, false, false);

		property = getLocalProperty(intentMapType, 5);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, IntentMap.class, false, false, false);

		initializeType(interface_Type, Interface.class, "Interface", true);
		initializeType(javaImplementationType, JavaImplementation.class, "JavaImplementation", false);
		property = getLocalProperty(javaImplementationType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, JavaImplementation.class, false, false, false);

		property = getLocalProperty(javaImplementationType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "class", null, 1, 1, JavaImplementation.class, false, false, false);

		property = getLocalProperty(javaImplementationType, 2);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, JavaImplementation.class, false, false, false);

		initializeType(javaInterfaceType, JavaInterface.class, "JavaInterface", false);
		property = getLocalProperty(javaInterfaceType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, JavaInterface.class, false, false, false);

		property = getLocalProperty(javaInterfaceType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "interface", null, 1, 1, JavaInterface.class, false, false, false);

		property = getLocalProperty(javaInterfaceType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "callbackInterface", null, 0, 1, JavaInterface.class, false, false, false);

		property = getLocalProperty(javaInterfaceType, 3);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, JavaInterface.class, false, false, false);

		initializeType(jmsBindingType, JMSBinding.class, "JMSBinding", false);
		property = getLocalProperty(jmsBindingType, 0);
		initializeProperty(property, this.getDestination(), "destination", null, 0, 1, JMSBinding.class, false, false, false, true , null);

		property = getLocalProperty(jmsBindingType, 1);
		initializeProperty(property, this.getConnectionFactory(), "connectionFactory", null, 0, 1, JMSBinding.class, false, false, false, true , null);

		property = getLocalProperty(jmsBindingType, 2);
		initializeProperty(property, this.getActivationSpec(), "activationSpec", null, 0, 1, JMSBinding.class, false, false, false, true , null);

		property = getLocalProperty(jmsBindingType, 3);
		initializeProperty(property, this.getResponse(), "response", null, 0, 1, JMSBinding.class, false, false, false, true , null);

		property = getLocalProperty(jmsBindingType, 4);
		initializeProperty(property, this.getHeaders(), "headers", null, 0, 1, JMSBinding.class, false, false, false, true , null);

		property = getLocalProperty(jmsBindingType, 5);
		initializeProperty(property, this.getResourceAdapter(), "resourceAdapter", null, 0, 1, JMSBinding.class, false, false, false, true , null);

		property = getLocalProperty(jmsBindingType, 6);
		initializeProperty(property, this.getOperationProperties(), "operationProperties", null, 0, -1, JMSBinding.class, false, false, false, true , null);

		property = getLocalProperty(jmsBindingType, 7);
		initializeProperty(property, getSequence(), "any", null, 0, -1, JMSBinding.class, false, false, false);

		property = getLocalProperty(jmsBindingType, 8);
		initializeProperty(property, this.getcorrelationScheme(), "correlationScheme", "RequestMsgIDToCorrelID", 0, 1, JMSBinding.class, false, false, false);

		property = getLocalProperty(jmsBindingType, 9);
		initializeProperty(property, theModelPackageImpl.getURI(), "initialContextFactory", null, 0, 1, JMSBinding.class, false, false, false);

		property = getLocalProperty(jmsBindingType, 10);
		initializeProperty(property, theModelPackageImpl.getURI(), "jndiURL", null, 0, 1, JMSBinding.class, false, false, false);

		property = getLocalProperty(jmsBindingType, 11);
		initializeProperty(property, theInternalPackageImpl.getQName(), "requestConnection", null, 0, 1, JMSBinding.class, false, false, false);

		property = getLocalProperty(jmsBindingType, 12);
		initializeProperty(property, theInternalPackageImpl.getQName(), "responseConnection", null, 0, 1, JMSBinding.class, false, false, false);

		property = getLocalProperty(jmsBindingType, 13);
		initializeProperty(property, theInternalPackageImpl.getQName(), "operationProperties1", null, 0, 1, JMSBinding.class, false, false, false);

		property = getLocalProperty(jmsBindingType, 14);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, JMSBinding.class, false, false, false);

		initializeType(operationType, Operation.class, "Operation", false);
		property = getLocalProperty(operationType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, Operation.class, false, false, false);

		property = getLocalProperty(operationType, 1);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Operation.class, false, false, false);

		property = getLocalProperty(operationType, 2);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Operation.class, false, false, false);

		property = getLocalProperty(operationType, 3);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Operation.class, false, false, false);

		initializeType(operationPropertiesType, OperationProperties.class, "OperationProperties", false);
		property = getLocalProperty(operationPropertiesType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "property", null, 0, -1, OperationProperties.class, false, false, false);

		property = getLocalProperty(operationPropertiesType, 1);
		initializeProperty(property, this.getHeaders(), "headers", null, 1, 1, OperationProperties.class, false, false, false, true , null);

		property = getLocalProperty(operationPropertiesType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, OperationProperties.class, false, false, false);

		property = getLocalProperty(operationPropertiesType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "nativeOperation", null, 0, 1, OperationProperties.class, false, false, false);

		initializeType(permitAllType, PermitAll.class, "PermitAll", false);
		initializeType(policySetType, PolicySet.class, "PolicySet", false);
		property = getLocalProperty(policySetType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, PolicySet.class, false, false, false);

		property = getLocalProperty(policySetType, 1);
		initializeProperty(property, this.getPolicySetReference(), "policySetReference", null, 0, -1, PolicySet.class, false, false, true, true , null);

		property = getLocalProperty(policySetType, 2);
		initializeProperty(property, this.getIntentMap(), "intentMap", null, 0, -1, PolicySet.class, false, false, true, true , null);

		property = getLocalProperty(policySetType, 3);
		initializeProperty(property, getSequence(), "any", null, 0, -1, PolicySet.class, false, false, true);

		property = getLocalProperty(policySetType, 4);
		initializeProperty(property, theInternalPackageImpl.getQName(), "name", null, 1, 1, PolicySet.class, false, false, false);

		property = getLocalProperty(policySetType, 5);
		initializeProperty(property, this.getlistOfQNames(), "provides", null, 0, 1, PolicySet.class, false, false, false);

		property = getLocalProperty(policySetType, 6);
		initializeProperty(property, theModelPackageImpl.getString(), "appliesTo", null, 1, 1, PolicySet.class, false, false, false);

		property = getLocalProperty(policySetType, 7);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, PolicySet.class, false, false, false);

		initializeType(policySetReferenceType, PolicySetReference.class, "PolicySetReference", false);
		property = getLocalProperty(policySetReferenceType, 0);
		initializeProperty(property, theInternalPackageImpl.getQName(), "name", null, 1, 1, PolicySetReference.class, false, false, false);

		property = getLocalProperty(policySetReferenceType, 1);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, PolicySetReference.class, false, false, false);

		initializeType(propertyType, Property.class, "Property", false);
		property = getLocalProperty(propertyType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, Property.class, false, false, false);

		property = getLocalProperty(propertyType, 1);
		initializeProperty(property, theInternalPackageImpl.getQName(), "type", null, 0, 1, Property.class, false, false, false);

		property = getLocalProperty(propertyType, 2);
		initializeProperty(property, theInternalPackageImpl.getQName(), "element", null, 0, 1, Property.class, false, false, false);

		property = getLocalProperty(propertyType, 3);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "many", "false", 0, 1, Property.class, false, false, false);

		property = getLocalProperty(propertyType, 4);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "noDefault", "false", 0, 1, Property.class, false, false, false);

		property = getLocalProperty(propertyType, 5);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Property.class, false, false, false);

		initializeType(propertyValueType, PropertyValue.class, "PropertyValue", false);
		property = getLocalProperty(propertyValueType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, PropertyValue.class, false, false, false);

		property = getLocalProperty(propertyValueType, 1);
		initializeProperty(property, theInternalPackageImpl.getQName(), "type", null, 0, 1, PropertyValue.class, false, false, false);

		property = getLocalProperty(propertyValueType, 2);
		initializeProperty(property, theInternalPackageImpl.getQName(), "element", null, 0, 1, PropertyValue.class, false, false, false);

		property = getLocalProperty(propertyValueType, 3);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "many", "false", 0, 1, PropertyValue.class, false, false, false);

		property = getLocalProperty(propertyValueType, 4);
		initializeProperty(property, theModelPackageImpl.getString(), "source", null, 0, 1, PropertyValue.class, false, false, false);

		property = getLocalProperty(propertyValueType, 5);
		initializeProperty(property, theModelPackageImpl.getURI(), "file", null, 0, 1, PropertyValue.class, false, false, false);

		property = getLocalProperty(propertyValueType, 6);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, PropertyValue.class, false, false, false);

		initializeType(qualifierType, Qualifier.class, "Qualifier", false);
		property = getLocalProperty(qualifierType, 0);
		initializeProperty(property, getSequence(), "group", null, 0, -1, Qualifier.class, false, false, false);

		property = getLocalProperty(qualifierType, 1);
		initializeProperty(property, this.getIntentMap(), "intentMap", null, 0, -1, Qualifier.class, false, false, true, true , null);

		property = getLocalProperty(qualifierType, 2);
		initializeProperty(property, getSequence(), "any", null, 0, -1, Qualifier.class, false, false, true);

		property = getLocalProperty(qualifierType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, Qualifier.class, false, false, false);

		property = getLocalProperty(qualifierType, 4);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Qualifier.class, false, false, false);

		initializeType(referenceType, Reference.class, "Reference", false);
		property = getLocalProperty(referenceType, 0);
		initializeProperty(property, getSequence(), "interfaceGroup", null, 0, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 1);
		initializeProperty(property, this.getInterface(), "interface", null, 0, 1, Reference.class, true, false, true, true , null);

		property = getLocalProperty(referenceType, 2);
		initializeProperty(property, this.getOperation(), "operation", null, 0, -1, Reference.class, false, false, false, true , null);

		property = getLocalProperty(referenceType, 3);
		initializeProperty(property, getSequence(), "group", null, 0, -1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 4);
		initializeProperty(property, getSequence(), "bindingGroup", null, 0, -1, Reference.class, false, false, true);

		property = getLocalProperty(referenceType, 5);
		initializeProperty(property, this.getBinding(), "binding", null, 0, -1, Reference.class, true, false, true, true , null);

		property = getLocalProperty(referenceType, 6);
		initializeProperty(property, getSequence(), "any", null, 0, -1, Reference.class, false, false, true);

		property = getLocalProperty(referenceType, 7);
		initializeProperty(property, this.getCallback(), "callback", null, 0, 1, Reference.class, false, false, false, true , null);

		property = getLocalProperty(referenceType, 8);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 9);
		initializeProperty(property, this.getlistOfAnyURIs(), "target", null, 0, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 10);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "wiredByImpl", "false", 0, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 11);
		initializeProperty(property, this.getMultiplicity(), "multiplicity", "1..1", 0, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 12);
		initializeProperty(property, this.getlistOfAnyURIs(), "promote", null, 1, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 13);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 14);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Reference.class, false, false, false);

		property = getLocalProperty(referenceType, 15);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Reference.class, false, false, false);

		initializeType(resourceAdapterType, ResourceAdapter.class, "ResourceAdapter", false);
		property = getLocalProperty(resourceAdapterType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "property", null, 0, -1, ResourceAdapter.class, false, false, false);

		property = getLocalProperty(resourceAdapterType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, ResourceAdapter.class, false, false, false);

		initializeType(responseType, Response.class, "Response", false);
		property = getLocalProperty(responseType, 0);
		initializeProperty(property, this.getDestination(), "destination", null, 0, 1, Response.class, false, false, false, true , null);

		property = getLocalProperty(responseType, 1);
		initializeProperty(property, this.getConnectionFactory(), "connectionFactory", null, 0, 1, Response.class, false, false, false, true , null);

		property = getLocalProperty(responseType, 2);
		initializeProperty(property, this.getActivationSpec(), "activationSpec", null, 0, 1, Response.class, false, false, false, true , null);

		initializeType(runAsType, RunAs.class, "RunAs", false);
		property = getLocalProperty(runAsType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "role", null, 1, 1, RunAs.class, false, false, false);

		initializeType(scaBindingType, SCABinding.class, "SCABinding", false);
		property = getLocalProperty(scaBindingType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, SCABinding.class, false, false, false);

		property = getLocalProperty(scaBindingType, 1);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, SCABinding.class, false, false, false);

		initializeType(scaImplementationType, SCAImplementation.class, "SCAImplementation", false);
		property = getLocalProperty(scaImplementationType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, SCAImplementation.class, false, false, false);

		property = getLocalProperty(scaImplementationType, 1);
		initializeProperty(property, theInternalPackageImpl.getQName(), "name", null, 1, 1, SCAImplementation.class, false, false, false);

		property = getLocalProperty(scaImplementationType, 2);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, SCAImplementation.class, false, false, false);

		initializeType(scaPropertyBaseType, SCAPropertyBase.class, "SCAPropertyBase", false);
		property = getLocalProperty(scaPropertyBaseType, 0);
		initializeProperty(property, getSequence(), "mixed", null, 0, -1, SCAPropertyBase.class, false, false, false);

		property = getLocalProperty(scaPropertyBaseType, 1);
		initializeProperty(property, getSequence(), "any", null, 0, 1, SCAPropertyBase.class, false, false, true);

		initializeType(serviceType, Service.class, "Service", false);
		property = getLocalProperty(serviceType, 0);
		initializeProperty(property, getSequence(), "interfaceGroup", null, 0, 1, Service.class, false, false, false);

		property = getLocalProperty(serviceType, 1);
		initializeProperty(property, this.getInterface(), "interface", null, 0, 1, Service.class, true, false, true, true , null);

		property = getLocalProperty(serviceType, 2);
		initializeProperty(property, this.getOperation(), "operation", null, 0, -1, Service.class, false, false, false, true , null);

		property = getLocalProperty(serviceType, 3);
		initializeProperty(property, getSequence(), "group", null, 0, -1, Service.class, false, false, false);

		property = getLocalProperty(serviceType, 4);
		initializeProperty(property, getSequence(), "bindingGroup", null, 0, -1, Service.class, false, false, true);

		property = getLocalProperty(serviceType, 5);
		initializeProperty(property, this.getBinding(), "binding", null, 0, -1, Service.class, true, false, true, true , null);

		property = getLocalProperty(serviceType, 6);
		initializeProperty(property, getSequence(), "any", null, 0, -1, Service.class, false, false, true);

		property = getLocalProperty(serviceType, 7);
		initializeProperty(property, this.getCallback(), "callback", null, 0, 1, Service.class, false, false, false, true , null);

		property = getLocalProperty(serviceType, 8);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, Service.class, false, false, false);

		property = getLocalProperty(serviceType, 9);
		initializeProperty(property, theModelPackageImpl.getURI(), "promote", null, 1, 1, Service.class, false, false, false);

		property = getLocalProperty(serviceType, 10);
		initializeProperty(property, this.getlistOfQNames(), "requires", null, 0, 1, Service.class, false, false, false);

		property = getLocalProperty(serviceType, 11);
		initializeProperty(property, this.getlistOfQNames(), "policySets", null, 0, 1, Service.class, false, false, false);

		property = getLocalProperty(serviceType, 12);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Service.class, false, false, false);

		initializeType(springImplementationType, SpringImplementation.class, "SpringImplementation", false);
		property = getLocalProperty(springImplementationType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, SpringImplementation.class, false, false, false);

		property = getLocalProperty(springImplementationType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "location", null, 1, 1, SpringImplementation.class, false, false, false);

		property = getLocalProperty(springImplementationType, 2);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, SpringImplementation.class, false, false, false);

		initializeType(webServiceBindingType, WebServiceBinding.class, "WebServiceBinding", false);
		property = getLocalProperty(webServiceBindingType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, WebServiceBinding.class, false, false, false);

		property = getLocalProperty(webServiceBindingType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "wsdlElement", null, 0, 1, WebServiceBinding.class, false, false, false);

		property = getLocalProperty(webServiceBindingType, 2);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, WebServiceBinding.class, false, false, false);

		initializeType(wireType, Wire.class, "Wire", false);
		property = getLocalProperty(wireType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, Wire.class, false, false, false);

		property = getLocalProperty(wireType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "source", null, 1, 1, Wire.class, false, false, false);

		property = getLocalProperty(wireType, 2);
		initializeProperty(property, theModelPackageImpl.getURI(), "target", null, 1, 1, Wire.class, false, false, false);

		property = getLocalProperty(wireType, 3);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, Wire.class, false, false, false);

		initializeType(wsdlPortTypeType, WSDLPortType.class, "WSDLPortType", false);
		property = getLocalProperty(wsdlPortTypeType, 0);
		initializeProperty(property, getSequence(), "any", null, 0, -1, WSDLPortType.class, false, false, false);

		property = getLocalProperty(wsdlPortTypeType, 1);
		initializeProperty(property, theModelPackageImpl.getURI(), "interface", null, 1, 1, WSDLPortType.class, false, false, false);

		property = getLocalProperty(wsdlPortTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getURI(), "callbackInterface", null, 0, 1, WSDLPortType.class, false, false, false);

		property = getLocalProperty(wsdlPortTypeType, 3);
		initializeProperty(property, getSequence(), "anyAttribute", null, 0, -1, WSDLPortType.class, false, false, false);

		// Initialize data types
		initializeType(correlationSchemeType, String.class, "correlationScheme", true, false);

		initializeType(createResourceType, String.class, "CreateResource", true, false);

		initializeType(listOfAnyURIsType, List.class, "listOfAnyURIs", true, false);

		initializeType(listOfQNamesType, List.class, "listOfQNames", true, false);

		initializeType(multiplicityType, String.class, "Multiplicity", true, false);

		initializeType(overrideOptionsType, String.class, "OverrideOptions", true, false);

		initializeType(typeType, String.class, "type", true, false);

		createXSDMetaData(theModelPackageImpl, theInternalPackageImpl);
	}
	  
	protected void createXSDMetaData(ModelFactoryImpl theModelPackageImpl, InternalFactoryImpl theInternalPackageImpl)
	{
		super.initXSD();
		
		commonj.sdo.Property property = null;
		

		addXSDMapping
		  (activationSpecType,
			 new String[] 
			 {
			 "name", "ActivationSpec",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(activationSpecType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(activationSpecType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(activationSpecType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "create"
			 });

		addXSDMapping
		  (allowType,
			 new String[] 
			 {
			 "name", "Allow",
			 "kind", "empty"
			 });

		addXSDMapping
			(getLocalProperty(allowType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "roles"
			 });

		addXSDMapping
		  (bindingType,
			 new String[] 
			 {
			 "name", "Binding",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(bindingType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(bindingType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "uri"
			 });

		addXSDMapping
			(getLocalProperty(bindingType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(bindingType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(bindingType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
		  (bindingTypeType,
			 new String[] 
			 {
			 "name", "BindingType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(bindingTypeType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(bindingTypeType, 1),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(bindingTypeType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "type"
			 });

		addXSDMapping
			(getLocalProperty(bindingTypeType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "alwaysProvides"
			 });

		addXSDMapping
			(getLocalProperty(bindingTypeType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "mayProvide"
			 });

		addXSDMapping
			(getLocalProperty(bindingTypeType, 5),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":5",
			 "processing", "lax"
			 });

		addXSDMapping
		  (bpelImplementationType,
			 new String[] 
			 {
			 "name", "BpelImplementation",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(bpelImplementationType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(bpelImplementationType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "process"
			 });

		addXSDMapping
			(getLocalProperty(bpelImplementationType, 2),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
			 });

		addXSDMapping
		  (bpelPartnerLinkTypeType,
			 new String[] 
			 {
			 "name", "BpelPartnerLinkType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(bpelPartnerLinkTypeType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(bpelPartnerLinkTypeType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "type"
			 });

		addXSDMapping
			(getLocalProperty(bpelPartnerLinkTypeType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "serviceRole"
			 });

		addXSDMapping
			(getLocalProperty(bpelPartnerLinkTypeType, 3),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
			 });

		addXSDMapping
		  (callbackType,
			 new String[] 
			 {
			 "name", "Callback",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(callbackType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(callbackType, 1),
			 new String[]
			 {
			 "kind", "group",
			 "name", "binding:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(callbackType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace",
			 "group", "binding:group"
			 });

		addXSDMapping
			(getLocalProperty(callbackType, 3),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(callbackType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(callbackType, 5),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(callbackType, 6),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":6",
			 "processing", "lax"
			 });

		addXSDMapping
		  (componentType,
			 new String[] 
			 {
			 "name", "Component",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "implementation:group",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementation",
			 "namespace", "##targetNamespace",
			 "group", "implementation:group"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 2),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 3),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 7),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "autowire"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "constrainingType"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 11),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(componentType, 12),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":12",
			 "processing", "lax"
			 });

		addXSDMapping
		  (componentReferenceType,
			 new String[] 
			 {
			 "name", "ComponentReference",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "interface:group",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface",
			 "namespace", "##targetNamespace",
			 "group", "interface:group"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 3),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 4),
			 new String[]
			 {
			 "kind", "group",
			 "name", "binding:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace",
			 "group", "binding:group"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 6),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "callback",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "target"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "multiplicity"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 11),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 12),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(componentReferenceType, 13),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":13",
			 "processing", "lax"
			 });

		addXSDMapping
		  (componentServiceType,
			 new String[] 
			 {
			 "name", "ComponentService",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "interface:group",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface",
			 "namespace", "##targetNamespace",
			 "group", "interface:group"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 3),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 4),
			 new String[]
			 {
			 "kind", "group",
			 "name", "binding:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace",
			 "group", "binding:group"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 6),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "callback",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(componentServiceType, 11),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":11",
			 "processing", "lax"
			 });

		addXSDMapping
		  (componentTypeType,
			 new String[] 
			 {
			 "name", "ComponentType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "implementation:group",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementation",
			 "namespace", "##targetNamespace",
			 "group", "implementation:group"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 2),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 3),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 7),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "constrainingType"
			 });

		addXSDMapping
			(getLocalProperty(componentTypeType, 8),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":8",
			 "processing", "lax"
			 });

		addXSDMapping
		  (compositeType,
			 new String[] 
			 {
			 "name", "Composite",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "component",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "wire",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 7),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":7",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "local"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 11),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "autowire"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 12),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "constrainingType"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 13),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 14),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(compositeType, 15),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":15",
			 "processing", "lax"
			 });

		addXSDMapping
		  (connectionFactoryType,
			 new String[] 
			 {
			 "name", "ConnectionFactory",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(connectionFactoryType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(connectionFactoryType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(connectionFactoryType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "create"
			 });

		addXSDMapping
		  (constrainingTypeType,
			 new String[] 
			 {
			 "name", "ConstrainingType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 4),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 5),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 6),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 7),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(constrainingTypeType, 8),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":8",
			 "processing", "lax"
			 });

		addXSDMapping
		  (definitionsType,
			 new String[] 
			 {
			 "name", "definitions_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "intent",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "policySet",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 3),
			 new String[]
			 {
			 "kind", "group",
			 "name", "binding:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace",
			 "group", "binding:group"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "bindingType",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementationType",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 7),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":7",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(definitionsType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "targetNamespace"
			 });

		addXSDMapping
		  (denyAllType,
			 new String[] 
			 {
			 "name", "DenyAll",
			 "kind", "empty"
			 });

		addXSDMapping
		  (destinationType,
			 new String[] 
			 {
			 "name", "Destination",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(destinationType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(destinationType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(destinationType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "type"
			 });

		addXSDMapping
			(getLocalProperty(destinationType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "create"
			 });

		property = createGlobalProperty
		  ("allow",
		  this.getAllow(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "allow",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("binding",
		  this.getBinding(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("binding.jms",
		  this.getJMSBinding(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding.jms",
			 "namespace", "##targetNamespace",
			 "affiliation", "binding"
			 });
                
		property = createGlobalProperty
		  ("binding.sca",
		  this.getSCABinding(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding.sca",
			 "namespace", "##targetNamespace",
			 "affiliation", "binding"
			 });
                
		property = createGlobalProperty
		  ("binding.ws",
		  this.getWebServiceBinding(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding.ws",
			 "namespace", "##targetNamespace",
			 "affiliation", "binding"
			 });
                
		property = createGlobalProperty
		  ("bindingType",
		  this.getBindingType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "bindingType",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("callback",
		  this.getCallback(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "callback",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("componentType",
		  this.getComponentType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "componentType",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("composite",
		  this.getComposite(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "composite",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("constrainingType",
		  this.getConstrainingType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "constrainingType",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("definitions",
		  this.getdefinitions(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "definitions",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("denyAll",
		  this.getDenyAll(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "denyAll",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("implementation",
		  this.getImplementation(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementation",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("implementation.bpel",
		  this.getBpelImplementation(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementation.bpel",
			 "namespace", "##targetNamespace",
			 "affiliation", "implementation"
			 });
                
		property = createGlobalProperty
		  ("implementation.composite",
		  this.getSCAImplementation(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementation.composite",
			 "namespace", "##targetNamespace",
			 "affiliation", "implementation"
			 });
                
		property = createGlobalProperty
		  ("implementation.java",
		  this.getJavaImplementation(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementation.java",
			 "namespace", "##targetNamespace",
			 "affiliation", "implementation"
			 });
                
		property = createGlobalProperty
		  ("implementation.spring",
		  this.getSpringImplementation(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementation.spring",
			 "namespace", "##targetNamespace",
			 "affiliation", "implementation"
			 });
                
		property = createGlobalProperty
		  ("implementationType",
		  this.getImplementationType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "implementationType",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("include",
		  this.getInclude(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("intent",
		  this.getIntent(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "intent",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("interface",
		  this.getInterface(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("interface.java",
		  this.getJavaInterface(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface.java",
			 "namespace", "##targetNamespace",
			 "affiliation", "interface"
			 });
                
		property = createGlobalProperty
		  ("interface.partnerLinkType",
		  this.getBpelPartnerLinkType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface.partnerLinkType",
			 "namespace", "##targetNamespace",
			 "affiliation", "interface"
			 });
                
		property = createGlobalProperty
		  ("interface.wsdl",
		  this.getWSDLPortType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface.wsdl",
			 "namespace", "##targetNamespace",
			 "affiliation", "interface"
			 });
                
		property = createGlobalProperty
		  ("permitAll",
		  this.getPermitAll(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "permitAll",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("policySet",
		  this.getPolicySet(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "policySet",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("runAs",
		  this.getRunAs(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "runAs",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("endsConversation",
		  theModelPackageImpl.getBoolean(),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "endsConversation",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("requires",
		  this.getlistOfQNames(),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		addXSDMapping
		  (headersType,
			 new String[] 
			 {
			 "name", "Headers",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(headersType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headersType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "JMSType"
			 });

		addXSDMapping
			(getLocalProperty(headersType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "JMSCorrelationID"
			 });

		addXSDMapping
			(getLocalProperty(headersType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "JMSDeliveryMode"
			 });

		addXSDMapping
			(getLocalProperty(headersType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "JMSTimeToLive"
			 });

		addXSDMapping
			(getLocalProperty(headersType, 5),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "JMSPriority"
			 });

		addXSDMapping
		  (implementationType,
			 new String[] 
			 {
			 "name", "Implementation",
			 "kind", "empty"
			 });

		addXSDMapping
			(getLocalProperty(implementationType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(implementationType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
		  (implementationTypeType,
			 new String[] 
			 {
			 "name", "ImplementationType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(implementationTypeType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(implementationTypeType, 1),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(implementationTypeType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "type"
			 });

		addXSDMapping
			(getLocalProperty(implementationTypeType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "alwaysProvides"
			 });

		addXSDMapping
			(getLocalProperty(implementationTypeType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "mayProvide"
			 });

		addXSDMapping
			(getLocalProperty(implementationTypeType, 5),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":5",
			 "processing", "lax"
			 });

		addXSDMapping
		  (includeType,
			 new String[] 
			 {
			 "name", "Include",
			 "kind", "empty"
			 });

		addXSDMapping
			(getLocalProperty(includeType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(includeType, 1),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
			 });

		addXSDMapping
		  (intentType,
			 new String[] 
			 {
			 "name", "Intent",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(intentType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(intentType, 1),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(intentType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(intentType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "constrains"
			 });

		addXSDMapping
			(getLocalProperty(intentType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(intentType, 5),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "excludes"
			 });

		addXSDMapping
			(getLocalProperty(intentType, 6),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":6",
			 "processing", "lax"
			 });

		addXSDMapping
		  (intentMapType,
			 new String[] 
			 {
			 "name", "IntentMap",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(intentMapType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(intentMapType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "qualifier",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(intentMapType, 2),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(intentMapType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "provides"
			 });

		addXSDMapping
			(getLocalProperty(intentMapType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "default"
			 });

		addXSDMapping
			(getLocalProperty(intentMapType, 5),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":5",
			 "processing", "lax"
			 });

		addXSDMapping
		  (interface_Type,
			 new String[] 
			 {
			 "name", "Interface",
			 "kind", "empty"
			 });

		addXSDMapping
		  (javaImplementationType,
			 new String[] 
			 {
			 "name", "JavaImplementation",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(javaImplementationType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(javaImplementationType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "class"
			 });

		addXSDMapping
			(getLocalProperty(javaImplementationType, 2),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
			 });

		addXSDMapping
		  (javaInterfaceType,
			 new String[] 
			 {
			 "name", "JavaInterface",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(javaInterfaceType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(javaInterfaceType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "interface"
			 });

		addXSDMapping
			(getLocalProperty(javaInterfaceType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "callbackInterface"
			 });

		addXSDMapping
			(getLocalProperty(javaInterfaceType, 3),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
			 });

		addXSDMapping
		  (jmsBindingType,
			 new String[] 
			 {
			 "name", "JMSBinding",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "destination",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "connectionFactory",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "activationSpec",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "response",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "headers",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "resourceAdapter",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "operationProperties",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 7),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":12",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "correlationScheme"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "initialContextFactory"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "jndiURL"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 11),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requestConnection"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 12),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "responseConnection"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 13),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "operationProperties"
			 });

		addXSDMapping
			(getLocalProperty(jmsBindingType, 14),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":19",
			 "processing", "strict"
			 });

		addXSDMapping
		  (operationType,
			 new String[] 
			 {
			 "name", "Operation",
			 "kind", "empty"
			 });

		addXSDMapping
			(getLocalProperty(operationType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(operationType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(operationType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(operationType, 3),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
			 });

		addXSDMapping
		  (operationPropertiesType,
			 new String[] 
			 {
			 "name", "OperationProperties",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(operationPropertiesType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(operationPropertiesType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "headers",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(operationPropertiesType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(operationPropertiesType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "nativeOperation"
			 });

		addXSDMapping
		  (permitAllType,
			 new String[] 
			 {
			 "name", "PermitAll",
			 "kind", "empty"
			 });

		addXSDMapping
		  (policySetType,
			 new String[] 
			 {
			 "name", "PolicySet",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "policySetReference",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "intentMap",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 3),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 5),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "provides"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 6),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "appliesTo"
			 });

		addXSDMapping
			(getLocalProperty(policySetType, 7),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":7",
			 "processing", "lax"
			 });

		addXSDMapping
		  (policySetReferenceType,
			 new String[] 
			 {
			 "name", "PolicySetReference",
			 "kind", "empty"
			 });

		addXSDMapping
			(getLocalProperty(policySetReferenceType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(policySetReferenceType, 1),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
			 });

		addXSDMapping
		  (propertyType,
			 new String[] 
			 {
			 "name", "Property",
			 "kind", "mixed"
			 });

		addXSDMapping
			(getLocalProperty(propertyType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(propertyType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "type"
			 });

		addXSDMapping
			(getLocalProperty(propertyType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "element"
			 });

		addXSDMapping
			(getLocalProperty(propertyType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "many"
			 });

		addXSDMapping
			(getLocalProperty(propertyType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "noDefault"
			 });

		addXSDMapping
			(getLocalProperty(propertyType, 5),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":7",
			 "processing", "lax"
			 });

		addXSDMapping
		  (propertyValueType,
			 new String[] 
			 {
			 "name", "PropertyValue",
			 "kind", "mixed"
			 });

		addXSDMapping
			(getLocalProperty(propertyValueType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(propertyValueType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "type"
			 });

		addXSDMapping
			(getLocalProperty(propertyValueType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "element"
			 });

		addXSDMapping
			(getLocalProperty(propertyValueType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "many"
			 });

		addXSDMapping
			(getLocalProperty(propertyValueType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "source"
			 });

		addXSDMapping
			(getLocalProperty(propertyValueType, 5),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "file"
			 });

		addXSDMapping
			(getLocalProperty(propertyValueType, 6),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":8",
			 "processing", "lax"
			 });

		addXSDMapping
		  (qualifierType,
			 new String[] 
			 {
			 "name", "Qualifier",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(qualifierType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:0"
			 });

		addXSDMapping
			(getLocalProperty(qualifierType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "intentMap",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(qualifierType, 2),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:0"
			 });

		addXSDMapping
			(getLocalProperty(qualifierType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(qualifierType, 4),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
			 });

		addXSDMapping
		  (referenceType,
			 new String[] 
			 {
			 "name", "Reference",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "interface:group",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface",
			 "namespace", "##targetNamespace",
			 "group", "interface:group"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 3),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:3"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 4),
			 new String[]
			 {
			 "kind", "group",
			 "name", "binding:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace",
			 "group", "binding:group"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 6),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "callback",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "target"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "wiredByImpl"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 11),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "multiplicity"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 12),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "promote"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 13),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 14),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(referenceType, 15),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":15",
			 "processing", "lax"
			 });

		addXSDMapping
		  (resourceAdapterType,
			 new String[] 
			 {
			 "name", "ResourceAdapter",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(resourceAdapterType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(resourceAdapterType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
		  (responseType,
			 new String[] 
			 {
			 "name", "Response",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(responseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "destination",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(responseType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "connectionFactory",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(responseType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "activationSpec",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (runAsType,
			 new String[] 
			 {
			 "name", "RunAs",
			 "kind", "empty"
			 });

		addXSDMapping
			(getLocalProperty(runAsType, 0),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "role"
			 });

		addXSDMapping
		  (scaBindingType,
			 new String[] 
			 {
			 "name", "SCABinding",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(scaBindingType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(scaBindingType, 1),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":6",
			 "processing", "lax"
			 });

		addXSDMapping
		  (scaImplementationType,
			 new String[] 
			 {
			 "name", "SCAImplementation",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(scaImplementationType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(scaImplementationType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(scaImplementationType, 2),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
			 });

		addXSDMapping
		  (scaPropertyBaseType,
			 new String[] 
			 {
			 "name", "SCAPropertyBase",
			 "kind", "mixed"
			 });

		addXSDMapping
			(getLocalProperty(scaPropertyBaseType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "name", ":mixed"
			 });

		addXSDMapping
			(getLocalProperty(scaPropertyBaseType, 1),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
			 });

		addXSDMapping
		  (serviceType,
			 new String[] 
			 {
			 "name", "Service",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 0),
			 new String[]
			 {
			 "kind", "group",
			 "name", "interface:group",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "interface",
			 "namespace", "##targetNamespace",
			 "group", "interface:group"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 3),
			 new String[]
			 {
			 "kind", "group",
			 "name", "group:3"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 4),
			 new String[]
			 {
			 "kind", "group",
			 "name", "binding:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace",
			 "group", "binding:group"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 6),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:3"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "callback",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "promote"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "requires"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 11),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "policySets"
			 });

		addXSDMapping
			(getLocalProperty(serviceType, 12),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":12",
			 "processing", "lax"
			 });

		addXSDMapping
		  (springImplementationType,
			 new String[] 
			 {
			 "name", "SpringImplementation",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(springImplementationType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(springImplementationType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "location"
			 });

		addXSDMapping
			(getLocalProperty(springImplementationType, 2),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
			 });

		addXSDMapping
		  (webServiceBindingType,
			 new String[] 
			 {
			 "name", "WebServiceBinding",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(webServiceBindingType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(webServiceBindingType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "wsdlElement"
			 });

		addXSDMapping
			(getLocalProperty(webServiceBindingType, 2),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":7",
			 "processing", "lax"
			 });

		addXSDMapping
		  (wireType,
			 new String[] 
			 {
			 "name", "Wire",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(wireType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(wireType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "source"
			 });

		addXSDMapping
			(getLocalProperty(wireType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "target"
			 });

		addXSDMapping
			(getLocalProperty(wireType, 3),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
			 });

		addXSDMapping
		  (wsdlPortTypeType,
			 new String[] 
			 {
			 "name", "WSDLPortType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(wsdlPortTypeType, 0),
			 new String[]
			 {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
			 });

		addXSDMapping
			(getLocalProperty(wsdlPortTypeType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "interface"
			 });

		addXSDMapping
			(getLocalProperty(wsdlPortTypeType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "callbackInterface"
			 });

		addXSDMapping
			(getLocalProperty(wsdlPortTypeType, 3),
			 new String[]
			 {
			 "kind", "attributeWildcard",
			 "wildcards", "##any",
			 "name", ":3",
			 "processing", "lax"
			 });

		addXSDMapping
		  (correlationSchemeType,
			 new String[] 
			 {
			 "name", "correlationScheme_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "RequestMsgIDToCorrelID RequestCorrelIDToCorrelID None"
			 });

		addXSDMapping
		  (createResourceType,
			 new String[] 
			 {
			 "name", "CreateResource",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "always never ifnotexist"
			 });

		addXSDMapping
		  (listOfAnyURIsType,
			 new String[] 
			 {
			 "name", "listOfAnyURIs",
			 "itemType", "commonj.sdo#URI"
			 });

		addXSDMapping
		  (listOfQNamesType,
			 new String[] 
			 {
			 "name", "listOfQNames",
			 "itemType", "http://www.apache.org/tuscany/commonj.sdo.internal#QName"
			 });

		addXSDMapping
		  (multiplicityType,
			 new String[] 
			 {
			 "name", "Multiplicity",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "0..1 1..1 0..n 1..n"
			 });

		addXSDMapping
		  (overrideOptionsType,
			 new String[] 
			 {
			 "name", "OverrideOptions",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "no may must"
			 });

		addXSDMapping
		  (typeType,
			 new String[] 
			 {
			 "name", "type_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "queue topic"
			 });

  }
    
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createcorrelationSchemeFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcorrelationSchemeToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCreateResourceFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateResourceToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createlistOfAnyURIsFromString(String initialValue)
	{
		if (initialValue == null) return null;
		List result = new ArrayList();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); )
		{
			String item = stringTokenizer.nextToken();
			result.add(((ModelFactoryImpl)ModelFactory.INSTANCE).createURIFromString(item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlistOfAnyURIsToString(Object instanceValue)
	{
		if (instanceValue == null) return null;
		List list = (List)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Iterator i = list.iterator(); i.hasNext(); )
		{
			result.append(((ModelFactoryImpl)ModelFactory.INSTANCE).convertURIToString(i.next()));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createlistOfQNamesFromString(String initialValue)
	{
		if (initialValue == null) return null;
		List result = new ArrayList();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); )
		{
			String item = stringTokenizer.nextToken();
			result.add(((InternalFactoryImpl)InternalFactory.INSTANCE).createQNameFromString(item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlistOfQNamesToString(Object instanceValue)
	{
		if (instanceValue == null) return null;
		List list = (List)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Iterator i = list.iterator(); i.hasNext(); )
		{
			result.append(((InternalFactoryImpl)InternalFactory.INSTANCE).convertQNameToString(i.next()));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMultiplicityFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOverrideOptionsFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverrideOptionsToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createtypeFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

} //_1FactoryImpl

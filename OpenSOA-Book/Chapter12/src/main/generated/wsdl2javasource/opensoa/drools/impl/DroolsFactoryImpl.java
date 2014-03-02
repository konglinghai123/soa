/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.impl;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;
import org.apache.tuscany.sdo.helper.TypeHelperImpl;

import commonj.sdo.DataObject;
import commonj.sdo.Property;
import commonj.sdo.Type;

import opensoa.drools.*;

import org.apache.tuscany.sdo.impl.FactoryBase;

import org.apache.tuscany.sdo.model.ModelFactory;

import org.apache.tuscany.sdo.model.impl.ModelFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * Generator information:
 * patternVersion=1.2; -prefix Drools -noContainment -noUnsettable
 * <!-- end-user-doc -->
 * @generated
 */
public class DroolsFactoryImpl extends FactoryBase implements DroolsFactory
{

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_URI = "urn:opensoa.drools";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_PREFIX = "ns1";

	/**
	 * The version of the generator pattern used to generate this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String PATTERN_VERSION = "1.2";
	
	public static final int DECISION_REQUEST_TYPE = 1;	
	public static final int DECISION_RESPONSE_TYPE = 2;	
	public static final int MANAGE_RESPONSE_TYPE = 3;	
	public static final int MANAGE_SERVICE_TYPE = 4;	
	public static final int RESULT = 5;
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroolsFactoryImpl()
	{
		super(NAMESPACE_URI, NAMESPACE_PREFIX, "opensoa.drools");
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
			case MANAGE_RESPONSE_TYPE: return (DataObject)createManageResponseType();
			case MANAGE_SERVICE_TYPE: return (DataObject)createManageServiceType();
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
			case RESULT:
				return createResultFromString(initialValue);
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
			case RESULT:
				return convertResultToString(instanceValue);
			default:
				throw new IllegalArgumentException("The type number '" + typeNumber + "' is not a valid datatype");
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManageResponseType createManageResponseType()
	{
		ManageResponseTypeImpl manageResponseType = new ManageResponseTypeImpl();
		return manageResponseType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManageServiceType createManageServiceType()
	{
		ManageServiceTypeImpl manageServiceType = new ManageServiceTypeImpl();
		return manageServiceType;
	}
	
	// Following creates and initializes SDO metadata for the supported types.		
	protected Type decisionRequestTypeType = null;

	public Type getDecisionRequestType()
	{
		return decisionRequestTypeType;
	}
		
	protected Type decisionResponseTypeType = null;

	public Type getDecisionResponseType()
	{
		return decisionResponseTypeType;
	}
			
	protected Type manageResponseTypeType = null;

	public Type getManageResponseType()
	{
		return manageResponseTypeType;
	}
		
	protected Type manageServiceTypeType = null;

	public Type getManageServiceType()
	{
		return manageServiceTypeType;
	}
		
	protected Type resultType = null;

	public Type getResult()
	{
		return resultType;
	}
	

	private static DroolsFactoryImpl instance = null; 
	public static DroolsFactoryImpl init()
	{
		if (instance != null ) return instance;
		instance = new DroolsFactoryImpl();

		// Create package meta-data objects
		instance.createMetaData();

		// Initialize created meta-data
		instance.initializeMetaData();
		
		// Mark meta-data to indicate it can't be changed
		//theDroolsFactoryImpl.freeze(); //FB do we need to freeze / should we freeze ????

		return instance;
	}
  
	private boolean isCreated = false;

	public void createMetaData()
	{
		if (isCreated) return;
		isCreated = true;	

		// Create types and their properties
		decisionRequestTypeType = createType(false, DECISION_REQUEST_TYPE);
		decisionResponseTypeType = createType(false, DECISION_RESPONSE_TYPE);
		manageResponseTypeType = createType(false, MANAGE_RESPONSE_TYPE);
		createProperty(true, manageResponseTypeType,ManageResponseTypeImpl._INTERNAL_RESULT_CODE); 
		createProperty(true, manageResponseTypeType,ManageResponseTypeImpl._INTERNAL_RESULT); 
		createProperty(true, manageResponseTypeType,ManageResponseTypeImpl._INTERNAL_COMMENT); 
		manageServiceTypeType = createType(false, MANAGE_SERVICE_TYPE);

		// Create data types
		resultType = createType(true, RESULT );
	}
	
	private boolean isInitialized = false;

	public void initializeMetaData()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Obtain other dependent packages
		ModelFactoryImpl theModelPackageImpl = (ModelFactoryImpl)ModelFactoryImpl.init();
		Property property = null;

		// Add supertypes to types

		// Initialize types and properties
		initializeType(decisionRequestTypeType, DecisionRequestType.class, "DecisionRequestType", true);
		initializeType(decisionResponseTypeType, DecisionResponseType.class, "DecisionResponseType", true);
		initializeType(manageResponseTypeType, ManageResponseType.class, "ManageResponseType", false);
		property = getLocalProperty(manageResponseTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getInt(), "ResultCode", null, 1, 1, ManageResponseType.class, false, false, false);

		property = getLocalProperty(manageResponseTypeType, 1);
		initializeProperty(property, this.getResult(), "Result", null, 1, 1, ManageResponseType.class, false, false, false);

		property = getLocalProperty(manageResponseTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "Comment", null, 0, 1, ManageResponseType.class, false, false, false);

		initializeType(manageServiceTypeType, ManageServiceType.class, "ManageServiceType", false);
		// Initialize data types
		initializeType(resultType, String.class, "Result", true, false);

		createXSDMetaData(theModelPackageImpl);
	}
	  
	protected void createXSDMetaData(ModelFactoryImpl theModelPackageImpl)
	{
		super.initXSD();
		
		Property property = null;
		

		addXSDMapping
		  (decisionRequestTypeType,
			 new String[] 
			 {
			 "name", "DecisionRequestType",
			 "kind", "empty"
			 });

		addXSDMapping
		  (decisionResponseTypeType,
			 new String[] 
			 {
			 "name", "DecisionResponseType",
			 "kind", "empty"
			 });

		property = createGlobalProperty
		  ("DecisionRequest",
		  this.getDecisionRequestType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "DecisionRequest",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("DecisionResponse",
		  this.getDecisionResponseType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "DecisionResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("ManageResponse",
		  this.getManageResponseType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ManageResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("ManageService",
		  this.getManageServiceType(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ManageService",
			 "namespace", "##targetNamespace"
			 });
                
		addXSDMapping
		  (manageResponseTypeType,
			 new String[] 
			 {
			 "name", "ManageResponseType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(manageResponseTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ResultCode"
			 });

		addXSDMapping
			(getLocalProperty(manageResponseTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Result"
			 });

		addXSDMapping
			(getLocalProperty(manageResponseTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Comment"
			 });

		addXSDMapping
		  (manageServiceTypeType,
			 new String[] 
			 {
			 "name", "ManageServiceType",
			 "kind", "empty"
			 });

		addXSDMapping
		  (resultType,
			 new String[] 
			 {
			 "name", "Result_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "SUCCESS FAILURE"
			 });

  }
    
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createResultFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

} //DroolsFactoryImpl

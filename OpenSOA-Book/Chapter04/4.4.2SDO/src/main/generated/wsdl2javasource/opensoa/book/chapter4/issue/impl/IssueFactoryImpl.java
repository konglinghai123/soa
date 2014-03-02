/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.book.chapter4.issue.impl;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;
import org.apache.tuscany.sdo.helper.TypeHelperImpl;

import commonj.sdo.DataObject;
import commonj.sdo.Property;
import commonj.sdo.Type;

import opensoa.book.chapter4.issue.*;

import org.apache.tuscany.sdo.impl.FactoryBase;

import org.apache.tuscany.sdo.model.ModelFactory;

import org.apache.tuscany.sdo.model.impl.ModelFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * Generator information:
 * patternVersion=1.2; -noContainment -noUnsettable
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueFactoryImpl extends FactoryBase implements IssueFactory
{

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_URI = "http://chapter4.book.opensoa/issue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_PREFIX = "issue";

	/**
	 * The version of the generator pattern used to generate this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String PATTERN_VERSION = "1.2";
	
	public static final int CCS_TYPE = 1;	
	public static final int CREATE_TICKET = 2;	
	public static final int HEADER_TYPE = 3;	
	public static final int PROBLEM_TYPE = 4;	
	public static final int CATEGORY = 5;	
	public static final int SEVERITY = 6;
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueFactoryImpl()
	{
		super(NAMESPACE_URI, NAMESPACE_PREFIX, "opensoa.book.chapter4.issue");
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
			case CCS_TYPE: return (DataObject)createCcsType();
			case CREATE_TICKET: return (DataObject)createcreateTicket();
			case HEADER_TYPE: return (DataObject)createHeaderType();
			case PROBLEM_TYPE: return (DataObject)createProblemType();
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
			case CATEGORY:
				return createcategoryFromString(initialValue);
			case SEVERITY:
				return createseverityFromString(initialValue);
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
			case CATEGORY:
				return convertcategoryToString(instanceValue);
			case SEVERITY:
				return convertseverityToString(instanceValue);
			default:
				throw new IllegalArgumentException("The type number '" + typeNumber + "' is not a valid datatype");
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcsType createCcsType()
	{
		CcsTypeImpl ccsType = new CcsTypeImpl();
		return ccsType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public createTicket createcreateTicket()
	{
		createTicketImpl createTicket = new createTicketImpl();
		return createTicket;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType createHeaderType()
	{
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemType createProblemType()
	{
		ProblemTypeImpl problemType = new ProblemTypeImpl();
		return problemType;
	}
	
	// Following creates and initializes SDO metadata for the supported types.		
	protected Type ccsTypeType = null;

	public Type getCcsType()
	{
		return ccsTypeType;
	}
		
	protected Type createTicketType = null;

	public Type getcreateTicket()
	{
		return createTicketType;
	}
			
	protected Type headerTypeType = null;

	public Type getHeaderType()
	{
		return headerTypeType;
	}
		
	protected Type problemTypeType = null;

	public Type getProblemType()
	{
		return problemTypeType;
	}
		
	protected Type categoryType = null;

	public Type getcategory()
	{
		return categoryType;
	}
		
	protected Type severityType = null;

	public Type getseverity()
	{
		return severityType;
	}
	

	private static IssueFactoryImpl instance = null; 
	public static IssueFactoryImpl init()
	{
		if (instance != null ) return instance;
		instance = new IssueFactoryImpl();

		// Create package meta-data objects
		instance.createMetaData();

		// Initialize created meta-data
		instance.initializeMetaData();
		
		// Mark meta-data to indicate it can't be changed
		//theIssueFactoryImpl.freeze(); //FB do we need to freeze / should we freeze ????

		return instance;
	}
  
	private boolean isCreated = false;

	public void createMetaData()
	{
		if (isCreated) return;
		isCreated = true;	

		// Create types and their properties
		ccsTypeType = createType(false, CCS_TYPE);
		createProperty(true, ccsTypeType,CcsTypeImpl._INTERNAL_CC); 
		createTicketType = createType(false, CREATE_TICKET);
		createProperty(false, createTicketType,createTicketImpl._INTERNAL_PROBLEM); 
		headerTypeType = createType(false, HEADER_TYPE);
		createProperty(true, headerTypeType,HeaderTypeImpl._INTERNAL_FROM); 
		createProperty(true, headerTypeType,HeaderTypeImpl._INTERNAL_SUBJECT); 
		createProperty(true, headerTypeType,HeaderTypeImpl._INTERNAL_TO); 
		createProperty(false, headerTypeType,HeaderTypeImpl._INTERNAL_CCS); 
		createProperty(true, headerTypeType,HeaderTypeImpl._INTERNAL_CREATION_DATE); 
		problemTypeType = createType(false, PROBLEM_TYPE);
		createProperty(false, problemTypeType,ProblemTypeImpl._INTERNAL_HEADER); 
		createProperty(true, problemTypeType,ProblemTypeImpl._INTERNAL_DESCRIPTION); 
		createProperty(true, problemTypeType,ProblemTypeImpl._INTERNAL_SEVERITY); 
		createProperty(true, problemTypeType,ProblemTypeImpl._INTERNAL_CATEGORY); 
		createProperty(true, problemTypeType,ProblemTypeImpl._INTERNAL_SUBCATEGORY); 

		// Create data types
		categoryType = createType(true, CATEGORY );
		severityType = createType(true, SEVERITY );
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
		initializeType(ccsTypeType, CcsType.class, "CcsType", false);
		property = getLocalProperty(ccsTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "CC", null, 0, -1, CcsType.class, false, false, false);

		initializeType(createTicketType, createTicket.class, "createTicket", false);
		property = getLocalProperty(createTicketType, 0);
		initializeProperty(property, this.getProblemType(), "Problem", null, 1, 1, createTicket.class, false, false, false, true , null);

		initializeType(headerTypeType, HeaderType.class, "HeaderType", false);
		property = getLocalProperty(headerTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "From", null, 1, 1, HeaderType.class, false, false, false);

		property = getLocalProperty(headerTypeType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "Subject", null, 1, 1, HeaderType.class, false, false, false);

		property = getLocalProperty(headerTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "To", null, 1, 1, HeaderType.class, false, false, false);

		property = getLocalProperty(headerTypeType, 3);
		initializeProperty(property, this.getCcsType(), "Ccs", null, 1, 1, HeaderType.class, false, false, false, true , null);

		property = getLocalProperty(headerTypeType, 4);
		initializeProperty(property, theModelPackageImpl.getDateTime(), "CreationDate", null, 1, 1, HeaderType.class, false, false, false);

		initializeType(problemTypeType, ProblemType.class, "ProblemType", false);
		property = getLocalProperty(problemTypeType, 0);
		initializeProperty(property, this.getHeaderType(), "Header", null, 1, 1, ProblemType.class, false, false, false, true , null);

		property = getLocalProperty(problemTypeType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "Description", null, 1, 1, ProblemType.class, false, false, false);

		property = getLocalProperty(problemTypeType, 2);
		initializeProperty(property, this.getseverity(), "severity", "low", 0, 1, ProblemType.class, false, false, false);

		property = getLocalProperty(problemTypeType, 3);
		initializeProperty(property, this.getcategory(), "category", null, 1, 1, ProblemType.class, false, false, false);

		property = getLocalProperty(problemTypeType, 4);
		initializeProperty(property, theModelPackageImpl.getString(), "subcategory", null, 0, 1, ProblemType.class, false, false, false);

		// Initialize data types
		initializeType(categoryType, String.class, "category", true, false);

		initializeType(severityType, String.class, "severity", true, false);

		createXSDMetaData(theModelPackageImpl);
	}
	  
	protected void createXSDMetaData(ModelFactoryImpl theModelPackageImpl)
	{
		super.initXSD();
		
		Property property = null;
		

		addXSDMapping
		  (ccsTypeType,
			 new String[] 
			 {
			 "name", "CcsType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(ccsTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "CC",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (createTicketType,
			 new String[] 
			 {
			 "name", "createTicket_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(createTicketType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Problem",
			 "namespace", "##targetNamespace"
			 });

		property = createGlobalProperty
		  ("createTicket",
		  this.getcreateTicket(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "createTicket",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("Response",
		  theModelPackageImpl.getInt(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Response",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		addXSDMapping
		  (headerTypeType,
			 new String[] 
			 {
			 "name", "HeaderType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(headerTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "From",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Subject",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "To",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerTypeType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Ccs",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerTypeType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "CreationDate",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (problemTypeType,
			 new String[] 
			 {
			 "name", "ProblemType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(problemTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Header",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(problemTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(problemTypeType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "severity"
			 });

		addXSDMapping
			(getLocalProperty(problemTypeType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "category"
			 });

		addXSDMapping
			(getLocalProperty(problemTypeType, 4),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "subcategory"
			 });

		addXSDMapping
		  (categoryType,
			 new String[] 
			 {
			 "name", "category_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "software systems customer"
			 });

		addXSDMapping
		  (severityType,
			 new String[] 
			 {
			 "name", "severity_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "low medium high"
			 });

  }
    
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createcategoryFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcategoryToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createseverityFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertseverityToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

} //IssueFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.salesorder.impl;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;
import org.apache.tuscany.sdo.helper.TypeHelperImpl;

import commonj.sdo.DataObject;
import commonj.sdo.Property;
import commonj.sdo.Type;

import opensoa.drools.salesorder.*;

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
public class SalesorderFactoryImpl extends FactoryBase implements SalesorderFactory
{

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_URI = "urn:opensoa.drools.salesorder";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_PREFIX = "salesorder";

	/**
	 * The version of the generator pattern used to generate this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String PATTERN_VERSION = "1.2";
	
	public static final int HEADER = 1;	
	public static final int LINES = 2;	
	public static final int ORDER = 3;	
	public static final int PRICE_CALCULATOR_REQUEST = 4;	
	public static final int PRICE_CALCULATOR_RESPONSE = 5;	
	public static final int PRODUCT = 6;	
	public static final int SHIPPING = 7;	
	public static final int CARRIER = 8;	
	public static final int CURRENCY = 9;	
	public static final int METHOD = 10;
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesorderFactoryImpl()
	{
		super(NAMESPACE_URI, NAMESPACE_PREFIX, "opensoa.drools.salesorder");
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
			case HEADER: return (DataObject)createheader();
			case LINES: return (DataObject)createlines();
			case ORDER: return (DataObject)createOrder();
			case PRICE_CALCULATOR_REQUEST: return (DataObject)createPriceCalculatorRequest();
			case PRICE_CALCULATOR_RESPONSE: return (DataObject)createPriceCalculatorResponse();
			case PRODUCT: return (DataObject)createproduct();
			case SHIPPING: return (DataObject)createshipping();
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
			case CARRIER:
				return createcarrierFromString(initialValue);
			case CURRENCY:
				return createcurrencyFromString(initialValue);
			case METHOD:
				return createmethodFromString(initialValue);
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
			case CARRIER:
				return convertcarrierToString(instanceValue);
			case CURRENCY:
				return convertcurrencyToString(instanceValue);
			case METHOD:
				return convertmethodToString(instanceValue);
			default:
				throw new IllegalArgumentException("The type number '" + typeNumber + "' is not a valid datatype");
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public header createheader()
	{
		headerImpl header = new headerImpl();
		return header;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lines createlines()
	{
		linesImpl lines = new linesImpl();
		return lines;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder()
	{
		OrderImpl order = new OrderImpl();
		return order;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceCalculatorRequest createPriceCalculatorRequest()
	{
		PriceCalculatorRequestImpl priceCalculatorRequest = new PriceCalculatorRequestImpl();
		return priceCalculatorRequest;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceCalculatorResponse createPriceCalculatorResponse()
	{
		PriceCalculatorResponseImpl priceCalculatorResponse = new PriceCalculatorResponseImpl();
		return priceCalculatorResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public product createproduct()
	{
		productImpl product = new productImpl();
		return product;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public shipping createshipping()
	{
		shippingImpl shipping = new shippingImpl();
		return shipping;
	}
	
	// Following creates and initializes SDO metadata for the supported types.			
	protected Type headerType = null;

	public Type getheader()
	{
		return headerType;
	}
		
	protected Type linesType = null;

	public Type getlines()
	{
		return linesType;
	}
		
	protected Type orderType = null;

	public Type getOrder()
	{
		return orderType;
	}
		
	protected Type priceCalculatorRequestType = null;

	public Type getPriceCalculatorRequest()
	{
		return priceCalculatorRequestType;
	}
		
	protected Type priceCalculatorResponseType = null;

	public Type getPriceCalculatorResponse()
	{
		return priceCalculatorResponseType;
	}
		
	protected Type productType = null;

	public Type getproduct()
	{
		return productType;
	}
		
	protected Type shippingType = null;

	public Type getshipping()
	{
		return shippingType;
	}
		
	protected Type carrierType = null;

	public Type getcarrier()
	{
		return carrierType;
	}
		
	protected Type currencyType = null;

	public Type getcurrency()
	{
		return currencyType;
	}
		
	protected Type methodType = null;

	public Type getmethod()
	{
		return methodType;
	}
	

	private static SalesorderFactoryImpl instance = null; 
	public static SalesorderFactoryImpl init()
	{
		if (instance != null ) return instance;
		instance = new SalesorderFactoryImpl();

		// Create package meta-data objects
		instance.createMetaData();

		// Initialize created meta-data
		instance.initializeMetaData();
		
		// Mark meta-data to indicate it can't be changed
		//theSalesorderFactoryImpl.freeze(); //FB do we need to freeze / should we freeze ????

		return instance;
	}
  
	private boolean isCreated = false;

	public void createMetaData()
	{
		if (isCreated) return;
		isCreated = true;	

		// Create types and their properties
		headerType = createType(false, HEADER);
		createProperty(true, headerType,headerImpl._INTERNAL_ORDER_ID); 
		createProperty(true, headerType,headerImpl._INTERNAL_PARTY_ID); 
		createProperty(true, headerType,headerImpl._INTERNAL_PARTY_CONTACT_ID); 
		createProperty(true, headerType,headerImpl._INTERNAL_CURRENCY); 
		createProperty(false, headerType,headerImpl._INTERNAL_SHIPPING); 
		linesType = createType(false, LINES);
		createProperty(false, linesType,linesImpl._INTERNAL_PRODUCT); 
		orderType = createType(false, ORDER);
		createProperty(false, orderType,OrderImpl._INTERNAL_HEADER); 
		createProperty(false, orderType,OrderImpl._INTERNAL_LINES); 
		priceCalculatorRequestType = createType(false, PRICE_CALCULATOR_REQUEST);
		createProperty(false, priceCalculatorRequestType,PriceCalculatorRequestImpl._INTERNAL_ORDER); 
		priceCalculatorResponseType = createType(false, PRICE_CALCULATOR_RESPONSE);
		createProperty(true, priceCalculatorResponseType,PriceCalculatorResponseImpl._INTERNAL_ORDER_ID); 
		createProperty(true, priceCalculatorResponseType,PriceCalculatorResponseImpl._INTERNAL_SALE_PRICE); 
		createProperty(true, priceCalculatorResponseType,PriceCalculatorResponseImpl._INTERNAL_SHIPPING_PRICE); 
		createProperty(true, priceCalculatorResponseType,PriceCalculatorResponseImpl._INTERNAL_TOTAL_PRICE); 
		createProperty(true, priceCalculatorResponseType,PriceCalculatorResponseImpl._INTERNAL_COMMENTS); 
		createProperty(true, priceCalculatorResponseType,PriceCalculatorResponseImpl._INTERNAL_CURRENCY); 
		productType = createType(false, PRODUCT);
		createProperty(true, productType,productImpl._INTERNAL_LINE_ID); 
		createProperty(true, productType,productImpl._INTERNAL_PRODUCT_ID); 
		createProperty(true, productType,productImpl._INTERNAL_CNT); 
		shippingType = createType(false, SHIPPING);
		createProperty(true, shippingType,shippingImpl._INTERNAL_CARRIER); 
		createProperty(true, shippingType,shippingImpl._INTERNAL_METHOD); 

		// Create data types
		carrierType = createType(true, CARRIER );
		currencyType = createType(true, CURRENCY );
		methodType = createType(true, METHOD );
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
		initializeType(headerType, header.class, "header", false);
		property = getLocalProperty(headerType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "orderId", null, 1, 1, header.class, false, false, false);

		property = getLocalProperty(headerType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "partyId", null, 1, 1, header.class, false, false, false);

		property = getLocalProperty(headerType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "partyContactId", null, 1, 1, header.class, false, false, false);

		property = getLocalProperty(headerType, 3);
		initializeProperty(property, this.getcurrency(), "currency", null, 1, 1, header.class, false, false, false);

		property = getLocalProperty(headerType, 4);
		initializeProperty(property, this.getshipping(), "shipping", null, 1, 1, header.class, false, false, false, true , null);

		initializeType(linesType, lines.class, "lines", false);
		property = getLocalProperty(linesType, 0);
		initializeProperty(property, this.getproduct(), "product", null, 1, -1, lines.class, false, false, false, true , null);

		initializeType(orderType, Order.class, "Order", false);
		property = getLocalProperty(orderType, 0);
		initializeProperty(property, this.getheader(), "header", null, 1, 1, Order.class, false, false, false, true , null);

		property = getLocalProperty(orderType, 1);
		initializeProperty(property, this.getlines(), "lines", null, 1, 1, Order.class, false, false, false, true , null);

		initializeType(priceCalculatorRequestType, PriceCalculatorRequest.class, "PriceCalculatorRequest", false);
		property = getLocalProperty(priceCalculatorRequestType, 0);
		initializeProperty(property, this.getOrder(), "Order", null, 1, 1, PriceCalculatorRequest.class, false, false, false, true , null);

		initializeType(priceCalculatorResponseType, PriceCalculatorResponse.class, "PriceCalculatorResponse", false);
		property = getLocalProperty(priceCalculatorResponseType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "orderId", null, 1, 1, PriceCalculatorResponse.class, false, false, false);

		property = getLocalProperty(priceCalculatorResponseType, 1);
		initializeProperty(property, theModelPackageImpl.getFloat(), "salePrice", null, 1, 1, PriceCalculatorResponse.class, false, false, false);

		property = getLocalProperty(priceCalculatorResponseType, 2);
		initializeProperty(property, theModelPackageImpl.getFloat(), "shippingPrice", null, 1, 1, PriceCalculatorResponse.class, false, false, false);

		property = getLocalProperty(priceCalculatorResponseType, 3);
		initializeProperty(property, theModelPackageImpl.getFloat(), "totalPrice", null, 1, 1, PriceCalculatorResponse.class, false, false, false);

		property = getLocalProperty(priceCalculatorResponseType, 4);
		initializeProperty(property, theModelPackageImpl.getString(), "comments", null, 1, 1, PriceCalculatorResponse.class, false, false, false);

		property = getLocalProperty(priceCalculatorResponseType, 5);
		initializeProperty(property, theModelPackageImpl.getString(), "currency", null, 1, 1, PriceCalculatorResponse.class, false, false, false);

		initializeType(productType, product.class, "product", false);
		property = getLocalProperty(productType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "lineId", null, 1, 1, product.class, false, false, false);

		property = getLocalProperty(productType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "productId", null, 1, 1, product.class, false, false, false);

		property = getLocalProperty(productType, 2);
		initializeProperty(property, theModelPackageImpl.getInt(), "cnt", null, 1, 1, product.class, false, false, false);

		initializeType(shippingType, shipping.class, "shipping", false);
		property = getLocalProperty(shippingType, 0);
		initializeProperty(property, this.getcarrier(), "carrier", null, 1, 1, shipping.class, false, false, false);

		property = getLocalProperty(shippingType, 1);
		initializeProperty(property, this.getmethod(), "method", null, 1, 1, shipping.class, false, false, false);

		// Initialize data types
		initializeType(carrierType, String.class, "carrier", true, false);

		initializeType(currencyType, String.class, "currency", true, false);

		initializeType(methodType, String.class, "method", true, false);

		createXSDMetaData(theModelPackageImpl);
	}
	  
	protected void createXSDMetaData(ModelFactoryImpl theModelPackageImpl)
	{
		super.initXSD();
		
		Property property = null;
		

		property = createGlobalProperty
		  ("carrier",
		  this.getcarrier(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "carrier",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("cnt",
		  theModelPackageImpl.getInt(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "cnt",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("currency",
		  this.getcurrency(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "currency",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("header",
		  this.getheader(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "header",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("lineId",
		  theModelPackageImpl.getString(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "lineId",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("lines",
		  this.getlines(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "lines",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("method",
		  this.getmethod(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "method",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("Order",
		  this.getOrder(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Order",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("orderId",
		  theModelPackageImpl.getString(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "orderId",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("partyContactId",
		  theModelPackageImpl.getString(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "partyContactId",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("partyId",
		  theModelPackageImpl.getString(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "partyId",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("product",
		  this.getproduct(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "product",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("productId",
		  theModelPackageImpl.getString(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "productId",
			 "namespace", "##targetNamespace"
			 },
			 IS_ATTRIBUTE);
                
		property = createGlobalProperty
		  ("shipping",
		  this.getshipping(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "shipping",
			 "namespace", "##targetNamespace"
			 });
                
		addXSDMapping
		  (headerType,
			 new String[] 
			 {
			 "name", "header_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(headerType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "orderId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "partyId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "partyContactId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "currency",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(headerType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "shipping",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (linesType,
			 new String[] 
			 {
			 "name", "lines_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(linesType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "product",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (orderType,
			 new String[] 
			 {
			 "name", "Order_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(orderType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "header",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(orderType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "lines",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (priceCalculatorRequestType,
			 new String[] 
			 {
			 "name", "PriceCalculatorRequest",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(priceCalculatorRequestType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Order",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (priceCalculatorResponseType,
			 new String[] 
			 {
			 "name", "PriceCalculatorResponse",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(priceCalculatorResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "orderId"
			 });

		addXSDMapping
			(getLocalProperty(priceCalculatorResponseType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "salePrice"
			 });

		addXSDMapping
			(getLocalProperty(priceCalculatorResponseType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "shippingPrice"
			 });

		addXSDMapping
			(getLocalProperty(priceCalculatorResponseType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "totalPrice"
			 });

		addXSDMapping
			(getLocalProperty(priceCalculatorResponseType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "comments"
			 });

		addXSDMapping
			(getLocalProperty(priceCalculatorResponseType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "currency"
			 });

		addXSDMapping
		  (productType,
			 new String[] 
			 {
			 "name", "product_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(productType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "lineId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(productType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "productId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(productType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "cnt",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (shippingType,
			 new String[] 
			 {
			 "name", "shipping_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(shippingType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "carrier",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(shippingType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "method",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (carrierType,
			 new String[] 
			 {
			 "name", "carrier_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "USPS Company _NA_ DHL"
			 });

		addXSDMapping
		  (currencyType,
			 new String[] 
			 {
			 "name", "currency_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "EUR USD"
			 });

		addXSDMapping
		  (methodType,
			 new String[] 
			 {
			 "name", "method_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "STANDARD LOCAL_DELIVERY EXPRESS GROUND AIR NEXT_DAY NO_SHIPPING NEXT_PM SECOND_DAY"
			 });

  }
    
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createcarrierFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcarrierToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createcurrencyFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcurrencyToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createmethodFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmethodToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

} //SalesorderFactoryImpl

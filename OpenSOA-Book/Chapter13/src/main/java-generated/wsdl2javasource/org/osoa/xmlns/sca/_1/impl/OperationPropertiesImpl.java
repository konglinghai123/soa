/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Type;

import java.util.Collection;
import java.util.List;

import org.apache.tuscany.sdo.impl.DataObjectBase;

import org.osoa.xmlns.sca._1.Headers;
import org.osoa.xmlns.sca._1.OperationProperties;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.OperationPropertiesImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.OperationPropertiesImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.OperationPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.OperationPropertiesImpl#getNativeOperation <em>Native Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationPropertiesImpl extends DataObjectBase implements OperationProperties
{

	public final static int PROPERTY = 0;

	public final static int HEADERS = 1;

	public final static int NAME = 2;

	public final static int NATIVE_OPERATION = 3;

	public final static int SDO_PROPERTY_COUNT = 4;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Property</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROPERTY = 0;

	/**
	 * The internal feature id for the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HEADERS = 1;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 2;

	/**
	 * The internal feature id for the '<em><b>Native Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NATIVE_OPERATION = 3;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 4;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_PROPERTY: return PROPERTY;
			case _INTERNAL_HEADERS: return HEADERS;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_NATIVE_OPERATION: return NATIVE_OPERATION;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	
	protected List property = null;
	
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_DEFAULT_;

	/**
	 * The default value of the '{@link #getNativeOperation() <em>Native Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIVE_OPERATION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getNativeOperation() <em>Native Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeOperation()
	 * @generated
	 * @ordered
	 */
	protected String nativeOperation = NATIVE_OPERATION_DEFAULT_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPropertiesImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getOperationProperties();
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
	public List getProperty()
	{
		if (property == null)
		{
		  property = createPropertyList(ListKind.DATATYPE, String.class, PROPERTY, 0);
		}
		return property;
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
	public String getName()
	{
		return name;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_NAME, oldName, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNativeOperation()
	{
		return nativeOperation;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNativeOperation(String newNativeOperation)
	{
		String oldNativeOperation = nativeOperation;
		nativeOperation = newNativeOperation;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_NATIVE_OPERATION, oldNativeOperation, nativeOperation);
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
			case PROPERTY:
				return getProperty();
			case HEADERS:
				return getHeaders();
			case NAME:
				return getName();
			case NATIVE_OPERATION:
				return getNativeOperation();
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
			case PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection)newValue);
				return;
			case HEADERS:
				setHeaders((Headers)newValue);
				return;
			case NAME:
				setName((String)newValue);
				return;
			case NATIVE_OPERATION:
				setNativeOperation((String)newValue);
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
			case PROPERTY:
				getProperty().clear();
				return;
			case HEADERS:
				setHeaders((Headers)null);
				return;
			case NAME:
				setName(NAME_DEFAULT_);
				return;
			case NATIVE_OPERATION:
				setNativeOperation(NATIVE_OPERATION_DEFAULT_);
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
			case PROPERTY:
				return property != null && !property.isEmpty();
			case HEADERS:
				return headers != null;
			case NAME:
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
			case NATIVE_OPERATION:
				return NATIVE_OPERATION_DEFAULT_ == null ? nativeOperation != null : !NATIVE_OPERATION_DEFAULT_.equals(nativeOperation);
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
		result.append(" (property: ");
		result.append(property);
		result.append(", name: ");
		result.append(name);
		result.append(", nativeOperation: ");
		result.append(nativeOperation);
		result.append(')');
		return result.toString();
	}

} //OperationPropertiesImpl

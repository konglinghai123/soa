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
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Headers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.HeadersImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.HeadersImpl#getJMSType <em>JMS Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.HeadersImpl#getJMSCorrelationID <em>JMS Correlation ID</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.HeadersImpl#getJMSDeliveryMode <em>JMS Delivery Mode</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.HeadersImpl#getJMSTimeToLive <em>JMS Time To Live</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.HeadersImpl#getJMSPriority <em>JMS Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadersImpl extends DataObjectBase implements Headers
{

	public final static int PROPERTY = 0;

	public final static int JMS_TYPE = 1;

	public final static int JMS_CORRELATION_ID = 2;

	public final static int JMS_DELIVERY_MODE = 3;

	public final static int JMS_TIME_TO_LIVE = 4;

	public final static int JMS_PRIORITY = 5;

	public final static int SDO_PROPERTY_COUNT = 6;

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
	 * The internal feature id for the '<em><b>JMS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_JMS_TYPE = 1;

	/**
	 * The internal feature id for the '<em><b>JMS Correlation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_JMS_CORRELATION_ID = 2;

	/**
	 * The internal feature id for the '<em><b>JMS Delivery Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_JMS_DELIVERY_MODE = 3;

	/**
	 * The internal feature id for the '<em><b>JMS Time To Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_JMS_TIME_TO_LIVE = 4;

	/**
	 * The internal feature id for the '<em><b>JMS Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_JMS_PRIORITY = 5;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 6;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_PROPERTY: return PROPERTY;
			case _INTERNAL_JMS_TYPE: return JMS_TYPE;
			case _INTERNAL_JMS_CORRELATION_ID: return JMS_CORRELATION_ID;
			case _INTERNAL_JMS_DELIVERY_MODE: return JMS_DELIVERY_MODE;
			case _INTERNAL_JMS_TIME_TO_LIVE: return JMS_TIME_TO_LIVE;
			case _INTERNAL_JMS_PRIORITY: return JMS_PRIORITY;
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
	 * The default value of the '{@link #getJMSType() <em>JMS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSType()
	 * @generated
	 * @ordered
	 */
	protected static final String JMS_TYPE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getJMSType() <em>JMS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSType()
	 * @generated
	 * @ordered
	 */
	protected String jmsType = JMS_TYPE_DEFAULT_;

	/**
	 * The default value of the '{@link #getJMSCorrelationID() <em>JMS Correlation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSCorrelationID()
	 * @generated
	 * @ordered
	 */
	protected static final String JMS_CORRELATION_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getJMSCorrelationID() <em>JMS Correlation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSCorrelationID()
	 * @generated
	 * @ordered
	 */
	protected String jmsCorrelationID = JMS_CORRELATION_ID_DEFAULT_;

	/**
	 * The default value of the '{@link #getJMSDeliveryMode() <em>JMS Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSDeliveryMode()
	 * @generated
	 * @ordered
	 */
	protected static final String JMS_DELIVERY_MODE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getJMSDeliveryMode() <em>JMS Delivery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSDeliveryMode()
	 * @generated
	 * @ordered
	 */
	protected String jmsDeliveryMode = JMS_DELIVERY_MODE_DEFAULT_;

	/**
	 * The default value of the '{@link #getJMSTimeToLive() <em>JMS Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSTimeToLive()
	 * @generated
	 * @ordered
	 */
	protected static final int JMS_TIME_TO_LIVE_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getJMSTimeToLive() <em>JMS Time To Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSTimeToLive()
	 * @generated
	 * @ordered
	 */
	protected int jmsTimeToLive = JMS_TIME_TO_LIVE_DEFAULT_;

	/**
	 * The default value of the '{@link #getJMSPriority() <em>JMS Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String JMS_PRIORITY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getJMSPriority() <em>JMS Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJMSPriority()
	 * @generated
	 * @ordered
	 */
	protected String jmsPriority = JMS_PRIORITY_DEFAULT_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadersImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getHeaders();
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
	public String getJMSType()
	{
		return jmsType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJMSType(String newJMSType)
	{
		String oldJMSType = jmsType;
		jmsType = newJMSType;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_JMS_TYPE, oldJMSType, jmsType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJMSCorrelationID()
	{
		return jmsCorrelationID;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJMSCorrelationID(String newJMSCorrelationID)
	{
		String oldJMSCorrelationID = jmsCorrelationID;
		jmsCorrelationID = newJMSCorrelationID;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_JMS_CORRELATION_ID, oldJMSCorrelationID, jmsCorrelationID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJMSDeliveryMode()
	{
		return jmsDeliveryMode;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJMSDeliveryMode(String newJMSDeliveryMode)
	{
		String oldJMSDeliveryMode = jmsDeliveryMode;
		jmsDeliveryMode = newJMSDeliveryMode;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_JMS_DELIVERY_MODE, oldJMSDeliveryMode, jmsDeliveryMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJMSTimeToLive()
	{
		return jmsTimeToLive;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJMSTimeToLive(int newJMSTimeToLive)
	{
		int oldJMSTimeToLive = jmsTimeToLive;
		jmsTimeToLive = newJMSTimeToLive;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_JMS_TIME_TO_LIVE, oldJMSTimeToLive, jmsTimeToLive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJMSPriority()
	{
		return jmsPriority;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJMSPriority(String newJMSPriority)
	{
		String oldJMSPriority = jmsPriority;
		jmsPriority = newJMSPriority;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_JMS_PRIORITY, oldJMSPriority, jmsPriority);
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
			case JMS_TYPE:
				return getJMSType();
			case JMS_CORRELATION_ID:
				return getJMSCorrelationID();
			case JMS_DELIVERY_MODE:
				return getJMSDeliveryMode();
			case JMS_TIME_TO_LIVE:
				return new Integer(getJMSTimeToLive());
			case JMS_PRIORITY:
				return getJMSPriority();
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
			case JMS_TYPE:
				setJMSType((String)newValue);
				return;
			case JMS_CORRELATION_ID:
				setJMSCorrelationID((String)newValue);
				return;
			case JMS_DELIVERY_MODE:
				setJMSDeliveryMode((String)newValue);
				return;
			case JMS_TIME_TO_LIVE:
				setJMSTimeToLive(((Integer)newValue).intValue());
				return;
			case JMS_PRIORITY:
				setJMSPriority((String)newValue);
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
			case JMS_TYPE:
				setJMSType(JMS_TYPE_DEFAULT_);
				return;
			case JMS_CORRELATION_ID:
				setJMSCorrelationID(JMS_CORRELATION_ID_DEFAULT_);
				return;
			case JMS_DELIVERY_MODE:
				setJMSDeliveryMode(JMS_DELIVERY_MODE_DEFAULT_);
				return;
			case JMS_TIME_TO_LIVE:
				setJMSTimeToLive(JMS_TIME_TO_LIVE_DEFAULT_);
				return;
			case JMS_PRIORITY:
				setJMSPriority(JMS_PRIORITY_DEFAULT_);
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
			case JMS_TYPE:
				return JMS_TYPE_DEFAULT_ == null ? jmsType != null : !JMS_TYPE_DEFAULT_.equals(jmsType);
			case JMS_CORRELATION_ID:
				return JMS_CORRELATION_ID_DEFAULT_ == null ? jmsCorrelationID != null : !JMS_CORRELATION_ID_DEFAULT_.equals(jmsCorrelationID);
			case JMS_DELIVERY_MODE:
				return JMS_DELIVERY_MODE_DEFAULT_ == null ? jmsDeliveryMode != null : !JMS_DELIVERY_MODE_DEFAULT_.equals(jmsDeliveryMode);
			case JMS_TIME_TO_LIVE:
				return jmsTimeToLive != JMS_TIME_TO_LIVE_DEFAULT_;
			case JMS_PRIORITY:
				return JMS_PRIORITY_DEFAULT_ == null ? jmsPriority != null : !JMS_PRIORITY_DEFAULT_.equals(jmsPriority);
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
		result.append(", JMSType: ");
		result.append(jmsType);
		result.append(", JMSCorrelationID: ");
		result.append(jmsCorrelationID);
		result.append(", JMSDeliveryMode: ");
		result.append(jmsDeliveryMode);
		result.append(", JMSTimeToLive: ");
		result.append(jmsTimeToLive);
		result.append(", JMSPriority: ");
		result.append(jmsPriority);
		result.append(')');
		return result.toString();
	}

} //HeadersImpl

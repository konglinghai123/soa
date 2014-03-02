/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Type;

import org.apache.tuscany.sdo.impl.DataObjectBase;

import org.osoa.xmlns.sca._1.ActivationSpec;
import org.osoa.xmlns.sca._1.ConnectionFactory;
import org.osoa.xmlns.sca._1.Destination;
import org.osoa.xmlns.sca._1.Response;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ResponseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ResponseImpl#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.ResponseImpl#getActivationSpec <em>Activation Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseImpl extends DataObjectBase implements Response
{

	public final static int DESTINATION = 0;

	public final static int CONNECTION_FACTORY = 1;

	public final static int ACTIVATION_SPEC = 2;

	public final static int SDO_PROPERTY_COUNT = 3;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DESTINATION = 0;

	/**
	 * The internal feature id for the '<em><b>Connection Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CONNECTION_FACTORY = 1;

	/**
	 * The internal feature id for the '<em><b>Activation Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ACTIVATION_SPEC = 2;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 3;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_DESTINATION: return DESTINATION;
			case _INTERNAL_CONNECTION_FACTORY: return CONNECTION_FACTORY;
			case _INTERNAL_ACTIVATION_SPEC: return ACTIVATION_SPEC;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getResponse();
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
		}
		return super.isSet(propertyIndex);
	}

} //ResponseImpl

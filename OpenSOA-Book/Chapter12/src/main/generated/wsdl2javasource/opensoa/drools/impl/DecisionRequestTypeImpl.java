/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.impl;

import commonj.sdo.Type;

import opensoa.drools.DecisionRequestType;
import opensoa.drools.DroolsFactory;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DecisionRequestTypeImpl extends DataObjectBase implements DecisionRequestType
{

	public final static int SDO_PROPERTY_COUNT = 0;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 0;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionRequestTypeImpl()
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
		return ((DroolsFactoryImpl)DroolsFactory.INSTANCE).getDecisionRequestType();
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

	public static class ConcreteBase extends DecisionRequestTypeImpl
	{
		public ConcreteBase()
		{
			super();
		}
	}
	
} //DecisionRequestTypeImpl

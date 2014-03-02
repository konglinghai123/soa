/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.impl;

import commonj.sdo.Type;

import opensoa.drools.DecisionResponseType;
import opensoa.drools.DroolsFactory;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DecisionResponseTypeImpl extends DataObjectBase implements DecisionResponseType
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
	public DecisionResponseTypeImpl()
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
		return ((DroolsFactoryImpl)DroolsFactory.INSTANCE).getDecisionResponseType();
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

	public static class ConcreteBase extends DecisionResponseTypeImpl
	{
		public ConcreteBase()
		{
			super();
		}
	}
	
} //DecisionResponseTypeImpl

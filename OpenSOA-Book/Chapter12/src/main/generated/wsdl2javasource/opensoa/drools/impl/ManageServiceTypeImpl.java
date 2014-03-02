/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.impl;

import commonj.sdo.Type;

import opensoa.drools.DroolsFactory;
import opensoa.drools.ManageServiceType;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manage Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ManageServiceTypeImpl extends DataObjectBase implements ManageServiceType
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
	public ManageServiceTypeImpl()
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
		return ((DroolsFactoryImpl)DroolsFactory.INSTANCE).getManageServiceType();
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

} //ManageServiceTypeImpl

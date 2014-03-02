/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.salesorder.impl;

import commonj.sdo.Type;

import opensoa.drools.salesorder.SalesorderFactory;
import opensoa.drools.salesorder.product;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opensoa.drools.salesorder.impl.productImpl#getLineId <em>Line Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.productImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link opensoa.drools.salesorder.impl.productImpl#getCnt <em>Cnt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class productImpl extends DataObjectBase implements product
{

	public final static int LINE_ID = 0;

	public final static int PRODUCT_ID = 1;

	public final static int CNT = 2;

	public final static int SDO_PROPERTY_COUNT = 3;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Line Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_LINE_ID = 0;

	/**
	 * The internal feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PRODUCT_ID = 1;

	/**
	 * The internal feature id for the '<em><b>Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CNT = 2;

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
			case _INTERNAL_LINE_ID: return LINE_ID;
			case _INTERNAL_PRODUCT_ID: return PRODUCT_ID;
			case _INTERNAL_CNT: return CNT;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getLineId() <em>Line Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineId()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getLineId() <em>Line Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineId()
	 * @generated
	 * @ordered
	 */
	protected String lineId = LINE_ID_DEFAULT_;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_DEFAULT_;

	/**
	 * The default value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected static final int CNT_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected int cnt = CNT_DEFAULT_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productImpl()
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
		return ((SalesorderFactoryImpl)SalesorderFactory.INSTANCE).getproduct();
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
	public String getLineId()
	{
		return lineId;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineId(String newLineId)
	{
		String oldLineId = lineId;
		lineId = newLineId;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_LINE_ID, oldLineId, lineId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductId()
	{
		return productId;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductId(String newProductId)
	{
		String oldProductId = productId;
		productId = newProductId;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PRODUCT_ID, oldProductId, productId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCnt()
	{
		return cnt;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCnt(int newCnt)
	{
		int oldCnt = cnt;
		cnt = newCnt;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CNT, oldCnt, cnt);
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
			case LINE_ID:
				return getLineId();
			case PRODUCT_ID:
				return getProductId();
			case CNT:
				return new Integer(getCnt());
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
			case LINE_ID:
				setLineId((String)newValue);
				return;
			case PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case CNT:
				setCnt(((Integer)newValue).intValue());
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
			case LINE_ID:
				setLineId(LINE_ID_DEFAULT_);
				return;
			case PRODUCT_ID:
				setProductId(PRODUCT_ID_DEFAULT_);
				return;
			case CNT:
				setCnt(CNT_DEFAULT_);
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
			case LINE_ID:
				return LINE_ID_DEFAULT_ == null ? lineId != null : !LINE_ID_DEFAULT_.equals(lineId);
			case PRODUCT_ID:
				return PRODUCT_ID_DEFAULT_ == null ? productId != null : !PRODUCT_ID_DEFAULT_.equals(productId);
			case CNT:
				return cnt != CNT_DEFAULT_;
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
		result.append(" (lineId: ");
		result.append(lineId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", cnt: ");
		result.append(cnt);
		result.append(')');
		return result.toString();
	}

} //productImpl

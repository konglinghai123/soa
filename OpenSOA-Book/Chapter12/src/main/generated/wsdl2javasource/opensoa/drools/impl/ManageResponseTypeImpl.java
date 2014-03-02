/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.impl;

import commonj.sdo.Type;

import opensoa.drools.DroolsFactory;
import opensoa.drools.ManageResponseType;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manage Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opensoa.drools.impl.ManageResponseTypeImpl#getResultCode <em>Result Code</em>}</li>
 *   <li>{@link opensoa.drools.impl.ManageResponseTypeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link opensoa.drools.impl.ManageResponseTypeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManageResponseTypeImpl extends DataObjectBase implements ManageResponseType
{

	public final static int RESULT_CODE = 0;

	public final static int RESULT = 1;

	public final static int COMMENT = 2;

	public final static int SDO_PROPERTY_COUNT = 3;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_RESULT_CODE = 0;

	/**
	 * The internal feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_RESULT = 1;

	/**
	 * The internal feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_COMMENT = 2;

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
			case _INTERNAL_RESULT_CODE: return RESULT_CODE;
			case _INTERNAL_RESULT: return RESULT;
			case _INTERNAL_COMMENT: return COMMENT;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getResultCode() <em>Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCode()
	 * @generated
	 * @ordered
	 */
	protected static final int RESULT_CODE_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getResultCode() <em>Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCode()
	 * @generated
	 * @ordered
	 */
	protected int resultCode = RESULT_CODE_DEFAULT_;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_DEFAULT_;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_DEFAULT_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManageResponseTypeImpl()
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
		return ((DroolsFactoryImpl)DroolsFactory.INSTANCE).getManageResponseType();
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
	public int getResultCode()
	{
		return resultCode;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultCode(int newResultCode)
	{
		int oldResultCode = resultCode;
		resultCode = newResultCode;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_RESULT_CODE, oldResultCode, resultCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult()
	{
		return result;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult)
	{
		String oldResult = result;
		result = newResult;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_RESULT, oldResult, result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment()
	{
		return comment;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment)
	{
		String oldComment = comment;
		comment = newComment;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_COMMENT, oldComment, comment);
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
			case RESULT_CODE:
				return new Integer(getResultCode());
			case RESULT:
				return getResult();
			case COMMENT:
				return getComment();
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
			case RESULT_CODE:
				setResultCode(((Integer)newValue).intValue());
				return;
			case RESULT:
				setResult((String)newValue);
				return;
			case COMMENT:
				setComment((String)newValue);
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
			case RESULT_CODE:
				setResultCode(RESULT_CODE_DEFAULT_);
				return;
			case RESULT:
				setResult(RESULT_DEFAULT_);
				return;
			case COMMENT:
				setComment(COMMENT_DEFAULT_);
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
			case RESULT_CODE:
				return resultCode != RESULT_CODE_DEFAULT_;
			case RESULT:
				return RESULT_DEFAULT_ == null ? result != null : !RESULT_DEFAULT_.equals(result);
			case COMMENT:
				return COMMENT_DEFAULT_ == null ? comment != null : !COMMENT_DEFAULT_.equals(comment);
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
		result.append(" (ResultCode: ");
		result.append(resultCode);
		result.append(", Result: ");
		result.append(result);
		result.append(", Comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ManageResponseTypeImpl

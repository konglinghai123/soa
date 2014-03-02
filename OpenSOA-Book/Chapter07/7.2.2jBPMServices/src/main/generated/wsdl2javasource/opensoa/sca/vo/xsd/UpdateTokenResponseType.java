/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.sca.vo.xsd;

import commonj.sdo.Type;

import java.io.Serializable;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Token Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenResponseType#isSuccess <em>Success</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class UpdateTokenResponseType extends DataObjectBase implements Serializable
{

	public final static int SUCCESS = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SUCCESS = 0;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 1;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_SUCCESS: return SUCCESS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #isSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUCCESS_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccess()
	 * @generated
	 * @ordered
	 */
	protected boolean success = SUCCESS_DEFAULT_;

	/**
	 * This is true if the Success attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean success_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTokenResponseType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getUpdateTokenResponseType();
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
	 * Returns the value of the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' attribute.
	 * @see #isSetSuccess()
	 * @see #unsetSuccess()
	 * @see #setSuccess(boolean)
	 * @generated
	 */
	public boolean isSuccess()
	{
		return success;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenResponseType#isSuccess <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' attribute.
	 * @see #isSetSuccess()
	 * @see #unsetSuccess()
	 * @see #isSuccess()
	 * @generated
	 */
	public void setSuccess(boolean newSuccess)
	{
		boolean oldSuccess = success;
		success = newSuccess;
		boolean oldSuccess_set_ = success_set_;
		success_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SUCCESS, oldSuccess, success, !oldSuccess_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenResponseType#isSuccess <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuccess()
	 * @see #isSuccess()
	 * @see #setSuccess(boolean)
	 * @generated
	 */
	public void unsetSuccess()
	{
		boolean oldSuccess = success;
		boolean oldSuccess_set_ = success_set_;
		success = SUCCESS_DEFAULT_;
		success_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_SUCCESS, oldSuccess, SUCCESS_DEFAULT_, oldSuccess_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenResponseType#isSuccess <em>Success</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Success</em>' attribute is set.
	 * @see #unsetSuccess()
	 * @see #isSuccess()
	 * @see #setSuccess(boolean)
	 * @generated
	 */
	public boolean isSetSuccess()
	{
		return success_set_;
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
			case SUCCESS:
				return isSuccess() ? Boolean.TRUE : Boolean.FALSE;
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
			case SUCCESS:
				setSuccess(((Boolean)newValue).booleanValue());
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
			case SUCCESS:
				unsetSuccess();
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
			case SUCCESS:
				return isSetSuccess();
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
		result.append(" (success: ");
		if (success_set_) result.append(success); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // UpdateTokenResponseType

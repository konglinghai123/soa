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
 * A representation of the model object '<em><b>update Token Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.updateTokenResponse#getUpdateResponse <em>Update Response</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class updateTokenResponse extends DataObjectBase implements Serializable
{

	public final static int UPDATE_RESPONSE = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Update Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_UPDATE_RESPONSE = 0;

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
			case _INTERNAL_UPDATE_RESPONSE: return UPDATE_RESPONSE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getUpdateResponse() <em>Update Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateResponse()
	 * @generated
	 * @ordered
	 */
	
	protected UpdateTokenResponseType updateResponse = null;
	
	/**
	 * This is true if the Update Response containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateResponse_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public updateTokenResponse()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getupdateTokenResponse();
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
	 * Returns the value of the '<em><b>Update Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Response</em>' containment reference.
	 * @see #isSetUpdateResponse()
	 * @see #unsetUpdateResponse()
	 * @see #setUpdateResponse(UpdateTokenResponseType)
	 * @generated
	 */
	public UpdateTokenResponseType getUpdateResponse()
	{
		return updateResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetUpdateResponse(UpdateTokenResponseType newUpdateResponse, ChangeContext changeContext)
	{
		UpdateTokenResponseType oldUpdateResponse = updateResponse;
		updateResponse = newUpdateResponse;
		boolean oldUpdateResponse_set_ = updateResponse_set_;
		updateResponse_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_UPDATE_RESPONSE, oldUpdateResponse, newUpdateResponse, !oldUpdateResponse_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.updateTokenResponse#getUpdateResponse <em>Update Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Response</em>' containment reference.
	 * @see #isSetUpdateResponse()
	 * @see #unsetUpdateResponse()
	 * @see #getUpdateResponse()
	 * @generated
	 */
	public void setUpdateResponse(UpdateTokenResponseType newUpdateResponse)
	{
		if (newUpdateResponse != updateResponse)
		{
			ChangeContext changeContext = null;
			if (updateResponse != null)
				changeContext = inverseRemove(updateResponse, this, OPPOSITE_FEATURE_BASE - _INTERNAL_UPDATE_RESPONSE, null, changeContext);
			if (newUpdateResponse != null)
				changeContext = inverseAdd(newUpdateResponse, this, OPPOSITE_FEATURE_BASE - _INTERNAL_UPDATE_RESPONSE, null, changeContext);
			changeContext = basicSetUpdateResponse(newUpdateResponse, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldUpdateResponse_set_ = updateResponse_set_;
			updateResponse_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_UPDATE_RESPONSE, newUpdateResponse, newUpdateResponse, !oldUpdateResponse_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetUpdateResponse(ChangeContext changeContext)
	{
		UpdateTokenResponseType oldUpdateResponse = updateResponse;
		updateResponse = null;
		boolean oldUpdateResponse_set_ = updateResponse_set_;
		updateResponse_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_UPDATE_RESPONSE, oldUpdateResponse, null, !oldUpdateResponse_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.updateTokenResponse#getUpdateResponse <em>Update Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateResponse()
	 * @see #getUpdateResponse()
	 * @see #setUpdateResponse(UpdateTokenResponseType)
	 * @generated
	 */
	public void unsetUpdateResponse()
	{
		if (updateResponse != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(updateResponse, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_UPDATE_RESPONSE, null, changeContext);
			changeContext = basicUnsetUpdateResponse(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldUpdateResponse_set_ = updateResponse_set_;
			updateResponse_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_UPDATE_RESPONSE, null, null, oldUpdateResponse_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.updateTokenResponse#getUpdateResponse <em>Update Response</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Response</em>' containment reference is set.
	 * @see #unsetUpdateResponse()
	 * @see #getUpdateResponse()
	 * @see #setUpdateResponse(UpdateTokenResponseType)
	 * @generated
	 */
	public boolean isSetUpdateResponse()
	{
		return updateResponse_set_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext inverseRemove(Object otherEnd, int propertyIndex, ChangeContext changeContext)
	{
		switch (propertyIndex)
		{
			case UPDATE_RESPONSE:
				return basicUnsetUpdateResponse(changeContext);
		}
		return super.inverseRemove(otherEnd, propertyIndex, changeContext);
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
			case UPDATE_RESPONSE:
				return getUpdateResponse();
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
			case UPDATE_RESPONSE:
				setUpdateResponse((UpdateTokenResponseType)newValue);
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
			case UPDATE_RESPONSE:
				unsetUpdateResponse();
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
			case UPDATE_RESPONSE:
				return isSetUpdateResponse();
		}
		return super.isSet(propertyIndex);
	}

} // updateTokenResponse

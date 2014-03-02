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
 * A representation of the model object '<em><b>update Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.updateToken#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class updateToken extends DataObjectBase implements Serializable
{

	public final static int TOKEN = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOKEN = 0;

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
			case _INTERNAL_TOKEN: return TOKEN;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	
	protected UpdateTokenRequest token = null;
	
	/**
	 * This is true if the Token containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean token_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public updateToken()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getupdateToken();
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
	 * Returns the value of the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference.
	 * @see #isSetToken()
	 * @see #unsetToken()
	 * @see #setToken(UpdateTokenRequest)
	 * @generated
	 */
	public UpdateTokenRequest getToken()
	{
		return token;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetToken(UpdateTokenRequest newToken, ChangeContext changeContext)
	{
		UpdateTokenRequest oldToken = token;
		token = newToken;
		boolean oldToken_set_ = token_set_;
		token_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_TOKEN, oldToken, newToken, !oldToken_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.updateToken#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' containment reference.
	 * @see #isSetToken()
	 * @see #unsetToken()
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(UpdateTokenRequest newToken)
	{
		if (newToken != token)
		{
			ChangeContext changeContext = null;
			if (token != null)
				changeContext = inverseRemove(token, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN, null, changeContext);
			if (newToken != null)
				changeContext = inverseAdd(newToken, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN, null, changeContext);
			changeContext = basicSetToken(newToken, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldToken_set_ = token_set_;
			token_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_TOKEN, newToken, newToken, !oldToken_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetToken(ChangeContext changeContext)
	{
		UpdateTokenRequest oldToken = token;
		token = null;
		boolean oldToken_set_ = token_set_;
		token_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_TOKEN, oldToken, null, !oldToken_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.updateToken#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToken()
	 * @see #getToken()
	 * @see #setToken(UpdateTokenRequest)
	 * @generated
	 */
	public void unsetToken()
	{
		if (token != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(token, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN, null, changeContext);
			changeContext = basicUnsetToken(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldToken_set_ = token_set_;
			token_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_TOKEN, null, null, oldToken_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.updateToken#getToken <em>Token</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token</em>' containment reference is set.
	 * @see #unsetToken()
	 * @see #getToken()
	 * @see #setToken(UpdateTokenRequest)
	 * @generated
	 */
	public boolean isSetToken()
	{
		return token_set_;
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
			case TOKEN:
				return basicUnsetToken(changeContext);
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
			case TOKEN:
				return getToken();
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
			case TOKEN:
				setToken((UpdateTokenRequest)newValue);
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
			case TOKEN:
				unsetToken();
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
			case TOKEN:
				return isSetToken();
		}
		return super.isSet(propertyIndex);
	}

} // updateToken

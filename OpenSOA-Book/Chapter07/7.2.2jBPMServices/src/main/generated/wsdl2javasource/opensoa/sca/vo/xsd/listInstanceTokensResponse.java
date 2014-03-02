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
 * A representation of the model object '<em><b>list Instance Tokens Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.listInstanceTokensResponse#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class listInstanceTokensResponse extends DataObjectBase implements Serializable
{

	public final static int TOKENS = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOKENS = 0;

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
			case _INTERNAL_TOKENS: return TOKENS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	
	protected TokensType tokens = null;
	
	/**
	 * This is true if the Tokens containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokens_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listInstanceTokensResponse()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getlistInstanceTokensResponse();
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
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference.
	 * @see #isSetTokens()
	 * @see #unsetTokens()
	 * @see #setTokens(TokensType)
	 * @generated
	 */
	public TokensType getTokens()
	{
		return tokens;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetTokens(TokensType newTokens, ChangeContext changeContext)
	{
		TokensType oldTokens = tokens;
		tokens = newTokens;
		boolean oldTokens_set_ = tokens_set_;
		tokens_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_TOKENS, oldTokens, newTokens, !oldTokens_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTokensResponse#getTokens <em>Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' containment reference.
	 * @see #isSetTokens()
	 * @see #unsetTokens()
	 * @see #getTokens()
	 * @generated
	 */
	public void setTokens(TokensType newTokens)
	{
		if (newTokens != tokens)
		{
			ChangeContext changeContext = null;
			if (tokens != null)
				changeContext = inverseRemove(tokens, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKENS, null, changeContext);
			if (newTokens != null)
				changeContext = inverseAdd(newTokens, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKENS, null, changeContext);
			changeContext = basicSetTokens(newTokens, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldTokens_set_ = tokens_set_;
			tokens_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_TOKENS, newTokens, newTokens, !oldTokens_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetTokens(ChangeContext changeContext)
	{
		TokensType oldTokens = tokens;
		tokens = null;
		boolean oldTokens_set_ = tokens_set_;
		tokens_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_TOKENS, oldTokens, null, !oldTokens_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTokensResponse#getTokens <em>Tokens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokens()
	 * @see #getTokens()
	 * @see #setTokens(TokensType)
	 * @generated
	 */
	public void unsetTokens()
	{
		if (tokens != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(tokens, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_TOKENS, null, changeContext);
			changeContext = basicUnsetTokens(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldTokens_set_ = tokens_set_;
			tokens_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_TOKENS, null, null, oldTokens_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listInstanceTokensResponse#getTokens <em>Tokens</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tokens</em>' containment reference is set.
	 * @see #unsetTokens()
	 * @see #getTokens()
	 * @see #setTokens(TokensType)
	 * @generated
	 */
	public boolean isSetTokens()
	{
		return tokens_set_;
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
			case TOKENS:
				return basicUnsetTokens(changeContext);
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
			case TOKENS:
				return getTokens();
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
			case TOKENS:
				setTokens((TokensType)newValue);
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
			case TOKENS:
				unsetTokens();
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
			case TOKENS:
				return isSetTokens();
		}
		return super.isSet(propertyIndex);
	}

} // listInstanceTokensResponse

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
 * A representation of the model object '<em><b>get Object Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.getObjectResponse#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class getObjectResponse extends DataObjectBase implements Serializable
{

	public final static int OBJECT = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OBJECT = 0;

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
			case _INTERNAL_OBJECT: return OBJECT;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	
	protected ObjectResponseType object = null;
	
	/**
	 * This is true if the Object containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean object_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public getObjectResponse()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getgetObjectResponse();
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
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #isSetObject()
	 * @see #unsetObject()
	 * @see #setObject(ObjectResponseType)
	 * @generated
	 */
	public ObjectResponseType getObject()
	{
		return object;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetObject(ObjectResponseType newObject, ChangeContext changeContext)
	{
		ObjectResponseType oldObject = object;
		object = newObject;
		boolean oldObject_set_ = object_set_;
		object_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_OBJECT, oldObject, newObject, !oldObject_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.getObjectResponse#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #isSetObject()
	 * @see #unsetObject()
	 * @see #getObject()
	 * @generated
	 */
	public void setObject(ObjectResponseType newObject)
	{
		if (newObject != object)
		{
			ChangeContext changeContext = null;
			if (object != null)
				changeContext = inverseRemove(object, this, OPPOSITE_FEATURE_BASE - _INTERNAL_OBJECT, null, changeContext);
			if (newObject != null)
				changeContext = inverseAdd(newObject, this, OPPOSITE_FEATURE_BASE - _INTERNAL_OBJECT, null, changeContext);
			changeContext = basicSetObject(newObject, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldObject_set_ = object_set_;
			object_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_OBJECT, newObject, newObject, !oldObject_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetObject(ChangeContext changeContext)
	{
		ObjectResponseType oldObject = object;
		object = null;
		boolean oldObject_set_ = object_set_;
		object_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_OBJECT, oldObject, null, !oldObject_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.getObjectResponse#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObject()
	 * @see #getObject()
	 * @see #setObject(ObjectResponseType)
	 * @generated
	 */
	public void unsetObject()
	{
		if (object != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(object, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_OBJECT, null, changeContext);
			changeContext = basicUnsetObject(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldObject_set_ = object_set_;
			object_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_OBJECT, null, null, oldObject_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.getObjectResponse#getObject <em>Object</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object</em>' containment reference is set.
	 * @see #unsetObject()
	 * @see #getObject()
	 * @see #setObject(ObjectResponseType)
	 * @generated
	 */
	public boolean isSetObject()
	{
		return object_set_;
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
			case OBJECT:
				return basicUnsetObject(changeContext);
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
			case OBJECT:
				return getObject();
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
			case OBJECT:
				setObject((ObjectResponseType)newValue);
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
			case OBJECT:
				unsetObject();
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
			case OBJECT:
				return isSetObject();
		}
		return super.isSet(propertyIndex);
	}

} // getObjectResponse

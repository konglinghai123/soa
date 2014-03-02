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
 * A representation of the model object '<em><b>Object Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectClassName <em>Object Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ObjectRequestType extends DataObjectBase implements Serializable
{

	public final static int OBJECT_ID = 0;

	public final static int OBJECT_CLASS_NAME = 1;

	public final static int SDO_PROPERTY_COUNT = 2;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OBJECT_ID = 0;

	/**
	 * The internal feature id for the '<em><b>Object Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_OBJECT_CLASS_NAME = 1;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 2;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_OBJECT_ID: return OBJECT_ID;
			case _INTERNAL_OBJECT_CLASS_NAME: return OBJECT_CLASS_NAME;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected String objectId = OBJECT_ID_DEFAULT_;

	/**
	 * This is true if the Object Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectId_set_ = false;

	/**
	 * The default value of the '{@link #getObjectClassName() <em>Object Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_CLASS_NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getObjectClassName() <em>Object Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClassName()
	 * @generated
	 * @ordered
	 */
	protected String objectClassName = OBJECT_CLASS_NAME_DEFAULT_;

	/**
	 * This is true if the Object Class Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectClassName_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRequestType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getObjectRequestType();
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
	 * Returns the value of the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #isSetObjectId()
	 * @see #unsetObjectId()
	 * @see #setObjectId(String)
	 * @generated
	 */
	public String getObjectId()
	{
		return objectId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #isSetObjectId()
	 * @see #unsetObjectId()
	 * @see #getObjectId()
	 * @generated
	 */
	public void setObjectId(String newObjectId)
	{
		String oldObjectId = objectId;
		objectId = newObjectId;
		boolean oldObjectId_set_ = objectId_set_;
		objectId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_OBJECT_ID, oldObjectId, objectId, !oldObjectId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectId()
	 * @see #getObjectId()
	 * @see #setObjectId(String)
	 * @generated
	 */
	public void unsetObjectId()
	{
		String oldObjectId = objectId;
		boolean oldObjectId_set_ = objectId_set_;
		objectId = OBJECT_ID_DEFAULT_;
		objectId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_OBJECT_ID, oldObjectId, OBJECT_ID_DEFAULT_, oldObjectId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectId <em>Object Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Id</em>' attribute is set.
	 * @see #unsetObjectId()
	 * @see #getObjectId()
	 * @see #setObjectId(String)
	 * @generated
	 */
	public boolean isSetObjectId()
	{
		return objectId_set_;
	}

	/**
	 * Returns the value of the '<em><b>Object Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class Name</em>' attribute.
	 * @see #isSetObjectClassName()
	 * @see #unsetObjectClassName()
	 * @see #setObjectClassName(String)
	 * @generated
	 */
	public String getObjectClassName()
	{
		return objectClassName;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectClassName <em>Object Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class Name</em>' attribute.
	 * @see #isSetObjectClassName()
	 * @see #unsetObjectClassName()
	 * @see #getObjectClassName()
	 * @generated
	 */
	public void setObjectClassName(String newObjectClassName)
	{
		String oldObjectClassName = objectClassName;
		objectClassName = newObjectClassName;
		boolean oldObjectClassName_set_ = objectClassName_set_;
		objectClassName_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_OBJECT_CLASS_NAME, oldObjectClassName, objectClassName, !oldObjectClassName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectClassName <em>Object Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectClassName()
	 * @see #getObjectClassName()
	 * @see #setObjectClassName(String)
	 * @generated
	 */
	public void unsetObjectClassName()
	{
		String oldObjectClassName = objectClassName;
		boolean oldObjectClassName_set_ = objectClassName_set_;
		objectClassName = OBJECT_CLASS_NAME_DEFAULT_;
		objectClassName_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_OBJECT_CLASS_NAME, oldObjectClassName, OBJECT_CLASS_NAME_DEFAULT_, oldObjectClassName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ObjectRequestType#getObjectClassName <em>Object Class Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Class Name</em>' attribute is set.
	 * @see #unsetObjectClassName()
	 * @see #getObjectClassName()
	 * @see #setObjectClassName(String)
	 * @generated
	 */
	public boolean isSetObjectClassName()
	{
		return objectClassName_set_;
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
			case OBJECT_ID:
				return getObjectId();
			case OBJECT_CLASS_NAME:
				return getObjectClassName();
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
			case OBJECT_ID:
				setObjectId((String)newValue);
				return;
			case OBJECT_CLASS_NAME:
				setObjectClassName((String)newValue);
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
			case OBJECT_ID:
				unsetObjectId();
				return;
			case OBJECT_CLASS_NAME:
				unsetObjectClassName();
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
			case OBJECT_ID:
				return isSetObjectId();
			case OBJECT_CLASS_NAME:
				return isSetObjectClassName();
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
		result.append(" (objectId: ");
		if (objectId_set_) result.append(objectId); else result.append("<unset>");
		result.append(", objectClassName: ");
		if (objectClassName_set_) result.append(objectClassName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ObjectRequestType

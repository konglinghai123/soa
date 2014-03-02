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
 * A representation of the model object '<em><b>comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.comment#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.comment#getMessage <em>Message</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.comment#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class comment extends DataObjectBase implements Serializable
{

	public final static int ACTOR_ID = 0;

	public final static int MESSAGE = 1;

	public final static int TIME = 2;

	public final static int SDO_PROPERTY_COUNT = 3;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Actor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ACTOR_ID = 0;

	/**
	 * The internal feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_MESSAGE = 1;

	/**
	 * The internal feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TIME = 2;

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
			case _INTERNAL_ACTOR_ID: return ACTOR_ID;
			case _INTERNAL_MESSAGE: return MESSAGE;
			case _INTERNAL_TIME: return TIME;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getActorId() <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getActorId() <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorId()
	 * @generated
	 * @ordered
	 */
	protected String actorId = ACTOR_ID_DEFAULT_;

	/**
	 * This is true if the Actor Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actorId_set_ = false;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_DEFAULT_;

	/**
	 * This is true if the Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean message_set_ = false;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_DEFAULT_;

	/**
	 * This is true if the Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean time_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comment()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getcomment();
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
	 * Returns the value of the '<em><b>Actor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Id</em>' attribute.
	 * @see #isSetActorId()
	 * @see #unsetActorId()
	 * @see #setActorId(String)
	 * @generated
	 */
	public String getActorId()
	{
		return actorId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.comment#getActorId <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Id</em>' attribute.
	 * @see #isSetActorId()
	 * @see #unsetActorId()
	 * @see #getActorId()
	 * @generated
	 */
	public void setActorId(String newActorId)
	{
		String oldActorId = actorId;
		actorId = newActorId;
		boolean oldActorId_set_ = actorId_set_;
		actorId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ACTOR_ID, oldActorId, actorId, !oldActorId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.comment#getActorId <em>Actor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActorId()
	 * @see #getActorId()
	 * @see #setActorId(String)
	 * @generated
	 */
	public void unsetActorId()
	{
		String oldActorId = actorId;
		boolean oldActorId_set_ = actorId_set_;
		actorId = ACTOR_ID_DEFAULT_;
		actorId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ACTOR_ID, oldActorId, ACTOR_ID_DEFAULT_, oldActorId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.comment#getActorId <em>Actor Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actor Id</em>' attribute is set.
	 * @see #unsetActorId()
	 * @see #getActorId()
	 * @see #setActorId(String)
	 * @generated
	 */
	public boolean isSetActorId()
	{
		return actorId_set_;
	}

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #isSetMessage()
	 * @see #unsetMessage()
	 * @see #setMessage(String)
	 * @generated
	 */
	public String getMessage()
	{
		return message;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.comment#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #isSetMessage()
	 * @see #unsetMessage()
	 * @see #getMessage()
	 * @generated
	 */
	public void setMessage(String newMessage)
	{
		String oldMessage = message;
		message = newMessage;
		boolean oldMessage_set_ = message_set_;
		message_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_MESSAGE, oldMessage, message, !oldMessage_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.comment#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessage()
	 * @see #getMessage()
	 * @see #setMessage(String)
	 * @generated
	 */
	public void unsetMessage()
	{
		String oldMessage = message;
		boolean oldMessage_set_ = message_set_;
		message = MESSAGE_DEFAULT_;
		message_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_MESSAGE, oldMessage, MESSAGE_DEFAULT_, oldMessage_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.comment#getMessage <em>Message</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message</em>' attribute is set.
	 * @see #unsetMessage()
	 * @see #getMessage()
	 * @see #setMessage(String)
	 * @generated
	 */
	public boolean isSetMessage()
	{
		return message_set_;
	}

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #isSetTime()
	 * @see #unsetTime()
	 * @see #setTime(String)
	 * @generated
	 */
	public String getTime()
	{
		return time;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.comment#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #isSetTime()
	 * @see #unsetTime()
	 * @see #getTime()
	 * @generated
	 */
	public void setTime(String newTime)
	{
		String oldTime = time;
		time = newTime;
		boolean oldTime_set_ = time_set_;
		time_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TIME, oldTime, time, !oldTime_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.comment#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTime()
	 * @see #getTime()
	 * @see #setTime(String)
	 * @generated
	 */
	public void unsetTime()
	{
		String oldTime = time;
		boolean oldTime_set_ = time_set_;
		time = TIME_DEFAULT_;
		time_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_TIME, oldTime, TIME_DEFAULT_, oldTime_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.comment#getTime <em>Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time</em>' attribute is set.
	 * @see #unsetTime()
	 * @see #getTime()
	 * @see #setTime(String)
	 * @generated
	 */
	public boolean isSetTime()
	{
		return time_set_;
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
			case ACTOR_ID:
				return getActorId();
			case MESSAGE:
				return getMessage();
			case TIME:
				return getTime();
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
			case ACTOR_ID:
				setActorId((String)newValue);
				return;
			case MESSAGE:
				setMessage((String)newValue);
				return;
			case TIME:
				setTime((String)newValue);
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
			case ACTOR_ID:
				unsetActorId();
				return;
			case MESSAGE:
				unsetMessage();
				return;
			case TIME:
				unsetTime();
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
			case ACTOR_ID:
				return isSetActorId();
			case MESSAGE:
				return isSetMessage();
			case TIME:
				return isSetTime();
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
		result.append(" (actorId: ");
		if (actorId_set_) result.append(actorId); else result.append("<unset>");
		result.append(", message: ");
		if (message_set_) result.append(message); else result.append("<unset>");
		result.append(", time: ");
		if (time_set_) result.append(time); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // comment

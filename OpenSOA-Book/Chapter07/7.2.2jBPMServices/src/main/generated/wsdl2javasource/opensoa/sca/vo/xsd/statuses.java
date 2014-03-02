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
 * A representation of the model object '<em><b>statuses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isIsBlocking <em>Is Blocking</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isIsCancelled <em>Is Cancelled</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isIsLast <em>Is Last</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isIsSignaling <em>Is Signaling</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isIsStartInstance <em>Is Start Instance</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isIsSuspended <em>Is Suspended</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.statuses#isHasEnded <em>Has Ended</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class statuses extends DataObjectBase implements Serializable
{

	public final static int IS_BLOCKING = 0;

	public final static int IS_CANCELLED = 1;

	public final static int IS_LAST = 2;

	public final static int IS_OPEN = 3;

	public final static int IS_SIGNALING = 4;

	public final static int IS_START_INSTANCE = 5;

	public final static int IS_SUSPENDED = 6;

	public final static int HAS_ENDED = 7;

	public final static int SDO_PROPERTY_COUNT = 8;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_BLOCKING = 0;

	/**
	 * The internal feature id for the '<em><b>Is Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_CANCELLED = 1;

	/**
	 * The internal feature id for the '<em><b>Is Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_LAST = 2;

	/**
	 * The internal feature id for the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_OPEN = 3;

	/**
	 * The internal feature id for the '<em><b>Is Signaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_SIGNALING = 4;

	/**
	 * The internal feature id for the '<em><b>Is Start Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_START_INSTANCE = 5;

	/**
	 * The internal feature id for the '<em><b>Is Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_SUSPENDED = 6;

	/**
	 * The internal feature id for the '<em><b>Has Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HAS_ENDED = 7;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 8;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_IS_BLOCKING: return IS_BLOCKING;
			case _INTERNAL_IS_CANCELLED: return IS_CANCELLED;
			case _INTERNAL_IS_LAST: return IS_LAST;
			case _INTERNAL_IS_OPEN: return IS_OPEN;
			case _INTERNAL_IS_SIGNALING: return IS_SIGNALING;
			case _INTERNAL_IS_START_INSTANCE: return IS_START_INSTANCE;
			case _INTERNAL_IS_SUSPENDED: return IS_SUSPENDED;
			case _INTERNAL_HAS_ENDED: return HAS_ENDED;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #isIsBlocking() <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlocking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BLOCKING_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsBlocking() <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlocking()
	 * @generated
	 * @ordered
	 */
	protected boolean isBlocking = IS_BLOCKING_DEFAULT_;

	/**
	 * This is true if the Is Blocking attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBlocking_set_ = false;

	/**
	 * The default value of the '{@link #isIsCancelled() <em>Is Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCancelled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CANCELLED_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsCancelled() <em>Is Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCancelled()
	 * @generated
	 * @ordered
	 */
	protected boolean isCancelled = IS_CANCELLED_DEFAULT_;

	/**
	 * This is true if the Is Cancelled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCancelled_set_ = false;

	/**
	 * The default value of the '{@link #isIsLast() <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LAST_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsLast() <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLast()
	 * @generated
	 * @ordered
	 */
	protected boolean isLast = IS_LAST_DEFAULT_;

	/**
	 * This is true if the Is Last attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLast_set_ = false;

	/**
	 * The default value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPEN_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean isOpen = IS_OPEN_DEFAULT_;

	/**
	 * This is true if the Is Open attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isOpen_set_ = false;

	/**
	 * The default value of the '{@link #isIsSignaling() <em>Is Signaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSignaling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIGNALING_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsSignaling() <em>Is Signaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSignaling()
	 * @generated
	 * @ordered
	 */
	protected boolean isSignaling = IS_SIGNALING_DEFAULT_;

	/**
	 * This is true if the Is Signaling attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSignaling_set_ = false;

	/**
	 * The default value of the '{@link #isIsStartInstance() <em>Is Start Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStartInstance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_INSTANCE_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsStartInstance() <em>Is Start Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStartInstance()
	 * @generated
	 * @ordered
	 */
	protected boolean isStartInstance = IS_START_INSTANCE_DEFAULT_;

	/**
	 * This is true if the Is Start Instance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isStartInstance_set_ = false;

	/**
	 * The default value of the '{@link #isIsSuspended() <em>Is Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUSPENDED_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsSuspended() <em>Is Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSuspended()
	 * @generated
	 * @ordered
	 */
	protected boolean isSuspended = IS_SUSPENDED_DEFAULT_;

	/**
	 * This is true if the Is Suspended attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSuspended_set_ = false;

	/**
	 * The default value of the '{@link #isHasEnded() <em>Has Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasEnded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ENDED_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isHasEnded() <em>Has Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasEnded()
	 * @generated
	 * @ordered
	 */
	protected boolean hasEnded = HAS_ENDED_DEFAULT_;

	/**
	 * This is true if the Has Ended attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasEnded_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statuses()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getstatuses();
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
	 * Returns the value of the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Blocking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Blocking</em>' attribute.
	 * @see #isSetIsBlocking()
	 * @see #unsetIsBlocking()
	 * @see #setIsBlocking(boolean)
	 * @generated
	 */
	public boolean isIsBlocking()
	{
		return isBlocking;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsBlocking <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Blocking</em>' attribute.
	 * @see #isSetIsBlocking()
	 * @see #unsetIsBlocking()
	 * @see #isIsBlocking()
	 * @generated
	 */
	public void setIsBlocking(boolean newIsBlocking)
	{
		boolean oldIsBlocking = isBlocking;
		isBlocking = newIsBlocking;
		boolean oldIsBlocking_set_ = isBlocking_set_;
		isBlocking_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_BLOCKING, oldIsBlocking, isBlocking, !oldIsBlocking_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsBlocking <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBlocking()
	 * @see #isIsBlocking()
	 * @see #setIsBlocking(boolean)
	 * @generated
	 */
	public void unsetIsBlocking()
	{
		boolean oldIsBlocking = isBlocking;
		boolean oldIsBlocking_set_ = isBlocking_set_;
		isBlocking = IS_BLOCKING_DEFAULT_;
		isBlocking_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_BLOCKING, oldIsBlocking, IS_BLOCKING_DEFAULT_, oldIsBlocking_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsBlocking <em>Is Blocking</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Blocking</em>' attribute is set.
	 * @see #unsetIsBlocking()
	 * @see #isIsBlocking()
	 * @see #setIsBlocking(boolean)
	 * @generated
	 */
	public boolean isSetIsBlocking()
	{
		return isBlocking_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cancelled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cancelled</em>' attribute.
	 * @see #isSetIsCancelled()
	 * @see #unsetIsCancelled()
	 * @see #setIsCancelled(boolean)
	 * @generated
	 */
	public boolean isIsCancelled()
	{
		return isCancelled;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsCancelled <em>Is Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cancelled</em>' attribute.
	 * @see #isSetIsCancelled()
	 * @see #unsetIsCancelled()
	 * @see #isIsCancelled()
	 * @generated
	 */
	public void setIsCancelled(boolean newIsCancelled)
	{
		boolean oldIsCancelled = isCancelled;
		isCancelled = newIsCancelled;
		boolean oldIsCancelled_set_ = isCancelled_set_;
		isCancelled_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_CANCELLED, oldIsCancelled, isCancelled, !oldIsCancelled_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsCancelled <em>Is Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCancelled()
	 * @see #isIsCancelled()
	 * @see #setIsCancelled(boolean)
	 * @generated
	 */
	public void unsetIsCancelled()
	{
		boolean oldIsCancelled = isCancelled;
		boolean oldIsCancelled_set_ = isCancelled_set_;
		isCancelled = IS_CANCELLED_DEFAULT_;
		isCancelled_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_CANCELLED, oldIsCancelled, IS_CANCELLED_DEFAULT_, oldIsCancelled_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsCancelled <em>Is Cancelled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Cancelled</em>' attribute is set.
	 * @see #unsetIsCancelled()
	 * @see #isIsCancelled()
	 * @see #setIsCancelled(boolean)
	 * @generated
	 */
	public boolean isSetIsCancelled()
	{
		return isCancelled_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Last</em>' attribute.
	 * @see #isSetIsLast()
	 * @see #unsetIsLast()
	 * @see #setIsLast(boolean)
	 * @generated
	 */
	public boolean isIsLast()
	{
		return isLast;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsLast <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Last</em>' attribute.
	 * @see #isSetIsLast()
	 * @see #unsetIsLast()
	 * @see #isIsLast()
	 * @generated
	 */
	public void setIsLast(boolean newIsLast)
	{
		boolean oldIsLast = isLast;
		isLast = newIsLast;
		boolean oldIsLast_set_ = isLast_set_;
		isLast_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_LAST, oldIsLast, isLast, !oldIsLast_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsLast <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLast()
	 * @see #isIsLast()
	 * @see #setIsLast(boolean)
	 * @generated
	 */
	public void unsetIsLast()
	{
		boolean oldIsLast = isLast;
		boolean oldIsLast_set_ = isLast_set_;
		isLast = IS_LAST_DEFAULT_;
		isLast_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_LAST, oldIsLast, IS_LAST_DEFAULT_, oldIsLast_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsLast <em>Is Last</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Last</em>' attribute is set.
	 * @see #unsetIsLast()
	 * @see #isIsLast()
	 * @see #setIsLast(boolean)
	 * @generated
	 */
	public boolean isSetIsLast()
	{
		return isLast_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Open</em>' attribute.
	 * @see #isSetIsOpen()
	 * @see #unsetIsOpen()
	 * @see #setIsOpen(boolean)
	 * @generated
	 */
	public boolean isIsOpen()
	{
		return isOpen;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsOpen <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Open</em>' attribute.
	 * @see #isSetIsOpen()
	 * @see #unsetIsOpen()
	 * @see #isIsOpen()
	 * @generated
	 */
	public void setIsOpen(boolean newIsOpen)
	{
		boolean oldIsOpen = isOpen;
		isOpen = newIsOpen;
		boolean oldIsOpen_set_ = isOpen_set_;
		isOpen_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_OPEN, oldIsOpen, isOpen, !oldIsOpen_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsOpen <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOpen()
	 * @see #isIsOpen()
	 * @see #setIsOpen(boolean)
	 * @generated
	 */
	public void unsetIsOpen()
	{
		boolean oldIsOpen = isOpen;
		boolean oldIsOpen_set_ = isOpen_set_;
		isOpen = IS_OPEN_DEFAULT_;
		isOpen_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_OPEN, oldIsOpen, IS_OPEN_DEFAULT_, oldIsOpen_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsOpen <em>Is Open</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Open</em>' attribute is set.
	 * @see #unsetIsOpen()
	 * @see #isIsOpen()
	 * @see #setIsOpen(boolean)
	 * @generated
	 */
	public boolean isSetIsOpen()
	{
		return isOpen_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Signaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Signaling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Signaling</em>' attribute.
	 * @see #isSetIsSignaling()
	 * @see #unsetIsSignaling()
	 * @see #setIsSignaling(boolean)
	 * @generated
	 */
	public boolean isIsSignaling()
	{
		return isSignaling;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsSignaling <em>Is Signaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Signaling</em>' attribute.
	 * @see #isSetIsSignaling()
	 * @see #unsetIsSignaling()
	 * @see #isIsSignaling()
	 * @generated
	 */
	public void setIsSignaling(boolean newIsSignaling)
	{
		boolean oldIsSignaling = isSignaling;
		isSignaling = newIsSignaling;
		boolean oldIsSignaling_set_ = isSignaling_set_;
		isSignaling_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_SIGNALING, oldIsSignaling, isSignaling, !oldIsSignaling_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsSignaling <em>Is Signaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSignaling()
	 * @see #isIsSignaling()
	 * @see #setIsSignaling(boolean)
	 * @generated
	 */
	public void unsetIsSignaling()
	{
		boolean oldIsSignaling = isSignaling;
		boolean oldIsSignaling_set_ = isSignaling_set_;
		isSignaling = IS_SIGNALING_DEFAULT_;
		isSignaling_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_SIGNALING, oldIsSignaling, IS_SIGNALING_DEFAULT_, oldIsSignaling_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsSignaling <em>Is Signaling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Signaling</em>' attribute is set.
	 * @see #unsetIsSignaling()
	 * @see #isIsSignaling()
	 * @see #setIsSignaling(boolean)
	 * @generated
	 */
	public boolean isSetIsSignaling()
	{
		return isSignaling_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Start Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start Instance</em>' attribute.
	 * @see #isSetIsStartInstance()
	 * @see #unsetIsStartInstance()
	 * @see #setIsStartInstance(boolean)
	 * @generated
	 */
	public boolean isIsStartInstance()
	{
		return isStartInstance;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsStartInstance <em>Is Start Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start Instance</em>' attribute.
	 * @see #isSetIsStartInstance()
	 * @see #unsetIsStartInstance()
	 * @see #isIsStartInstance()
	 * @generated
	 */
	public void setIsStartInstance(boolean newIsStartInstance)
	{
		boolean oldIsStartInstance = isStartInstance;
		isStartInstance = newIsStartInstance;
		boolean oldIsStartInstance_set_ = isStartInstance_set_;
		isStartInstance_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_START_INSTANCE, oldIsStartInstance, isStartInstance, !oldIsStartInstance_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsStartInstance <em>Is Start Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsStartInstance()
	 * @see #isIsStartInstance()
	 * @see #setIsStartInstance(boolean)
	 * @generated
	 */
	public void unsetIsStartInstance()
	{
		boolean oldIsStartInstance = isStartInstance;
		boolean oldIsStartInstance_set_ = isStartInstance_set_;
		isStartInstance = IS_START_INSTANCE_DEFAULT_;
		isStartInstance_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_START_INSTANCE, oldIsStartInstance, IS_START_INSTANCE_DEFAULT_, oldIsStartInstance_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsStartInstance <em>Is Start Instance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Start Instance</em>' attribute is set.
	 * @see #unsetIsStartInstance()
	 * @see #isIsStartInstance()
	 * @see #setIsStartInstance(boolean)
	 * @generated
	 */
	public boolean isSetIsStartInstance()
	{
		return isStartInstance_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Suspended</em>' attribute.
	 * @see #isSetIsSuspended()
	 * @see #unsetIsSuspended()
	 * @see #setIsSuspended(boolean)
	 * @generated
	 */
	public boolean isIsSuspended()
	{
		return isSuspended;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsSuspended <em>Is Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Suspended</em>' attribute.
	 * @see #isSetIsSuspended()
	 * @see #unsetIsSuspended()
	 * @see #isIsSuspended()
	 * @generated
	 */
	public void setIsSuspended(boolean newIsSuspended)
	{
		boolean oldIsSuspended = isSuspended;
		isSuspended = newIsSuspended;
		boolean oldIsSuspended_set_ = isSuspended_set_;
		isSuspended_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_SUSPENDED, oldIsSuspended, isSuspended, !oldIsSuspended_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsSuspended <em>Is Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSuspended()
	 * @see #isIsSuspended()
	 * @see #setIsSuspended(boolean)
	 * @generated
	 */
	public void unsetIsSuspended()
	{
		boolean oldIsSuspended = isSuspended;
		boolean oldIsSuspended_set_ = isSuspended_set_;
		isSuspended = IS_SUSPENDED_DEFAULT_;
		isSuspended_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_SUSPENDED, oldIsSuspended, IS_SUSPENDED_DEFAULT_, oldIsSuspended_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isIsSuspended <em>Is Suspended</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Suspended</em>' attribute is set.
	 * @see #unsetIsSuspended()
	 * @see #isIsSuspended()
	 * @see #setIsSuspended(boolean)
	 * @generated
	 */
	public boolean isSetIsSuspended()
	{
		return isSuspended_set_;
	}

	/**
	 * Returns the value of the '<em><b>Has Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ended</em>' attribute.
	 * @see #isSetHasEnded()
	 * @see #unsetHasEnded()
	 * @see #setHasEnded(boolean)
	 * @generated
	 */
	public boolean isHasEnded()
	{
		return hasEnded;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.statuses#isHasEnded <em>Has Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Ended</em>' attribute.
	 * @see #isSetHasEnded()
	 * @see #unsetHasEnded()
	 * @see #isHasEnded()
	 * @generated
	 */
	public void setHasEnded(boolean newHasEnded)
	{
		boolean oldHasEnded = hasEnded;
		hasEnded = newHasEnded;
		boolean oldHasEnded_set_ = hasEnded_set_;
		hasEnded_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_HAS_ENDED, oldHasEnded, hasEnded, !oldHasEnded_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.statuses#isHasEnded <em>Has Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasEnded()
	 * @see #isHasEnded()
	 * @see #setHasEnded(boolean)
	 * @generated
	 */
	public void unsetHasEnded()
	{
		boolean oldHasEnded = hasEnded;
		boolean oldHasEnded_set_ = hasEnded_set_;
		hasEnded = HAS_ENDED_DEFAULT_;
		hasEnded_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_HAS_ENDED, oldHasEnded, HAS_ENDED_DEFAULT_, oldHasEnded_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.statuses#isHasEnded <em>Has Ended</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Ended</em>' attribute is set.
	 * @see #unsetHasEnded()
	 * @see #isHasEnded()
	 * @see #setHasEnded(boolean)
	 * @generated
	 */
	public boolean isSetHasEnded()
	{
		return hasEnded_set_;
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
			case IS_BLOCKING:
				return isIsBlocking() ? Boolean.TRUE : Boolean.FALSE;
			case IS_CANCELLED:
				return isIsCancelled() ? Boolean.TRUE : Boolean.FALSE;
			case IS_LAST:
				return isIsLast() ? Boolean.TRUE : Boolean.FALSE;
			case IS_OPEN:
				return isIsOpen() ? Boolean.TRUE : Boolean.FALSE;
			case IS_SIGNALING:
				return isIsSignaling() ? Boolean.TRUE : Boolean.FALSE;
			case IS_START_INSTANCE:
				return isIsStartInstance() ? Boolean.TRUE : Boolean.FALSE;
			case IS_SUSPENDED:
				return isIsSuspended() ? Boolean.TRUE : Boolean.FALSE;
			case HAS_ENDED:
				return isHasEnded() ? Boolean.TRUE : Boolean.FALSE;
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
			case IS_BLOCKING:
				setIsBlocking(((Boolean)newValue).booleanValue());
				return;
			case IS_CANCELLED:
				setIsCancelled(((Boolean)newValue).booleanValue());
				return;
			case IS_LAST:
				setIsLast(((Boolean)newValue).booleanValue());
				return;
			case IS_OPEN:
				setIsOpen(((Boolean)newValue).booleanValue());
				return;
			case IS_SIGNALING:
				setIsSignaling(((Boolean)newValue).booleanValue());
				return;
			case IS_START_INSTANCE:
				setIsStartInstance(((Boolean)newValue).booleanValue());
				return;
			case IS_SUSPENDED:
				setIsSuspended(((Boolean)newValue).booleanValue());
				return;
			case HAS_ENDED:
				setHasEnded(((Boolean)newValue).booleanValue());
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
			case IS_BLOCKING:
				unsetIsBlocking();
				return;
			case IS_CANCELLED:
				unsetIsCancelled();
				return;
			case IS_LAST:
				unsetIsLast();
				return;
			case IS_OPEN:
				unsetIsOpen();
				return;
			case IS_SIGNALING:
				unsetIsSignaling();
				return;
			case IS_START_INSTANCE:
				unsetIsStartInstance();
				return;
			case IS_SUSPENDED:
				unsetIsSuspended();
				return;
			case HAS_ENDED:
				unsetHasEnded();
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
			case IS_BLOCKING:
				return isSetIsBlocking();
			case IS_CANCELLED:
				return isSetIsCancelled();
			case IS_LAST:
				return isSetIsLast();
			case IS_OPEN:
				return isSetIsOpen();
			case IS_SIGNALING:
				return isSetIsSignaling();
			case IS_START_INSTANCE:
				return isSetIsStartInstance();
			case IS_SUSPENDED:
				return isSetIsSuspended();
			case HAS_ENDED:
				return isSetHasEnded();
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
		result.append(" (isBlocking: ");
		if (isBlocking_set_) result.append(isBlocking); else result.append("<unset>");
		result.append(", isCancelled: ");
		if (isCancelled_set_) result.append(isCancelled); else result.append("<unset>");
		result.append(", isLast: ");
		if (isLast_set_) result.append(isLast); else result.append("<unset>");
		result.append(", isOpen: ");
		if (isOpen_set_) result.append(isOpen); else result.append("<unset>");
		result.append(", isSignaling: ");
		if (isSignaling_set_) result.append(isSignaling); else result.append("<unset>");
		result.append(", isStartInstance: ");
		if (isStartInstance_set_) result.append(isStartInstance); else result.append("<unset>");
		result.append(", isSuspended: ");
		if (isSuspended_set_) result.append(isSuspended); else result.append("<unset>");
		result.append(", hasEnded: ");
		if (hasEnded_set_) result.append(hasEnded); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // statuses

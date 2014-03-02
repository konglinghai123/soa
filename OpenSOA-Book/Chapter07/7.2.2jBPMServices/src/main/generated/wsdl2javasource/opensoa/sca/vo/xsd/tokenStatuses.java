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
 * A representation of the model object '<em><b>token Statuses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isIsSuspended <em>Is Suspended</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isIsAbleToReactivateParent <em>Is Able To Reactivate Parent</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedmplicitly <em>Is Terminatedmplicitly</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedImplicit <em>Is Terminated Implicit</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isHasActiveChildren <em>Has Active Children</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isHasEnded <em>Has Ended</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.tokenStatuses#isHasParent <em>Has Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class tokenStatuses extends DataObjectBase implements Serializable
{

	public final static int IS_SUSPENDED = 0;

	public final static int IS_ABLE_TO_REACTIVATE_PARENT = 1;

	public final static int IS_LOCKED = 2;

	public final static int IS_ROOT = 3;

	public final static int IS_TERMINATEDMPLICITLY = 4;

	public final static int IS_TERMINATED_IMPLICIT = 5;

	public final static int HAS_ACTIVE_CHILDREN = 6;

	public final static int HAS_ENDED = 7;

	public final static int HAS_PARENT = 8;

	public final static int SDO_PROPERTY_COUNT = 9;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Is Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_SUSPENDED = 0;

	/**
	 * The internal feature id for the '<em><b>Is Able To Reactivate Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_ABLE_TO_REACTIVATE_PARENT = 1;

	/**
	 * The internal feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_LOCKED = 2;

	/**
	 * The internal feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_ROOT = 3;

	/**
	 * The internal feature id for the '<em><b>Is Terminatedmplicitly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_TERMINATEDMPLICITLY = 4;

	/**
	 * The internal feature id for the '<em><b>Is Terminated Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_TERMINATED_IMPLICIT = 5;

	/**
	 * The internal feature id for the '<em><b>Has Active Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HAS_ACTIVE_CHILDREN = 6;

	/**
	 * The internal feature id for the '<em><b>Has Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HAS_ENDED = 7;

	/**
	 * The internal feature id for the '<em><b>Has Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HAS_PARENT = 8;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 9;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_IS_SUSPENDED: return IS_SUSPENDED;
			case _INTERNAL_IS_ABLE_TO_REACTIVATE_PARENT: return IS_ABLE_TO_REACTIVATE_PARENT;
			case _INTERNAL_IS_LOCKED: return IS_LOCKED;
			case _INTERNAL_IS_ROOT: return IS_ROOT;
			case _INTERNAL_IS_TERMINATEDMPLICITLY: return IS_TERMINATEDMPLICITLY;
			case _INTERNAL_IS_TERMINATED_IMPLICIT: return IS_TERMINATED_IMPLICIT;
			case _INTERNAL_HAS_ACTIVE_CHILDREN: return HAS_ACTIVE_CHILDREN;
			case _INTERNAL_HAS_ENDED: return HAS_ENDED;
			case _INTERNAL_HAS_PARENT: return HAS_PARENT;
		}
		return super.internalConvertIndex(internalIndex);
	}


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
	 * The default value of the '{@link #isIsAbleToReactivateParent() <em>Is Able To Reactivate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbleToReactivateParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABLE_TO_REACTIVATE_PARENT_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsAbleToReactivateParent() <em>Is Able To Reactivate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbleToReactivateParent()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbleToReactivateParent = IS_ABLE_TO_REACTIVATE_PARENT_DEFAULT_;

	/**
	 * This is true if the Is Able To Reactivate Parent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAbleToReactivateParent_set_ = false;

	/**
	 * The default value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCKED_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocked = IS_LOCKED_DEFAULT_;

	/**
	 * This is true if the Is Locked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLocked_set_ = false;

	/**
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_DEFAULT_;

	/**
	 * This is true if the Is Root attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot_set_ = false;

	/**
	 * The default value of the '{@link #isIsTerminatedmplicitly() <em>Is Terminatedmplicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminatedmplicitly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TERMINATEDMPLICITLY_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsTerminatedmplicitly() <em>Is Terminatedmplicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminatedmplicitly()
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminatedmplicitly = IS_TERMINATEDMPLICITLY_DEFAULT_;

	/**
	 * This is true if the Is Terminatedmplicitly attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminatedmplicitly_set_ = false;

	/**
	 * The default value of the '{@link #isIsTerminatedImplicit() <em>Is Terminated Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminatedImplicit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TERMINATED_IMPLICIT_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsTerminatedImplicit() <em>Is Terminated Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminatedImplicit()
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminatedImplicit = IS_TERMINATED_IMPLICIT_DEFAULT_;

	/**
	 * This is true if the Is Terminated Implicit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminatedImplicit_set_ = false;

	/**
	 * The default value of the '{@link #isHasActiveChildren() <em>Has Active Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasActiveChildren()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ACTIVE_CHILDREN_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isHasActiveChildren() <em>Has Active Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasActiveChildren()
	 * @generated
	 * @ordered
	 */
	protected boolean hasActiveChildren = HAS_ACTIVE_CHILDREN_DEFAULT_;

	/**
	 * This is true if the Has Active Children attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasActiveChildren_set_ = false;

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
	 * The default value of the '{@link #isHasParent() <em>Has Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PARENT_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isHasParent() <em>Has Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasParent()
	 * @generated
	 * @ordered
	 */
	protected boolean hasParent = HAS_PARENT_DEFAULT_;

	/**
	 * This is true if the Has Parent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasParent_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tokenStatuses()
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
		return ((XsdFactory)XsdFactory.INSTANCE).gettokenStatuses();
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsSuspended <em>Is Suspended</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsSuspended <em>Is Suspended</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsSuspended <em>Is Suspended</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Able To Reactivate Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Able To Reactivate Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Able To Reactivate Parent</em>' attribute.
	 * @see #isSetIsAbleToReactivateParent()
	 * @see #unsetIsAbleToReactivateParent()
	 * @see #setIsAbleToReactivateParent(boolean)
	 * @generated
	 */
	public boolean isIsAbleToReactivateParent()
	{
		return isAbleToReactivateParent;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsAbleToReactivateParent <em>Is Able To Reactivate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Able To Reactivate Parent</em>' attribute.
	 * @see #isSetIsAbleToReactivateParent()
	 * @see #unsetIsAbleToReactivateParent()
	 * @see #isIsAbleToReactivateParent()
	 * @generated
	 */
	public void setIsAbleToReactivateParent(boolean newIsAbleToReactivateParent)
	{
		boolean oldIsAbleToReactivateParent = isAbleToReactivateParent;
		isAbleToReactivateParent = newIsAbleToReactivateParent;
		boolean oldIsAbleToReactivateParent_set_ = isAbleToReactivateParent_set_;
		isAbleToReactivateParent_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_ABLE_TO_REACTIVATE_PARENT, oldIsAbleToReactivateParent, isAbleToReactivateParent, !oldIsAbleToReactivateParent_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsAbleToReactivateParent <em>Is Able To Reactivate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbleToReactivateParent()
	 * @see #isIsAbleToReactivateParent()
	 * @see #setIsAbleToReactivateParent(boolean)
	 * @generated
	 */
	public void unsetIsAbleToReactivateParent()
	{
		boolean oldIsAbleToReactivateParent = isAbleToReactivateParent;
		boolean oldIsAbleToReactivateParent_set_ = isAbleToReactivateParent_set_;
		isAbleToReactivateParent = IS_ABLE_TO_REACTIVATE_PARENT_DEFAULT_;
		isAbleToReactivateParent_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_ABLE_TO_REACTIVATE_PARENT, oldIsAbleToReactivateParent, IS_ABLE_TO_REACTIVATE_PARENT_DEFAULT_, oldIsAbleToReactivateParent_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsAbleToReactivateParent <em>Is Able To Reactivate Parent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Able To Reactivate Parent</em>' attribute is set.
	 * @see #unsetIsAbleToReactivateParent()
	 * @see #isIsAbleToReactivateParent()
	 * @see #setIsAbleToReactivateParent(boolean)
	 * @generated
	 */
	public boolean isSetIsAbleToReactivateParent()
	{
		return isAbleToReactivateParent_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #isSetIsLocked()
	 * @see #unsetIsLocked()
	 * @see #setIsLocked(boolean)
	 * @generated
	 */
	public boolean isIsLocked()
	{
		return isLocked;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #isSetIsLocked()
	 * @see #unsetIsLocked()
	 * @see #isIsLocked()
	 * @generated
	 */
	public void setIsLocked(boolean newIsLocked)
	{
		boolean oldIsLocked = isLocked;
		isLocked = newIsLocked;
		boolean oldIsLocked_set_ = isLocked_set_;
		isLocked_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_LOCKED, oldIsLocked, isLocked, !oldIsLocked_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocked()
	 * @see #isIsLocked()
	 * @see #setIsLocked(boolean)
	 * @generated
	 */
	public void unsetIsLocked()
	{
		boolean oldIsLocked = isLocked;
		boolean oldIsLocked_set_ = isLocked_set_;
		isLocked = IS_LOCKED_DEFAULT_;
		isLocked_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_LOCKED, oldIsLocked, IS_LOCKED_DEFAULT_, oldIsLocked_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsLocked <em>Is Locked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Locked</em>' attribute is set.
	 * @see #unsetIsLocked()
	 * @see #isIsLocked()
	 * @see #setIsLocked(boolean)
	 * @generated
	 */
	public boolean isSetIsLocked()
	{
		return isLocked_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #isSetIsRoot()
	 * @see #unsetIsRoot()
	 * @see #setIsRoot(boolean)
	 * @generated
	 */
	public boolean isIsRoot()
	{
		return isRoot;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isSetIsRoot()
	 * @see #unsetIsRoot()
	 * @see #isIsRoot()
	 * @generated
	 */
	public void setIsRoot(boolean newIsRoot)
	{
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		boolean oldIsRoot_set_ = isRoot_set_;
		isRoot_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_ROOT, oldIsRoot, isRoot, !oldIsRoot_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRoot()
	 * @see #isIsRoot()
	 * @see #setIsRoot(boolean)
	 * @generated
	 */
	public void unsetIsRoot()
	{
		boolean oldIsRoot = isRoot;
		boolean oldIsRoot_set_ = isRoot_set_;
		isRoot = IS_ROOT_DEFAULT_;
		isRoot_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_ROOT, oldIsRoot, IS_ROOT_DEFAULT_, oldIsRoot_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsRoot <em>Is Root</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Root</em>' attribute is set.
	 * @see #unsetIsRoot()
	 * @see #isIsRoot()
	 * @see #setIsRoot(boolean)
	 * @generated
	 */
	public boolean isSetIsRoot()
	{
		return isRoot_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Terminatedmplicitly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Terminatedmplicitly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminatedmplicitly</em>' attribute.
	 * @see #isSetIsTerminatedmplicitly()
	 * @see #unsetIsTerminatedmplicitly()
	 * @see #setIsTerminatedmplicitly(boolean)
	 * @generated
	 */
	public boolean isIsTerminatedmplicitly()
	{
		return isTerminatedmplicitly;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedmplicitly <em>Is Terminatedmplicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminatedmplicitly</em>' attribute.
	 * @see #isSetIsTerminatedmplicitly()
	 * @see #unsetIsTerminatedmplicitly()
	 * @see #isIsTerminatedmplicitly()
	 * @generated
	 */
	public void setIsTerminatedmplicitly(boolean newIsTerminatedmplicitly)
	{
		boolean oldIsTerminatedmplicitly = isTerminatedmplicitly;
		isTerminatedmplicitly = newIsTerminatedmplicitly;
		boolean oldIsTerminatedmplicitly_set_ = isTerminatedmplicitly_set_;
		isTerminatedmplicitly_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_TERMINATEDMPLICITLY, oldIsTerminatedmplicitly, isTerminatedmplicitly, !oldIsTerminatedmplicitly_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedmplicitly <em>Is Terminatedmplicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTerminatedmplicitly()
	 * @see #isIsTerminatedmplicitly()
	 * @see #setIsTerminatedmplicitly(boolean)
	 * @generated
	 */
	public void unsetIsTerminatedmplicitly()
	{
		boolean oldIsTerminatedmplicitly = isTerminatedmplicitly;
		boolean oldIsTerminatedmplicitly_set_ = isTerminatedmplicitly_set_;
		isTerminatedmplicitly = IS_TERMINATEDMPLICITLY_DEFAULT_;
		isTerminatedmplicitly_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_TERMINATEDMPLICITLY, oldIsTerminatedmplicitly, IS_TERMINATEDMPLICITLY_DEFAULT_, oldIsTerminatedmplicitly_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedmplicitly <em>Is Terminatedmplicitly</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Terminatedmplicitly</em>' attribute is set.
	 * @see #unsetIsTerminatedmplicitly()
	 * @see #isIsTerminatedmplicitly()
	 * @see #setIsTerminatedmplicitly(boolean)
	 * @generated
	 */
	public boolean isSetIsTerminatedmplicitly()
	{
		return isTerminatedmplicitly_set_;
	}

	/**
	 * Returns the value of the '<em><b>Is Terminated Implicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Terminated Implicit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminated Implicit</em>' attribute.
	 * @see #isSetIsTerminatedImplicit()
	 * @see #unsetIsTerminatedImplicit()
	 * @see #setIsTerminatedImplicit(boolean)
	 * @generated
	 */
	public boolean isIsTerminatedImplicit()
	{
		return isTerminatedImplicit;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedImplicit <em>Is Terminated Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminated Implicit</em>' attribute.
	 * @see #isSetIsTerminatedImplicit()
	 * @see #unsetIsTerminatedImplicit()
	 * @see #isIsTerminatedImplicit()
	 * @generated
	 */
	public void setIsTerminatedImplicit(boolean newIsTerminatedImplicit)
	{
		boolean oldIsTerminatedImplicit = isTerminatedImplicit;
		isTerminatedImplicit = newIsTerminatedImplicit;
		boolean oldIsTerminatedImplicit_set_ = isTerminatedImplicit_set_;
		isTerminatedImplicit_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_TERMINATED_IMPLICIT, oldIsTerminatedImplicit, isTerminatedImplicit, !oldIsTerminatedImplicit_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedImplicit <em>Is Terminated Implicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTerminatedImplicit()
	 * @see #isIsTerminatedImplicit()
	 * @see #setIsTerminatedImplicit(boolean)
	 * @generated
	 */
	public void unsetIsTerminatedImplicit()
	{
		boolean oldIsTerminatedImplicit = isTerminatedImplicit;
		boolean oldIsTerminatedImplicit_set_ = isTerminatedImplicit_set_;
		isTerminatedImplicit = IS_TERMINATED_IMPLICIT_DEFAULT_;
		isTerminatedImplicit_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_TERMINATED_IMPLICIT, oldIsTerminatedImplicit, IS_TERMINATED_IMPLICIT_DEFAULT_, oldIsTerminatedImplicit_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isIsTerminatedImplicit <em>Is Terminated Implicit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Terminated Implicit</em>' attribute is set.
	 * @see #unsetIsTerminatedImplicit()
	 * @see #isIsTerminatedImplicit()
	 * @see #setIsTerminatedImplicit(boolean)
	 * @generated
	 */
	public boolean isSetIsTerminatedImplicit()
	{
		return isTerminatedImplicit_set_;
	}

	/**
	 * Returns the value of the '<em><b>Has Active Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Active Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Active Children</em>' attribute.
	 * @see #isSetHasActiveChildren()
	 * @see #unsetHasActiveChildren()
	 * @see #setHasActiveChildren(boolean)
	 * @generated
	 */
	public boolean isHasActiveChildren()
	{
		return hasActiveChildren;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasActiveChildren <em>Has Active Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Active Children</em>' attribute.
	 * @see #isSetHasActiveChildren()
	 * @see #unsetHasActiveChildren()
	 * @see #isHasActiveChildren()
	 * @generated
	 */
	public void setHasActiveChildren(boolean newHasActiveChildren)
	{
		boolean oldHasActiveChildren = hasActiveChildren;
		hasActiveChildren = newHasActiveChildren;
		boolean oldHasActiveChildren_set_ = hasActiveChildren_set_;
		hasActiveChildren_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_HAS_ACTIVE_CHILDREN, oldHasActiveChildren, hasActiveChildren, !oldHasActiveChildren_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasActiveChildren <em>Has Active Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasActiveChildren()
	 * @see #isHasActiveChildren()
	 * @see #setHasActiveChildren(boolean)
	 * @generated
	 */
	public void unsetHasActiveChildren()
	{
		boolean oldHasActiveChildren = hasActiveChildren;
		boolean oldHasActiveChildren_set_ = hasActiveChildren_set_;
		hasActiveChildren = HAS_ACTIVE_CHILDREN_DEFAULT_;
		hasActiveChildren_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_HAS_ACTIVE_CHILDREN, oldHasActiveChildren, HAS_ACTIVE_CHILDREN_DEFAULT_, oldHasActiveChildren_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasActiveChildren <em>Has Active Children</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Active Children</em>' attribute is set.
	 * @see #unsetHasActiveChildren()
	 * @see #isHasActiveChildren()
	 * @see #setHasActiveChildren(boolean)
	 * @generated
	 */
	public boolean isSetHasActiveChildren()
	{
		return hasActiveChildren_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasEnded <em>Has Ended</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasEnded <em>Has Ended</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasEnded <em>Has Ended</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Has Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Parent</em>' attribute.
	 * @see #isSetHasParent()
	 * @see #unsetHasParent()
	 * @see #setHasParent(boolean)
	 * @generated
	 */
	public boolean isHasParent()
	{
		return hasParent;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasParent <em>Has Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Parent</em>' attribute.
	 * @see #isSetHasParent()
	 * @see #unsetHasParent()
	 * @see #isHasParent()
	 * @generated
	 */
	public void setHasParent(boolean newHasParent)
	{
		boolean oldHasParent = hasParent;
		hasParent = newHasParent;
		boolean oldHasParent_set_ = hasParent_set_;
		hasParent_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_HAS_PARENT, oldHasParent, hasParent, !oldHasParent_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasParent <em>Has Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasParent()
	 * @see #isHasParent()
	 * @see #setHasParent(boolean)
	 * @generated
	 */
	public void unsetHasParent()
	{
		boolean oldHasParent = hasParent;
		boolean oldHasParent_set_ = hasParent_set_;
		hasParent = HAS_PARENT_DEFAULT_;
		hasParent_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_HAS_PARENT, oldHasParent, HAS_PARENT_DEFAULT_, oldHasParent_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.tokenStatuses#isHasParent <em>Has Parent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Parent</em>' attribute is set.
	 * @see #unsetHasParent()
	 * @see #isHasParent()
	 * @see #setHasParent(boolean)
	 * @generated
	 */
	public boolean isSetHasParent()
	{
		return hasParent_set_;
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
			case IS_SUSPENDED:
				return isIsSuspended() ? Boolean.TRUE : Boolean.FALSE;
			case IS_ABLE_TO_REACTIVATE_PARENT:
				return isIsAbleToReactivateParent() ? Boolean.TRUE : Boolean.FALSE;
			case IS_LOCKED:
				return isIsLocked() ? Boolean.TRUE : Boolean.FALSE;
			case IS_ROOT:
				return isIsRoot() ? Boolean.TRUE : Boolean.FALSE;
			case IS_TERMINATEDMPLICITLY:
				return isIsTerminatedmplicitly() ? Boolean.TRUE : Boolean.FALSE;
			case IS_TERMINATED_IMPLICIT:
				return isIsTerminatedImplicit() ? Boolean.TRUE : Boolean.FALSE;
			case HAS_ACTIVE_CHILDREN:
				return isHasActiveChildren() ? Boolean.TRUE : Boolean.FALSE;
			case HAS_ENDED:
				return isHasEnded() ? Boolean.TRUE : Boolean.FALSE;
			case HAS_PARENT:
				return isHasParent() ? Boolean.TRUE : Boolean.FALSE;
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
			case IS_SUSPENDED:
				setIsSuspended(((Boolean)newValue).booleanValue());
				return;
			case IS_ABLE_TO_REACTIVATE_PARENT:
				setIsAbleToReactivateParent(((Boolean)newValue).booleanValue());
				return;
			case IS_LOCKED:
				setIsLocked(((Boolean)newValue).booleanValue());
				return;
			case IS_ROOT:
				setIsRoot(((Boolean)newValue).booleanValue());
				return;
			case IS_TERMINATEDMPLICITLY:
				setIsTerminatedmplicitly(((Boolean)newValue).booleanValue());
				return;
			case IS_TERMINATED_IMPLICIT:
				setIsTerminatedImplicit(((Boolean)newValue).booleanValue());
				return;
			case HAS_ACTIVE_CHILDREN:
				setHasActiveChildren(((Boolean)newValue).booleanValue());
				return;
			case HAS_ENDED:
				setHasEnded(((Boolean)newValue).booleanValue());
				return;
			case HAS_PARENT:
				setHasParent(((Boolean)newValue).booleanValue());
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
			case IS_SUSPENDED:
				unsetIsSuspended();
				return;
			case IS_ABLE_TO_REACTIVATE_PARENT:
				unsetIsAbleToReactivateParent();
				return;
			case IS_LOCKED:
				unsetIsLocked();
				return;
			case IS_ROOT:
				unsetIsRoot();
				return;
			case IS_TERMINATEDMPLICITLY:
				unsetIsTerminatedmplicitly();
				return;
			case IS_TERMINATED_IMPLICIT:
				unsetIsTerminatedImplicit();
				return;
			case HAS_ACTIVE_CHILDREN:
				unsetHasActiveChildren();
				return;
			case HAS_ENDED:
				unsetHasEnded();
				return;
			case HAS_PARENT:
				unsetHasParent();
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
			case IS_SUSPENDED:
				return isSetIsSuspended();
			case IS_ABLE_TO_REACTIVATE_PARENT:
				return isSetIsAbleToReactivateParent();
			case IS_LOCKED:
				return isSetIsLocked();
			case IS_ROOT:
				return isSetIsRoot();
			case IS_TERMINATEDMPLICITLY:
				return isSetIsTerminatedmplicitly();
			case IS_TERMINATED_IMPLICIT:
				return isSetIsTerminatedImplicit();
			case HAS_ACTIVE_CHILDREN:
				return isSetHasActiveChildren();
			case HAS_ENDED:
				return isSetHasEnded();
			case HAS_PARENT:
				return isSetHasParent();
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
		result.append(" (isSuspended: ");
		if (isSuspended_set_) result.append(isSuspended); else result.append("<unset>");
		result.append(", isAbleToReactivateParent: ");
		if (isAbleToReactivateParent_set_) result.append(isAbleToReactivateParent); else result.append("<unset>");
		result.append(", isLocked: ");
		if (isLocked_set_) result.append(isLocked); else result.append("<unset>");
		result.append(", isRoot: ");
		if (isRoot_set_) result.append(isRoot); else result.append("<unset>");
		result.append(", isTerminatedmplicitly: ");
		if (isTerminatedmplicitly_set_) result.append(isTerminatedmplicitly); else result.append("<unset>");
		result.append(", isTerminatedImplicit: ");
		if (isTerminatedImplicit_set_) result.append(isTerminatedImplicit); else result.append("<unset>");
		result.append(", hasActiveChildren: ");
		if (hasActiveChildren_set_) result.append(hasActiveChildren); else result.append("<unset>");
		result.append(", hasEnded: ");
		if (hasEnded_set_) result.append(hasEnded); else result.append("<unset>");
		result.append(", hasParent: ");
		if (hasParent_set_) result.append(hasParent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // tokenStatuses

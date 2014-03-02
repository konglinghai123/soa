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
 * A representation of the model object '<em><b>Update Token Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTokenPath <em>Token Path</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getAction <em>Action</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTransitionName <em>Transition Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getComment <em>Comment</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessVariables <em>Process Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class UpdateTokenRequest extends DataObjectBase implements Serializable
{

	public final static int PROCESS_ID = 0;

	public final static int TOKEN_PATH = 1;

	public final static int ACTION = 2;

	public final static int TRANSITION_NAME = 3;

	public final static int COMMENT = 4;

	public final static int LOCAL_VARIABLES = 5;

	public final static int PROCESS_VARIABLES = 6;

	public final static int SDO_PROPERTY_COUNT = 7;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_ID = 0;

	/**
	 * The internal feature id for the '<em><b>Token Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOKEN_PATH = 1;

	/**
	 * The internal feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ACTION = 2;

	/**
	 * The internal feature id for the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TRANSITION_NAME = 3;

	/**
	 * The internal feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_COMMENT = 4;

	/**
	 * The internal feature id for the '<em><b>Local Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_LOCAL_VARIABLES = 5;

	/**
	 * The internal feature id for the '<em><b>Process Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_VARIABLES = 6;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 7;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_PROCESS_ID: return PROCESS_ID;
			case _INTERNAL_TOKEN_PATH: return TOKEN_PATH;
			case _INTERNAL_ACTION: return ACTION;
			case _INTERNAL_TRANSITION_NAME: return TRANSITION_NAME;
			case _INTERNAL_COMMENT: return COMMENT;
			case _INTERNAL_LOCAL_VARIABLES: return LOCAL_VARIABLES;
			case _INTERNAL_PROCESS_VARIABLES: return PROCESS_VARIABLES;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected static final long PROCESS_ID_DEFAULT_ = 0L;

	/**
	 * The cached value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected long processId = PROCESS_ID_DEFAULT_;

	/**
	 * This is true if the Process Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processId_set_ = false;

	/**
	 * The default value of the '{@link #getTokenPath() <em>Token Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_PATH_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTokenPath() <em>Token Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenPath()
	 * @generated
	 * @ordered
	 */
	protected String tokenPath = TOKEN_PATH_DEFAULT_;

	/**
	 * This is true if the Token Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenPath_set_ = false;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_DEFAULT_;

	/**
	 * This is true if the Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean action_set_ = false;

	/**
	 * The default value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected String transitionName = TRANSITION_NAME_DEFAULT_;

	/**
	 * This is true if the Transition Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transitionName_set_ = false;

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
	 * This is true if the Comment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comment_set_ = false;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	
	protected ProcessVarsType localVariables = null;
	
	/**
	 * This is true if the Local Variables containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localVariables_set_ = false;

	/**
	 * The cached value of the '{@link #getProcessVariables() <em>Process Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessVariables()
	 * @generated
	 * @ordered
	 */
	
	protected ProcessVarsType processVariables = null;
	
	/**
	 * This is true if the Process Variables containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processVariables_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTokenRequest()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getUpdateTokenRequest();
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
	 * Returns the value of the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Id</em>' attribute.
	 * @see #isSetProcessId()
	 * @see #unsetProcessId()
	 * @see #setProcessId(long)
	 * @generated
	 */
	public long getProcessId()
	{
		return processId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Id</em>' attribute.
	 * @see #isSetProcessId()
	 * @see #unsetProcessId()
	 * @see #getProcessId()
	 * @generated
	 */
	public void setProcessId(long newProcessId)
	{
		long oldProcessId = processId;
		processId = newProcessId;
		boolean oldProcessId_set_ = processId_set_;
		processId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PROCESS_ID, oldProcessId, processId, !oldProcessId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessId()
	 * @see #getProcessId()
	 * @see #setProcessId(long)
	 * @generated
	 */
	public void unsetProcessId()
	{
		long oldProcessId = processId;
		boolean oldProcessId_set_ = processId_set_;
		processId = PROCESS_ID_DEFAULT_;
		processId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_PROCESS_ID, oldProcessId, PROCESS_ID_DEFAULT_, oldProcessId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessId <em>Process Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Id</em>' attribute is set.
	 * @see #unsetProcessId()
	 * @see #getProcessId()
	 * @see #setProcessId(long)
	 * @generated
	 */
	public boolean isSetProcessId()
	{
		return processId_set_;
	}

	/**
	 * Returns the value of the '<em><b>Token Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Path</em>' attribute.
	 * @see #isSetTokenPath()
	 * @see #unsetTokenPath()
	 * @see #setTokenPath(String)
	 * @generated
	 */
	public String getTokenPath()
	{
		return tokenPath;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTokenPath <em>Token Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Path</em>' attribute.
	 * @see #isSetTokenPath()
	 * @see #unsetTokenPath()
	 * @see #getTokenPath()
	 * @generated
	 */
	public void setTokenPath(String newTokenPath)
	{
		String oldTokenPath = tokenPath;
		tokenPath = newTokenPath;
		boolean oldTokenPath_set_ = tokenPath_set_;
		tokenPath_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TOKEN_PATH, oldTokenPath, tokenPath, !oldTokenPath_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTokenPath <em>Token Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenPath()
	 * @see #getTokenPath()
	 * @see #setTokenPath(String)
	 * @generated
	 */
	public void unsetTokenPath()
	{
		String oldTokenPath = tokenPath;
		boolean oldTokenPath_set_ = tokenPath_set_;
		tokenPath = TOKEN_PATH_DEFAULT_;
		tokenPath_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_TOKEN_PATH, oldTokenPath, TOKEN_PATH_DEFAULT_, oldTokenPath_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTokenPath <em>Token Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Path</em>' attribute is set.
	 * @see #unsetTokenPath()
	 * @see #getTokenPath()
	 * @see #setTokenPath(String)
	 * @generated
	 */
	public boolean isSetTokenPath()
	{
		return tokenPath_set_;
	}

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(String)
	 * @generated
	 */
	public String getAction()
	{
		return action;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	public void setAction(String newAction)
	{
		String oldAction = action;
		action = newAction;
		boolean oldAction_set_ = action_set_;
		action_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ACTION, oldAction, action, !oldAction_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(String)
	 * @generated
	 */
	public void unsetAction()
	{
		String oldAction = action;
		boolean oldAction_set_ = action_set_;
		action = ACTION_DEFAULT_;
		action_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ACTION, oldAction, ACTION_DEFAULT_, oldAction_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(String)
	 * @generated
	 */
	public boolean isSetAction()
	{
		return action_set_;
	}

	/**
	 * Returns the value of the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Name</em>' attribute.
	 * @see #isSetTransitionName()
	 * @see #unsetTransitionName()
	 * @see #setTransitionName(String)
	 * @generated
	 */
	public String getTransitionName()
	{
		return transitionName;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTransitionName <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Name</em>' attribute.
	 * @see #isSetTransitionName()
	 * @see #unsetTransitionName()
	 * @see #getTransitionName()
	 * @generated
	 */
	public void setTransitionName(String newTransitionName)
	{
		String oldTransitionName = transitionName;
		transitionName = newTransitionName;
		boolean oldTransitionName_set_ = transitionName_set_;
		transitionName_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TRANSITION_NAME, oldTransitionName, transitionName, !oldTransitionName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTransitionName <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitionName()
	 * @see #getTransitionName()
	 * @see #setTransitionName(String)
	 * @generated
	 */
	public void unsetTransitionName()
	{
		String oldTransitionName = transitionName;
		boolean oldTransitionName_set_ = transitionName_set_;
		transitionName = TRANSITION_NAME_DEFAULT_;
		transitionName_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_TRANSITION_NAME, oldTransitionName, TRANSITION_NAME_DEFAULT_, oldTransitionName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getTransitionName <em>Transition Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transition Name</em>' attribute is set.
	 * @see #unsetTransitionName()
	 * @see #getTransitionName()
	 * @see #setTransitionName(String)
	 * @generated
	 */
	public boolean isSetTransitionName()
	{
		return transitionName_set_;
	}

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #setComment(String)
	 * @generated
	 */
	public String getComment()
	{
		return comment;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #getComment()
	 * @generated
	 */
	public void setComment(String newComment)
	{
		String oldComment = comment;
		comment = newComment;
		boolean oldComment_set_ = comment_set_;
		comment_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_COMMENT, oldComment, comment, !oldComment_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	public void unsetComment()
	{
		String oldComment = comment;
		boolean oldComment_set_ = comment_set_;
		comment = COMMENT_DEFAULT_;
		comment_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_COMMENT, oldComment, COMMENT_DEFAULT_, oldComment_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getComment <em>Comment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comment</em>' attribute is set.
	 * @see #unsetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	public boolean isSetComment()
	{
		return comment_set_;
	}

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference.
	 * @see #isSetLocalVariables()
	 * @see #unsetLocalVariables()
	 * @see #setLocalVariables(ProcessVarsType)
	 * @generated
	 */
	public ProcessVarsType getLocalVariables()
	{
		return localVariables;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetLocalVariables(ProcessVarsType newLocalVariables, ChangeContext changeContext)
	{
		ProcessVarsType oldLocalVariables = localVariables;
		localVariables = newLocalVariables;
		boolean oldLocalVariables_set_ = localVariables_set_;
		localVariables_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_LOCAL_VARIABLES, oldLocalVariables, newLocalVariables, !oldLocalVariables_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getLocalVariables <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Variables</em>' containment reference.
	 * @see #isSetLocalVariables()
	 * @see #unsetLocalVariables()
	 * @see #getLocalVariables()
	 * @generated
	 */
	public void setLocalVariables(ProcessVarsType newLocalVariables)
	{
		if (newLocalVariables != localVariables)
		{
			ChangeContext changeContext = null;
			if (localVariables != null)
				changeContext = inverseRemove(localVariables, this, OPPOSITE_FEATURE_BASE - _INTERNAL_LOCAL_VARIABLES, null, changeContext);
			if (newLocalVariables != null)
				changeContext = inverseAdd(newLocalVariables, this, OPPOSITE_FEATURE_BASE - _INTERNAL_LOCAL_VARIABLES, null, changeContext);
			changeContext = basicSetLocalVariables(newLocalVariables, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldLocalVariables_set_ = localVariables_set_;
			localVariables_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_LOCAL_VARIABLES, newLocalVariables, newLocalVariables, !oldLocalVariables_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetLocalVariables(ChangeContext changeContext)
	{
		ProcessVarsType oldLocalVariables = localVariables;
		localVariables = null;
		boolean oldLocalVariables_set_ = localVariables_set_;
		localVariables_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_LOCAL_VARIABLES, oldLocalVariables, null, !oldLocalVariables_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getLocalVariables <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalVariables()
	 * @see #getLocalVariables()
	 * @see #setLocalVariables(ProcessVarsType)
	 * @generated
	 */
	public void unsetLocalVariables()
	{
		if (localVariables != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(localVariables, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_LOCAL_VARIABLES, null, changeContext);
			changeContext = basicUnsetLocalVariables(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldLocalVariables_set_ = localVariables_set_;
			localVariables_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_LOCAL_VARIABLES, null, null, oldLocalVariables_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getLocalVariables <em>Local Variables</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Variables</em>' containment reference is set.
	 * @see #unsetLocalVariables()
	 * @see #getLocalVariables()
	 * @see #setLocalVariables(ProcessVarsType)
	 * @generated
	 */
	public boolean isSetLocalVariables()
	{
		return localVariables_set_;
	}

	/**
	 * Returns the value of the '<em><b>Process Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Variables</em>' containment reference.
	 * @see #isSetProcessVariables()
	 * @see #unsetProcessVariables()
	 * @see #setProcessVariables(ProcessVarsType)
	 * @generated
	 */
	public ProcessVarsType getProcessVariables()
	{
		return processVariables;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetProcessVariables(ProcessVarsType newProcessVariables, ChangeContext changeContext)
	{
		ProcessVarsType oldProcessVariables = processVariables;
		processVariables = newProcessVariables;
		boolean oldProcessVariables_set_ = processVariables_set_;
		processVariables_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_PROCESS_VARIABLES, oldProcessVariables, newProcessVariables, !oldProcessVariables_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessVariables <em>Process Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Variables</em>' containment reference.
	 * @see #isSetProcessVariables()
	 * @see #unsetProcessVariables()
	 * @see #getProcessVariables()
	 * @generated
	 */
	public void setProcessVariables(ProcessVarsType newProcessVariables)
	{
		if (newProcessVariables != processVariables)
		{
			ChangeContext changeContext = null;
			if (processVariables != null)
				changeContext = inverseRemove(processVariables, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_VARIABLES, null, changeContext);
			if (newProcessVariables != null)
				changeContext = inverseAdd(newProcessVariables, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_VARIABLES, null, changeContext);
			changeContext = basicSetProcessVariables(newProcessVariables, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldProcessVariables_set_ = processVariables_set_;
			processVariables_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_PROCESS_VARIABLES, newProcessVariables, newProcessVariables, !oldProcessVariables_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetProcessVariables(ChangeContext changeContext)
	{
		ProcessVarsType oldProcessVariables = processVariables;
		processVariables = null;
		boolean oldProcessVariables_set_ = processVariables_set_;
		processVariables_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_PROCESS_VARIABLES, oldProcessVariables, null, !oldProcessVariables_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessVariables <em>Process Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessVariables()
	 * @see #getProcessVariables()
	 * @see #setProcessVariables(ProcessVarsType)
	 * @generated
	 */
	public void unsetProcessVariables()
	{
		if (processVariables != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(processVariables, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS_VARIABLES, null, changeContext);
			changeContext = basicUnsetProcessVariables(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldProcessVariables_set_ = processVariables_set_;
			processVariables_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_PROCESS_VARIABLES, null, null, oldProcessVariables_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.UpdateTokenRequest#getProcessVariables <em>Process Variables</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Variables</em>' containment reference is set.
	 * @see #unsetProcessVariables()
	 * @see #getProcessVariables()
	 * @see #setProcessVariables(ProcessVarsType)
	 * @generated
	 */
	public boolean isSetProcessVariables()
	{
		return processVariables_set_;
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
			case LOCAL_VARIABLES:
				return basicUnsetLocalVariables(changeContext);
			case PROCESS_VARIABLES:
				return basicUnsetProcessVariables(changeContext);
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
			case PROCESS_ID:
				return new Long(getProcessId());
			case TOKEN_PATH:
				return getTokenPath();
			case ACTION:
				return getAction();
			case TRANSITION_NAME:
				return getTransitionName();
			case COMMENT:
				return getComment();
			case LOCAL_VARIABLES:
				return getLocalVariables();
			case PROCESS_VARIABLES:
				return getProcessVariables();
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
			case PROCESS_ID:
				setProcessId(((Long)newValue).longValue());
				return;
			case TOKEN_PATH:
				setTokenPath((String)newValue);
				return;
			case ACTION:
				setAction((String)newValue);
				return;
			case TRANSITION_NAME:
				setTransitionName((String)newValue);
				return;
			case COMMENT:
				setComment((String)newValue);
				return;
			case LOCAL_VARIABLES:
				setLocalVariables((ProcessVarsType)newValue);
				return;
			case PROCESS_VARIABLES:
				setProcessVariables((ProcessVarsType)newValue);
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
			case PROCESS_ID:
				unsetProcessId();
				return;
			case TOKEN_PATH:
				unsetTokenPath();
				return;
			case ACTION:
				unsetAction();
				return;
			case TRANSITION_NAME:
				unsetTransitionName();
				return;
			case COMMENT:
				unsetComment();
				return;
			case LOCAL_VARIABLES:
				unsetLocalVariables();
				return;
			case PROCESS_VARIABLES:
				unsetProcessVariables();
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
			case PROCESS_ID:
				return isSetProcessId();
			case TOKEN_PATH:
				return isSetTokenPath();
			case ACTION:
				return isSetAction();
			case TRANSITION_NAME:
				return isSetTransitionName();
			case COMMENT:
				return isSetComment();
			case LOCAL_VARIABLES:
				return isSetLocalVariables();
			case PROCESS_VARIABLES:
				return isSetProcessVariables();
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
		result.append(" (processId: ");
		if (processId_set_) result.append(processId); else result.append("<unset>");
		result.append(", tokenPath: ");
		if (tokenPath_set_) result.append(tokenPath); else result.append("<unset>");
		result.append(", action: ");
		if (action_set_) result.append(action); else result.append("<unset>");
		result.append(", transitionName: ");
		if (transitionName_set_) result.append(transitionName); else result.append("<unset>");
		result.append(", comment: ");
		if (comment_set_) result.append(comment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // UpdateTokenRequest

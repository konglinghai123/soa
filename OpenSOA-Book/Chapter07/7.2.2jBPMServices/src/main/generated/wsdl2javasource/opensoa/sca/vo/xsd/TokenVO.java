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
 * A representation of the model object '<em><b>Token VO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getTokenPath <em>Token Path</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getType_ <em>Type</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getComments <em>Comments</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getStart <em>Start</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getEnd <em>End</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getTokenTransitions <em>Token Transitions</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getTokenStatuses <em>Token Statuses</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TokenVO#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class TokenVO extends DataObjectBase implements Serializable
{

	public final static int TOKEN_PATH = 0;

	public final static int NODE_NAME = 1;

	public final static int TYPE = 2;

	public final static int COMMENTS = 3;

	public final static int START = 4;

	public final static int END = 5;

	public final static int TOKEN_TRANSITIONS = 6;

	public final static int TOKEN_STATUSES = 7;

	public final static int ID = 8;

	public final static int SDO_PROPERTY_COUNT = 9;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Token Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOKEN_PATH = 0;

	/**
	 * The internal feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NODE_NAME = 1;

	/**
	 * The internal feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TYPE = 2;

	/**
	 * The internal feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_COMMENTS = 3;

	/**
	 * The internal feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_START = 4;

	/**
	 * The internal feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_END = 5;

	/**
	 * The internal feature id for the '<em><b>Token Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOKEN_TRANSITIONS = 6;

	/**
	 * The internal feature id for the '<em><b>Token Statuses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOKEN_STATUSES = 7;

	/**
	 * The internal feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ID = 8;

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
			case _INTERNAL_TOKEN_PATH: return TOKEN_PATH;
			case _INTERNAL_NODE_NAME: return NODE_NAME;
			case _INTERNAL_TYPE: return TYPE;
			case _INTERNAL_COMMENTS: return COMMENTS;
			case _INTERNAL_START: return START;
			case _INTERNAL_END: return END;
			case _INTERNAL_TOKEN_TRANSITIONS: return TOKEN_TRANSITIONS;
			case _INTERNAL_TOKEN_STATUSES: return TOKEN_STATUSES;
			case _INTERNAL_ID: return ID;
		}
		return super.internalConvertIndex(internalIndex);
	}


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
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeName = NODE_NAME_DEFAULT_;

	/**
	 * This is true if the Node Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeName_set_ = false;

	/**
	 * The default value of the '{@link #getType_() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getType_() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_DEFAULT_;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean type_set_ = false;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	
	protected comments comments = null;
	
	/**
	 * This is true if the Comments containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comments_set_ = false;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_DEFAULT_;

	/**
	 * This is true if the Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean start_set_ = false;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_DEFAULT_;

	/**
	 * This is true if the End attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean end_set_ = false;

	/**
	 * The cached value of the '{@link #getTokenTransitions() <em>Token Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenTransitions()
	 * @generated
	 * @ordered
	 */
	
	protected tokenTransitions tokenTransitions = null;
	
	/**
	 * This is true if the Token Transitions containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenTransitions_set_ = false;

	/**
	 * The cached value of the '{@link #getTokenStatuses() <em>Token Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenStatuses()
	 * @generated
	 * @ordered
	 */
	
	protected tokenStatuses tokenStatuses = null;
	
	/**
	 * This is true if the Token Statuses containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenStatuses_set_ = false;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_DEFAULT_ = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_DEFAULT_;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean id_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVO()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getTokenVO();
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenPath <em>Token Path</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenPath <em>Token Path</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenPath <em>Token Path</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #isSetNodeName()
	 * @see #unsetNodeName()
	 * @see #setNodeName(String)
	 * @generated
	 */
	public String getNodeName()
	{
		return nodeName;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #isSetNodeName()
	 * @see #unsetNodeName()
	 * @see #getNodeName()
	 * @generated
	 */
	public void setNodeName(String newNodeName)
	{
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		boolean oldNodeName_set_ = nodeName_set_;
		nodeName_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_NODE_NAME, oldNodeName, nodeName, !oldNodeName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeName()
	 * @see #getNodeName()
	 * @see #setNodeName(String)
	 * @generated
	 */
	public void unsetNodeName()
	{
		String oldNodeName = nodeName;
		boolean oldNodeName_set_ = nodeName_set_;
		nodeName = NODE_NAME_DEFAULT_;
		nodeName_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_NODE_NAME, oldNodeName, NODE_NAME_DEFAULT_, oldNodeName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getNodeName <em>Node Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Name</em>' attribute is set.
	 * @see #unsetNodeName()
	 * @see #getNodeName()
	 * @see #setNodeName(String)
	 * @generated
	 */
	public boolean isSetNodeName()
	{
		return nodeName_set_;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @generated
	 */
	public String getType_()
	{
		return type;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getType_ <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType_()
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		boolean oldType_set_ = type_set_;
		type_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TYPE, oldType, type, !oldType_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getType_ <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType_()
	 * @see #setType(String)
	 * @generated
	 */
	public void unsetType()
	{
		String oldType = type;
		boolean oldType_set_ = type_set_;
		type = TYPE_DEFAULT_;
		type_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_TYPE, oldType, TYPE_DEFAULT_, oldType_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getType_ <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType_()
	 * @see #setType(String)
	 * @generated
	 */
	public boolean isSetType()
	{
		return type_set_;
	}

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #isSetComments()
	 * @see #unsetComments()
	 * @see #setComments(comments)
	 * @generated
	 */
	public comments getComments()
	{
		return comments;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetComments(comments newComments, ChangeContext changeContext)
	{
		comments oldComments = comments;
		comments = newComments;
		boolean oldComments_set_ = comments_set_;
		comments_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_COMMENTS, oldComments, newComments, !oldComments_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #isSetComments()
	 * @see #unsetComments()
	 * @see #getComments()
	 * @generated
	 */
	public void setComments(comments newComments)
	{
		if (newComments != comments)
		{
			ChangeContext changeContext = null;
			if (comments != null)
				changeContext = inverseRemove(comments, this, OPPOSITE_FEATURE_BASE - _INTERNAL_COMMENTS, null, changeContext);
			if (newComments != null)
				changeContext = inverseAdd(newComments, this, OPPOSITE_FEATURE_BASE - _INTERNAL_COMMENTS, null, changeContext);
			changeContext = basicSetComments(newComments, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldComments_set_ = comments_set_;
			comments_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_COMMENTS, newComments, newComments, !oldComments_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetComments(ChangeContext changeContext)
	{
		comments oldComments = comments;
		comments = null;
		boolean oldComments_set_ = comments_set_;
		comments_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_COMMENTS, oldComments, null, !oldComments_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComments()
	 * @see #getComments()
	 * @see #setComments(comments)
	 * @generated
	 */
	public void unsetComments()
	{
		if (comments != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(comments, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_COMMENTS, null, changeContext);
			changeContext = basicUnsetComments(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldComments_set_ = comments_set_;
			comments_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_COMMENTS, null, null, oldComments_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getComments <em>Comments</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comments</em>' containment reference is set.
	 * @see #unsetComments()
	 * @see #getComments()
	 * @see #setComments(comments)
	 * @generated
	 */
	public boolean isSetComments()
	{
		return comments_set_;
	}

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #setStart(String)
	 * @generated
	 */
	public String getStart()
	{
		return start;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #getStart()
	 * @generated
	 */
	public void setStart(String newStart)
	{
		String oldStart = start;
		start = newStart;
		boolean oldStart_set_ = start_set_;
		start_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_START, oldStart, start, !oldStart_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStart()
	 * @see #getStart()
	 * @see #setStart(String)
	 * @generated
	 */
	public void unsetStart()
	{
		String oldStart = start;
		boolean oldStart_set_ = start_set_;
		start = START_DEFAULT_;
		start_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_START, oldStart, START_DEFAULT_, oldStart_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getStart <em>Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start</em>' attribute is set.
	 * @see #unsetStart()
	 * @see #getStart()
	 * @see #setStart(String)
	 * @generated
	 */
	public boolean isSetStart()
	{
		return start_set_;
	}

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #isSetEnd()
	 * @see #unsetEnd()
	 * @see #setEnd(String)
	 * @generated
	 */
	public String getEnd()
	{
		return end;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #isSetEnd()
	 * @see #unsetEnd()
	 * @see #getEnd()
	 * @generated
	 */
	public void setEnd(String newEnd)
	{
		String oldEnd = end;
		end = newEnd;
		boolean oldEnd_set_ = end_set_;
		end_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_END, oldEnd, end, !oldEnd_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnd()
	 * @see #getEnd()
	 * @see #setEnd(String)
	 * @generated
	 */
	public void unsetEnd()
	{
		String oldEnd = end;
		boolean oldEnd_set_ = end_set_;
		end = END_DEFAULT_;
		end_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_END, oldEnd, END_DEFAULT_, oldEnd_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getEnd <em>End</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End</em>' attribute is set.
	 * @see #unsetEnd()
	 * @see #getEnd()
	 * @see #setEnd(String)
	 * @generated
	 */
	public boolean isSetEnd()
	{
		return end_set_;
	}

	/**
	 * Returns the value of the '<em><b>Token Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Transitions</em>' containment reference.
	 * @see #isSetTokenTransitions()
	 * @see #unsetTokenTransitions()
	 * @see #setTokenTransitions(tokenTransitions)
	 * @generated
	 */
	public tokenTransitions getTokenTransitions()
	{
		return tokenTransitions;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetTokenTransitions(tokenTransitions newTokenTransitions, ChangeContext changeContext)
	{
		tokenTransitions oldTokenTransitions = tokenTransitions;
		tokenTransitions = newTokenTransitions;
		boolean oldTokenTransitions_set_ = tokenTransitions_set_;
		tokenTransitions_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_TOKEN_TRANSITIONS, oldTokenTransitions, newTokenTransitions, !oldTokenTransitions_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenTransitions <em>Token Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Transitions</em>' containment reference.
	 * @see #isSetTokenTransitions()
	 * @see #unsetTokenTransitions()
	 * @see #getTokenTransitions()
	 * @generated
	 */
	public void setTokenTransitions(tokenTransitions newTokenTransitions)
	{
		if (newTokenTransitions != tokenTransitions)
		{
			ChangeContext changeContext = null;
			if (tokenTransitions != null)
				changeContext = inverseRemove(tokenTransitions, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_TRANSITIONS, null, changeContext);
			if (newTokenTransitions != null)
				changeContext = inverseAdd(newTokenTransitions, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_TRANSITIONS, null, changeContext);
			changeContext = basicSetTokenTransitions(newTokenTransitions, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldTokenTransitions_set_ = tokenTransitions_set_;
			tokenTransitions_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_TOKEN_TRANSITIONS, newTokenTransitions, newTokenTransitions, !oldTokenTransitions_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetTokenTransitions(ChangeContext changeContext)
	{
		tokenTransitions oldTokenTransitions = tokenTransitions;
		tokenTransitions = null;
		boolean oldTokenTransitions_set_ = tokenTransitions_set_;
		tokenTransitions_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_TOKEN_TRANSITIONS, oldTokenTransitions, null, !oldTokenTransitions_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenTransitions <em>Token Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenTransitions()
	 * @see #getTokenTransitions()
	 * @see #setTokenTransitions(tokenTransitions)
	 * @generated
	 */
	public void unsetTokenTransitions()
	{
		if (tokenTransitions != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(tokenTransitions, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_TRANSITIONS, null, changeContext);
			changeContext = basicUnsetTokenTransitions(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldTokenTransitions_set_ = tokenTransitions_set_;
			tokenTransitions_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_TOKEN_TRANSITIONS, null, null, oldTokenTransitions_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenTransitions <em>Token Transitions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Transitions</em>' containment reference is set.
	 * @see #unsetTokenTransitions()
	 * @see #getTokenTransitions()
	 * @see #setTokenTransitions(tokenTransitions)
	 * @generated
	 */
	public boolean isSetTokenTransitions()
	{
		return tokenTransitions_set_;
	}

	/**
	 * Returns the value of the '<em><b>Token Statuses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Statuses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Statuses</em>' containment reference.
	 * @see #isSetTokenStatuses()
	 * @see #unsetTokenStatuses()
	 * @see #setTokenStatuses(tokenStatuses)
	 * @generated
	 */
	public tokenStatuses getTokenStatuses()
	{
		return tokenStatuses;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetTokenStatuses(tokenStatuses newTokenStatuses, ChangeContext changeContext)
	{
		tokenStatuses oldTokenStatuses = tokenStatuses;
		tokenStatuses = newTokenStatuses;
		boolean oldTokenStatuses_set_ = tokenStatuses_set_;
		tokenStatuses_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_TOKEN_STATUSES, oldTokenStatuses, newTokenStatuses, !oldTokenStatuses_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenStatuses <em>Token Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Statuses</em>' containment reference.
	 * @see #isSetTokenStatuses()
	 * @see #unsetTokenStatuses()
	 * @see #getTokenStatuses()
	 * @generated
	 */
	public void setTokenStatuses(tokenStatuses newTokenStatuses)
	{
		if (newTokenStatuses != tokenStatuses)
		{
			ChangeContext changeContext = null;
			if (tokenStatuses != null)
				changeContext = inverseRemove(tokenStatuses, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_STATUSES, null, changeContext);
			if (newTokenStatuses != null)
				changeContext = inverseAdd(newTokenStatuses, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_STATUSES, null, changeContext);
			changeContext = basicSetTokenStatuses(newTokenStatuses, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldTokenStatuses_set_ = tokenStatuses_set_;
			tokenStatuses_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_TOKEN_STATUSES, newTokenStatuses, newTokenStatuses, !oldTokenStatuses_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetTokenStatuses(ChangeContext changeContext)
	{
		tokenStatuses oldTokenStatuses = tokenStatuses;
		tokenStatuses = null;
		boolean oldTokenStatuses_set_ = tokenStatuses_set_;
		tokenStatuses_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_TOKEN_STATUSES, oldTokenStatuses, null, !oldTokenStatuses_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenStatuses <em>Token Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenStatuses()
	 * @see #getTokenStatuses()
	 * @see #setTokenStatuses(tokenStatuses)
	 * @generated
	 */
	public void unsetTokenStatuses()
	{
		if (tokenStatuses != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(tokenStatuses, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_STATUSES, null, changeContext);
			changeContext = basicUnsetTokenStatuses(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldTokenStatuses_set_ = tokenStatuses_set_;
			tokenStatuses_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_TOKEN_STATUSES, null, null, oldTokenStatuses_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getTokenStatuses <em>Token Statuses</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Statuses</em>' containment reference is set.
	 * @see #unsetTokenStatuses()
	 * @see #getTokenStatuses()
	 * @see #setTokenStatuses(tokenStatuses)
	 * @generated
	 */
	public boolean isSetTokenStatuses()
	{
		return tokenStatuses_set_;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(long)
	 * @generated
	 */
	public long getId()
	{
		return id;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	public void setId(long newId)
	{
		long oldId = id;
		id = newId;
		boolean oldId_set_ = id_set_;
		id_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ID, oldId, id, !oldId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	public void unsetId()
	{
		long oldId = id;
		boolean oldId_set_ = id_set_;
		id = ID_DEFAULT_;
		id_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ID, oldId, ID_DEFAULT_, oldId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TokenVO#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	public boolean isSetId()
	{
		return id_set_;
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
			case COMMENTS:
				return basicUnsetComments(changeContext);
			case TOKEN_TRANSITIONS:
				return basicUnsetTokenTransitions(changeContext);
			case TOKEN_STATUSES:
				return basicUnsetTokenStatuses(changeContext);
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
			case TOKEN_PATH:
				return getTokenPath();
			case NODE_NAME:
				return getNodeName();
			case TYPE:
				return getType_();
			case COMMENTS:
				return getComments();
			case START:
				return getStart();
			case END:
				return getEnd();
			case TOKEN_TRANSITIONS:
				return getTokenTransitions();
			case TOKEN_STATUSES:
				return getTokenStatuses();
			case ID:
				return new Long(getId());
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
			case TOKEN_PATH:
				setTokenPath((String)newValue);
				return;
			case NODE_NAME:
				setNodeName((String)newValue);
				return;
			case TYPE:
				setType((String)newValue);
				return;
			case COMMENTS:
				setComments((comments)newValue);
				return;
			case START:
				setStart((String)newValue);
				return;
			case END:
				setEnd((String)newValue);
				return;
			case TOKEN_TRANSITIONS:
				setTokenTransitions((tokenTransitions)newValue);
				return;
			case TOKEN_STATUSES:
				setTokenStatuses((tokenStatuses)newValue);
				return;
			case ID:
				setId(((Long)newValue).longValue());
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
			case TOKEN_PATH:
				unsetTokenPath();
				return;
			case NODE_NAME:
				unsetNodeName();
				return;
			case TYPE:
				unsetType();
				return;
			case COMMENTS:
				unsetComments();
				return;
			case START:
				unsetStart();
				return;
			case END:
				unsetEnd();
				return;
			case TOKEN_TRANSITIONS:
				unsetTokenTransitions();
				return;
			case TOKEN_STATUSES:
				unsetTokenStatuses();
				return;
			case ID:
				unsetId();
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
			case TOKEN_PATH:
				return isSetTokenPath();
			case NODE_NAME:
				return isSetNodeName();
			case TYPE:
				return isSetType();
			case COMMENTS:
				return isSetComments();
			case START:
				return isSetStart();
			case END:
				return isSetEnd();
			case TOKEN_TRANSITIONS:
				return isSetTokenTransitions();
			case TOKEN_STATUSES:
				return isSetTokenStatuses();
			case ID:
				return isSetId();
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
		result.append(" (tokenPath: ");
		if (tokenPath_set_) result.append(tokenPath); else result.append("<unset>");
		result.append(", nodeName: ");
		if (nodeName_set_) result.append(nodeName); else result.append("<unset>");
		result.append(", type: ");
		if (type_set_) result.append(type); else result.append("<unset>");
		result.append(", start: ");
		if (start_set_) result.append(start); else result.append("<unset>");
		result.append(", end: ");
		if (end_set_) result.append(end); else result.append("<unset>");
		result.append(", id: ");
		if (id_set_) result.append(id); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TokenVO

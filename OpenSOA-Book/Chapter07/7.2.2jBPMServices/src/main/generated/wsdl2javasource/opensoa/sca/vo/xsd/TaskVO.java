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
 * A representation of the model object '<em><b>Task VO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getName <em>Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getDescription <em>Description</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getProcess <em>Process</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getComments <em>Comments</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getCreated <em>Created</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getEnd <em>End</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getPriority <em>Priority</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getStart <em>Start</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getActorId <em>Actor Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getPoolActors <em>Pool Actors</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getStatuses <em>Statuses</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getTokenVariables <em>Token Variables</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.TaskVO#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class TaskVO extends DataObjectBase implements Serializable
{

	public final static int NAME = 0;

	public final static int DESCRIPTION = 1;

	public final static int PROCESS = 2;

	public final static int COMMENTS = 3;

	public final static int CREATED = 4;

	public final static int DUE_DATE = 5;

	public final static int END = 6;

	public final static int PRIORITY = 7;

	public final static int START = 8;

	public final static int ACTOR_ID = 9;

	public final static int POOL_ACTORS = 10;

	public final static int TRANSITIONS = 11;

	public final static int STATUSES = 12;

	public final static int TOKEN_VARIABLES = 13;

	public final static int ID = 14;

	public final static int SDO_PROPERTY_COUNT = 15;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 0;

	/**
	 * The internal feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DESCRIPTION = 1;

	/**
	 * The internal feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS = 2;

	/**
	 * The internal feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_COMMENTS = 3;

	/**
	 * The internal feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CREATED = 4;

	/**
	 * The internal feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DUE_DATE = 5;

	/**
	 * The internal feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_END = 6;

	/**
	 * The internal feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PRIORITY = 7;

	/**
	 * The internal feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_START = 8;

	/**
	 * The internal feature id for the '<em><b>Actor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ACTOR_ID = 9;

	/**
	 * The internal feature id for the '<em><b>Pool Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_POOL_ACTORS = 10;

	/**
	 * The internal feature id for the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TRANSITIONS = 11;

	/**
	 * The internal feature id for the '<em><b>Statuses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_STATUSES = 12;

	/**
	 * The internal feature id for the '<em><b>Token Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TOKEN_VARIABLES = 13;

	/**
	 * The internal feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ID = 14;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 15;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_DESCRIPTION: return DESCRIPTION;
			case _INTERNAL_PROCESS: return PROCESS;
			case _INTERNAL_COMMENTS: return COMMENTS;
			case _INTERNAL_CREATED: return CREATED;
			case _INTERNAL_DUE_DATE: return DUE_DATE;
			case _INTERNAL_END: return END;
			case _INTERNAL_PRIORITY: return PRIORITY;
			case _INTERNAL_START: return START;
			case _INTERNAL_ACTOR_ID: return ACTOR_ID;
			case _INTERNAL_POOL_ACTORS: return POOL_ACTORS;
			case _INTERNAL_TRANSITIONS: return TRANSITIONS;
			case _INTERNAL_STATUSES: return STATUSES;
			case _INTERNAL_TOKEN_VARIABLES: return TOKEN_VARIABLES;
			case _INTERNAL_ID: return ID;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_DEFAULT_;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean name_set_ = false;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_DEFAULT_;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean description_set_ = false;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	
	protected process process = null;
	
	/**
	 * This is true if the Process containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean process_set_ = false;

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
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected String created = CREATED_DEFAULT_;

	/**
	 * This is true if the Created attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean created_set_ = false;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_DEFAULT_;

	/**
	 * This is true if the Due Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dueDate_set_ = false;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_DEFAULT_;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priority_set_ = false;

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
	 * The cached value of the '{@link #getPoolActors() <em>Pool Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolActors()
	 * @generated
	 * @ordered
	 */
	
	protected poolActors poolActors = null;
	
	/**
	 * This is true if the Pool Actors containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean poolActors_set_ = false;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	
	protected transitions transitions = null;
	
	/**
	 * This is true if the Transitions containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transitions_set_ = false;

	/**
	 * The cached value of the '{@link #getStatuses() <em>Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatuses()
	 * @generated
	 * @ordered
	 */
	
	protected statuses statuses = null;
	
	/**
	 * This is true if the Statuses containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statuses_set_ = false;

	/**
	 * The cached value of the '{@link #getTokenVariables() <em>Token Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenVariables()
	 * @generated
	 * @ordered
	 */
	
	protected ProcessVarsType tokenVariables = null;
	
	/**
	 * This is true if the Token Variables containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenVariables_set_ = false;

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
	public TaskVO()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getTaskVO();
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		boolean oldName_set_ = name_set_;
		name_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_NAME, oldName, name, !oldName_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public void unsetName()
	{
		String oldName = name;
		boolean oldName_set_ = name_set_;
		name = NAME_DEFAULT_;
		name_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_NAME, oldName, NAME_DEFAULT_, oldName_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public boolean isSetName()
	{
		return name_set_;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		boolean oldDescription_set_ = description_set_;
		description_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DESCRIPTION, oldDescription, description, !oldDescription_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	public void unsetDescription()
	{
		String oldDescription = description;
		boolean oldDescription_set_ = description_set_;
		description = DESCRIPTION_DEFAULT_;
		description_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_DESCRIPTION, oldDescription, DESCRIPTION_DEFAULT_, oldDescription_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	public boolean isSetDescription()
	{
		return description_set_;
	}

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #isSetProcess()
	 * @see #unsetProcess()
	 * @see #setProcess(process)
	 * @generated
	 */
	public process getProcess()
	{
		return process;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetProcess(process newProcess, ChangeContext changeContext)
	{
		process oldProcess = process;
		process = newProcess;
		boolean oldProcess_set_ = process_set_;
		process_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_PROCESS, oldProcess, newProcess, !oldProcess_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #isSetProcess()
	 * @see #unsetProcess()
	 * @see #getProcess()
	 * @generated
	 */
	public void setProcess(process newProcess)
	{
		if (newProcess != process)
		{
			ChangeContext changeContext = null;
			if (process != null)
				changeContext = inverseRemove(process, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS, null, changeContext);
			if (newProcess != null)
				changeContext = inverseAdd(newProcess, this, OPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS, null, changeContext);
			changeContext = basicSetProcess(newProcess, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldProcess_set_ = process_set_;
			process_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_PROCESS, newProcess, newProcess, !oldProcess_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetProcess(ChangeContext changeContext)
	{
		process oldProcess = process;
		process = null;
		boolean oldProcess_set_ = process_set_;
		process_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_PROCESS, oldProcess, null, !oldProcess_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcess()
	 * @see #getProcess()
	 * @see #setProcess(process)
	 * @generated
	 */
	public void unsetProcess()
	{
		if (process != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(process, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_PROCESS, null, changeContext);
			changeContext = basicUnsetProcess(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldProcess_set_ = process_set_;
			process_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_PROCESS, null, null, oldProcess_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getProcess <em>Process</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process</em>' containment reference is set.
	 * @see #unsetProcess()
	 * @see #getProcess()
	 * @see #setProcess(process)
	 * @generated
	 */
	public boolean isSetProcess()
	{
		return process_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getComments <em>Comments</em>}' containment reference.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getComments <em>Comments</em>}' containment reference.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getComments <em>Comments</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #isSetCreated()
	 * @see #unsetCreated()
	 * @see #setCreated(String)
	 * @generated
	 */
	public String getCreated()
	{
		return created;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #isSetCreated()
	 * @see #unsetCreated()
	 * @see #getCreated()
	 * @generated
	 */
	public void setCreated(String newCreated)
	{
		String oldCreated = created;
		created = newCreated;
		boolean oldCreated_set_ = created_set_;
		created_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CREATED, oldCreated, created, !oldCreated_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreated()
	 * @see #getCreated()
	 * @see #setCreated(String)
	 * @generated
	 */
	public void unsetCreated()
	{
		String oldCreated = created;
		boolean oldCreated_set_ = created_set_;
		created = CREATED_DEFAULT_;
		created_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_CREATED, oldCreated, CREATED_DEFAULT_, oldCreated_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getCreated <em>Created</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Created</em>' attribute is set.
	 * @see #unsetCreated()
	 * @see #getCreated()
	 * @see #setCreated(String)
	 * @generated
	 */
	public boolean isSetCreated()
	{
		return created_set_;
	}

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #isSetDueDate()
	 * @see #unsetDueDate()
	 * @see #setDueDate(String)
	 * @generated
	 */
	public String getDueDate()
	{
		return dueDate;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #isSetDueDate()
	 * @see #unsetDueDate()
	 * @see #getDueDate()
	 * @generated
	 */
	public void setDueDate(String newDueDate)
	{
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		boolean oldDueDate_set_ = dueDate_set_;
		dueDate_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DUE_DATE, oldDueDate, dueDate, !oldDueDate_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDueDate()
	 * @see #getDueDate()
	 * @see #setDueDate(String)
	 * @generated
	 */
	public void unsetDueDate()
	{
		String oldDueDate = dueDate;
		boolean oldDueDate_set_ = dueDate_set_;
		dueDate = DUE_DATE_DEFAULT_;
		dueDate_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_DUE_DATE, oldDueDate, DUE_DATE_DEFAULT_, oldDueDate_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getDueDate <em>Due Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Due Date</em>' attribute is set.
	 * @see #unsetDueDate()
	 * @see #getDueDate()
	 * @see #setDueDate(String)
	 * @generated
	 */
	public boolean isSetDueDate()
	{
		return dueDate_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getEnd <em>End</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getEnd <em>End</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getEnd <em>End</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	public int getPriority()
	{
		return priority;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(int newPriority)
	{
		int oldPriority = priority;
		priority = newPriority;
		boolean oldPriority_set_ = priority_set_;
		priority_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_PRIORITY, oldPriority, priority, !oldPriority_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	public void unsetPriority()
	{
		int oldPriority = priority;
		boolean oldPriority_set_ = priority_set_;
		priority = PRIORITY_DEFAULT_;
		priority_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_PRIORITY, oldPriority, PRIORITY_DEFAULT_, oldPriority_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	public boolean isSetPriority()
	{
		return priority_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getStart <em>Start</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getStart <em>Start</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getStart <em>Start</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getActorId <em>Actor Id</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getActorId <em>Actor Id</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getActorId <em>Actor Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Pool Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Actors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Actors</em>' containment reference.
	 * @see #isSetPoolActors()
	 * @see #unsetPoolActors()
	 * @see #setPoolActors(poolActors)
	 * @generated
	 */
	public poolActors getPoolActors()
	{
		return poolActors;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetPoolActors(poolActors newPoolActors, ChangeContext changeContext)
	{
		poolActors oldPoolActors = poolActors;
		poolActors = newPoolActors;
		boolean oldPoolActors_set_ = poolActors_set_;
		poolActors_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_POOL_ACTORS, oldPoolActors, newPoolActors, !oldPoolActors_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getPoolActors <em>Pool Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Actors</em>' containment reference.
	 * @see #isSetPoolActors()
	 * @see #unsetPoolActors()
	 * @see #getPoolActors()
	 * @generated
	 */
	public void setPoolActors(poolActors newPoolActors)
	{
		if (newPoolActors != poolActors)
		{
			ChangeContext changeContext = null;
			if (poolActors != null)
				changeContext = inverseRemove(poolActors, this, OPPOSITE_FEATURE_BASE - _INTERNAL_POOL_ACTORS, null, changeContext);
			if (newPoolActors != null)
				changeContext = inverseAdd(newPoolActors, this, OPPOSITE_FEATURE_BASE - _INTERNAL_POOL_ACTORS, null, changeContext);
			changeContext = basicSetPoolActors(newPoolActors, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldPoolActors_set_ = poolActors_set_;
			poolActors_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_POOL_ACTORS, newPoolActors, newPoolActors, !oldPoolActors_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetPoolActors(ChangeContext changeContext)
	{
		poolActors oldPoolActors = poolActors;
		poolActors = null;
		boolean oldPoolActors_set_ = poolActors_set_;
		poolActors_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_POOL_ACTORS, oldPoolActors, null, !oldPoolActors_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getPoolActors <em>Pool Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoolActors()
	 * @see #getPoolActors()
	 * @see #setPoolActors(poolActors)
	 * @generated
	 */
	public void unsetPoolActors()
	{
		if (poolActors != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(poolActors, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_POOL_ACTORS, null, changeContext);
			changeContext = basicUnsetPoolActors(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldPoolActors_set_ = poolActors_set_;
			poolActors_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_POOL_ACTORS, null, null, oldPoolActors_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getPoolActors <em>Pool Actors</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pool Actors</em>' containment reference is set.
	 * @see #unsetPoolActors()
	 * @see #getPoolActors()
	 * @see #setPoolActors(poolActors)
	 * @generated
	 */
	public boolean isSetPoolActors()
	{
		return poolActors_set_;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference.
	 * @see #isSetTransitions()
	 * @see #unsetTransitions()
	 * @see #setTransitions(transitions)
	 * @generated
	 */
	public transitions getTransitions()
	{
		return transitions;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetTransitions(transitions newTransitions, ChangeContext changeContext)
	{
		transitions oldTransitions = transitions;
		transitions = newTransitions;
		boolean oldTransitions_set_ = transitions_set_;
		transitions_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_TRANSITIONS, oldTransitions, newTransitions, !oldTransitions_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getTransitions <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions</em>' containment reference.
	 * @see #isSetTransitions()
	 * @see #unsetTransitions()
	 * @see #getTransitions()
	 * @generated
	 */
	public void setTransitions(transitions newTransitions)
	{
		if (newTransitions != transitions)
		{
			ChangeContext changeContext = null;
			if (transitions != null)
				changeContext = inverseRemove(transitions, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TRANSITIONS, null, changeContext);
			if (newTransitions != null)
				changeContext = inverseAdd(newTransitions, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TRANSITIONS, null, changeContext);
			changeContext = basicSetTransitions(newTransitions, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldTransitions_set_ = transitions_set_;
			transitions_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_TRANSITIONS, newTransitions, newTransitions, !oldTransitions_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetTransitions(ChangeContext changeContext)
	{
		transitions oldTransitions = transitions;
		transitions = null;
		boolean oldTransitions_set_ = transitions_set_;
		transitions_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_TRANSITIONS, oldTransitions, null, !oldTransitions_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getTransitions <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitions()
	 * @see #getTransitions()
	 * @see #setTransitions(transitions)
	 * @generated
	 */
	public void unsetTransitions()
	{
		if (transitions != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(transitions, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_TRANSITIONS, null, changeContext);
			changeContext = basicUnsetTransitions(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldTransitions_set_ = transitions_set_;
			transitions_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_TRANSITIONS, null, null, oldTransitions_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getTransitions <em>Transitions</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transitions</em>' containment reference is set.
	 * @see #unsetTransitions()
	 * @see #getTransitions()
	 * @see #setTransitions(transitions)
	 * @generated
	 */
	public boolean isSetTransitions()
	{
		return transitions_set_;
	}

	/**
	 * Returns the value of the '<em><b>Statuses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statuses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statuses</em>' containment reference.
	 * @see #isSetStatuses()
	 * @see #unsetStatuses()
	 * @see #setStatuses(statuses)
	 * @generated
	 */
	public statuses getStatuses()
	{
		return statuses;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetStatuses(statuses newStatuses, ChangeContext changeContext)
	{
		statuses oldStatuses = statuses;
		statuses = newStatuses;
		boolean oldStatuses_set_ = statuses_set_;
		statuses_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_STATUSES, oldStatuses, newStatuses, !oldStatuses_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getStatuses <em>Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statuses</em>' containment reference.
	 * @see #isSetStatuses()
	 * @see #unsetStatuses()
	 * @see #getStatuses()
	 * @generated
	 */
	public void setStatuses(statuses newStatuses)
	{
		if (newStatuses != statuses)
		{
			ChangeContext changeContext = null;
			if (statuses != null)
				changeContext = inverseRemove(statuses, this, OPPOSITE_FEATURE_BASE - _INTERNAL_STATUSES, null, changeContext);
			if (newStatuses != null)
				changeContext = inverseAdd(newStatuses, this, OPPOSITE_FEATURE_BASE - _INTERNAL_STATUSES, null, changeContext);
			changeContext = basicSetStatuses(newStatuses, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldStatuses_set_ = statuses_set_;
			statuses_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_STATUSES, newStatuses, newStatuses, !oldStatuses_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetStatuses(ChangeContext changeContext)
	{
		statuses oldStatuses = statuses;
		statuses = null;
		boolean oldStatuses_set_ = statuses_set_;
		statuses_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_STATUSES, oldStatuses, null, !oldStatuses_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getStatuses <em>Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatuses()
	 * @see #getStatuses()
	 * @see #setStatuses(statuses)
	 * @generated
	 */
	public void unsetStatuses()
	{
		if (statuses != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(statuses, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_STATUSES, null, changeContext);
			changeContext = basicUnsetStatuses(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldStatuses_set_ = statuses_set_;
			statuses_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_STATUSES, null, null, oldStatuses_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getStatuses <em>Statuses</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statuses</em>' containment reference is set.
	 * @see #unsetStatuses()
	 * @see #getStatuses()
	 * @see #setStatuses(statuses)
	 * @generated
	 */
	public boolean isSetStatuses()
	{
		return statuses_set_;
	}

	/**
	 * Returns the value of the '<em><b>Token Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Variables</em>' containment reference.
	 * @see #isSetTokenVariables()
	 * @see #unsetTokenVariables()
	 * @see #setTokenVariables(ProcessVarsType)
	 * @generated
	 */
	public ProcessVarsType getTokenVariables()
	{
		return tokenVariables;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetTokenVariables(ProcessVarsType newTokenVariables, ChangeContext changeContext)
	{
		ProcessVarsType oldTokenVariables = tokenVariables;
		tokenVariables = newTokenVariables;
		boolean oldTokenVariables_set_ = tokenVariables_set_;
		tokenVariables_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_TOKEN_VARIABLES, oldTokenVariables, newTokenVariables, !oldTokenVariables_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getTokenVariables <em>Token Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Variables</em>' containment reference.
	 * @see #isSetTokenVariables()
	 * @see #unsetTokenVariables()
	 * @see #getTokenVariables()
	 * @generated
	 */
	public void setTokenVariables(ProcessVarsType newTokenVariables)
	{
		if (newTokenVariables != tokenVariables)
		{
			ChangeContext changeContext = null;
			if (tokenVariables != null)
				changeContext = inverseRemove(tokenVariables, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_VARIABLES, null, changeContext);
			if (newTokenVariables != null)
				changeContext = inverseAdd(newTokenVariables, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_VARIABLES, null, changeContext);
			changeContext = basicSetTokenVariables(newTokenVariables, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldTokenVariables_set_ = tokenVariables_set_;
			tokenVariables_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_TOKEN_VARIABLES, newTokenVariables, newTokenVariables, !oldTokenVariables_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetTokenVariables(ChangeContext changeContext)
	{
		ProcessVarsType oldTokenVariables = tokenVariables;
		tokenVariables = null;
		boolean oldTokenVariables_set_ = tokenVariables_set_;
		tokenVariables_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_TOKEN_VARIABLES, oldTokenVariables, null, !oldTokenVariables_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getTokenVariables <em>Token Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenVariables()
	 * @see #getTokenVariables()
	 * @see #setTokenVariables(ProcessVarsType)
	 * @generated
	 */
	public void unsetTokenVariables()
	{
		if (tokenVariables != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(tokenVariables, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_TOKEN_VARIABLES, null, changeContext);
			changeContext = basicUnsetTokenVariables(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldTokenVariables_set_ = tokenVariables_set_;
			tokenVariables_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_TOKEN_VARIABLES, null, null, oldTokenVariables_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getTokenVariables <em>Token Variables</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Variables</em>' containment reference is set.
	 * @see #unsetTokenVariables()
	 * @see #getTokenVariables()
	 * @see #setTokenVariables(ProcessVarsType)
	 * @generated
	 */
	public boolean isSetTokenVariables()
	{
		return tokenVariables_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getId <em>Id</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.TaskVO#getId <em>Id</em>}' attribute is set.
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
			case PROCESS:
				return basicUnsetProcess(changeContext);
			case COMMENTS:
				return basicUnsetComments(changeContext);
			case POOL_ACTORS:
				return basicUnsetPoolActors(changeContext);
			case TRANSITIONS:
				return basicUnsetTransitions(changeContext);
			case STATUSES:
				return basicUnsetStatuses(changeContext);
			case TOKEN_VARIABLES:
				return basicUnsetTokenVariables(changeContext);
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
			case NAME:
				return getName();
			case DESCRIPTION:
				return getDescription();
			case PROCESS:
				return getProcess();
			case COMMENTS:
				return getComments();
			case CREATED:
				return getCreated();
			case DUE_DATE:
				return getDueDate();
			case END:
				return getEnd();
			case PRIORITY:
				return new Integer(getPriority());
			case START:
				return getStart();
			case ACTOR_ID:
				return getActorId();
			case POOL_ACTORS:
				return getPoolActors();
			case TRANSITIONS:
				return getTransitions();
			case STATUSES:
				return getStatuses();
			case TOKEN_VARIABLES:
				return getTokenVariables();
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
			case NAME:
				setName((String)newValue);
				return;
			case DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PROCESS:
				setProcess((process)newValue);
				return;
			case COMMENTS:
				setComments((comments)newValue);
				return;
			case CREATED:
				setCreated((String)newValue);
				return;
			case DUE_DATE:
				setDueDate((String)newValue);
				return;
			case END:
				setEnd((String)newValue);
				return;
			case PRIORITY:
				setPriority(((Integer)newValue).intValue());
				return;
			case START:
				setStart((String)newValue);
				return;
			case ACTOR_ID:
				setActorId((String)newValue);
				return;
			case POOL_ACTORS:
				setPoolActors((poolActors)newValue);
				return;
			case TRANSITIONS:
				setTransitions((transitions)newValue);
				return;
			case STATUSES:
				setStatuses((statuses)newValue);
				return;
			case TOKEN_VARIABLES:
				setTokenVariables((ProcessVarsType)newValue);
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
			case NAME:
				unsetName();
				return;
			case DESCRIPTION:
				unsetDescription();
				return;
			case PROCESS:
				unsetProcess();
				return;
			case COMMENTS:
				unsetComments();
				return;
			case CREATED:
				unsetCreated();
				return;
			case DUE_DATE:
				unsetDueDate();
				return;
			case END:
				unsetEnd();
				return;
			case PRIORITY:
				unsetPriority();
				return;
			case START:
				unsetStart();
				return;
			case ACTOR_ID:
				unsetActorId();
				return;
			case POOL_ACTORS:
				unsetPoolActors();
				return;
			case TRANSITIONS:
				unsetTransitions();
				return;
			case STATUSES:
				unsetStatuses();
				return;
			case TOKEN_VARIABLES:
				unsetTokenVariables();
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
			case NAME:
				return isSetName();
			case DESCRIPTION:
				return isSetDescription();
			case PROCESS:
				return isSetProcess();
			case COMMENTS:
				return isSetComments();
			case CREATED:
				return isSetCreated();
			case DUE_DATE:
				return isSetDueDate();
			case END:
				return isSetEnd();
			case PRIORITY:
				return isSetPriority();
			case START:
				return isSetStart();
			case ACTOR_ID:
				return isSetActorId();
			case POOL_ACTORS:
				return isSetPoolActors();
			case TRANSITIONS:
				return isSetTransitions();
			case STATUSES:
				return isSetStatuses();
			case TOKEN_VARIABLES:
				return isSetTokenVariables();
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
		result.append(" (name: ");
		if (name_set_) result.append(name); else result.append("<unset>");
		result.append(", description: ");
		if (description_set_) result.append(description); else result.append("<unset>");
		result.append(", created: ");
		if (created_set_) result.append(created); else result.append("<unset>");
		result.append(", dueDate: ");
		if (dueDate_set_) result.append(dueDate); else result.append("<unset>");
		result.append(", end: ");
		if (end_set_) result.append(end); else result.append("<unset>");
		result.append(", priority: ");
		if (priority_set_) result.append(priority); else result.append("<unset>");
		result.append(", start: ");
		if (start_set_) result.append(start); else result.append("<unset>");
		result.append(", actorId: ");
		if (actorId_set_) result.append(actorId); else result.append("<unset>");
		result.append(", id: ");
		if (id_set_) result.append(id); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TaskVO

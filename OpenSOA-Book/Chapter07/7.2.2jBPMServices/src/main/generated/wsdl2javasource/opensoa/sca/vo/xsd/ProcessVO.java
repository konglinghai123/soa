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
 * A representation of the model object '<em><b>Process VO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#getDescription <em>Description</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#isHasActions <em>Has Actions</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#isHasEvents <em>Has Events</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#getId <em>Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#getName <em>Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#getVersion <em>Version</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#getRunning <em>Running</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#getSuspended <em>Suspended</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessVO#getEnded <em>Ended</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ProcessVO extends DataObjectBase implements Serializable
{

	public final static int DESCRIPTION = 0;

	public final static int HAS_ACTIONS = 1;

	public final static int HAS_EVENTS = 2;

	public final static int ID = 3;

	public final static int NAME = 4;

	public final static int VERSION = 5;

	public final static int RUNNING = 6;

	public final static int SUSPENDED = 7;

	public final static int ENDED = 8;

	public final static int SDO_PROPERTY_COUNT = 9;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DESCRIPTION = 0;

	/**
	 * The internal feature id for the '<em><b>Has Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HAS_ACTIONS = 1;

	/**
	 * The internal feature id for the '<em><b>Has Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HAS_EVENTS = 2;

	/**
	 * The internal feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ID = 3;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 4;

	/**
	 * The internal feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_VERSION = 5;

	/**
	 * The internal feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_RUNNING = 6;

	/**
	 * The internal feature id for the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SUSPENDED = 7;

	/**
	 * The internal feature id for the '<em><b>Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ENDED = 8;

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
			case _INTERNAL_DESCRIPTION: return DESCRIPTION;
			case _INTERNAL_HAS_ACTIONS: return HAS_ACTIONS;
			case _INTERNAL_HAS_EVENTS: return HAS_EVENTS;
			case _INTERNAL_ID: return ID;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_VERSION: return VERSION;
			case _INTERNAL_RUNNING: return RUNNING;
			case _INTERNAL_SUSPENDED: return SUSPENDED;
			case _INTERNAL_ENDED: return ENDED;
		}
		return super.internalConvertIndex(internalIndex);
	}


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
	 * The default value of the '{@link #isHasActions() <em>Has Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasActions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ACTIONS_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isHasActions() <em>Has Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasActions()
	 * @generated
	 * @ordered
	 */
	protected boolean hasActions = HAS_ACTIONS_DEFAULT_;

	/**
	 * This is true if the Has Actions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasActions_set_ = false;

	/**
	 * The default value of the '{@link #isHasEvents() <em>Has Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_EVENTS_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isHasEvents() <em>Has Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasEvents()
	 * @generated
	 * @ordered
	 */
	protected boolean hasEvents = HAS_EVENTS_DEFAULT_;

	/**
	 * This is true if the Has Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasEvents_set_ = false;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_DEFAULT_;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean version_set_ = false;

	/**
	 * The default value of the '{@link #getRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNNING_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning()
	 * @generated
	 * @ordered
	 */
	protected int running = RUNNING_DEFAULT_;

	/**
	 * This is true if the Running attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean running_set_ = false;

	/**
	 * The default value of the '{@link #getSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final int SUSPENDED_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspended()
	 * @generated
	 * @ordered
	 */
	protected int suspended = SUSPENDED_DEFAULT_;

	/**
	 * This is true if the Suspended attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suspended_set_ = false;

	/**
	 * The default value of the '{@link #getEnded() <em>Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnded()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDED_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getEnded() <em>Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnded()
	 * @generated
	 * @ordered
	 */
	protected int ended = ENDED_DEFAULT_;

	/**
	 * This is true if the Ended attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ended_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessVO()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getProcessVO();
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getDescription <em>Description</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getDescription <em>Description</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Has Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Actions</em>' attribute.
	 * @see #isSetHasActions()
	 * @see #unsetHasActions()
	 * @see #setHasActions(boolean)
	 * @generated
	 */
	public boolean isHasActions()
	{
		return hasActions;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#isHasActions <em>Has Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Actions</em>' attribute.
	 * @see #isSetHasActions()
	 * @see #unsetHasActions()
	 * @see #isHasActions()
	 * @generated
	 */
	public void setHasActions(boolean newHasActions)
	{
		boolean oldHasActions = hasActions;
		hasActions = newHasActions;
		boolean oldHasActions_set_ = hasActions_set_;
		hasActions_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_HAS_ACTIONS, oldHasActions, hasActions, !oldHasActions_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#isHasActions <em>Has Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasActions()
	 * @see #isHasActions()
	 * @see #setHasActions(boolean)
	 * @generated
	 */
	public void unsetHasActions()
	{
		boolean oldHasActions = hasActions;
		boolean oldHasActions_set_ = hasActions_set_;
		hasActions = HAS_ACTIONS_DEFAULT_;
		hasActions_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_HAS_ACTIONS, oldHasActions, HAS_ACTIONS_DEFAULT_, oldHasActions_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#isHasActions <em>Has Actions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Actions</em>' attribute is set.
	 * @see #unsetHasActions()
	 * @see #isHasActions()
	 * @see #setHasActions(boolean)
	 * @generated
	 */
	public boolean isSetHasActions()
	{
		return hasActions_set_;
	}

	/**
	 * Returns the value of the '<em><b>Has Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Events</em>' attribute.
	 * @see #isSetHasEvents()
	 * @see #unsetHasEvents()
	 * @see #setHasEvents(boolean)
	 * @generated
	 */
	public boolean isHasEvents()
	{
		return hasEvents;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#isHasEvents <em>Has Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Events</em>' attribute.
	 * @see #isSetHasEvents()
	 * @see #unsetHasEvents()
	 * @see #isHasEvents()
	 * @generated
	 */
	public void setHasEvents(boolean newHasEvents)
	{
		boolean oldHasEvents = hasEvents;
		hasEvents = newHasEvents;
		boolean oldHasEvents_set_ = hasEvents_set_;
		hasEvents_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_HAS_EVENTS, oldHasEvents, hasEvents, !oldHasEvents_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#isHasEvents <em>Has Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasEvents()
	 * @see #isHasEvents()
	 * @see #setHasEvents(boolean)
	 * @generated
	 */
	public void unsetHasEvents()
	{
		boolean oldHasEvents = hasEvents;
		boolean oldHasEvents_set_ = hasEvents_set_;
		hasEvents = HAS_EVENTS_DEFAULT_;
		hasEvents_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_HAS_EVENTS, oldHasEvents, HAS_EVENTS_DEFAULT_, oldHasEvents_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#isHasEvents <em>Has Events</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Events</em>' attribute is set.
	 * @see #unsetHasEvents()
	 * @see #isHasEvents()
	 * @see #setHasEvents(boolean)
	 * @generated
	 */
	public boolean isSetHasEvents()
	{
		return hasEvents_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getId <em>Id</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getId <em>Id</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getName <em>Name</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(int)
	 * @generated
	 */
	public int getVersion()
	{
		return version;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	public void setVersion(int newVersion)
	{
		int oldVersion = version;
		version = newVersion;
		boolean oldVersion_set_ = version_set_;
		version_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_VERSION, oldVersion, version, !oldVersion_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(int)
	 * @generated
	 */
	public void unsetVersion()
	{
		int oldVersion = version;
		boolean oldVersion_set_ = version_set_;
		version = VERSION_DEFAULT_;
		version_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_VERSION, oldVersion, VERSION_DEFAULT_, oldVersion_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(int)
	 * @generated
	 */
	public boolean isSetVersion()
	{
		return version_set_;
	}

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #isSetRunning()
	 * @see #unsetRunning()
	 * @see #setRunning(int)
	 * @generated
	 */
	public int getRunning()
	{
		return running;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isSetRunning()
	 * @see #unsetRunning()
	 * @see #getRunning()
	 * @generated
	 */
	public void setRunning(int newRunning)
	{
		int oldRunning = running;
		running = newRunning;
		boolean oldRunning_set_ = running_set_;
		running_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_RUNNING, oldRunning, running, !oldRunning_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRunning()
	 * @see #getRunning()
	 * @see #setRunning(int)
	 * @generated
	 */
	public void unsetRunning()
	{
		int oldRunning = running;
		boolean oldRunning_set_ = running_set_;
		running = RUNNING_DEFAULT_;
		running_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_RUNNING, oldRunning, RUNNING_DEFAULT_, oldRunning_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getRunning <em>Running</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Running</em>' attribute is set.
	 * @see #unsetRunning()
	 * @see #getRunning()
	 * @see #setRunning(int)
	 * @generated
	 */
	public boolean isSetRunning()
	{
		return running_set_;
	}

	/**
	 * Returns the value of the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspended</em>' attribute.
	 * @see #isSetSuspended()
	 * @see #unsetSuspended()
	 * @see #setSuspended(int)
	 * @generated
	 */
	public int getSuspended()
	{
		return suspended;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getSuspended <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspended</em>' attribute.
	 * @see #isSetSuspended()
	 * @see #unsetSuspended()
	 * @see #getSuspended()
	 * @generated
	 */
	public void setSuspended(int newSuspended)
	{
		int oldSuspended = suspended;
		suspended = newSuspended;
		boolean oldSuspended_set_ = suspended_set_;
		suspended_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SUSPENDED, oldSuspended, suspended, !oldSuspended_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getSuspended <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuspended()
	 * @see #getSuspended()
	 * @see #setSuspended(int)
	 * @generated
	 */
	public void unsetSuspended()
	{
		int oldSuspended = suspended;
		boolean oldSuspended_set_ = suspended_set_;
		suspended = SUSPENDED_DEFAULT_;
		suspended_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_SUSPENDED, oldSuspended, SUSPENDED_DEFAULT_, oldSuspended_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getSuspended <em>Suspended</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suspended</em>' attribute is set.
	 * @see #unsetSuspended()
	 * @see #getSuspended()
	 * @see #setSuspended(int)
	 * @generated
	 */
	public boolean isSetSuspended()
	{
		return suspended_set_;
	}

	/**
	 * Returns the value of the '<em><b>Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended</em>' attribute.
	 * @see #isSetEnded()
	 * @see #unsetEnded()
	 * @see #setEnded(int)
	 * @generated
	 */
	public int getEnded()
	{
		return ended;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getEnded <em>Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ended</em>' attribute.
	 * @see #isSetEnded()
	 * @see #unsetEnded()
	 * @see #getEnded()
	 * @generated
	 */
	public void setEnded(int newEnded)
	{
		int oldEnded = ended;
		ended = newEnded;
		boolean oldEnded_set_ = ended_set_;
		ended_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ENDED, oldEnded, ended, !oldEnded_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getEnded <em>Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnded()
	 * @see #getEnded()
	 * @see #setEnded(int)
	 * @generated
	 */
	public void unsetEnded()
	{
		int oldEnded = ended;
		boolean oldEnded_set_ = ended_set_;
		ended = ENDED_DEFAULT_;
		ended_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_ENDED, oldEnded, ENDED_DEFAULT_, oldEnded_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessVO#getEnded <em>Ended</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ended</em>' attribute is set.
	 * @see #unsetEnded()
	 * @see #getEnded()
	 * @see #setEnded(int)
	 * @generated
	 */
	public boolean isSetEnded()
	{
		return ended_set_;
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
			case DESCRIPTION:
				return getDescription();
			case HAS_ACTIONS:
				return isHasActions() ? Boolean.TRUE : Boolean.FALSE;
			case HAS_EVENTS:
				return isHasEvents() ? Boolean.TRUE : Boolean.FALSE;
			case ID:
				return new Long(getId());
			case NAME:
				return getName();
			case VERSION:
				return new Integer(getVersion());
			case RUNNING:
				return new Integer(getRunning());
			case SUSPENDED:
				return new Integer(getSuspended());
			case ENDED:
				return new Integer(getEnded());
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
			case DESCRIPTION:
				setDescription((String)newValue);
				return;
			case HAS_ACTIONS:
				setHasActions(((Boolean)newValue).booleanValue());
				return;
			case HAS_EVENTS:
				setHasEvents(((Boolean)newValue).booleanValue());
				return;
			case ID:
				setId(((Long)newValue).longValue());
				return;
			case NAME:
				setName((String)newValue);
				return;
			case VERSION:
				setVersion(((Integer)newValue).intValue());
				return;
			case RUNNING:
				setRunning(((Integer)newValue).intValue());
				return;
			case SUSPENDED:
				setSuspended(((Integer)newValue).intValue());
				return;
			case ENDED:
				setEnded(((Integer)newValue).intValue());
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
			case DESCRIPTION:
				unsetDescription();
				return;
			case HAS_ACTIONS:
				unsetHasActions();
				return;
			case HAS_EVENTS:
				unsetHasEvents();
				return;
			case ID:
				unsetId();
				return;
			case NAME:
				unsetName();
				return;
			case VERSION:
				unsetVersion();
				return;
			case RUNNING:
				unsetRunning();
				return;
			case SUSPENDED:
				unsetSuspended();
				return;
			case ENDED:
				unsetEnded();
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
			case DESCRIPTION:
				return isSetDescription();
			case HAS_ACTIONS:
				return isSetHasActions();
			case HAS_EVENTS:
				return isSetHasEvents();
			case ID:
				return isSetId();
			case NAME:
				return isSetName();
			case VERSION:
				return isSetVersion();
			case RUNNING:
				return isSetRunning();
			case SUSPENDED:
				return isSetSuspended();
			case ENDED:
				return isSetEnded();
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
		result.append(" (description: ");
		if (description_set_) result.append(description); else result.append("<unset>");
		result.append(", hasActions: ");
		if (hasActions_set_) result.append(hasActions); else result.append("<unset>");
		result.append(", hasEvents: ");
		if (hasEvents_set_) result.append(hasEvents); else result.append("<unset>");
		result.append(", id: ");
		if (id_set_) result.append(id); else result.append("<unset>");
		result.append(", name: ");
		if (name_set_) result.append(name); else result.append("<unset>");
		result.append(", version: ");
		if (version_set_) result.append(version); else result.append("<unset>");
		result.append(", running: ");
		if (running_set_) result.append(running); else result.append("<unset>");
		result.append(", suspended: ");
		if (suspended_set_) result.append(suspended); else result.append("<unset>");
		result.append(", ended: ");
		if (ended_set_) result.append(ended); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProcessVO

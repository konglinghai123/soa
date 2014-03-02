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
 * A representation of the model object '<em><b>Process Instance VO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getStart <em>Start</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getEnd <em>End</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getId <em>Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getKey <em>Key</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVersion <em>Version</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getProcessVariables <em>Process Variables</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsTerminatedImplicitly <em>Is Terminated Implicitly</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isHasEnded <em>Has Ended</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsSuspended <em>Is Suspended</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getName <em>Name</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVer <em>Ver</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ProcessInstanceVO extends DataObjectBase implements Serializable
{

	public final static int START = 0;

	public final static int END = 1;

	public final static int ID = 2;

	public final static int KEY = 3;

	public final static int VERSION = 4;

	public final static int PROCESS_VARIABLES = 5;

	public final static int IS_TERMINATED_IMPLICITLY = 6;

	public final static int HAS_ENDED = 7;

	public final static int IS_SUSPENDED = 8;

	public final static int NAME = 9;

	public final static int VER = 10;

	public final static int SDO_PROPERTY_COUNT = 11;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_START = 0;

	/**
	 * The internal feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_END = 1;

	/**
	 * The internal feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ID = 2;

	/**
	 * The internal feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_KEY = 3;

	/**
	 * The internal feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_VERSION = 4;

	/**
	 * The internal feature id for the '<em><b>Process Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_PROCESS_VARIABLES = 5;

	/**
	 * The internal feature id for the '<em><b>Is Terminated Implicitly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_TERMINATED_IMPLICITLY = 6;

	/**
	 * The internal feature id for the '<em><b>Has Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HAS_ENDED = 7;

	/**
	 * The internal feature id for the '<em><b>Is Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_IS_SUSPENDED = 8;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = 9;

	/**
	 * The internal feature id for the '<em><b>Ver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_VER = 10;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 11;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_START: return START;
			case _INTERNAL_END: return END;
			case _INTERNAL_ID: return ID;
			case _INTERNAL_KEY: return KEY;
			case _INTERNAL_VERSION: return VERSION;
			case _INTERNAL_PROCESS_VARIABLES: return PROCESS_VARIABLES;
			case _INTERNAL_IS_TERMINATED_IMPLICITLY: return IS_TERMINATED_IMPLICITLY;
			case _INTERNAL_HAS_ENDED: return HAS_ENDED;
			case _INTERNAL_IS_SUSPENDED: return IS_SUSPENDED;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_VER: return VER;
		}
		return super.internalConvertIndex(internalIndex);
	}


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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_DEFAULT_;

	/**
	 * This is true if the Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean key_set_ = false;

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
	 * The default value of the '{@link #isIsTerminatedImplicitly() <em>Is Terminated Implicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminatedImplicitly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TERMINATED_IMPLICITLY_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isIsTerminatedImplicitly() <em>Is Terminated Implicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminatedImplicitly()
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminatedImplicitly = IS_TERMINATED_IMPLICITLY_DEFAULT_;

	/**
	 * This is true if the Is Terminated Implicitly attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminatedImplicitly_set_ = false;

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
	 * The default value of the '{@link #getVer() <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVer()
	 * @generated
	 * @ordered
	 */
	protected static final int VER_DEFAULT_ = 0;

	/**
	 * The cached value of the '{@link #getVer() <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVer()
	 * @generated
	 * @ordered
	 */
	protected int ver = VER_DEFAULT_;

	/**
	 * This is true if the Ver attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ver_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstanceVO()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getProcessInstanceVO();
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getStart <em>Start</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getStart <em>Start</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getStart <em>Start</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getEnd <em>End</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getEnd <em>End</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getEnd <em>End</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getId <em>Id</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getId <em>Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(String)
	 * @generated
	 */
	public String getKey()
	{
		return key;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	public void setKey(String newKey)
	{
		String oldKey = key;
		key = newKey;
		boolean oldKey_set_ = key_set_;
		key_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_KEY, oldKey, key, !oldKey_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	public void unsetKey()
	{
		String oldKey = key;
		boolean oldKey_set_ = key_set_;
		key = KEY_DEFAULT_;
		key_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_KEY, oldKey, KEY_DEFAULT_, oldKey_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	public boolean isSetKey()
	{
		return key_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVersion <em>Version</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVersion <em>Version</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getProcessVariables <em>Process Variables</em>}' containment reference.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getProcessVariables <em>Process Variables</em>}' containment reference.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getProcessVariables <em>Process Variables</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Is Terminated Implicitly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Terminated Implicitly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminated Implicitly</em>' attribute.
	 * @see #isSetIsTerminatedImplicitly()
	 * @see #unsetIsTerminatedImplicitly()
	 * @see #setIsTerminatedImplicitly(boolean)
	 * @generated
	 */
	public boolean isIsTerminatedImplicitly()
	{
		return isTerminatedImplicitly;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsTerminatedImplicitly <em>Is Terminated Implicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminated Implicitly</em>' attribute.
	 * @see #isSetIsTerminatedImplicitly()
	 * @see #unsetIsTerminatedImplicitly()
	 * @see #isIsTerminatedImplicitly()
	 * @generated
	 */
	public void setIsTerminatedImplicitly(boolean newIsTerminatedImplicitly)
	{
		boolean oldIsTerminatedImplicitly = isTerminatedImplicitly;
		isTerminatedImplicitly = newIsTerminatedImplicitly;
		boolean oldIsTerminatedImplicitly_set_ = isTerminatedImplicitly_set_;
		isTerminatedImplicitly_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_IS_TERMINATED_IMPLICITLY, oldIsTerminatedImplicitly, isTerminatedImplicitly, !oldIsTerminatedImplicitly_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsTerminatedImplicitly <em>Is Terminated Implicitly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTerminatedImplicitly()
	 * @see #isIsTerminatedImplicitly()
	 * @see #setIsTerminatedImplicitly(boolean)
	 * @generated
	 */
	public void unsetIsTerminatedImplicitly()
	{
		boolean oldIsTerminatedImplicitly = isTerminatedImplicitly;
		boolean oldIsTerminatedImplicitly_set_ = isTerminatedImplicitly_set_;
		isTerminatedImplicitly = IS_TERMINATED_IMPLICITLY_DEFAULT_;
		isTerminatedImplicitly_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_IS_TERMINATED_IMPLICITLY, oldIsTerminatedImplicitly, IS_TERMINATED_IMPLICITLY_DEFAULT_, oldIsTerminatedImplicitly_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsTerminatedImplicitly <em>Is Terminated Implicitly</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Terminated Implicitly</em>' attribute is set.
	 * @see #unsetIsTerminatedImplicitly()
	 * @see #isIsTerminatedImplicitly()
	 * @see #setIsTerminatedImplicitly(boolean)
	 * @generated
	 */
	public boolean isSetIsTerminatedImplicitly()
	{
		return isTerminatedImplicitly_set_;
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isHasEnded <em>Has Ended</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isHasEnded <em>Has Ended</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isHasEnded <em>Has Ended</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsSuspended <em>Is Suspended</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsSuspended <em>Is Suspended</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#isIsSuspended <em>Is Suspended</em>}' attribute is set.
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
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getName <em>Name</em>}' attribute.
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
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ver</em>' attribute.
	 * @see #isSetVer()
	 * @see #unsetVer()
	 * @see #setVer(int)
	 * @generated
	 */
	public int getVer()
	{
		return ver;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVer <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ver</em>' attribute.
	 * @see #isSetVer()
	 * @see #unsetVer()
	 * @see #getVer()
	 * @generated
	 */
	public void setVer(int newVer)
	{
		int oldVer = ver;
		ver = newVer;
		boolean oldVer_set_ = ver_set_;
		ver_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_VER, oldVer, ver, !oldVer_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVer <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVer()
	 * @see #getVer()
	 * @see #setVer(int)
	 * @generated
	 */
	public void unsetVer()
	{
		int oldVer = ver;
		boolean oldVer_set_ = ver_set_;
		ver = VER_DEFAULT_;
		ver_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_VER, oldVer, VER_DEFAULT_, oldVer_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ProcessInstanceVO#getVer <em>Ver</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ver</em>' attribute is set.
	 * @see #unsetVer()
	 * @see #getVer()
	 * @see #setVer(int)
	 * @generated
	 */
	public boolean isSetVer()
	{
		return ver_set_;
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
			case START:
				return getStart();
			case END:
				return getEnd();
			case ID:
				return new Long(getId());
			case KEY:
				return getKey();
			case VERSION:
				return new Integer(getVersion());
			case PROCESS_VARIABLES:
				return getProcessVariables();
			case IS_TERMINATED_IMPLICITLY:
				return isIsTerminatedImplicitly() ? Boolean.TRUE : Boolean.FALSE;
			case HAS_ENDED:
				return isHasEnded() ? Boolean.TRUE : Boolean.FALSE;
			case IS_SUSPENDED:
				return isIsSuspended() ? Boolean.TRUE : Boolean.FALSE;
			case NAME:
				return getName();
			case VER:
				return new Integer(getVer());
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
			case START:
				setStart((String)newValue);
				return;
			case END:
				setEnd((String)newValue);
				return;
			case ID:
				setId(((Long)newValue).longValue());
				return;
			case KEY:
				setKey((String)newValue);
				return;
			case VERSION:
				setVersion(((Integer)newValue).intValue());
				return;
			case PROCESS_VARIABLES:
				setProcessVariables((ProcessVarsType)newValue);
				return;
			case IS_TERMINATED_IMPLICITLY:
				setIsTerminatedImplicitly(((Boolean)newValue).booleanValue());
				return;
			case HAS_ENDED:
				setHasEnded(((Boolean)newValue).booleanValue());
				return;
			case IS_SUSPENDED:
				setIsSuspended(((Boolean)newValue).booleanValue());
				return;
			case NAME:
				setName((String)newValue);
				return;
			case VER:
				setVer(((Integer)newValue).intValue());
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
			case START:
				unsetStart();
				return;
			case END:
				unsetEnd();
				return;
			case ID:
				unsetId();
				return;
			case KEY:
				unsetKey();
				return;
			case VERSION:
				unsetVersion();
				return;
			case PROCESS_VARIABLES:
				unsetProcessVariables();
				return;
			case IS_TERMINATED_IMPLICITLY:
				unsetIsTerminatedImplicitly();
				return;
			case HAS_ENDED:
				unsetHasEnded();
				return;
			case IS_SUSPENDED:
				unsetIsSuspended();
				return;
			case NAME:
				unsetName();
				return;
			case VER:
				unsetVer();
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
			case START:
				return isSetStart();
			case END:
				return isSetEnd();
			case ID:
				return isSetId();
			case KEY:
				return isSetKey();
			case VERSION:
				return isSetVersion();
			case PROCESS_VARIABLES:
				return isSetProcessVariables();
			case IS_TERMINATED_IMPLICITLY:
				return isSetIsTerminatedImplicitly();
			case HAS_ENDED:
				return isSetHasEnded();
			case IS_SUSPENDED:
				return isSetIsSuspended();
			case NAME:
				return isSetName();
			case VER:
				return isSetVer();
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
		result.append(" (start: ");
		if (start_set_) result.append(start); else result.append("<unset>");
		result.append(", end: ");
		if (end_set_) result.append(end); else result.append("<unset>");
		result.append(", id: ");
		if (id_set_) result.append(id); else result.append("<unset>");
		result.append(", key: ");
		if (key_set_) result.append(key); else result.append("<unset>");
		result.append(", version: ");
		if (version_set_) result.append(version); else result.append("<unset>");
		result.append(", isTerminatedImplicitly: ");
		if (isTerminatedImplicitly_set_) result.append(isTerminatedImplicitly); else result.append("<unset>");
		result.append(", hasEnded: ");
		if (hasEnded_set_) result.append(hasEnded); else result.append("<unset>");
		result.append(", isSuspended: ");
		if (isSuspended_set_) result.append(isSuspended); else result.append("<unset>");
		result.append(", name: ");
		if (name_set_) result.append(name); else result.append("<unset>");
		result.append(", ver: ");
		if (ver_set_) result.append(ver); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProcessInstanceVO

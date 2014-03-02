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
 * A representation of the model object '<em><b>list Instance Tasks Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.listInstanceTasksResponse#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class listInstanceTasksResponse extends DataObjectBase implements Serializable
{

	public final static int TASKS = 0;

	public final static int SDO_PROPERTY_COUNT = 1;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TASKS = 0;

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
			case _INTERNAL_TASKS: return TASKS;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	
	protected TasksType tasks = null;
	
	/**
	 * This is true if the Tasks containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tasks_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listInstanceTasksResponse()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getlistInstanceTasksResponse();
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
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference.
	 * @see #isSetTasks()
	 * @see #unsetTasks()
	 * @see #setTasks(TasksType)
	 * @generated
	 */
	public TasksType getTasks()
	{
		return tasks;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetTasks(TasksType newTasks, ChangeContext changeContext)
	{
		TasksType oldTasks = tasks;
		tasks = newTasks;
		boolean oldTasks_set_ = tasks_set_;
		tasks_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_TASKS, oldTasks, newTasks, !oldTasks_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasksResponse#getTasks <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasks</em>' containment reference.
	 * @see #isSetTasks()
	 * @see #unsetTasks()
	 * @see #getTasks()
	 * @generated
	 */
	public void setTasks(TasksType newTasks)
	{
		if (newTasks != tasks)
		{
			ChangeContext changeContext = null;
			if (tasks != null)
				changeContext = inverseRemove(tasks, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TASKS, null, changeContext);
			if (newTasks != null)
				changeContext = inverseAdd(newTasks, this, OPPOSITE_FEATURE_BASE - _INTERNAL_TASKS, null, changeContext);
			changeContext = basicSetTasks(newTasks, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldTasks_set_ = tasks_set_;
			tasks_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_TASKS, newTasks, newTasks, !oldTasks_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetTasks(ChangeContext changeContext)
	{
		TasksType oldTasks = tasks;
		tasks = null;
		boolean oldTasks_set_ = tasks_set_;
		tasks_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_TASKS, oldTasks, null, !oldTasks_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasksResponse#getTasks <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTasks()
	 * @see #getTasks()
	 * @see #setTasks(TasksType)
	 * @generated
	 */
	public void unsetTasks()
	{
		if (tasks != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(tasks, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_TASKS, null, changeContext);
			changeContext = basicUnsetTasks(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldTasks_set_ = tasks_set_;
			tasks_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_TASKS, null, null, oldTasks_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.listInstanceTasksResponse#getTasks <em>Tasks</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tasks</em>' containment reference is set.
	 * @see #unsetTasks()
	 * @see #getTasks()
	 * @see #setTasks(TasksType)
	 * @generated
	 */
	public boolean isSetTasks()
	{
		return tasks_set_;
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
			case TASKS:
				return basicUnsetTasks(changeContext);
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
			case TASKS:
				return getTasks();
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
			case TASKS:
				setTasks((TasksType)newValue);
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
			case TASKS:
				unsetTasks();
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
			case TASKS:
				return isSetTasks();
		}
		return super.isSet(propertyIndex);
	}

} // listInstanceTasksResponse

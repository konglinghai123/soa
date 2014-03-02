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
 * A representation of the model object '<em><b>Employee Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.EmployeeDataType#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.EmployeeDataType#getTitle <em>Title</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.EmployeeDataType#getDepartment <em>Department</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.EmployeeDataType#getLocation <em>Location</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.EmployeeDataType#getFlex <em>Flex</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class EmployeeDataType extends DataObjectBase implements Serializable
{

	public final static int EMPLOYEE_ID = 0;

	public final static int TITLE = 1;

	public final static int DEPARTMENT = 2;

	public final static int LOCATION = 3;

	public final static int FLEX = 4;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_EMPLOYEE_ID = 0;

	/**
	 * The internal feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TITLE = 1;

	/**
	 * The internal feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DEPARTMENT = 2;

	/**
	 * The internal feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_LOCATION = 3;

	/**
	 * The internal feature id for the '<em><b>Flex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_FLEX = 4;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 5;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_EMPLOYEE_ID: return EMPLOYEE_ID;
			case _INTERNAL_TITLE: return TITLE;
			case _INTERNAL_DEPARTMENT: return DEPARTMENT;
			case _INTERNAL_LOCATION: return LOCATION;
			case _INTERNAL_FLEX: return FLEX;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_ID_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected String employeeId = EMPLOYEE_ID_DEFAULT_;

	/**
	 * This is true if the Employee Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean employeeId_set_ = false;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_DEFAULT_;

	/**
	 * This is true if the Title attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean title_set_ = false;

	/**
	 * The default value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected String department = DEPARTMENT_DEFAULT_;

	/**
	 * This is true if the Department attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean department_set_ = false;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_DEFAULT_;

	/**
	 * This is true if the Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean location_set_ = false;

	/**
	 * The cached value of the '{@link #getFlex() <em>Flex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlex()
	 * @generated
	 * @ordered
	 */
	
	protected FlexType flex = null;
	
	/**
	 * This is true if the Flex containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flex_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeDataType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getEmployeeDataType();
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
	 * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Id</em>' attribute.
	 * @see #isSetEmployeeId()
	 * @see #unsetEmployeeId()
	 * @see #setEmployeeId(String)
	 * @generated
	 */
	public String getEmployeeId()
	{
		return employeeId;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Id</em>' attribute.
	 * @see #isSetEmployeeId()
	 * @see #unsetEmployeeId()
	 * @see #getEmployeeId()
	 * @generated
	 */
	public void setEmployeeId(String newEmployeeId)
	{
		String oldEmployeeId = employeeId;
		employeeId = newEmployeeId;
		boolean oldEmployeeId_set_ = employeeId_set_;
		employeeId_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_EMPLOYEE_ID, oldEmployeeId, employeeId, !oldEmployeeId_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmployeeId()
	 * @see #getEmployeeId()
	 * @see #setEmployeeId(String)
	 * @generated
	 */
	public void unsetEmployeeId()
	{
		String oldEmployeeId = employeeId;
		boolean oldEmployeeId_set_ = employeeId_set_;
		employeeId = EMPLOYEE_ID_DEFAULT_;
		employeeId_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_EMPLOYEE_ID, oldEmployeeId, EMPLOYEE_ID_DEFAULT_, oldEmployeeId_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getEmployeeId <em>Employee Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Employee Id</em>' attribute is set.
	 * @see #unsetEmployeeId()
	 * @see #getEmployeeId()
	 * @see #setEmployeeId(String)
	 * @generated
	 */
	public boolean isSetEmployeeId()
	{
		return employeeId_set_;
	}

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @generated
	 */
	public void setTitle(String newTitle)
	{
		String oldTitle = title;
		title = newTitle;
		boolean oldTitle_set_ = title_set_;
		title_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TITLE, oldTitle, title, !oldTitle_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	public void unsetTitle()
	{
		String oldTitle = title;
		boolean oldTitle_set_ = title_set_;
		title = TITLE_DEFAULT_;
		title_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_TITLE, oldTitle, TITLE_DEFAULT_, oldTitle_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getTitle <em>Title</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Title</em>' attribute is set.
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	public boolean isSetTitle()
	{
		return title_set_;
	}

	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #isSetDepartment()
	 * @see #unsetDepartment()
	 * @see #setDepartment(String)
	 * @generated
	 */
	public String getDepartment()
	{
		return department;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #isSetDepartment()
	 * @see #unsetDepartment()
	 * @see #getDepartment()
	 * @generated
	 */
	public void setDepartment(String newDepartment)
	{
		String oldDepartment = department;
		department = newDepartment;
		boolean oldDepartment_set_ = department_set_;
		department_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DEPARTMENT, oldDepartment, department, !oldDepartment_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepartment()
	 * @see #getDepartment()
	 * @see #setDepartment(String)
	 * @generated
	 */
	public void unsetDepartment()
	{
		String oldDepartment = department;
		boolean oldDepartment_set_ = department_set_;
		department = DEPARTMENT_DEFAULT_;
		department_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_DEPARTMENT, oldDepartment, DEPARTMENT_DEFAULT_, oldDepartment_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getDepartment <em>Department</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Department</em>' attribute is set.
	 * @see #unsetDepartment()
	 * @see #getDepartment()
	 * @see #setDepartment(String)
	 * @generated
	 */
	public boolean isSetDepartment()
	{
		return department_set_;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #setLocation(String)
	 * @generated
	 */
	public String getLocation()
	{
		return location;
	}
	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @generated
	 */
	public void setLocation(String newLocation)
	{
		String oldLocation = location;
		location = newLocation;
		boolean oldLocation_set_ = location_set_;
		location_set_ = true;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_LOCATION, oldLocation, location, !oldLocation_set_);
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocation()
	 * @see #getLocation()
	 * @see #setLocation(String)
	 * @generated
	 */
	public void unsetLocation()
	{
		String oldLocation = location;
		boolean oldLocation_set_ = location_set_;
		location = LOCATION_DEFAULT_;
		location_set_ = false;
		if (isNotifying())
			notify(ChangeKind.UNSET, _INTERNAL_LOCATION, oldLocation, LOCATION_DEFAULT_, oldLocation_set_);
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getLocation <em>Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location</em>' attribute is set.
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @see #setLocation(String)
	 * @generated
	 */
	public boolean isSetLocation()
	{
		return location_set_;
	}

	/**
	 * Returns the value of the '<em><b>Flex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flex</em>' containment reference.
	 * @see #isSetFlex()
	 * @see #unsetFlex()
	 * @see #setFlex(FlexType)
	 * @generated
	 */
	public FlexType getFlex()
	{
		return flex;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetFlex(FlexType newFlex, ChangeContext changeContext)
	{
		FlexType oldFlex = flex;
		flex = newFlex;
		boolean oldFlex_set_ = flex_set_;
		flex_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_FLEX, oldFlex, newFlex, !oldFlex_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getFlex <em>Flex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flex</em>' containment reference.
	 * @see #isSetFlex()
	 * @see #unsetFlex()
	 * @see #getFlex()
	 * @generated
	 */
	public void setFlex(FlexType newFlex)
	{
		if (newFlex != flex)
		{
			ChangeContext changeContext = null;
			if (flex != null)
				changeContext = inverseRemove(flex, this, OPPOSITE_FEATURE_BASE - _INTERNAL_FLEX, null, changeContext);
			if (newFlex != null)
				changeContext = inverseAdd(newFlex, this, OPPOSITE_FEATURE_BASE - _INTERNAL_FLEX, null, changeContext);
			changeContext = basicSetFlex(newFlex, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldFlex_set_ = flex_set_;
			flex_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_FLEX, newFlex, newFlex, !oldFlex_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetFlex(ChangeContext changeContext)
	{
		FlexType oldFlex = flex;
		flex = null;
		boolean oldFlex_set_ = flex_set_;
		flex_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_FLEX, oldFlex, null, !oldFlex_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getFlex <em>Flex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlex()
	 * @see #getFlex()
	 * @see #setFlex(FlexType)
	 * @generated
	 */
	public void unsetFlex()
	{
		if (flex != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(flex, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_FLEX, null, changeContext);
			changeContext = basicUnsetFlex(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldFlex_set_ = flex_set_;
			flex_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_FLEX, null, null, oldFlex_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.EmployeeDataType#getFlex <em>Flex</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flex</em>' containment reference is set.
	 * @see #unsetFlex()
	 * @see #getFlex()
	 * @see #setFlex(FlexType)
	 * @generated
	 */
	public boolean isSetFlex()
	{
		return flex_set_;
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
			case FLEX:
				return basicUnsetFlex(changeContext);
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
			case EMPLOYEE_ID:
				return getEmployeeId();
			case TITLE:
				return getTitle();
			case DEPARTMENT:
				return getDepartment();
			case LOCATION:
				return getLocation();
			case FLEX:
				return getFlex();
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
			case EMPLOYEE_ID:
				setEmployeeId((String)newValue);
				return;
			case TITLE:
				setTitle((String)newValue);
				return;
			case DEPARTMENT:
				setDepartment((String)newValue);
				return;
			case LOCATION:
				setLocation((String)newValue);
				return;
			case FLEX:
				setFlex((FlexType)newValue);
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
			case EMPLOYEE_ID:
				unsetEmployeeId();
				return;
			case TITLE:
				unsetTitle();
				return;
			case DEPARTMENT:
				unsetDepartment();
				return;
			case LOCATION:
				unsetLocation();
				return;
			case FLEX:
				unsetFlex();
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
			case EMPLOYEE_ID:
				return isSetEmployeeId();
			case TITLE:
				return isSetTitle();
			case DEPARTMENT:
				return isSetDepartment();
			case LOCATION:
				return isSetLocation();
			case FLEX:
				return isSetFlex();
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
		result.append(" (employeeId: ");
		if (employeeId_set_) result.append(employeeId); else result.append("<unset>");
		result.append(", title: ");
		if (title_set_) result.append(title); else result.append("<unset>");
		result.append(", department: ");
		if (department_set_) result.append(department); else result.append("<unset>");
		result.append(", location: ");
		if (location_set_) result.append(location); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EmployeeDataType

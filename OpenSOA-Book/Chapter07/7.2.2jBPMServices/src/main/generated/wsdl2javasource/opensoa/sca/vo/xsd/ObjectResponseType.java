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
 * A representation of the model object '<em><b>Object Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.sca.vo.xsd.ObjectResponseType#getEmployee <em>Employee</em>}</li>
 *   <li>{@link opensoa.sca.vo.xsd.ObjectResponseType#getApplicant <em>Applicant</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public class ObjectResponseType extends DataObjectBase implements Serializable
{

	public final static int EMPLOYEE = 0;

	public final static int APPLICANT = 1;

	public final static int SDO_PROPERTY_COUNT = 2;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Employee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_EMPLOYEE = 0;

	/**
	 * The internal feature id for the '<em><b>Applicant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_APPLICANT = 1;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = 2;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_EMPLOYEE: return EMPLOYEE;
			case _INTERNAL_APPLICANT: return APPLICANT;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	
	protected EmployeeType employee = null;
	
	/**
	 * This is true if the Employee containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean employee_set_ = false;

	/**
	 * The cached value of the '{@link #getApplicant() <em>Applicant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicant()
	 * @generated
	 * @ordered
	 */
	
	protected ApplicantType applicant = null;
	
	/**
	 * This is true if the Applicant containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicant_set_ = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectResponseType()
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
		return ((XsdFactory)XsdFactory.INSTANCE).getObjectResponseType();
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
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference.
	 * @see #isSetEmployee()
	 * @see #unsetEmployee()
	 * @see #setEmployee(EmployeeType)
	 * @generated
	 */
	public EmployeeType getEmployee()
	{
		return employee;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetEmployee(EmployeeType newEmployee, ChangeContext changeContext)
	{
		EmployeeType oldEmployee = employee;
		employee = newEmployee;
		boolean oldEmployee_set_ = employee_set_;
		employee_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_EMPLOYEE, oldEmployee, newEmployee, !oldEmployee_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ObjectResponseType#getEmployee <em>Employee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' containment reference.
	 * @see #isSetEmployee()
	 * @see #unsetEmployee()
	 * @see #getEmployee()
	 * @generated
	 */
	public void setEmployee(EmployeeType newEmployee)
	{
		if (newEmployee != employee)
		{
			ChangeContext changeContext = null;
			if (employee != null)
				changeContext = inverseRemove(employee, this, OPPOSITE_FEATURE_BASE - _INTERNAL_EMPLOYEE, null, changeContext);
			if (newEmployee != null)
				changeContext = inverseAdd(newEmployee, this, OPPOSITE_FEATURE_BASE - _INTERNAL_EMPLOYEE, null, changeContext);
			changeContext = basicSetEmployee(newEmployee, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldEmployee_set_ = employee_set_;
			employee_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_EMPLOYEE, newEmployee, newEmployee, !oldEmployee_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetEmployee(ChangeContext changeContext)
	{
		EmployeeType oldEmployee = employee;
		employee = null;
		boolean oldEmployee_set_ = employee_set_;
		employee_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_EMPLOYEE, oldEmployee, null, !oldEmployee_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ObjectResponseType#getEmployee <em>Employee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmployee()
	 * @see #getEmployee()
	 * @see #setEmployee(EmployeeType)
	 * @generated
	 */
	public void unsetEmployee()
	{
		if (employee != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(employee, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_EMPLOYEE, null, changeContext);
			changeContext = basicUnsetEmployee(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldEmployee_set_ = employee_set_;
			employee_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_EMPLOYEE, null, null, oldEmployee_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ObjectResponseType#getEmployee <em>Employee</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Employee</em>' containment reference is set.
	 * @see #unsetEmployee()
	 * @see #getEmployee()
	 * @see #setEmployee(EmployeeType)
	 * @generated
	 */
	public boolean isSetEmployee()
	{
		return employee_set_;
	}

	/**
	 * Returns the value of the '<em><b>Applicant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicant</em>' containment reference.
	 * @see #isSetApplicant()
	 * @see #unsetApplicant()
	 * @see #setApplicant(ApplicantType)
	 * @generated
	 */
	public ApplicantType getApplicant()
	{
		return applicant;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicSetApplicant(ApplicantType newApplicant, ChangeContext changeContext)
	{
		ApplicantType oldApplicant = applicant;
		applicant = newApplicant;
		boolean oldApplicant_set_ = applicant_set_;
		applicant_set_ = true;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.SET, _INTERNAL_APPLICANT, oldApplicant, newApplicant, !oldApplicant_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Sets the value of the '{@link opensoa.sca.vo.xsd.ObjectResponseType#getApplicant <em>Applicant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicant</em>' containment reference.
	 * @see #isSetApplicant()
	 * @see #unsetApplicant()
	 * @see #getApplicant()
	 * @generated
	 */
	public void setApplicant(ApplicantType newApplicant)
	{
		if (newApplicant != applicant)
		{
			ChangeContext changeContext = null;
			if (applicant != null)
				changeContext = inverseRemove(applicant, this, OPPOSITE_FEATURE_BASE - _INTERNAL_APPLICANT, null, changeContext);
			if (newApplicant != null)
				changeContext = inverseAdd(newApplicant, this, OPPOSITE_FEATURE_BASE - _INTERNAL_APPLICANT, null, changeContext);
			changeContext = basicSetApplicant(newApplicant, changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
		{
			boolean oldApplicant_set_ = applicant_set_;
			applicant_set_ = true;
			if (isNotifying())
				notify(ChangeKind.SET, _INTERNAL_APPLICANT, newApplicant, newApplicant, !oldApplicant_set_);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeContext basicUnsetApplicant(ChangeContext changeContext)
	{
		ApplicantType oldApplicant = applicant;
		applicant = null;
		boolean oldApplicant_set_ = applicant_set_;
		applicant_set_ = false;
		if (isNotifying())
		{
			addNotification(this, ChangeKind.UNSET, _INTERNAL_APPLICANT, oldApplicant, null, !oldApplicant_set_, changeContext);
		}
		return changeContext;
	}

	/**
	 * Unsets the value of the '{@link opensoa.sca.vo.xsd.ObjectResponseType#getApplicant <em>Applicant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicant()
	 * @see #getApplicant()
	 * @see #setApplicant(ApplicantType)
	 * @generated
	 */
	public void unsetApplicant()
	{
		if (applicant != null)
		{
			ChangeContext changeContext = null;
			changeContext = inverseRemove(applicant, this, EOPPOSITE_FEATURE_BASE - _INTERNAL_APPLICANT, null, changeContext);
			changeContext = basicUnsetApplicant(changeContext);
			if (changeContext != null) dispatch(changeContext);
		}
		else
    	{
			boolean oldApplicant_set_ = applicant_set_;
			applicant_set_ = false;
			if (isNotifying())
				notify(ChangeKind.UNSET, _INTERNAL_APPLICANT, null, null, oldApplicant_set_);
    	}
	}

	/**
	 * Returns whether the value of the '{@link opensoa.sca.vo.xsd.ObjectResponseType#getApplicant <em>Applicant</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicant</em>' containment reference is set.
	 * @see #unsetApplicant()
	 * @see #getApplicant()
	 * @see #setApplicant(ApplicantType)
	 * @generated
	 */
	public boolean isSetApplicant()
	{
		return applicant_set_;
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
			case EMPLOYEE:
				return basicUnsetEmployee(changeContext);
			case APPLICANT:
				return basicUnsetApplicant(changeContext);
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
			case EMPLOYEE:
				return getEmployee();
			case APPLICANT:
				return getApplicant();
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
			case EMPLOYEE:
				setEmployee((EmployeeType)newValue);
				return;
			case APPLICANT:
				setApplicant((ApplicantType)newValue);
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
			case EMPLOYEE:
				unsetEmployee();
				return;
			case APPLICANT:
				unsetApplicant();
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
			case EMPLOYEE:
				return isSetEmployee();
			case APPLICANT:
				return isSetApplicant();
		}
		return super.isSet(propertyIndex);
	}

} // ObjectResponseType

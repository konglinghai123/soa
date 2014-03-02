/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.book.chapter4.issue.impl;

import commonj.sdo.Type;

import opensoa.book.chapter4.issue.HeaderType;
import opensoa.book.chapter4.issue.IssueFactory;
import opensoa.book.chapter4.issue.ProblemType;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opensoa.book.chapter4.issue.impl.ProblemTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.ProblemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.ProblemTypeImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.ProblemTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.ProblemTypeImpl#getSubcategory <em>Subcategory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemTypeImpl extends DataObjectBase implements ProblemType
{

	public final static int HEADER = 0;

	public final static int DESCRIPTION = 1;

	public final static int SEVERITY = 2;

	public final static int CATEGORY = 3;

	public final static int SUBCATEGORY = 4;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_HEADER = 0;

	/**
	 * The internal feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_DESCRIPTION = 1;

	/**
	 * The internal feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SEVERITY = 2;

	/**
	 * The internal feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CATEGORY = 3;

	/**
	 * The internal feature id for the '<em><b>Subcategory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SUBCATEGORY = 4;

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
			case _INTERNAL_HEADER: return HEADER;
			case _INTERNAL_DESCRIPTION: return DESCRIPTION;
			case _INTERNAL_SEVERITY: return SEVERITY;
			case _INTERNAL_CATEGORY: return CATEGORY;
			case _INTERNAL_SUBCATEGORY: return SUBCATEGORY;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	
	protected HeaderType header = null;
	
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
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_DEFAULT_ = "low";

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_DEFAULT_;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_DEFAULT_;

	/**
	 * The default value of the '{@link #getSubcategory() <em>Subcategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategory()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBCATEGORY_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getSubcategory() <em>Subcategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategory()
	 * @generated
	 * @ordered
	 */
	protected String subcategory = SUBCATEGORY_DEFAULT_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemTypeImpl()
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
		return ((IssueFactoryImpl)IssueFactory.INSTANCE).getProblemType();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader()
	{
		return header;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader)
	{
		HeaderType oldHeader = header;
		header = newHeader;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_HEADER, oldHeader, header);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_DESCRIPTION, oldDescription, description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverity()
	{
		return severity;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(String newSeverity)
	{
		String oldSeverity = severity;
		severity = newSeverity;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SEVERITY, oldSeverity, severity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory()
	{
		return category;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory)
	{
		String oldCategory = category;
		category = newCategory;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CATEGORY, oldCategory, category);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubcategory()
	{
		return subcategory;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubcategory(String newSubcategory)
	{
		String oldSubcategory = subcategory;
		subcategory = newSubcategory;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SUBCATEGORY, oldSubcategory, subcategory);
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
			case HEADER:
				return getHeader();
			case DESCRIPTION:
				return getDescription();
			case SEVERITY:
				return getSeverity();
			case CATEGORY:
				return getCategory();
			case SUBCATEGORY:
				return getSubcategory();
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
			case HEADER:
				setHeader((HeaderType)newValue);
				return;
			case DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SEVERITY:
				setSeverity((String)newValue);
				return;
			case CATEGORY:
				setCategory((String)newValue);
				return;
			case SUBCATEGORY:
				setSubcategory((String)newValue);
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
			case HEADER:
				setHeader((HeaderType)null);
				return;
			case DESCRIPTION:
				setDescription(DESCRIPTION_DEFAULT_);
				return;
			case SEVERITY:
				setSeverity(SEVERITY_DEFAULT_);
				return;
			case CATEGORY:
				setCategory(CATEGORY_DEFAULT_);
				return;
			case SUBCATEGORY:
				setSubcategory(SUBCATEGORY_DEFAULT_);
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
			case HEADER:
				return header != null;
			case DESCRIPTION:
				return DESCRIPTION_DEFAULT_ == null ? description != null : !DESCRIPTION_DEFAULT_.equals(description);
			case SEVERITY:
				return SEVERITY_DEFAULT_ == null ? severity != null : !SEVERITY_DEFAULT_.equals(severity);
			case CATEGORY:
				return CATEGORY_DEFAULT_ == null ? category != null : !CATEGORY_DEFAULT_.equals(category);
			case SUBCATEGORY:
				return SUBCATEGORY_DEFAULT_ == null ? subcategory != null : !SUBCATEGORY_DEFAULT_.equals(subcategory);
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
		result.append(" (Description: ");
		result.append(description);
		result.append(", severity: ");
		result.append(severity);
		result.append(", category: ");
		result.append(category);
		result.append(", subcategory: ");
		result.append(subcategory);
		result.append(')');
		return result.toString();
	}

} //ProblemTypeImpl

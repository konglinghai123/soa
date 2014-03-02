/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.book.chapter4.issue.impl;

import commonj.sdo.Type;

import opensoa.book.chapter4.issue.CcsType;
import opensoa.book.chapter4.issue.HeaderType;
import opensoa.book.chapter4.issue.IssueFactory;

import org.apache.tuscany.sdo.impl.DataObjectBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opensoa.book.chapter4.issue.impl.HeaderTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.HeaderTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.HeaderTypeImpl#getTo <em>To</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.HeaderTypeImpl#getCcs <em>Ccs</em>}</li>
 *   <li>{@link opensoa.book.chapter4.issue.impl.HeaderTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderTypeImpl extends DataObjectBase implements HeaderType
{

	public final static int FROM = 0;

	public final static int SUBJECT = 1;

	public final static int TO = 2;

	public final static int CCS = 3;

	public final static int CREATION_DATE = 4;

	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = 0;


	/**
	 * The internal feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_FROM = 0;

	/**
	 * The internal feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SUBJECT = 1;

	/**
	 * The internal feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TO = 2;

	/**
	 * The internal feature id for the '<em><b>Ccs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CCS = 3;

	/**
	 * The internal feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_CREATION_DATE = 4;

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
			case _INTERNAL_FROM: return FROM;
			case _INTERNAL_SUBJECT: return SUBJECT;
			case _INTERNAL_TO: return TO;
			case _INTERNAL_CCS: return CCS;
			case _INTERNAL_CREATION_DATE: return CREATION_DATE;
		}
		return super.internalConvertIndex(internalIndex);
	}


	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_DEFAULT_;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_DEFAULT_;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_DEFAULT_;

	/**
	 * The cached value of the '{@link #getCcs() <em>Ccs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcs()
	 * @generated
	 * @ordered
	 */
	
	protected CcsType ccs = null;
	
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_DEFAULT_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderTypeImpl()
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
		return ((IssueFactoryImpl)IssueFactory.INSTANCE).getHeaderType();
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
	public String getFrom()
	{
		return from;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom)
	{
		String oldFrom = from;
		from = newFrom;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_FROM, oldFrom, from);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject()
	{
		return subject;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject)
	{
		String oldSubject = subject;
		subject = newSubject;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SUBJECT, oldSubject, subject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo()
	{
		return to;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo)
	{
		String oldTo = to;
		to = newTo;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TO, oldTo, to);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcsType getCcs()
	{
		return ccs;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcs(CcsType newCcs)
	{
		CcsType oldCcs = ccs;
		ccs = newCcs;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CCS, oldCcs, ccs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationDate()
	{
		return creationDate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(String newCreationDate)
	{
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_CREATION_DATE, oldCreationDate, creationDate);
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
			case FROM:
				return getFrom();
			case SUBJECT:
				return getSubject();
			case TO:
				return getTo();
			case CCS:
				return getCcs();
			case CREATION_DATE:
				return getCreationDate();
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
			case FROM:
				setFrom((String)newValue);
				return;
			case SUBJECT:
				setSubject((String)newValue);
				return;
			case TO:
				setTo((String)newValue);
				return;
			case CCS:
				setCcs((CcsType)newValue);
				return;
			case CREATION_DATE:
				setCreationDate((String)newValue);
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
			case FROM:
				setFrom(FROM_DEFAULT_);
				return;
			case SUBJECT:
				setSubject(SUBJECT_DEFAULT_);
				return;
			case TO:
				setTo(TO_DEFAULT_);
				return;
			case CCS:
				setCcs((CcsType)null);
				return;
			case CREATION_DATE:
				setCreationDate(CREATION_DATE_DEFAULT_);
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
			case FROM:
				return FROM_DEFAULT_ == null ? from != null : !FROM_DEFAULT_.equals(from);
			case SUBJECT:
				return SUBJECT_DEFAULT_ == null ? subject != null : !SUBJECT_DEFAULT_.equals(subject);
			case TO:
				return TO_DEFAULT_ == null ? to != null : !TO_DEFAULT_.equals(to);
			case CCS:
				return ccs != null;
			case CREATION_DATE:
				return CREATION_DATE_DEFAULT_ == null ? creationDate != null : !CREATION_DATE_DEFAULT_.equals(creationDate);
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
		result.append(" (From: ");
		result.append(from);
		result.append(", Subject: ");
		result.append(subject);
		result.append(", To: ");
		result.append(to);
		result.append(", CreationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //HeaderTypeImpl

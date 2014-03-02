/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.osoa.xmlns.sca._1.impl;

import commonj.sdo.Sequence;
import commonj.sdo.Type;

import org.osoa.xmlns.sca._1.PropertyValue;
import org.osoa.xmlns.sca._1._1Factory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PropertyValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PropertyValueImpl#getType_ <em>Type</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PropertyValueImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PropertyValueImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PropertyValueImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PropertyValueImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.osoa.xmlns.sca._1.impl.PropertyValueImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyValueImpl extends SCAPropertyBaseImpl implements PropertyValue
{

	public final static int NAME = SCAPropertyBaseImpl.SDO_PROPERTY_COUNT + 0;

	public final static int TYPE = SCAPropertyBaseImpl.SDO_PROPERTY_COUNT + 1;

	public final static int ELEMENT = SCAPropertyBaseImpl.SDO_PROPERTY_COUNT + 2;

	public final static int MANY = SCAPropertyBaseImpl.SDO_PROPERTY_COUNT + 3;

	public final static int SOURCE = SCAPropertyBaseImpl.SDO_PROPERTY_COUNT + 4;

	public final static int FILE = SCAPropertyBaseImpl.SDO_PROPERTY_COUNT + 5;

	public final static int ANY_ATTRIBUTE = SCAPropertyBaseImpl.EXTENDED_PROPERTY_COUNT + -1;

	public final static int SDO_PROPERTY_COUNT = SCAPropertyBaseImpl.SDO_PROPERTY_COUNT + 6;

	public final static int EXTENDED_PROPERTY_COUNT = SCAPropertyBaseImpl.EXTENDED_PROPERTY_COUNT - 1;


	/**
	 * The internal feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_MIXED = SCAPropertyBaseImpl._INTERNAL_MIXED;

	/**
	 * The internal feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY = SCAPropertyBaseImpl._INTERNAL_ANY;

	/**
	 * The internal feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_NAME = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 0;

	/**
	 * The internal feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_TYPE = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 1;

	/**
	 * The internal feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ELEMENT = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 2;

	/**
	 * The internal feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_MANY = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 3;

	/**
	 * The internal feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_SOURCE = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 4;

	/**
	 * The internal feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_FILE = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 5;

	/**
	 * The internal feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */ 
	public final static int _INTERNAL_ANY_ATTRIBUTE = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 6;

	/**
	 * The number of properties for this type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public final static int INTERNAL_PROPERTY_COUNT = SCAPropertyBaseImpl.INTERNAL_PROPERTY_COUNT + 7;

	protected int internalConvertIndex(int internalIndex)
	{
		switch (internalIndex)
		{
			case _INTERNAL_MIXED: return MIXED;
			case _INTERNAL_ANY: return ANY;
			case _INTERNAL_NAME: return NAME;
			case _INTERNAL_TYPE: return TYPE;
			case _INTERNAL_ELEMENT: return ELEMENT;
			case _INTERNAL_MANY: return MANY;
			case _INTERNAL_SOURCE: return SOURCE;
			case _INTERNAL_FILE: return FILE;
			case _INTERNAL_ANY_ATTRIBUTE: return ANY_ATTRIBUTE;
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
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected String element = ELEMENT_DEFAULT_;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_DEFAULT_ = false;

	/**
	 * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected boolean many = MANY_DEFAULT_;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_DEFAULT_;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_DEFAULT_ = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_DEFAULT_;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	
	protected Sequence anyAttribute = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueImpl()
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
		return ((_1FactoryImpl)_1Factory.INSTANCE).getPropertyValue();
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
	public String getName()
	{
		return name;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_NAME, oldName, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_()
	{
		return type;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_TYPE, oldType, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElement()
	{
		return element;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(String newElement)
	{
		String oldElement = element;
		element = newElement;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_ELEMENT, oldElement, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany()
	{
		return many;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(boolean newMany)
	{
		boolean oldMany = many;
		many = newMany;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_MANY, oldMany, many);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource()
	{
		return source;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource)
	{
		String oldSource = source;
		source = newSource;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_SOURCE, oldSource, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile()
	{
		return file;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile)
	{
		String oldFile = file;
		file = newFile;
		if (isNotifying())
			notify(ChangeKind.SET, _INTERNAL_FILE, oldFile, file);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getAnyAttribute()
	{
		if (anyAttribute == null)
		{
		  anyAttribute = createSequence(_INTERNAL_ANY_ATTRIBUTE);
		}
		return anyAttribute;
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
			case ANY_ATTRIBUTE:
				return removeFromSequence(getAnyAttribute(), otherEnd, changeContext);
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
			case TYPE:
				return getType_();
			case ELEMENT:
				return getElement();
			case MANY:
				return isMany() ? Boolean.TRUE : Boolean.FALSE;
			case SOURCE:
				return getSource();
			case FILE:
				return getFile();
			case ANY_ATTRIBUTE:
				// XXX query introduce coreType as an argument? -- semantic = if true -- coreType - return the core EMF object if value is a non-EMF wrapper/view
				//if (coreType) 
				return getAnyAttribute();
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
			case TYPE:
				setType((String)newValue);
				return;
			case ELEMENT:
				setElement((String)newValue);
				return;
			case MANY:
				setMany(((Boolean)newValue).booleanValue());
				return;
			case SOURCE:
				setSource((String)newValue);
				return;
			case FILE:
				setFile((String)newValue);
				return;
			case ANY_ATTRIBUTE:
      	setSequence(getAnyAttribute(), newValue);
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
				setName(NAME_DEFAULT_);
				return;
			case TYPE:
				setType(TYPE_DEFAULT_);
				return;
			case ELEMENT:
				setElement(ELEMENT_DEFAULT_);
				return;
			case MANY:
				setMany(MANY_DEFAULT_);
				return;
			case SOURCE:
				setSource(SOURCE_DEFAULT_);
				return;
			case FILE:
				setFile(FILE_DEFAULT_);
				return;
			case ANY_ATTRIBUTE:
				unsetSequence(getAnyAttribute());
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
				return NAME_DEFAULT_ == null ? name != null : !NAME_DEFAULT_.equals(name);
			case TYPE:
				return TYPE_DEFAULT_ == null ? type != null : !TYPE_DEFAULT_.equals(type);
			case ELEMENT:
				return ELEMENT_DEFAULT_ == null ? element != null : !ELEMENT_DEFAULT_.equals(element);
			case MANY:
				return many != MANY_DEFAULT_;
			case SOURCE:
				return SOURCE_DEFAULT_ == null ? source != null : !SOURCE_DEFAULT_.equals(source);
			case FILE:
				return FILE_DEFAULT_ == null ? file != null : !FILE_DEFAULT_.equals(file);
			case ANY_ATTRIBUTE:
				return anyAttribute != null && !isSequenceEmpty(getAnyAttribute());
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
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", element: ");
		result.append(element);
		result.append(", many: ");
		result.append(many);
		result.append(", source: ");
		result.append(source);
		result.append(", file: ");
		result.append(file);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PropertyValueImpl

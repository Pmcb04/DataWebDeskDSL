/**
 */
package dataWebDeskDSL.impl;

import dataWebDeskDSL.Attribute;
import dataWebDeskDSL.DataType;
import dataWebDeskDSL.DataWebDeskDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.AttributeImpl#getMaxValues <em>Max Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValues() <em>Max Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValues()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValues() <em>Max Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValues()
	 * @generated
	 * @ordered
	 */
	protected int maxValues = MAX_VALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataWebDeskDSLPackage.ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValues() {
		return maxValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValues(int newMaxValues) {
		int oldMaxValues = maxValues;
		maxValues = newMaxValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ATTRIBUTE__MAX_VALUES, oldMaxValues, maxValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DataWebDeskDSLPackage.ATTRIBUTE__NAME:
				return getName();
			case DataWebDeskDSLPackage.ATTRIBUTE__VALUE:
				return getValue();
			case DataWebDeskDSLPackage.ATTRIBUTE__MAX_VALUES:
				return getMaxValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ATTRIBUTE__TYPE:
				setType((DataType)newValue);
				return;
			case DataWebDeskDSLPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case DataWebDeskDSLPackage.ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case DataWebDeskDSLPackage.ATTRIBUTE__MAX_VALUES:
				setMaxValues((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ATTRIBUTE__TYPE:
				setType((DataType)null);
				return;
			case DataWebDeskDSLPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.ATTRIBUTE__MAX_VALUES:
				setMaxValues(MAX_VALUES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ATTRIBUTE__TYPE:
				return type != null;
			case DataWebDeskDSLPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataWebDeskDSLPackage.ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DataWebDeskDSLPackage.ATTRIBUTE__MAX_VALUES:
				return maxValues != MAX_VALUES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", maxValues: ");
		result.append(maxValues);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl

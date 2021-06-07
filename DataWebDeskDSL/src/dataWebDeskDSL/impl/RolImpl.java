/**
 */
package dataWebDeskDSL.impl;

import dataWebDeskDSL.DataWebDeskDSLPackage;
import dataWebDeskDSL.Page;
import dataWebDeskDSL.Rol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.impl.RolImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.RolImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.RolImpl#getNumeroPaginasAccesibles <em>Numero Paginas Accesibles</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.RolImpl#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolImpl extends EObjectImpl implements Rol {
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
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> access;

	/**
	 * The cached setting delegate for the '{@link #getNumeroPaginasAccesibles() <em>Numero Paginas Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPaginasAccesibles()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUMERO_PAGINAS_ACCESIBLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataWebDeskDSLPackage.Literals.ROL__NUMERO_PAGINAS_ACCESIBLES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNumeroEntidadesAccesibles() <em>Numero Entidades Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEntidadesAccesibles()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUMERO_ENTIDADES_ACCESIBLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataWebDeskDSLPackage.Literals.ROL__NUMERO_ENTIDADES_ACCESIBLES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.ROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getAccess() {
		if (access == null) {
			access = new EObjectWithInverseResolvingEList.ManyInverse<Page>(Page.class, this, DataWebDeskDSLPackage.ROL__ACCESS, DataWebDeskDSLPackage.PAGE__MANNAGMENT);
		}
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroPaginasAccesibles() {
		return (Integer)NUMERO_PAGINAS_ACCESIBLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPaginasAccesibles(int newNumeroPaginasAccesibles) {
		NUMERO_PAGINAS_ACCESIBLES__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumeroPaginasAccesibles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroEntidadesAccesibles() {
		return (Integer)NUMERO_ENTIDADES_ACCESIBLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroEntidadesAccesibles(int newNumeroEntidadesAccesibles) {
		NUMERO_ENTIDADES_ACCESIBLES__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumeroEntidadesAccesibles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ROL__ACCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccess()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ROL__ACCESS:
				return ((InternalEList<?>)getAccess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ROL__NAME:
				return getName();
			case DataWebDeskDSLPackage.ROL__ACCESS:
				return getAccess();
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES:
				return getNumeroPaginasAccesibles();
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES:
				return getNumeroEntidadesAccesibles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ROL__NAME:
				setName((String)newValue);
				return;
			case DataWebDeskDSLPackage.ROL__ACCESS:
				getAccess().clear();
				getAccess().addAll((Collection<? extends Page>)newValue);
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES:
				setNumeroPaginasAccesibles((Integer)newValue);
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES:
				setNumeroEntidadesAccesibles((Integer)newValue);
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
			case DataWebDeskDSLPackage.ROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.ROL__ACCESS:
				getAccess().clear();
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES:
				NUMERO_PAGINAS_ACCESIBLES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES:
				NUMERO_ENTIDADES_ACCESIBLES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case DataWebDeskDSLPackage.ROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataWebDeskDSLPackage.ROL__ACCESS:
				return access != null && !access.isEmpty();
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES:
				return NUMERO_PAGINAS_ACCESIBLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES:
				return NUMERO_ENTIDADES_ACCESIBLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(')');
		return result.toString();
	}

} //RolImpl

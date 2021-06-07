/**
 */
package dataWebDeskDSL.impl;

import dataWebDeskDSL.DataType;
import dataWebDeskDSL.DataWebDeskDSLPackage;
import dataWebDeskDSL.Entity;
import dataWebDeskDSL.Page;
import dataWebDeskDSL.Rol;
import dataWebDeskDSL.WebSite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.impl.WebSiteImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.WebSiteImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.WebSiteImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.WebSiteImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.WebSiteImpl#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.WebSiteImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteImpl extends EObjectImpl implements WebSite {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> roles;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatype;

	/**
	 * The cached setting delegate for the '{@link #getPaginasMediasAccesibles() <em>Paginas Medias Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginasMediasAccesibles()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAGINAS_MEDIAS_ACCESIBLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataWebDeskDSLPackage.Literals.WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES).getSettingDelegate();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.WEB_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, DataWebDeskDSLPackage.WEB_SITE__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Rol>(Rol.class, this, DataWebDeskDSLPackage.WEB_SITE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, DataWebDeskDSLPackage.WEB_SITE__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatype() {
		if (datatype == null) {
			datatype = new EObjectContainmentEList<DataType>(DataType.class, this, DataWebDeskDSLPackage.WEB_SITE__DATATYPE);
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPaginasMediasAccesibles() {
		return (Float)PAGINAS_MEDIAS_ACCESIBLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaginasMediasAccesibles(float newPaginasMediasAccesibles) {
		PAGINAS_MEDIAS_ACCESIBLES__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPaginasMediasAccesibles);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.WEB_SITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.WEB_SITE__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.WEB_SITE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.WEB_SITE__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.WEB_SITE__DATATYPE:
				return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.WEB_SITE__PAGES:
				return getPages();
			case DataWebDeskDSLPackage.WEB_SITE__ROLES:
				return getRoles();
			case DataWebDeskDSLPackage.WEB_SITE__ENTITIES:
				return getEntities();
			case DataWebDeskDSLPackage.WEB_SITE__DATATYPE:
				return getDatatype();
			case DataWebDeskDSLPackage.WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES:
				return getPaginasMediasAccesibles();
			case DataWebDeskDSLPackage.WEB_SITE__NAME:
				return getName();
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
			case DataWebDeskDSLPackage.WEB_SITE__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case DataWebDeskDSLPackage.WEB_SITE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Rol>)newValue);
				return;
			case DataWebDeskDSLPackage.WEB_SITE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case DataWebDeskDSLPackage.WEB_SITE__DATATYPE:
				getDatatype().clear();
				getDatatype().addAll((Collection<? extends DataType>)newValue);
				return;
			case DataWebDeskDSLPackage.WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES:
				setPaginasMediasAccesibles((Float)newValue);
				return;
			case DataWebDeskDSLPackage.WEB_SITE__NAME:
				setName((String)newValue);
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
			case DataWebDeskDSLPackage.WEB_SITE__PAGES:
				getPages().clear();
				return;
			case DataWebDeskDSLPackage.WEB_SITE__ROLES:
				getRoles().clear();
				return;
			case DataWebDeskDSLPackage.WEB_SITE__ENTITIES:
				getEntities().clear();
				return;
			case DataWebDeskDSLPackage.WEB_SITE__DATATYPE:
				getDatatype().clear();
				return;
			case DataWebDeskDSLPackage.WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES:
				PAGINAS_MEDIAS_ACCESIBLES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DataWebDeskDSLPackage.WEB_SITE__NAME:
				setName(NAME_EDEFAULT);
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
			case DataWebDeskDSLPackage.WEB_SITE__PAGES:
				return pages != null && !pages.isEmpty();
			case DataWebDeskDSLPackage.WEB_SITE__ROLES:
				return roles != null && !roles.isEmpty();
			case DataWebDeskDSLPackage.WEB_SITE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case DataWebDeskDSLPackage.WEB_SITE__DATATYPE:
				return datatype != null && !datatype.isEmpty();
			case DataWebDeskDSLPackage.WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES:
				return PAGINAS_MEDIAS_ACCESIBLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataWebDeskDSLPackage.WEB_SITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //WebSiteImpl

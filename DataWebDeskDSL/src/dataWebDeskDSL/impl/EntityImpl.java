/**
 */
package dataWebDeskDSL.impl;

import dataWebDeskDSL.Attribute;
import dataWebDeskDSL.CRUDPage;
import dataWebDeskDSL.DataWebDeskDSLPackage;
import dataWebDeskDSL.Entity;
import dataWebDeskDSL.Page;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.EntityImpl#getEntitiesReferences <em>Entities References</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.EntityImpl#getPrimarykey <em>Primarykey</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.EntityImpl#getCrudpages <em>Crudpages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends EObjectImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * The cached value of the '{@link #getEntitiesReferences() <em>Entities References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitiesReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entitiesReferences;

	/**
	 * The cached value of the '{@link #getPrimarykey() <em>Primarykey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarykey()
	 * @generated
	 * @ordered
	 */
	protected Attribute primarykey;

	/**
	 * The cached value of the '{@link #getCrudpages() <em>Crudpages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudpages()
	 * @generated
	 * @ordered
	 */
	protected EList<CRUDPage> crudpages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DataWebDeskDSLPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntitiesReferences() {
		if (entitiesReferences == null) {
			entitiesReferences = new EObjectResolvingEList<Entity>(Entity.class, this, DataWebDeskDSLPackage.ENTITY__ENTITIES_REFERENCES);
		}
		return entitiesReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getPrimarykey() {
		if (primarykey != null && primarykey.eIsProxy()) {
			InternalEObject oldPrimarykey = (InternalEObject)primarykey;
			primarykey = (Attribute)eResolveProxy(oldPrimarykey);
			if (primarykey != oldPrimarykey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataWebDeskDSLPackage.ENTITY__PRIMARYKEY, oldPrimarykey, primarykey));
			}
		}
		return primarykey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetPrimarykey() {
		return primarykey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimarykey(Attribute newPrimarykey) {
		Attribute oldPrimarykey = primarykey;
		primarykey = newPrimarykey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ENTITY__PRIMARYKEY, oldPrimarykey, primarykey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CRUDPage> getCrudpages() {
		if (crudpages == null) {
			crudpages = new EObjectWithInverseResolvingEList<CRUDPage>(CRUDPage.class, this, DataWebDeskDSLPackage.ENTITY__CRUDPAGES, DataWebDeskDSLPackage.CRUD_PAGE__ENTITY);
		}
		return crudpages;
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
			case DataWebDeskDSLPackage.ENTITY__CRUDPAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrudpages()).basicAdd(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.ENTITY__CRUDPAGES:
				return ((InternalEList<?>)getCrudpages()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case DataWebDeskDSLPackage.ENTITY__NAME:
				return getName();
			case DataWebDeskDSLPackage.ENTITY__ENTITIES_REFERENCES:
				return getEntitiesReferences();
			case DataWebDeskDSLPackage.ENTITY__PRIMARYKEY:
				if (resolve) return getPrimarykey();
				return basicGetPrimarykey();
			case DataWebDeskDSLPackage.ENTITY__CRUDPAGES:
				return getCrudpages();
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
			case DataWebDeskDSLPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case DataWebDeskDSLPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case DataWebDeskDSLPackage.ENTITY__ENTITIES_REFERENCES:
				getEntitiesReferences().clear();
				getEntitiesReferences().addAll((Collection<? extends Entity>)newValue);
				return;
			case DataWebDeskDSLPackage.ENTITY__PRIMARYKEY:
				setPrimarykey((Attribute)newValue);
				return;
			case DataWebDeskDSLPackage.ENTITY__CRUDPAGES:
				getCrudpages().clear();
				getCrudpages().addAll((Collection<? extends CRUDPage>)newValue);
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
			case DataWebDeskDSLPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DataWebDeskDSLPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.ENTITY__ENTITIES_REFERENCES:
				getEntitiesReferences().clear();
				return;
			case DataWebDeskDSLPackage.ENTITY__PRIMARYKEY:
				setPrimarykey((Attribute)null);
				return;
			case DataWebDeskDSLPackage.ENTITY__CRUDPAGES:
				getCrudpages().clear();
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
			case DataWebDeskDSLPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case DataWebDeskDSLPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataWebDeskDSLPackage.ENTITY__ENTITIES_REFERENCES:
				return entitiesReferences != null && !entitiesReferences.isEmpty();
			case DataWebDeskDSLPackage.ENTITY__PRIMARYKEY:
				return primarykey != null;
			case DataWebDeskDSLPackage.ENTITY__CRUDPAGES:
				return crudpages != null && !crudpages.isEmpty();
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

} //EntityImpl

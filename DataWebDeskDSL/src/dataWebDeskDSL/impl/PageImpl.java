/**
 */
package dataWebDeskDSL.impl;

import dataWebDeskDSL.DataWebDeskDSLPackage;
import dataWebDeskDSL.Entity;
import dataWebDeskDSL.Multimedia;
import dataWebDeskDSL.Page;
import dataWebDeskDSL.PageExternal;
import dataWebDeskDSL.Rol;
import dataWebDeskDSL.SocialMedia;

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
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.impl.PageImpl#getPagesReferences <em>Pages References</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.PageImpl#getSocialMedias <em>Social Medias</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.PageImpl#getMannagment <em>Mannagment</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.PageImpl#getPagesexternal <em>Pagesexternal</em>}</li>
 *   <li>{@link dataWebDeskDSL.impl.PageImpl#getMultimedias <em>Multimedias</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PageImpl extends EObjectImpl implements Page {
	/**
	 * The cached value of the '{@link #getPagesReferences() <em>Pages References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagesReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pagesReferences;

	/**
	 * The cached value of the '{@link #getSocialMedias() <em>Social Medias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialMedias()
	 * @generated
	 * @ordered
	 */
	protected EList<SocialMedia> socialMedias;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMannagment() <em>Mannagment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMannagment()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> mannagment;

	/**
	 * The cached value of the '{@link #getPagesexternal() <em>Pagesexternal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagesexternal()
	 * @generated
	 * @ordered
	 */
	protected EList<PageExternal> pagesexternal;

	/**
	 * The cached value of the '{@link #getMultimedias() <em>Multimedias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultimedias()
	 * @generated
	 * @ordered
	 */
	protected EList<Multimedia> multimedias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPagesReferences() {
		if (pagesReferences == null) {
			pagesReferences = new EObjectResolvingEList<Page>(Page.class, this, DataWebDeskDSLPackage.PAGE__PAGES_REFERENCES);
		}
		return pagesReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialMedia> getSocialMedias() {
		if (socialMedias == null) {
			socialMedias = new EObjectContainmentEList<SocialMedia>(SocialMedia.class, this, DataWebDeskDSLPackage.PAGE__SOCIAL_MEDIAS);
		}
		return socialMedias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getMannagment() {
		if (mannagment == null) {
			mannagment = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this, DataWebDeskDSLPackage.PAGE__MANNAGMENT, DataWebDeskDSLPackage.ROL__ACCESS);
		}
		return mannagment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageExternal> getPagesexternal() {
		if (pagesexternal == null) {
			pagesexternal = new EObjectContainmentEList<PageExternal>(PageExternal.class, this, DataWebDeskDSLPackage.PAGE__PAGESEXTERNAL);
		}
		return pagesexternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Multimedia> getMultimedias() {
		if (multimedias == null) {
			multimedias = new EObjectContainmentEList<Multimedia>(Multimedia.class, this, DataWebDeskDSLPackage.PAGE__MULTIMEDIAS);
		}
		return multimedias;
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
			case DataWebDeskDSLPackage.PAGE__MANNAGMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMannagment()).basicAdd(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.PAGE__SOCIAL_MEDIAS:
				return ((InternalEList<?>)getSocialMedias()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGE__MANNAGMENT:
				return ((InternalEList<?>)getMannagment()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGE__PAGESEXTERNAL:
				return ((InternalEList<?>)getPagesexternal()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGE__MULTIMEDIAS:
				return ((InternalEList<?>)getMultimedias()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.PAGE__PAGES_REFERENCES:
				return getPagesReferences();
			case DataWebDeskDSLPackage.PAGE__SOCIAL_MEDIAS:
				return getSocialMedias();
			case DataWebDeskDSLPackage.PAGE__TITLE:
				return getTitle();
			case DataWebDeskDSLPackage.PAGE__MANNAGMENT:
				return getMannagment();
			case DataWebDeskDSLPackage.PAGE__PAGESEXTERNAL:
				return getPagesexternal();
			case DataWebDeskDSLPackage.PAGE__MULTIMEDIAS:
				return getMultimedias();
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
			case DataWebDeskDSLPackage.PAGE__PAGES_REFERENCES:
				getPagesReferences().clear();
				getPagesReferences().addAll((Collection<? extends Page>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGE__SOCIAL_MEDIAS:
				getSocialMedias().clear();
				getSocialMedias().addAll((Collection<? extends SocialMedia>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case DataWebDeskDSLPackage.PAGE__MANNAGMENT:
				getMannagment().clear();
				getMannagment().addAll((Collection<? extends Rol>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGE__PAGESEXTERNAL:
				getPagesexternal().clear();
				getPagesexternal().addAll((Collection<? extends PageExternal>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGE__MULTIMEDIAS:
				getMultimedias().clear();
				getMultimedias().addAll((Collection<? extends Multimedia>)newValue);
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
			case DataWebDeskDSLPackage.PAGE__PAGES_REFERENCES:
				getPagesReferences().clear();
				return;
			case DataWebDeskDSLPackage.PAGE__SOCIAL_MEDIAS:
				getSocialMedias().clear();
				return;
			case DataWebDeskDSLPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.PAGE__MANNAGMENT:
				getMannagment().clear();
				return;
			case DataWebDeskDSLPackage.PAGE__PAGESEXTERNAL:
				getPagesexternal().clear();
				return;
			case DataWebDeskDSLPackage.PAGE__MULTIMEDIAS:
				getMultimedias().clear();
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
			case DataWebDeskDSLPackage.PAGE__PAGES_REFERENCES:
				return pagesReferences != null && !pagesReferences.isEmpty();
			case DataWebDeskDSLPackage.PAGE__SOCIAL_MEDIAS:
				return socialMedias != null && !socialMedias.isEmpty();
			case DataWebDeskDSLPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DataWebDeskDSLPackage.PAGE__MANNAGMENT:
				return mannagment != null && !mannagment.isEmpty();
			case DataWebDeskDSLPackage.PAGE__PAGESEXTERNAL:
				return pagesexternal != null && !pagesexternal.isEmpty();
			case DataWebDeskDSLPackage.PAGE__MULTIMEDIAS:
				return multimedias != null && !multimedias.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PageImpl

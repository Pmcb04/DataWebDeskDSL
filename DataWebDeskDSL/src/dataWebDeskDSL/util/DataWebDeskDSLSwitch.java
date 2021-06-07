/**
 */
package dataWebDeskDSL.util;

import dataWebDeskDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public class DataWebDeskDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataWebDeskDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = DataWebDeskDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataWebDeskDSLPackage.ROL: {
				Rol rol = (Rol)theEObject;
				T result = caseRol(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.NORMAL_PAGE: {
				NormalPage normalPage = (NormalPage)theEObject;
				T result = caseNormalPage(normalPage);
				if (result == null) result = casePage(normalPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.CREATE_PAGE: {
				CreatePage createPage = (CreatePage)theEObject;
				T result = caseCreatePage(createPage);
				if (result == null) result = caseCRUDPage(createPage);
				if (result == null) result = casePage(createPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.MAIN_PAGE: {
				MainPage mainPage = (MainPage)theEObject;
				T result = caseMainPage(mainPage);
				if (result == null) result = casePage(mainPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.DETAIL_PAGE: {
				DetailPage detailPage = (DetailPage)theEObject;
				T result = caseDetailPage(detailPage);
				if (result == null) result = caseCRUDPage(detailPage);
				if (result == null) result = casePage(detailPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.DELETE_PAGE: {
				DeletePage deletePage = (DeletePage)theEObject;
				T result = caseDeletePage(deletePage);
				if (result == null) result = caseCRUDPage(deletePage);
				if (result == null) result = casePage(deletePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.CRUD_PAGE: {
				CRUDPage crudPage = (CRUDPage)theEObject;
				T result = caseCRUDPage(crudPage);
				if (result == null) result = casePage(crudPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.INDEX_PAGE: {
				IndexPage indexPage = (IndexPage)theEObject;
				T result = caseIndexPage(indexPage);
				if (result == null) result = caseCRUDPage(indexPage);
				if (result == null) result = casePage(indexPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.SOCIAL_MEDIA: {
				SocialMedia socialMedia = (SocialMedia)theEObject;
				T result = caseSocialMedia(socialMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.WEB_SITE: {
				WebSite webSite = (WebSite)theEObject;
				T result = caseWebSite(webSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAGE_EXTERNAL: {
				PageExternal pageExternal = (PageExternal)theEObject;
				T result = casePageExternal(pageExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.MULTIMEDIA: {
				Multimedia multimedia = (Multimedia)theEObject;
				T result = caseMultimedia(multimedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseMultimedia(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = caseMultimedia(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.AUDIO: {
				Audio audio = (Audio)theEObject;
				T result = caseAudio(audio);
				if (result == null) result = caseMultimedia(audio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseMultimedia(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalPage(NormalPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatePage(CreatePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainPage(MainPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailPage(DetailPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletePage(DeletePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRUD Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRUD Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRUDPage(CRUDPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexPage(IndexPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialMedia(SocialMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebSite(WebSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageExternal(PageExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multimedia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multimedia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultimedia(Multimedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudio(Audio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataWebDeskDSLSwitch

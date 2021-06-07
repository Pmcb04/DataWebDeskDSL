/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Page#getPagesReferences <em>Pages References</em>}</li>
 *   <li>{@link dataWebDeskDSL.Page#getSocialMedias <em>Social Medias</em>}</li>
 *   <li>{@link dataWebDeskDSL.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link dataWebDeskDSL.Page#getMannagment <em>Mannagment</em>}</li>
 *   <li>{@link dataWebDeskDSL.Page#getPagesexternal <em>Pagesexternal</em>}</li>
 *   <li>{@link dataWebDeskDSL.Page#getMultimedias <em>Multimedias</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getPage()
 * @model abstract="true"
 *        annotation="MyDSLDoc Name='Page' Description='Paginas representadas en el modelo. Cada p\341gina est\341 compuesta de calquier n\372mero de redes sociales (SocialMedia), p\341ginas externas (PageExternal) y archivos multimedia (Multimedia). Adem\341s debe definir el atributo name y puede tener cualquier n\372mero de referencias a otras p\341ginas o a ella misma. Es superclase abstracta de MainPage, NormalPage y CRUDPage'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages References</b></em>' reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages References</em>' reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getPage_PagesReferences()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash'"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='pagesReferences' Type='reference'"
	 * @generated
	 */
	EList<Page> getPagesReferences();

	/**
	 * Returns the value of the '<em><b>Social Medias</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.SocialMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Medias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Medias</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getPage_SocialMedias()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='socialMedias' Type='composition'"
	 * @generated
	 */
	EList<SocialMedia> getSocialMedias();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getPage_Title()
	 * @model annotation="MyDSLDoc Name='title' Type='EString'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Mannagment</b></em>' reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Rol}.
	 * It is bidirectional and its opposite is '{@link dataWebDeskDSL.Rol#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mannagment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mannagment</em>' reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getPage_Mannagment()
	 * @see dataWebDeskDSL.Rol#getAccess
	 * @model opposite="access"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='mannagment' Type='reference'"
	 * @generated
	 */
	EList<Rol> getMannagment();

	/**
	 * Returns the value of the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.PageExternal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagesexternal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagesexternal</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getPage_Pagesexternal()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='pagesexternal' Type='reference'"
	 * @generated
	 */
	EList<PageExternal> getPagesexternal();

	/**
	 * Returns the value of the '<em><b>Multimedias</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Multimedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multimedias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multimedias</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getPage_Multimedias()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='multimedia' Type='reference'"
	 * @generated
	 */
	EList<Multimedia> getMultimedias();

} // Page

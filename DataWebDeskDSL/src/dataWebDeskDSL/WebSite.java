/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.WebSite#getPages <em>Pages</em>}</li>
 *   <li>{@link dataWebDeskDSL.WebSite#getRoles <em>Roles</em>}</li>
 *   <li>{@link dataWebDeskDSL.WebSite#getEntities <em>Entities</em>}</li>
 *   <li>{@link dataWebDeskDSL.WebSite#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link dataWebDeskDSL.WebSite#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}</li>
 *   <li>{@link dataWebDeskDSL.WebSite#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getWebSite()
 * @model annotation="gmf.diagram label='name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='one_sm one_home no_pages_alone'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot one_sm='pages.socialMedias -&gt; size() &gt;= 1' one_home='pages-&gt;selectByType(MainPage)-&gt;select(mannagment-&gt;size() = 0) -&gt; size() = 1' no_pages_alone='self.roles.access-&gt;asSet()-&gt;size()+1 = self.pages-&gt;size() '"
 *        annotation="MyDSLDoc Authors='Pedro Miguel Carmona Broncano &amp; Rub\351n Mar\355n Lucas' Last\040Updated='28/05/2021' Name='WebSite' Description='Sitio web representado en el modelo. Est\341 compuesto por una o varias entidades (Entity), por una o varias p\341ginas (Page) y por cualquier n\372mero de p\341ginas (Page), roles (Roles) y tipos de dato (DataType). Define de forma obligatoria el atributo name.'"
 * @generated
 */
public interface WebSite extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getWebSite_Pages()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='*' Name='pages' Type='composition'"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Rol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getWebSite_Roles()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='roles' Type='composition'"
	 * @generated
	 */
	EList<Rol> getRoles();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getWebSite_Entities()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='*' Name='entities' Type='composition'"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getWebSite_Datatype()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='dataType' Type='composition'"
	 * @generated
	 */
	EList<DataType> getDatatype();

	/**
	 * Returns the value of the '<em><b>Paginas Medias Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paginas Medias Accesibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginas Medias Accesibles</em>' attribute.
	 * @see #setPaginasMediasAccesibles(float)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getWebSite_PaginasMediasAccesibles()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if (self.roles-&gt;size() = 0) then 0\n\t\t\t\t\t\t\t else (self.roles.numeroPaginasAccesibles -&gt; sum() / self.roles -&gt; size())\n\t\t\t\t\t\t\t endif'"
	 * @generated
	 */
	float getPaginasMediasAccesibles();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.WebSite#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paginas Medias Accesibles</em>' attribute.
	 * @see #getPaginasMediasAccesibles()
	 * @generated
	 */
	void setPaginasMediasAccesibles(float value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getWebSite_Name()
	 * @model required="true"
	 *        annotation="MyDSLDoc Name='name' Type='EString' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.WebSite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WebSite

/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dataWebDeskDSL.Entity#getName <em>Name</em>}</li>
 *   <li>{@link dataWebDeskDSL.Entity#getEntitiesReferences <em>Entities References</em>}</li>
 *   <li>{@link dataWebDeskDSL.Entity#getPrimarykey <em>Primarykey</em>}</li>
 *   <li>{@link dataWebDeskDSL.Entity#getCrudpages <em>Crudpages</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getEntity()
 * @model annotation="gmf.node label='name' border.width='3' border.color='25,204,207' border.style='solid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_myself no_other_references no_more_CRUD index_details_together'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot no_myself='entitiesReferences-&gt;excludes(self) ' no_other_references='entitiesReferences.entitiesReferences-&gt;excludes(self) ' no_more_CRUD='crudpages-&gt;selectByType(CRUDPage)-&gt;size() = 1 implies crudpages-&gt;size() = 1' index_details_together='\n\t\t\t\t\t((crudpages-&gt;selectByType(IndexPage)-&gt;size() = 1 implies crudpages-&gt;selectByType(DetailPage)-&gt;size() = 1) \n\t\t\t\t\tand  (crudpages-&gt;selectByType(DetailPage)-&gt;size() = 1  implies crudpages-&gt;selectByType(IndexPage)-&gt;size() = 1))'"
 *        annotation="MyDSLDoc Name='Entity' Description='Represenata a los datos que pueden incluir las distintas p\341ginas. Est\341 relacionada con 1 o m\341s p\341ginas crud, adem\341s de referenciar a cualquier numero de entidades y tener un primary key. Debe definir de forma obligatoria un name. Cada entity est\341 compuesta  por uno o m\341s atributos.  '"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getEntity_Attributes()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='*' Name='attributes' Type='composition'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getEntity_Name()
	 * @model annotation="MyDSLDoc Name='name' Type='EString' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entities References</b></em>' reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities References</em>' reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getEntity_EntitiesReferences()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash'"
	 *        annotation="MyDSLDoc Upper\040bound='0' Lower\040bound='*' Name='entitiesReferences' Type='reference'"
	 * @generated
	 */
	EList<Entity> getEntitiesReferences();

	/**
	 * Returns the value of the '<em><b>Primarykey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primarykey</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primarykey</em>' reference.
	 * @see #setPrimarykey(Attribute)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getEntity_Primarykey()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='1' Name='primarykey' Type='reference'"
	 * @generated
	 */
	Attribute getPrimarykey();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Entity#getPrimarykey <em>Primarykey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primarykey</em>' reference.
	 * @see #getPrimarykey()
	 * @generated
	 */
	void setPrimarykey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Crudpages</b></em>' reference list.
	 * The list contents are of type {@link dataWebDeskDSL.CRUDPage}.
	 * It is bidirectional and its opposite is '{@link dataWebDeskDSL.CRUDPage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crudpages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crudpages</em>' reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getEntity_Crudpages()
	 * @see dataWebDeskDSL.CRUDPage#getEntity
	 * @model opposite="entity" required="true"
	 *        annotation="gmf.link source='crudpages' target='entity' style='dot' width='2'"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='*' Name='crudpages' Type='reference'"
	 * @generated
	 */
	EList<CRUDPage> getCrudpages();

} // Entity

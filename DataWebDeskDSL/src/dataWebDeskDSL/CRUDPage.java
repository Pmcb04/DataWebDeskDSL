/**
 */
package dataWebDeskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRUD Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.CRUDPage#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getCRUDPage()
 * @model annotation="gmf.node label='title' border.width='3' border.color='207,25,140' border.style='solid'"
 *        annotation="MyDSLDoc Name='CRUDPage' Description='P\341ginas de tipo CRUD representadas en el modelo. Est\341 relacionado con alguna entidad (Entity).  Es superclase de DetailPage, DeletePage, IndexPage y  CreatePage.'"
 * @generated
 */
public interface CRUDPage extends Page {

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dataWebDeskDSL.Entity#getCrudpages <em>Crudpages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getCRUDPage_Entity()
	 * @see dataWebDeskDSL.Entity#getCrudpages
	 * @model opposite="crudpages" required="true"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='1' Name='entity' Type='reference'"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.CRUDPage#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);
} // CRUDPage

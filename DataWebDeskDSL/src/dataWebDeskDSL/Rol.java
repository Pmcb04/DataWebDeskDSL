/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Rol#getName <em>Name</em>}</li>
 *   <li>{@link dataWebDeskDSL.Rol#getAccess <em>Access</em>}</li>
 *   <li>{@link dataWebDeskDSL.Rol#getNumeroPaginasAccesibles <em>Numero Paginas Accesibles</em>}</li>
 *   <li>{@link dataWebDeskDSL.Rol#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getRol()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/DataWebDeskDSL/icons/rol.svg'"
 *        annotation="MyDSLDoc Name='Rol' Description='Permite diferenciar los distintos tipos de usuarios de la aplicaci\363n. Cada rol debe definir de forma obligatoria el atributo name. Adem\341s debe tener acceso de 1 a m\341s p\341ginas'"
 * @generated
 */
public interface Rol extends EObject {
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
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getRol_Name()
	 * @model annotation="MyDSLDoc Name='name' Type='EString' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Rol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' reference list.
	 * The list contents are of type {@link dataWebDeskDSL.Page}.
	 * It is bidirectional and its opposite is '{@link dataWebDeskDSL.Page#getMannagment <em>Mannagment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' reference list.
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getRol_Access()
	 * @see dataWebDeskDSL.Page#getMannagment
	 * @model opposite="mannagment" required="true"
	 *        annotation="gmf.link source='access' target='mannagment' style='dot' width='2'"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='*' Name='access' Type='reference'"
	 * @generated
	 */
	EList<Page> getAccess();

	/**
	 * Returns the value of the '<em><b>Numero Paginas Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Paginas Accesibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Paginas Accesibles</em>' attribute.
	 * @see #setNumeroPaginasAccesibles(int)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getRol_NumeroPaginasAccesibles()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if (self.access -&gt;oclIsUndefined()) then 0\n\t\t\t\t\telse self.access -&gt; size()\n\t\t\t\t\tendif'"
	 * @generated
	 */
	int getNumeroPaginasAccesibles();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Rol#getNumeroPaginasAccesibles <em>Numero Paginas Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Paginas Accesibles</em>' attribute.
	 * @see #getNumeroPaginasAccesibles()
	 * @generated
	 */
	void setNumeroPaginasAccesibles(int value);

	/**
	 * Returns the value of the '<em><b>Numero Entidades Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Entidades Accesibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Entidades Accesibles</em>' attribute.
	 * @see #setNumeroEntidadesAccesibles(int)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getRol_NumeroEntidadesAccesibles()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if (self.access-&gt;selectByKind(CRUDPage).entity-&gt;oclIsUndefined()) then 0\n\t\t\t\t\t\telse self.access-&gt;selectByKind(CRUDPage).entity-&gt;asSet() -&gt; size()\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	int getNumeroEntidadesAccesibles();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Rol#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Entidades Accesibles</em>' attribute.
	 * @see #getNumeroEntidadesAccesibles()
	 * @generated
	 */
	void setNumeroEntidadesAccesibles(int value);

} // Rol

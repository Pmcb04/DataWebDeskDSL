/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.SocialMedia#getName <em>Name</em>}</li>
 *   <li>{@link dataWebDeskDSL.SocialMedia#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getSocialMedia()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/DataWebDeskDSL/icons/redes-sociales.svg'"
 *        annotation="MyDSLDoc Name='Social Media' Description='Redes sociales modeladas en el sistema. De forma obligatoria debe definir los atributos user y name.'"
 * @generated
 */
public interface SocialMedia extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWebDeskDSL.TypeSocialMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see dataWebDeskDSL.TypeSocialMedia
	 * @see #setName(TypeSocialMedia)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getSocialMedia_Name()
	 * @model annotation="MyDSLDoc Name='name' Type='TypeSocialMedia' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	TypeSocialMedia getName();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.SocialMedia#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see dataWebDeskDSL.TypeSocialMedia
	 * @see #getName()
	 * @generated
	 */
	void setName(TypeSocialMedia value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getSocialMedia_User()
	 * @model annotation="MyDSLDoc Name='user' Type='EString' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.SocialMedia#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // SocialMedia

/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multimedia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Multimedia#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getMultimedia()
 * @model abstract="true"
 *        annotation="MyDSLDoc Name='Multimedia' Description='Representa a los distintos datos que pueden contener las p\341ginas. Define de forma obligatoria el atributo name. Es una superclase abstracta de Text, Video, Audio e Image'"
 * @generated
 */
public interface Multimedia extends EObject {
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
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getMultimedia_Name()
	 * @model annotation="MyDSLDoc Name='name' Type='EString' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Multimedia#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Multimedia

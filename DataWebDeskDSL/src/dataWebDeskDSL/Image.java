/**
 */
package dataWebDeskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Image#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getImage()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/DataWebDeskDSL/icons/image.svg'"
 *        annotation="MyDSLDoc Name='Image' Description='Elemento de tipo imagen representado en el modelo.'"
 * @generated
 */
public interface Image extends Multimedia {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWebDeskDSL.TypeImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see dataWebDeskDSL.TypeImage
	 * @see #setExtension(TypeImage)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getImage_Extension()
	 * @model annotation="MyDSLDoc Name='extension' Type='TypeText' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	TypeImage getExtension();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Image#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see dataWebDeskDSL.TypeImage
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(TypeImage value);

} // Image

/**
 */
package dataWebDeskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Video#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getVideo()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/DataWebDeskDSL/icons/video.svg'"
 *        annotation="MyDSLDoc Name='Video' Description='Elemento de tipo video representado en el modelo.'"
 * @generated
 */
public interface Video extends Multimedia {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWebDeskDSL.TypeVideo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see dataWebDeskDSL.TypeVideo
	 * @see #setExtension(TypeVideo)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getVideo_Extension()
	 * @model annotation="MyDSLDoc Name='extension' Type='TypeText' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	TypeVideo getExtension();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Video#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see dataWebDeskDSL.TypeVideo
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(TypeVideo value);

} // Video

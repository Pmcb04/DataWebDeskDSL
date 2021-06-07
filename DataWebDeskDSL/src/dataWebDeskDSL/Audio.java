/**
 */
package dataWebDeskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Audio#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getAudio()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/DataWebDeskDSL/icons/audio.svg'"
 *        annotation="MyDSLDoc Name='Audio' Description='Elemento de tipo audio representado en el modelo.'"
 * @generated
 */
public interface Audio extends Multimedia {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWebDeskDSL.TypeAudio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see dataWebDeskDSL.TypeAudio
	 * @see #setExtension(TypeAudio)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getAudio_Extension()
	 * @model annotation="MyDSLDoc Name='extension' Type='TypeText' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	TypeAudio getExtension();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Audio#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see dataWebDeskDSL.TypeAudio
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(TypeAudio value);

} // Audio

/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWebDeskDSL.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link dataWebDeskDSL.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link dataWebDeskDSL.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link dataWebDeskDSL.Attribute#getMaxValues <em>Max Values</em>}</li>
 * </ul>
 *
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getAttribute()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/DataWebDeskDSL/icons/atributo.svg'"
 *        annotation="MyDSLDoc Name='Attribute' Description='Permite definir los atributos de las entidades. Define de froma obligatoria los atributos name, value y maxvalues. Adem\341s est\341 relacionado con un tipo (type)'"
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getAttribute_Type()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 *        annotation="MyDSLDoc Upper\040bound='1' Lower\040bound='1' Name='trype' Type='reference'"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

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
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getAttribute_Name()
	 * @model annotation="MyDSLDoc Name='name' Type='EString' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getAttribute_Value()
	 * @model annotation="MyDSLDoc Name='value' Type='EString' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Values</em>' attribute.
	 * @see #setMaxValues(int)
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getAttribute_MaxValues()
	 * @model required="true"
	 *        annotation="MyDSLDoc Name='maxValues' Type='EInt' Lower\040bound='1' Upper\040bound='1'"
	 * @generated
	 */
	int getMaxValues();

	/**
	 * Sets the value of the '{@link dataWebDeskDSL.Attribute#getMaxValues <em>Max Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Values</em>' attribute.
	 * @see #getMaxValues()
	 * @generated
	 */
	void setMaxValues(int value);

} // Attribute

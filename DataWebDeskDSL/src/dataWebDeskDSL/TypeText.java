/**
 */
package dataWebDeskDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Text</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getTypeText()
 * @model annotation="MyDSLDoc Name='TypeText' Description='Representa el tipo de dato texto en el modelo.'"
 * @generated
 */
public enum TypeText implements Enumerator {
	/**
	 * The '<em><b>Txt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TXT_VALUE
	 * @generated
	 * @ordered
	 */
	TXT(0, "txt", "txt"),

	/**
	 * The '<em><b>Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_VALUE
	 * @generated
	 * @ordered
	 */
	DOC(1, "doc", "doc"),

	/**
	 * The '<em><b>Docx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCX_VALUE
	 * @generated
	 * @ordered
	 */
	DOCX(2, "docx", "docx");

	/**
	 * The '<em><b>Txt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Txt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TXT
	 * @model name="txt"
	 *        annotation="MyDSLDoc Name='txt' Value='0'"
	 * @generated
	 * @ordered
	 */
	public static final int TXT_VALUE = 0;

	/**
	 * The '<em><b>Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOC
	 * @model name="doc"
	 *        annotation="MyDSLDoc Name='doc' Value='1'"
	 * @generated
	 * @ordered
	 */
	public static final int DOC_VALUE = 1;

	/**
	 * The '<em><b>Docx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Docx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCX
	 * @model name="docx"
	 *        annotation="MyDSLDoc Name='docx' Value='2'"
	 * @generated
	 * @ordered
	 */
	public static final int DOCX_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Text</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeText[] VALUES_ARRAY =
		new TypeText[] {
			TXT,
			DOC,
			DOCX,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Text</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeText> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Text</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeText get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeText result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Text</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeText getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeText result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Text</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeText get(int value) {
		switch (value) {
			case TXT_VALUE: return TXT;
			case DOC_VALUE: return DOC;
			case DOCX_VALUE: return DOCX;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeText(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeText

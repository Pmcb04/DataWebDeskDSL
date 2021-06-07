/**
 */
package dataWebDeskDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Audio</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getTypeAudio()
 * @model annotation="MyDSLDoc Name='TypeAudio' Description='Representa el tipo de dato audio en el modelo.'"
 * @generated
 */
public enum TypeAudio implements Enumerator {
	/**
	 * The '<em><b>Mp3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP3_VALUE
	 * @generated
	 * @ordered
	 */
	MP3(0, "mp3", "mp3"),

	/**
	 * The '<em><b>Wav</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAV_VALUE
	 * @generated
	 * @ordered
	 */
	WAV(1, "wav", "wav"),

	/**
	 * The '<em><b>Wma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WMA_VALUE
	 * @generated
	 * @ordered
	 */
	WMA(2, "wma", "wma");

	/**
	 * The '<em><b>Mp3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mp3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MP3
	 * @model name="mp3"
	 *        annotation="MyDSLDoc Name='mp3' Value='0'"
	 * @generated
	 * @ordered
	 */
	public static final int MP3_VALUE = 0;

	/**
	 * The '<em><b>Wav</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wav</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAV
	 * @model name="wav"
	 *        annotation="MyDSLDoc Name='wav' Value='1'"
	 * @generated
	 * @ordered
	 */
	public static final int WAV_VALUE = 1;

	/**
	 * The '<em><b>Wma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WMA
	 * @model name="wma"
	 *        annotation="MyDSLDoc Name='wma' Value='2'"
	 * @generated
	 * @ordered
	 */
	public static final int WMA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Audio</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeAudio[] VALUES_ARRAY =
		new TypeAudio[] {
			MP3,
			WAV,
			WMA,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Audio</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeAudio> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Audio</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAudio get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAudio result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Audio</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAudio getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAudio result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Audio</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAudio get(int value) {
		switch (value) {
			case MP3_VALUE: return MP3;
			case WAV_VALUE: return WAV;
			case WMA_VALUE: return WMA;
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
	private TypeAudio(int value, String name, String literal) {
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
	
} //TypeAudio

/**
 */
package dataWebDeskDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Video</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getTypeVideo()
 * @model annotation="MyDSLDoc Name='TypeVideo' Description='Representa el tipo de dato video en el modelo.'"
 * @generated
 */
public enum TypeVideo implements Enumerator {
	/**
	 * The '<em><b>Mp4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP4_VALUE
	 * @generated
	 * @ordered
	 */
	MP4(0, "mp4", "mp4"),

	/**
	 * The '<em><b>Avi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVI_VALUE
	 * @generated
	 * @ordered
	 */
	AVI(1, "avi", "avi"),

	/**
	 * The '<em><b>Mkv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MKV_VALUE
	 * @generated
	 * @ordered
	 */
	MKV(2, "mkv", "mkv");

	/**
	 * The '<em><b>Mp4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mp4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MP4
	 * @model name="mp4"
	 *        annotation="MyDSLDoc Name='mp4' Value='0'"
	 * @generated
	 * @ordered
	 */
	public static final int MP4_VALUE = 0;

	/**
	 * The '<em><b>Avi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Avi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVI
	 * @model name="avi"
	 *        annotation="MyDSLDoc Name='avi' Value='1'"
	 * @generated
	 * @ordered
	 */
	public static final int AVI_VALUE = 1;

	/**
	 * The '<em><b>Mkv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mkv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MKV
	 * @model name="mkv"
	 *        annotation="MyDSLDoc Name='mkv' Value='2'"
	 * @generated
	 * @ordered
	 */
	public static final int MKV_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Video</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeVideo[] VALUES_ARRAY =
		new TypeVideo[] {
			MP4,
			AVI,
			MKV,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Video</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeVideo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Video</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeVideo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeVideo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Video</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeVideo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeVideo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Video</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeVideo get(int value) {
		switch (value) {
			case MP4_VALUE: return MP4;
			case AVI_VALUE: return AVI;
			case MKV_VALUE: return MKV;
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
	private TypeVideo(int value, String name, String literal) {
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
	
} //TypeVideo

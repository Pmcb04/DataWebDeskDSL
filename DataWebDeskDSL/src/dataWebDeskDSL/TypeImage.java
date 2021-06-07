/**
 */
package dataWebDeskDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Image</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getTypeImage()
 * @model annotation="MyDSLDoc Name='TypeImage' Description='Representa el tipo de dato imagen en el modelo.'"
 * @generated
 */
public enum TypeImage implements Enumerator {
	/**
	 * The '<em><b>Png</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNG_VALUE
	 * @generated
	 * @ordered
	 */
	PNG(0, "png", "png"),

	/**
	 * The '<em><b>Jpg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPG_VALUE
	 * @generated
	 * @ordered
	 */
	JPG(1, "jpg", "jpg"),

	/**
	 * The '<em><b>Gif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIF_VALUE
	 * @generated
	 * @ordered
	 */
	GIF(2, "gif", "gif");

	/**
	 * The '<em><b>Png</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Png</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNG
	 * @model name="png"
	 *        annotation="MyDSLDoc Name='png' Value='0'"
	 * @generated
	 * @ordered
	 */
	public static final int PNG_VALUE = 0;

	/**
	 * The '<em><b>Jpg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jpg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPG
	 * @model name="jpg"
	 *        annotation="MyDSLDoc Name='jpg' Value='1'"
	 * @generated
	 * @ordered
	 */
	public static final int JPG_VALUE = 1;

	/**
	 * The '<em><b>Gif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gif</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIF
	 * @model name="gif"
	 *        annotation="MyDSLDoc Name='gif' Value='2'"
	 * @generated
	 * @ordered
	 */
	public static final int GIF_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Image</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeImage[] VALUES_ARRAY =
		new TypeImage[] {
			PNG,
			JPG,
			GIF,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Image</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeImage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Image</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeImage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeImage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Image</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeImage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeImage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Image</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeImage get(int value) {
		switch (value) {
			case PNG_VALUE: return PNG;
			case JPG_VALUE: return JPG;
			case GIF_VALUE: return GIF;
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
	private TypeImage(int value, String name, String literal) {
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
	
} //TypeImage

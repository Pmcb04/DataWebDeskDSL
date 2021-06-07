/**
 */
package dataWebDeskDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Social Media</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage#getTypeSocialMedia()
 * @model annotation="MyDSLDoc Name='TypeVideo' Description='Representa el tipo de dato video en el modelo.'"
 * @generated
 */
public enum TypeSocialMedia implements Enumerator {
	/**
	 * The '<em><b>Facebook</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACEBOOK_VALUE
	 * @generated
	 * @ordered
	 */
	FACEBOOK(0, "Facebook", "Facebook"),

	/**
	 * The '<em><b>Twitter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWITTER_VALUE
	 * @generated
	 * @ordered
	 */
	TWITTER(1, "Twitter", "Twitter");

	/**
	 * The '<em><b>Facebook</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Facebook</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACEBOOK
	 * @model name="Facebook"
	 *        annotation="MyDSLDoc Name='facebook' Value='0'"
	 * @generated
	 * @ordered
	 */
	public static final int FACEBOOK_VALUE = 0;

	/**
	 * The '<em><b>Twitter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Twitter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWITTER
	 * @model name="Twitter"
	 *        annotation="MyDSLDoc Name='twitter' Value='1'"
	 * @generated
	 * @ordered
	 */
	public static final int TWITTER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Social Media</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeSocialMedia[] VALUES_ARRAY =
		new TypeSocialMedia[] {
			FACEBOOK,
			TWITTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Social Media</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeSocialMedia> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Social Media</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSocialMedia get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSocialMedia result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Social Media</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSocialMedia getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeSocialMedia result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Social Media</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeSocialMedia get(int value) {
		switch (value) {
			case FACEBOOK_VALUE: return FACEBOOK;
			case TWITTER_VALUE: return TWITTER;
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
	private TypeSocialMedia(int value, String name, String literal) {
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
	
} //TypeSocialMedia

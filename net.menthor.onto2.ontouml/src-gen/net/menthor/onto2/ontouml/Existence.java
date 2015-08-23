/**
 */
package net.menthor.onto2.ontouml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Existence</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * * An Existence defines identity providers to be permanent, transient or eternal in time/existence
 * <!-- end-model-doc -->
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getExistence()
 * @model
 * @generated
 */
public enum Existence implements Enumerator {
	/**
	 * The '<em><b>Unset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_VALUE
	 * @generated
	 * @ordered
	 */
	UNSET(0, "Unset", "Unset"),

	/**
	 * The '<em><b>Permanent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMANENT_VALUE
	 * @generated
	 * @ordered
	 */
	PERMANENT(0, "Permanent", "Permanent"),

	/**
	 * The '<em><b>Transient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSIENT(0, "Transient", "Transient"),

	/**
	 * The '<em><b>Eternal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	ETERNAL(0, "Eternal", "Eternal");

	/**
	 * The '<em><b>Unset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSET
	 * @model name="Unset"
	 * @generated
	 * @ordered
	 */
	public static final int UNSET_VALUE = 0;

	/**
	 * The '<em><b>Permanent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Permanent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERMANENT
	 * @model name="Permanent"
	 * @generated
	 * @ordered
	 */
	public static final int PERMANENT_VALUE = 0;

	/**
	 * The '<em><b>Transient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT
	 * @model name="Transient"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSIENT_VALUE = 0;

	/**
	 * The '<em><b>Eternal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eternal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETERNAL
	 * @model name="Eternal"
	 * @generated
	 * @ordered
	 */
	public static final int ETERNAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Existence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Existence[] VALUES_ARRAY =
		new Existence[] {
			UNSET,
			PERMANENT,
			TRANSIENT,
			ETERNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Existence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Existence> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Existence</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Existence get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Existence result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Existence</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Existence getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Existence result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Existence</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Existence get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
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
	private Existence(int value, String name, String literal) {
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
	
} //Existence

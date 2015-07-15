/**
 */
package net.menthor.onto2.ontouml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Steteotype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * * =========================================
 *  Constraint: is a constraint usually written in OCL.
 *  Here we support static invariants and derivations from standard OCL
 *  And also, temporal invariants and definition of historical relationships
 *  ========================================
 * <!-- end-model-doc -->
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraintSteteotype()
 * @model
 * @generated
 */
public enum ConstraintSteteotype implements Enumerator {
	/**
	 * The '<em><b>Invariant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	INVARIANT(0, "Invariant", "Invariant"),

	/**
	 * The '<em><b>Derivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVATION(0, "Derivation", "Derivation"),

	/**
	 * The '<em><b>Temporal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORAL(0, "Temporal", "Temporal"),

	/**
	 * The '<em><b>Historical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORICAL(0, "Historical", "Historical");

	/**
	 * The '<em><b>Invariant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invariant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVARIANT
	 * @model name="Invariant"
	 * @generated
	 * @ordered
	 */
	public static final int INVARIANT_VALUE = 0;

	/**
	 * The '<em><b>Derivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derivation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVATION
	 * @model name="Derivation"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVATION_VALUE = 0;

	/**
	 * The '<em><b>Temporal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temporal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL
	 * @model name="Temporal"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORAL_VALUE = 0;

	/**
	 * The '<em><b>Historical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Historical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL
	 * @model name="Historical"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Constraint Steteotype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintSteteotype[] VALUES_ARRAY =
		new ConstraintSteteotype[] {
			INVARIANT,
			DERIVATION,
			TEMPORAL,
			HISTORICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Steteotype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConstraintSteteotype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Steteotype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintSteteotype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintSteteotype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Steteotype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintSteteotype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintSteteotype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Steteotype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintSteteotype get(int value) {
		switch (value) {
			case INVARIANT_VALUE: return INVARIANT;
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
	private ConstraintSteteotype(int value, String name, String literal) {
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
	
} //ConstraintSteteotype

/**
 */
package net.menthor.onto2.ontouml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * A "Constraint" is a constraint usually written in OCL.
 *  Here we support static invariants and derivations from standard OCL
 *  And also, temporal invariants and definition of historical relationships.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Constraint#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Constraint#getContext <em>Context</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Constraint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends ContainedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.ConstraintStereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ConstraintStereotype
	 * @see #setStereotype(ConstraintStereotype)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	ConstraintStereotype getStereotype();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Constraint#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ConstraintStereotype
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ConstraintStereotype value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint_Context()
	 * @model unique="false"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Constraint#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getConstraint_Expression()
	 * @model unique="false"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Constraint#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // Constraint

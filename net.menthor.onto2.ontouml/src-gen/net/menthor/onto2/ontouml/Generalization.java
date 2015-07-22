/**
 */
package net.menthor.onto2.ontouml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Generalization#getSpecific <em>Specific</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Generalization#getGeneralizationSet <em>Generalization Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends ContainedElement {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.Classifier#getIsGeneralIn <em>Is General In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Classifier)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralization_General()
	 * @see net.menthor.onto2.ontouml.Classifier#getIsGeneralIn
	 * @model opposite="isGeneralIn" required="true"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.Classifier#getIsSpecificIn <em>Is Specific In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' reference.
	 * @see #setSpecific(Classifier)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralization_Specific()
	 * @see net.menthor.onto2.ontouml.Classifier#getIsSpecificIn
	 * @model opposite="isSpecificIn" required="true"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Generalization#getSpecific <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.GeneralizationSet#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Set</em>' reference.
	 * @see #setGeneralizationSet(GeneralizationSet)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralization_GeneralizationSet()
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#getGeneralizations
	 * @model opposite="generalizations"
	 * @generated
	 */
	GeneralizationSet getGeneralizationSet();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Generalization#getGeneralizationSet <em>Generalization Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization Set</em>' reference.
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	void setGeneralizationSet(GeneralizationSet value);

} // Generalization

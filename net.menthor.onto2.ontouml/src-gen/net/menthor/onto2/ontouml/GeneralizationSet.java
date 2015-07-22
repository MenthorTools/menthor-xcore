/**
 */
package net.menthor.onto2.ontouml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.GeneralizationSet#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.GeneralizationSet#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.GeneralizationSet#getHighOrder <em>High Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends NamedElement, ContainedElement {
	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Covering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralizationSet_IsCovering()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsCovering();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.GeneralizationSet#isIsCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #isIsCovering()
	 * @generated
	 */
	void setIsCovering(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralizationSet_IsDisjoint()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsDisjoint();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalizations</b></em>' reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.Generalization}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.Generalization#getGeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations</em>' reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralizationSet_Generalizations()
	 * @see net.menthor.onto2.ontouml.Generalization#getGeneralizationSet
	 * @model opposite="generalizationSet"
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

	/**
	 * Returns the value of the '<em><b>High Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Order</em>' reference.
	 * @see #setHighOrder(net.menthor.onto2.ontouml.Class)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getGeneralizationSet_HighOrder()
	 * @model
	 * @generated
	 */
	net.menthor.onto2.ontouml.Class getHighOrder();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.GeneralizationSet#getHighOrder <em>High Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Order</em>' reference.
	 * @see #getHighOrder()
	 * @generated
	 */
	void setHighOrder(net.menthor.onto2.ontouml.Class value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Generalization%>> _generalizations = this.getGeneralizations();\nint _size = _generalizations.size();\nboolean _greaterThan = (_size > 0);\nif (_greaterThan)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Generalization%>> _generalizations_1 = this.getGeneralizations();\n\t<%net.menthor.onto2.ontouml.Generalization%> _get = _generalizations_1.get(0);\n\treturn _get.getGeneral();\n}\nelse\n{\n\treturn null;\n}'"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%>[] result = null;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Generalization%>> _generalizations = this.getGeneralizations();\nfor (final <%net.menthor.onto2.ontouml.Generalization%> g : _generalizations)\n{\n\tfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_result = (<%net.menthor.onto2.ontouml.Classifier%>[])result;\n\t<%net.menthor.onto2.ontouml.Classifier%> _specific = g.getSpecific();\n\t((<%java.util.List%><<%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(_specific);\n}\nfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_result_1 = (<%net.menthor.onto2.ontouml.Classifier%>[])result;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));'"
	 * @generated
	 */
	EList<Classifier> getSpecifics();

} // GeneralizationSet

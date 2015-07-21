/**
 */
package net.menthor.onto2.ontouml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * =========================================
 *  Type: is a class or a dataType
 *  =========================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Type#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Classifier {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.Attribute}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getType_Attributes()
	 * @see net.menthor.onto2.ontouml.Attribute#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all types directly connected to this type through a relationship.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Type%>[] result = null;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _ends = this.ends();\nfor (final <%net.menthor.onto2.ontouml.EndPoint%> ep : _ends)\n{\n\tfinal <%net.menthor.onto2.ontouml.Type%>[] _converted_result = (<%net.menthor.onto2.ontouml.Type%>[])result;\n\t<%net.menthor.onto2.ontouml.Classifier%> _endType = ep.getEndType();\n\t((<%java.util.List%><<%net.menthor.onto2.ontouml.Type%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(((<%net.menthor.onto2.ontouml.Type%>) _endType));\n}\nfinal <%net.menthor.onto2.ontouml.Type%>[] _converted_result_1 = (<%net.menthor.onto2.ontouml.Type%>[])result;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Type%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Type%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));'"
	 * @generated
	 */
	EList<Type> relatedTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *Returns all types directly and indirectly connected to this type through a relationship.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Type%>[] result = null;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _allEnds = this.allEnds();\nfor (final <%net.menthor.onto2.ontouml.EndPoint%> ep : _allEnds)\n{\n\tfinal <%net.menthor.onto2.ontouml.Type%>[] _converted_result = (<%net.menthor.onto2.ontouml.Type%>[])result;\n\t<%net.menthor.onto2.ontouml.Classifier%> _endType = ep.getEndType();\n\t((<%java.util.List%><<%net.menthor.onto2.ontouml.Type%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(((<%net.menthor.onto2.ontouml.Type%>) _endType));\n}\nfinal <%net.menthor.onto2.ontouml.Type%>[] _converted_result_1 = (<%net.menthor.onto2.ontouml.Type%>[])result;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Type%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Type%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));'"
	 * @generated
	 */
	EList<Type> allRelatedTypes();

} // Type

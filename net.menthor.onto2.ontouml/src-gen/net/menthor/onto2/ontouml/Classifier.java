/**
 */
package net.menthor.onto2.ontouml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * =========================================
 *  Classifier: is a type (class or dataType) or a relationship.
 *  ========================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getText <em>Text</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getIsSpecializedVia <em>Is Specialized Via</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getSpecializesVia <em>Specializes Via</em>}</li>
 * </ul>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends ContainedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' attribute list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier_Definitions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Synonyms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonyms</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonyms</em>' attribute list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier_Synonyms()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSynonyms();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Classifier#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Is Specialized Via</b></em>' reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.GeneralizationSet#getSpecializedClassifier <em>Specialized Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Specialized Via</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specialized Via</em>' reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier_IsSpecializedVia()
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#getSpecializedClassifier
	 * @model opposite="specializedClassifier" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getIsSpecializedVia();

	/**
	 * Returns the value of the '<em><b>Specializes Via</b></em>' reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.GeneralizationSet#getSpecializingClassifier <em>Specializing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializes Via</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes Via</em>' reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier_SpecializesVia()
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#getSpecializingClassifier
	 * @model opposite="specializingClassifier" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getSpecializesVia();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Direct children
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Class%>[] list = null;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.GeneralizationSet%>> _isSpecializedVia = this.getIsSpecializedVia();\nfor (final <%net.menthor.onto2.ontouml.GeneralizationSet%> gs : _isSpecializedVia)\n{\n\tfinal <%net.menthor.onto2.ontouml.Class%>[] _converted_list = (<%net.menthor.onto2.ontouml.Class%>[])list;\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _specializingClassifier = gs.getSpecializingClassifier();\n\t<%com.google.common.collect.Iterables%>.<<%net.menthor.onto2.ontouml.Classifier%>>addAll(((<%java.util.Collection%><<%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)), _specializingClassifier);\n}\nfinal <%net.menthor.onto2.ontouml.Class%>[] _converted_list_1 = (<%net.menthor.onto2.ontouml.Class%>[])list;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));'"
	 * @generated
	 */
	EList<Classifier> children();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Direct parents
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%>[] list = null;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.GeneralizationSet%>> _specializesVia = this.getSpecializesVia();\nfor (final <%net.menthor.onto2.ontouml.GeneralizationSet%> gs : _specializesVia)\n{\n\tfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_list = (<%net.menthor.onto2.ontouml.Classifier%>[])list;\n\t<%net.menthor.onto2.ontouml.Classifier%> _specializedClassifier = gs.getSpecializedClassifier();\n\t((<%java.util.List%><<%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)).add(_specializedClassifier);\n}\nfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_list_1 = (<%net.menthor.onto2.ontouml.Classifier%>[])list;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));'"
	 * @generated
	 */
	EList<Classifier> parents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * All (direct and indirect) parents
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.GeneralizationSet%>> _specializesVia = this.getSpecializesVia();\nfor (final <%net.menthor.onto2.ontouml.GeneralizationSet%> gs : _specializesVia)\n{\n\t{\n\t\t<%net.menthor.onto2.ontouml.Classifier%> _specializedClassifier = gs.getSpecializedClassifier();\n\t\tresult.add(_specializedClassifier);\n\t\t<%net.menthor.onto2.ontouml.Classifier%> _specializedClassifier_1 = gs.getSpecializedClassifier();\n\t\tthis.allParents(_specializedClassifier_1, result);\n\t}\n}'"
	 * @generated
	 */
	void allParents(Classifier c, EList<Classifier> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * All (direct and indirect) parents
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%>[] list = null;\nfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_list = (<%net.menthor.onto2.ontouml.Classifier%>[])list;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)));\nthis.allParents(this, _eList);\nfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_list_1 = (<%net.menthor.onto2.ontouml.Classifier%>[])list;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));'"
	 * @generated
	 */
	EList<Classifier> allParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  All (direct and indirect) children
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.GeneralizationSet%>> _isSpecializedVia = this.getIsSpecializedVia();\nfor (final <%net.menthor.onto2.ontouml.GeneralizationSet%> gs : _isSpecializedVia)\n{\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _specializingClassifier = gs.getSpecializingClassifier();\n\t\tresult.addAll(_specializingClassifier);\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _specializingClassifier_1 = gs.getSpecializingClassifier();\n\t\tfor (final <%net.menthor.onto2.ontouml.Classifier%> children : _specializingClassifier_1)\n\t\t{\n\t\t\tthis.allChildren(children, result);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	void allChildren(Classifier c, EList<Classifier> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  All (direct and indirect) children
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%>[] list = null;\nfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_list = (<%net.menthor.onto2.ontouml.Classifier%>[])list;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)));\nthis.allChildren(this, _eList);\nfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_list_1 = (<%net.menthor.onto2.ontouml.Classifier%>[])list;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));'"
	 * @generated
	 */
	EList<Classifier> allChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns direct siblings i.e. classifiers which specialize the same super-classifier as this classifier
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%>[] result = null;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _parents = this.parents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _parents)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = p.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> sibling : _children)\n\t{\n\t\tboolean _equals = sibling.equals(this);\n\t\tboolean _not = (!_equals);\n\t\tif (_not)\n\t\t{\n\t\t\tfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_result = (<%net.menthor.onto2.ontouml.Classifier%>[])result;\n\t\t\t((<%java.util.List%><<%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(sibling);\n\t\t}\n\t}\n}\nfinal <%net.menthor.onto2.ontouml.Classifier%>[] _converted_result_1 = (<%net.menthor.onto2.ontouml.Classifier%>[])result;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.Classifier%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));'"
	 * @generated
	 */
	EList<Classifier> siblings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all direct end-points from this classifier (in which we can navigate from it)
	 *  In other words, it returns all opposite ends of the relationships connected to this classifier.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.EndPoint%>[] result = null;\n<%net.menthor.onto2.ontouml.Model%> _model = this.getModel();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Relationship%>> _allRelationships = _model.allRelationships();\nfor (final <%net.menthor.onto2.ontouml.Relationship%> rel : _allRelationships)\n{\n\tboolean _isEnd = rel.isEnd(this);\n\tif (_isEnd)\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = rel.getEndPoints();\n\t\tfor (final <%net.menthor.onto2.ontouml.EndPoint%> ep : _endPoints)\n\t\t{\n\t\t\t<%net.menthor.onto2.ontouml.Classifier%> _endType = ep.getEndType();\n\t\t\tboolean _equals = _endType.equals(this);\n\t\t\tboolean _not = (!_equals);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\tfinal <%net.menthor.onto2.ontouml.EndPoint%>[] _converted_result = (<%net.menthor.onto2.ontouml.EndPoint%>[])result;\n\t\t\t\t((<%java.util.List%><<%net.menthor.onto2.ontouml.EndPoint%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(ep);\n\t\t\t}\n\t\t}\n\t}\n}\nfinal <%net.menthor.onto2.ontouml.EndPoint%>[] _converted_result_1 = (<%net.menthor.onto2.ontouml.EndPoint%>[])result;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.EndPoint%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.EndPoint%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));'"
	 * @generated
	 */
	EList<EndPoint> ends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all direct and indirect end-points from this classifier (in which we can navigate from it)
	 *  In other words, it returns all opposite ends of the relationships connected to this classifier, or to a parent of this classifier.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.EndPoint%>[] result = null;\nfinal <%net.menthor.onto2.ontouml.EndPoint%>[] _converted_result = (<%net.menthor.onto2.ontouml.EndPoint%>[])result;\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _ends = this.ends();\n((<%java.util.List%><<%net.menthor.onto2.ontouml.EndPoint%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).addAll(_ends);\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = this.allParents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _allParents)\n{\n\tif ((p instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t{\n\t\tfinal <%net.menthor.onto2.ontouml.EndPoint%>[] _converted_result_1 = (<%net.menthor.onto2.ontouml.EndPoint%>[])result;\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _ends_1 = ((<%net.menthor.onto2.ontouml.Class%>)p).ends();\n\t\t((<%java.util.List%><<%net.menthor.onto2.ontouml.EndPoint%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)).addAll(_ends_1);\n\t}\n}\nfinal <%net.menthor.onto2.ontouml.EndPoint%>[] _converted_result_2 = (<%net.menthor.onto2.ontouml.EndPoint%>[])result;\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.EndPoint%>>toEList(((<%java.lang.Iterable%><? extends <%net.menthor.onto2.ontouml.EndPoint%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_2)));'"
	 * @generated
	 */
	EList<EndPoint> allEnds();

} // Classifier

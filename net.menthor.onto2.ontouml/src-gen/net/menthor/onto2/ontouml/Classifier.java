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
 * * A "Classifier" is a "Type" (i.e., a Class or a DataType) or a Relationship.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getText <em>Text</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getIsGeneralIn <em>Is General In</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Classifier#getIsSpecificIn <em>Is Specific In</em>}</li>
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
	 * Returns the value of the '<em><b>Is General In</b></em>' reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.Generalization}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is General In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is General In</em>' reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier_IsGeneralIn()
	 * @see net.menthor.onto2.ontouml.Generalization#getGeneral
	 * @model opposite="general"
	 * @generated
	 */
	EList<Generalization> getIsGeneralIn();

	/**
	 * Returns the value of the '<em><b>Is Specific In</b></em>' reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.Generalization}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Specific In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specific In</em>' reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassifier_IsSpecificIn()
	 * @see net.menthor.onto2.ontouml.Generalization#getSpecific
	 * @model opposite="specific"
	 * @generated
	 */
	EList<Generalization> getIsSpecificIn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Direct children
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Classifier%>> list = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Classifier%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Generalization%>> _isGeneralIn = this.getIsGeneralIn();\nfor (final <%net.menthor.onto2.ontouml.Generalization%> g : _isGeneralIn)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _specific = g.getSpecific();\n\tlist.add(_specific);\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(list);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Classifier%>> list = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Classifier%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Generalization%>> _isSpecificIn = this.getIsSpecificIn();\nfor (final <%net.menthor.onto2.ontouml.Generalization%> g : _isSpecificIn)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _general = g.getGeneral();\n\tlist.add(_general);\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(list);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Generalization%>> _isSpecificIn = c.getIsSpecificIn();\nfor (final <%net.menthor.onto2.ontouml.Generalization%> g : _isSpecificIn)\n{\n\t{\n\t\tfinal <%net.menthor.onto2.ontouml.Classifier%> parent = g.getGeneral();\n\t\tresult.add(parent);\n\t\tthis.allParents(parent, result);\n\t}\n}'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Classifier%>> list = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Classifier%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(list);\nthis.allParents(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(list);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Generalization%>> _isGeneralIn = c.getIsGeneralIn();\nfor (final <%net.menthor.onto2.ontouml.Generalization%> g : _isGeneralIn)\n{\n\t{\n\t\tfinal <%net.menthor.onto2.ontouml.Classifier%> child = g.getSpecific();\n\t\tresult.add(child);\n\t\tthis.allChildren(child, result);\n\t}\n}'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Classifier%>> list = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Classifier%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(list);\nthis.allChildren(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(list);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Classifier%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Classifier%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _parents = this.parents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _parents)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = p.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> sibling : _children)\n\t{\n\t\tboolean _equals = sibling.equals(this);\n\t\tboolean _not = (!_equals);\n\t\tif (_not)\n\t\t{\n\t\t\tresult.add(sibling);\n\t\t}\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Classifier%>>toEList(result);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.EndPoint%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.EndPoint%>>newArrayList();\n<%net.menthor.onto2.ontouml.Model%> _model = this.getModel();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Relationship%>> _allRelationships = _model.allRelationships();\nfor (final <%net.menthor.onto2.ontouml.Relationship%> rel : _allRelationships)\n{\n\tboolean _isEnd = rel.isEnd(this);\n\tif (_isEnd)\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = rel.getEndPoints();\n\t\tfor (final <%net.menthor.onto2.ontouml.EndPoint%> ep : _endPoints)\n\t\t{\n\t\t\t{\n\t\t\t\tfinal <%net.menthor.onto2.ontouml.Classifier%> type_ = ep.getEndType();\n\t\t\t\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(type_, null));\n\t\t\t\tif (_notEquals)\n\t\t\t\t{\n\t\t\t\t\tboolean _equals = type_.equals(this);\n\t\t\t\t\tboolean _not = (!_equals);\n\t\t\t\t\tif (_not)\n\t\t\t\t\t{\n\t\t\t\t\t\tresult.add(ep);\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.EndPoint%>>toEList(result);'"
	 * @generated
	 */
	EList<EndPoint> ends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all direct end-points of a given relationship stereotype from this classifier (in which we can navigate from it)
	 *  In other words, it returns all opposite ends of the relationships connected to this classifier.
	 * <!-- end-model-doc -->
	 * @model unique="false" stereoUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.EndPoint%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.EndPoint%>>newArrayList();\n<%net.menthor.onto2.ontouml.Model%> _model = this.getModel();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Relationship%>> _allRelationships = _model.allRelationships();\nfor (final <%net.menthor.onto2.ontouml.Relationship%> rel : _allRelationships)\n{\n\tboolean _and = false;\n\tboolean _isEnd = rel.isEnd(this);\n\tif (!_isEnd)\n\t{\n\t\t_and = false;\n\t} else\n\t{\n\t\t<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = rel.getStereotype();\n\t\tboolean _equals = _stereotype.equals(stereo);\n\t\t_and = _equals;\n\t}\n\tif (_and)\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = rel.getEndPoints();\n\t\tfor (final <%net.menthor.onto2.ontouml.EndPoint%> ep : _endPoints)\n\t\t{\n\t\t\t{\n\t\t\t\tfinal <%net.menthor.onto2.ontouml.Classifier%> type_ = ep.getEndType();\n\t\t\t\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(type_, null));\n\t\t\t\tif (_notEquals)\n\t\t\t\t{\n\t\t\t\t\tboolean _equals_1 = type_.equals(this);\n\t\t\t\t\tboolean _not = (!_equals_1);\n\t\t\t\t\tif (_not)\n\t\t\t\t\t{\n\t\t\t\t\t\tresult.add(ep);\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.EndPoint%>>toEList(result);'"
	 * @generated
	 */
	EList<EndPoint> ends(RelationshipStereotype stereo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all direct and indirect end-points from this classifier (in which we can navigate from it)
	 *  In other words, it returns all opposite ends of the relationships connected to this classifier, or to a parent of this classifier.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.EndPoint%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.EndPoint%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _ends = this.ends();\nresult.addAll(_ends);\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = this.allParents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _allParents)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _ends_1 = p.ends();\n\tresult.addAll(_ends_1);\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.EndPoint%>>toEList(result);'"
	 * @generated
	 */
	EList<EndPoint> allEnds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all direct and indirect end-points from this classifier (in which we can navigate from it)
	 *  In other words, it returns all opposite ends of the relationships connected to this classifier, or to a parent of this classifier.
	 * <!-- end-model-doc -->
	 * @model unique="false" stereoUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.EndPoint%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.EndPoint%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _ends = this.ends(stereo);\nresult.addAll(_ends);\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = this.allParents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _allParents)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _ends_1 = p.ends(stereo);\n\tresult.addAll(_ends_1);\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.EndPoint%>>toEList(result);'"
	 * @generated
	 */
	EList<EndPoint> allEnds(RelationshipStereotype stereo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all direct relationships this classifier is connected to
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Relationship%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Relationship%>>newArrayList();\n<%net.menthor.onto2.ontouml.Model%> _model = this.getModel();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Relationship%>> _allRelationships = _model.allRelationships();\nfor (final <%net.menthor.onto2.ontouml.Relationship%> rel : _allRelationships)\n{\n\tboolean _isEnd = rel.isEnd(this);\n\tif (_isEnd)\n\t{\n\t\tresult.add(rel);\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Relationship%>>toEList(result);'"
	 * @generated
	 */
	EList<Relationship> relationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns all direct and indirect relationships this classifier is connected to
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Relationship%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Relationship%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Relationship%>> _relationships = this.relationships();\nresult.addAll(_relationships);\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = this.allParents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _allParents)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Relationship%>> _relationships_1 = p.relationships();\n\tresult.addAll(_relationships_1);\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Relationship%>>toEList(result);'"
	 * @generated
	 */
	EList<Relationship> allRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = c.allParents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> o : _allParents)\n{\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents_1 = this.allParents();\n\t\tboolean _contains = _allParents_1.contains(o);\n\t\tif (_contains)\n\t\t{\n\t\t\treturn false;\n\t\t}\n\t\tboolean _equals = this.equals(o);\n\t\tif (_equals)\n\t\t{\n\t\t\treturn false;\n\t\t}\n\t}\n}\nreturn true;'"
	 * @generated
	 */
	boolean isDisjointOfParentsOf(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allChildren = c.allChildren();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> o : _allChildren)\n{\n\t{\n\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = this.allParents();\n\t\tboolean _contains = _allParents.contains(o);\n\t\tif (_contains)\n\t\t{\n\t\t\treturn false;\n\t\t}\n\t\tboolean _equals = this.equals(o);\n\t\tif (_equals)\n\t\t{\n\t\t\treturn false;\n\t\t}\n\t}\n}\nreturn true;'"
	 * @generated
	 */
	boolean isDisjointOfChildrenOf(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isDisjointOfParentsOf = this.isDisjointOfParentsOf(c);\nif (!_isDisjointOfParentsOf)\n{\n\t_and = false;\n} else\n{\n\tboolean _isDisjointOfChildrenOf = this.isDisjointOfChildrenOf(c);\n\t_and = _isDisjointOfChildrenOf;\n}\nif (_and)\n{\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isDisjointOf(Classifier c);

} // Classifier

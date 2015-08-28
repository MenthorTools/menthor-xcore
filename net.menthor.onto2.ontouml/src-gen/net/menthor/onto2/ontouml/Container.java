/**
 */
package net.menthor.onto2.ontouml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * A Container is a NamedElement that can contain a set of:
 *  Packages, Relationships, Classes, DataTypes, Generalization Sets, Generalizations and Constraints. This is an abstract class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Container#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.ContainedElement}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.ContainedElement#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getContainer_Elements()
	 * @see net.menthor.onto2.ontouml.ContainedElement#getHolder
	 * @model opposite="holder" containment="true" ordered="false"
	 * @generated
	 */
	EList<ContainedElement> getElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the packages at this particular container. It does not search in depth.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Package%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Package%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = this.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\tif ((e instanceof <%net.menthor.onto2.ontouml.Package%>))\n\t{\n\t\tresult.add(((<%net.menthor.onto2.ontouml.Package%>)e));\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Package%>>toEList(result);'"
	 * @generated
	 */
	EList<net.menthor.onto2.ontouml.Package> packages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all packages at this container.
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = c.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\tif ((e instanceof <%net.menthor.onto2.ontouml.Package%>))\n\t{\n\t\tresult.add(((<%net.menthor.onto2.ontouml.Package%>)e));\n\t\tthis.allPackages(((<%net.menthor.onto2.ontouml.Container%>)e), result);\n\t}\n}'"
	 * @generated
	 */
	void allPackages(Container c, EList<net.menthor.onto2.ontouml.Package> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all packages at this container.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Package%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Package%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Package%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Package%>>toEList(result);\nthis.allPackages(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Package%>>toEList(result);'"
	 * @generated
	 */
	EList<net.menthor.onto2.ontouml.Package> allPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the relationships at this particular container. It does not search in depth.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Relationship%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Relationship%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = this.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\tif ((e instanceof <%net.menthor.onto2.ontouml.Relationship%>))\n\t{\n\t\tresult.add(((<%net.menthor.onto2.ontouml.Relationship%>)e));\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Relationship%>>toEList(result);'"
	 * @generated
	 */
	EList<Relationship> relationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all relationships at this container.
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = c.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\t{\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Relationship%>))\n\t\t{\n\t\t\tresult.add(((<%net.menthor.onto2.ontouml.Relationship%>)e));\n\t\t}\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Package%>))\n\t\t{\n\t\t\tthis.allRelationships(((<%net.menthor.onto2.ontouml.Container%>)e), result);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	void allRelationships(Container c, EList<Relationship> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all relationships at this container.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Relationship%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Relationship%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Relationship%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Relationship%>>toEList(result);\nthis.allRelationships(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Relationship%>>toEList(result);'"
	 * @generated
	 */
	EList<Relationship> allRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the generalization sets at this particular container. It does not search in depth.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.GeneralizationSet%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.GeneralizationSet%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = this.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\tif ((e instanceof <%net.menthor.onto2.ontouml.GeneralizationSet%>))\n\t{\n\t\tresult.add(((<%net.menthor.onto2.ontouml.GeneralizationSet%>)e));\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.GeneralizationSet%>>toEList(result);'"
	 * @generated
	 */
	EList<GeneralizationSet> generalizationSets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (seraching in depth) all generalization sets at this container.
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = c.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\t{\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.GeneralizationSet%>))\n\t\t{\n\t\t\tresult.add(((<%net.menthor.onto2.ontouml.GeneralizationSet%>)e));\n\t\t}\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Package%>))\n\t\t{\n\t\t\tthis.allGeneralizationSets(((<%net.menthor.onto2.ontouml.Container%>)e), result);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	void allGeneralizationSets(Container c, EList<GeneralizationSet> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (seraching in depth) all generalization sets at this container.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.GeneralizationSet%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.GeneralizationSet%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.GeneralizationSet%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.GeneralizationSet%>>toEList(result);\nthis.allGeneralizationSets(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.GeneralizationSet%>>toEList(result);'"
	 * @generated
	 */
	EList<GeneralizationSet> allGeneralizationSets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the classes at this particular container. It does not search in depth.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = this.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\tif ((e instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t{\n\t\tresult.add(((<%net.menthor.onto2.ontouml.Class%>)e));\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Class%>>toEList(result);'"
	 * @generated
	 */
	EList<net.menthor.onto2.ontouml.Class> classes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all classes at this container.
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = c.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\t{\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tresult.add(((<%net.menthor.onto2.ontouml.Class%>)e));\n\t\t}\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Package%>))\n\t\t{\n\t\t\tthis.allClasses(((<%net.menthor.onto2.ontouml.Container%>)e), result);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	void allClasses(Container c, EList<net.menthor.onto2.ontouml.Class> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all classes at this container.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Class%>>toEList(result);\nthis.allClasses(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Class%>>toEList(result);'"
	 * @generated
	 */
	EList<net.menthor.onto2.ontouml.Class> allClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the dataTypes at this particular container. It does not search in depth.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.DataType%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.DataType%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = this.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\tif ((e instanceof <%net.menthor.onto2.ontouml.DataType%>))\n\t{\n\t\tresult.add(((<%net.menthor.onto2.ontouml.DataType%>)e));\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.DataType%>>toEList(result);'"
	 * @generated
	 */
	EList<DataType> dataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all dataTypes at this container.
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = c.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\t{\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.DataType%>))\n\t\t{\n\t\t\tresult.add(((<%net.menthor.onto2.ontouml.DataType%>)e));\n\t\t}\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Package%>))\n\t\t{\n\t\t\tthis.allDataTypes(((<%net.menthor.onto2.ontouml.Container%>)e), result);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	void allDataTypes(Container c, EList<DataType> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all dataTypes at this container.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.DataType%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.DataType%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.DataType%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.DataType%>>toEList(result);\nthis.allDataTypes(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.DataType%>>toEList(result);'"
	 * @generated
	 */
	EList<DataType> allDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the types (classes and dataTypes) at this particular container.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Type%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Type%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = this.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\tif ((e instanceof <%net.menthor.onto2.ontouml.Type%>))\n\t{\n\t\tresult.add(((<%net.menthor.onto2.ontouml.Type%>)e));\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Type%>>toEList(result);'"
	 * @generated
	 */
	EList<Type> types();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all types (classes and dataTypes) at this container
	 * <!-- end-model-doc -->
	 * @model cUnique="false" resultUnique="false" resultMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.ContainedElement%>> _elements = c.getElements();\nfor (final <%net.menthor.onto2.ontouml.ContainedElement%> e : _elements)\n{\n\t{\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Type%>))\n\t\t{\n\t\t\tresult.add(((<%net.menthor.onto2.ontouml.Type%>)e));\n\t\t}\n\t\tif ((e instanceof <%net.menthor.onto2.ontouml.Package%>))\n\t\t{\n\t\t\tthis.allTypes(((<%net.menthor.onto2.ontouml.Container%>)e), result);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	void allTypes(Container c, EList<Type> result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns recursively (searching in depth) all types (classes and dataTypes) at this container
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Type%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Type%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Type%>> _eList = <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Type%>>toEList(result);\nthis.allTypes(this, _eList);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Type%>>toEList(result);'"
	 * @generated
	 */
	EList<Type> allTypes();

} // Container

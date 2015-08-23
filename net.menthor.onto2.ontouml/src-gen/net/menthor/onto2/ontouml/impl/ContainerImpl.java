/**
 */
package net.menthor.onto2.ontouml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.Collection;

import net.menthor.onto2.ontouml.ContainedElement;
import net.menthor.onto2.ontouml.DataType;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.OntoumlPackage;
import net.menthor.onto2.ontouml.Relationship;
import net.menthor.onto2.ontouml.Type;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ContainerImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends NamedElementImpl implements net.menthor.onto2.ontouml.Container {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainedElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainedElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<ContainedElement>(ContainedElement.class, this, OntoumlPackage.CONTAINER__ELEMENTS, OntoumlPackage.CONTAINED_ELEMENT__HOLDER);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<net.menthor.onto2.ontouml.Package> packages() {
		ArrayList<net.menthor.onto2.ontouml.Package> result = CollectionLiterals.<net.menthor.onto2.ontouml.Package>newArrayList();
		EList<ContainedElement> _elements = this.getElements();
		for (final ContainedElement e : _elements) {
			if ((e instanceof net.menthor.onto2.ontouml.Package)) {
				result.add(((net.menthor.onto2.ontouml.Package)e));
			}
		}
		return ECollections.<net.menthor.onto2.ontouml.Package>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allPackages(final net.menthor.onto2.ontouml.Container c, final EList<net.menthor.onto2.ontouml.Package> result) {
		EList<ContainedElement> _elements = c.getElements();
		for (final ContainedElement e : _elements) {
			if ((e instanceof net.menthor.onto2.ontouml.Package)) {
				result.add(((net.menthor.onto2.ontouml.Package)e));
				this.allPackages(((net.menthor.onto2.ontouml.Container)e), result);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<net.menthor.onto2.ontouml.Package> allPackages() {
		ArrayList<net.menthor.onto2.ontouml.Package> result = CollectionLiterals.<net.menthor.onto2.ontouml.Package>newArrayList();
		EList<net.menthor.onto2.ontouml.Package> _eList = ECollections.<net.menthor.onto2.ontouml.Package>toEList(result);
		this.allPackages(this, _eList);
		return ECollections.<net.menthor.onto2.ontouml.Package>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> relationships() {
		ArrayList<Relationship> result = CollectionLiterals.<Relationship>newArrayList();
		EList<ContainedElement> _elements = this.getElements();
		for (final ContainedElement e : _elements) {
			if ((e instanceof Relationship)) {
				result.add(((Relationship)e));
			}
		}
		return ECollections.<Relationship>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allRelationships(final net.menthor.onto2.ontouml.Container c, final EList<Relationship> result) {
		EList<ContainedElement> _elements = c.getElements();
		for (final ContainedElement e : _elements) {
			{
				if ((e instanceof Relationship)) {
					result.add(((Relationship)e));
				}
				if ((e instanceof net.menthor.onto2.ontouml.Package)) {
					this.allRelationships(((net.menthor.onto2.ontouml.Container)e), result);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> allRelationships() {
		ArrayList<Relationship> result = CollectionLiterals.<Relationship>newArrayList();
		EList<Relationship> _eList = ECollections.<Relationship>toEList(result);
		this.allRelationships(this, _eList);
		return ECollections.<Relationship>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> generalizationSets() {
		ArrayList<GeneralizationSet> result = CollectionLiterals.<GeneralizationSet>newArrayList();
		EList<ContainedElement> _elements = this.getElements();
		for (final ContainedElement e : _elements) {
			if ((e instanceof GeneralizationSet)) {
				result.add(((GeneralizationSet)e));
			}
		}
		return ECollections.<GeneralizationSet>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allGeneralizationSets(final net.menthor.onto2.ontouml.Container c, final EList<GeneralizationSet> result) {
		EList<ContainedElement> _elements = c.getElements();
		for (final ContainedElement e : _elements) {
			{
				if ((e instanceof GeneralizationSet)) {
					result.add(((GeneralizationSet)e));
				}
				if ((e instanceof net.menthor.onto2.ontouml.Package)) {
					this.allGeneralizationSets(((net.menthor.onto2.ontouml.Container)e), result);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> allGeneralizationSets() {
		ArrayList<GeneralizationSet> result = CollectionLiterals.<GeneralizationSet>newArrayList();
		EList<GeneralizationSet> _eList = ECollections.<GeneralizationSet>toEList(result);
		this.allGeneralizationSets(this, _eList);
		return ECollections.<GeneralizationSet>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<net.menthor.onto2.ontouml.Class> classes() {
		ArrayList<net.menthor.onto2.ontouml.Class> result = CollectionLiterals.<net.menthor.onto2.ontouml.Class>newArrayList();
		EList<ContainedElement> _elements = this.getElements();
		for (final ContainedElement e : _elements) {
			if ((e instanceof net.menthor.onto2.ontouml.Class)) {
				result.add(((net.menthor.onto2.ontouml.Class)e));
			}
		}
		return ECollections.<net.menthor.onto2.ontouml.Class>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allClasses(final net.menthor.onto2.ontouml.Container c, final EList<net.menthor.onto2.ontouml.Class> result) {
		EList<ContainedElement> _elements = c.getElements();
		for (final ContainedElement e : _elements) {
			{
				if ((e instanceof net.menthor.onto2.ontouml.Class)) {
					result.add(((net.menthor.onto2.ontouml.Class)e));
				}
				if ((e instanceof net.menthor.onto2.ontouml.Package)) {
					this.allClasses(((net.menthor.onto2.ontouml.Container)e), result);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<net.menthor.onto2.ontouml.Class> allClasses() {
		ArrayList<net.menthor.onto2.ontouml.Class> result = CollectionLiterals.<net.menthor.onto2.ontouml.Class>newArrayList();
		EList<net.menthor.onto2.ontouml.Class> _eList = ECollections.<net.menthor.onto2.ontouml.Class>toEList(result);
		this.allClasses(this, _eList);
		return ECollections.<net.menthor.onto2.ontouml.Class>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> dataTypes() {
		ArrayList<DataType> result = CollectionLiterals.<DataType>newArrayList();
		EList<ContainedElement> _elements = this.getElements();
		for (final ContainedElement e : _elements) {
			if ((e instanceof DataType)) {
				result.add(((DataType)e));
			}
		}
		return ECollections.<DataType>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allDataTypes(final net.menthor.onto2.ontouml.Container c, final EList<DataType> result) {
		EList<ContainedElement> _elements = c.getElements();
		for (final ContainedElement e : _elements) {
			{
				if ((e instanceof DataType)) {
					result.add(((DataType)e));
				}
				if ((e instanceof net.menthor.onto2.ontouml.Package)) {
					this.allDataTypes(((net.menthor.onto2.ontouml.Container)e), result);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> allDataTypes() {
		ArrayList<DataType> result = CollectionLiterals.<DataType>newArrayList();
		EList<DataType> _eList = ECollections.<DataType>toEList(result);
		this.allDataTypes(this, _eList);
		return ECollections.<DataType>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> types() {
		ArrayList<Type> result = CollectionLiterals.<Type>newArrayList();
		EList<ContainedElement> _elements = this.getElements();
		for (final ContainedElement e : _elements) {
			if ((e instanceof Type)) {
				result.add(((Type)e));
			}
		}
		return ECollections.<Type>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allTypes(final net.menthor.onto2.ontouml.Container c, final EList<Type> result) {
		EList<ContainedElement> _elements = c.getElements();
		for (final ContainedElement e : _elements) {
			{
				if ((e instanceof Type)) {
					result.add(((Type)e));
				}
				if ((e instanceof net.menthor.onto2.ontouml.Package)) {
					this.allTypes(((net.menthor.onto2.ontouml.Container)e), result);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> allTypes() {
		ArrayList<Type> result = CollectionLiterals.<Type>newArrayList();
		EList<Type> _eList = ECollections.<Type>toEList(result);
		this.allTypes(this, _eList);
		return ECollections.<Type>toEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoumlPackage.CONTAINER__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoumlPackage.CONTAINER__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoumlPackage.CONTAINER__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntoumlPackage.CONTAINER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ContainedElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OntoumlPackage.CONTAINER__ELEMENTS:
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OntoumlPackage.CONTAINER__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OntoumlPackage.CONTAINER___PACKAGES:
				return packages();
			case OntoumlPackage.CONTAINER___ALL_PACKAGES__CONTAINER_ELIST:
				allPackages((net.menthor.onto2.ontouml.Container)arguments.get(0), (EList<net.menthor.onto2.ontouml.Package>)arguments.get(1));
				return null;
			case OntoumlPackage.CONTAINER___ALL_PACKAGES:
				return allPackages();
			case OntoumlPackage.CONTAINER___RELATIONSHIPS:
				return relationships();
			case OntoumlPackage.CONTAINER___ALL_RELATIONSHIPS__CONTAINER_ELIST:
				allRelationships((net.menthor.onto2.ontouml.Container)arguments.get(0), (EList<Relationship>)arguments.get(1));
				return null;
			case OntoumlPackage.CONTAINER___ALL_RELATIONSHIPS:
				return allRelationships();
			case OntoumlPackage.CONTAINER___GENERALIZATION_SETS:
				return generalizationSets();
			case OntoumlPackage.CONTAINER___ALL_GENERALIZATION_SETS__CONTAINER_ELIST:
				allGeneralizationSets((net.menthor.onto2.ontouml.Container)arguments.get(0), (EList<GeneralizationSet>)arguments.get(1));
				return null;
			case OntoumlPackage.CONTAINER___ALL_GENERALIZATION_SETS:
				return allGeneralizationSets();
			case OntoumlPackage.CONTAINER___CLASSES:
				return classes();
			case OntoumlPackage.CONTAINER___ALL_CLASSES__CONTAINER_ELIST:
				allClasses((net.menthor.onto2.ontouml.Container)arguments.get(0), (EList<net.menthor.onto2.ontouml.Class>)arguments.get(1));
				return null;
			case OntoumlPackage.CONTAINER___ALL_CLASSES:
				return allClasses();
			case OntoumlPackage.CONTAINER___DATA_TYPES:
				return dataTypes();
			case OntoumlPackage.CONTAINER___ALL_DATA_TYPES__CONTAINER_ELIST:
				allDataTypes((net.menthor.onto2.ontouml.Container)arguments.get(0), (EList<DataType>)arguments.get(1));
				return null;
			case OntoumlPackage.CONTAINER___ALL_DATA_TYPES:
				return allDataTypes();
			case OntoumlPackage.CONTAINER___TYPES:
				return types();
			case OntoumlPackage.CONTAINER___ALL_TYPES__CONTAINER_ELIST:
				allTypes((net.menthor.onto2.ontouml.Container)arguments.get(0), (EList<Type>)arguments.get(1));
				return null;
			case OntoumlPackage.CONTAINER___ALL_TYPES:
				return allTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerImpl

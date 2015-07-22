/**
 */
package net.menthor.onto2.ontouml.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.Generalization;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.NamedElement;
import net.menthor.onto2.ontouml.OntoumlPackage;
import net.menthor.onto2.ontouml.Relationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassifierImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassifierImpl#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassifierImpl#getText <em>Text</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassifierImpl#getIsGeneralIn <em>Is General In</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassifierImpl#getIsSpecificIn <em>Is Specific In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends ContainedElementImpl implements Classifier {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> definitions;

	/**
	 * The cached value of the '{@link #getSynonyms() <em>Synonyms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<String> synonyms;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsGeneralIn() <em>Is General In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGeneralIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> isGeneralIn;

	/**
	 * The cached value of the '{@link #getIsSpecificIn() <em>Is Specific In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpecificIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> isSpecificIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.CLASSIFIER;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASSIFIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefinitions() {
		if (definitions == null) {
			definitions = new EDataTypeEList<String>(String.class, this, OntoumlPackage.CLASSIFIER__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSynonyms() {
		if (synonyms == null) {
			synonyms = new EDataTypeEList<String>(String.class, this, OntoumlPackage.CLASSIFIER__SYNONYMS);
		}
		return synonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASSIFIER__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getIsGeneralIn() {
		if (isGeneralIn == null) {
			isGeneralIn = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, OntoumlPackage.CLASSIFIER__IS_GENERAL_IN, OntoumlPackage.GENERALIZATION__GENERAL);
		}
		return isGeneralIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getIsSpecificIn() {
		if (isSpecificIn == null) {
			isSpecificIn = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN, OntoumlPackage.GENERALIZATION__SPECIFIC);
		}
		return isSpecificIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> children() {
		Classifier[] list = null;
		EList<Generalization> _isGeneralIn = this.getIsGeneralIn();
		for (final Generalization g : _isGeneralIn) {
			final Classifier[] _converted_list = (Classifier[])list;
			Classifier _specific = g.getSpecific();
			((List<Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)).add(_specific);
		}
		final Classifier[] _converted_list_1 = (Classifier[])list;
		return ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> parents() {
		Classifier[] list = null;
		EList<Generalization> _isSpecificIn = this.getIsSpecificIn();
		for (final Generalization g : _isSpecificIn) {
			final Classifier[] _converted_list = (Classifier[])list;
			Classifier _general = g.getGeneral();
			((List<Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)).add(_general);
		}
		final Classifier[] _converted_list_1 = (Classifier[])list;
		return ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allParents(final Classifier c, final EList<Classifier> result) {
		EList<Generalization> _isSpecificIn = this.getIsSpecificIn();
		for (final Generalization g : _isSpecificIn) {
			{
				Classifier _general = g.getGeneral();
				result.add(_general);
				Classifier _general_1 = g.getGeneral();
				this.allParents(_general_1, result);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> allParents() {
		Classifier[] list = null;
		final Classifier[] _converted_list = (Classifier[])list;
		EList<Classifier> _eList = ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)));
		this.allParents(this, _eList);
		final Classifier[] _converted_list_1 = (Classifier[])list;
		return ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allChildren(final Classifier c, final EList<Classifier> result) {
		EList<Generalization> _isGeneralIn = this.getIsGeneralIn();
		for (final Generalization g : _isGeneralIn) {
			{
				Classifier _specific = g.getSpecific();
				result.add(_specific);
				Classifier _specific_1 = g.getSpecific();
				this.allChildren(_specific_1, result);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> allChildren() {
		Classifier[] list = null;
		final Classifier[] _converted_list = (Classifier[])list;
		EList<Classifier> _eList = ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list)));
		this.allChildren(this, _eList);
		final Classifier[] _converted_list_1 = (Classifier[])list;
		return ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_list_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> siblings() {
		Classifier[] result = null;
		EList<Classifier> _parents = this.parents();
		for (final Classifier p : _parents) {
			EList<Classifier> _children = p.children();
			for (final Classifier sibling : _children) {
				boolean _equals = sibling.equals(this);
				boolean _not = (!_equals);
				if (_not) {
					final Classifier[] _converted_result = (Classifier[])result;
					((List<Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(sibling);
				}
			}
		}
		final Classifier[] _converted_result_1 = (Classifier[])result;
		return ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPoint> ends() {
		EndPoint[] result = null;
		Model _model = this.getModel();
		EList<Relationship> _allRelationships = _model.allRelationships();
		for (final Relationship rel : _allRelationships) {
			boolean _isEnd = rel.isEnd(this);
			if (_isEnd) {
				EList<EndPoint> _endPoints = rel.getEndPoints();
				for (final EndPoint ep : _endPoints) {
					Classifier _endType = ep.getEndType();
					boolean _equals = _endType.equals(this);
					boolean _not = (!_equals);
					if (_not) {
						final EndPoint[] _converted_result = (EndPoint[])result;
						((List<EndPoint>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(ep);
					}
				}
			}
		}
		final EndPoint[] _converted_result_1 = (EndPoint[])result;
		return ECollections.<EndPoint>toEList(((Iterable<? extends EndPoint>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPoint> allEnds() {
		EndPoint[] result = null;
		final EndPoint[] _converted_result = (EndPoint[])result;
		EList<EndPoint> _ends = this.ends();
		((List<EndPoint>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).addAll(_ends);
		EList<Classifier> _allParents = this.allParents();
		for (final Classifier p : _allParents) {
			if ((p instanceof net.menthor.onto2.ontouml.Class)) {
				final EndPoint[] _converted_result_1 = (EndPoint[])result;
				EList<EndPoint> _ends_1 = ((net.menthor.onto2.ontouml.Class)p).ends();
				((List<EndPoint>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)).addAll(_ends_1);
			}
		}
		final EndPoint[] _converted_result_2 = (EndPoint[])result;
		return ECollections.<EndPoint>toEList(((Iterable<? extends EndPoint>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_2)));
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
			case OntoumlPackage.CLASSIFIER__IS_GENERAL_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsGeneralIn()).basicAdd(otherEnd, msgs);
			case OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSpecificIn()).basicAdd(otherEnd, msgs);
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
			case OntoumlPackage.CLASSIFIER__IS_GENERAL_IN:
				return ((InternalEList<?>)getIsGeneralIn()).basicRemove(otherEnd, msgs);
			case OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN:
				return ((InternalEList<?>)getIsSpecificIn()).basicRemove(otherEnd, msgs);
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
			case OntoumlPackage.CLASSIFIER__NAME:
				return getName();
			case OntoumlPackage.CLASSIFIER__DEFINITIONS:
				return getDefinitions();
			case OntoumlPackage.CLASSIFIER__SYNONYMS:
				return getSynonyms();
			case OntoumlPackage.CLASSIFIER__TEXT:
				return getText();
			case OntoumlPackage.CLASSIFIER__IS_GENERAL_IN:
				return getIsGeneralIn();
			case OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN:
				return getIsSpecificIn();
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
			case OntoumlPackage.CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case OntoumlPackage.CLASSIFIER__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends String>)newValue);
				return;
			case OntoumlPackage.CLASSIFIER__SYNONYMS:
				getSynonyms().clear();
				getSynonyms().addAll((Collection<? extends String>)newValue);
				return;
			case OntoumlPackage.CLASSIFIER__TEXT:
				setText((String)newValue);
				return;
			case OntoumlPackage.CLASSIFIER__IS_GENERAL_IN:
				getIsGeneralIn().clear();
				getIsGeneralIn().addAll((Collection<? extends Generalization>)newValue);
				return;
			case OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN:
				getIsSpecificIn().clear();
				getIsSpecificIn().addAll((Collection<? extends Generalization>)newValue);
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
			case OntoumlPackage.CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntoumlPackage.CLASSIFIER__DEFINITIONS:
				getDefinitions().clear();
				return;
			case OntoumlPackage.CLASSIFIER__SYNONYMS:
				getSynonyms().clear();
				return;
			case OntoumlPackage.CLASSIFIER__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case OntoumlPackage.CLASSIFIER__IS_GENERAL_IN:
				getIsGeneralIn().clear();
				return;
			case OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN:
				getIsSpecificIn().clear();
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
			case OntoumlPackage.CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntoumlPackage.CLASSIFIER__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case OntoumlPackage.CLASSIFIER__SYNONYMS:
				return synonyms != null && !synonyms.isEmpty();
			case OntoumlPackage.CLASSIFIER__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case OntoumlPackage.CLASSIFIER__IS_GENERAL_IN:
				return isGeneralIn != null && !isGeneralIn.isEmpty();
			case OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN:
				return isSpecificIn != null && !isSpecificIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case OntoumlPackage.CLASSIFIER__NAME: return OntoumlPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case OntoumlPackage.NAMED_ELEMENT__NAME: return OntoumlPackage.CLASSIFIER__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
			case OntoumlPackage.CLASSIFIER___CHILDREN:
				return children();
			case OntoumlPackage.CLASSIFIER___PARENTS:
				return parents();
			case OntoumlPackage.CLASSIFIER___ALL_PARENTS__CLASSIFIER_ELIST:
				allParents((Classifier)arguments.get(0), (EList<Classifier>)arguments.get(1));
				return null;
			case OntoumlPackage.CLASSIFIER___ALL_PARENTS:
				return allParents();
			case OntoumlPackage.CLASSIFIER___ALL_CHILDREN__CLASSIFIER_ELIST:
				allChildren((Classifier)arguments.get(0), (EList<Classifier>)arguments.get(1));
				return null;
			case OntoumlPackage.CLASSIFIER___ALL_CHILDREN:
				return allChildren();
			case OntoumlPackage.CLASSIFIER___SIBLINGS:
				return siblings();
			case OntoumlPackage.CLASSIFIER___ENDS:
				return ends();
			case OntoumlPackage.CLASSIFIER___ALL_ENDS:
				return allEnds();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", definitions: ");
		result.append(definitions);
		result.append(", synonyms: ");
		result.append(synonyms);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl

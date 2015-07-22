/**
 */
package net.menthor.onto2.ontouml.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.Comment;
import net.menthor.onto2.ontouml.ContainedElement;
import net.menthor.onto2.ontouml.Generalization;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.OntoumlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl#getHighOrder <em>High Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationSetImpl extends NamedElementImpl implements GeneralizationSet {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The default value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCovering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COVERING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCovering()
	 * @generated
	 * @ordered
	 */
	protected boolean isCovering = IS_COVERING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISJOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisjoint = IS_DISJOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * The cached value of the '{@link #getHighOrder() <em>High Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighOrder()
	 * @generated
	 * @ordered
	 */
	protected net.menthor.onto2.ontouml.Class highOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.GENERALIZATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.menthor.onto2.ontouml.Container getHolder() {
		if (eContainerFeatureID() != OntoumlPackage.GENERALIZATION_SET__HOLDER) return null;
		return (net.menthor.onto2.ontouml.Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.menthor.onto2.ontouml.Container basicGetHolder() {
		if (eContainerFeatureID() != OntoumlPackage.GENERALIZATION_SET__HOLDER) return null;
		return (net.menthor.onto2.ontouml.Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolder(net.menthor.onto2.ontouml.Container newHolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHolder, OntoumlPackage.GENERALIZATION_SET__HOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolder(net.menthor.onto2.ontouml.Container newHolder) {
		if (newHolder != eInternalContainer() || (eContainerFeatureID() != OntoumlPackage.GENERALIZATION_SET__HOLDER && newHolder != null)) {
			if (EcoreUtil.isAncestor(this, newHolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHolder != null)
				msgs = ((InternalEObject)newHolder).eInverseAdd(this, OntoumlPackage.CONTAINER__ELEMENTS, net.menthor.onto2.ontouml.Container.class, msgs);
			msgs = basicSetHolder(newHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION_SET__HOLDER, newHolder, newHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentWithInverseEList<Comment>(Comment.class, this, OntoumlPackage.GENERALIZATION_SET__COMMENTS, OntoumlPackage.COMMENT__OWNER);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCovering() {
		return isCovering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCovering(boolean newIsCovering) {
		boolean oldIsCovering = isCovering;
		isCovering = newIsCovering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION_SET__IS_COVERING, oldIsCovering, isCovering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisjoint() {
		return isDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(boolean newIsDisjoint) {
		boolean oldIsDisjoint = isDisjoint;
		isDisjoint = newIsDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint, isDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS, OntoumlPackage.GENERALIZATION__GENERALIZATION_SET);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.menthor.onto2.ontouml.Class getHighOrder() {
		if (highOrder != null && highOrder.eIsProxy()) {
			InternalEObject oldHighOrder = (InternalEObject)highOrder;
			highOrder = (net.menthor.onto2.ontouml.Class)eResolveProxy(oldHighOrder);
			if (highOrder != oldHighOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoumlPackage.GENERALIZATION_SET__HIGH_ORDER, oldHighOrder, highOrder));
			}
		}
		return highOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.menthor.onto2.ontouml.Class basicGetHighOrder() {
		return highOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighOrder(net.menthor.onto2.ontouml.Class newHighOrder) {
		net.menthor.onto2.ontouml.Class oldHighOrder = highOrder;
		highOrder = newHighOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION_SET__HIGH_ORDER, oldHighOrder, highOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral() {
		EList<Generalization> _generalizations = this.getGeneralizations();
		int _size = _generalizations.size();
		boolean _greaterThan = (_size > 0);
		if (_greaterThan) {
			EList<Generalization> _generalizations_1 = this.getGeneralizations();
			Generalization _get = _generalizations_1.get(0);
			return _get.getGeneral();
		}
		else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getSpecifics() {
		Classifier[] result = null;
		EList<Generalization> _generalizations = this.getGeneralizations();
		for (final Generalization g : _generalizations) {
			final Classifier[] _converted_result = (Classifier[])result;
			Classifier _specific = g.getSpecific();
			((List<Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(_specific);
		}
		final Classifier[] _converted_result_1 = (Classifier[])result;
		return ECollections.<Classifier>toEList(((Iterable<? extends Classifier>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel(final net.menthor.onto2.ontouml.Container c) {
		if ((c instanceof Model)) {
			return ((Model)c);
		}
		else {
			if ((c instanceof ContainedElement)) {
				net.menthor.onto2.ontouml.Container _holder = ((ContainedElement)c).getHolder();
				return this.getModel(_holder);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		net.menthor.onto2.ontouml.Container _holder = this.getHolder();
		return this.getModel(_holder);
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
			case OntoumlPackage.GENERALIZATION_SET__HOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHolder((net.menthor.onto2.ontouml.Container)otherEnd, msgs);
			case OntoumlPackage.GENERALIZATION_SET__COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
			case OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizations()).basicAdd(otherEnd, msgs);
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
			case OntoumlPackage.GENERALIZATION_SET__HOLDER:
				return basicSetHolder(null, msgs);
			case OntoumlPackage.GENERALIZATION_SET__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS:
				return ((InternalEList<?>)getGeneralizations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OntoumlPackage.GENERALIZATION_SET__HOLDER:
				return eInternalContainer().eInverseRemove(this, OntoumlPackage.CONTAINER__ELEMENTS, net.menthor.onto2.ontouml.Container.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoumlPackage.GENERALIZATION_SET__HOLDER:
				if (resolve) return getHolder();
				return basicGetHolder();
			case OntoumlPackage.GENERALIZATION_SET__COMMENTS:
				return getComments();
			case OntoumlPackage.GENERALIZATION_SET__IS_COVERING:
				return isIsCovering();
			case OntoumlPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isIsDisjoint();
			case OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS:
				return getGeneralizations();
			case OntoumlPackage.GENERALIZATION_SET__HIGH_ORDER:
				if (resolve) return getHighOrder();
				return basicGetHighOrder();
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
			case OntoumlPackage.GENERALIZATION_SET__HOLDER:
				setHolder((net.menthor.onto2.ontouml.Container)newValue);
				return;
			case OntoumlPackage.GENERALIZATION_SET__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case OntoumlPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering((Boolean)newValue);
				return;
			case OntoumlPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint((Boolean)newValue);
				return;
			case OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection<? extends Generalization>)newValue);
				return;
			case OntoumlPackage.GENERALIZATION_SET__HIGH_ORDER:
				setHighOrder((net.menthor.onto2.ontouml.Class)newValue);
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
			case OntoumlPackage.GENERALIZATION_SET__HOLDER:
				setHolder((net.menthor.onto2.ontouml.Container)null);
				return;
			case OntoumlPackage.GENERALIZATION_SET__COMMENTS:
				getComments().clear();
				return;
			case OntoumlPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering(IS_COVERING_EDEFAULT);
				return;
			case OntoumlPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS:
				getGeneralizations().clear();
				return;
			case OntoumlPackage.GENERALIZATION_SET__HIGH_ORDER:
				setHighOrder((net.menthor.onto2.ontouml.Class)null);
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
			case OntoumlPackage.GENERALIZATION_SET__HOLDER:
				return basicGetHolder() != null;
			case OntoumlPackage.GENERALIZATION_SET__COMMENTS:
				return comments != null && !comments.isEmpty();
			case OntoumlPackage.GENERALIZATION_SET__IS_COVERING:
				return isCovering != IS_COVERING_EDEFAULT;
			case OntoumlPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isDisjoint != IS_DISJOINT_EDEFAULT;
			case OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS:
				return generalizations != null && !generalizations.isEmpty();
			case OntoumlPackage.GENERALIZATION_SET__HIGH_ORDER:
				return highOrder != null;
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
		if (baseClass == ContainedElement.class) {
			switch (derivedFeatureID) {
				case OntoumlPackage.GENERALIZATION_SET__HOLDER: return OntoumlPackage.CONTAINED_ELEMENT__HOLDER;
				case OntoumlPackage.GENERALIZATION_SET__COMMENTS: return OntoumlPackage.CONTAINED_ELEMENT__COMMENTS;
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
		if (baseClass == ContainedElement.class) {
			switch (baseFeatureID) {
				case OntoumlPackage.CONTAINED_ELEMENT__HOLDER: return OntoumlPackage.GENERALIZATION_SET__HOLDER;
				case OntoumlPackage.CONTAINED_ELEMENT__COMMENTS: return OntoumlPackage.GENERALIZATION_SET__COMMENTS;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ContainedElement.class) {
			switch (baseOperationID) {
				case OntoumlPackage.CONTAINED_ELEMENT___GET_MODEL__CONTAINER: return OntoumlPackage.GENERALIZATION_SET___GET_MODEL__CONTAINER;
				case OntoumlPackage.CONTAINED_ELEMENT___GET_MODEL: return OntoumlPackage.GENERALIZATION_SET___GET_MODEL;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OntoumlPackage.GENERALIZATION_SET___GET_GENERAL:
				return getGeneral();
			case OntoumlPackage.GENERALIZATION_SET___GET_SPECIFICS:
				return getSpecifics();
			case OntoumlPackage.GENERALIZATION_SET___GET_MODEL__CONTAINER:
				return getModel((net.menthor.onto2.ontouml.Container)arguments.get(0));
			case OntoumlPackage.GENERALIZATION_SET___GET_MODEL:
				return getModel();
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
		result.append(" (isCovering: ");
		result.append(isCovering);
		result.append(", isDisjoint: ");
		result.append(isDisjoint);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl

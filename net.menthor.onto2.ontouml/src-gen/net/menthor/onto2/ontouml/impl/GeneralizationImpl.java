/**
 */
package net.menthor.onto2.ontouml.impl;

import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.Generalization;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.OntoumlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.GeneralizationImpl#getGeneralizationSet <em>Generalization Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends ContainedElementImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected Classifier general;

	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected Classifier specific;

	/**
	 * The cached value of the '{@link #getGeneralizationSet() <em>Generalization Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationSet()
	 * @generated
	 * @ordered
	 */
	protected GeneralizationSet generalizationSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (Classifier)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoumlPackage.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(Classifier newGeneral, NotificationChain msgs) {
		Classifier oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Classifier newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, OntoumlPackage.CLASSIFIER__IS_GENERAL_IN, Classifier.class, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, OntoumlPackage.CLASSIFIER__IS_GENERAL_IN, Classifier.class, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecific() {
		if (specific != null && specific.eIsProxy()) {
			InternalEObject oldSpecific = (InternalEObject)specific;
			specific = (Classifier)eResolveProxy(oldSpecific);
			if (specific != oldSpecific) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoumlPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
			}
		}
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSpecific() {
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecific(Classifier newSpecific, NotificationChain msgs) {
		Classifier oldSpecific = specific;
		specific = newSpecific;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION__SPECIFIC, oldSpecific, newSpecific);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		if (newSpecific != specific) {
			NotificationChain msgs = null;
			if (specific != null)
				msgs = ((InternalEObject)specific).eInverseRemove(this, OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN, Classifier.class, msgs);
			if (newSpecific != null)
				msgs = ((InternalEObject)newSpecific).eInverseAdd(this, OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN, Classifier.class, msgs);
			msgs = basicSetSpecific(newSpecific, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION__SPECIFIC, newSpecific, newSpecific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getGeneralizationSet() {
		if (generalizationSet != null && generalizationSet.eIsProxy()) {
			InternalEObject oldGeneralizationSet = (InternalEObject)generalizationSet;
			generalizationSet = (GeneralizationSet)eResolveProxy(oldGeneralizationSet);
			if (generalizationSet != oldGeneralizationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoumlPackage.GENERALIZATION__GENERALIZATION_SET, oldGeneralizationSet, generalizationSet));
			}
		}
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet basicGetGeneralizationSet() {
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralizationSet(GeneralizationSet newGeneralizationSet, NotificationChain msgs) {
		GeneralizationSet oldGeneralizationSet = generalizationSet;
		generalizationSet = newGeneralizationSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION__GENERALIZATION_SET, oldGeneralizationSet, newGeneralizationSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizationSet(GeneralizationSet newGeneralizationSet) {
		if (newGeneralizationSet != generalizationSet) {
			NotificationChain msgs = null;
			if (generalizationSet != null)
				msgs = ((InternalEObject)generalizationSet).eInverseRemove(this, OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS, GeneralizationSet.class, msgs);
			if (newGeneralizationSet != null)
				msgs = ((InternalEObject)newGeneralizationSet).eInverseAdd(this, OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS, GeneralizationSet.class, msgs);
			msgs = basicSetGeneralizationSet(newGeneralizationSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.GENERALIZATION__GENERALIZATION_SET, newGeneralizationSet, newGeneralizationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoumlPackage.GENERALIZATION__GENERAL:
				if (general != null)
					msgs = ((InternalEObject)general).eInverseRemove(this, OntoumlPackage.CLASSIFIER__IS_GENERAL_IN, Classifier.class, msgs);
				return basicSetGeneral((Classifier)otherEnd, msgs);
			case OntoumlPackage.GENERALIZATION__SPECIFIC:
				if (specific != null)
					msgs = ((InternalEObject)specific).eInverseRemove(this, OntoumlPackage.CLASSIFIER__IS_SPECIFIC_IN, Classifier.class, msgs);
				return basicSetSpecific((Classifier)otherEnd, msgs);
			case OntoumlPackage.GENERALIZATION__GENERALIZATION_SET:
				if (generalizationSet != null)
					msgs = ((InternalEObject)generalizationSet).eInverseRemove(this, OntoumlPackage.GENERALIZATION_SET__GENERALIZATIONS, GeneralizationSet.class, msgs);
				return basicSetGeneralizationSet((GeneralizationSet)otherEnd, msgs);
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
			case OntoumlPackage.GENERALIZATION__GENERAL:
				return basicSetGeneral(null, msgs);
			case OntoumlPackage.GENERALIZATION__SPECIFIC:
				return basicSetSpecific(null, msgs);
			case OntoumlPackage.GENERALIZATION__GENERALIZATION_SET:
				return basicSetGeneralizationSet(null, msgs);
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
			case OntoumlPackage.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case OntoumlPackage.GENERALIZATION__SPECIFIC:
				if (resolve) return getSpecific();
				return basicGetSpecific();
			case OntoumlPackage.GENERALIZATION__GENERALIZATION_SET:
				if (resolve) return getGeneralizationSet();
				return basicGetGeneralizationSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntoumlPackage.GENERALIZATION__GENERAL:
				setGeneral((Classifier)newValue);
				return;
			case OntoumlPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)newValue);
				return;
			case OntoumlPackage.GENERALIZATION__GENERALIZATION_SET:
				setGeneralizationSet((GeneralizationSet)newValue);
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
			case OntoumlPackage.GENERALIZATION__GENERAL:
				setGeneral((Classifier)null);
				return;
			case OntoumlPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)null);
				return;
			case OntoumlPackage.GENERALIZATION__GENERALIZATION_SET:
				setGeneralizationSet((GeneralizationSet)null);
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
			case OntoumlPackage.GENERALIZATION__GENERAL:
				return general != null;
			case OntoumlPackage.GENERALIZATION__SPECIFIC:
				return specific != null;
			case OntoumlPackage.GENERALIZATION__GENERALIZATION_SET:
				return generalizationSet != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationImpl

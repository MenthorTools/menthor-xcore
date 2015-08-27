/**
 */
package net.menthor.onto2.ontouml.impl;

import net.menthor.onto2.ontouml.Constraint;
import net.menthor.onto2.ontouml.ConstraintStereotype;
import net.menthor.onto2.ontouml.OntoumlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ConstraintImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ConstraintImpl#getContext <em>Context</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ConstraintImpl#getRuleAsString <em>Rule As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends ContainedElementImpl implements Constraint {
	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintStereotype STEREOTYPE_EDEFAULT = ConstraintStereotype.UNSET;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected ConstraintStereotype stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

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
	 * The default value of the '{@link #getRuleAsString() <em>Rule As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleAsString() <em>Rule As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleAsString()
	 * @generated
	 * @ordered
	 */
	protected String ruleAsString = RULE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintStereotype getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(ConstraintStereotype newStereotype) {
		ConstraintStereotype oldStereotype = stereotype;
		stereotype = newStereotype == null ? STEREOTYPE_EDEFAULT : newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONSTRAINT__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONSTRAINT__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleAsString() {
		return ruleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleAsString(String newRuleAsString) {
		String oldRuleAsString = ruleAsString;
		ruleAsString = newRuleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONSTRAINT__RULE_AS_STRING, oldRuleAsString, ruleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				return getStereotype();
			case OntoumlPackage.CONSTRAINT__CONTEXT:
				return getContext();
			case OntoumlPackage.CONSTRAINT__NAME:
				return getName();
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				return getRuleAsString();
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
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				setStereotype((ConstraintStereotype)newValue);
				return;
			case OntoumlPackage.CONSTRAINT__CONTEXT:
				setContext((String)newValue);
				return;
			case OntoumlPackage.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				setRuleAsString((String)newValue);
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
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case OntoumlPackage.CONSTRAINT__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case OntoumlPackage.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				setRuleAsString(RULE_AS_STRING_EDEFAULT);
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
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				return stereotype != STEREOTYPE_EDEFAULT;
			case OntoumlPackage.CONSTRAINT__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case OntoumlPackage.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				return RULE_AS_STRING_EDEFAULT == null ? ruleAsString != null : !RULE_AS_STRING_EDEFAULT.equals(ruleAsString);
		}
		return super.eIsSet(featureID);
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
		result.append(" (stereotype: ");
		result.append(stereotype);
		result.append(", context: ");
		result.append(context);
		result.append(", name: ");
		result.append(name);
		result.append(", ruleAsString: ");
		result.append(ruleAsString);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl

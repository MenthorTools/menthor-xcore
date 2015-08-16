/**
 */
package net.menthor.onto2.ontouml.impl;

import com.google.common.base.Objects;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

import net.menthor.onto2.ontouml.ClassStereotype;
import net.menthor.onto2.ontouml.Classification;
import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.Existence;
import net.menthor.onto2.ontouml.OntoumlPackage;
import net.menthor.onto2.ontouml.QualityNature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassImpl#isIsExtensional <em>Is Extensional</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassImpl#getQualityNature <em>Quality Nature</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassImpl#getExistence <em>Existence</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ClassImpl#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements net.menthor.onto2.ontouml.Class {
	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final ClassStereotype STEREOTYPE_EDEFAULT = ClassStereotype.KIND;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected ClassStereotype stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExtensional() <em>Is Extensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExtensional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTENSIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExtensional() <em>Is Extensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExtensional()
	 * @generated
	 * @ordered
	 */
	protected boolean isExtensional = IS_EXTENSIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualityNature() <em>Quality Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityNature()
	 * @generated
	 * @ordered
	 */
	protected static final QualityNature QUALITY_NATURE_EDEFAULT = QualityNature.NOMINAL;

	/**
	 * The cached value of the '{@link #getQualityNature() <em>Quality Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityNature()
	 * @generated
	 * @ordered
	 */
	protected QualityNature qualityNature = QUALITY_NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistence() <em>Existence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistence()
	 * @generated
	 * @ordered
	 */
	protected static final Existence EXISTENCE_EDEFAULT = Existence.PERMANENT;

	/**
	 * The cached value of the '{@link #getExistence() <em>Existence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistence()
	 * @generated
	 * @ordered
	 */
	protected Existence existence = EXISTENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final Classification CLASSIFICATION_EDEFAULT = Classification.INITIAL;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Classification classification = CLASSIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassStereotype getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(ClassStereotype newStereotype) {
		ClassStereotype oldStereotype = stereotype;
		stereotype = newStereotype == null ? STEREOTYPE_EDEFAULT : newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASS__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASS__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExtensional() {
		return isExtensional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExtensional(boolean newIsExtensional) {
		boolean oldIsExtensional = isExtensional;
		isExtensional = newIsExtensional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASS__IS_EXTENSIONAL, oldIsExtensional, isExtensional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityNature getQualityNature() {
		return qualityNature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityNature(QualityNature newQualityNature) {
		QualityNature oldQualityNature = qualityNature;
		qualityNature = newQualityNature == null ? QUALITY_NATURE_EDEFAULT : newQualityNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASS__QUALITY_NATURE, oldQualityNature, qualityNature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Existence getExistence() {
		return existence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistence(Existence newExistence) {
		Existence oldExistence = existence;
		existence = newExistence == null ? EXISTENCE_EDEFAULT : newExistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASS__EXISTENCE, oldExistence, existence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(Classification newClassification) {
		Classification oldClassification = classification;
		classification = newClassification == null ? CLASSIFICATION_EDEFAULT : newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CLASS__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKind() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubKind() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.SUB_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollective() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.COLLECTIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQuantity() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.QUANTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelator() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.RELATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMode() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQuality() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.QUALITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRole() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoleMixin() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.ROLE_MIXIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPhaseMixin() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.PHASE_MIXIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPhase() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.PHASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCategory() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMixin() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.MIXIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEvent() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHighOrder() {
		ClassStereotype _stereotype = this.getStereotype();
		return Objects.equal(_stereotype, ClassStereotype.HIGH_ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRigid() {
		boolean _or = false;
		boolean _or_1 = false;
		boolean _or_2 = false;
		boolean _or_3 = false;
		boolean _or_4 = false;
		boolean _or_5 = false;
		boolean _or_6 = false;
		boolean _isKind = this.isKind();
		if (_isKind) {
			_or_6 = true;
		} else {
			boolean _isCollective = this.isCollective();
			_or_6 = _isCollective;
		}
		if (_or_6) {
			_or_5 = true;
		} else {
			boolean _isQuantity = this.isQuantity();
			_or_5 = _isQuantity;
		}
		if (_or_5) {
			_or_4 = true;
		} else {
			boolean _isRelator = this.isRelator();
			_or_4 = _isRelator;
		}
		if (_or_4) {
			_or_3 = true;
		} else {
			boolean _isMode = this.isMode();
			_or_3 = _isMode;
		}
		if (_or_3) {
			_or_2 = true;
		} else {
			boolean _isQuality = this.isQuality();
			_or_2 = _isQuality;
		}
		if (_or_2) {
			_or_1 = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or_1 = _isSubKind;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isCategory = this.isCategory();
			_or = _isCategory;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonRigid() {
		boolean _or = false;
		boolean _or_1 = false;
		boolean _or_2 = false;
		boolean _or_3 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_3 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_3 = _isPhase;
		}
		if (_or_3) {
			_or_2 = true;
		} else {
			boolean _isRoleMixin = this.isRoleMixin();
			_or_2 = _isRoleMixin;
		}
		if (_or_2) {
			_or_1 = true;
		} else {
			boolean _isPhaseMixin = this.isPhaseMixin();
			_or_1 = _isPhaseMixin;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isMixin = this.isMixin();
			_or = _isMixin;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAntiRigid() {
		boolean _or = false;
		boolean _or_1 = false;
		boolean _or_2 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_2 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_2 = _isPhase;
		}
		if (_or_2) {
			_or_1 = true;
		} else {
			boolean _isRoleMixin = this.isRoleMixin();
			_or_1 = _isRoleMixin;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isPhaseMixin = this.isPhaseMixin();
			_or = _isPhaseMixin;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSemiRigid() {
		return this.isMixin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPerceivableQuality() {
		boolean _and = false;
		boolean _and_1 = false;
		boolean _isQuality = this.isQuality();
		if (!_isQuality) {
			_and_1 = false;
		} else {
			QualityNature _qualityNature = this.getQualityNature();
			boolean _notEquals = (!Objects.equal(_qualityNature, null));
			_and_1 = _notEquals;
		}
		if (!_and_1) {
			_and = false;
		} else {
			QualityNature _qualityNature_1 = this.getQualityNature();
			boolean _equals = Objects.equal(_qualityNature_1, QualityNature.PERCEIVABLE);
			_and = _equals;
		}
		return _and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonPerceivableQuality() {
		boolean _and = false;
		boolean _and_1 = false;
		boolean _isQuality = this.isQuality();
		if (!_isQuality) {
			_and_1 = false;
		} else {
			QualityNature _qualityNature = this.getQualityNature();
			boolean _notEquals = (!Objects.equal(_qualityNature, null));
			_and_1 = _notEquals;
		}
		if (!_and_1) {
			_and = false;
		} else {
			QualityNature _qualityNature_1 = this.getQualityNature();
			boolean _equals = Objects.equal(_qualityNature_1, QualityNature.NON_PERCEIVABLE);
			_and = _equals;
		}
		return _and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNominalQuality() {
		boolean _and = false;
		boolean _and_1 = false;
		boolean _isQuality = this.isQuality();
		if (!_isQuality) {
			_and_1 = false;
		} else {
			QualityNature _qualityNature = this.getQualityNature();
			boolean _notEquals = (!Objects.equal(_qualityNature, null));
			_and_1 = _notEquals;
		}
		if (!_and_1) {
			_and = false;
		} else {
			QualityNature _qualityNature_1 = this.getQualityNature();
			boolean _equals = Objects.equal(_qualityNature_1, QualityNature.NOMINAL);
			_and = _equals;
		}
		return _and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEndurantClass() {
		boolean _or = false;
		boolean _isEvent = this.isEvent();
		if (_isEvent) {
			_or = true;
		} else {
			boolean _isHighOrder = this.isHighOrder();
			_or = _isHighOrder;
		}
		return (!_or);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntrinsicMoment() {
		boolean _or = false;
		boolean _isNonQualitativeIntrinsicMoment = this.isNonQualitativeIntrinsicMoment();
		if (_isNonQualitativeIntrinsicMoment) {
			_or = true;
		} else {
			boolean _isQualitativeIntrinsicMoment = this.isQualitativeIntrinsicMoment();
			_or = _isQualitativeIntrinsicMoment;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstanceSortalClass() {
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isKind = this.isKind();
		if (_isKind) {
			_or_1 = true;
		} else {
			boolean _isCollective = this.isCollective();
			_or_1 = _isCollective;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isQuantity = this.isQuantity();
			_or = _isQuantity;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMomentClass() {
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRelator = this.isRelator();
		if (_isRelator) {
			_or_1 = true;
		} else {
			boolean _isMode = this.isMode();
			_or_1 = _isMode;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isQuality = this.isQuality();
			_or = _isQuality;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdentityProviderClass() {
		boolean _or = false;
		boolean _or_1 = false;
		boolean _or_2 = false;
		boolean _or_3 = false;
		boolean _or_4 = false;
		boolean _isKind = this.isKind();
		if (_isKind) {
			_or_4 = true;
		} else {
			boolean _isQuantity = this.isQuantity();
			_or_4 = _isQuantity;
		}
		if (_or_4) {
			_or_3 = true;
		} else {
			boolean _isCollective = this.isCollective();
			_or_3 = _isCollective;
		}
		if (_or_3) {
			_or_2 = true;
		} else {
			boolean _isRelator = this.isRelator();
			_or_2 = _isRelator;
		}
		if (_or_2) {
			_or_1 = true;
		} else {
			boolean _isMode = this.isMode();
			_or_1 = _isMode;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isQuality = this.isQuality();
			_or = _isQuality;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMixinClass() {
		boolean _or = false;
		boolean _or_1 = false;
		boolean _or_2 = false;
		boolean _isMixin = this.isMixin();
		if (_isMixin) {
			_or_2 = true;
		} else {
			boolean _isRoleMixin = this.isRoleMixin();
			_or_2 = _isRoleMixin;
		}
		if (_or_2) {
			_or_1 = true;
		} else {
			boolean _isPhaseMixin = this.isPhaseMixin();
			_or_1 = _isPhaseMixin;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isCategory = this.isCategory();
			_or = _isCategory;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAntiRigidMixinClass() {
		boolean _or = false;
		boolean _isRoleMixin = this.isRoleMixin();
		if (_isRoleMixin) {
			_or = true;
		} else {
			boolean _isPhaseMixin = this.isPhaseMixin();
			_or = _isPhaseMixin;
		}
		return _or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAmountOfMatter() {
		boolean _isQuantity = this.isQuantity();
		if (_isQuantity) {
			return true;
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			net.menthor.onto2.ontouml.Class[] providers = null;
			final net.menthor.onto2.ontouml.Class[] _converted_providers = (net.menthor.onto2.ontouml.Class[])providers;
			EList<net.menthor.onto2.ontouml.Class> _identityProviders = this.identityProviders();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_providers)).addAll(_identityProviders);
			for (final net.menthor.onto2.ontouml.Class c : providers) {
				boolean _isQuantity_1 = c.isQuantity();
				if (_isQuantity_1) {
					return true;
				}
			}
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			EList<Classifier> _children = this.children();
			int _size = _children.size();
			boolean _equals = (_size == 0);
			if (_equals) {
				return false;
			}
			EList<Classifier> _children_1 = this.children();
			for (final Classifier child : _children_1) {
				if ((child instanceof net.menthor.onto2.ontouml.Class)) {
					boolean _isQuantity_2 = ((net.menthor.onto2.ontouml.Class)child).isQuantity();
					boolean _not = (!_isQuantity_2);
					if (_not) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFunctionalComplex() {
		boolean _isKind = this.isKind();
		if (_isKind) {
			return true;
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			net.menthor.onto2.ontouml.Class[] providers = null;
			final net.menthor.onto2.ontouml.Class[] _converted_providers = (net.menthor.onto2.ontouml.Class[])providers;
			EList<net.menthor.onto2.ontouml.Class> _identityProviders = this.identityProviders();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_providers)).addAll(_identityProviders);
			for (final net.menthor.onto2.ontouml.Class c : providers) {
				boolean _isKind_1 = c.isKind();
				if (_isKind_1) {
					return true;
				}
			}
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			EList<Classifier> _children = this.children();
			int _size = _children.size();
			boolean _equals = (_size == 0);
			if (_equals) {
				return false;
			}
			EList<Classifier> _children_1 = this.children();
			for (final Classifier child : _children_1) {
				if ((child instanceof net.menthor.onto2.ontouml.Class)) {
					boolean _isKind_2 = ((net.menthor.onto2.ontouml.Class)child).isKind();
					boolean _not = (!_isKind_2);
					if (_not) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollection() {
		boolean _isCollective = this.isCollective();
		if (_isCollective) {
			return true;
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			net.menthor.onto2.ontouml.Class[] providers = null;
			final net.menthor.onto2.ontouml.Class[] _converted_providers = (net.menthor.onto2.ontouml.Class[])providers;
			EList<net.menthor.onto2.ontouml.Class> _identityProviders = this.identityProviders();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_providers)).addAll(_identityProviders);
			for (final net.menthor.onto2.ontouml.Class c : providers) {
				boolean _isCollective_1 = c.isCollective();
				if (_isCollective_1) {
					return true;
				}
			}
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			EList<Classifier> _children = this.children();
			int _size = _children.size();
			boolean _equals = (_size == 0);
			if (_equals) {
				return false;
			}
			EList<Classifier> _children_1 = this.children();
			for (final Classifier child : _children_1) {
				if ((child instanceof net.menthor.onto2.ontouml.Class)) {
					boolean _isCollective_2 = ((net.menthor.onto2.ontouml.Class)child).isCollective();
					boolean _not = (!_isCollective_2);
					if (_not) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoment() {
		boolean _isMomentClass = this.isMomentClass();
		if (_isMomentClass) {
			return true;
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			net.menthor.onto2.ontouml.Class[] providers = null;
			final net.menthor.onto2.ontouml.Class[] _converted_providers = (net.menthor.onto2.ontouml.Class[])providers;
			EList<net.menthor.onto2.ontouml.Class> _identityProviders = this.identityProviders();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_providers)).addAll(_identityProviders);
			for (final net.menthor.onto2.ontouml.Class c : providers) {
				boolean _isMomentClass_1 = c.isMomentClass();
				if (_isMomentClass_1) {
					return true;
				}
			}
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			EList<Classifier> _children = this.children();
			int _size = _children.size();
			boolean _equals = (_size == 0);
			if (_equals) {
				return false;
			}
			EList<Classifier> _children_1 = this.children();
			for (final Classifier child : _children_1) {
				if ((child instanceof net.menthor.onto2.ontouml.Class)) {
					boolean _isMomentClass_2 = ((net.menthor.onto2.ontouml.Class)child).isMomentClass();
					boolean _not = (!_isMomentClass_2);
					if (_not) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTruthMaker() {
		boolean _isRelator = this.isRelator();
		if (_isRelator) {
			return true;
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			net.menthor.onto2.ontouml.Class[] providers = null;
			final net.menthor.onto2.ontouml.Class[] _converted_providers = (net.menthor.onto2.ontouml.Class[])providers;
			EList<net.menthor.onto2.ontouml.Class> _identityProviders = this.identityProviders();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_providers)).addAll(_identityProviders);
			for (final net.menthor.onto2.ontouml.Class c : providers) {
				boolean _isRelator_1 = c.isRelator();
				if (_isRelator_1) {
					return true;
				}
			}
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			EList<Classifier> _children = this.children();
			int _size = _children.size();
			boolean _equals = (_size == 0);
			if (_equals) {
				return false;
			}
			EList<Classifier> _children_1 = this.children();
			for (final Classifier child : _children_1) {
				if ((child instanceof net.menthor.onto2.ontouml.Class)) {
					boolean _isRelator_2 = ((net.menthor.onto2.ontouml.Class)child).isRelator();
					boolean _not = (!_isRelator_2);
					if (_not) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonQualitativeIntrinsicMoment() {
		boolean _isMode = this.isMode();
		if (_isMode) {
			return true;
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			net.menthor.onto2.ontouml.Class[] providers = null;
			final net.menthor.onto2.ontouml.Class[] _converted_providers = (net.menthor.onto2.ontouml.Class[])providers;
			EList<net.menthor.onto2.ontouml.Class> _identityProviders = this.identityProviders();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_providers)).addAll(_identityProviders);
			for (final net.menthor.onto2.ontouml.Class c : providers) {
				boolean _isMode_1 = c.isMode();
				if (_isMode_1) {
					return true;
				}
			}
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			EList<Classifier> _children = this.children();
			int _size = _children.size();
			boolean _equals = (_size == 0);
			if (_equals) {
				return false;
			}
			EList<Classifier> _children_1 = this.children();
			for (final Classifier child : _children_1) {
				if ((child instanceof net.menthor.onto2.ontouml.Class)) {
					boolean _isMode_2 = ((net.menthor.onto2.ontouml.Class)child).isMode();
					boolean _not = (!_isMode_2);
					if (_not) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQualitativeIntrinsicMoment() {
		boolean _isQuality = this.isQuality();
		if (_isQuality) {
			return true;
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			net.menthor.onto2.ontouml.Class[] providers = null;
			final net.menthor.onto2.ontouml.Class[] _converted_providers = (net.menthor.onto2.ontouml.Class[])providers;
			EList<net.menthor.onto2.ontouml.Class> _identityProviders = this.identityProviders();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_providers)).addAll(_identityProviders);
			for (final net.menthor.onto2.ontouml.Class c : providers) {
				boolean _isQuality_1 = c.isQuality();
				if (_isQuality_1) {
					return true;
				}
			}
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			EList<Classifier> _children = this.children();
			int _size = _children.size();
			boolean _equals = (_size == 0);
			if (_equals) {
				return false;
			}
			EList<Classifier> _children_1 = this.children();
			for (final Classifier child : _children_1) {
				if ((child instanceof net.menthor.onto2.ontouml.Class)) {
					boolean _isQuality_2 = ((net.menthor.onto2.ontouml.Class)child).isQuality();
					boolean _not = (!_isQuality_2);
					if (_not) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<net.menthor.onto2.ontouml.Class> identityProvidersAtAllParents() {
		net.menthor.onto2.ontouml.Class[] result = null;
		EList<Classifier> _allParents = this.allParents();
		for (final Classifier p : _allParents) {
			if ((p instanceof net.menthor.onto2.ontouml.Class)) {
				boolean _isIdentityProviderClass = ((net.menthor.onto2.ontouml.Class)p).isIdentityProviderClass();
				if (_isIdentityProviderClass) {
					final net.menthor.onto2.ontouml.Class[] _converted_result = (net.menthor.onto2.ontouml.Class[])result;
					((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(((net.menthor.onto2.ontouml.Class)p));
				}
			}
		}
		final net.menthor.onto2.ontouml.Class[] _converted_result_1 = (net.menthor.onto2.ontouml.Class[])result;
		return ECollections.<net.menthor.onto2.ontouml.Class>toEList(((Iterable<? extends net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<net.menthor.onto2.ontouml.Class> identityProvidersAtAllChildren() {
		net.menthor.onto2.ontouml.Class[] result = null;
		EList<Classifier> _allChildren = this.allChildren();
		for (final Classifier p : _allChildren) {
			if ((p instanceof net.menthor.onto2.ontouml.Class)) {
				boolean _isIdentityProviderClass = ((net.menthor.onto2.ontouml.Class)p).isIdentityProviderClass();
				if (_isIdentityProviderClass) {
					final net.menthor.onto2.ontouml.Class[] _converted_result = (net.menthor.onto2.ontouml.Class[])result;
					((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(((net.menthor.onto2.ontouml.Class)p));
				}
				boolean _or = false;
				boolean _or_1 = false;
				boolean _isRole = ((net.menthor.onto2.ontouml.Class)p).isRole();
				if (_isRole) {
					_or_1 = true;
				} else {
					boolean _isPhase = this.isPhase();
					_or_1 = _isPhase;
				}
				if (_or_1) {
					_or = true;
				} else {
					boolean _isSubKind = ((net.menthor.onto2.ontouml.Class)p).isSubKind();
					_or = _isSubKind;
				}
				if (_or) {
					final net.menthor.onto2.ontouml.Class[] _converted_result_1 = (net.menthor.onto2.ontouml.Class[])result;
					EList<net.menthor.onto2.ontouml.Class> _identityProvidersAtAllParents = ((net.menthor.onto2.ontouml.Class)p).identityProvidersAtAllParents();
					((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)).addAll(_identityProvidersAtAllParents);
				}
			}
		}
		final net.menthor.onto2.ontouml.Class[] _converted_result_2 = (net.menthor.onto2.ontouml.Class[])result;
		return ECollections.<net.menthor.onto2.ontouml.Class>toEList(((Iterable<? extends net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_2)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<net.menthor.onto2.ontouml.Class> identityProviders() {
		net.menthor.onto2.ontouml.Class[] result = null;
		boolean _isIdentityProviderClass = this.isIdentityProviderClass();
		if (_isIdentityProviderClass) {
			final net.menthor.onto2.ontouml.Class[] _converted_result = (net.menthor.onto2.ontouml.Class[])result;
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result)).add(this);
		}
		boolean _or = false;
		boolean _or_1 = false;
		boolean _isRole = this.isRole();
		if (_isRole) {
			_or_1 = true;
		} else {
			boolean _isPhase = this.isPhase();
			_or_1 = _isPhase;
		}
		if (_or_1) {
			_or = true;
		} else {
			boolean _isSubKind = this.isSubKind();
			_or = _isSubKind;
		}
		if (_or) {
			final net.menthor.onto2.ontouml.Class[] _converted_result_1 = (net.menthor.onto2.ontouml.Class[])result;
			EList<net.menthor.onto2.ontouml.Class> _identityProvidersAtAllParents = this.identityProvidersAtAllParents();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_1)).addAll(_identityProvidersAtAllParents);
		}
		boolean _isMixinClass = this.isMixinClass();
		if (_isMixinClass) {
			final net.menthor.onto2.ontouml.Class[] _converted_result_2 = (net.menthor.onto2.ontouml.Class[])result;
			EList<net.menthor.onto2.ontouml.Class> _identityProvidersAtAllChildren = this.identityProvidersAtAllChildren();
			((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_2)).addAll(_identityProvidersAtAllChildren);
			EList<Classifier> _allParents = this.allParents();
			for (final Classifier p : _allParents) {
				if ((p instanceof net.menthor.onto2.ontouml.Class)) {
					final net.menthor.onto2.ontouml.Class[] _converted_result_3 = (net.menthor.onto2.ontouml.Class[])result;
					EList<net.menthor.onto2.ontouml.Class> _identityProvidersAtAllChildren_1 = ((net.menthor.onto2.ontouml.Class)p).identityProvidersAtAllChildren();
					((List<net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_3)).addAll(_identityProvidersAtAllChildren_1);
				}
			}
		}
		final net.menthor.onto2.ontouml.Class[] _converted_result_4 = (net.menthor.onto2.ontouml.Class[])result;
		return ECollections.<net.menthor.onto2.ontouml.Class>toEList(((Iterable<? extends net.menthor.onto2.ontouml.Class>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_converted_result_4)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoumlPackage.CLASS__STEREOTYPE:
				return getStereotype();
			case OntoumlPackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case OntoumlPackage.CLASS__IS_DERIVED:
				return isIsDerived();
			case OntoumlPackage.CLASS__IS_EXTENSIONAL:
				return isIsExtensional();
			case OntoumlPackage.CLASS__QUALITY_NATURE:
				return getQualityNature();
			case OntoumlPackage.CLASS__EXISTENCE:
				return getExistence();
			case OntoumlPackage.CLASS__CLASSIFICATION:
				return getClassification();
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
			case OntoumlPackage.CLASS__STEREOTYPE:
				setStereotype((ClassStereotype)newValue);
				return;
			case OntoumlPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case OntoumlPackage.CLASS__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case OntoumlPackage.CLASS__IS_EXTENSIONAL:
				setIsExtensional((Boolean)newValue);
				return;
			case OntoumlPackage.CLASS__QUALITY_NATURE:
				setQualityNature((QualityNature)newValue);
				return;
			case OntoumlPackage.CLASS__EXISTENCE:
				setExistence((Existence)newValue);
				return;
			case OntoumlPackage.CLASS__CLASSIFICATION:
				setClassification((Classification)newValue);
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
			case OntoumlPackage.CLASS__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case OntoumlPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case OntoumlPackage.CLASS__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case OntoumlPackage.CLASS__IS_EXTENSIONAL:
				setIsExtensional(IS_EXTENSIONAL_EDEFAULT);
				return;
			case OntoumlPackage.CLASS__QUALITY_NATURE:
				setQualityNature(QUALITY_NATURE_EDEFAULT);
				return;
			case OntoumlPackage.CLASS__EXISTENCE:
				setExistence(EXISTENCE_EDEFAULT);
				return;
			case OntoumlPackage.CLASS__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
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
			case OntoumlPackage.CLASS__STEREOTYPE:
				return stereotype != STEREOTYPE_EDEFAULT;
			case OntoumlPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case OntoumlPackage.CLASS__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case OntoumlPackage.CLASS__IS_EXTENSIONAL:
				return isExtensional != IS_EXTENSIONAL_EDEFAULT;
			case OntoumlPackage.CLASS__QUALITY_NATURE:
				return qualityNature != QUALITY_NATURE_EDEFAULT;
			case OntoumlPackage.CLASS__EXISTENCE:
				return existence != EXISTENCE_EDEFAULT;
			case OntoumlPackage.CLASS__CLASSIFICATION:
				return classification != CLASSIFICATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OntoumlPackage.CLASS___IS_KIND:
				return isKind();
			case OntoumlPackage.CLASS___IS_SUB_KIND:
				return isSubKind();
			case OntoumlPackage.CLASS___IS_COLLECTIVE:
				return isCollective();
			case OntoumlPackage.CLASS___IS_QUANTITY:
				return isQuantity();
			case OntoumlPackage.CLASS___IS_RELATOR:
				return isRelator();
			case OntoumlPackage.CLASS___IS_MODE:
				return isMode();
			case OntoumlPackage.CLASS___IS_QUALITY:
				return isQuality();
			case OntoumlPackage.CLASS___IS_ROLE:
				return isRole();
			case OntoumlPackage.CLASS___IS_ROLE_MIXIN:
				return isRoleMixin();
			case OntoumlPackage.CLASS___IS_PHASE_MIXIN:
				return isPhaseMixin();
			case OntoumlPackage.CLASS___IS_PHASE:
				return isPhase();
			case OntoumlPackage.CLASS___IS_CATEGORY:
				return isCategory();
			case OntoumlPackage.CLASS___IS_MIXIN:
				return isMixin();
			case OntoumlPackage.CLASS___IS_EVENT:
				return isEvent();
			case OntoumlPackage.CLASS___IS_HIGH_ORDER:
				return isHighOrder();
			case OntoumlPackage.CLASS___IS_RIGID:
				return isRigid();
			case OntoumlPackage.CLASS___IS_NON_RIGID:
				return isNonRigid();
			case OntoumlPackage.CLASS___IS_ANTI_RIGID:
				return isAntiRigid();
			case OntoumlPackage.CLASS___IS_SEMI_RIGID:
				return isSemiRigid();
			case OntoumlPackage.CLASS___IS_PERCEIVABLE_QUALITY:
				return isPerceivableQuality();
			case OntoumlPackage.CLASS___IS_NON_PERCEIVABLE_QUALITY:
				return isNonPerceivableQuality();
			case OntoumlPackage.CLASS___IS_NOMINAL_QUALITY:
				return isNominalQuality();
			case OntoumlPackage.CLASS___IS_ENDURANT_CLASS:
				return isEndurantClass();
			case OntoumlPackage.CLASS___IS_INTRINSIC_MOMENT:
				return isIntrinsicMoment();
			case OntoumlPackage.CLASS___IS_SUBSTANCE_SORTAL_CLASS:
				return isSubstanceSortalClass();
			case OntoumlPackage.CLASS___IS_MOMENT_CLASS:
				return isMomentClass();
			case OntoumlPackage.CLASS___IS_IDENTITY_PROVIDER_CLASS:
				return isIdentityProviderClass();
			case OntoumlPackage.CLASS___IS_MIXIN_CLASS:
				return isMixinClass();
			case OntoumlPackage.CLASS___IS_ANTI_RIGID_MIXIN_CLASS:
				return isAntiRigidMixinClass();
			case OntoumlPackage.CLASS___IS_AMOUNT_OF_MATTER:
				return isAmountOfMatter();
			case OntoumlPackage.CLASS___IS_FUNCTIONAL_COMPLEX:
				return isFunctionalComplex();
			case OntoumlPackage.CLASS___IS_COLLECTION:
				return isCollection();
			case OntoumlPackage.CLASS___IS_MOMENT:
				return isMoment();
			case OntoumlPackage.CLASS___IS_TRUTH_MAKER:
				return isTruthMaker();
			case OntoumlPackage.CLASS___IS_NON_QUALITATIVE_INTRINSIC_MOMENT:
				return isNonQualitativeIntrinsicMoment();
			case OntoumlPackage.CLASS___IS_QUALITATIVE_INTRINSIC_MOMENT:
				return isQualitativeIntrinsicMoment();
			case OntoumlPackage.CLASS___IDENTITY_PROVIDERS_AT_ALL_PARENTS:
				return identityProvidersAtAllParents();
			case OntoumlPackage.CLASS___IDENTITY_PROVIDERS_AT_ALL_CHILDREN:
				return identityProvidersAtAllChildren();
			case OntoumlPackage.CLASS___IDENTITY_PROVIDERS:
				return identityProviders();
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
		result.append(" (stereotype: ");
		result.append(stereotype);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isExtensional: ");
		result.append(isExtensional);
		result.append(", qualityNature: ");
		result.append(qualityNature);
		result.append(", existence: ");
		result.append(existence);
		result.append(", classification: ");
		result.append(classification);
		result.append(')');
		return result.toString();
	}

} //ClassImpl

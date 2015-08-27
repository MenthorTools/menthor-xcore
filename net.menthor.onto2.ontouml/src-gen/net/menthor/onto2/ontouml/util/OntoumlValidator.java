/**
 */
package net.menthor.onto2.ontouml.util;

import java.util.Map;

import net.menthor.onto2.ontouml.Attribute;
import net.menthor.onto2.ontouml.Ciclicity;
import net.menthor.onto2.ontouml.ClassStereotype;
import net.menthor.onto2.ontouml.Classification;
import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.Comment;
import net.menthor.onto2.ontouml.Constraint;
import net.menthor.onto2.ontouml.ConstraintStereotype;
import net.menthor.onto2.ontouml.ContainedElement;
import net.menthor.onto2.ontouml.Container;
import net.menthor.onto2.ontouml.DataType;
import net.menthor.onto2.ontouml.DataTypeStereotype;
import net.menthor.onto2.ontouml.Element;
import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.Existence;
import net.menthor.onto2.ontouml.Generalization;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.Literal;
import net.menthor.onto2.ontouml.Measurement;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.NamedElement;
import net.menthor.onto2.ontouml.OntoumlPackage;
import net.menthor.onto2.ontouml.ParticipationNature;
import net.menthor.onto2.ontouml.PrimitiveStereotype;
import net.menthor.onto2.ontouml.Property;
import net.menthor.onto2.ontouml.QualityNature;
import net.menthor.onto2.ontouml.Reflexivity;
import net.menthor.onto2.ontouml.Relationship;
import net.menthor.onto2.ontouml.RelationshipStereotype;
import net.menthor.onto2.ontouml.Scale;
import net.menthor.onto2.ontouml.Symmetry;
import net.menthor.onto2.ontouml.TemporalNature;
import net.menthor.onto2.ontouml.Transitivity;
import net.menthor.onto2.ontouml.Type;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.menthor.onto2.ontouml.OntoumlPackage
 * @generated
 */
public class OntoumlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OntoumlValidator INSTANCE = new OntoumlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.menthor.onto2.ontouml";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initialize Validator' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__INITIALIZE_VALIDATOR = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoumlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OntoumlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OntoumlPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case OntoumlPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case OntoumlPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case OntoumlPackage.CONTAINED_ELEMENT:
				return validateContainedElement((ContainedElement)value, diagnostics, context);
			case OntoumlPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case OntoumlPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case OntoumlPackage.PACKAGE:
				return validatePackage((net.menthor.onto2.ontouml.Package)value, diagnostics, context);
			case OntoumlPackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case OntoumlPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case OntoumlPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case OntoumlPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case OntoumlPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case OntoumlPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case OntoumlPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case OntoumlPackage.CLASS:
				return validateClass((net.menthor.onto2.ontouml.Class)value, diagnostics, context);
			case OntoumlPackage.END_POINT:
				return validateEndPoint((EndPoint)value, diagnostics, context);
			case OntoumlPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case OntoumlPackage.GENERALIZATION_SET:
				return validateGeneralizationSet((GeneralizationSet)value, diagnostics, context);
			case OntoumlPackage.GENERALIZATION:
				return validateGeneralization((Generalization)value, diagnostics, context);
			case OntoumlPackage.PRIMITIVE_STEREOTYPE:
				return validatePrimitiveStereotype((PrimitiveStereotype)value, diagnostics, context);
			case OntoumlPackage.CONSTRAINT_STEREOTYPE:
				return validateConstraintStereotype((ConstraintStereotype)value, diagnostics, context);
			case OntoumlPackage.CLASS_STEREOTYPE:
				return validateClassStereotype((ClassStereotype)value, diagnostics, context);
			case OntoumlPackage.DATA_TYPE_STEREOTYPE:
				return validateDataTypeStereotype((DataTypeStereotype)value, diagnostics, context);
			case OntoumlPackage.SCALE:
				return validateScale((Scale)value, diagnostics, context);
			case OntoumlPackage.MEASUREMENT:
				return validateMeasurement((Measurement)value, diagnostics, context);
			case OntoumlPackage.QUALITY_NATURE:
				return validateQualityNature((QualityNature)value, diagnostics, context);
			case OntoumlPackage.CLASSIFICATION:
				return validateClassification((Classification)value, diagnostics, context);
			case OntoumlPackage.EXISTENCE:
				return validateExistence((Existence)value, diagnostics, context);
			case OntoumlPackage.RELATIONSHIP_STEREOTYPE:
				return validateRelationshipStereotype((RelationshipStereotype)value, diagnostics, context);
			case OntoumlPackage.TEMPORAL_NATURE:
				return validateTemporalNature((TemporalNature)value, diagnostics, context);
			case OntoumlPackage.PARTICIPATION_NATURE:
				return validateParticipationNature((ParticipationNature)value, diagnostics, context);
			case OntoumlPackage.REFLEXIVITY:
				return validateReflexivity((Reflexivity)value, diagnostics, context);
			case OntoumlPackage.SYMMETRY:
				return validateSymmetry((Symmetry)value, diagnostics, context);
			case OntoumlPackage.TRANSITIVITY:
				return validateTransitivity((Transitivity)value, diagnostics, context);
			case OntoumlPackage.CICLICITY:
				return validateCiclicity((Ciclicity)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainedElement(ContainedElement containedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_initializeValidator(model, diagnostics, context);
		return result;
	}

	/**
	 * Validates the initializeValidator constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_initializeValidator(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return model.initializeValidator(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(net.menthor.onto2.ontouml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(package_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(net.menthor.onto2.ontouml.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(class_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndPoint(EndPoint endPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizationSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization(Generalization generalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveStereotype(PrimitiveStereotype primitiveStereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintStereotype(ConstraintStereotype constraintStereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassStereotype(ClassStereotype classStereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeStereotype(DataTypeStereotype dataTypeStereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScale(Scale scale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurement(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityNature(QualityNature qualityNature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassification(Classification classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistence(Existence existence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipStereotype(RelationshipStereotype relationshipStereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalNature(TemporalNature temporalNature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationNature(ParticipationNature participationNature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexivity(Reflexivity reflexivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetry(Symmetry symmetry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitivity(Transitivity transitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiclicity(Ciclicity ciclicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OntoumlValidator

/**
 */
package net.menthor.onto2.ontouml.tests;

import junit.textui.TestRunner;

import net.menthor.onto2.ontouml.OntoumlFactory;
import net.menthor.onto2.ontouml.Relationship;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isComponentOf() <em>Is Component Of</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isMemberOf() <em>Is Member Of</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isSubCollectionOf() <em>Is Sub Collection Of</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isSubQuantityOf() <em>Is Sub Quantity Of</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isQuaPartOf() <em>Is Qua Part Of</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isConstitution() <em>Is Constitution</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isCharacterization() <em>Is Characterization</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isMediation() <em>Is Mediation</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isMaterial() <em>Is Material</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isFormal() <em>Is Formal</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isStructuration() <em>Is Structuration</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isParticipation() <em>Is Participation</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isSubEventOf() <em>Is Sub Event Of</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isCausation() <em>Is Causation</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isTemporal() <em>Is Temporal</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isInstanceOf() <em>Is Instance Of</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isDerivation() <em>Is Derivation</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isMeronymic() <em>Is Meronymic</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isBinary() <em>Is Binary</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isTernary() <em>Is Ternary</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isStarts() <em>Is Starts</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isPrecedes() <em>Is Precedes</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isEquals() <em>Is Equals</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isMeets() <em>Is Meets</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isFinishes() <em>Is Finishes</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isOverlaps() <em>Is Overlaps</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isDuring() <em>Is During</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isCreation() <em>Is Creation</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isDestruction() <em>Is Destruction</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isChange() <em>Is Change</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#sourceEnd() <em>Source End</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#targetEnd() <em>Target End</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#source() <em>Source</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#target() <em>Target</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#sourceClass() <em>Source Class</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#targetClass() <em>Target Class</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#sourceDataType() <em>Source Data Type</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#targetDataType() <em>Target Data Type</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#sourceRelationship() <em>Source Relationship</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#targetRelationship() <em>Target Relationship</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isDerived() <em>Is Derived</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isEnd(net.menthor.onto2.ontouml.Classifier) <em>Is End</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isPartEssential() <em>Is Part Essential</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isPartInseparable() <em>Is Part Inseparable</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isPartImmutable() <em>Is Part Immutable</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isWholeImmutable() <em>Is Whole Immutable</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isPartMandatory() <em>Is Part Mandatory</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isWholeMandatory() <em>Is Whole Mandatory</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#isPartShareable() <em>Is Part Shareable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RelationshipTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationshipTest.class);
	}

	/**
	 * Constructs a new Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Relationship getFixture() {
		return (Relationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OntoumlFactory.eINSTANCE.createRelationship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isComponentOf() <em>Is Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isComponentOf()
	 * @generated
	 */
	public void testIsComponentOf() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isMemberOf() <em>Is Member Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isMemberOf()
	 * @generated
	 */
	public void testIsMemberOf() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isSubCollectionOf() <em>Is Sub Collection Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isSubCollectionOf()
	 * @generated
	 */
	public void testIsSubCollectionOf() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isSubQuantityOf() <em>Is Sub Quantity Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isSubQuantityOf()
	 * @generated
	 */
	public void testIsSubQuantityOf() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isQuaPartOf() <em>Is Qua Part Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isQuaPartOf()
	 * @generated
	 */
	public void testIsQuaPartOf() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isConstitution() <em>Is Constitution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isConstitution()
	 * @generated
	 */
	public void testIsConstitution() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isCharacterization() <em>Is Characterization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isCharacterization()
	 * @generated
	 */
	public void testIsCharacterization() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isMediation() <em>Is Mediation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isMediation()
	 * @generated
	 */
	public void testIsMediation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isMaterial() <em>Is Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isMaterial()
	 * @generated
	 */
	public void testIsMaterial() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isFormal() <em>Is Formal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isFormal()
	 * @generated
	 */
	public void testIsFormal() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isStructuration() <em>Is Structuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isStructuration()
	 * @generated
	 */
	public void testIsStructuration() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isParticipation() <em>Is Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isParticipation()
	 * @generated
	 */
	public void testIsParticipation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isSubEventOf() <em>Is Sub Event Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isSubEventOf()
	 * @generated
	 */
	public void testIsSubEventOf() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isCausation() <em>Is Causation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isCausation()
	 * @generated
	 */
	public void testIsCausation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isTemporal() <em>Is Temporal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isTemporal()
	 * @generated
	 */
	public void testIsTemporal() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isInstanceOf() <em>Is Instance Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isInstanceOf()
	 * @generated
	 */
	public void testIsInstanceOf() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isDerivation() <em>Is Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isDerivation()
	 * @generated
	 */
	public void testIsDerivation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isMeronymic() <em>Is Meronymic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isMeronymic()
	 * @generated
	 */
	public void testIsMeronymic() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isBinary() <em>Is Binary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isBinary()
	 * @generated
	 */
	public void testIsBinary() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isTernary() <em>Is Ternary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isTernary()
	 * @generated
	 */
	public void testIsTernary() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isStarts() <em>Is Starts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isStarts()
	 * @generated
	 */
	public void testIsStarts() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isPrecedes() <em>Is Precedes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isPrecedes()
	 * @generated
	 */
	public void testIsPrecedes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isEquals() <em>Is Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isEquals()
	 * @generated
	 */
	public void testIsEquals() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isMeets() <em>Is Meets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isMeets()
	 * @generated
	 */
	public void testIsMeets() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isFinishes() <em>Is Finishes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isFinishes()
	 * @generated
	 */
	public void testIsFinishes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isOverlaps() <em>Is Overlaps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isOverlaps()
	 * @generated
	 */
	public void testIsOverlaps() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isDuring() <em>Is During</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isDuring()
	 * @generated
	 */
	public void testIsDuring() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isCreation() <em>Is Creation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isCreation()
	 * @generated
	 */
	public void testIsCreation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isDestruction() <em>Is Destruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isDestruction()
	 * @generated
	 */
	public void testIsDestruction() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isChange() <em>Is Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isChange()
	 * @generated
	 */
	public void testIsChange() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#sourceEnd() <em>Source End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#sourceEnd()
	 * @generated
	 */
	public void testSourceEnd() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#targetEnd() <em>Target End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#targetEnd()
	 * @generated
	 */
	public void testTargetEnd() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#source()
	 * @generated
	 */
	public void testSource() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#target()
	 * @generated
	 */
	public void testTarget() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#sourceClass() <em>Source Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#sourceClass()
	 * @generated
	 */
	public void testSourceClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#targetClass() <em>Target Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#targetClass()
	 * @generated
	 */
	public void testTargetClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#sourceDataType() <em>Source Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#sourceDataType()
	 * @generated
	 */
	public void testSourceDataType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#targetDataType() <em>Target Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#targetDataType()
	 * @generated
	 */
	public void testTargetDataType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#sourceRelationship() <em>Source Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#sourceRelationship()
	 * @generated
	 */
	public void testSourceRelationship() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#targetRelationship() <em>Target Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#targetRelationship()
	 * @generated
	 */
	public void testTargetRelationship() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isDerived() <em>Is Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isDerived()
	 * @generated
	 */
	public void testIsDerived() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isEnd(net.menthor.onto2.ontouml.Classifier) <em>Is End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isEnd(net.menthor.onto2.ontouml.Classifier)
	 * @generated
	 */
	public void testIsEnd__Classifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isPartEssential() <em>Is Part Essential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isPartEssential()
	 * @generated
	 */
	public void testIsPartEssential() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isPartInseparable() <em>Is Part Inseparable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isPartInseparable()
	 * @generated
	 */
	public void testIsPartInseparable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isPartImmutable() <em>Is Part Immutable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isPartImmutable()
	 * @generated
	 */
	public void testIsPartImmutable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isWholeImmutable() <em>Is Whole Immutable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isWholeImmutable()
	 * @generated
	 */
	public void testIsWholeImmutable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isPartMandatory() <em>Is Part Mandatory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isPartMandatory()
	 * @generated
	 */
	public void testIsPartMandatory() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isWholeMandatory() <em>Is Whole Mandatory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isWholeMandatory()
	 * @generated
	 */
	public void testIsWholeMandatory() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Relationship#isPartShareable() <em>Is Part Shareable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Relationship#isPartShareable()
	 * @generated
	 */
	public void testIsPartShareable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RelationshipTest

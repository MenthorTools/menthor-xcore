/**
 */
package net.menthor.onto2.ontouml.tests;

import junit.textui.TestRunner;

import net.menthor.onto2.ontouml.OntoumlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isKind() <em>Is Kind</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isSubKind() <em>Is Sub Kind</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isCollective() <em>Is Collective</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isQuantity() <em>Is Quantity</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isRelator() <em>Is Relator</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isMode() <em>Is Mode</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isQuality() <em>Is Quality</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isRole() <em>Is Role</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isRoleMixin() <em>Is Role Mixin</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isPhaseMixin() <em>Is Phase Mixin</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isPhase() <em>Is Phase</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isCategory() <em>Is Category</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isMixin() <em>Is Mixin</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isEvent() <em>Is Event</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isHighOrder() <em>Is High Order</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isRigid() <em>Is Rigid</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isNonRigid() <em>Is Non Rigid</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isAntiRigid() <em>Is Anti Rigid</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isSemiRigid() <em>Is Semi Rigid</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isPerceivableQuality() <em>Is Perceivable Quality</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isNonPerceivableQuality() <em>Is Non Perceivable Quality</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isNominalQuality() <em>Is Nominal Quality</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isSubstanceSortalClass() <em>Is Substance Sortal Class</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isMomentClass() <em>Is Moment Class</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isIdentityProviderClass() <em>Is Identity Provider Class</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isMixinClass() <em>Is Mixin Class</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isAntiRigidMixinClass() <em>Is Anti Rigid Mixin Class</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isAmountOfMatter() <em>Is Amount Of Matter</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isFunctionalComplex() <em>Is Functional Complex</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isCollection() <em>Is Collection</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isMoment() <em>Is Moment</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isTruthMaker() <em>Is Truth Maker</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isNonQualitativeIntrinsicMoment() <em>Is Non Qualitative Intrinsic Moment</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#identityProvidersAtAllParents() <em>Identity Providers At All Parents</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#identityProvidersAtAllChildren() <em>Identity Providers At All Children</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#identityProviders() <em>Identity Providers</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ClassTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassTest.class);
	}

	/**
	 * Constructs a new Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected net.menthor.onto2.ontouml.Class getFixture() {
		return (net.menthor.onto2.ontouml.Class)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OntoumlFactory.eINSTANCE.createClass());
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
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isKind() <em>Is Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isKind()
	 * @generated
	 */
	public void testIsKind() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isSubKind() <em>Is Sub Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isSubKind()
	 * @generated
	 */
	public void testIsSubKind() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isCollective() <em>Is Collective</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isCollective()
	 * @generated
	 */
	public void testIsCollective() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isQuantity() <em>Is Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isQuantity()
	 * @generated
	 */
	public void testIsQuantity() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isRelator() <em>Is Relator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isRelator()
	 * @generated
	 */
	public void testIsRelator() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isMode() <em>Is Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isMode()
	 * @generated
	 */
	public void testIsMode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isQuality() <em>Is Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isQuality()
	 * @generated
	 */
	public void testIsQuality() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isRole() <em>Is Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isRole()
	 * @generated
	 */
	public void testIsRole() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isRoleMixin() <em>Is Role Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isRoleMixin()
	 * @generated
	 */
	public void testIsRoleMixin() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isPhaseMixin() <em>Is Phase Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isPhaseMixin()
	 * @generated
	 */
	public void testIsPhaseMixin() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isPhase() <em>Is Phase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isPhase()
	 * @generated
	 */
	public void testIsPhase() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isCategory() <em>Is Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isCategory()
	 * @generated
	 */
	public void testIsCategory() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isMixin() <em>Is Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isMixin()
	 * @generated
	 */
	public void testIsMixin() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isEvent() <em>Is Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isEvent()
	 * @generated
	 */
	public void testIsEvent() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isHighOrder() <em>Is High Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isHighOrder()
	 * @generated
	 */
	public void testIsHighOrder() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isRigid() <em>Is Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isRigid()
	 * @generated
	 */
	public void testIsRigid() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isNonRigid() <em>Is Non Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isNonRigid()
	 * @generated
	 */
	public void testIsNonRigid() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isAntiRigid() <em>Is Anti Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isAntiRigid()
	 * @generated
	 */
	public void testIsAntiRigid() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isSemiRigid() <em>Is Semi Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isSemiRigid()
	 * @generated
	 */
	public void testIsSemiRigid() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isPerceivableQuality() <em>Is Perceivable Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isPerceivableQuality()
	 * @generated
	 */
	public void testIsPerceivableQuality() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isNonPerceivableQuality() <em>Is Non Perceivable Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isNonPerceivableQuality()
	 * @generated
	 */
	public void testIsNonPerceivableQuality() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isNominalQuality() <em>Is Nominal Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isNominalQuality()
	 * @generated
	 */
	public void testIsNominalQuality() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isSubstanceSortalClass() <em>Is Substance Sortal Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isSubstanceSortalClass()
	 * @generated
	 */
	public void testIsSubstanceSortalClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isMomentClass() <em>Is Moment Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isMomentClass()
	 * @generated
	 */
	public void testIsMomentClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isIdentityProviderClass() <em>Is Identity Provider Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isIdentityProviderClass()
	 * @generated
	 */
	public void testIsIdentityProviderClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isMixinClass() <em>Is Mixin Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isMixinClass()
	 * @generated
	 */
	public void testIsMixinClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isAntiRigidMixinClass() <em>Is Anti Rigid Mixin Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isAntiRigidMixinClass()
	 * @generated
	 */
	public void testIsAntiRigidMixinClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isAmountOfMatter() <em>Is Amount Of Matter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isAmountOfMatter()
	 * @generated
	 */
	public void testIsAmountOfMatter() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isFunctionalComplex() <em>Is Functional Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isFunctionalComplex()
	 * @generated
	 */
	public void testIsFunctionalComplex() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isCollection() <em>Is Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isCollection()
	 * @generated
	 */
	public void testIsCollection() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isMoment() <em>Is Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isMoment()
	 * @generated
	 */
	public void testIsMoment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isTruthMaker() <em>Is Truth Maker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isTruthMaker()
	 * @generated
	 */
	public void testIsTruthMaker() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#isNonQualitativeIntrinsicMoment() <em>Is Non Qualitative Intrinsic Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#isNonQualitativeIntrinsicMoment()
	 * @generated
	 */
	public void testIsNonQualitativeIntrinsicMoment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#identityProvidersAtAllParents() <em>Identity Providers At All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#identityProvidersAtAllParents()
	 * @generated
	 */
	public void testIdentityProvidersAtAllParents() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#identityProvidersAtAllChildren() <em>Identity Providers At All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#identityProvidersAtAllChildren()
	 * @generated
	 */
	public void testIdentityProvidersAtAllChildren() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link net.menthor.onto2.ontouml.Class#identityProviders() <em>Identity Providers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Class#identityProviders()
	 * @generated
	 */
	public void testIdentityProviders() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ClassTest

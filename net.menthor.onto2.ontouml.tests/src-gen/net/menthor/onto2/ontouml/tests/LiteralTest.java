/**
 */
package net.menthor.onto2.ontouml.tests;

import junit.textui.TestRunner;

import net.menthor.onto2.ontouml.Literal;
import net.menthor.onto2.ontouml.OntoumlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiteralTest.class);
	}

	/**
	 * Constructs a new Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Literal getFixture() {
		return (Literal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OntoumlFactory.eINSTANCE.createLiteral());
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

} //LiteralTest

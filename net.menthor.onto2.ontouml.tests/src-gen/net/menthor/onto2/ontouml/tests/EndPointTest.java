/**
 */
package net.menthor.onto2.ontouml.tests;

import junit.textui.TestRunner;

import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.OntoumlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndPointTest extends PropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EndPointTest.class);
	}

	/**
	 * Constructs a new End Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this End Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EndPoint getFixture() {
		return (EndPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OntoumlFactory.eINSTANCE.createEndPoint());
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

} //EndPointTest

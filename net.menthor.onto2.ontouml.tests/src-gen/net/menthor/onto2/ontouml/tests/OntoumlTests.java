/**
 */
package net.menthor.onto2.ontouml.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ontouml</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoumlTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OntoumlTests("ontouml Tests");
		suite.addTestSuite(ModelTest.class);
		suite.addTestSuite(PackageTest.class);
		suite.addTestSuite(AttributeTest.class);
		suite.addTestSuite(ConstraintTest.class);
		suite.addTestSuite(DataTypeTest.class);
		suite.addTestSuite(ClassTest.class);
		suite.addTestSuite(RelationshipTest.class);
		suite.addTestSuite(GeneralizationSetTest.class);
		suite.addTestSuite(GeneralizationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoumlTests(String name) {
		super(name);
	}

} //OntoumlTests

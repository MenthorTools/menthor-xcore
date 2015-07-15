/**
 */
package net.menthor.onto2.ontouml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * =========================================
 *  Model: is just a Container
 *  ========================================
 * <!-- end-model-doc -->
 *
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean initializeValidator(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Model

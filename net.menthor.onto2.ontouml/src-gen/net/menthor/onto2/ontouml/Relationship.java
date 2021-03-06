/**
 */
package net.menthor.onto2.ontouml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * A Relationship can define reflexivity, symmetry, transitivity, ciclicity
 *  and must assume more than 1 end point.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getReflexivity <em>Reflexivity</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getTransitivity <em>Transitivity</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getCiclicity <em>Ciclicity</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getEndPoints <em>End Points</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getTemporalNature <em>Temporal Nature</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Relationship#getParticipationNature <em>Participation Nature</em>}</li>
 * </ul>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Classifier {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.RelationshipStereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.RelationshipStereotype
	 * @see #setStereotype(RelationshipStereotype)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	RelationshipStereotype getStereotype();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Relationship#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.RelationshipStereotype
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(RelationshipStereotype value);

	/**
	 * Returns the value of the '<em><b>Reflexivity</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.Reflexivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflexivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflexivity</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Reflexivity
	 * @see #setReflexivity(Reflexivity)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_Reflexivity()
	 * @model unique="false"
	 * @generated
	 */
	Reflexivity getReflexivity();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Relationship#getReflexivity <em>Reflexivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflexivity</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Reflexivity
	 * @see #getReflexivity()
	 * @generated
	 */
	void setReflexivity(Reflexivity value);

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.Symmetry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symmetry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Symmetry
	 * @see #setSymmetry(Symmetry)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_Symmetry()
	 * @model unique="false"
	 * @generated
	 */
	Symmetry getSymmetry();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Relationship#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Symmetry
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(Symmetry value);

	/**
	 * Returns the value of the '<em><b>Transitivity</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.Transitivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitivity</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Transitivity
	 * @see #setTransitivity(Transitivity)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_Transitivity()
	 * @model unique="false"
	 * @generated
	 */
	Transitivity getTransitivity();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Relationship#getTransitivity <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitivity</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Transitivity
	 * @see #getTransitivity()
	 * @generated
	 */
	void setTransitivity(Transitivity value);

	/**
	 * Returns the value of the '<em><b>Ciclicity</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.Ciclicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ciclicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ciclicity</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Ciclicity
	 * @see #setCiclicity(Ciclicity)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_Ciclicity()
	 * @model unique="false"
	 * @generated
	 */
	Ciclicity getCiclicity();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Relationship#getCiclicity <em>Ciclicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciclicity</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Ciclicity
	 * @see #getCiclicity()
	 * @generated
	 */
	void setCiclicity(Ciclicity value);

	/**
	 * Returns the value of the '<em><b>End Points</b></em>' containment reference list.
	 * The list contents are of type {@link net.menthor.onto2.ontouml.EndPoint}.
	 * It is bidirectional and its opposite is '{@link net.menthor.onto2.ontouml.EndPoint#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Points</em>' containment reference list.
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_EndPoints()
	 * @see net.menthor.onto2.ontouml.EndPoint#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<EndPoint> getEndPoints();

	/**
	 * Returns the value of the '<em><b>Temporal Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.TemporalNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Nature</em>' attribute.
	 * @see net.menthor.onto2.ontouml.TemporalNature
	 * @see #setTemporalNature(TemporalNature)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_TemporalNature()
	 * @model unique="false"
	 * @generated
	 */
	TemporalNature getTemporalNature();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Relationship#getTemporalNature <em>Temporal Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Nature</em>' attribute.
	 * @see net.menthor.onto2.ontouml.TemporalNature
	 * @see #getTemporalNature()
	 * @generated
	 */
	void setTemporalNature(TemporalNature value);

	/**
	 * Returns the value of the '<em><b>Participation Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.ParticipationNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participation Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participation Nature</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ParticipationNature
	 * @see #setParticipationNature(ParticipationNature)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getRelationship_ParticipationNature()
	 * @model unique="false"
	 * @generated
	 */
	ParticipationNature getParticipationNature();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Relationship#getParticipationNature <em>Participation Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participation Nature</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ParticipationNature
	 * @see #getParticipationNature()
	 * @generated
	 */
	void setParticipationNature(ParticipationNature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.COMPONENT_OF);'"
	 * @generated
	 */
	boolean isComponentOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.MEMBER_OF);'"
	 * @generated
	 */
	boolean isMemberOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.SUB_COLLECTION_OF);'"
	 * @generated
	 */
	boolean isSubCollectionOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.SUB_QUANTITY_OF);'"
	 * @generated
	 */
	boolean isSubQuantityOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.QUA_PART_OF);'"
	 * @generated
	 */
	boolean isQuaPartOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.CONSTITUTION);'"
	 * @generated
	 */
	boolean isConstitution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.CHARACTERIZATION);'"
	 * @generated
	 */
	boolean isCharacterization();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.MEDIATION);'"
	 * @generated
	 */
	boolean isMediation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.MATERIAL);'"
	 * @generated
	 */
	boolean isMaterial();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.FORMAL);'"
	 * @generated
	 */
	boolean isFormal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.STRUCTURATION);'"
	 * @generated
	 */
	boolean isStructuration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.PARTICIPATION);'"
	 * @generated
	 */
	boolean isParticipation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.SUB_EVENT_OF);'"
	 * @generated
	 */
	boolean isSubEventOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.CAUSATION);'"
	 * @generated
	 */
	boolean isCausation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.TEMPORAL);'"
	 * @generated
	 */
	boolean isTemporal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.INSTANCE_OF);'"
	 * @generated
	 */
	boolean isInstanceOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.RelationshipStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.RelationshipStereotype%>.DERIVATION);'"
	 * @generated
	 */
	boolean isDerivation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _or_2 = false;\nboolean _or_3 = false;\nboolean _or_4 = false;\nboolean _isComponentOf = this.isComponentOf();\nif (_isComponentOf)\n{\n\t_or_4 = true;\n} else\n{\n\tboolean _isMemberOf = this.isMemberOf();\n\t_or_4 = _isMemberOf;\n}\nif (_or_4)\n{\n\t_or_3 = true;\n} else\n{\n\tboolean _isSubQuantityOf = this.isSubQuantityOf();\n\t_or_3 = _isSubQuantityOf;\n}\nif (_or_3)\n{\n\t_or_2 = true;\n} else\n{\n\tboolean _isSubCollectionOf = this.isSubCollectionOf();\n\t_or_2 = _isSubCollectionOf;\n}\nif (_or_2)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isConstitution = this.isConstitution();\n\t_or_1 = _isConstitution;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubEventOf = this.isSubEventOf();\n\t_or = _isSubEventOf;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isMeronymic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = this.getEndPoints();\nint _size = _endPoints.size();\nreturn (_size == 2);'"
	 * @generated
	 */
	boolean isBinary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = this.getEndPoints();\nint _size = _endPoints.size();\nreturn (_size == 3);'"
	 * @generated
	 */
	boolean isTernary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isTemporal = this.isTemporal();\nif (!_isTemporal)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.TemporalNature%> _temporalNature = this.getTemporalNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_temporalNature, <%net.menthor.onto2.ontouml.TemporalNature%>.STARTS);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isStarts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isTemporal = this.isTemporal();\nif (!_isTemporal)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.TemporalNature%> _temporalNature = this.getTemporalNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_temporalNature, <%net.menthor.onto2.ontouml.TemporalNature%>.PRECEDES);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isPrecedes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isTemporal = this.isTemporal();\nif (!_isTemporal)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.TemporalNature%> _temporalNature = this.getTemporalNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_temporalNature, <%net.menthor.onto2.ontouml.TemporalNature%>.EQUALS);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isEquals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isTemporal = this.isTemporal();\nif (!_isTemporal)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.TemporalNature%> _temporalNature = this.getTemporalNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_temporalNature, <%net.menthor.onto2.ontouml.TemporalNature%>.MEETS);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isMeets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isTemporal = this.isTemporal();\nif (!_isTemporal)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.TemporalNature%> _temporalNature = this.getTemporalNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_temporalNature, <%net.menthor.onto2.ontouml.TemporalNature%>.FINISHES);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isFinishes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isTemporal = this.isTemporal();\nif (!_isTemporal)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.TemporalNature%> _temporalNature = this.getTemporalNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_temporalNature, <%net.menthor.onto2.ontouml.TemporalNature%>.OVERLAPS);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isOverlaps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isTemporal = this.isTemporal();\nif (!_isTemporal)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.TemporalNature%> _temporalNature = this.getTemporalNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_temporalNature, <%net.menthor.onto2.ontouml.TemporalNature%>.DURING);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isDuring();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isParticipation = this.isParticipation();\nif (!_isParticipation)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.ParticipationNature%> _participationNature = this.getParticipationNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_participationNature, <%net.menthor.onto2.ontouml.ParticipationNature%>.CREATION);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isCreation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isParticipation = this.isParticipation();\nif (!_isParticipation)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.ParticipationNature%> _participationNature = this.getParticipationNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_participationNature, <%net.menthor.onto2.ontouml.ParticipationNature%>.DESTRUCTION);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isDestruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _isParticipation = this.isParticipation();\nif (!_isParticipation)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.ParticipationNature%> _participationNature = this.getParticipationNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_participationNature, <%net.menthor.onto2.ontouml.ParticipationNature%>.CHANGE);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isChange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the source (first end-point) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = this.getEndPoints();\nint _size = _endPoints.size();\nboolean _greaterThan = (_size > 0);\nif (_greaterThan)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints_1 = this.getEndPoints();\n\treturn _endPoints_1.get(0);\n}\nreturn null;'"
	 * @generated
	 */
	EndPoint sourceEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the target (second end-point) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = this.getEndPoints();\nint _size = _endPoints.size();\nboolean _greaterThan = (_size > 1);\nif (_greaterThan)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints_1 = this.getEndPoints();\n\treturn _endPoints_1.get(1);\n}\nreturn null;'"
	 * @generated
	 */
	EndPoint targetEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isMeronymic = this.isMeronymic();\nif (_isMeronymic)\n{\n\treturn this.targetEnd();\n}\nelse\n{\n\treturn null;\n}'"
	 * @generated
	 */
	EndPoint partEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isMeronymic = this.isMeronymic();\nif (_isMeronymic)\n{\n\treturn this.sourceEnd();\n}\nelse\n{\n\treturn null;\n}'"
	 * @generated
	 */
	EndPoint wholeEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the source (first end-classifier) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.EndPoint%> _sourceEnd = this.sourceEnd();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_sourceEnd, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.EndPoint%> _sourceEnd_1 = this.sourceEnd();\n\treturn _sourceEnd_1.getEndType();\n}\nreturn null;'"
	 * @generated
	 */
	Classifier source();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the target (second end-classifier) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.EndPoint%> _targetEnd = this.targetEnd();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_targetEnd, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.EndPoint%> _targetEnd_1 = this.targetEnd();\n\treturn _targetEnd_1.getEndType();\n}\nreturn null;'"
	 * @generated
	 */
	Classifier target();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the source (first end-class) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%> _source = this.source();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_source, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _source_1 = this.source();\n\treturn ((<%net.menthor.onto2.ontouml.Class%>) _source_1);\n}\nreturn null;'"
	 * @generated
	 */
	net.menthor.onto2.ontouml.Class sourceClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the target (second end-class) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%> _target = this.target();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_target, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _target_1 = this.target();\n\treturn ((<%net.menthor.onto2.ontouml.Class%>) _target_1);\n}\nreturn null;'"
	 * @generated
	 */
	net.menthor.onto2.ontouml.Class targetClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the source (first end-class) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isMeronymic = this.isMeronymic();\nif (_isMeronymic)\n{\n\treturn this.sourceClass();\n}\nelse\n{\n\treturn null;\n}'"
	 * @generated
	 */
	net.menthor.onto2.ontouml.Class wholeClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the target (second end-class) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isMeronymic = this.isMeronymic();\nif (_isMeronymic)\n{\n\treturn this.targetClass();\n}\nelse\n{\n\treturn null;\n}'"
	 * @generated
	 */
	net.menthor.onto2.ontouml.Class partClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the source (first end-dataType) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%> _source = this.source();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_source, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _source_1 = this.source();\n\treturn ((<%net.menthor.onto2.ontouml.DataType%>) _source_1);\n}\nreturn null;'"
	 * @generated
	 */
	DataType sourceDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the target (second end-dataType) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%> _target = this.target();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_target, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _target_1 = this.target();\n\treturn ((<%net.menthor.onto2.ontouml.DataType%>) _target_1);\n}\nreturn null;'"
	 * @generated
	 */
	DataType targetDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the source (first end-relationship) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%> _source = this.source();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_source, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _source_1 = this.source();\n\treturn ((<%net.menthor.onto2.ontouml.Relationship%>) _source_1);\n}\nreturn null;'"
	 * @generated
	 */
	Relationship sourceRelationship();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the target (second end-relationship) of this relationship
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.Classifier%> _target = this.target();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_target, null));\nif (_notEquals)\n{\n\t<%net.menthor.onto2.ontouml.Classifier%> _target_1 = this.target();\n\treturn ((<%net.menthor.onto2.ontouml.Relationship%>) _target_1);\n}\nreturn null;'"
	 * @generated
	 */
	Relationship targetRelationship();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Checks if this relationship is derived i.e. checking if there is at least one end-point which is derived
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = this.getEndPoints();\nfor (final <%net.menthor.onto2.ontouml.EndPoint%> ep : _endPoints)\n{\n\tboolean _isIsDerived = ep.isIsDerived();\n\tif (_isIsDerived)\n\t{\n\t\treturn true;\n\t}\n}\nreturn false;'"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Checks if there is at least one end-point in this relationship of classifier c.
	 * <!-- end-model-doc -->
	 * @model unique="false" cUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.EndPoint%>> _endPoints = this.getEndPoints();\nfor (final <%net.menthor.onto2.ontouml.EndPoint%> ep : _endPoints)\n{\n\t{\n\t\tfinal <%net.menthor.onto2.ontouml.Classifier%> type_ = ep.getEndType();\n\t\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(type_, null));\n\t\tif (_notEquals)\n\t\t{\n\t\t\tboolean _equals = type_.equals(c);\n\t\t\tif (_equals)\n\t\t\t{\n\t\t\t\treturn true;\n\t\t\t}\n\t\t}\n\t}\n}\nreturn false;'"
	 * @generated
	 */
	boolean isEnd(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A part is essential if the target end of a meronymic relationship is dependent on the rigid source type
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\n<%net.menthor.onto2.ontouml.EndPoint%> _targetEnd = this.targetEnd();\nboolean _isIsDependency = _targetEnd.isIsDependency();\nif (!_isIsDependency)\n{\n\t_and_1 = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.Class%> _sourceClass = this.sourceClass();\n\tboolean _isRigid = _sourceClass.isRigid();\n\t_and_1 = _isRigid;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\tboolean _isMeronymic = this.isMeronymic();\n\t_and = _isMeronymic;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isPartEssential();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A part is inseparable if the source end of a meronymic relationship is dependent on the rigid target type
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\n<%net.menthor.onto2.ontouml.EndPoint%> _sourceEnd = this.sourceEnd();\nboolean _isIsDependency = _sourceEnd.isIsDependency();\nif (!_isIsDependency)\n{\n\t_and_1 = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.Class%> _targetClass = this.targetClass();\n\tboolean _isRigid = _targetClass.isRigid();\n\t_and_1 = _isRigid;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\tboolean _isMeronymic = this.isMeronymic();\n\t_and = _isMeronymic;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isPartInseparable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A part is immutable if the source end of a meronymic relationship is dependent on the anti-rigid target type
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\n<%net.menthor.onto2.ontouml.EndPoint%> _sourceEnd = this.sourceEnd();\nboolean _isIsDependency = _sourceEnd.isIsDependency();\nif (!_isIsDependency)\n{\n\t_and_1 = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.Class%> _targetClass = this.targetClass();\n\tboolean _isAntiRigid = _targetClass.isAntiRigid();\n\t_and_1 = _isAntiRigid;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\tboolean _isMeronymic = this.isMeronymic();\n\t_and = _isMeronymic;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isPartImmutable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A whole is immutable if the target end of a meronymic relationship is dependent on the anti-rigid source type
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\n<%net.menthor.onto2.ontouml.EndPoint%> _targetEnd = this.targetEnd();\nboolean _isIsDependency = _targetEnd.isIsDependency();\nif (!_isIsDependency)\n{\n\t_and_1 = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.Class%> _sourceClass = this.sourceClass();\n\tboolean _isAntiRigid = _sourceClass.isAntiRigid();\n\t_and_1 = _isAntiRigid;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\tboolean _isMeronymic = this.isMeronymic();\n\t_and = _isMeronymic;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isWholeImmutable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A part is mandatory if the target end of a meronymic relationship has a lower bound of at least 1
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\n<%net.menthor.onto2.ontouml.EndPoint%> _targetEnd = this.targetEnd();\nint _lowerBound = _targetEnd.getLowerBound();\nboolean _greaterEqualsThan = (_lowerBound >= 1);\nif (!_greaterEqualsThan)\n{\n\t_and = false;\n} else\n{\n\tboolean _isMeronymic = this.isMeronymic();\n\t_and = _isMeronymic;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isPartMandatory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A whole is mandatory if the source end of a meronymic relationship has a lower bound of at least 1
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\n<%net.menthor.onto2.ontouml.EndPoint%> _sourceEnd = this.sourceEnd();\nint _lowerBound = _sourceEnd.getLowerBound();\nboolean _greaterEqualsThan = (_lowerBound >= 1);\nif (!_greaterEqualsThan)\n{\n\t_and = false;\n} else\n{\n\tboolean _isMeronymic = this.isMeronymic();\n\t_and = _isMeronymic;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isWholeMandatory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A part is shareable if the source end of a meronymic relationship has a upper bound greater than 1
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\n<%net.menthor.onto2.ontouml.EndPoint%> _sourceEnd = this.sourceEnd();\nint _upperBound = _sourceEnd.getUpperBound();\nboolean _greaterThan = (_upperBound > 1);\nif (!_greaterThan)\n{\n\t_and = false;\n} else\n{\n\tboolean _isMeronymic = this.isMeronymic();\n\t_and = _isMeronymic;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isPartShareable();

} // Relationship

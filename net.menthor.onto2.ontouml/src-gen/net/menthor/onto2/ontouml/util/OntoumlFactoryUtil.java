package net.menthor.onto2.ontouml.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.menthor.onto2.ontouml.Attribute;
import net.menthor.onto2.ontouml.ClassStereotype;
import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.Container;
import net.menthor.onto2.ontouml.DataType;
import net.menthor.onto2.ontouml.DataTypeStereotype;
import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.Literal;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.Package;
import net.menthor.onto2.ontouml.Class;
import net.menthor.onto2.ontouml.OntoumlFactory;
import net.menthor.onto2.ontouml.PrimitiveStereotype;
import net.menthor.onto2.ontouml.Property;
import net.menthor.onto2.ontouml.QualityNature;
import net.menthor.onto2.ontouml.Relationship;
import net.menthor.onto2.ontouml.RelationshipStereotype;
import net.menthor.onto2.ontouml.Type;

public class OntoumlFactoryUtil {
	
	public static OntoumlFactory factory = OntoumlFactory.eINSTANCE;

	public static Package createPackage(String name)
	{
		Package p = factory.createPackage();
		if(name!=null)p.setName(name);
		else p.setName("");
		return p;
	}
	
	public static Model createModel(String name)
	{
		Model p = factory.createModel();
		if(name!=null)p.setName(name);
		else p.setName("");
		return p;
	}
	
	public static GeneralizationSet createGeneralizationSet(boolean isCovering, Container container) 
	{
		GeneralizationSet gs = factory.createGeneralizationSet();
		gs.setIsCovering(isCovering);		
		gs.setName("");
		if(container!=null) {
			container.getElements().add(gs);
			gs.setHolder(container);
		}
		return gs;
	}
	
	public static GeneralizationSet createGeneralizationSet(String name, boolean isCovering, Container container) 
	{
		GeneralizationSet gs = factory.createGeneralizationSet();
		gs.setIsCovering(isCovering);
		if(name!=null) gs.setName(name);
		else gs.setName("");
		if(container!=null){
			container.getElements().add(gs);
			gs.setHolder(container);
		}
		return gs;
	}
	
	public static GeneralizationSet createGeneralizationSet (Classifier specific, Classifier general, Container container)
	{		
		GeneralizationSet gs = factory.createGeneralizationSet();		
		gs.setSpecializedClassifier(general);
		gs.getSpecializingClassifier().add(specific);	
		if(container!=null){
			container.getElements().add(gs);
			gs.setHolder(container);
		}
		return gs;
	}
	
	public static GeneralizationSet createGeneralizationSet (String name, boolean isCovering, Classifier general, Classifier specific1, Classifier specific2, Container container)
	{		
		GeneralizationSet gs = createGeneralizationSet(specific1, general,container);
		gs.getSpecializingClassifier().add(specific2);
		gs.setIsCovering(isCovering);
		if(name!=null) gs.setName(name);
		else gs.setName("");				
		if(container!=null){
			container.getElements().add(gs);
			gs.setHolder(container);
		}
		return gs;
	}
	
	public static GeneralizationSet createPartition(String name, List<Classifier> specifics, Classifier general, Container container)
	{
		GeneralizationSet gs = factory.createGeneralizationSet();		
		gs.setSpecializedClassifier(general);
		gs.getSpecializingClassifier().addAll(specifics);	
		if(name!=null)gs.setName(name);
		else gs.setName("");
		if(container!=null){
			container.getElements().add(gs);
			gs.setHolder(container);
		}
		return gs;
	}
	
	public static GeneralizationSet createGeneralizationSet (String name, boolean isCovering, Classifier general, Classifier specific, Container container)
	{		
		GeneralizationSet gs = createGeneralizationSet(specific, general,container);
		gs.setIsCovering(isCovering);
		if(name!=null) gs.setName(name);
		else gs.setName("");				
		return gs;
	}
	
	public static Relationship createRelationship (Classifier source, Classifier target, Container container)
	{
		Relationship assoc = factory.createRelationship();
		addEndPoints(assoc, source, target);
		if(container!=null){
			container.getElements().add(assoc);
			assoc.setHolder(container);
		}
		return assoc;
	}
	
	/** Create an relationship between source and target types */
	public static Relationship createRelationship (Classifier source, int srcLower, int srcUpper, String name, Classifier target, int tgtLower, int tgtUpper, Container container)
	{
		Relationship relationship = factory.createRelationship();
		List<EndPoint> ends = addEndPoints(relationship, source, target);
		setMultiplicity(ends.get(0), srcLower, srcUpper);
		setMultiplicity(ends.get(1), tgtLower, tgtUpper);
		if(name!=null) relationship.setName(name);
		else relationship.setName("");
		if(container!=null){
			container.getElements().add(relationship);
			relationship.setHolder(container);
		}
		return relationship;
	}
	
	/** Create a relationship between source and target types */
	public static Relationship createRelationship (RelationshipStereotype stereotype, Classifier source, Classifier target, Container container)
	{
		Relationship relationship = factory.createRelationship();
		relationship.setStereotype(stereotype);		
		if(shouldInvert(relationship,source,target)) addEndPoints(relationship, target, source); 
		else addEndPoints(relationship, source, target);
		if(container!=null){
			container.getElements().add(relationship);
			relationship.setHolder(container);
		}
		return relationship;
	}
	
	public static boolean shouldInvert(Relationship relationship, Classifier source, Classifier target)
	{
		if(relationship.isMediation() && (target instanceof Class) && ((Class)target).isTruthMaker() && (source instanceof Class) && (!((Class)source).isTruthMaker())) {
			return true;
		}
		else if(relationship.isCharacterization() && (target instanceof Class) && ((Class)target).isNonQualitativeIntrinsicMoment() && (source instanceof Class) && (!((Class)source).isNonQualitativeIntrinsicMoment())) {
			return true;
		}
		else if(relationship.isStructuration() && (target instanceof DataType) && ((DataType)target).isStructure() && (source instanceof Class) && (!((Class)source).isQuality())) {
			return true;
		}
		else if(relationship.isParticipation() && (target instanceof Class) && ((Class)target).isEvent() && (source instanceof Class) && (!((Class)source).isEvent())) {
			return true;
		}
		else if(relationship.isDerivation() && (target instanceof Relationship) && ((Relationship)target).isMaterial() && (source instanceof Class) && (!((Class)source).isTruthMaker())) {
			return true;
		}
		else if(relationship.isQuaPartOf() && (target instanceof Class) && ((Class)target).isTruthMaker() && (source instanceof Class) && (!((Class)source).isNonQualitativeIntrinsicMoment())) {
			return true;
		}
		else return false;
	}
	
	/** Create a relationship between source and target types */
	public static Relationship createRelationship (RelationshipStereotype stereotype, Classifier source, int srcLower, int srcUpper, String name, Classifier target, int tgtLower, int tgtUpper, Container container)
	{
		Relationship relationship = factory.createRelationship();
		relationship.setStereotype(stereotype);		
		List<EndPoint> ends;
		if(shouldInvert(relationship,source,target)) ends = addEndPoints(relationship, target, source); 
		else ends = addEndPoints(relationship, source, target);		
		setMultiplicity(ends.get(0), srcLower, srcUpper);
		setMultiplicity(ends.get(1), tgtLower, tgtUpper);
		if(name!=null) relationship.setName(name);
		else relationship.setName("");
		if(container!=null){
			container.getElements().add(relationship);
			relationship.setHolder(container);
		}
		return relationship;
	}
	
	/** Create a class  */
	public static Class createClass(ClassStereotype stereotype, String name, Container container)
	{
		Class class_ = factory.createClass();
		class_.setStereotype(stereotype);
		if(class_.isMixinClass()) class_.setIsAbstract(true);
		if(name!=null) class_.setName(name);
		else class_.setName("");
		if(container!=null){
			container.getElements().add(class_);
			class_.setHolder(container);
		}
		return class_;
	}

	public static Class createClass(ClassStereotype stereotype, String name, boolean isAbstract, Container container)
	{
		Class class_ = factory.createClass();
		class_.setStereotype(stereotype);
		class_.setIsAbstract(isAbstract);
		if(name!=null) class_.setName(name);
		else class_.setName("");
		if(container!=null){
			container.getElements().add(class_);
			class_.setHolder(container);
		}
		return class_;
	}
	
	/** Create a perceivable quality */
	public static Class createPerceivableQuality(String name, Container container)
	{
		Class quality = createClass(ClassStereotype.QUALITY,name,container);
		quality.setQualityNature(QualityNature.PERCEIVABLE);		
		return quality;
	}
	
	/** Create a nonperceivable quality  */
	public static Class createNonPerceivableQuality(String name, Container container)
	{
		Class quality = createClass(ClassStereotype.QUALITY,name,container);
		quality.setQualityNature(QualityNature.NON_PERCEIVABLE);		
		return quality;
	}
	
	/** Create a nominal quality  */
	public static Class createNominalQuality(String name, Container container)
	{
		Class quality = createClass(ClassStereotype.QUALITY,name,container);
		quality.setQualityNature(QualityNature.NOMINAL);		
		return quality;
	}
		
	/** Create a data type  */
	public static DataType createDataType(DataTypeStereotype stereotype, String name, Container container)
	{
		DataType datatype = factory.createDataType();
		datatype.setStereotype(stereotype);
		if(name!=null) datatype.setName(name);
		else datatype.setName("");		
		if(container!=null){
			container.getElements().add(datatype);
			datatype.setHolder(container);
		}
		return datatype;
	}	
	
	public static Literal createLiteral(String value){
		Literal lit = factory.createLiteral();
		lit.setValue(value);
		return lit;
	}
	
	public static List<Literal> createLiterals(Collection<String> values)
	{
		List<Literal> result = new ArrayList<Literal>();
		for(String v: values){
			result.add(createLiteral(v));
		}
		return result;
	}
	
	/** Create a enumeration  */
	public static DataType createEnumeration(String name, Collection<String> values, Container container)
	{
		DataType enumeration = createDataType(DataTypeStereotype.ENUMERATION,name,container);
		List<Literal> literals = createLiterals(values);
		enumeration.getLiterals().addAll(literals);
		for(Literal lit: literals) lit.setOwner(enumeration);				
		if(container!=null){
			container.getElements().add(enumeration);
			enumeration.setHolder(container);
		}
		return enumeration;
	}	

	/**
	 * Create an attribute of this primitive to this owner type
	 * Multiplicities are by default 1..1. This is not a derived nor a dependency attribute.
	 */
	public static Attribute createAttribute (Type owner, PrimitiveStereotype primitive)
	{
		Attribute attribute = createAttribute(owner, primitive, 1, 1, "", false, false);
		if(owner!=null)owner.getAttributes().add(attribute);
		attribute.setOwner(owner);
		return attribute;		
	}
	
	/** Create an attribute of a type (class or dataType)*/
	public static Attribute createAttribute (Type owner, PrimitiveStereotype primitive, int lower, int upper)
	{
		Attribute attribute = factory.createAttribute();
		attribute.setStereotype(primitive);
		attribute.setOwner(owner);
		attribute.setLowerBound(lower);		
		attribute.setUpperBound(upper);		
		if(owner!=null && owner.getName()!=null) attribute.setName(owner.getName().trim().toLowerCase());
		else attribute.setName("");
		if(owner!=null)owner.getAttributes().add(attribute);
		attribute.setOwner(owner);
		return attribute;		
	}
		
	/** Create an attribute of a type (class or dataType) */
	public static Attribute createAttribute (Type owner, PrimitiveStereotype primitive, int lower, int upper, String name, boolean isDerived, boolean isDependency)
	{		
		Attribute attribute = createAttribute(owner,primitive, lower, upper);
		if(owner !=null && owner.getName()!=null && name==null) attribute.setName(owner.getName().trim().toLowerCase());
		else if(name!=null) attribute.setName(name);
		attribute.setIsDerived(isDerived);
		attribute.setIsDependency(isDependency);
		if(owner!=null)owner.getAttributes().add(attribute);
		attribute.setOwner(owner);
		return attribute;
	}

	/** Create an attribute to this classifier. */
	public static Attribute createAttribute (Type owner, PrimitiveStereotype primitive, int lower, int upper, String name, boolean isDerived)
	{				
		Attribute attribute = createAttribute(owner, primitive, lower, upper, name, isDerived, false);
		if(owner!=null)owner.getAttributes().add(attribute);
		attribute.setOwner(owner);
		return attribute;
	}
	
	/**
	 * Create an end-point of a relationship 
	 * with a default name which is the classifier name in lower case 
	 */
	public static EndPoint createEndPoint(Classifier classifier, int lower, int upper) 
	{
		EndPoint endpoint = factory.createEndPoint();
		endpoint.setEndType(classifier);
		endpoint.setLowerBound(lower);
		endpoint.setUpperBound(upper);		
		if(classifier!=null && classifier.getName()!=null) endpoint.setName(classifier.getName().trim().toLowerCase());
		else endpoint.setName("");
		return endpoint;
	}

	/** Create an end-point of a relationship. */
	public static EndPoint createEndPoint(Classifier classifier, int lower, int upper, String name) 
	{
		EndPoint p = createEndPoint(classifier, lower, upper);
		if(classifier !=null && classifier.getName()!=null && name==null) p.setName(classifier.getName().trim().toLowerCase());
		else if(name!=null) p.setName(name);
		return p;
	}
	
	/** Create an end-point of a relationship */
	public static EndPoint createEndPoint(Classifier classifier, int lower, int upper, String name, boolean isDerived, boolean isDependency)
	{
		EndPoint p = createEndPoint(classifier, lower, upper, name);
		p.setIsDerived(isDerived);
		p.setIsDependency(isDependency);		
		return p;
	}
		
	/** Add end points to this relationship */
	public static void addEndPoints(Relationship relationship, EndPoint sourceEnd, EndPoint targetEnd) 
	{
		relationship.getEndPoints().add(sourceEnd);
		relationship.getEndPoints().add(targetEnd);
		sourceEnd.setOwner(relationship);
		targetEnd.setOwner(relationship);
	}
	
	/** Add end-points from and to these given types in this relationship.*/
	public static List<EndPoint> addEndPoints(Relationship relationship, Classifier source, Classifier target)
	{
		List<EndPoint> endpoints = addEndPoints(relationship);
		endpoints.get(0).setEndType(source);
		endpoints.get(1).setEndType(target);
		if(source.getName()!=null) endpoints.get(0).setName(source.getName().trim().toLowerCase());
		if(target.getName()!=null) endpoints.get(1).setName(target.getName().trim().toLowerCase());
		return endpoints;
	}
	
	public static List<EndPoint> addEndPoints(Relationship relationship) 
	{
		List<EndPoint> endpoints = new ArrayList<EndPoint>();

		EndPoint ep1;		
		if(relationship.isCharacterization() || relationship.isStructuration() || relationship.isQuaPartOf()) ep1 = createEndPoint(null, 1,1);
		else if (relationship.isSubQuantityOf()) ep1 = createEndPoint(null,0,1);
		else if (relationship.isDerivation()) ep1 = createEndPoint(null,1,-1);
		else ep1 = createEndPoint(null,0,-1);
		
		EndPoint ep2;
		if (relationship.isSubQuantityOf() || relationship.isSubCollectionOf()) ep2 = createEndPoint(null,0,1);
		else if(relationship.isMediation() || relationship.isCharacterization() || relationship.isInstanceOf() || relationship.isDerivation()) ep2 = createEndPoint(null, 1, -1);
		else  ep2 = createEndPoint(null,0,-1);
		
		//dependency
		if(relationship.isCausation() || relationship.isSubEventOf() || relationship.isTemporal() || relationship.isDerivation() || relationship.isQuaPartOf())
		{
			ep1.setIsDependency(true);
		}
		if (relationship.isCausation() || relationship.isMediation() || relationship.isSubEventOf() || relationship.isCharacterization() || 
			relationship.isParticipation() || relationship.isTemporal() || relationship.isDerivation() || relationship.isQuaPartOf()){
			ep2.setIsDependency(true);
		}
		
		//name
		String name1 = new String();
		if (ep1.getEndType() != null) 
		{
			name1 = ep1.getEndType().getName();
			if (name1 == null || name1.trim().isEmpty()) name1 = "source";
			else name1 = name1.trim().toLowerCase();
		}
		String name2 = new String();
		if (ep2.getEndType() != null) 
		{
			name2 = ep2.getEndType().getName();
			if (name2 == null || name2.trim().isEmpty()) name2 = "target";
			else name2 = name2.trim().toLowerCase();
		}
		ep1.setName(name1);
		ep2.setName(name2);
		
		//ends
		addEndPoints(relationship, ep1, ep1);
		
		return endpoints;
	}
	
	/** Set multiplicity of an end-point or attribute */
	public static void setMultiplicity(Property property, int lower, int upper)
	{	
		property.setLowerBound(lower);		
		property.setUpperBound(upper);			
	}

}

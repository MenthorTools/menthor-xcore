package net.menthor.onto2.mapping.ref2ontouml;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import net.menthor.onto2.ontouml.ClassStereotype;
import net.menthor.onto2.ontouml.DataTypeStereotype;
import net.menthor.onto2.ontouml.PrimitiveStereotype;
import net.menthor.onto2.ontouml.RelationshipStereotype;

public class TransformerUtil {
	
	public static ClassStereotype getClassStereotypeByName(EObject elem, String stereo)
    {
		ClassStereotype cs = ClassStereotype.getByName(stereo);
		if(cs==null){
			if(elem instanceof RefOntoUML.Kind) cs = ClassStereotype.KIND;
			if(elem instanceof RefOntoUML.Quantity) cs = ClassStereotype.QUANTITY;
			if(elem instanceof RefOntoUML.Collective) cs = ClassStereotype.COLLECTIVE;
			if(elem instanceof RefOntoUML.SubKind) cs = ClassStereotype.SUB_KIND;
			if(elem instanceof RefOntoUML.Phase) cs = ClassStereotype.PHASE;
			if(elem instanceof RefOntoUML.Role) cs = ClassStereotype.ROLE;
			if(elem instanceof RefOntoUML.RoleMixin) cs = ClassStereotype.ROLE_MIXIN;            			
			if(elem instanceof RefOntoUML.Category) cs = ClassStereotype.CATEGORY;
			if(elem instanceof RefOntoUML.Mixin) cs = ClassStereotype.MIXIN;
			if(elem instanceof RefOntoUML.Relator) cs = ClassStereotype.RELATOR;
			if(elem instanceof RefOntoUML.Mode) cs = ClassStereotype.MODE;
			if(elem instanceof RefOntoUML.PerceivableQuality) cs = ClassStereotype.QUALITY;
			if(elem instanceof RefOntoUML.NonPerceivableQuality) cs = ClassStereotype.QUALITY;
			if(elem instanceof RefOntoUML.NominalQuality) cs = ClassStereotype.QUALITY;            			
		}
		return cs;
    }
	 
	public static RelationshipStereotype getRelationshipStereotypeByName(EObject elem, String stereo)
    {
		RelationshipStereotype cs = RelationshipStereotype.getByName(stereo);
		if(cs==null){
			if(elem instanceof RefOntoUML.Derivation) cs = RelationshipStereotype.DERIVATION;
			if(elem instanceof RefOntoUML.Characterization) cs = RelationshipStereotype.CHARACTERIZATION;
			if(elem instanceof RefOntoUML.Mediation) cs = RelationshipStereotype.MEDIATION;
			if(elem instanceof RefOntoUML.MaterialAssociation) cs = RelationshipStereotype.MATERIAL;
			if(elem instanceof RefOntoUML.FormalAssociation) cs = RelationshipStereotype.FORMAL;
			if(elem instanceof RefOntoUML.componentOf) cs = RelationshipStereotype.COMPONENT_OF;
			if(elem instanceof RefOntoUML.subCollectionOf) cs = RelationshipStereotype.SUB_COLLECTION_OF;            			
			if(elem instanceof RefOntoUML.subQuantityOf) cs = RelationshipStereotype.SUB_QUANTITY_OF;
			if(elem instanceof RefOntoUML.memberOf) cs = RelationshipStereotype.MEMBER_OF;			            			
			if(elem instanceof RefOntoUML.Structuration) cs = RelationshipStereotype.STRUCTURATION;
		}
		return cs;
    }
	
	public static DataTypeStereotype getDataTypeStereotypeByName(EObject elem, String stereo)
    {
    	DataTypeStereotype cs = DataTypeStereotype.getByName(stereo);
		if(cs==null){
			if(elem instanceof RefOntoUML.Enumeration) cs = DataTypeStereotype.ENUMERATION;
			if(elem instanceof RefOntoUML.StringNominalStructure) cs = DataTypeStereotype.DIMENSION;
			if(elem instanceof RefOntoUML.DecimalIntervalDimension) cs = DataTypeStereotype.DIMENSION;
			if(elem instanceof RefOntoUML.DecimalOrdinalDimension) cs = DataTypeStereotype.DIMENSION;
			if(elem instanceof RefOntoUML.DecimalRationalDimension) cs = DataTypeStereotype.DIMENSION;
			if(elem instanceof RefOntoUML.IntegerIntervalDimension) cs = DataTypeStereotype.DIMENSION;
			if(elem instanceof RefOntoUML.IntegerOrdinalDimension) cs = DataTypeStereotype.DIMENSION;
			if(elem instanceof RefOntoUML.IntegerRationalDimension) cs = DataTypeStereotype.DIMENSION;            			
			if(elem instanceof RefOntoUML.MeasurementDomain) cs = DataTypeStereotype.DOMAIN;
			if(elem instanceof RefOntoUML.DataType && !(elem instanceof RefOntoUML.PrimitiveType)) cs = DataTypeStereotype.DATA_TYPE;			            			
		}
		return cs;
    }
    
    public static String getRefStereotype(EObject element)
    {
		String type = element.getClass().toString().replaceAll("class RefOntoUML.impl.","");
	    type = type.replaceAll("Impl","");
	    type = Normalizer.normalize(type, Normalizer.Form.NFD);	    
	    if (!type.equalsIgnoreCase("association")) type = type.replace("Association","");	    
	    return type;
	}
    
	public static PrimitiveStereotype getPrimitiveStereotypeByName(RefOntoUML.PrimitiveType elem)
    {
    	PrimitiveStereotype ps = PrimitiveStereotype.getByName(elem.getName());
		if(ps==null && elem.getName()!=null){
			if(elem.getName().compareToIgnoreCase("Integer")==0) ps = PrimitiveStereotype.INTEGER;            			
			if(elem.getName().compareToIgnoreCase("int")==0) ps = PrimitiveStereotype.INTEGER;
			if(elem.getName().compareToIgnoreCase("Boolean")==0) ps = PrimitiveStereotype.BOOLEAN;			
			if(elem.getName().compareToIgnoreCase("Real")==0) ps = PrimitiveStereotype.REAL;
			if(elem.getName().compareToIgnoreCase("String")==0) ps = PrimitiveStereotype.STRING;
			if(elem.getName().compareToIgnoreCase("Date")==0) ps = PrimitiveStereotype.DATE;
			if(elem.getName().compareToIgnoreCase("DateTime")==0) ps = PrimitiveStereotype.DATE_TIME;
		}
		return ps;
    }
 
	public static List<RefOntoUML.Property> getAllAttributes(RefOntoUML.Package refpack)
    {
    	List<RefOntoUML.Property> refattributes = new ArrayList<RefOntoUML.Property>();
		for (EObject elem : refpack.eContents())
        {
            if (elem instanceof RefOntoUML.Class)
            {
            	for(RefOntoUML.Property refAttr: ((RefOntoUML.Class)elem).getOwnedAttribute()){
            		if(refAttr.getType() instanceof RefOntoUML.PrimitiveType){
            			refattributes.add(refAttr);   	            			
            		}
            	}   	           			                
            }            
            if (elem instanceof RefOntoUML.DataType)
            {	   	            	
            	for(RefOntoUML.Property refAttr: ((RefOntoUML.DataType)elem).getOwnedAttribute()){
            		if(refAttr.getType() instanceof RefOntoUML.PrimitiveType){
            			refattributes.add(refAttr);
            		}
            	}   	           			                
            }
        }
		return refattributes;
    }
	
	public static List<RefOntoUML.Property> getAllEndPoints(RefOntoUML.Package refpack)
    {
    	List<RefOntoUML.Property> endpoints = new ArrayList<RefOntoUML.Property>();
		for (EObject elem : refpack.eContents())
        {
            if (elem instanceof RefOntoUML.Association)
            {
            	for(RefOntoUML.Property endpoint: ((RefOntoUML.Association)elem).getMemberEnd()){
            		endpoints.add(endpoint);   	            			
            	}            	   	           			                
            }            
        }
		return endpoints;
    }	
}
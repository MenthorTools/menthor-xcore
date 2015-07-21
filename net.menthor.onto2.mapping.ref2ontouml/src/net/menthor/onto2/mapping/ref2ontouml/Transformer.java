package net.menthor.onto2.mapping.ref2ontouml;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import net.menthor.onto2.ontouml.Attribute;
import net.menthor.onto2.ontouml.Class;
import net.menthor.onto2.ontouml.ClassStereotype;
import net.menthor.onto2.ontouml.Container;
import net.menthor.onto2.ontouml.DataType;
import net.menthor.onto2.ontouml.DataTypeStereotype;
import net.menthor.onto2.ontouml.Literal;
import net.menthor.onto2.ontouml.Measurement;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.Package;
import net.menthor.onto2.ontouml.PrimitiveStereotype;
import net.menthor.onto2.ontouml.QualityNature;
import net.menthor.onto2.ontouml.Scale;
import net.menthor.onto2.ontouml.Type;
import net.menthor.onto2.ontouml.util.OntoumlFactoryUtil;

public class Transformer {
		
	private HashMap <RefOntoUML.Package, Container> packagesMap;
	private HashMap <RefOntoUML.Type, Type> typesMap;
	private HashMap <RefOntoUML.Property, Attribute> attributesMap;
	
	private RefOntoUML.Package refmodel;
	private Model ontomodel;
	
	public Model getResult() { return ontomodel; }
	
	public Transformer(RefOntoUML.Package refmodel)
	{
		packagesMap = new HashMap<RefOntoUML.Package,Container>();
		typesMap = new HashMap <RefOntoUML.Type, Type>();		
		attributesMap = new HashMap <RefOntoUML.Property, Attribute>();
		
		this.ontomodel = OntoumlFactoryUtil.createModel(refmodel.getName());
		this.refmodel = refmodel;
		
		packagesMap.put(refmodel, ontomodel);
	}
	
	public Model run()
	{
		runPackages(refmodel,ontomodel);
		runClasses();
		runDataTypes();
		runAttributes();
		
		return ontomodel;
	}
	
    public void runPackages (RefOntoUML.Package refmodel, Container ontomodel)
    {               
        for (EObject obj : refmodel.eContents())
        { 
            if((obj instanceof RefOntoUML.Package))
            {   
        		String name = ((RefOntoUML.Package)obj).getName();
        		
        		/**create package */
        		Package ontopack = OntoumlFactoryUtil.createPackage(name, ontomodel);
        		
        		packagesMap.put((RefOntoUML.Package)obj, ontopack);
        		runPackages((RefOntoUML.Package)obj,ontopack);
            }
        }
	}

    public ClassStereotype getClassStereotypeByName(EObject elem, String stereo)
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
    
    public DataTypeStereotype getDataTypeStereotypeByName(EObject elem, String stereo)
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
    
    public String getRefStereotype(EObject element)
    {
		String type = element.getClass().toString().replaceAll("class RefOntoUML.impl.","");
	    type = type.replaceAll("Impl","");
	    type = Normalizer.normalize(type, Normalizer.Form.NFD);	    
	    if (!type.equalsIgnoreCase("association")) type = type.replace("Association","");	    
	    return type;
	}
    
    public void runClasses()
	{
		for (EObject obj: packagesMap.keySet())
		{
			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;
			Container pack = packagesMap.get((RefOntoUML.Package)obj);			
	        
			for (EObject elem : refpack.eContents())
	        {        	
	            if(elem instanceof RefOntoUML.Class)
	            {
	            	boolean isAbstract = ((RefOntoUML.Class)elem).isIsAbstract();
            		String name = ((RefOntoUML.Class)elem).getName();
            		String stereo = getRefStereotype(elem);
            		
            		ClassStereotype cs = getClassStereotypeByName(elem, stereo);
            		
            		Class ontoclass = OntoumlFactoryUtil.createClass(cs, name, pack);
            		pack.getElements().add(ontoclass);
            		
            		ontoclass.setIsAbstract(isAbstract);
            		/**qualities*/
            		if(elem instanceof RefOntoUML.PerceivableQuality) ontoclass.setQualityNature(QualityNature.PERCEIVABLE);
            		if(elem instanceof RefOntoUML.NonPerceivableQuality) ontoclass.setQualityNature(QualityNature.NON_PERCEIVABLE);
            		if(elem instanceof RefOntoUML.NominalQuality) ontoclass.setQualityNature(QualityNature.NOMINAL);
            		/**collectives*/
        			if(elem instanceof RefOntoUML.Collective) ontoclass.setIsExtensional(((RefOntoUML.Collective)elem).isIsExtensional());
        			
        			typesMap.put((RefOntoUML.Class)elem, ontoclass);
	            }
	        }
		}			        
	}
    
    public void runDataTypes()
   	{
   		for (EObject obj: packagesMap.keySet())
   		{
   			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;
   			Container pack = packagesMap.get((RefOntoUML.Package)obj);			
   	        
   			for (EObject elem : refpack.eContents())
   	        {        
   				if(elem instanceof RefOntoUML.PrimitiveType) continue;
   				if(elem instanceof RefOntoUML.DataType)  
	            {
               		String name = ((RefOntoUML.DataType)elem).getName();
               		String stereo = getRefStereotype(elem);
               		
               		DataTypeStereotype cs = getDataTypeStereotypeByName(elem, stereo);
               		
               		DataType ontodatatype = OntoumlFactoryUtil.createDataType(cs, name, pack);
               		pack.getElements().add(ontodatatype);
               		
               		/**dimensions*/
               		if(elem instanceof RefOntoUML.MeasurementDimension){
               			ontodatatype.setUnitOfMeasure(((RefOntoUML.MeasurementDimension)elem).getUnitOfMeasure());
               		}
               		if(elem instanceof RefOntoUML.IntegerIntervalDimension) {
               			ontodatatype.setScale(Scale.INTERVAL);
               			ontodatatype.setMeasurement(Measurement.INTEGER);
               		}
               		if(elem instanceof RefOntoUML.IntegerOrdinalDimension) {
               			ontodatatype.setScale(Scale.ORDINAL);
               			ontodatatype.setMeasurement(Measurement.INTEGER);
               		}
               		if(elem instanceof RefOntoUML.IntegerRationalDimension) {
               			ontodatatype.setScale(Scale.RATIONAL);
               			ontodatatype.setMeasurement(Measurement.INTEGER);
               		}
               		if(elem instanceof RefOntoUML.DecimalIntervalDimension) {
               			ontodatatype.setScale(Scale.INTERVAL);
               			ontodatatype.setMeasurement(Measurement.DECIMAL);
               		}
               		if(elem instanceof RefOntoUML.DecimalOrdinalDimension) {
               			ontodatatype.setScale(Scale.ORDINAL);
               			ontodatatype.setMeasurement(Measurement.DECIMAL);
               		}
               		if(elem instanceof RefOntoUML.DecimalRationalDimension) {               			
               			ontodatatype.setScale(Scale.RATIONAL);               			
               			ontodatatype.setMeasurement(Measurement.DECIMAL);
               		}
               		/**enumerations*/
               		if(elem instanceof RefOntoUML.Enumeration){
               			for(RefOntoUML.EnumerationLiteral lt: ((RefOntoUML.Enumeration)elem).getOwnedLiteral()){
               				Literal ontoLit = OntoumlFactoryUtil.createLiteral(lt.getName());
               				ontodatatype.getLiterals().add(ontoLit);
               				ontoLit.setOwner(ontodatatype);
               			}               			
               		}
               		typesMap.put((RefOntoUML.DataType)elem, ontodatatype);
   	            }
   	        }
   		}			        
   	}
    
    public PrimitiveStereotype getPrimitiveStereotypeByName(RefOntoUML.PrimitiveType elem)
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
    
    public List<RefOntoUML.Property> getAllAttributes(RefOntoUML.Package refpack)
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
    
   	public void runAttributes()
   	{
   		for (EObject obj: packagesMap.keySet())
   		{
   			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;   			   			
   			List<RefOntoUML.Property> refattributes = getAllAttributes(refpack);
   			
   			for(RefOntoUML.Property refAttr: refattributes)
   			{
   				Type ontotype = typesMap.get(refAttr.eContainer());   				
   				PrimitiveStereotype ps = getPrimitiveStereotypeByName((RefOntoUML.PrimitiveType)refAttr.getType());
   	   			int lower = refAttr.getLower();
   	   			int upper = refAttr.getUpper();
   	   			String name = refAttr.getName();
   	   			boolean isDerived = refAttr.isIsDerived();
   	   			boolean isDependency = refAttr.isIsReadOnly();   	   			
   	   			Attribute ontoattr = OntoumlFactoryUtil.createAttribute(ontotype, ps, lower, upper, name, isDerived, isDependency);  	
   	   			attributesMap.put(refAttr, ontoattr);
   			}
   		}			        
   	}	
}

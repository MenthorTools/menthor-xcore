package net.menthor.onto2.mapping.ref2ontouml;

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
import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.Generalization;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.Literal;
import net.menthor.onto2.ontouml.Measurement;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.Package;
import net.menthor.onto2.ontouml.PrimitiveStereotype;
import net.menthor.onto2.ontouml.QualityNature;
import net.menthor.onto2.ontouml.Relationship;
import net.menthor.onto2.ontouml.RelationshipStereotype;
import net.menthor.onto2.ontouml.Scale;
import net.menthor.onto2.ontouml.Type;
import net.menthor.onto2.ontouml.util.OntoumlFactoryUtil;

public class Transformer {
		
	/**maps*/
	private HashMap <RefOntoUML.Package, Container> packagesMap;
	private HashMap <RefOntoUML.Type, Type> typesMap;		
	private HashMap <RefOntoUML.Association, Relationship> relationshipsMap;
	private HashMap <RefOntoUML.Property, Attribute> attributesMap;
	private HashMap <RefOntoUML.Property, EndPoint> endpointsMap;
	private HashMap <RefOntoUML.Generalization, Generalization> gensMap;
	private HashMap <RefOntoUML.GeneralizationSet, GeneralizationSet> genSetsMap;
	
	/**models*/
	private RefOntoUML.Package refmodel;
	private Model ontomodel;

	/**getters*/
	public HashMap <RefOntoUML.Package, Container> getPackagesMap() { return packagesMap; }
	public HashMap <RefOntoUML.Type, Type>getTypesMap() { return typesMap; }
	public HashMap <RefOntoUML.Association, Relationship> getRelationshipsMap() { return relationshipsMap; }
	public HashMap <RefOntoUML.Property, Attribute> getAttributesMap() { return attributesMap; }
	public HashMap <RefOntoUML.Property, EndPoint> getEndPointsMap() { return endpointsMap; }
	public HashMap <RefOntoUML.Generalization, Generalization> getGeneralizationsMap() { return gensMap; }
	public HashMap <RefOntoUML.GeneralizationSet, GeneralizationSet>getGenSetsMap() { return genSetsMap; }
	public Model getResult() { return ontomodel; }
	
	/**constructor*/
	public Transformer(RefOntoUML.Package refmodel)
	{
		packagesMap = new HashMap<RefOntoUML.Package,Container>();
		typesMap = new HashMap <RefOntoUML.Type, Type>();		
		relationshipsMap = new HashMap <RefOntoUML.Association, Relationship>();
		attributesMap = new HashMap <RefOntoUML.Property, Attribute>();
		endpointsMap = new HashMap <RefOntoUML.Property, EndPoint>();
		genSetsMap = new HashMap <RefOntoUML.GeneralizationSet, GeneralizationSet>();
		gensMap = new HashMap <RefOntoUML.Generalization, Generalization>();
		
		this.ontomodel = OntoumlFactoryUtil.createModel(refmodel.getName());
		this.refmodel = refmodel;
		
		packagesMap.put(refmodel, ontomodel);
	}
	
	/**run*/
	public Model run()
	{
		runPackages(refmodel,ontomodel);
		runClasses();
		runDataTypes();
		runRelationships();
		runAttributes();
		runEndPoints();
		runSubsetsAndRedefines();
		runGeneralizations();
		runGeneralizationSets();
		return ontomodel;
	}
	
	/**packages*/
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
    
    /**classes*/
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
            		String stereo = TransformerUtil.getRefStereotype(elem);            		
            		ClassStereotype cs = TransformerUtil.getClassStereotypeByName(elem, stereo);
            		
            		/**create class*/
            		Class ontoclass = OntoumlFactoryUtil.createClass(cs, name, isAbstract, pack);            		            		
            		if(elem instanceof RefOntoUML.PerceivableQuality) ontoclass.setQualityNature(QualityNature.PERCEIVABLE);
            		else if(elem instanceof RefOntoUML.NonPerceivableQuality) ontoclass.setQualityNature(QualityNature.NON_PERCEIVABLE);
            		else if(elem instanceof RefOntoUML.NominalQuality) ontoclass.setQualityNature(QualityNature.NOMINAL);
        			if(elem instanceof RefOntoUML.Collective) ontoclass.setIsExtensional(((RefOntoUML.Collective)elem).isIsExtensional());
        			
        			typesMap.put((RefOntoUML.Class)elem, ontoclass);
	            }
	        }
		}			        
	}
        	
	/**relationships*/
   	public void runRelationships()
	{
		for (EObject obj: packagesMap.keySet())
		{
			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;
			Container pack = packagesMap.get((RefOntoUML.Package)obj);			
	        
			for (EObject elem : refpack.eContents())
	        {
				if(elem instanceof RefOntoUML.Association)
				{
					String name = ((RefOntoUML.Association)elem).getName();
					String stereo = TransformerUtil.getRefStereotype(elem);						
					RelationshipStereotype rs = TransformerUtil.getRelationshipStereotypeByName(elem, stereo);
					
					/**create relationship*/
					Relationship ontorel = OntoumlFactoryUtil.createRelationship(rs, name, pack);
            		
            		relationshipsMap.put((RefOntoUML.Association)elem, ontorel);
				}
	        }
		
		}
	}

    /**datatypes*/
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
               		String stereo = TransformerUtil.getRefStereotype(elem);               		
               		DataTypeStereotype cs = TransformerUtil.getDataTypeStereotypeByName(elem, stereo);
               		
               		/**create datatype*/
               		DataType ontodatatype = OntoumlFactoryUtil.createDataType(cs, name, pack);
               		
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
        
    /**attributes*/
   	public void runAttributes()
   	{
   		for (EObject obj: packagesMap.keySet())
   		{
   			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;   			   			
   			List<RefOntoUML.Property> refattributes = TransformerUtil.getAllAttributes(refpack);
   			
   			for(RefOntoUML.Property refAttr: refattributes)
   			{
   				Type ontotype = typesMap.get(refAttr.eContainer());   				
   				PrimitiveStereotype ps = TransformerUtil.getPrimitiveStereotypeByName((RefOntoUML.PrimitiveType)refAttr.getType());
   	   			int lower = refAttr.getLower();
   	   			int upper = refAttr.getUpper();
   	   			String name = refAttr.getName();
   	   			boolean isDerived = refAttr.isIsDerived();
   	   			boolean isDependency = refAttr.isIsReadOnly();
   	   			
   	   			/**create attribute*/
   	   			Attribute ontoattr = OntoumlFactoryUtil.createAttribute(ontotype, ps, lower, upper, name, isDerived, isDependency);
   	   			
   	   			attributesMap.put(refAttr, ontoattr);
   			}
   		}			        
   	}
   	
    /**endpoints*/
   	public void runEndPoints()
   	{
   		for (EObject obj: packagesMap.keySet())
   		{
   			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;   			   			
   			List<RefOntoUML.Property> endpoints = TransformerUtil.getAllEndPoints(refpack);
   			
   			for(RefOntoUML.Property ep: endpoints)
   			{
   				Relationship rel = relationshipsMap.get(ep.getAssociation());   				
   				Type ontotype = typesMap.get(ep.getType());   				
   	   			int lower = ep.getLower();
   	   			int upper = ep.getUpper();
   	   			String name = ep.getName();
   	   			boolean isDerived = ep.isIsDerived();
   	   			boolean isDependency = ep.isIsReadOnly();
   	   			
   	   			/**create endpoint*/
   	   			EndPoint ontopoint = OntoumlFactoryUtil.createEndPoint(rel, ontotype, lower, upper, name, isDerived, isDependency);  	
   	   			
   	   			endpointsMap.put(ep, ontopoint);
   			}
   		}
   	}
   	
   	/**subsetting and redefining*/
   	public void runSubsetsAndRedefines(){
		for (EObject obj: packagesMap.keySet())
   		{
   			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;   			   			
   			List<RefOntoUML.Property> endpoints = TransformerUtil.getAllEndPoints(refpack);
   			
   			for(RefOntoUML.Property ep: endpoints)
   			{
   				EndPoint newEP = endpointsMap.get(ep);
   				for(RefOntoUML.Property subsetted: ep.getSubsettedProperty()){
   					if(newEP!=null) newEP.getSubsets().add(endpointsMap.get(subsetted));   					
   				}
   				for(RefOntoUML.Property redefined: ep.getRedefinedProperty()){
   					if(newEP!=null) newEP.getRedefines().add(endpointsMap.get(redefined));   					
   				}
   			}
   		}
	}
   	
   	/**generalizations*/
   	public void runGeneralizations()
   	{
		for (EObject obj: packagesMap.keySet())
		{
			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;
			Container pack = packagesMap.get((RefOntoUML.Package)obj);			
	        
			for (EObject elem : refpack.eContents())
	        {
				if(elem instanceof RefOntoUML.Classifier)
				{
					for(RefOntoUML.Generalization g: ((RefOntoUML.Classifier)elem).getGeneralization())
					{
						RefOntoUML.Classifier general = g.getGeneral();
						RefOntoUML.Classifier specific = g.getSpecific();
						Type ontogeneral = typesMap.get(general);
						Type ontospecific = typesMap.get(specific);
						
						/**create generalization*/
						Generalization ontog = OntoumlFactoryUtil.createGeneralization(ontogeneral, ontospecific, pack);
	            	                	    
	            		gensMap.put(g, ontog);
					}
				}
	        }
		}   		
   	}
   	
   	/**generalization sets*/
	public void runGeneralizationSets()
   	{
		for (EObject obj: packagesMap.keySet())
		{
			RefOntoUML.Package refpack = (RefOntoUML.Package)obj;
			Container pack = packagesMap.get((RefOntoUML.Package)obj);			
	        
			for (EObject elem : refpack.eContents())
	        {
				if(elem instanceof RefOntoUML.GeneralizationSet)
				{
					String name = ((RefOntoUML.GeneralizationSet)elem).getName();
					boolean isCovering = ((RefOntoUML.GeneralizationSet)elem).isIsCovering();
					boolean isDisjoint = ((RefOntoUML.GeneralizationSet)elem).isIsDisjoint();
					List<RefOntoUML.Generalization> refgens = ((RefOntoUML.GeneralizationSet)elem).getGeneralization();					
					List<Generalization> gens = new ArrayList<Generalization>();
					for(RefOntoUML.Generalization g: refgens){
						if(gensMap.get(g)!=null) gens.add(gensMap.get(g));
					}					
										
					/**create generalization set*/
					GeneralizationSet ontogs = OntoumlFactoryUtil.createGeneralizationSet(name, isCovering, isDisjoint, gens, pack);
            		            		
            		genSetsMap.put((RefOntoUML.GeneralizationSet)elem, ontogs);
				}
	        }
		}
   	}   
}

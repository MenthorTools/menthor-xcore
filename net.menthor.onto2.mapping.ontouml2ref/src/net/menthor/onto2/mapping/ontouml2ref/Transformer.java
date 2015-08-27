package net.menthor.onto2.mapping.ontouml2ref;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import net.menthor.onto2.ontouml.Attribute;
import net.menthor.onto2.ontouml.Class;
import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.Container;
import net.menthor.onto2.ontouml.DataType;
import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.Generalization;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.Literal;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.Relationship;
import net.menthor.onto2.ontouml.Type;

public class Transformer {
		
	/**maps*/
	private HashMap <Container, RefOntoUML.Package> packagesMap;
	private HashMap <Type, RefOntoUML.Type> typesMap;		
	private HashMap <Relationship, RefOntoUML.Association> relationshipsMap;
	private HashMap <Attribute, RefOntoUML.Property> attributesMap;
	private HashMap <EndPoint, RefOntoUML.Property> endpointsMap;
	private HashMap <Generalization, RefOntoUML.Generalization> gensMap;
	private HashMap <GeneralizationSet, RefOntoUML.GeneralizationSet> genSetsMap;
	
	/**models*/
	private RefOntoUML.Model refmodel;
	private Model ontomodel;

	/**ref factory*/
	public static RefOntoUML.RefOntoUMLFactory factory = RefOntoUML.RefOntoUMLFactory.eINSTANCE;
	
	/**getters*/
	public HashMap <Container, RefOntoUML.Package> getPackagesMap() { return packagesMap; }
	public HashMap <Type, RefOntoUML.Type>getTypesMap() { return typesMap; }
	public HashMap <Relationship, RefOntoUML.Association> getRelationshipsMap() { return relationshipsMap; }
	public HashMap <Attribute, RefOntoUML.Property> getAttributesMap() { return attributesMap; }
	public HashMap <EndPoint, RefOntoUML.Property> getEndPointsMap() { return endpointsMap; }
	public HashMap <Generalization, RefOntoUML.Generalization> getGeneralizationsMap() { return gensMap; }
	public HashMap <GeneralizationSet, RefOntoUML.GeneralizationSet>getGenSetsMap() { return genSetsMap; }
	public RefOntoUML.Model getResult() { return refmodel; }
	
	/**constructor*/
	public Transformer(Model ontomodel)
	{
		packagesMap = new HashMap<Container, RefOntoUML.Package>();
		typesMap = new HashMap <Type, RefOntoUML.Type>();		
		relationshipsMap = new HashMap <Relationship, RefOntoUML.Association>();
		attributesMap = new HashMap <Attribute, RefOntoUML.Property>();
		endpointsMap = new HashMap <EndPoint, RefOntoUML.Property>();
		genSetsMap = new HashMap <GeneralizationSet, RefOntoUML.GeneralizationSet>();
		gensMap = new HashMap <Generalization, RefOntoUML.Generalization>();
		
		this.ontomodel = ontomodel;
		this.refmodel = factory.createModel();
		refmodel.setName(ontomodel.getName());
		
		packagesMap.put(ontomodel,refmodel);
	}
	
	/**run*/
	public RefOntoUML.Model run()
	{
		runPackages(ontomodel, refmodel);
		runClasses();
		runDataTypes();
		runRelationships();
		runAttributes();
		runEndPoints();
		runSubsetsAndRedefines();
		runGeneralizations();
		runGeneralizationSets();
		return refmodel;
	}
	
	/**packages*/
    public void runPackages (Container ontomodel,RefOntoUML.Package refmodel)
    {               
        for (EObject obj : ontomodel.getElements())
        { 
            if((obj instanceof Container))
            {   
        		String name = ((Container)obj).getName();
        		
        		/**create package */
        		RefOntoUML.Package refpack = factory.createPackage();
        		refpack.setName(name);
        		refmodel.getPackagedElement().add(refpack);
        		
        		packagesMap.put((Container)obj, refpack);
        		runPackages((Container)obj,refpack);
            }
        }
	}
    
    /**classes*/
    public void runClasses()
	{
		for (EObject obj: packagesMap.keySet())
		{
			Container ontopack = (Container)obj;
			RefOntoUML.Package refpack = packagesMap.get((Container)obj);			
	        
			for (EObject elem : ontopack.getElements())
	        {        	
	            if(elem instanceof Class)
	            {	
	            	boolean isExtensional = ((Class)elem).isIsExtensional();
	            	
	            	/**create ref class*/
	            	RefOntoUML.Class refClass=null; 
	            	if(((Class)elem).isKind()) refClass = factory.createKind();
	            	else if(((Class)elem).isSubKind()) refClass = factory.createSubKind();
	            	else if(((Class)elem).isCollective()) {
	            		refClass = factory.createCollective();
	            		((RefOntoUML.Collective)refClass).setIsExtensional(isExtensional);
	            	}
	            	else if(((Class)elem).isQuantity()) refClass = factory.createQuantity();
	            	else if(((Class)elem).isRole()) refClass = factory.createRole();
	            	else if(((Class)elem).isPhase()) refClass = factory.createPhase();
	            	else if(((Class)elem).isRelator()) refClass = factory.createRelator();
	            	else if(((Class)elem).isMode()) refClass = factory.createMode();
	            	else if(((Class)elem).isPerceivableQuality()) refClass = factory.createPerceivableQuality();
	            	else if(((Class)elem).isNonPerceivableQuality()) refClass = factory.createNonPerceivableQuality();
	            	else if(((Class)elem).isNominalQuality()) refClass = factory.createNominalQuality();
	            	else if(((Class)elem).isCategory()) refClass = factory.createCategory();
	            	else if(((Class)elem).isRoleMixin()) refClass = factory.createRoleMixin();
	            	else if(((Class)elem).isPhaseMixin()) refClass = factory.createPhase();
	            	else if(((Class)elem).isMixin()) refClass = factory.createMixin();
	            	else refClass = factory.createClass();
	            	
            		if(refClass!=null) {
            			String name = ((Class)elem).getName();
    	            	boolean isAbstract = ((Class)elem).isIsAbstract();
            			refClass.setName(name);            			
            			refClass.setIsAbstract(isAbstract);
            			refpack.getPackagedElement().add(refClass);
            		}
            		
        			typesMap.put((Class)elem, refClass);
	            }
	        }
		}			        
	}

    /**datatypes*/
    public void runDataTypes()
   	{
   		for (EObject obj: packagesMap.keySet())
   		{
   			Container ontopack = (Container)obj;
   			RefOntoUML.Package refpack = packagesMap.get(ontopack);			
   	        
   			for (EObject elem : ontopack.getElements())
   	        {   
   				if(elem instanceof DataType)  
	            {	
               		/**create ref datatype*/
               		EObject refdatatype=null;
               		if(((DataType)elem).isDimension())
               		{
               			if(((DataType)elem).isIntervalDecimal()) refdatatype = factory.createDecimalIntervalDimension();
               			if(((DataType)elem).isIntervalInteger()) refdatatype = factory.createIntegerIntervalDimension();
               			if(((DataType)elem).isRationalInteger()) refdatatype = factory.createIntegerRationalDimension();
               			if(((DataType)elem).isRationalDecimal()) refdatatype = factory.createDecimalRationalDimension();
               			if(((DataType)elem).isOrdinalDecimal()) refdatatype = factory.createDecimalOrdinalDimension();
               			if(((DataType)elem).isOrdinalInteger()) refdatatype = factory.createIntegerOrdinalDimension();
               			if(((DataType)elem).isNominalString()) refdatatype = factory.createStringNominalStructure();
               			((RefOntoUML.MeasurementDimension)refdatatype).setUnitOfMeasure(((DataType)elem).getUnitOfMeasure());               			
               		}
               		else if(((DataType)elem).isDomain())
               		{
               			refdatatype = factory.createMeasurementDomain(); 
               		}
               		else if(((DataType)elem).isEnumeration())
               		{
               			refdatatype = factory.createEnumeration();
               			for(Literal ontolit: ((DataType)elem).getLiterals())
               			{
               				RefOntoUML.EnumerationLiteral lit = factory.createEnumerationLiteral();
               				lit.setName(ontolit.getValue());
               				((RefOntoUML.Enumeration)refdatatype).getOwnedLiteral().add(lit);
               				lit.setEnumeration(((RefOntoUML.Enumeration)refdatatype));
               			}
               		} 
               		else if(((DataType)elem).isDataType()) refdatatype = factory.createDataType();
               		else refdatatype = factory.createDataType();
               		
               		if(refdatatype!=null) {
               			String name = ((DataType)elem).getName();
               			((RefOntoUML.Type)refdatatype).setName(name);
               			refpack.getPackagedElement().add((RefOntoUML.Type)refdatatype);               			
               		}
               		
               		typesMap.put((DataType)elem, (RefOntoUML.Type)refdatatype);
   	            }
   	        }
   		}			        
   	}

	/**relationships*/
    public void runRelationships()
	{
	  	for (EObject obj: packagesMap.keySet())
 		{
 			Container ontopack = (Container)obj;
 			RefOntoUML.Package refpack = packagesMap.get(ontopack);			
 	        
 			for (EObject elem : ontopack.getElements())
 	        {   
				if(elem instanceof Relationship)
				{	
					/**create ref association*/
					RefOntoUML.Association refRel=null;
					if(((Relationship)elem).isCharacterization()) refRel = factory.createCharacterization();
					else if(((Relationship)elem).isMediation()) refRel = factory.createMediation();
					else if(((Relationship)elem).isDerivation()) refRel = factory.createDerivation();
					else if(((Relationship)elem).isFormal()) refRel = factory.createFormalAssociation();
					else if(((Relationship)elem).isMaterial()) refRel = factory.createMaterialAssociation();
					else if(((Relationship)elem).isComponentOf()) refRel = factory.createcomponentOf();
					else if(((Relationship)elem).isMemberOf()) refRel = factory.creatememberOf();
					else if(((Relationship)elem).isSubCollectionOf()) refRel = factory.createsubCollectionOf();
					else if(((Relationship)elem).isSubQuantityOf()) refRel = factory.createsubQuantityOf();
					else if(((Relationship)elem).isStructuration()) refRel = factory.createStructuration();
					else refRel = factory.createAssociation();
					
					if(refRel!=null){
						String name = ((Relationship)elem).getName();
						refRel.setName(name);
						refpack.getPackagedElement().add(refRel);
					}
            		
            		relationshipsMap.put((Relationship)elem, refRel);
				}
	        }
		}
	}
    
    /**attributes*/
   	public void runAttributes()
   	{
   		for (EObject obj: packagesMap.keySet())
 		{
 			Container ontopack = (Container)obj; 			   		
 			RefOntoUML.Package refpack = packagesMap.get(ontopack);
   			List<Attribute> attributes = TransformerUtil.getAllAttributes(ontopack);
   			
   			for(Attribute attr: attributes)
   			{	
   				int upper = attr.getUpperBound();
   				int lower = attr.getLowerBound();
   	   			boolean isDerived = attr.isIsDerived();
   	   			boolean isDependency = attr.isIsDependency();
   	   			String name = attr.getName();
   	   			   	   		
   	   			String primitiveName = new String();
				if(attr.isBoolean()) primitiveName="Boolean";
				if(attr.isInteger()) primitiveName="Integer";
				if(attr.isReal()) primitiveName="Real";
				if(attr.isString()) primitiveName="String";
				if(attr.isDate()) primitiveName="Date";
				if(attr.isDateTime()) primitiveName="DateTime";
				
   				/**create attribute*/
   				RefOntoUML.Property refAttr=factory.createProperty();
   				RefOntoUML.LiteralInteger lowerBound = factory.createLiteralInteger();
   				RefOntoUML.LiteralUnlimitedNatural upperBound = factory.createLiteralUnlimitedNatural();
   				lowerBound.setValue(lower);   				
   				upperBound.setValue(upper);
   				refAttr.setLowerValue(lowerBound);
   				refAttr.setUpperValue(upperBound);
   				refAttr.setIsDerived(isDerived);
   				refAttr.setIsReadOnly(isDependency);
   				refAttr.setName(name);
   				
   				RefOntoUML.PrimitiveType primitiveType = factory.createPrimitiveType();
   				primitiveType.setName(primitiveName);
   				refAttr.setType(primitiveType);
   				refpack.getPackagedElement().add(primitiveType);
   				
   				RefOntoUML.Type reftype = typesMap.get(attr.getOwner());
   				if(reftype!=null){
   					if(reftype instanceof RefOntoUML.DataType) ((RefOntoUML.DataType)reftype).getOwnedAttribute().add(refAttr);
   					if(reftype instanceof RefOntoUML.Class) ((RefOntoUML.Class)reftype).getOwnedAttribute().add(refAttr);
   				}
   				
   	   			attributesMap.put(attr, refAttr);
   			}
   		}			        
   	}
   	
    /**endpoints*/
   	public void runEndPoints()
   	{
   		for (EObject obj: packagesMap.keySet())
   		{
   			Container ontopack = (Container)obj;   			   			
   			List<EndPoint> endpoints = TransformerUtil.getAllEndPoints(ontopack);
   			
   			for(EndPoint ep: endpoints)
   			{
   				int upper = ep.getUpperBound();
   				int lower = ep.getLowerBound();
   	   			boolean isDerived = ep.isIsDerived();
   	   			boolean isDependency = ep.isIsDependency();
   	   			String name = ep.getName();
   	   			RefOntoUML.Type endType = typesMap.get(ep.getEndType());
   	   			RefOntoUML.Association assoc = relationshipsMap.get(ep.getOwner());
   	   			
   	   			/**create endpoint*/
   				RefOntoUML.Property refEndPoint=factory.createProperty();
   				RefOntoUML.LiteralInteger lowerBound = factory.createLiteralInteger();
   				RefOntoUML.LiteralUnlimitedNatural upperBound = factory.createLiteralUnlimitedNatural();
   				lowerBound.setValue(lower);   				
   				upperBound.setValue(upper);
   				refEndPoint.setLowerValue(lowerBound);
   				refEndPoint.setUpperValue(upperBound);
   				refEndPoint.setIsDerived(isDerived);
   				refEndPoint.setIsReadOnly(isDependency);
   				refEndPoint.setName(name);
   				
   				refEndPoint.setType(endType);
   				refEndPoint.setAssociation(assoc);
   				
   				assoc.getMemberEnd().add(refEndPoint);
   				assoc.getOwnedEnd().add(refEndPoint);
   				assoc.getNavigableOwnedEnd().add(refEndPoint);
   				
   	   			endpointsMap.put(ep, refEndPoint);
   			}
   		}
   	}
   	
   	/**subsetting and redefining*/
   	public void runSubsetsAndRedefines(){
		for (EObject obj: packagesMap.keySet())
   		{
			Container ontopack = (Container)obj;   			   			
   			List<EndPoint> endpoints = TransformerUtil.getAllEndPoints(ontopack);
   			
   			for(EndPoint ep: endpoints)
   			{
   				RefOntoUML.Property newEP = endpointsMap.get(ep);
   				for(EndPoint subsetted: ep.getSubsets()){
   					if(newEP!=null) newEP.getSubsettedProperty().add(endpointsMap.get(subsetted));   					
   				}
   				for(EndPoint redefined: ep.getRedefines()){
   					if(newEP!=null) newEP.getRedefinedProperty().add(endpointsMap.get(redefined));   					
   				}
   			}
   		}
	}
   	
   	/**generalizations*/
   	public void runGeneralizations()
   	{
	  	for (EObject obj: packagesMap.keySet())
 		{
 			Container ontopack = (Container)obj; 						
 	        
 			for (EObject elem : ontopack.getElements())
 	        {   
				if(elem instanceof Generalization)
				{	
					Classifier general = ((Generalization)elem).getGeneral();
					Classifier specific = ((Generalization)elem).getSpecific();
					RefOntoUML.Classifier refGeneral = (RefOntoUML.Classifier)typesMap.get(general);
					RefOntoUML.Classifier refSpecific = (RefOntoUML.Classifier) typesMap.get(specific);
					
					/**create ref generalization*/
					RefOntoUML.Generalization refGen = factory.createGeneralization();
					if(refGeneral!=null) refGen.setGeneral(refGeneral);
					if(refSpecific!=null) refGen.setSpecific(refSpecific);
					refGeneral.getGeneralization().add(refGen);
					refSpecific.getGeneralization().add(refGen);
            		
					gensMap.put((Generalization)elem, refGen);					
				}
	        }
		}   		
   }
   	
   	/**generalization sets*/
	public void runGeneralizationSets()
   	{
	  	for (EObject obj: packagesMap.keySet())
 		{
 			Container ontopack = (Container)obj; 						
 			RefOntoUML.Package refpack = packagesMap.get(ontopack);
 			
 			for (EObject elem : ontopack.getElements())
 	        {   
				if(elem instanceof GeneralizationSet)
				{
					String name = ((GeneralizationSet)elem).getName();
					boolean isCovering = ((GeneralizationSet)elem).isIsCovering();
					boolean isDisjoint = ((GeneralizationSet)elem).isIsDisjoint();
					List<Generalization> gens = ((GeneralizationSet)elem).getGeneralizations();
					List<RefOntoUML.Generalization> refGens = new ArrayList<RefOntoUML.Generalization>();
					for(Generalization g: gens){
						if(gensMap.get(g)!=null) refGens.add(gensMap.get(g));
					}					
										
					/**create ref generalization set*/
					RefOntoUML.GeneralizationSet refGenSet = factory.createGeneralizationSet();
					refGenSet.setIsCovering(isCovering);
					refGenSet.setIsDisjoint(isDisjoint);
					refGenSet.setName(name);
					refGenSet.getGeneralization().addAll(refGens);
            		            	
					refpack.getPackagedElement().add(refGenSet);
					
            		genSetsMap.put((GeneralizationSet)elem, refGenSet);
				}
	        }
		}
   	}   
}

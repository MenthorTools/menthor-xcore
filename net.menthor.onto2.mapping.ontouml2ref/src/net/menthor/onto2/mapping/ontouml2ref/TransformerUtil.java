package net.menthor.onto2.mapping.ontouml2ref;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import RefOntoUML.util.RefOntoUMLResourceFactoryImpl;
import net.menthor.onto2.ontouml.Attribute;
import net.menthor.onto2.ontouml.Container;
import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.Relationship;
import net.menthor.onto2.ontouml.Type;

public class TransformerUtil {
	
	/** Save reference model to a resource. */	
	public static Resource saveRefModel(String refontoumlpath, RefOntoUML.Package refmodel) 
	{
		ResourceSet rset = new ResourceSetImpl();				
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("refontouml",new RefOntoUMLResourceFactoryImpl());
		rset.getPackageRegistry().put(RefOntoUML.RefOntoUMLPackage.eNS_URI,	RefOntoUML.RefOntoUMLPackage.eINSTANCE);
		URI fileURI = URI.createFileURI(refontoumlpath);    
	    final Resource resource = rset.createResource(fileURI);    	
	    resource.getContents().add(refmodel);    	
	    try{
	    	resource.save(Collections.emptyMap());
	    }catch(IOException e){
	    	e.printStackTrace();
	    }
	    return resource;		   	
	}
	
	public static List<Attribute> getAllAttributes(Container ontopak)
    {
    	List<Attribute> result = new ArrayList<Attribute>();
		for (EObject elem : ontopak.getElements())
        {
            if (elem instanceof Type)
            {
            	for(Attribute ontoAttr: ((Type)elem).getAttributes()){            		
        			result.add(ontoAttr);   	            			
        		}            	   	           			                
            }            
        }
		return result;
    }
	
	public static List<EndPoint> getAllEndPoints(Container ontopack)
    {
    	List<EndPoint> endpoints = new ArrayList<EndPoint>();
		for (EObject elem : ontopack.getElements())
        {
            if (elem instanceof Relationship)
            {
            	for(EndPoint endpoint: ((Relationship)elem).getEndPoints()){
            		endpoints.add(endpoint);   	            			
            	}            	   	           			                
            }            
        }
		return endpoints;
    }	
}
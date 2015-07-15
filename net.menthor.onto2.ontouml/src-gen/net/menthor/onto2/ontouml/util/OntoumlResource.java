package net.menthor.onto2.ontouml.util;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.OntoumlPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

public class OntoumlResource {

	/** Load model to a resource. */
	public static Resource load (String refontoumlpath) throws IOException
	{
		ResourceSet rset = new ResourceSetImpl();			
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mouml",new XMIResourceFactoryImpl());
		rset.getPackageRegistry().put(OntoumlPackage.eNS_URI,	OntoumlPackage.eINSTANCE);		
	    File file = new File(refontoumlpath);
		URI fileURI = URI.createFileURI(file.getAbsolutePath());		
		Resource resource = rset.createResource(fileURI);		
		/**Load options that significantly improved the performance of loading EMF Model instances*/
		Map<Object,Object> loadOptions = ((XMLResourceImpl)resource).getDefaultLoadOptions();
		//loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		//loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		resource.load(loadOptions);		
		return resource;		
	}
	
	/** Save model to a resource. */	
	public static Resource save (String refontoumlpath, Model refmodel) 
	{
		ResourceSet rset = new ResourceSetImpl();				
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mouml",new XMIResourceFactoryImpl());
		rset.getPackageRegistry().put(OntoumlPackage.eNS_URI,OntoumlPackage.eINSTANCE);
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
}

package net.menthor.onto2.ontouml.util;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.OntoumlPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

public class OntoumlResource {

	/** Load model to a resource. */
	public static Resource load (String ontoumlPath) throws IOException
	{	
		ResourceSet rset = new ResourceSetImpl();			
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mouml",new XMIResourceFactoryImpl());
		rset.getPackageRegistry().put(OntoumlPackage.eNS_URI,	OntoumlPackage.eINSTANCE);
	    File file = new File(ontoumlPath);
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
	public static Resource save (String ontoumlPath, Model ontomodel) throws IOException 
	{
		ResourceSet rset = new ResourceSetImpl();				
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mouml",new XMIResourceFactoryImpl());
		rset.getPackageRegistry().put(OntoumlPackage.eNS_URI,OntoumlPackage.eINSTANCE);
		URI fileURI = URI.createFileURI(ontoumlPath);    
	    final Resource resource = rset.createResource(fileURI);    	
	    resource.getContents().add(ontomodel);    	
    	resource.save(Collections.emptyMap());
	    return resource;		   	
	}
	
	public static EPackage readEcore (String ecorePath)
	{	
		ResourceSet ecoreResourceSet = new ResourceSetImpl();		
		URI ecoreURI = URI.createFileURI(ecorePath);		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ecoreResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ecoreResourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);				
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(ecoreResourceSet.getPackageRegistry());
		ecoreResourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,  extendedMetaData);		
	    Resource ecoreResource = ecoreResourceSet.getResource(ecoreURI,true);
	    EPackage ecoremodel = (EPackage) ecoreResource.getContents().get(0);	    
	    ecoreResource.getResourceSet().getPackageRegistry().put(ecoremodel.getNsURI(),ecoremodel);
	    EPackage.Registry.INSTANCE.put(ecoremodel.getNsURI(), ecoremodel);	    
	    return ecoremodel;
	}	
}

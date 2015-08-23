package net.menthor.onto2.ontouml.util;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.ocl.xtext.oclstdlib.OCLstdlibStandaloneSetup;

import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.OntoumlPackage;

public class OntoumlDiagnostician {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParserException, IOException{				
		OCLstdlibStandaloneSetup.doSetup();
		EssentialOCLStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		OCLstdlib.install(); 	
		System.out.println("OCL: Installed.");
		
		OntoumlPackage ontouml = OntoumlPackage.eINSTANCE;
		ResourceSet rset = new ResourceSetImpl();			
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mouml",new XMIResourceFactoryImpl());
		rset.getPackageRegistry().put(OntoumlPackage.eNS_URI,	OntoumlPackage.eINSTANCE);		
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		String ontoumlPath = "test/ontobio.mouml";
		File modelFile = new File(ontoumlPath);
		URI modelFileURI = URI.createFileURI(modelFile.getAbsolutePath());		
		EPackage.Registry.INSTANCE.put(modelFileURI.toString(), OntoumlPackage.eINSTANCE);		
		Resource modelResource = rset.createResource(modelFileURI);				
		modelResource.load(null);
		Model m = (Model) EcoreUtil.getObjectByType(modelResource.getContents(), OntoumlPackage.Literals.MODEL);
		System.out.println("Model: Load Complete.");
				
		String oclPath = "model/ontouml.ocl";
		File file = new File(oclPath);
		URI oclUri = URI.createFileURI(file.getAbsolutePath());
		
		OCL ocl = OCL.newInstance();
		CompleteOCLEObjectValidator myValidator = new CompleteOCLEObjectValidator(OntoumlPackage.eINSTANCE, oclUri,ocl.getEnvironmentFactory());
		EValidator.Registry.INSTANCE.put(OntoumlPackage.eINSTANCE, myValidator);
				
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(m);
		System.out.println(diagnostics.getMessage());
		for (Object object : diagnostics.getChildren()) {
			if(object instanceof BasicDiagnostic){
				System.out.println(((BasicDiagnostic)object).getMessage());
				System.out.println(((BasicDiagnostic)object).getData());
			}
		}		
		System.out.println("Done.");
	}
}

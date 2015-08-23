package net.menthor.onto2.ontouml.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.validation.ComposedEValidator;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.ocl.xtext.oclstdlib.OCLstdlibStandaloneSetup;

import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.OntoumlPackage;

public class OntoumlDiagnostician {
	
	private static boolean checkTypes = true;
	private static boolean checkRelationships = true;
	private static boolean checkMetaAttributes = true;
	private static boolean checkBinaryProperties = true;
	private static boolean checkDependencies = true;
	private static boolean checkCardinalities = true;		
			
	public static void main(String[] args) throws ParserException, IOException{				
		List<Diagnostic> result = execute("test/ontobio.mouml");
		printDiagnosis(result);
	}
	
	public static void printDiagnosis(List<Diagnostic> list){
		for (Object object : list) {
			if(object instanceof Diagnostic){
				System.out.println(((BasicDiagnostic)object).getMessage());
				System.out.println(((BasicDiagnostic)object).getData());
			}
		}	
	}
	
	public static List<Diagnostic> execute(String ontoPath) throws IOException{		
		Resource modelResource = OntoumlResource.load(ontoPath);
		Model m = (Model) EcoreUtil.getObjectByType(modelResource.getContents(), OntoumlPackage.Literals.MODEL);		
		return execute(m);
	}
	
	public static List<Diagnostic> execute(Model model){
		OCLstdlibStandaloneSetup.doSetup();
		EssentialOCLStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		OCLstdlib.install();				
		OCL ocl = OCL.newInstance();
		List<String> oclFilePaths = new ArrayList<String>();
		oclFilePaths.add("model/ontouml.ocl");
		if(checkTypes) oclFilePaths.add("model/types.ocl");
		if(checkRelationships) oclFilePaths.add("model/relationships.ocl");
		if(checkMetaAttributes) oclFilePaths.add("model/metaattributes.ocl");
		if(checkBinaryProperties) oclFilePaths.add("model/binproperties.ocl");
		if(checkDependencies) oclFilePaths.add("model/dependency.ocl");
		if(checkCardinalities) oclFilePaths.add("model/cardinalities.ocl");				
		ComposedEValidator composed = ComposedEValidator.install(OntoumlPackage.eINSTANCE);
		for(String oclPath: oclFilePaths){
			File file = new File(oclPath);
			URI oclURI = URI.createFileURI(file.getAbsolutePath());			
			CompleteOCLEObjectValidator myValidator = new CompleteOCLEObjectValidator(OntoumlPackage.eINSTANCE, oclURI, ocl.getEnvironmentFactory());;
			composed.addChild(myValidator);
		}						
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(model);			
		return diagnostics.getChildren();
	}
}

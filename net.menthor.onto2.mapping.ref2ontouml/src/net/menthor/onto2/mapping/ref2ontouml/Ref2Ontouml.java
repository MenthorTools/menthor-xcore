package net.menthor.onto2.mapping.ref2ontouml;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.pivot.utilities.ParserException;

import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.util.OntoumlResource;

public class Ref2Ontouml {

	public static void main(String[] args)
	{
		run("src/net/menthor/onto2/mapping/ref2ontouml/test/ontoemerge.refontouml", 
			"src/net/menthor/onto2/mapping/ref2ontouml/test/ontoemerge.mouml");
		
		run("src/net/menthor/onto2/mapping/ref2ontouml/test/ontobio.refontouml", 
			"src/net/menthor/onto2/mapping/ref2ontouml/test/ontobio.mouml");
	}
	
	public static void run(String refontoPath, String ontoPath)
	{	
		try {
			Resource resource = TransformerUtil.loadRefModel(refontoPath);
			RefOntoUML.Package refmodel = (RefOntoUML.Package)resource.getContents().get(0);						
			run(refmodel, ontoPath);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void run(RefOntoUML.Package refmodel, String ontoPath) throws IOException, ParserException
	{	
		Transformer t = new Transformer(refmodel);		
		Model ontomodel = t.run();		
		OntoumlResource.save(ontoPath,ontomodel);		
		System.out.println("Ref2Ontouml: Executed succesfully.");
	}
}

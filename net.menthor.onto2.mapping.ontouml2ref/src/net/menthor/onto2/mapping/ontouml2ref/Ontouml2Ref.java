package net.menthor.onto2.mapping.ontouml2ref;

import java.io.IOException;

import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.util.OntoumlResource;

import org.eclipse.emf.ecore.resource.Resource;

public class Ontouml2Ref {

	public static void main(String[] args)
	{
		run("src/net/menthor/onto2/mapping/ontouml2ref/test/ontoemerge.mouml", 
			"src/net/menthor/onto2/mapping/ontouml2ref/test/ontoemerge.refontouml");
		
		run("src/net/menthor/onto2/mapping/ontouml2ref/test/ontobio.mouml", 
			"src/net/menthor/onto2/mapping/ontouml2ref/test/ontobio.refontouml");
	}
	
	public static void run(String ontoPath,String refontoPath)
	{	
		try {
			Resource resource = OntoumlResource.load(ontoPath);
			Model ontomodel = (Model)resource.getContents().get(0);						
			run(ontomodel, refontoPath);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void run(Model ontomodel, String refontoPath) throws IOException
	{	
		Transformer t = new Transformer(ontomodel);		
		RefOntoUML.Model refmodel = t.run();		
		TransformerUtil.saveRefModel(refontoPath, refmodel);		
		System.out.println("Ontouml2Ref: Executed succesfully.");
	}
}

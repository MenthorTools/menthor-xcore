package net.menthor.onto2.mapping.ref2ontouml;

import java.io.IOException;

import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.util.OntoumlResource;

import org.eclipse.emf.ecore.resource.Resource;

import RefOntoUML.util.RefOntoUMLResourceUtil;

public class Ref2Ontouml {

	public static void main(String[] args){
		run("src/net/menthor/onto2/mapping/ref2ontouml/ontoemerge.refontouml", 
			"src/net/menthor/onto2/mapping/ref2ontouml/ontoemerge.mouml");
	}
	
	public static void run(String refontoPath, String ontoPath)
	{	
		try {
			Resource resource = RefOntoUMLResourceUtil.loadModel(refontoPath);
			RefOntoUML.Package refmodel = (RefOntoUML.Package)resource.getContents().get(0);
						
			run(refmodel, ontoPath);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void run(RefOntoUML.Package refmodel, String ontoPath) throws IOException
	{	
		Transformer t = new Transformer(refmodel);
		
		Model ontomodel = t.run();
		
		OntoumlResource.save(ontoPath,ontomodel);
		
		System.out.println("executed succesfully");
		//System.out.println(ontomodel.getElements());
	}
}

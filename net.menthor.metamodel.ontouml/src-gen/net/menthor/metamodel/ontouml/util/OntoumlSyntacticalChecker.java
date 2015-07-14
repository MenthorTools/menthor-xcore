package net.menthor.metamodel.ontouml.util;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.menthor.metamodel.ontouml.Element;
import net.menthor.metamodel.ontouml.Model;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

public class OntoumlSyntacticalChecker {

	private BasicDiagnostic diag;
	
	private Map<Element, ArrayList<String>> errorsMap = new HashMap<Element,  ArrayList<String>>();	
	private long validationStartMilis = 0;
	private long verificationEndMilis = 0;
	private String result = new String();

	public String getTimingMessage() {
		return MessageFormat.format("Model verified in {0} ms, {1} error(s) found", (verificationEndMilis - validationStartMilis),  diag.getChildren().size());			
	}
	
	public Map<Element, ArrayList<String>> getMap() { return errorsMap; }	
	public String getResult() { return result; }
	
	public void run(Model model)
	{		
		result = "";
		errorsMap.clear();
		Diagnostician verificator = Diagnostician.INSTANCE;
		Map<Object, Object> context = new HashMap<Object, Object>();
		diag = new BasicDiagnostic();				
		
		validationStartMilis = System.currentTimeMillis();
		boolean verification = verificator.validate(model, diag, context);
		verificationEndMilis = System.currentTimeMillis();
		
		if(!verification)
		{
			result += "The model is not valid syntactically. The following error(s) where found:\n\n";	
			
			for (Diagnostic item : diag.getChildren()) 
			{					
				Element element = (Element) item.getData().get(0);
				System.out.println(element);
				result+=element+"\n";				
			}
		}		
		result += MessageFormat.format("Model verified in {0} ms, {1} error(s) found", (verificationEndMilis - validationStartMilis),  diag.getChildren().size());		
	}
}

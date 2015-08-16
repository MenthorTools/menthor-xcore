package net.menthor.onto2.ontouml.util;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.menthor.onto2.ontouml.Element;
import net.menthor.onto2.ontouml.Model;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

public class OntoumlDiagnostician {

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
				String userMessage = getUserMessage(item.getMessage());
				
				result+=OntoumlPrintHelper.getCommonName(element)+" - "+userMessage+"\n";				
			}
		}		
		result += MessageFormat.format("Model verified in {0} ms, {1} error(s) found", (verificationEndMilis - validationStartMilis),  diag.getChildren().size());		
	}
	
	public String getUserMessage (String itemMessage)
	{
		String[] out = parseItemMessage(itemMessage);
		String d = getDescription(out[0]);		
		return out[1] + " - " + d;
	}
	
	public String[] parseItemMessage(String itemMessage)
	{
		int i1, i2, j1, j2;
		String[] out = new String[2];
		out[0] = "";
		out[1] = "";		
		i1 = itemMessage.indexOf("'", 0);
		i2 = itemMessage.indexOf("'", i1+1);
		j1 = itemMessage.indexOf("'", i2+1);
		j2 = itemMessage.indexOf("'", j1+1);		
		//System.out.println(message);
		//System.out.println(i1 + " " + i2 + " " + j1 + " " + j2);		
		/**The constraint id*/
		out[0] += itemMessage.substring(i1+1, i2);
		/**The model element*/
		out[1] += itemMessage.substring(j1+1, j2);
		return out;
	}
	
	public String getDescription (String constraintId)
	{
		String description = new String();		
		if (constraintId.compareTo("SortalClassConstraint1") == 0)
		{
			description = "Every non abstract Sortal must have a Substance Sortal ancestor (or be a Substance Sortal)";
		}
		else
		{
			description = constraintId;
		}		
		return description;
	}
}

package net.menthor.metamodel.ontouml.util;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

/**
 * Serializable Ontouml element used to be consumed by applications
 * 
 * @author John Guerson
 *
 */
public class OntoumlElement implements Serializable{
		
	private static final long serialVersionUID = 6497601879574303331L;
	
	protected transient EObject element;
	protected String uniqueName = new String();
	
	protected String name = new String();
	protected String type = new String();		
	protected String commonName = new String();
	protected String completeName = new String();
	
	public OntoumlElement(EObject element, String uniqueName) 
	{
		this.element = element;
		this.uniqueName= uniqueName;
		
		if(element!=null)
		{
			name = OntoumlPrintHelper.getName(element);		
			type = OntoumlPrintHelper.getStereotype(element);
			commonName = OntoumlPrintHelper.getCommonName(element);
			completeName = OntoumlPrintHelper.getCompleteName(element);
		}	     
	}
	
	public EObject getElement() { return element; }
	public String getUniqueName() { return uniqueName; }
	
	public String getName() { return name; }
	public String getTypeName() { return type; }
	public String getCommonName() { return commonName; }
	public String getCompleteName() { return completeName; }
	
	@Override
	public String toString() { return commonName; }	
}


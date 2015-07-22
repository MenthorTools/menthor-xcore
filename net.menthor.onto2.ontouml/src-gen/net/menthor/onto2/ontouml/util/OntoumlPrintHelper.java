package net.menthor.onto2.ontouml.util;

import org.eclipse.emf.ecore.EObject;

import net.menthor.onto2.ontouml.Attribute;
import net.menthor.onto2.ontouml.Classifier;
import net.menthor.onto2.ontouml.Comment;
import net.menthor.onto2.ontouml.Constraint;
import net.menthor.onto2.ontouml.DataType;
import net.menthor.onto2.ontouml.EndPoint;
import net.menthor.onto2.ontouml.Generalization;
import net.menthor.onto2.ontouml.GeneralizationSet;
import net.menthor.onto2.ontouml.Literal;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.NamedElement;
import net.menthor.onto2.ontouml.Property;
import net.menthor.onto2.ontouml.Relationship;
import net.menthor.onto2.ontouml.Class;


/** 
 * This class is used to print and give a string representation 
 * for a given OntoUML element like Types, Names, Multiplicities 
 * and so on.
 * 
 * @author Tiago Sales
 */
public class OntoumlPrintHelper {

	/** 
	 * Return the name of the type of this element. 
	 * For instance, if a Kind, then "Kind", if a componentOf, 
	 * then "ComponentOf", and so on and so forth. 
	 */
	public static String getStereotype(EObject elem)
	{		
		if(elem==null) return "Null";
		if(elem instanceof Class){ 
			Class c = (Class)elem; 
			if(c.getStereotype()!=null) return c.getStereotype().getName();
			else return "Class";
		}
		if(elem instanceof Relationship){ 
			Relationship r = (Relationship)elem;
			if(r.getStereotype()!=null) return r.getStereotype().getName();
			else return "Relationship";
		}
		if(elem instanceof DataType){ 
			DataType d = (DataType)elem; 
			if(d.getStereotype()!=null) return d.getStereotype().getName();
			else return "DataType";
		}
		if(elem instanceof Attribute){ 
			Attribute a = (Attribute)elem; 
			if(a.getStereotype()!=null) return a.getStereotype().getName();
			else return "Attribute";
		}
		if(elem instanceof Constraint) { 
			Constraint c = (Constraint)elem;
			if(c.getStereotype()!=null) return c.getStereotype().getName();
			else return "Constraint";
		}
		if(elem instanceof EndPoint) return "EndPoint";
		if((elem instanceof Property) && !(elem instanceof Attribute) && !(elem instanceof EndPoint)) { return "Property"; }		
		if(elem instanceof Package) return "Package";		
		if(elem instanceof Model) return "Model";
		if(elem instanceof GeneralizationSet) return "GeneralizationSet";				
		if(elem instanceof Generalization) return "Generalization";
		if(elem instanceof Comment) return "Comment";		
		if(elem instanceof Literal) return "Literal";
		return "UnknownType";
	}
	
	/** 
	 * Return the name of the type of this element with guillemets
	 * For instance, if a kind, then ?Kind?, and so on and so forth.
	 */
	public static String getStereotype(EObject elem, boolean addGuillemets)
	{
		//Changed to unicode because on mac this character appear like "?"
		if(addGuillemets) return "\u00AB"+getStereotype(elem)+"\u00BB";		
		return getStereotype(elem);
	}
	
	/** Return the name of this element */
	public static String getName(EObject elem)
	{
		if(elem==null) return "null";		
		if(elem instanceof NamedElement){
			String name = ((NamedElement) elem).getName();			
			if(name == null) return "";			
			return name;
		}		
		return "nameless";
	}
	
	/** 
	 * Return the name of this element with single quote and lowerupper character.
	 * For instance, if a kind named Person then 'Person' or <Person>.
	 */
	public static String getName(EObject elem, boolean addSingleQuote, boolean addLowerUpper)
	{
		if(addSingleQuote) return "'"+getName(elem)+"'";		
		if(addLowerUpper) return "<"+getName(elem)+">";		
		return getName(elem);
	}
	
	/** 
	 * Return the name of the type and the name of the element with single quote and guillemets.
	 * For instance, if a kind named Person, then  ?Kind? 'Person' 
	 */
	public static String getStereotypeAndName(EObject elem, boolean addGuillemets, boolean addSingleQuotes)
	{		
		String name = "";		
		if(elem instanceof NamedElement) name = " "+getName(elem,addSingleQuotes,false);		
		return getStereotype(elem,addGuillemets)+name;
	}
	
	/** 
	 * Return the name of the element and the name of its type with guillemets and single quotes.
	 * For instance, if a kind named Person, then  'Person' (?Kind?)
	 */
	public static String getNameAndStereotype(EObject elem, boolean addGuillemets, boolean addSingleQuotes)
	{		
		String name = "";		
		if(elem instanceof NamedElement) name = getName(elem,addSingleQuotes,false);		
		return name+" ("+getStereotype(elem,addGuillemets)+")";
	}
	
	/** 
	 * Return a common name used for displaying an OntoUML element which depends on its type.
	 * For instance, generalization are displayed like "Generalization {Person <- Child}" where person is the general type.
	 * A package and a classifier like "Package Accidents" and "?Kind? Person".
	 */
	public static String getCommonName(EObject elem) 
	{		
		if (elem instanceof Model) return getStereotypeAndName(elem, false, false);
		if (elem instanceof Package) return getStereotypeAndName(elem, false, false);		
		if (elem instanceof Class || elem instanceof DataType)return getStereotypeAndName(elem, true, false);		
		if (elem instanceof Relationship)
		{
			Relationship a = (Relationship) elem;
			String result = getStereotypeAndName(elem,true, false)+" {";
			int i=1;
			for(EndPoint ep: a.getEndPoints()){
				if(i<a.getEndPoints().size())
					result += getName(ep.getEndType())+" -> ";
				else 
					result += getName(ep.getEndType())+"}";
				i++;
			}
			return result;
		}
		if (elem instanceof Generalization)
		{
			String result = new String();		    
		    Generalization g = (Generalization)elem;
		    result += getStereotype(elem)+" {"+getName(g.getSpecific())+" -> "+getName(g.getGeneral())+"}";
		    return result;
		}
		if (elem instanceof GeneralizationSet)
		{	
			String result = new String();		    
		    GeneralizationSet genset = (GeneralizationSet)elem;		    
		    Classifier general = genset.getGeneral();		    
		    result += getStereotypeAndName(elem, false, false) + " / "+getName(general)+" { ";		   	    
		    int i=1;
		    for(Classifier specific: genset.getSpecifics())
		    {
		    	if(i < genset.getSpecifics().size()) 
		    		result += getName(specific)+", ";
		    	else 
		    		result += getName(specific) + " } ";
		    	i++;
		    }
		    return result;		    
		}		
		if (elem instanceof Attribute)
		{
			Attribute p = (Attribute)elem;
			return getStereotype(p)+" ("+getName(p)+")"+" ["+getMultiplicity(p,true,"..")+"]";			
		}	
		if (elem instanceof EndPoint)
		{
			EndPoint p = (EndPoint)elem;
			return getStereotype(p)+" ("+getName(p)+") "+getName(p.getEndType()) +" ["+getMultiplicity(p,true,"..")+"]";						
		}
		if (elem instanceof Literal)
		{
			Literal p = (Literal)elem;
			return getStereotype(p)+" ("+p.getValue()+")";			
		}
		if(elem instanceof Comment)
		{
			Comment p = (Comment)elem;
			return getStereotype(p);
		}
		if(elem instanceof Constraint)
		{
			Constraint p = (Constraint)elem;
			return getStereotype(p)+" ("+p.getName()+")";
		}
		return getStereotypeAndName(elem, true, false);
	}
	
	/** 
	 * Return a more complete name used for displaying an OntoUML element which depends on its type.
	 * For instance, generalization are displayed like "?Generalization? {?Kind? Person <- ?Phase? Child"} where person is the general type and child the specific type.
	 * A package and a classifier like "?Package? Accidents" and "?Kind? Person".
	 */
	public static String getCompleteName(EObject elem)
	{
		if (elem instanceof Package) return getStereotypeAndName(elem, true, false);				
		if (elem instanceof Model) return getStereotypeAndName(elem, true, false);
		if (elem instanceof Class || elem instanceof DataType) return getStereotypeAndName(elem, true, false);
		if (elem instanceof Generalization)
		{
			String result = new String();		    
		    Generalization g = (Generalization)elem;
		    result += getStereotype(elem)+" "+getStereotypeAndName(g.getGeneral(),true,false)+" <- "+getStereotypeAndName(g.getSpecific(),true,false);
		    return result;
		}
		if (elem instanceof Relationship)
		{
			Relationship a = (Relationship) elem;
			String result = getStereotypeAndName(elem,true, false)+" {";
			int i=1;
			for(EndPoint ep: a.getEndPoints()){
				if(i<a.getEndPoints().size())
					result += getCommonName(ep.getEndType())+" -> ";
				else 
					result += getCommonName(ep.getEndType())+"}";
				i++;
			}
			return result;
		}		
		if(elem instanceof GeneralizationSet)
		{
			GeneralizationSet gs = (GeneralizationSet) elem;
			return getCommonName(elem)+" isCovering: "+gs.isIsCovering();
		}		
		if(elem instanceof EndPoint)
		{
			EndPoint p = (EndPoint)elem;
			return getStereotype(p,true)+" "+getName(p.eContainer())+"::"+getName(p)+" ("+getName(p.getEndType())+")"+" ["+getMultiplicity(p,true,"..")+"]";			
		}
		if(elem instanceof Attribute)
		{
			Attribute p = (Attribute)elem;
			return getStereotype(p,true)+" "+getName(p.eContainer())+"::"+getName(p)+""+" ["+getMultiplicity(p,true,"..")+"]";			
		}
		if(elem instanceof Comment)
		{
			Comment p = (Comment)elem;
			return getStereotype(p);
		}
		if(elem instanceof Constraint)
		{
			Constraint p = (Constraint)elem;
			return getStereotype(p)+" ("+p.getName()+")";
		}
		return getStereotypeAndName(elem, true, false);
	}
	
	/**
	 * Return the string representation of a property multiplicity. It might always show the upper and lower bounds as
	 * well as choose a proper separator such as "..". 
	 */
	public static String getMultiplicity(Property p, boolean alwaysShowLowerAndUpper, String separator)
	{
		if(p==null) return "null";		
		Integer lower = p.getLowerBound();
		Integer upper = p.getUpperBound();
		return getMultiplicity(lower, upper, alwaysShowLowerAndUpper, separator);
	}

	/**
	 * Return the string representation of a multiplicity. It might always show the upper and lower bounds as
	 * well as choose a proper separator such as "..". 
	 */
	public static String getMultiplicity(Integer lower, Integer upper, boolean alwaysShowLowerAndUpper, String separator) 
	{
		String lowerString = lower.toString();
		String upperString = upper.toString();		
		if (lower == -1) lowerString = "*";
		if (upper == -1) upperString = "*";		
		if(!alwaysShowLowerAndUpper && lower==upper) return lowerString;		
		return lowerString+separator+upperString;
	}
	
	/** Return the name and the type of a property i.e. association end-point or attribute 
	 *  For instance, 'age' (int) */
	public static String getNameAndType(Property p)
	{
		if(p instanceof Attribute){
			return getName(p, true, false)+" ("+getStereotype(p)+")";
		}
		if(p instanceof EndPoint){
			return getName(p, true, false)+" ("+getName(((EndPoint)p).getEndType())+")";
		}
		return getName(p, true, false)+" (typeless)";
		
	}
	
	/** Return the name and the type of a property i.e. association end-point or attribute where you might choose to display stereotype and name of the property type.
	 *  For instance, 'age' (?PrimitiveType? 'int' ) */
	public static String getNameAndStereotype(Property p, boolean addTypeStereotype)
	{		
		if(p instanceof Attribute){
			if(addTypeStereotype) return getName(p, true, false)+" ("+getStereotypeAndName(p, true, false)+")";
			else return getName(p, true, false)+" (PrimitiveType)";			
		}
		if(p instanceof EndPoint){
			if(addTypeStereotype) return getName(p, true, false)+" ("+getStereotypeAndName(((EndPoint)p).getEndType(), true, false)+")";
			else return getName(p, true, false)+" ("+getName(((EndPoint)p).getEndType())+")";			
		}
		return getName(p, true, false)+" (typeless)";
	}
	
	public static String getNameStereotypeAndMultiplicity(Property p, boolean quotePropertyName, boolean quoteTypeName, boolean alwaysShowLowerAndUpper, boolean addTypeStereotype, boolean guillemetTypeStereotype)
	{		
		if(p instanceof EndPoint){
			String typeDesc = new String();
			if(addTypeStereotype) typeDesc = getStereotypeAndName(((EndPoint)p).getEndType(), guillemetTypeStereotype, quoteTypeName);
			else typeDesc = getName(((EndPoint)p).getEndType(),quoteTypeName,false);		
			return getName(p, quotePropertyName, false)+" ["+getMultiplicity(p, alwaysShowLowerAndUpper, "..")+"] ("+typeDesc+")";
		}
		if(p instanceof Attribute){
			String typeDesc = new String();
			if(addTypeStereotype) typeDesc = getStereotypeAndName(((Attribute)p), guillemetTypeStereotype, quoteTypeName);
			else typeDesc = getName(((Attribute)p),quoteTypeName,false);		
			return getName(p, quotePropertyName, false)+" ["+getMultiplicity(p, alwaysShowLowerAndUpper, "..")+"] ("+typeDesc+")";
		}
		return getName(p, quotePropertyName, false)+" ["+getMultiplicity(p, alwaysShowLowerAndUpper, "..")+"] (typeless)";		
	}

	/** Return a path of a element i.e. its package hierarchy */
	public static String getPath(EObject c)
	{
		if(c == null) return "";		
		if (c.eContainer()==null) return "";
		else{
			String containerName = "";
			if(c.eContainer() instanceof NamedElement) containerName = ((NamedElement) c.eContainer()).getName();
			else containerName = "unnamed";
			if(c.eContainer().eContainer()==null) return containerName;			
			return getPath(c.eContainer())+"::"+containerName;
		}
	}
	
	/** Return all the details of an association i.e. all its related data */
	public static String getAllDetails(Relationship a)
	{		
		String result = getStereotypeAndName(a,true, true)+" {";
		int i=1;
		for(EndPoint ep: a.getEndPoints()){
			if(i<a.getEndPoints().size())
				result += getName(ep.getEndType(),true,false)+"("+getMultiplicity(ep, true, "..")+")"+" -> ";
			else 
				result += getName(ep.getEndType(),true,false)+"("+getMultiplicity(ep, true, "..")+")"+"}";
			i++;
		}
		return result;
	}
}



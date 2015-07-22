package net.menthor.onto2.mapping.ref2ontouml;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class DefaultHandler extends AbstractHandler {
	
	  @Override
	  public Object execute(ExecutionEvent event) throws ExecutionException 
	  {
	    //Shell shell = HandlerUtil.getActiveShell(event);
	    ISelection sel = HandlerUtil.getActiveMenuSelection(event);
	    IStructuredSelection selection = (IStructuredSelection) sel;	    
	    Object firstElement = selection.getFirstElement();
	    
        if (firstElement instanceof IFile)
        {
        	IFile f = (IFile) firstElement;                                                
            if (f.getFileExtension().compareTo("refontouml") == 0)
            {                        		
				String refPath = f.getLocation().toString();
				String noExtPath = refPath.substring(0, refPath.length()-11);
				String outPath = noExtPath.concat(".mouml");
				
				/** Transformation */
				Ref2Ontouml.run(refPath, outPath);
            }
        }

        //MessageDialog.openInformation(shell, "Info", "Please select a Java source file");	    
	    return null;
	  }	  
}
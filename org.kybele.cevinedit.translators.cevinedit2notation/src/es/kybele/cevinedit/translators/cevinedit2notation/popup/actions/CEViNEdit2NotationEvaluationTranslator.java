package es.kybele.cevinedit.translators.cevinedit2notation.popup.actions;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import mapping.MappingContainer;
import mapping.MappingFactory;
import mapping.MappingPackage;
import notation.DiagramDefinition;
import notation.NotationDefinition;
import notation.NotationFactory;
import notation.NotationPackage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import cevinedit.CEViNEditRoot;
import cevinedit.CevineditPackage;
import es.kybele.cevinedit.translators.cevinedit2notation.NotationTranslator;

public class CEViNEdit2NotationEvaluationTranslator implements IObjectActionDelegate {

	private Shell shell;
	private IStructuredSelection _selection = null;
	/**
	 * Constructor for Action1.
	 */
	public CEViNEdit2NotationEvaluationTranslator() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		IFile fs = null;
		if (_selection.getFirstElement() instanceof IFile)
		{
			fs = (IFile) _selection.getFirstElement();
			IProject prj = fs.getProject();
			
			String nfs = fs.getName();
			String nfsonly = nfs.substring(0, nfs.lastIndexOf("."));
			String notation = nfsonly + ".notation";
			String mapping = nfsonly + ".mapping";
			
			IFile fNotation = prj.getFile(notation);
			IFile fMapping = prj.getFile(mapping);
			
			EcorePackage.eINSTANCE.eClass();
			NotationPackage.eINSTANCE.eClass();
			CevineditPackage.eINSTANCE.eClass();
			MappingPackage.eINSTANCE.eClass();
			
		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("ecore", new XMIResourceFactoryImpl());
		    m.put("notation", new XMIResourceFactoryImpl());
		    m.put("mapping", new XMIResourceFactoryImpl());
		    m.put("cevinedit", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();

			
			Resource cevineditResource = resSet.getResource(URI.createFileURI(fs.getFullPath().toString()), true);
		    Resource notationResource = resSet.createResource(URI.createFileURI(fNotation.getFullPath().toString()));
		    Resource mappingResource = resSet.createResource(URI.createFileURI(fMapping.getFullPath().toString()));

		    EObject cevineditRootEObject = cevineditResource.getContents().get(0);
		    
		    if (cevineditRootEObject != null && cevineditRootEObject instanceof CEViNEditRoot)
		    {			
				
		    	CEViNEditRoot cevineditRoot = (CEViNEditRoot) cevineditRootEObject; 
		    	
		    	if (cevineditRoot.getDiagram() != null)
		    	{
		    		String nameSrcMM = cevineditRoot.getSourceMM();
			    	
			    	IFile fsrcMM = prj.getFile(nameSrcMM);
			    	
			    	Resource ecoreMetaModelResource = null;
			    	if (fsrcMM.exists())
			    	{
			    		ecoreMetaModelResource = resSet.getResource(URI.createFileURI(fsrcMM.getFullPath().toString()), true);
			    	}			    
			    	try 
			    	{
						NotationTranslator.INSTANCE().execute(cevineditResource, ecoreMetaModelResource, notationResource, mappingResource);
					} 
			    	catch (Exception e1) 
			    	{
						
					}
			    
				    try 
				    {
				    	notationResource.save(Collections.EMPTY_MAP);
				    	mappingResource.save(Collections.EMPTY_MAP);						
				    } 
				    catch (IOException e) 
				    {
				        e.printStackTrace();
				    }
		    	}
			
		    }
		
		}

	}

	public void selectionChanged(IAction action, ISelection selection) {
		_selection = (IStructuredSelection) selection;
	}

}

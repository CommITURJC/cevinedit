package org.cevinedit.editor.view.listeners;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.cevinedit.core.eugenia.EugeniaAnnotator;
import org.cevinedit.core.eugenia.EugeniaAnnotatorException;
import org.cevinedit.core.eugenia.EugeniaColor;
import org.cevinedit.core.generator.CevineditGenerator;
import org.cevinedit.core.tools.CevineditModelTools;
import org.cevinedit.core.tools.CevineditProjectTools;
import org.cevinedit.core.tools.CevineditEcoreTools;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eugenia.EugeniaActionDelegate;
import org.eclipse.epsilon.eugenia.EugeniaActionDelegateStep;
import org.eclipse.epsilon.eugenia.GenerateAllDelegate;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import cevinedit.Brightness;
import cevinedit.CEViNEditRoot;
import cevinedit.CompartmentEReferenceCont;
import cevinedit.Diagram;
import cevinedit.LinkEClass;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.NodeEClass;
import cevinedit.NodeFigure;
import cevinedit.PersonalizedElement;
import cevinedit.impl.CEViNEditRootImpl;
import cevinedit.presentation.CevineditEditor;

public class CevineditEditorGenerateEMFListener implements SelectionListener 
{
	protected CevineditEditor _editor = null;
	protected Resource _model = null;
	public CevineditEditorGenerateEMFListener(CevineditEditor editor)
	{
		_editor = editor;
		_model = editor.getCevineditModelResource();
	}
	
	public static CevineditEditorGenerateEMFListener i(CevineditEditor editor)
	{
		return new CevineditEditorGenerateEMFListener(editor);
	}
	
	public Resource basicEugeniaAnnotation(Resource r)
	{
		LinkedList<String> namesPersonalizedElements = CevineditModelTools.getNamesPersonalizedElements(_editor);
		
		for(EObject eobject : r.getContents())
		{
			if (eobject instanceof EPackage)
			{
				EPackage epackage = (EPackage) eobject;				

				try 
				{
					EugeniaAnnotator.annotateEObjectAsGMF(epackage);
				} 
				catch (EugeniaAnnotatorException e1) 
				{
				}
				
				for(EClassifier eclassifier : epackage.getEClassifiers())
				{
					
					if (eclassifier instanceof EClass)
					{
						EClass eclass = (EClass) eclassifier;
						if (namesPersonalizedElements.contains(eclass.getName()))
					    {
							try 
							{
								EugeniaAnnotator.annotateEObjectAsGMFNode(eclass);
							} 
							catch (EugeniaAnnotatorException e1) {
							}
					    }
						
						for(EStructuralFeature structuralFeature : eclass.getEStructuralFeatures())
						{
							if (structuralFeature instanceof EReference)
							{
								EReference eref = (EReference) structuralFeature; 
								if (namesPersonalizedElements.contains(eref.getEContainingClass().getName()+"."+eref.getName()))
								{
									if (eref.isContainment())
									{								
										try 
										{
											EugeniaAnnotator.annotateEObjectAsGMFCompartment(eref);
										} 
										catch (EugeniaAnnotatorException e) 
										{
										}
									}
									else
									{
										try 
										{
											EugeniaAnnotator.annotateEObjectAsGMFLink(eref);
										} 
										catch (EugeniaAnnotatorException e) 
										{
										}									
									}
								}
							}							

						}

					}
				}
			}
		}
		
		return r;
	}

	
	protected static Hashtable<String, PersonalizedElement> transformCevineditModel2HashTable(CEViNEditRoot model)
	{
		Hashtable<String, PersonalizedElement> elements = new Hashtable<>();
		
		for(PersonalizedElement pe : model.getDiagram().getContainsElem())
		{
			elements.put(pe.getName(), pe);
		}
		
		return elements;
	}
	
	public static List<Entry<String, String>> generateEntries(PersonalizedElement pe)
	{
		LinkedList<Entry<String,String>> lpe = new LinkedList<>();
		if (pe instanceof NodeEClass)
		{
			NodeEClass nodeEClass = (NodeEClass) pe;
			

			int rgb[] = EugeniaColor.ColorToRGBWithBrightness(nodeEClass.getBackgroundColor().getLiteral(), nodeEClass.getBrightness().getLiteral());
			
			lpe.add(EugeniaAnnotator.GmfNode_Color(rgb[0], rgb[1], rgb[2]));
			

			rgb = EugeniaColor.ColorToRGB((nodeEClass.getBorderColor().getLiteral()));
			
			lpe.add(EugeniaAnnotator.GmfNode_BorderColor(rgb[0], rgb[1], rgb[2]));
					
			
			try 
			{
				lpe.add(EugeniaAnnotator.GmfNode_BorderStyle(nodeEClass.getBorderTexture().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {
			}
			

			lpe.add(EugeniaAnnotator.GmfNode_BorderWidth(nodeEClass.getBorderWidth()));
			
			try 
			{
				if (nodeEClass.getFigure().equals(NodeFigure.IMAGE))
				{
					lpe.add(EugeniaAnnotator.GmfNode_FigureImage(nodeEClass.getName()));
					lpe.add(EugeniaAnnotator.GmfNode_NoIcon(nodeEClass.getName()));
				}
				else if (nodeEClass.getFigure().equals(NodeFigure.POLYGON))
				{
					lpe.add(EugeniaAnnotator.GmfNode_Figure(nodeEClass.getFigure().getLiteral().toLowerCase()));
					String points = nodeEClass.getListPointsPolygon();
					String []list_points = points.split(";");
					
					String []pointsX = new String[list_points.length];
					String []pointsY = new String[list_points.length];
					
					int c = 0;
					for(String point : list_points)
					{
						String []x_y = point.split(",");
						pointsX[c] = x_y[0];
						pointsY[c] = x_y[1];
						c++;
					}
					
					lpe.add(EugeniaAnnotator.GMFNode_PolygonX(pointsX));
					lpe.add(EugeniaAnnotator.GMFNode_PolygonY(pointsY));
					
				}
				else
				{
					lpe.add(EugeniaAnnotator.GmfNode_Figure(nodeEClass.getFigure().getLiteral().toLowerCase()));
				}
			} 
			catch (EugeniaAnnotatorException e) {
			}
			
			lpe.add(EugeniaAnnotator.GMFNode_Resizable(nodeEClass.isResizable()));
			
			if ((nodeEClass.getSize()!= null) &&(nodeEClass.getSize().indexOf(',') >= 0))
			{
				String x_y[] = nodeEClass.getSize().split(",");
				lpe.add(EugeniaAnnotator.GMFNode_Size(Integer.valueOf(x_y[0].trim()), Integer.valueOf(x_y[1].trim())));
			}

			try 
			{
				lpe.add(EugeniaAnnotator.GMFNode_LabelPlacement(nodeEClass.getLabelPlacement().getLiteral()));
			} 
			catch (EugeniaAnnotatorException e) {


			}

			if (!nodeEClass.getLabel().equals("Not Defined"))
			{
				lpe.add(EugeniaAnnotator.GMFNode_Label(nodeEClass.getLabel()));
			}
			
			
		}
		
		if (pe instanceof LinkEClass)
		{
			LinkEClass le = (LinkEClass) pe;
			
			int rgb[] = EugeniaColor.ColorToRGBWithBrightness(le.getColor().getLiteral(), le.getBrightness().getLiteral());
			lpe.add(EugeniaAnnotator.GMFLink_Color(rgb[0], rgb[1], rgb[2]));
			
			lpe.add(EugeniaAnnotator.GMFLink_Source(le.getSource()));
			lpe.add(EugeniaAnnotator.GMFLink_Target(le.getTarget()));


 
			try 
			{
				lpe.add(EugeniaAnnotator.GMFLink_SourceDecoration(le.getSourceDecoration().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {

			}

			try 
			{
				lpe.add(EugeniaAnnotator.GMFLink_TargetDecoration(le.getTargetDecoration().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {

			}

			try 
			{
				lpe.add(EugeniaAnnotator.GMFLink_Style(le.getTexture().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {
			}

			lpe.add(EugeniaAnnotator.GMFLink_Width(Integer.valueOf(le.getWidth())));
			
			if (!le.getLabel().equals("Not Defined"))
			{
				lpe.add(EugeniaAnnotator.GMFNode_Label(le.getLabel()));
			}
		}
		
		if (pe instanceof LinkEReferenceNonCont)
		{
			LinkEReferenceNonCont le = (LinkEReferenceNonCont) pe;

			int rgb[] = EugeniaColor.ColorToRGBWithBrightness(le.getColor().getLiteral(), le.getBrightness().getLiteral());
			lpe.add(EugeniaAnnotator.GMFLink_Color(rgb[0], rgb[1], rgb[2]));
			

			try 
			{
				lpe.add(EugeniaAnnotator.GMFLink_SourceDecoration(le.getSourceDecoration().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {
			}
			
			try 
			{
				lpe.add(EugeniaAnnotator.GMFLink_TargetDecoration(le.getTargetDecoration().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {

			}
			try 
			{
				lpe.add(EugeniaAnnotator.GMFLink_Style(le.getTexture().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {
			}
			lpe.add(EugeniaAnnotator.GMFLink_Width(Integer.valueOf(le.getWidth())));

		}		
		
		if (pe instanceof CompartmentEReferenceCont)
		{
			CompartmentEReferenceCont compartment = (CompartmentEReferenceCont) pe;
			
			lpe.add(EugeniaAnnotator.GMFCompartment_Collapsible(compartment.isCollapsible()));
			
			try 
			{
				lpe.add(EugeniaAnnotator.GMFCompartment_Layout(compartment.getLayout().getLiteral().toLowerCase()));
			} 
			catch (EugeniaAnnotatorException e) {
			}
		}
		
		return lpe;
	}
	
	public static void PersonalizeEClass(EClass eclass, PersonalizedElement element)
	{
		
		EAnnotation eannotation = null;
		
		if (eclass.getEAnnotations().size()>0)
		{
			eannotation = eclass.getEAnnotation("gmf.node");
			
			if (element instanceof LinkEClass)
			{			
				eannotation.setSource("gmf.link");
			}
			
			eannotation.getDetails().clear();
			
			String labelNodeEClass = "";
			for(Entry<String, String> entry : generateEntries(element))
			{
				eannotation.getDetails().put(entry.getKey(), entry.getValue());
				
				if (entry.getKey().equals("label"))
				{
					labelNodeEClass = entry.getValue();
				}
			}
			
			
			for(EAttribute attribute : eclass.getEAllAttributes())
			{
				if (attribute.getName().equals(labelNodeEClass))
				{
					attribute.getEAnnotations().clear();
				}
			}
		
			
			eclass.getEAnnotations().clear();
			eclass.getEAnnotations().add(eannotation);
		}
	}
	
	public static void PersonalizeEReference(EReference ereference, PersonalizedElement element)
	{
		
		EAnnotation eannotation = null;
		
		if (ereference.getEAnnotations().size()>0)
		{
			if (ereference.isContainment())		
				eannotation = ereference.getEAnnotation("gmf.compartment");
			else
				eannotation = ereference.getEAnnotation("gmf.link");
			
			
			eannotation.getDetails().clear();
			
			for(Entry<String, String> entry : generateEntries(element))
			{
				eannotation.getDetails().put(entry.getKey(), entry.getValue());
			}
		}
	}
	
	public static void PersonalizeEClassAsDiagram(EClass eclass, Diagram diagram)
	{
		for (int i = 0; i < eclass.getEAnnotations().size(); i++) 
		{
			if (eclass.getEAnnotations().get(i).getSource().equals("gmf.node") ||
					eclass.getEAnnotations().get(i).getSource().equals("gmf.link"))
			{
				eclass.getEAnnotations().remove(i);
			}
		}

		for(EStructuralFeature es : eclass.getEStructuralFeatures())
		{
			es.getEAnnotations().clear();
		}
		
		try 
		{
			EugeniaAnnotator.annotateEObjectAsGMFDiagram(eclass);
			
			EAnnotation diagram_eannotation = eclass.getEAnnotation("gmf.diagram");
			Entry<String, String> entry_model_extension = EugeniaAnnotator.GmfDiagram_ModelExtension(diagram.getModelExtension().toLowerCase()+"_model");
			diagram_eannotation.getDetails().put(entry_model_extension.getKey(), entry_model_extension.getValue());
			Entry<String, String> entry_diagram_extension = EugeniaAnnotator.GmfDiagram_DiagramExtension(diagram.getModelExtension().toLowerCase()+"_diagram");
			diagram_eannotation.getDetails().put(entry_diagram_extension.getKey(), entry_diagram_extension.getValue());
		
		} catch (EugeniaAnnotatorException e) {
			e.printStackTrace();
		}
			
		
	}
	
	public Resource CevineditEugeniaAnnotation(Resource r, CEViNEditRoot model)
	{
		Hashtable<String, PersonalizedElement> personalizations = transformCevineditModel2HashTable(model);
		Diagram diagram = model.getDiagram();
		
		
		
		for(EObject eobject : r.getContents())
		{
			if (eobject instanceof EPackage)
			{
				EPackage epackage = (EPackage) eobject;				

				for(EClassifier eclassifier : epackage.getEClassifiers())
				{
					if (eclassifier instanceof EClass)
					{
						EClass eclass = (EClass) eclassifier;						
					
						if (eclass.getName().equals(diagram.getName()))
						{
							PersonalizeEClassAsDiagram(eclass, diagram);
						}
						else
						{
							if (personalizations.get(eclass.getName()) != null)
								PersonalizeEClass(eclass, personalizations.get(eclass.getName()));
						}
						
						for(EStructuralFeature esf : eclass.getEStructuralFeatures())
						{
							if (esf instanceof EAttribute)
							{

							}
							if (esf instanceof EReference)
							{
								EReference eref = (EReference) esf;
								
								if (personalizations.get(eref.getEContainingClass().getName() + "." + eref.getName()) != null)
									PersonalizeEReference(eref, personalizations.get(eref.getEContainingClass().getName() + "." + eref.getName()));
							}							

						}

					}
				}
			}
		}
		
		return r;
	}
	
	public Resource cleanEcoreResource(Resource r)
	{		
		
		for(EObject eobject : r.getContents())
		{
			if (eobject instanceof EPackage)
			{
				EPackage epackage = (EPackage) eobject;				

				for(EClassifier eclassifier : epackage.getEClassifiers())
				{
					if (eclassifier instanceof EClass)
					{
						EClass eclass = (EClass) eclassifier;
						
						for(EStructuralFeature esf : eclass.getEStructuralFeatures())
						{
							esf.getEAnnotations().clear();
						}
						
						eclass.getEAnnotations().clear();
					}
				}
				
				epackage.getEAnnotations().clear();
			}
		}
		
		
		
		return r;
	}
	
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		IPath path = ((FileEditorInput)_editor.getEditorInput()).getPath();		
		IProject project = CevineditProjectTools.getActualWorkingProjectEditor(_editor);		
		IFolder ecore_generated_folder = project.getFolder(CevineditProjectTools.DEFAULT_GENERATED_ECORE_FOLDER);		
		IFile ecore_generated = ecore_generated_folder.getFile("generated.ecore");
						
		Resource r = CevineditEcoreTools.loadEcore(ecore_generated.getLocation().toOSString());
		
		
		r = cleanEcoreResource(r);
		
		r = basicEugeniaAnnotation(r);
		
		r = CevineditEugeniaAnnotation(r, _editor.getCevineditModelRoot());
		
		CevineditEcoreTools.saveResource(r);
		
		
		String workspace = CevineditProjectTools.getWorkspaceRoot().getLocationURI().toString();
		
		
		String actualProjectName = CevineditProjectTools.getActualWorkingProjectEditor(_editor).getName();
		String ecoreGeneratedPath = workspace+ "/"+actualProjectName+"/.ecore_generated/generated.ecore";
		ecoreGeneratedPath = ecoreGeneratedPath.substring(6);
		
		Resource ecore = CevineditEcoreTools.loadEcore(ecoreGeneratedPath);
		
		EPackage root = (EPackage) ecore.getContents().get(0);
		
		
		
		String newEcoreGeneratedPath = workspace + "/" +actualProjectName+ "_gmf" + "/"+root.getName()+".ecore";
		newEcoreGeneratedPath = newEcoreGeneratedPath.substring(6);
		File fileEcoreGenerated = new File(ecoreGeneratedPath);
		File newFileEcoreGenerated = new File(newEcoreGeneratedPath);
		IPath location= new Path(newFileEcoreGenerated.getAbsolutePath());		
		
		
		IProject newProject = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf/");
		IProject newProjectDiagram = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.diagram/");
		IProject newProjectEdit = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.edit/");
		IProject newProjectEditor = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.editor/");
		IProject newProjectTest = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.tests/");				
		
		try {
			if (newProjectDiagram.exists())
			{
				newProjectDiagram.delete(true, null);
			}
			if (newProjectEdit.exists())
			{
				newProjectEdit.delete(true, null);
			}	
			if (newProjectEditor.exists())
			{
				newProjectEditor.delete(true, null);
			}
			if (newProjectTest.exists())
			{
				newProjectTest.delete(true, null);
			}			

		} catch (CoreException e1) {
			e1.printStackTrace();
		}		
		try {
			if (!newProject.exists())
				newProject.create(null);

		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		try {
			Files.copy(fileEcoreGenerated.toPath(), newFileEcoreGenerated.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e2) {
		}
		
		try {
			newProject.open(null);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		IFile ECore2GMFFile = newProject.getFile("ECore2GMF.eol");
		
		if (!ECore2GMFFile.exists())
		{
			try 
			{
				String content = CevineditGenerator.ECore2GMFCode(_editor);			
				
				InputStream stream;
				try 
				{
					stream = new ByteArrayInputStream(content.getBytes("UTF-8"));
					ECore2GMFFile.create(stream, true, null);						

				}
				catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
				}
				
			} 
			catch (CoreException e1) 
			{
				e1.printStackTrace();
			}
		}		
		
		IFile operationsEOLFile = newProject.getFile("operationsEOL.eol");
		
		if (!operationsEOLFile.exists())
		{
			try 
			{
				String content = CevineditGenerator.operationsEOL();			
				
				InputStream stream;
				try 
				{
					stream = new ByteArrayInputStream(content.getBytes("UTF-8"));
					operationsEOLFile.create(stream, true, null);						

				}
				catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
				}
				
			} 
			catch (CoreException e1) 
			{
				e1.printStackTrace();
			}
		}		
	
		
		IFile fileEcore= (IFile) ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(location); 
		GenerateAllDelegate generator = new GenerateAllDelegate();
		generator.setSelectedFile(fileEcore);
		final Action action = new Action(){};
		IWorkbenchWindow[] workbenchWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
		if (workbenchWindows.length > 0) {
			final IWorkbenchPart activePart = workbenchWindows[0].getActivePage().getActivePart();
			generator.setActivePart(action, activePart);
		}		
		generator.run(new Action(){});
		
		
		Job job = new Job("Generating Personalized Elements") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try 
				{
					IProject diagramProject = null;
					while(true)
					{
						diagramProject = CevineditProjectTools.getWorkspaceProjectByExtension(".diagram");
						if (diagramProject != null) break;
						try 
						{
							Thread.sleep(1000);
						} 
						catch (InterruptedException e2) {
							e2.printStackTrace();
						}
					}
					if (diagramProject.exists())
					{
						CEViNEditRootImpl _cevineditRoot = (CEViNEditRootImpl) _model.getContents().get(0);
						
						EList<NodeEClass> _customizations = CevineditModelTools.getNodeEClassWithImageFigure(_editor);
						
						int i=0;
						for (NodeEClass nodeEClass : _customizations) {
							++i;
						}
						
						IPath fileEditorPath = ((FileEditorInput) _editor.getEditorInput()).getPath();						
						IProject actualWorkingProject = CevineditProjectTools.getActualWorkingProjectEditor(_editor);						
						IFolder imagesFolderActualProject = actualWorkingProject.getFolder(".images/");									
								
								IFolder folderSRC = diagramProject.getFolder("src");
								IFolder figuresFolderDiagramProject = folderSRC.getFolder("figures/");
								
								if (!figuresFolderDiagramProject.exists())
								{
									try 
									{
										figuresFolderDiagramProject.create(IResource.NONE, true, null);
									} 
									catch (CoreException e1) 
									{
										e1.printStackTrace();
									}				
								}
								
								IFolder imgFolderDiagramProject = diagramProject.getFolder("img/");
								
								if (!imgFolderDiagramProject.exists())
								{
									try 
									{
										imgFolderDiagramProject.create(IResource.NONE, true, null);
									} 
									catch (CoreException e1) 
									{
										e1.printStackTrace();
									}	
								}			
								
								for (NodeEClass nodeEClass : _customizations) {
									
								if (imagesFolderActualProject.getFile(nodeEClass.getImagePath()).exists())
								{
									
									IFile newImageFileDiagramProject = imgFolderDiagramProject.getFile(nodeEClass.getImagePath());
									
									if (newImageFileDiagramProject.exists()) 
									{
										try 
										{
											newImageFileDiagramProject.delete(true, null);
										} catch (CoreException e1) {
											e1.printStackTrace();
										}
									}
									
									try 
									{
										newImageFileDiagramProject.create(imagesFolderActualProject.getFile(nodeEClass.getImagePath()).getContents(), true, null);
									} 
									catch (CoreException e1) {
										e1.printStackTrace();
									}	
								}
								
								IFile imageJavaClassDiagramProject = figuresFolderDiagramProject.getFile(nodeEClass.getName()+".java");
								
								if (!imageJavaClassDiagramProject.exists())
								{
									try 
									{
										String content = CevineditGenerator.imageJavaClassContent(nodeEClass.getName(), "img/", nodeEClass.getImagePath());						
										
										InputStream stream;
										try 
										{
											stream = new ByteArrayInputStream(content.getBytes("UTF-8"));
											imageJavaClassDiagramProject.create(stream, true, null);						

										}
										catch (UnsupportedEncodingException e1) {
											e1.printStackTrace();
										}
										
									} 
									catch (CoreException e1) 
									{
										e1.printStackTrace();
									}	

							
							
								}
								}
					}
				} 
				catch (Exception ex) {

				} 
				return Status.OK_STATUS;
			}

		};
		job.setPriority(Job.SHORT);
		job.schedule(); 

		
	
		
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
}

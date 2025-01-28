package org.cevinedit.core.tools;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.internal.utils.FileUtil;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.navigator.ResourceNavigator;

import cevinedit.presentation.CevineditEditor;
import cevinedit.provider.CevineditEditPlugin;


public class CevineditProjectTools 
{
	public static String DEFAULT_GENERATED_ECORE_FOLDER = ".ecore_generated";
	public static String DEFAULT_ORIGINAL_ECORE_FOLDER = ".ecore_original";
	
	public static String predefinedPathEcore()
	{
		return ".ecore/";
	}
	
	public static String coma(int c)
	{
		return (c>0) ? ", " :"";
	}
	
	public static String ListToString(String[] data)
	{
		String r = "";
		int c=0;
		for (String string : data) {
			r += coma(c) + string;
			c++;
		}
		
		return r;
	}
	
	public static String getActualPath()
	{
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		IEditorInput input = editor.getEditorInput();
		IPath path = ((FileEditorInput)input).getPath();

		return path.toString().substring(0, path.toString().lastIndexOf('/')+1);
	}
	


	
	
	
	public static String get_extension(String filename)
	{
		return filename.substring(filename.lastIndexOf('.')+1);
	}

	



	
	public static IProject getActualWorkingProjectEditor(CevineditEditor editor)
	{
		URI uri = editor.getEditingDomain().getResourceSet().getResources().get(0).getURI();
		
		String project = uri.toString().substring(19);
		String project_name = project.substring(0, project.indexOf("/"));
		
		return getWorkspaceProjectByName(project_name);
	}
	
	public static String getActualWorkingProjectNameEditor(CevineditEditor editor)
	{
		URI uri = editor.getEditingDomain().getResourceSet().getResources().get(0).getURI();
		
		String project = uri.toString().substring(19);
		String project_name = project.substring(0, project.indexOf("/"));
		
		return getActualWorkingProjectEditor(editor).getName();
	}
	

	
	public static IWorkspace getWorkspace()
	{
		return ResourcesPlugin.getWorkspace();
	}
	
	public static IWorkspaceRoot getWorkspaceRoot()
	{
		return getWorkspace().getRoot();
	}
	
	public static IProject[] getWorkspaceProjects()
	{
		return getWorkspaceRoot().getProjects();
	}
	
	public static IProject getWorkspaceProjectByName(String projectName)
	{
		for(IProject project : getWorkspaceProjects())
		{
			if (project.getName().equals(projectName))
				return project;
		}
		return null;
	}

	public static IProject getWorkspaceProjectByExtension(String extension)
	{		
		for(IProject project : getWorkspaceProjects())
		{
			
			if (project.getName().lastIndexOf(".diagram") >=0)
			{
				return project;
			}
		}
		
		return null;
	}	
	
	public static IFolder getWorkspaceProjectFolderByName(String projectName, String folderName)
	{
		IProject project =  getWorkspaceProjectByName(projectName);
		if (project == null) return null;
		
		
		
		return project.getFolder(folderName);
	}
	
	public static boolean existProjectFolderInWorkspace(String projectName, String folderName)
	{
		IProject project = getWorkspaceProjectByName(projectName);
		
		if (project == null) return false;
		
		IFolder folder = getWorkspaceProjectFolderByName(projectName, folderName);
		
		return folder.exists();
	}
	
	public static boolean existEcoreOriginalDirectory(String projectName)
	{
		return existProjectFolderInWorkspace(projectName, DEFAULT_ORIGINAL_ECORE_FOLDER);
	}

	public static boolean existEcoreGeneratedDirectory(String projectName)
	{
		return existProjectFolderInWorkspace(projectName, DEFAULT_GENERATED_ECORE_FOLDER);
	}
	
	  protected IFile getFile(CevineditEditor editor) 
	  { 
	    Resource resource = (Resource)editor.getEditingDomain().getResourceSet().getResources().get(0); 
	    if (resource != null) 
	    { 
	      URI uri = resource.getURI(); 
	      uri = resource.getResourceSet().getURIConverter().normalize(uri); 
	      String scheme = uri.scheme(); 
	      if ("platform".equals(scheme) && uri.segmentCount() > 1 && "resource".equals(uri.segment(0))) 
	      { 
	        StringBuffer platformResourcePath = new StringBuffer(); 
	        for (int j = 1, size = uri.segmentCount(); j < size; ++j) 
	        { 
	          platformResourcePath.append('/'); 
	          platformResourcePath.append(uri.segment(j)); 
	        } 
	        return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString())); 
	      } 
	    } 
	    return null; 
	  } 
	
	  public static void copyImageToProjectFolderImages(CevineditEditor editor, URI imageUri)
	  {
		  	String path = null;
			if (imageUri.toString().contains("platform"))
			{
			
				String workspace_os_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getAbsolutePath();
				String file_path = imageUri.toString().replaceAll("platform:/resource/", "");
			
				path = workspace_os_path + "/"+file_path;
				path = path.replace('/', '\\');
			}
			else
			{
				path = imageUri.toString();	
				path = path.substring(6);
			}
			
			IProject project = getActualWorkingProjectEditor(editor);
			IFolder imagesFolder = project.getFolder(".images");
			
			if (!imagesFolder.exists())
			{
				try 
				{
					imagesFolder.create(IResource.NONE, true, null);
				
				} 
				catch (CoreException e1) 
				{
					
				}
			}
			String fileName = imageUri.toFileString().substring(imageUri.toFileString().lastIndexOf("\\")+1);
			
			if (imagesFolder.exists())
			{
				IFile imageFileProject = imagesFolder.getFile(fileName);
			    FileInputStream fileStream = null;
					try {
						fileStream = new FileInputStream(path);
						imageFileProject.create(fileStream, true, null);
					} 
					catch (FileNotFoundException e) {
						e.printStackTrace();
					} 
					catch (CoreException e) {
						e.printStackTrace();
					}
					
			}			
	  }
	  
	  
	public static void generateCevineditDirectories(CevineditEditor editor, URI pathEcoreSelected)
	{
		
			String s2 = pathEcoreSelected.path();
			String path = null;
			if (pathEcoreSelected.toString().contains("platform"))
			{
			
			String workspace_os_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getAbsolutePath();
			String file_path = pathEcoreSelected.toString().replaceAll("platform:/resource/", "");
			
			path = workspace_os_path + "/"+file_path;
			path = path.replace('/', '\\');
			}
			else
			{
				path = pathEcoreSelected.toString();	
				path = path.substring(6);
			}
			
		
			
			IProject project = getActualWorkingProjectEditor(editor);
			
			
			IFolder _folder_ecore_generated = project.getFolder(".ecore_generated");
			IFolder _folder_ecore_original = project.getFolder(".ecore_original");
			IFolder _folder_images = project.getFolder(".images");
			IFolder _folder_icons = project.getFolder(".icons");

			
			if (!_folder_ecore_original.exists())
			{
				try 
				{
					_folder_ecore_original.create(IResource.NONE, true, null);
				
				} 
				catch (CoreException e1) 
				{				
				}		
				
				if (_folder_ecore_original.exists())
				{
					IFile newOriginalEcore = _folder_ecore_original.getFile("original.ecore");
				    FileInputStream fileStream = null;
						try {
							fileStream = new FileInputStream(path);
							newOriginalEcore.create(fileStream, true, null);
						} 
						catch (FileNotFoundException e) {
							e.printStackTrace();
						} 
						catch (CoreException e) {
							e.printStackTrace();
						}					
				}
			}

			
			if (!_folder_ecore_generated.exists())
			{

				try 
				{
					_folder_ecore_generated.create(IResource.NONE, true, null);				
				} 
				catch (CoreException e1) 
				{				
			
				}	
				if (_folder_ecore_generated.exists())
				{
					IFile newGeneratedEcore = _folder_ecore_generated.getFile("generated.ecore");
				    FileInputStream fileStream = null;
						try {
							fileStream = new FileInputStream(path);
							newGeneratedEcore.create(fileStream, true, null);
						} 
						catch (FileNotFoundException e) {
							e.printStackTrace();
						} 
						catch (CoreException e) {
							e.printStackTrace();
						}					
				}				
			}
			
			if (!_folder_images.exists())
			{

				try 
				{
					_folder_images.create(IResource.NONE, true, null);				
				} 
				catch (CoreException e1) 
				{				
			
				}
			}			
			
			if (!_folder_icons.exists())
			{

				try 
				{
					_folder_icons.create(IResource.NONE, true, null);				
				} 
				catch (CoreException e1) 
				{				
			
				}
			}			
			
			IResource[] iresources = null;
			try 
			{
				iresources = project.members();
			} 
			catch (CoreException e) 
			{
				
			}
			
		
			
			for (IResource iResource : iresources) 
			{
				if (iResource instanceof IFile)
				{
					IFile _file = (IFile) iResource;

					String output = "IFile: "+iResource.getName() + " extensión: "+CevineditProjectTools.get_extension(iResource.getName());

				}				
			}
			
			

		

	}
	
	public static boolean checkCevineditWorkingDirectories(CevineditEditor editor)
	{
		String projectName = getActualWorkingProjectNameEditor(editor);
		return existEcoreGeneratedDirectory(projectName) && 
				existEcoreOriginalDirectory(projectName);
	}
	

}

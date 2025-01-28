package org.cevinedit.editor.view.listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.cevinedit.config.CevineditConfig;
import org.cevinedit.core.tools.CevineditProjectTools;
import org.cevinedit.editor.view.constants.CevineditSashConstants;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorExportGMFPlugins implements SelectionListener {
	protected CevineditEditor _editor = null;
	protected Resource _model = null;
	public CevineditEditorExportGMFPlugins(CevineditEditor editor)
	{
		_editor = editor;
		_model = editor.getCevineditModelResource();
	}
	
	public static CevineditEditorExportGMFPlugins i(CevineditEditor editor)
	{
		return new CevineditEditorExportGMFPlugins(editor);
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		Shell _shell = _editor.getMainLayer().getShell();
		
        DirectoryDialog dlg = new DirectoryDialog(_shell);
        dlg.setText("SWT's DirectoryDialog");

        dlg.setMessage("Select a directory");
        String dir = dlg.open();
        if (dir != null) {

          String actualProjectName = CevineditProjectTools.getActualWorkingProjectEditor(_editor).getName();
  		IProject newProject = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf/");
  		  
  		

  		String sourceFolder = newProject.getLocationURI().getPath().replace('/', '\\').substring(1);
  		String targetFolder = dir + "/" + newProject.getName()+"/";
    	File srcFolder = new File(sourceFolder);
    	File destFolder = new File(targetFolder);
 
    	if(srcFolder.exists()){ 
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException ex){
        	ex.printStackTrace();
                System.exit(0);
           }
        }
    	IProject newProjectDiagram = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.diagram/");

  		sourceFolder = newProjectDiagram.getLocationURI().getPath().replace('/', '\\').substring(1);
  		targetFolder = dir + "/" + newProjectDiagram.getName()+"/";
    	srcFolder = new File(sourceFolder);
    	destFolder = new File(targetFolder);
 
    	if(srcFolder.exists()){ 
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException ex){
        	ex.printStackTrace();
                System.exit(0);
           }
        } 
  		IProject newProjectEdit = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.edit/");

  		sourceFolder = newProjectEdit.getLocationURI().getPath().replace('/', '\\').substring(1);
  		targetFolder = dir + "/" + newProjectEdit.getName()+"/";
    	srcFolder = new File(sourceFolder);
    	destFolder = new File(targetFolder);
 
    	if(srcFolder.exists()){ 
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException ex){
        	ex.printStackTrace();
                System.exit(0);
           }
        }
  		IProject newProjectEditor = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.editor/");

  		sourceFolder = newProjectEditor.getLocationURI().getPath().replace('/', '\\').substring(1);
  		targetFolder = dir + "/" + newProjectEditor.getName()+"/";
    	srcFolder = new File(sourceFolder);
    	destFolder = new File(targetFolder);
 
    	if(srcFolder.exists()){ 
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException ex){
        	ex.printStackTrace();
                System.exit(0);
           }
        }
  		IProject newProjectTest = CevineditProjectTools.getWorkspaceRoot().getProject(actualProjectName+ "_gmf.tests/");    	
  		
  		sourceFolder = newProjectTest.getLocationURI().getPath().replace('/', '\\').substring(1);
  		targetFolder = dir + "/" + newProjectTest.getName()+"/";
    	srcFolder = new File(sourceFolder);
    	destFolder = new File(targetFolder);
 
    	if(srcFolder.exists()){ 
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException ex){
        	ex.printStackTrace();
                System.exit(0);
           }
        }    	
        }
	}

 
    public static void copyFolder(File src, File dest)
    	throws IOException{
 
    	if(src.isDirectory()){
 
    		if(!dest.exists()){
    		   dest.mkdir();
    		}
 
    		String files[] = src.list();
 
    		for (String file : files) {
    		   File srcFile = new File(src, file);
    		   File destFile = new File(dest, file);
    		   copyFolder(srcFile,destFile);
    		}
 
    	}
    	else
    	{
    		InputStream in = new FileInputStream(src);
    	        OutputStream out = new FileOutputStream(dest); 
 
    	        byte[] buffer = new byte[1024];
 
    	        int length;
    	        while ((length = in.read(buffer)) > 0){
    	    	   out.write(buffer, 0, length);
    	        }
 
    	        in.close();
    	        out.close();
    	}
    }
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {

	}

	public static void main(String[] args) {

	}

}

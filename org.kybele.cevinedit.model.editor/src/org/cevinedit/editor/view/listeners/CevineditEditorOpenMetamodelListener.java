
package org.cevinedit.editor.view.listeners;

import org.cevinedit.config.CevineditConfig;
import org.cevinedit.core.tools.CevineditProjectTools;
import org.cevinedit.editor.view.constants.CevineditSashConstants;
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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorOpenMetamodelListener  implements SelectionListener  {
	protected CevineditEditor _editor = null;
	public CevineditEditorOpenMetamodelListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	@Override
	public void widgetSelected(SelectionEvent e) {
		
			Shell _shell = _editor.getMainLayer().getShell();
		
			ResourceDialog rs_dialog = new ResourceDialog(_shell, _editor.getTextLang("CevineditEditorOpenMetamodelListener", "ResourceDialogTitle"), SWT.NONE);
			
			if (rs_dialog.open() == rs_dialog.OK)
			{
				if (!rs_dialog.getURIs().get(0).fileExtension().equals("ecore"))
				{
					String titleDialog =  _editor.getTextLang("CevineditEditorOpenMetamodelListener", "MessageDialogErrorTitleA");
					String contentDialog = _editor.getTextLang("CevineditEditorOpenMetamodelListener", "MessageDialogErrorContentA");;
					MessageDialog.openError(_shell, titleDialog, contentDialog+" "+rs_dialog.getURIs().get(0).fileExtension()+". You must selected only .ecore files.");
				}
				else
				{			
					CevineditProjectTools.generateCevineditDirectories(_editor, rs_dialog.getURIs().get(0));
					String projectName = CevineditProjectTools.getActualWorkingProjectNameEditor(_editor);
					
					URI newUri = URI.createPlatformResourceURI(CevineditConfig.getProjectPathToEcoreOriginal(projectName));
						
					_editor.getMetamodelResourceSet().getResource(newUri, true);
					
					ResourceSet _resourceSetMetaModel = _editor.getMetamodelResourceSet();
					
					_editor.getMetamodelViewer().setInput(_resourceSetMetaModel);
					
					Resource _resourceMetamodelEcore = _resourceSetMetaModel.getResources().get(0);
					
					EObject _rootEObjectEcoreMetamodel = _resourceMetamodelEcore.getContents().get(0);
					
					_editor.getMetamodelViewer().setSelection(new StructuredSelection(_rootEObjectEcoreMetamodel), true);
					SashManager.setWeights(_editor.getMainLayer(), CevineditSashConstants.TwoEditors);
					
					SashManager.setWeights(_editor.getMainLayer(), CevineditSashConstants.TwoEditors);
					SashManager.setWeights(_editor.getEditorSashForm(), CevineditSashConstants.ShowEditorTools);					
				}
			}


	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
}

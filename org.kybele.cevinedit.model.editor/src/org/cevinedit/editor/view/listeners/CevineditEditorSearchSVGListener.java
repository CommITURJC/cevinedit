package org.cevinedit.editor.view.listeners;

import org.cevinedit.core.tools.CevineditProjectTools;
import org.cevinedit.editor.view.constants.CevineditSashConstants;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorSearchSVGListener  implements SelectionListener  {
	protected CevineditEditor _editor = null;
	public CevineditEditorSearchSVGListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	@Override
	public void widgetSelected(SelectionEvent e) {
			ResourceDialog rs_dialog = new ResourceDialog(_editor.getMainLayer().getShell(), "Select SVG File", SWT.NONE);
			
			if (rs_dialog.open() == rs_dialog.OK)
			{
				if (!rs_dialog.getURIs().get(0).fileExtension().equals("svg"))
				{
					MessageDialog.openError(_editor.getMainLayer().getShell(), "Incorrect Source Metamodel", "Invalid Extension "+rs_dialog.getURIs().get(0).fileExtension()+". You must selected only .ecore files.");
				}
				else
				{			
					CevineditProjectTools.generateCevineditDirectories(_editor, rs_dialog.getURIs().get(0));
				}
			}

		String project_name = CevineditProjectTools.getActualWorkingProjectNameEditor(_editor);
		URI newUri = URI.createPlatformResourceURI(project_name+"/.ecore_original/original.ecore");
			
		_editor.getMetamodelResourceSet().getResource(newUri, true);
		_editor.getMetamodelViewer().setInput(_editor.getMetamodelResourceSet());
		_editor.getMetamodelViewer().setSelection(new StructuredSelection(_editor.getMetamodelResourceSet().getResources().get(0).getContents().get(0)), true);
		SashManager.setWeights(_editor.getMainLayer(), CevineditSashConstants.TwoEditors);
		
		SashManager.setWeights(_editor.getMainLayer(), CevineditSashConstants.TwoEditors);
		SashManager.setWeights(_editor.getEditorSashForm(), CevineditSashConstants.ShowEditorTools);
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
}

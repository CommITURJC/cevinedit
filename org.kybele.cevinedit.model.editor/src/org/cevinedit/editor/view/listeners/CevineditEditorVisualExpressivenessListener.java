package org.cevinedit.editor.view.listeners;

import org.cevinedit.core.analytics.CevineditAnalytics;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorVisualExpressivenessListener implements SelectionListener 
{
	protected CevineditEditor _editor = null;
	public CevineditEditorVisualExpressivenessListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	
	public static CevineditEditorVisualExpressivenessListener i(CevineditEditor editor)
	{
		return new CevineditEditorVisualExpressivenessListener(editor);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		
		String message = "";
		
		CevineditAnalytics.i(_editor).generateVisualExpressiveness();
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
}
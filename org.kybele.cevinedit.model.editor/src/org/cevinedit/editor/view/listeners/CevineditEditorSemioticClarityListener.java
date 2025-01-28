package org.cevinedit.editor.view.listeners;

import org.cevinedit.core.analytics.CevineditAnalytics;
import org.cevinedit.editor.view.dialogs.ReportDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorSemioticClarityListener implements SelectionListener 
{
	protected CevineditEditor _editor = null;
	public CevineditEditorSemioticClarityListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	
	public static CevineditEditorSemioticClarityListener i(CevineditEditor editor)
	{
		return new CevineditEditorSemioticClarityListener(editor);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		
		CevineditAnalytics.i(_editor).generateSemioticClarityInform();
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
}
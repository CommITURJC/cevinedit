package org.cevinedit.editor.view.listeners;

import org.cevinedit.editor.view.constants.CevineditToolsLabels;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorToolsModifyListener implements ModifyListener {
	protected CevineditEditor _editor = null;
	protected String _property = null;
	protected String _lastValue = "";
	public CevineditEditorToolsModifyListener(CevineditEditor editor, String property)
	{
		_editor = editor;
		_property = property;
	}
	
	public static CevineditEditorToolsModifyListener i(CevineditEditor editor, String property)
	{
		return new CevineditEditorToolsModifyListener(editor, property);
	}

	@Override
	public void modifyText(ModifyEvent e) {

		if (e.getSource() instanceof Combo)
		{
			_editor.getActualPersonalization().remove(_property);
			_editor.getActualPersonalization().put(_property, ((Combo)e.getSource()).getText());

		}
	}
}

package org.cevinedit.editor.view.dialogs;

import org.cevinedit.core.tools.CevineditEcoreTools;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import cevinedit.presentation.CevineditEditor;

public class EClass2LinkDialog extends Dialog implements SelectionListener {

	protected CevineditEditor _editor = null;
	protected EClass _selectedEClass = null;
	protected String[] _returnData = null;
	
	protected Combo _comboSourceEReference = null;
	protected Combo _comboTargetEReference = null;
	
	public String[] getData()
	{
		return _returnData;
	}
	
	public EClass2LinkDialog(CevineditEditor editor, Shell parentShell, EClass selectedEClass) {
		super(parentShell);
		_editor = editor;
		_selectedEClass = selectedEClass;
	}
	protected Control createDialogArea(Composite parent) 
	{
		Composite composite = ( Composite )super.createDialogArea(parent);
		composite.setLayout(new FillLayout());
		
		try 
		{
			composite.getShell().setText(_editor.getTextLang("EClass2LinkDialog", "DialogTitle"));

			Composite compostie_children = new Composite(composite, SWT.NONE);
			
			RowLayout layout_children = new RowLayout(SWT.VERTICAL);
			layout_children.marginHeight = 10;
			layout_children.marginWidth = 10;
			compostie_children.setLayout(layout_children);
	
			Label labelSourceLink = new Label(compostie_children, SWT.NONE);
			
			labelSourceLink.setText(_editor.getTextLang("EClass2LinkDialog", "SelectSourceEReferenceLabel"));

			String ereferencesNoContainement[] = CevineditEcoreTools.EReferenceList2StringArray(CevineditEcoreTools.getEClassEReferencesNoContainement(_selectedEClass));
				
			_comboSourceEReference = new Combo(compostie_children, SWT.NONE);
			_comboSourceEReference.setItems(ereferencesNoContainement);
			_comboSourceEReference.setText(ereferencesNoContainement[0]);
				
			Label labelTargetLink = new Label(compostie_children, SWT.NONE);
			labelTargetLink.setText(_editor.getTextLang("EClass2LinkDialog", "SelectTargetEReferenceLabel"));
				
			_comboTargetEReference = new Combo(compostie_children, SWT.NONE);
			_comboTargetEReference.setItems(ereferencesNoContainement);				
			_comboTargetEReference.setText(ereferencesNoContainement[0]);
				
				
			_comboSourceEReference.addSelectionListener(this);
			_comboTargetEReference.addSelectionListener(this);
			
			_returnData = new String[2];
			_returnData[0] = _comboSourceEReference.getText();
			_returnData[1] = _comboTargetEReference.getText();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return composite;
	}
	@Override
	public void widgetSelected(SelectionEvent e) {
		if (e.getSource() instanceof Combo)
		{
			_returnData = new String[2];
			_returnData[0] = _comboSourceEReference.getText();
			_returnData[1] = _comboTargetEReference.getText();
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {

	}

}

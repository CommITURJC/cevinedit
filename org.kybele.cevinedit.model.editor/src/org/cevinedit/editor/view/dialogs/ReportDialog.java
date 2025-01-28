package org.cevinedit.editor.view.dialogs;

import java.awt.Button;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import cevinedit.presentation.CevineditEditor;

public class ReportDialog extends Dialog implements SelectionListener {

	protected CevineditEditor _editor = null;
	protected String _title;
	protected String _inform;
	
	public ReportDialog(CevineditEditor editor, String title, String inform) 
	{
		super(editor.getMainLayer().getShell());

		_editor = editor;
		_title = title;
		_inform = inform;
	
	}
	
	@Override
	protected org.eclipse.swt.widgets.Button createButton(Composite parent,
			int id, String label, boolean defaultButton) {
		if (id == IDialogConstants.CANCEL_ID) return null;
		return super.createButton(parent, id, label, defaultButton);
	}
	protected Control createDialogArea(Composite parent) 
	{
		Composite composite = ( Composite )super.createDialogArea(parent);
		composite.setSize(300, 500);
		FillLayout layout_parent = new FillLayout();
		layout_parent.type = SWT.VERTICAL;
		composite.setLayout(layout_parent);
		
		try 
		{
			composite.getShell().setText(_title);

			Composite compostie_children = new Composite(composite, SWT.NONE);

			
			RowLayout layout_children = new RowLayout(SWT.VERTICAL);

			layout_children.marginHeight = 10;
			layout_children.marginWidth = 10;
			layout_children.fill = true;
			layout_children.pack = true;
			compostie_children.setLayout(layout_children);
	
			Label labelSourceLink = new Label(compostie_children, SWT.NONE);
			
			labelSourceLink.setText(_title);
			
			Text textInform = new Text(compostie_children, SWT.MULTI | SWT.V_SCROLL| SWT.WRAP );

			
			textInform.setFont(new Font(_editor.getMainLayer().getShell().getDisplay(), new FontData("Courier New", 9, SWT.BOLD)));
			textInform.setText(_inform);
			RowData rdata = new RowData();
			rdata.width = 400;
			rdata.height = 300;
			textInform.setLayoutData(rdata);
			

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return composite;
	}
	@Override
	public void widgetSelected(SelectionEvent e) {
		
	}
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}


}

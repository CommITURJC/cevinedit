package org.cevinedit.editor.view.dialogs;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import cevinedit.presentation.CevineditEditor;

public class EClassTransformDialog extends Dialog implements SelectionListener {

	protected CevineditEditor _editor = null;
	protected int conversion_type = -1;
	
	public int get_conversion_type()
	{
		return conversion_type;
	}
	
	public EClassTransformDialog(CevineditEditor editor, Shell parentShell) {
		super(parentShell);

		_editor = editor;
		
	}
	protected Control createDialogArea(Composite parent) 
	{
		Composite composite = ( Composite )super.createDialogArea(parent);
		composite.setLayout(new FillLayout());
		
		try 
		{
			composite.getShell().setText(_editor.getTextLang("EClassTransformDialog", "DialogTitle"));
			Composite compostie_children = new Composite(composite, SWT.NONE);
			RowLayout layout_children = new RowLayout(SWT.VERTICAL);
			layout_children.marginHeight = 10;
			layout_children.marginWidth = 10;
			compostie_children.setLayout(layout_children);

			{
				Label text = new Label(compostie_children, SWT.NONE);
				text.setText(_editor.getTextLang("EClassTransformDialog", "SelectTransformationLabel"));
				
				Button radio_diagram = new Button (compostie_children, SWT.RADIO);

				radio_diagram.setText (_editor.getTextLang("EClassTransformDialog", "ConvertToDiagramLabel"));
				radio_diagram.addSelectionListener(this);
				
				Button radio_node = new Button (compostie_children, SWT.RADIO);
				radio_node.setText (_editor.getTextLang("EClassTransformDialog", "ConvertToNodeLabel"));
				radio_node.addSelectionListener(this);
				
				Button radio_link = new Button (compostie_children, SWT.RADIO); 
				radio_link.setText (_editor.getTextLang("EClassTransformDialog", "ConvertToLinkLabel"));		
				radio_link.addSelectionListener(this);
			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return composite;
	}
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}
	@Override
	public void widgetSelected(SelectionEvent e) {
		Button radio = (Button) e.getSource();
		
		if (radio.getText().equals(_editor.getTextLang("EClassTransformDialog", "ConvertToDiagramLabel")))
		{
			conversion_type = EClassTransforms.EClassToDiagram;
		}
		else
			if (radio.getText().equals(_editor.getTextLang("EClassTransformDialog", "ConvertToNodeLabel")))
			{
				conversion_type = EClassTransforms.EClassToNode;
			}
			else
				if (radio.getText().equals(_editor.getTextLang("EClassTransformDialog", "ConvertToLinkLabel")))
				{
					conversion_type = EClassTransforms.EClassToLink;
				}
	}

}

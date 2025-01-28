package org.cevinedit.editor.view.listeners;

import org.cevinedit.editor.view.constants.CevineditToolsLabels;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import cevinedit.Brightness;
import cevinedit.Color;
import cevinedit.CompartmentEReferenceCont;
import cevinedit.FontStyle;
import cevinedit.LayoutCompartment;
import cevinedit.LinkEClass;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.LinkFigure;
import cevinedit.NodeEClass;
import cevinedit.NodeFigure;
import cevinedit.PersonalizedElement;
import cevinedit.Placement;
import cevinedit.Texture;
import cevinedit.presentation.CevineditEditor;

public class CevineditEditorApplyChangesListener implements SelectionListener 
{
	protected CevineditEditor _editor = null;
	public CevineditEditorApplyChangesListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	
	protected void showConfirmDialog(Shell shell, String element)
	{
		MessageDialog.openInformation(_editor.getMainLayer().getShell(), 
									  _editor.getTextLang("CevineditEditorApplyChangesListener", "MessageDialogTitle"), 
									  _editor.getTextLang("CevineditEditorApplyChangesListener", "MessageDialogContent")+ " " + element);		
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		
		if (_editor.getLastPersonalizedElementSelected() instanceof NodeEClass)
		{
			
			
			NodeEClass node = (NodeEClass) _editor.getLastPersonalizedElementSelected();
			
			
			node.setBackgroundColor(Color.get(_editor.getActualPersonalization().get(CevineditToolsLabels.BACKGROUND_COLOR)));
			node.setBorderColor(Color.get(_editor.getActualPersonalization().get(CevineditToolsLabels.BORDER_COLOR)));
			node.setBorderTexture(Texture.get(_editor.getActualPersonalization().get(CevineditToolsLabels.BORDER_TEXTURE)));
			node.setBorderWidth(Integer.valueOf(_editor.getActualPersonalization().get(CevineditToolsLabels.BORDER_WIDTH)));
			node.setBrightness(Brightness.get(_editor.getActualPersonalization().get(CevineditToolsLabels.BRIGHTNESS)));
			node.setFigure(NodeFigure.get(_editor.getActualPersonalization().get(CevineditToolsLabels.NODE_FIGURE)));
			if (node.getFigure().getLiteral().equals("Image") || node.getFigure().getLiteral().equals("SVG"))
			{
				if (_editor.getActualPersonalization().containsKey("imagePath"))
					node.setImagePath(_editor.getActualPersonalization().get("imagePath"));
			}
			else if (node.getFigure().getLiteral().equals("Polygon"))
			{
				if (_editor.getActualPersonalization().containsKey("pointsPolygon"))
					node.setListPointsPolygon(_editor.getActualPersonalization().get("pointsPolygon"));
			}
			node.setResizable(Boolean.valueOf(_editor.getActualPersonalization().get(CevineditToolsLabels.RESIZABLE)));
			node.setSize(_editor.getActualPersonalization().get(CevineditToolsLabels.SIZE));
			node.setLabelPlacement(Placement.get(_editor.getActualPersonalization().get(CevineditToolsLabels.LABEL_PLACEMENT)));
			node.setLabelFontStyle(FontStyle.get(_editor.getActualPersonalization().get(CevineditToolsLabels.LABEL_FONTSTYLE)));
			node.setLabel(_editor.getActualPersonalization().get(CevineditToolsLabels.LABEL));
			
			showConfirmDialog(_editor.getMainLayer().getShell(), node.getName());

			_editor.notifyChangesInEditor();
			
		}
		if (_editor.getLastPersonalizedElementSelected() instanceof LinkEClass)
		{
			LinkEClass link = (LinkEClass) _editor.getLastPersonalizedElementSelected();
			
			
			link.setBrightness(Brightness.get(_editor.getActualPersonalization().get(CevineditToolsLabels.BRIGHTNESS)));
			link.setColor(Color.get(_editor.getActualPersonalization().get(CevineditToolsLabels.COLOR)));
			link.setLabelFontStyle(FontStyle.get(_editor.getActualPersonalization().get(CevineditToolsLabels.LABEL_FONTSTYLE)));
			
			link.setSourceDecoration(LinkFigure.get(_editor.getActualPersonalization().get(CevineditToolsLabels.SOURCE_DECORATION)));
			link.setTargetDecoration(LinkFigure.get(_editor.getActualPersonalization().get(CevineditToolsLabels.TARGET_DECORATION)));
			link.setTexture(Texture.get(_editor.getActualPersonalization().get(CevineditToolsLabels.TEXTURE)));
			link.setWidth(Integer.valueOf(_editor.getActualPersonalization().get(CevineditToolsLabels.WIDTH)));
			link.setLabel(_editor.getActualPersonalization().get(CevineditToolsLabels.LABEL));
			showConfirmDialog(_editor.getMainLayer().getShell(), link.getName());
			_editor.notifyChangesInEditor();	
			
		}
		
		if (_editor.getLastPersonalizedElementSelected() instanceof LinkEReferenceNonCont)
		{
			LinkEReferenceNonCont lnc = (LinkEReferenceNonCont) _editor.getLastPersonalizedElementSelected();
			
			lnc.setBrightness(Brightness.get(_editor.getActualPersonalization().get(CevineditToolsLabels.BRIGHTNESS)));
			lnc.setColor(Color.get(_editor.getActualPersonalization().get(CevineditToolsLabels.COLOR)));
			lnc.setLabelFontStyle(FontStyle.get(_editor.getActualPersonalization().get(CevineditToolsLabels.LABEL_FONTSTYLE)));
			
			lnc.setSourceDecoration(LinkFigure.get(_editor.getActualPersonalization().get(CevineditToolsLabels.SOURCE_DECORATION)));
			lnc.setTargetDecoration(LinkFigure.get(_editor.getActualPersonalization().get(CevineditToolsLabels.TARGET_DECORATION)));
			lnc.setTexture(Texture.get(_editor.getActualPersonalization().get(CevineditToolsLabels.TEXTURE)));
			lnc.setWidth(Integer.valueOf(_editor.getActualPersonalization().get(CevineditToolsLabels.WIDTH)));
			lnc.setLabel(_editor.getActualPersonalization().get(CevineditToolsLabels.LABEL));
			showConfirmDialog(_editor.getMainLayer().getShell(), lnc.getName());
			_editor.notifyChangesInEditor();
		}
		if (_editor.getLastPersonalizedElementSelected() instanceof CompartmentEReferenceCont)
		{
			CompartmentEReferenceCont erefcont = (CompartmentEReferenceCont) _editor.getLastPersonalizedElementSelected();
			erefcont.setCollapsible(Boolean.valueOf(_editor.getActualPersonalization().get(CevineditToolsLabels.COLLAPSIBLE)));
			erefcont.setLayout(LayoutCompartment.get(_editor.getActualPersonalization().get(CevineditToolsLabels.LAYOUT)));
			
			showConfirmDialog(_editor.getMainLayer().getShell(), erefcont.getName());
			_editor.notifyChangesInEditor();
		}		
		
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
}

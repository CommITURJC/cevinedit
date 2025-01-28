package org.cevinedit.editor.view.listeners;

import org.cevinedit.core.tools.CevineditEcoreTools;
import org.cevinedit.editor.view.dialogs.EClass2LinkDialog;
import org.cevinedit.editor.view.dialogs.EClassTransformDialog;
import org.cevinedit.editor.view.dialogs.EClassTransforms;
import org.cevinedit.editor.view.validators.CevineditValidator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import cevinedit.CEViNEditRoot;
import cevinedit.CevineditFactory;
import cevinedit.CompartmentEReferenceCont;
import cevinedit.Diagram;
import cevinedit.LinkEClass;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.NodeEClass;
import cevinedit.PersonalizedElement;
import cevinedit.presentation.CevineditEditor;

public class CevineditEditorMetamodelViewerListener implements ISelectionChangedListener {

	
	protected CevineditEditor _editor = null;
	public CevineditEditorMetamodelViewerListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	
	public static CevineditEditorMetamodelViewerListener i(CevineditEditor editor)
	{
		return new CevineditEditorMetamodelViewerListener(editor);
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {

				StructuredSelection selection = (StructuredSelection) event.getSelection();
				Object selected_item = selection.getFirstElement();
				if (selected_item instanceof EClass)
				{
					EClass eclass_selected = (EClass) selection.getFirstElement();

					
					_editor.setLastEClassSelected(eclass_selected);
					
					
					EClassTransformDialog dialog = new EClassTransformDialog(_editor, _editor.getMainLayer().getShell());
					
					if (dialog.open() == Dialog.OK)
					{
						
						_editor.setCevineditModelRoot((CEViNEditRoot) _editor.getEditingDomain().getResourceSet().getResources().get(0).getContents().get(0));
						Diagram diagram = (Diagram) _editor.getCevineditModelRoot().getDiagram();
						switch (dialog.get_conversion_type()) {

						

						case EClassTransforms.EClassToNode: 
							if (diagram == null)
							{
								MessageDialog.openError(_editor.getMainLayer().getShell(), 
													 	_editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorTitleA"), 
													 	_editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorContentA"));
								break;
							}

							NodeEClass node = CevineditFactory.eINSTANCE.createNodeEClass();
							node.setName(eclass_selected.getName());
								
							boolean find_node = false;
							for (PersonalizedElement _element : diagram.getContainsElem()) {
								if (!(_element instanceof NodeEClass)) continue;
								if (_element.getName().equals(eclass_selected.getName()))
								{
									find_node = true;
									break;
								}
							}
							if (!find_node)
								diagram.getContainsElem().add(node);				
							
							_editor.notifyChangesInEditor();
							break;

						case EClassTransforms.EClassToLink: 
							
							if (!CevineditValidator.CevineditModelHasDiagram(_editor.getCevineditModelRoot()))
							{
								MessageDialog.openError(_editor.getMainLayer().getShell(), 
														_editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorTitleB"),
														_editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorContentB"));
								break;
							}
							if (CevineditValidator.CevineditModelHasElementWithName(_editor.getCevineditModelRoot(), eclass_selected.getName()))
							{
								MessageDialog.openError(_editor.getMainLayer().getShell(), 
														_editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorTitleC"), 
														eclass_selected.getName() + " "+ _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorContentC"));
								break;
							}
							
							if (CevineditEcoreTools.numberOfEClassEReferencesNoContainement(eclass_selected)<2)
							{
								String title_error = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorTitleD");
								String message_error = eclass_selected.getName() + " " + _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorContentD");
										
								MessageDialog.openError(_editor.getMainLayer().getShell(), title_error, message_error);
								break;
							}
							
							
							EClass2LinkDialog dialog2 = new EClass2LinkDialog(_editor, _editor.getMainLayer().getShell(), eclass_selected);
							
							if(dialog2.open() == Dialog.OK)
							{
								String []data = dialog2.getData(); 
								
								if (data[0].equals(data[1]))
								{
									String title_error = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorTitleE");
									String message_error = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorContentE");
									MessageDialog.openError(_editor.getMainLayer().getShell(), title_error, message_error);
									break;
								}
								else
								{
								
									LinkEClass link = CevineditFactory.eINSTANCE.createLinkEClass();
									link.setName(eclass_selected.getName());
									link.setSource(data[0]);
									link.setTarget(data[1]);
	
									diagram.getContainsElem().add(link);		
									_editor.notifyChangesInEditor();	
								}
							}
							
										

							break;

						case EClassTransforms.EClassToDiagram:
							
							boolean replace_diagram = false;
							boolean replace_elements_of_diagram = false;
							if (CevineditValidator.CevineditModelHasDiagram(_editor.getCevineditModelRoot()))
							{
								String title_confirm = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmTitleA");
								String message_confirm = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmContentA_a")+" "+_editor.getCevineditModelRoot().getDiagram().getName();
										message_confirm += " "+_editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmContentA_b")+" "+eclass_selected.getName()+" "+_editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmContentA_c");
										replace_diagram = MessageDialog.openConfirm(_editor.getMainLayer().getShell(), title_confirm, message_confirm);
								
								if (replace_diagram)
								{
									String title_confirm2 = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmTitleB");
								
										String message_confirm2 = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmContentB");
										
										replace_elements_of_diagram = MessageDialog.openConfirm(_editor.getMainLayer().getShell(), title_confirm2, message_confirm2);
								}
							}
							else
							{
								replace_diagram = true;
							}
							
							if (replace_diagram)
							{
								Diagram new_diagram = CevineditFactory.eINSTANCE.createDiagram();
								
								new_diagram.setName(eclass_selected.getName());
								
								new_diagram.setModelExtension(eclass_selected.getEPackage().getName());

								if (replace_elements_of_diagram)
								{
									if (CevineditValidator.CevineditModelHasElements(_editor.getCevineditModelRoot()))													
										new_diagram.getContainsElem().addAll(_editor.getCevineditModelRoot().getDiagram().getContainsElem());
								}
								
								_editor.getCevineditModelRoot().setDiagram(new_diagram);
								_editor.getCevineditModelRoot().setSourceMM(eclass_selected.getEPackage().getName()+".ecore");
							}
							_editor.notifyChangesInEditor();
							break;
						}

						 
					}
					_editor.notifyChangesInEditor();
					_editor.getCevineditModelEditorViewer().expandAll();					
				}
				
				if ((selected_item instanceof EReference) && (((EReference) selected_item).isContainment()))
				{
					if (!CevineditValidator.CevineditModelHasDiagram(_editor.getCevineditModelRoot()))
					{
						MessageDialog.openError(_editor.getMainLayer().getShell(), _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorTitleF"), _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorContentF"));
						
					}
					else
					{
						EReference eref = (EReference) selected_item;
						String message = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmContentC") +" "+ eref.getName() + "?";
						boolean personalize = MessageDialog.openConfirm(_editor.getMainLayer().getShell(), _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmContentC")+" "+eref.getName()+"?", message);
						
						if (personalize)
						{
							CompartmentEReferenceCont erefcont = CevineditFactory.eINSTANCE.createCompartmentEReferenceCont();
							erefcont.setName(eref.getEContainingClass().getName()+"."+eref.getName());
							
							_editor.getCevineditModelRoot().getDiagram().getContainsElem().add(erefcont);
						}
					}
				}
				
				if ((selected_item instanceof EReference) && (!((EReference) selected_item).isContainment()))
				{
					if (!CevineditValidator.CevineditModelHasDiagram(_editor.getCevineditModelRoot()))
					{
						String titleDialog = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorTitleG");
						String contentDialog = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogErrorContentG");;
						MessageDialog.openError(_editor.getMainLayer().getShell(), titleDialog, contentDialog);
						
					}
					else
					{					
						EReference eref = (EReference) selected_item;
						String titleDialog = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmTitleD");
						String contentDialog = _editor.getTextLang("CevineditEditorMetamodelViewerListener", "MessageDialogConfirmContentD");
						boolean personalize = MessageDialog.openConfirm(_editor.getMainLayer().getShell(), titleDialog+" "+eref.getName()+"?", contentDialog+" "+ eref.getName() + "?");
						
						if (personalize)
						{
							LinkEReferenceNonCont erefNonCont = CevineditFactory.eINSTANCE.createLinkEReferenceNonCont();
							erefNonCont.setName(eref.getEContainingClass().getName()+"."+eref.getName());
							
							_editor.getCevineditModelRoot().getDiagram().getContainsElem().add(erefNonCont);
						}
					}
				}
			}
		
		
	
}

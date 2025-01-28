package org.cevinedit.editor.view.toolgenerator;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.cevinedit.core.tools.CevineditProjectTools;
import org.cevinedit.editor.view.constants.CevineditEEnums;
import org.cevinedit.editor.view.constants.CevineditToolsLabels;
import org.cevinedit.editor.view.listeners.BrowserManager;
import org.cevinedit.editor.view.listeners.CevineditEditorApplyChangesListener;
import org.cevinedit.editor.view.listeners.CevineditEditorFocusLostListener;
import org.cevinedit.editor.view.listeners.CevineditEditorSearchImageSetPointsListener;
import org.cevinedit.editor.view.listeners.CevineditEditorToolsModifyListener;
import org.cevinedit.editor.view.listeners.CevineditEditorToolsNodeFigureListener;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.util.BundleUtility;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;

import cevinedit.LinkEClass;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.NodeEClass;
import cevinedit.PersonalizedElement;
import cevinedit.presentation.CevineditEditor;
import cevinedit.presentation.CevineditEditorPlugin;

public class CevineditToolGenerator 
{
	public static final int GENERATE_EMPTYTOOLS = 0;
	public static final int GENERATE_NODE_TOOLS = 1;
	public static final int GENERATE_LINK_TOOLS = 2;
	
	public static Resource loadEcore()
	{
		Resource ecore;
		HashMap<Combo, String> combos;
		ResourceSet ecoreResourceSet  = new ResourceSetImpl();
		
		Bundle bundle2 = Platform.getBundle("org.kybele.cevinedit.model");
		
		String path2 = null;
		
		if (!BundleUtility.isReady(bundle2)) 
		{
			path2 =  null;
		}
		
		String loc2 = bundle2.getLocation();
		path2 = loc2.substring(loc2.indexOf("file:"), loc2.length()).concat("/model/cevinedit.ecore");				

		ecore = ecoreResourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(locateFile("org.kybele.cevinedit.model", "/model/cevinedit.ecore").toString()), true);
		ecoreResourceSet.getPackageRegistry().put("ecore", new EcoreResourceFactoryImpl());
		
		return ecore;
		
	}
	
	public static EEnum getEnumByName(String eEnumName)
	{
		Resource ecore = loadEcore();
		
		if (ecore.getContents().get(0) instanceof EPackage)
		{

			EPackage root = (EPackage) ecore.getContents().get(0);
			
			List<EClassifier> classifiers = root.getEClassifiers();
			
			
			for (EClassifier eclassifier : classifiers) 
			{
				if (eclassifier instanceof EEnum)
				{
					EEnum _enum = (EEnum) eclassifier;
					
					if (_enum.getName().equals(eEnumName))
					{
						return _enum;
					}
					
				}
			}
		}
		return null;
	}
	
	public static String[] getArrayStringLiterals(String eEnumName)
	{
		EList<EEnumLiteral> enum_literals = getEnumByName(eEnumName).getELiterals();
		
		String []literals = new String[enum_literals.size()];
		int i = 0;
		for(EEnumLiteral literal : enum_literals)
		{
			literals[i] = literal.getName();
			i++;
		}
		
		return literals;
	}
	
	public static String[] getArrayStringEAttributes(CevineditEditor _editor, PersonalizedElement _personalizedElement)
	{
		String namePersonalizedElement = "";
		LinkedList<String> _listEAttributeNames = new LinkedList<String>();
		if (_personalizedElement instanceof NodeEClass)
		{
			NodeEClass node = ((NodeEClass) _personalizedElement);
			namePersonalizedElement = node.getName();
		}
		if (_personalizedElement instanceof LinkEClass)
		{
			LinkEClass link = (LinkEClass) _personalizedElement;
			namePersonalizedElement = link.getName();
		}
		if (_personalizedElement instanceof LinkEReferenceNonCont)
		{
			LinkEReferenceNonCont link = ((LinkEReferenceNonCont)_personalizedElement);
			namePersonalizedElement = link.getName().substring(0,link.getName().indexOf("."));
		}
		
		if (_editor.getMetamodelEcoreResource().getContents().get(0) instanceof EPackage)
		{
			EPackage root = (EPackage) _editor.getMetamodelEcoreResource().getContents().get(0);
			
			List<EClassifier> classifiers = root.getEClassifiers();
			
			
			for (EClassifier eclassifier : classifiers) 
			{
				if (eclassifier instanceof EClass)
				{
					EClass _eclass = (EClass) eclassifier;
					
					
					if (_eclass.getName().equals(namePersonalizedElement))
					{
						_listEAttributeNames = new LinkedList<String>();
						if (!(_personalizedElement instanceof NodeEClass))
						{
							_listEAttributeNames.add("Not Defined");
						}
						
						for(EAttribute _eattribute : _eclass.getEAllAttributes())
						{
							if (!_listEAttributeNames.contains(_eattribute.getName()))
							{
								_listEAttributeNames.add(_eattribute.getName());
							}
						}
						if (_eclass.getESuperTypes().size()>0)
						{
							if ((_eclass.getESuperTypes().get(0) != null) && (_eclass.getESuperTypes().get(0) instanceof EClass))
							{
								EClass parent = (EClass) _eclass.getESuperTypes().get(0);
								
								for(EAttribute _eattributeParent : parent.getEAllAttributes())
								{
									if (!_listEAttributeNames.contains(_eattributeParent.getName()))
									{
										_listEAttributeNames.add(_eattributeParent.getName());
									}
								}
							}
						}
						break;
					}		
					
				}
			}
			
			
		}
		
		String _list[] = new String[_listEAttributeNames.size()];
		
		for(int i=0; i<_listEAttributeNames.size(); i++)
		{
			_list[i] = _listEAttributeNames.get(i);
		}
		return _list;
	}
	
	public static void destroy_tools_layer(CevineditEditor editor, final Composite controls_layer)
	{
		for(Control ctrl : controls_layer.getChildren())
		{
			ctrl.dispose();
		}
	}
	
	public static void generateToolsForNodeEClass(CevineditEditor editor, final Composite controls_layer)
	{

		generateToolsTitle(editor, controls_layer);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.BACKGROUND_COLOR, CevineditEEnums.COLOR);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.BORDER_COLOR, CevineditEEnums.COLOR);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.BORDER_TEXTURE, CevineditEEnums.TEXTURE);
		generateBlockWidth(editor, controls_layer, CevineditToolsLabels.BORDER_WIDTH);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.BRIGHTNESS, CevineditEEnums.BRIGHTNESS);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.NODE_FIGURE, CevineditEEnums.NODEFIGURE);
		generateBlockBoolean(editor, controls_layer, CevineditToolsLabels.RESIZABLE);
		generateRowWithTextfield(editor, controls_layer, CevineditToolsLabels.SIZE);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.LABEL_PLACEMENT, CevineditEEnums.PLACEMENT);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.LABEL_FONTSTYLE, CevineditEEnums.FONTSTYLE);
		generateRowWithComboLabels(editor, controls_layer, CevineditToolsLabels.LABEL, editor.getLastPersonalizedElementSelected());
		generateRowWithApplyChangesButton(editor, controls_layer);
	}
	
	public static void generateToolsForLinkEClass(CevineditEditor editor, final Composite controls_layer)
	{
		generateToolsTitle(editor, controls_layer);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.BRIGHTNESS, CevineditEEnums.BRIGHTNESS);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.COLOR, CevineditEEnums.COLOR);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.LABEL_FONTSTYLE, CevineditEEnums.FONTSTYLE);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.SOURCE_DECORATION, CevineditEEnums.LINKFIGURE);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.TARGET_DECORATION, CevineditEEnums.LINKFIGURE);		
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.TEXTURE, CevineditEEnums.TEXTURE);
		generateBlockWidth(editor, controls_layer, CevineditToolsLabels.WIDTH);
		generateRowWithComboLabels(editor, controls_layer, CevineditToolsLabels.LABEL, editor.getLastPersonalizedElementSelected());
		generateRowWithApplyChangesButton(editor, controls_layer);
				
	}
	
	public static void generateToolsForLinkEReferenceNoCont(CevineditEditor editor, final Composite controls_layer)
	{
		generateToolsTitle(editor, controls_layer);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.BRIGHTNESS, CevineditEEnums.BRIGHTNESS);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.COLOR, CevineditEEnums.COLOR);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.LABEL_FONTSTYLE, CevineditEEnums.FONTSTYLE);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.SOURCE_DECORATION, CevineditEEnums.LINKFIGURE);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.TARGET_DECORATION, CevineditEEnums.LINKFIGURE);		
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.TEXTURE, CevineditEEnums.TEXTURE);
		generateBlockWidth(editor, controls_layer, CevineditToolsLabels.WIDTH);
		generateRowWithComboLabels(editor, controls_layer, CevineditToolsLabels.LABEL, editor.getLastPersonalizedElementSelected());
		generateRowWithApplyChangesButton(editor, controls_layer);
				
	}
	
	public static void generateToolsForLinkEReferenceCont(CevineditEditor editor, final Composite controls_layer)
	{
		generateToolsTitle(editor, controls_layer);
		generateBlockBoolean(editor, controls_layer, CevineditToolsLabels.COLLAPSIBLE);
		generateRowWithCombo(editor, controls_layer, CevineditToolsLabels.LAYOUT, CevineditEEnums.LAYOUTCOMPARTMENT);

		generateRowWithApplyChangesButton(editor, controls_layer);
				
	}
	
	public static void generateToolsTitle(CevineditEditor editor, final Composite controls_layer)
	{
	
		Composite parent = generateCompositeBaseRow(editor, controls_layer);

		
		Label label_selected = new Label(parent, SWT.NONE);
		
		label_selected.setText(editor.getTextLang("CevineditToolGenerator", "PersonalizationToolTitle"));
		label_selected.setFont(new Font(editor.getMainLayer().getDisplay(), new FontData("arial", 14, SWT.BOLD)));
		
	}
	
	public static void generateTitle(CevineditEditor editor, final Composite controls_layer, String text, String eEnumName)
	{
	
		Composite parent = generateCompositeBaseRow(editor, controls_layer);
		
		Label label_selected = new Label(parent, SWT.NONE);
		
		label_selected.setText("Selection: "+editor.getLastPersonalizedElementSelected().getName());
		
	}
	
	public static void generateRowWithCombo(CevineditEditor editor, final Composite controls_layer, String text, String eEnumName)
	{
	
		Composite parent = generateCompositeBaseRow(editor, controls_layer);
		
		generateCompositeWithImage(controls_layer, parent, text);
		
		
		generateCompositeWithCombo(editor, controls_layer, parent, text, null, getArrayStringLiterals(eEnumName));
	}
	
	public static void generateRowWithComboLabels(CevineditEditor editor, final Composite controls_layer, String text, PersonalizedElement _personalizedElement)
	{
	
		Composite parent = generateCompositeBaseRow(editor, controls_layer);
		
		generateCompositeWithImage(controls_layer, parent, text);
		
		String labels[] = getArrayStringEAttributes(editor, _personalizedElement);
		generateCompositeWithCombo(editor, controls_layer, parent, text, _personalizedElement, labels);
	}	
	
	public static void generateBlockWidth(CevineditEditor editor, final Composite controls_layer, String text)
	{
		Composite parent = generateCompositeBaseRow(editor, controls_layer);
		
		generateCompositeWithImage(controls_layer, parent, text);
		
		
		generateCompositeWithCombo(editor, controls_layer, parent, text,null,  new String[]{"1","2","3","4","5"});
	}	
	
	public static void generateBlockBoolean(CevineditEditor editor, final Composite controls_layer, String text)
	{
		Composite parent = generateCompositeBaseRow(editor, controls_layer);		
		generateCompositeWithImage(controls_layer, parent, text);
		generateCompositeWithCombo(editor, controls_layer, parent, text, null, new String[]{"true","false"});
	}	
	
	protected static String path2Icon(String label)
	{
		String path = "/icons/tools/"; 
		if (label.equals(CevineditToolsLabels.BACKGROUND_COLOR))
		{
			path += "color-icon";
		}
		else if (label.equals(CevineditToolsLabels.BORDER_COLOR))
		{
			path += "border-color-icon";
		}
		else if (label.equals(CevineditToolsLabels.BORDER_TEXTURE))
		{
			path += "texture-icon";
		}
		else if (label.equals(CevineditToolsLabels.BORDER_WIDTH))
		{
			path += "widths-icon";
		}
		else if (label.equals(CevineditToolsLabels.BRIGHTNESS))
		{
			path += "brightness-icon";
		}	
		else if (label.equals(CevineditToolsLabels.NODE_FIGURE))
		{
			path += "nodeFigures-icon";
		}
		else if (label.equals(CevineditToolsLabels.RESIZABLE))
		{
			path += "resizable-icon";
		}
		else if (label.equals(CevineditToolsLabels.SIZE))
		{
			path += "size-icon";
		}
		else if (label.equals(CevineditToolsLabels.LABEL_PLACEMENT))
		{
			path += "labelPlacement-icon";
		}
		else if (label.equals(CevineditToolsLabels.LABEL_FONTSTYLE))
		{
			path += "fontstyle-icon";
		}	
		else if (label.equals(CevineditToolsLabels.LABEL))
		{
			path += "label-icon";
		}
		else if (label.equals(CevineditToolsLabels.COLLAPSIBLE))
		{
			path += "collapsible-icon";
		}		
		else if (label.equals(CevineditToolsLabels.LAYOUT))
		{
			path += "layout-icon";
		}
		else if (label.equals(CevineditToolsLabels.LABEL))
		{
			path += "label-icon";
		}	
		else if (label.equals(CevineditToolsLabels.COLOR))
		{
			path += "color-icon";
		}	
		else if (label.equals(CevineditToolsLabels.SOURCE_DECORATION))
		{
			path += "sourceDecoration-icon";
		}	
		else if (label.equals(CevineditToolsLabels.TARGET_DECORATION))
		{
			path += "targetDecoration-icon";
		}	
		else if (label.equals(CevineditToolsLabels.TEXTURE))
		{
			path += "texture-icon";
		}		
		else if (label.equals(CevineditToolsLabels.WIDTH))
		{
			path += "widths-icon";
		}		
		else
		{
			path +="blank";
		}
		
		return path+".jpg";
	}
	
	public static Composite generateCompositeWithImage(final Composite controls_layer, Composite parent, String label)
	{
		Composite c_image = new Composite(parent, SWT.NONE);	
		c_image.setLayout(new FillLayout());

		Label l = new Label(c_image, SWT.NONE);
		Image image = new Image(controls_layer.getDisplay(),
			    CevineditToolGenerator.class.getResourceAsStream(path2Icon(label)));
		
		l.setImage(image);

		return c_image;
		
	}
    private static java.net.URI locateFile(String bundle, String fullPath) {
  	  try {
  	    URL url = FileLocator.find(Platform.getBundle(bundle), new Path(fullPath), null);
  	    if(url != null)
  	      return FileLocator.resolve(url).toURI();
  	  } catch (Exception e) {}
  	    return null;
  	  
  	}
	public static Composite generateCompositeBaseRow(CevineditEditor editor, final Composite controls_layer)
	{
		Composite parent = new Composite(controls_layer, SWT.NONE);
		
		GridLayout gl_parent = new GridLayout();
		gl_parent.marginBottom = 10;
		gl_parent.marginHeight = 0;
		gl_parent.marginLeft = 30;
		gl_parent.marginRight = 0;
		gl_parent.marginTop = 0;
		gl_parent.marginWidth = 0;
		gl_parent.numColumns = 2;
		gl_parent.verticalSpacing = 0;
		gl_parent.horizontalSpacing = 0;

		gl_parent.makeColumnsEqualWidth = false;
		
		parent.setParent(controls_layer);

		parent.setLayout(gl_parent);

		GridData gd_parent = new GridData();
		gd_parent.horizontalAlignment = SWT.FILL;
		parent.setLayoutData(gd_parent);
		
		return parent;
	}
	
	public static Composite generateCompositeWithCombo(CevineditEditor editor, final Composite controls_layer, Composite parent, String text, PersonalizedElement pe, String items[])
	{
		Composite c_selectors = new Composite(parent, SWT.NONE);

		GridData gd_c_selectors = new GridData();
		gd_c_selectors.horizontalAlignment = SWT.LEFT;
		
		c_selectors.setLayoutData(gd_c_selectors);
		GridLayout gl_c_selectors = new GridLayout();
		gl_c_selectors.verticalSpacing = 3;
		gl_c_selectors.marginHeight = 0;
		
		gl_c_selectors.horizontalSpacing = 0;
		gl_c_selectors.makeColumnsEqualWidth = true;
		
		c_selectors.setLayout(gl_c_selectors);

		c_selectors.setSize(200, 50);

		Label label = new Label(c_selectors, SWT.LEFT);
		label.setFont(new Font(parent.getDisplay(), "Arial", 10, SWT.BOLD));
		label.setText(text);
		GridData gd1 = new GridData();
		gd1.horizontalIndent = 0;
		gd1.horizontalAlignment = SWT.FILL;
		gd1.grabExcessHorizontalSpace = true;
		gd1.verticalIndent = 0;
		label.setLayoutData(gd1);
	    Combo combo = new Combo(c_selectors, SWT.DROP_DOWN | SWT.READ_ONLY);
	    
	    Text textImage = null;
	    Button btnSearch = null;
	    Composite compositeSearchImage = null;
	    if (text.equals(CevineditToolsLabels.NODE_FIGURE))
	    {
		     	compositeSearchImage = new Composite(c_selectors, SWT.NONE);

			    compositeSearchImage.setVisible(false);
			    FillLayout cSIRLayout = new FillLayout();
			    compositeSearchImage.setLayout(cSIRLayout);

			    btnSearch = new Button(compositeSearchImage, SWT.PUSH);
			    btnSearch.setText("Search");
			    btnSearch.addSelectionListener(new CevineditEditorSearchImageSetPointsListener(editor));

	    }
	    
	    combo.setItems(items);
	    String labelSaved = "Not Defined";
	    

	    if ((editor.getActualPersonalization() != null) && (editor.getActualPersonalization().containsKey(text)))
	    {   	
	    	IStructuredSelection selection = (IStructuredSelection) editor.getSelection();


	    	if (editor.getActualPersonalization().get(text) == null || editor.getActualPersonalization().get(text)=="")
	    	{   		
	    		if (text.equals("Label"))  
	    		{
	    			combo.setText(labelSaved);
	    		}
	    		else
	    			combo.setText(items[0]);
	    	}
	    	else
	    	{
	    		combo.setText(editor.getActualPersonalization().get(text));	    	
	    	}

	    	if (combo.getText().equals("Image"))
	    	{
	    		compositeSearchImage.setVisible(true);	
	    		btnSearch.setText("Search Image");
	    	}
	    	else if (combo.getText().equals("SVG"))
	    	{
	    		compositeSearchImage.setVisible(true);
	    		btnSearch.setText("Search SVG");
	    	} 
	    	else if (combo.getText().equals("Polygon"))
	    	{
	    		compositeSearchImage.setVisible(true);
	    		btnSearch.setText("Set Points");
	    	}
	    }
	    combo.addFocusListener(new BrowserManager(editor));
	    combo.addModifyListener(new CevineditEditorToolsNodeFigureListener(editor, text));

		GridData gd2 = new GridData();
		gd2.horizontalIndent = 0;
		gd2.horizontalAlignment = SWT.FILL;
		gd2.grabExcessHorizontalSpace = true;
		gd2.verticalIndent = 0;
		combo.setLayoutData(gd2);

		if (combo.getText() == "")
		{
			combo.setText(items[0]);
		}
		
		editor.personalization.put(text, combo);
		editor.getActualPersonalization().put(text, combo.getText());

		return c_selectors;
	}
	
	public static void generateRowWithApplyChangesButton(CevineditEditor editor, final Composite controls_layer)
	{
		Composite parent = generateCompositeBaseRow(editor, controls_layer);
		generateCompositeWithImage(controls_layer, parent, "");
		
		Composite c_selectors = new Composite(parent, SWT.NONE);

		GridData gd_c_selectors = new GridData();
		gd_c_selectors.horizontalAlignment = SWT.LEFT;
		
		c_selectors.setLayoutData(gd_c_selectors);
		GridLayout gl_c_selectors = new GridLayout();
		gl_c_selectors.verticalSpacing = 10;
		gl_c_selectors.marginHeight = 0;
		
		gl_c_selectors.horizontalSpacing = 0;
		gl_c_selectors.makeColumnsEqualWidth = true;
		
		c_selectors.setLayout(gl_c_selectors);

		Button btn_save_changes = new Button(c_selectors, SWT.PUSH);
		btn_save_changes.setText(editor.getTextLang("CevineditToolGenerator", "ApplyChangesBtn"));
		btn_save_changes.setSize(200, 100);

		GridData gd1 = new GridData();
		gd1.horizontalIndent = 0;
		gd1.horizontalAlignment = SWT.FILL;
		gd1.verticalAlignment = SWT.FILL;
		gd1.grabExcessVerticalSpace = true;
		gd1.grabExcessHorizontalSpace = true;
		gd1.verticalIndent = 0;
		btn_save_changes.setLayoutData(gd1);

		btn_save_changes.addSelectionListener(new CevineditEditorApplyChangesListener(editor));
	}
	
	
	public static void generateRowWithTextfield(CevineditEditor editor, final Composite controls_layer, String text)
	{
		
		Composite parent = generateCompositeBaseRow(editor, controls_layer);
		generateCompositeWithImage(controls_layer, parent, text);
		
		Composite c_selectors = new Composite(parent, SWT.NONE);

		GridData gd_c_selectors = new GridData();
		gd_c_selectors.horizontalAlignment = SWT.LEFT;
		
		c_selectors.setLayoutData(gd_c_selectors);
		GridLayout gl_c_selectors = new GridLayout();
		gl_c_selectors.verticalSpacing = 3;
		gl_c_selectors.marginHeight = 0;
		
		gl_c_selectors.horizontalSpacing = 0;
		gl_c_selectors.makeColumnsEqualWidth = true;
		
		c_selectors.setLayout(gl_c_selectors);

		c_selectors.setSize(200, 50);

		Label label = new Label(c_selectors, SWT.LEFT);
		label.setFont(new Font(parent.getDisplay(), "Arial", 10, SWT.BOLD));
		label.setText(text);
		GridData gd1 = new GridData();
		gd1.horizontalIndent = 0;
		gd1.horizontalAlignment = SWT.FILL;
		gd1.grabExcessHorizontalSpace = true;
		gd1.verticalIndent = 0;
		
		label.setLayoutData(gd1);
		
		if (text.equals(CevineditToolsLabels.SIZE))
		{
			Composite compositeSize = new Composite(c_selectors, SWT.NONE);
			GridLayout gridLayoutCompositeSize = new GridLayout();
			gridLayoutCompositeSize.numColumns = 4;
			compositeSize.setLayout(gridLayoutCompositeSize);
			
			Label labelX = new Label(compositeSize, SWT.NONE);
			GridData gdlx = new GridData();
			gdlx.horizontalAlignment = SWT.LEFT;
			gdlx.widthHint = 10;
			labelX.setText("X: ");
			labelX.setLayoutData(gdlx);
			
			Text sizeX = new Text(compositeSize, SWT.BORDER);
			GridData gdtx = new GridData();
			gdtx.horizontalAlignment = SWT.LEFT;
			gdtx.widthHint = 30;			
			sizeX.setLayoutData(gdtx);			
			sizeX.setText("0");
			sizeX.addFocusListener(CevineditEditorFocusLostListener.i(editor, "sizeX"));
			Label labelY = new Label(compositeSize, SWT.NONE);
			GridData gdly = new GridData();
			gdly.widthHint = 10;
			gdly.horizontalAlignment = SWT.LEFT;			
			labelY.setText("Y: ");
			labelY.setLayoutData(gdly);
			
			Text sizeY = new Text(compositeSize, SWT.BORDER);
			GridData gdty = new GridData();
			gdty.widthHint = 30;			
			gdty.horizontalAlignment = SWT.LEFT;			
			sizeY.setLayoutData(gdty);
			sizeY.setText("0");
			sizeY.addFocusListener(CevineditEditorFocusLostListener.i(editor, "sizeY"));
			
			compositeSize.pack();
			
		    if ((editor.getActualPersonalization() != null) && (editor.getActualPersonalization().containsKey(text)))
		    {
		    	String content = editor.getActualPersonalization().get(text);
		    	if ( !content.equals("null"))
		    	{
		    		String sizes = editor.getActualPersonalization().get(text);
		    		String sizesParts[] = sizes.split(",");
		    		
		    		sizeX.setText(sizesParts[0]);
		    		sizeY.setText(sizesParts[1]);
		    	}		    	
		    }
		
		}
		else
		{
			Text txt = new Text(c_selectors, SWT.BORDER);
			
		    if ((editor.getActualPersonalization() != null) && (editor.getActualPersonalization().containsKey(text)))
		    {
		    	if (editor.getActualPersonalization().get(text) != null)
		    	{
		    		txt.setText(editor.getActualPersonalization().get(text));
		    	}
		    	else
		    	{
		    		txt.setText("");
		    	}
		    	
		    }
		    else
		    {
		    	txt.setText("");
		    }
			
			txt.addFocusListener(new BrowserManager(editor));
			txt.addModifyListener(CevineditEditorToolsModifyListener.i(editor, text));
			GridData gd2 = new GridData();
			gd2.horizontalIndent = 0;
			gd2.horizontalAlignment = SWT.FILL;
			gd2.grabExcessHorizontalSpace = true;
			gd2.verticalIndent = 0;
			txt.setLayoutData(gd2);
			
			editor.personalization.put("Label", txt);
		}
	}
	

}

package org.cevinedit.core.analytics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import org.cevinedit.core.eugenia.EugeniaColor;
import org.cevinedit.core.model.comparator.CevineditModelComparator;
import org.cevinedit.editor.view.dialogs.ReportDialog;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import cevinedit.CEViNEditRoot;
import cevinedit.Link;
import cevinedit.NodeEClass;
import cevinedit.PersonalizedElement;
import cevinedit.presentation.CevineditEditor;

public class CevineditAnalytics {

	protected CevineditEditor _editor = null;
	protected Shell _mainShell = null;
	protected Resource _metamodelEcoreResource = null;
	protected Resource _cevineditModelResource = null;
	
	protected EPackage _metamodelRoot = null;
	protected CEViNEditRoot _modelRoot = null;
	
	public CevineditAnalytics(CevineditEditor editor)
	{
		_editor = editor;
		
		_mainShell = _editor.getMainLayer().getShell();
		
		_metamodelEcoreResource = editor.getMetamodelEcoreResource();
		_cevineditModelResource = editor.getCevineditModelResource();
		
		_metamodelRoot = (EPackage) _metamodelEcoreResource.getContents().get(0);
		_modelRoot = (CEViNEditRoot) _cevineditModelResource.getContents().get(0);
	}
	
	public static CevineditAnalytics i(CevineditEditor editor)
	{
		return new CevineditAnalytics(editor);
	}
	
	public void generateGraphicComplexityInform()
	{
		String title = "Cevinedit Editor Graphic Economy Report";
		String inform = "";
    	Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	
    	inform += "Cevinedit Editor - Graphic Economy Report";
    	inform +="\n";
    	inform += "--------------------------------------------";
    	inform += "\n";
    	inform += "\n";
    	inform += "-> The graphic complexity of the DSL \n";
    	inform += "   Visual Notations is: \""+_modelRoot.getDiagram().getContainsElem().size()+"\"\n";
    	inform += "\n";

    	inform += "+------------------------------------------------+\n";
    	inform += "|The number of different objects that an average |\n";
    	inform += "|human can hold in working memory is around      |\n";
    	inform += "|six categories.                                 |\n";
    	inform += "+------------------------------------------------+\n";
    	inform += "\n";

    	
    			
    	
		new ReportDialog(_editor, title, inform).open();
	}
	
	protected int calculateNumberColorLiterals()
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		for(PersonalizedElement pe : _modelRoot.getDiagram().getContainsElem())
		{
			if (pe instanceof NodeEClass)
			{
				lhs.add(((NodeEClass) pe).getBackgroundColor().getLiteral());
				lhs.add(((NodeEClass) pe).getBorderColor().getLiteral());
			}
			if (pe instanceof Link)
			{
				lhs.add(((Link) pe).getColor().getLiteral());
			}
		}
		

		return lhs.size();
	}
	
	protected int calculateNumberBrigthnessLiterals()
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		for(PersonalizedElement pe : _modelRoot.getDiagram().getContainsElem())
		{
			if (pe instanceof NodeEClass)
			{
				lhs.add(((NodeEClass) pe).getBrightness().getLiteral());
			}
			if (pe instanceof Link)
			{
				lhs.add(((Link) pe).getBrightness().getLiteral());
			}
		}
		

		return lhs.size();
	}

	protected int calculateNumberTextureLiterals()
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		for(PersonalizedElement pe : _modelRoot.getDiagram().getContainsElem())
		{
			if (pe instanceof NodeEClass)
			{
				lhs.add(((NodeEClass) pe).getBorderTexture().getLiteral());
			}
			if (pe instanceof Link)
			{
				lhs.add(((Link) pe).getTexture().getLiteral());
			}
		}
		

		return lhs.size();
	}
	
	public void generateVisualExpressiveness()
	{

		double cs_10 = ((double)calculateNumberColorLiterals()) / 10;		
		double cs_7 = ((double)calculateNumberColorLiterals()) / 7;		
		int total_color_saturation_10 =  (int) (cs_10*100); 
		int total_color_saturation_7 =  (int) (cs_7*100);
		
		double ts_2 = ((double)calculateNumberTextureLiterals()) / 2;
		double ts_5 = ((double)calculateNumberTextureLiterals()) / 5;
		int texture_saturation_2 =  (int) (ts_2*100);	
		int texture_saturation_5 =  (int) (ts_5*100);
		
		double bs_6 = ((double)calculateNumberBrigthnessLiterals()) / 6;
		double bs_7 = ((double)calculateNumberBrigthnessLiterals()) / 7;
		int brightness_staturation_6 =  (int) (bs_6*100);
		int brightness_staturation_7 =  (int) (bs_7*100);
		
		
		String title = "Cevinedit Editor Visual Expressiveness Report";
		String inform = "";
    	Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	
    	inform += "Cevinedit Editor - Visual Expressiveness Report";
    	inform +="\n";
    	inform += "-----------------------------------------------\n";
    	inform += "\n";

		inform += "-> Color: \n";
		inform += "     - VV values: " +calculateNumberColorLiterals() + "\n";
		inform += "     - VV capacity: 7 - 10\n";
		inform += "     - VV saturation: "+total_color_saturation_10+"% - " +total_color_saturation_7+ "%\n";
		
    	inform += "\n";
    	inform += "-> Texture: \n";
    	inform += "     - VV values: " +calculateNumberTextureLiterals() + "\n";
		inform += "     - VV capacity: 2 - 5\n";
		inform += "     - VV saturation: "+texture_saturation_5+"% - " +texture_saturation_2+ "%\n";
    	inform += "\n";
    	inform += "-> Brigthness:\n";
    	inform += "     - VV values: " +calculateNumberBrigthnessLiterals() + "\n";
		inform += "     - VV capacity: 6 - 7\n";
		inform += "     - VV saturation: "+brightness_staturation_7+"% - " +brightness_staturation_6+ "%\n";

    	
    			
    	
		new ReportDialog(_editor, title, inform).open();
	}
	
	public void generateMessageInform(String title, String message)
	{
		
		MessageDialog.openInformation(_mainShell, title, message);
	}
	
	protected List<NodeEClass> getNodeEClass()
	{
		LinkedList<NodeEClass> nodes = new LinkedList<>();
		
		for(PersonalizedElement pe : _modelRoot.getDiagram().getContainsElem())
		{
			if (pe instanceof NodeEClass)
			{
				nodes.add((NodeEClass) pe);
			}
		}
		
		return nodes;
	}
	
	protected List<Link> getLinks()
	{
		LinkedList<Link> links = new LinkedList<>();
		
		for(PersonalizedElement pe : _modelRoot.getDiagram().getContainsElem())
		{
			if (pe instanceof Link)
			{
				links.add((Link) pe);
			}
		}	
		
		return links;
	}
	
	protected List<EClassifier> getEClassifierPersonalizables()
	{
		LinkedList<EClassifier> eclassifiers = new LinkedList<>();
		
		for(EClassifier eclassifier :_metamodelRoot.getEClassifiers())
		{
			if (eclassifier instanceof EClass)
			{
				EClass eclass = (EClass) eclassifier;
				
				if (!eclass.isAbstract())
				{
					eclassifiers.add(eclassifier);
				}
			}
			if (eclassifier instanceof EReference)
			{
				eclassifiers.add(eclassifier);
			}
		}	
		
		return eclassifiers;
	}
	
	protected List<EStructuralFeature> getEStructuralFeaturesPersonalizables()
	{
		LinkedList<EStructuralFeature> features = new LinkedList<>();
		
		for(EClassifier eclassifier :getEClassifierPersonalizables())
		{
			EClass eclass = (EClass) eclassifier;

					for(EStructuralFeature feature : eclass.getEStructuralFeatures())
					{
						if (feature instanceof EReference)
						{
							features.add(feature);
						}
					}
		}	
		
		return features;
	}
	
	public void generateSemioticClarityInform()
	{	
		int no_eclassifiers_personalizables = getEClassifierPersonalizables().size() + getEStructuralFeaturesPersonalizables().size();
		int no_personalizations = _modelRoot.getDiagram().getContainsElem().size()+1;
		
		int elems_no_personalized = (no_eclassifiers_personalizables - no_personalizations);
		
		int equals_nodes = 0;
		List<NodeEClass> nodes = getNodeEClass();
		
		int equals_links = 0;
		List<Link> links = getLinks();
		
		String nodes_equals = "";
		String links_equals = "";
		if (nodes.size()>1)
		{
		int i = 0, j = 0;
		for(i=0; i<nodes.size()-1; i++)
		{
			j = i+1;
			
			while (j<nodes.size())
			{
				System.out.print("Comparing Nodes: "+nodes.get(i).getName() + " -> " + nodes.get(j).getName()+" = ");		
				if (CevineditModelComparator.isEqualsNodeEClass2NodeEClass(nodes.get(i), nodes.get(j)))
				{
					equals_nodes++;
					nodes_equals += "\t\"" + nodes.get(i).getName() + "\" is equal to \""+ nodes.get(j).getName()+"\"";
					nodes_equals += "\n";
				}
				j++;
			}
		}
		}
		
		if (links.size()>1)
		{
			int i =0, j=0;
			for(i=0; i<links.size()-1; i++)
			{
				j = i+1;
				while (j<links.size())
				{
					System.out.print("Comparing Links: "+links.get(i).getName() + " -> " + links.get(j).getName()+" = ");
					if (CevineditModelComparator.isEqualsLink2Link(links.get(i), links.get(j)))
					{
						
						equals_links++;
						links_equals += "\t\"" + links.get(i).getName() + "\" is equal to \""+ links.get(j).getName()+"\"";
						links_equals += "\n";
					}
					j++;
				}
			}
		}
		String title = "Cevinedit Editor Semiotic Clarity Report";
		String inform = "";
    	Calendar cal = Calendar.getInstance();
    	cal.getTime();

    	
    	inform += "------------------------------------------\n";
    	inform += "      --> Symbol Overload Anomaly <--\n";
    	inform += "------------------------------------------\n\n";
    	inform += ".: NODES :.\n\n"; 
    	inform += "\t-> No. of homograph nodes: " + equals_nodes + "\n";    	 
    	inform += "\n"; 
    	inform += nodes_equals;
    	inform += "\n";
    	inform += ".: LINKS :.\n\n";  	

    	inform += "\t-> No. of homograph Links: " + equals_links + "\n";
    	inform += ""+links_equals;
    	inform += "\n\n";
    	inform += "------------------------------------------\n";
    	inform += "      --> Symbol Deficit Anomaly <--\n";
    	inform += "------------------------------------------\n\n";    	
    	inform += "\""+elems_no_personalized+"\" language element"+((elems_no_personalized == 1) ? " is" : "s are ")+"not represented \n";
    	inform += "by any graphical symbol.\n";
    	
    			
    	
		new ReportDialog(_editor, title, inform).open();		
	}
	
}

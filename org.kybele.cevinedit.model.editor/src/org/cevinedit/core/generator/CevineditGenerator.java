package org.cevinedit.core.generator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.soap.Node;

import org.cevinedit.core.tools.CevineditModelTools;
import org.eclipse.emf.common.util.EList;

import cevinedit.CEViNEditRoot;
import cevinedit.FontStyle;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.NodeEClass;
import cevinedit.PersonalizedElement;
import cevinedit.presentation.CevineditEditor;

public class CevineditGenerator {

	public static String imageJavaClassContent(String className, String imagePath, String imageName)
	{
		String image = "/" + imagePath + "/" + imageName;
		String imageClassString = "";
		imageClassString += "package figures;\n";
		imageClassString += "import java.io.InputStream;\n";
		imageClassString += "import org.eclipse.swt.graphics.Image;\n";
		imageClassString += "import org.eclipse.swt.widgets.Display;\n";
		imageClassString += "import org.eclipse.draw2d.ImageFigure;\n\n";
		imageClassString += "public class "+className+" extends ImageFigure {\n";
		imageClassString += "\tpublic "+className+"()  {\n";
		imageClassString += "\t\tInputStream in = getClass().getResourceAsStream(\"" + image + "\");\n";
		imageClassString += "\t\tImage image = new Image(Display.getDefault(), in);\n";
		imageClassString += "\t\tthis.setImage(image);\n";
		imageClassString += "\t}\n";
		imageClassString += "}\n";	
		
		return imageClassString;
	}
	
	public static InputStream generateStreamImageClassFileContent(String className, String imagePath, String imageName)
	{
		InputStream stream;
		try 
		{
			stream = new ByteArrayInputStream(imageJavaClassContent(className, imagePath, imageName).getBytes("UTF-8"));
			return stream;

		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		return null;
	}	
	
	public static String operationsEOL()
	{
		String eol = "";
		eol += "operation createColor(r:Integer,g:Integer,b:Integer):GmfGraph!RGBColor{\n";
		eol += "\tvar color= new GmfGraph!RGBColor;\n";
		eol += "\tcolor.red= r;\n";
		eol += "\tcolor.green= g;\n";
		eol += "\tcolor.blue= b;\n";			
		eol += "\treturn color;}\n";
				
		
		eol += "operation CloneFont(font:GmfGraph!BasicFont):GmfGraph!BasicFont{\n";		
		eol += "\tvar new_font= new GmfGraph!BasicFont;\n";
		eol += "\tnew_font.height= font.height;\n";
		eol += "\tnew_font.style= font.style;\n";
		eol += "\treturn new_font;\n";
		eol += "\t}\n";
		eol += "operation createFont(height:Integer,style:String):GmfGraph!BasicFont{\n";
		eol += "\tvar font= new GmfGraph!BasicFont;\n";
		eol += "\tfont.height= height;\n";
		eol += "\tif (style='BOLD'){\n";
		eol += "\t\tfont.style= GmfGraph!FontStyle#BOLD;\n";
		eol += "\t}\n";
		eol += "\telse{\n";
		eol += "\tif (style='ITALIC'){\n";
		eol += "\t\tfont.style= GmfGraph!FontStyle#ITALIC;\n";	
		eol += "\t}\n";
		eol += "\telse{\n";
		eol += "\t\tfont.style= GmfGraph!FontStyle#NORMAL;\n";
		eol += "\t}\n";
		eol += "\t}\n";			
		eol += "\treturn font;\n";
		eol += "\t}\n";
		eol += "operation SpreadFontFormat(figure:String, font:GmfGraph!BasicFont):Sequence(GmfGraph!Label){\n";
		eol += "\tvar name = figure+'LabelFigure';\n";
		eol += "\tvar label: Sequence(GmfGraph!Label)= GmfGraph!Label.all.select(n|n.name=name);\n";
		eol += "\tfor(i:GmfGraph!Label in label){\n";
		eol += "\t\ti.font= CloneFont(font);\n";
		eol += "\t\ti.foregroundColor= createColor(0,0,0);\n";
		eol += "\t}\n";
		eol += "\treturn label;\n";	
		eol += "\t}\n";
		eol += "operation SpreadFontFormatLink(figure:String, ref: String, font:GmfGraph!BasicFont):Sequence(GmfGraph!Label){\n";
		eol += "\tvar name = figure+ref+'ExternalLabel';\n";
		eol += "\tvar label: Sequence(GmfGraph!Label)= GmfGraph!Label.all.select(n|n.name=name);\n";
		eol += "\tfor(i:GmfGraph!Label in label){\n";
		eol += "\t\ti.font= CloneFont(font);\n";
		eol += "\t\ti.foregroundColor= createColor(0,0,0);\n";
		eol += "\t}\n";
		eol += "\treturn label;\n";	
		eol += "\t}\n";		


		
		return eol;
	}
	
	public static String ECore2GMFCode(CevineditEditor editor)
	{
		String eol = "import \"operationsEOL.eol\";\n";
		CEViNEditRoot root = editor.getCevineditModelRoot();
		
		EList<PersonalizedElement> personalizedElements = root.getDiagram().getContainsElem();
		
		for (PersonalizedElement personalizedElement : personalizedElements) 
		{
			if (personalizedElement instanceof NodeEClass)
			{
				NodeEClass ne = (NodeEClass) personalizedElement;
				
				if (ne.getLabelFontStyle().getLiteral().equals(FontStyle.BOLD.getLiteral()))
				{
					eol += "SpreadFontFormat('"+ne.getName()+"', createFont(10, 'BOLD'));\n";
				}
				else
				if (ne.getLabelFontStyle().getLiteral().equals(FontStyle.ITALIC.getLiteral()))
				{
					eol += "SpreadFontFormat('"+ne.getName()+"', createFont(10, 'ITALIC'));\n";					
				}					
					
			}
			if (personalizedElement instanceof LinkEReferenceNonCont)
			{
				LinkEReferenceNonCont link = (LinkEReferenceNonCont) personalizedElement;
				if (link.getLabelFontStyle().getLiteral().equals(FontStyle.BOLD.getLiteral()))
				{
					String name = link.getName().substring(0, link.getName().lastIndexOf('.'));
					String ref = link.getName().substring(link.getName().lastIndexOf('.')+1);

					String ref_name = ref.substring(0, 1).toUpperCase()+ref.substring(1);
					eol += "SpreadFontFormatLink('"+name+"','"+ref_name+"', createFont(10, 'BOLD'));\n";
				}
				else
				if (link.getLabelFontStyle().getLiteral().equals(FontStyle.ITALIC.getLiteral()))
				{
					String name = link.getName().substring(0, link.getName().lastIndexOf('.'));
					String ref = link.getName().substring(link.getName().lastIndexOf('.')+1);

					String ref_name = ref.substring(0, 1).toUpperCase()+ref.substring(1);			
					eol += "SpreadFontFormatLink('"+name+"','"+ref_name+"', createFont(10, 'ITALIC'));\n";					
				}
			}
		}
		
		return eol;
	}
	
}

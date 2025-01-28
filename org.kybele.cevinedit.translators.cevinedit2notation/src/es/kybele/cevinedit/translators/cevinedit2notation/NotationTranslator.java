package es.kybele.cevinedit.translators.cevinedit2notation;


import mapping.DiagramElementMapping;
import mapping.MappingContainer;
import mapping.MappingFactory;
import mapping.NodeMapping;
import mapping.RelationMapping;
import notation.AudienceType;
import notation.BorderStyle;
import notation.Circle;
import notation.Color;
import notation.Compartment;
import notation.DefinitionType;
import notation.DiagramDefinition;
import notation.DiagramElement;
import notation.Diamond;
import notation.Figure;
import notation.FigureStyle;
import notation.FillTextureType;
import notation.GraphicalElement;
import notation.Image;
import notation.Layout;
import notation.Line;
import notation.LineStyle;
import notation.LineTextureType;
import notation.Link;
import notation.Node;
import notation.NotationDefinition;
import notation.NotationFactory;
import notation.Orientation;
import notation.Polyline;
import notation.Rectangle;
import notation.Relation;
import notation.Roundtangle;
import notation.Square;
import notation.Triangle;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;

import cevinedit.CEViNEditRoot;
import cevinedit.CompartmentEReferenceCont;
import cevinedit.Diagram;
import cevinedit.LayoutCompartment;
import cevinedit.LinkEClass;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.NodeEClass;
import cevinedit.NodeFigure;
import cevinedit.PersonalizedElement;

public class NotationTranslator {

	private int ID = 0;
	
	public String getID()
	{
		ID++;
		return String.valueOf(ID);
	}
	
	private NotationFactory notationFactory;
	private MappingFactory mappingFactory;
	
	private Resource cevineditModelResource, ecoreMetamodel, notationModel, mappingModel;
	
	private CEViNEditRoot rootCEViNEditModel;
	private NotationDefinition rootNotationModel;
	private MappingContainer rootMappingModel;
	private EPackage ecoreRootEObject;
	
	public NotationTranslator()
	{
		notationFactory = NotationFactory.eINSTANCE;
		mappingFactory = MappingFactory.eINSTANCE;
	}
	
	public static NotationTranslator INSTANCE()
	{
		
		return new NotationTranslator();
	}
	
	private DiagramElement transformCEViNEditNodeEClassToNotationNode(NodeEClass nodeEClass)
	{
		Node node = notationFactory.createNode();
		node.setID(getID());
		
		FigureStyle figureStyle = generateFigureStyleFromNodeEClass(nodeEClass);		
		BorderStyle borderStyle = generateBorderStyleFromNodeEClass(nodeEClass);
		
		if (nodeEClass.getFigure().equals(NodeFigure.IMAGE) || nodeEClass.getFigure().equals(NodeFigure.SVG))
		{
			Image image = notationFactory.createImage(); 
			image.setID(getID());
			image.setPath(nodeEClass.getImagePath());
			node.setGraphicalElement(image);
		}
		if (nodeEClass.getFigure().equals(NodeFigure.ELLIPSE))
		{
			Circle circle = notationFactory.createCircle();
			circle.setID(getID());
			circle.setFigureStyle(figureStyle);
			circle.setBorderStyle(borderStyle);
			node.setGraphicalElement(circle);
		}
		if (nodeEClass.getFigure().equals(NodeFigure.ELLIPSE))
		{
			Roundtangle roundtangle = notationFactory.createRoundtangle();
			roundtangle.setID(getID());
			roundtangle.setFigureStyle(figureStyle);
			roundtangle.setBorderStyle(borderStyle);
			node.setGraphicalElement(roundtangle);
		}
		if (nodeEClass.getFigure().equals(NodeFigure.RECTANGLE))
		{
			Rectangle rectangle = notationFactory.createRectangle();
			rectangle.setID(getID());
			rectangle.setFigureStyle(figureStyle);
			rectangle.setBorderStyle(borderStyle);
			node.setGraphicalElement(rectangle);
		}	
		if (nodeEClass.getFigure().equals(NodeFigure.POLYGON))
		{
			Figure figure = (Figure) Utils.discoverGraphicalElement(nodeEClass);
			figure.setID(getID());
			figure.setBorderStyle(borderStyle);
			figure.setFigureStyle(figureStyle);
			node.setGraphicalElement(figure);			
		}		
		return node;
	}
	
	private LineTextureType convertCEViNEditTexture2NotationLineTextureTyle(cevinedit.Texture cevineditTexture)
	{
		LineTextureType lineTextureType = LineTextureType.SOLID;
		switch(cevineditTexture.getValue())
		{
			case cevinedit.Texture.DEFAULT_VALUE: lineTextureType = LineTextureType.SOLID; break;
			case cevinedit.Texture.SOLID_VALUE: lineTextureType =  LineTextureType.SOLID; break;
			case cevinedit.Texture.DASH_VALUE: lineTextureType =  LineTextureType.DASH; break;
			case cevinedit.Texture.DOT_VALUE: lineTextureType =  LineTextureType.DOT; break;
		}
		return lineTextureType;
	}
	
	private Color convertCEViNEditColor2NotationColor(cevinedit.Color cevineditColor, cevinedit.Brightness cevineditBrightness)
	{
		Color returnedColor = Color.BLACK;
		switch(cevineditColor.getValue())
		{
			case cevinedit.Color.BLACK_VALUE: 
				returnedColor = Color.BLACK;
				break;
				
			case cevinedit.Color.WHITE_VALUE: 
				returnedColor = Color.WHITE;
				break;
				
			case cevinedit.Color.GRAY_VALUE: 
				switch(cevineditBrightness.getValue())
				{
					case cevinedit.Brightness.LIGHT_VALUE: 
						 returnedColor = Color.LIGHT_GRAY;
						 break;
					case cevinedit.Brightness.DARK_VALUE : 
						 returnedColor = Color.DARK_GRAY;
						 break;
					case cevinedit.Brightness.DEFAULT_VALUE : 
						 returnedColor = Color.GRAY;
						 break;
				}
				break;
				
			case cevinedit.Color.RED_VALUE: 
				returnedColor = Color.RED;
				break;	
				
			case cevinedit.Color.ORANGE_VALUE: 
				returnedColor = Color.ORANGE;
				break;	
				
			case cevinedit.Color.YELLOW_VALUE: 
				returnedColor = Color.YELLOW;
				break;				
				
			case cevinedit.Color.GREEN_VALUE: 
				switch(cevineditBrightness.getValue())
				{
					case cevinedit.Brightness.LIGHT_VALUE: 
						 returnedColor = Color.LIGHT_GREEN;
						 break;
					case cevinedit.Brightness.DARK_VALUE : 
						 returnedColor = Color.DARK_GREEN;
						 break;
					case cevinedit.Brightness.DEFAULT_VALUE : 
						 returnedColor = Color.GREEN;
						 break;
				}
				break;				
			
			case cevinedit.Color.CYAN_VALUE: 
				returnedColor = Color.CYAN;
				break;				
				
			case cevinedit.Color.BLUE_VALUE: 
				switch(cevineditBrightness.getValue())
				{
					case cevinedit.Brightness.LIGHT_VALUE: 
						 returnedColor = Color.LIGHT_BLUE;
						 break;
					case cevinedit.Brightness.DARK_VALUE : 
						 returnedColor = Color.DARK_BLUE;
						 break;
					case cevinedit.Brightness.DEFAULT_VALUE : 
						 returnedColor = Color.BLUE;
						 break;
				}
				break;					

		}
		return returnedColor;
	}
	
	private FigureStyle generateFigureStyleFromNodeEClass(NodeEClass nodeEClass)
	{
		FigureStyle figureStyle = notationFactory.createFigureStyle();
		figureStyle.setWidth(Float.parseFloat(nodeEClass.getSize().substring(0, nodeEClass.getSize().lastIndexOf(","))));
		figureStyle.setHeight(Float.parseFloat(nodeEClass.getSize().substring(nodeEClass.getSize().lastIndexOf(",")+1)));
		figureStyle.setOrientation(Orientation.HORIZONTAL);
		figureStyle.setBrightness(0);
		figureStyle.setFillColor(convertCEViNEditColor2NotationColor(nodeEClass.getBackgroundColor(), nodeEClass.getBrightness()));
		figureStyle.setFillTexture(FillTextureType.NONE);
		figureStyle.setFillOrientation(Orientation.HORIZONTAL);
		figureStyle.setFillTextureColor(figureStyle.getFillColor());
		return figureStyle;
	}
	
	private BorderStyle generateBorderStyleFromNodeEClass(NodeEClass nodeEClass)
	{
		BorderStyle borderStyle = notationFactory.createBorderStyle();
		borderStyle.setThickness(nodeEClass.getBorderWidth());
		borderStyle.setColor(convertCEViNEditColor2NotationColor(nodeEClass.getBackgroundColor(), nodeEClass.getBrightness()));
		borderStyle.setTexture(convertCEViNEditTexture2NotationLineTextureTyle(nodeEClass.getBorderTexture()));
		return borderStyle;
	}
	

	
	private LineStyle transformCEViNEditLinkToNotationLineStyle(cevinedit.Link link)
	{
		LineStyle lineStyle = notationFactory.createLineStyle();
		
		lineStyle.setThickness(link.getWidth());		
		lineStyle.setColor(convertCEViNEditColor2NotationColor(link.getColor(), link.getBrightness()));		
		lineStyle.setOrientation(Orientation.HORIZONTAL);		
		lineStyle.setBrightness(0);		
		lineStyle.setTexture(convertCEViNEditTexture2NotationLineTextureTyle(link.getTexture()));		
		return lineStyle;
	}
	
	private Line transformCEViNEditLinkToNotationLine(cevinedit.Link link)
	{
		LineStyle lineStyle = transformCEViNEditLinkToNotationLineStyle(link);		
		Line line = notationFactory.createLine(); 
		line.setID(getID());
		line.setLineStyle(lineStyle);		
		return line;		
	}
	
	private DiagramElement transformCEViNEditPersonalizedElement2NotationDiagramElement(PersonalizedElement ps)
	{
		if (ps instanceof NodeEClass)
		{			
			NodeEClass nodeEClass = (NodeEClass) ps;
			return transformCEViNEditNodeEClassToNotationNode(nodeEClass);
		}
		else if (ps instanceof CompartmentEReferenceCont)
		{
			CompartmentEReferenceCont compartmentEReferenceCont = (CompartmentEReferenceCont) ps;
			Compartment compartment = notationFactory.createCompartment();
			compartment.setID(getID());
			compartment.setLayout(Layout.UNKNOWN);		
			return compartment;
		}
		else if (ps instanceof LinkEReferenceNonCont || ps instanceof LinkEClass)
		{
			Link link = notationFactory.createLink();
			link.setID(getID());			
			Line line = transformCEViNEditLinkToNotationLine((cevinedit.Link) ps);			
			link.setGraphicalElement(line);			
			return link;
		}		
		return null;
	}
	
	private EClass transformCEViNEditPersonalizedElementToEClass(PersonalizedElement personalizedElement, 
																Resource _ecoreMetamodel)
	{
		String eClassNameToFind = "";
		if (personalizedElement instanceof NodeEClass)
		{
			eClassNameToFind = ((NodeEClass) personalizedElement).getName();
		}
		else if (personalizedElement instanceof LinkEClass)
		{
			eClassNameToFind = ((LinkEClass) personalizedElement).getName();
		}
		else if (personalizedElement instanceof LinkEReferenceNonCont)
		{
			String nameLink = ((LinkEReferenceNonCont) personalizedElement).getName();
			eClassNameToFind = nameLink.substring(0, nameLink.lastIndexOf("."));
		}		
		return Utils.findEClassByNameInResource(ecoreMetamodel, eClassNameToFind);
	}
	
	private DiagramElementMapping transformCEViNEditPersonalizedElementAndNotationDiagramElementToMappingDiagramElementMapping(
									PersonalizedElement personalizedElement,
									DiagramElement diagramElement)
	{
		
		EClass eClass = transformCEViNEditPersonalizedElementToEClass(personalizedElement, ecoreMetamodel);
		if (personalizedElement instanceof NodeEClass)
		{
			NodeMapping nodeMapping = mappingFactory.createNodeMapping(); 
			nodeMapping.setID(diagramElement.getID());
			nodeMapping.setNode((Node)diagramElement);
			nodeMapping.setAbstractContainingClass(eClass);			
			return nodeMapping;
		}
		else if (personalizedElement instanceof LinkEClass || 
				 personalizedElement instanceof LinkEReferenceNonCont)
		{
			RelationMapping relationMapping = mappingFactory.createRelationMapping();
			relationMapping.setID(diagramElement.getID());
			relationMapping.setRelation((Relation) diagramElement);
			relationMapping.setAbstractContainingClass(eClass);			
			return relationMapping;
		}
		return null;
	}
	
	private DiagramDefinition transformCEViNEditDiagramToNotationDiagramDefinition(Diagram diagram)
	{		
		DiagramDefinition diagramDefinition = notationFactory.createDiagramDefinition();		
		diagramDefinition.setLegend(diagram.getName());		
		diagramDefinition.setTargetedAudience(AudienceType.BOTH);
		diagramDefinition.setLevel(0);

		for(PersonalizedElement ps : diagram.getContainsElem())
		{
			DiagramElement diagramElement = transformCEViNEditPersonalizedElement2NotationDiagramElement(ps);			
			if (diagramElement != null)	diagramDefinition.getElements().add(diagramElement);
			DiagramElementMapping diagramElementMapping = transformCEViNEditPersonalizedElementAndNotationDiagramElementToMappingDiagramElementMapping(ps, diagramElement);
			if (diagramElementMapping instanceof RelationMapping)
			{
				rootMappingModel.getRelationMappings().add((RelationMapping) diagramElementMapping);
			}
			if (diagramElementMapping instanceof NodeMapping)
			{
				rootMappingModel.getNodeMappings().add((NodeMapping) diagramElementMapping);
			}			
		}		
		return diagramDefinition;
	}
	
	private void transformCEViNEditRootToNotationDiagramDefinition(CEViNEditRoot _rootCEViNEditModel)
	{		
		rootNotationModel.setType(DefinitionType.HYBRID);	
		Diagram diagram = _rootCEViNEditModel.getDiagram();		
		DiagramDefinition diagramDefinition = transformCEViNEditDiagramToNotationDiagramDefinition(diagram);		
		rootNotationModel.getDiagrams().add(diagramDefinition);
	}
	
	public void initializeModels() throws Exception
	{
		rootCEViNEditModel = (CEViNEditRoot) cevineditModelResource.getContents().get(0);
    	rootNotationModel = notationFactory.createNotationDefinition();    	
    	rootMappingModel = mappingFactory.createMappingContainer();
    	ecoreRootEObject = (EPackage) ecoreMetamodel.getContents().get(0);
    	if (rootCEViNEditModel == null)
    	{
    		throw new Exception("The root EObject of CEViNEdit Model is corrupted.");
    	}
    	if (ecoreRootEObject == null)
    	{
    		throw new Exception("The root EObject of Ecore Model is corrupted.");
    	}
	}
	
	public void makeTransformations()
	{
		transformCEViNEditRootToNotationDiagramDefinition(rootCEViNEditModel);
	}
	
	public void saveResourcesGenerated()
	{
    	notationModel.getContents().add(rootNotationModel);
    	mappingModel.getContents().add(rootMappingModel);
	}
	
	public void execute(Resource _cevineditModel, Resource _ecoreModel, Resource _notationModel, Resource _mappingModel) throws Exception
	{
		cevineditModelResource = _cevineditModel;
		ecoreMetamodel = _ecoreModel;
		notationModel = _notationModel;
		mappingModel = _mappingModel;		
		initializeModels();		
		makeTransformations();		
		saveResourcesGenerated();
	}
}

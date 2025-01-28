/**
 */
package notation.impl;

import notation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotationFactoryImpl extends EFactoryImpl implements NotationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotationFactory init() {
		try {
			NotationFactory theNotationFactory = (NotationFactory)EPackage.Registry.INSTANCE.getEFactory(NotationPackage.eNS_URI);
			if (theNotationFactory != null) {
				return theNotationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NotationPackage.NOTATION_DEFINITION: return createNotationDefinition();
			case NotationPackage.DIAGRAM_DEFINITION: return createDiagramDefinition();
			case NotationPackage.ID_ELEMENT: return createIDElement();
			case NotationPackage.NODE: return createNode();
			case NotationPackage.COMPARTMENT: return createCompartment();
			case NotationPackage.LINK: return createLink();
			case NotationPackage.SYNTAX_OF: return createSyntaxOf();
			case NotationPackage.ICON: return createIcon();
			case NotationPackage.IMAGE: return createImage();
			case NotationPackage.COMPOSITE: return createComposite();
			case NotationPackage.LABEL: return createLabel();
			case NotationPackage.LINE: return createLine();
			case NotationPackage.FIGURE_CONTAINMENT: return createFigureContainment();
			case NotationPackage.RECTANGLE: return createRectangle();
			case NotationPackage.ROUNDTANGLE: return createRoundtangle();
			case NotationPackage.SQUARE: return createSquare();
			case NotationPackage.DIAMOND: return createDiamond();
			case NotationPackage.TRIANGLE: return createTriangle();
			case NotationPackage.CIRCLE: return createCircle();
			case NotationPackage.CYLINDER: return createCylinder();
			case NotationPackage.CUBE: return createCube();
			case NotationPackage.POLYLINE: return createPolyline();
			case NotationPackage.POINT: return createPoint();
			case NotationPackage.TEXTUAL_CONTAINMENT: return createTextualContainment();
			case NotationPackage.TOKEN: return createToken();
			case NotationPackage.KEYWORD: return createKeyword();
			case NotationPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case NotationPackage.REFERENCE_VALUE: return createReferenceValue();
			case NotationPackage.LINE_STYLE: return createLineStyle();
			case NotationPackage.FIGURE_STYLE: return createFigureStyle();
			case NotationPackage.ICON_STYLE: return createIconStyle();
			case NotationPackage.BORDER_STYLE: return createBorderStyle();
			case NotationPackage.TEXT_STYLE: return createTextStyle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NotationPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case NotationPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case NotationPackage.LINE_TEXTURE_TYPE:
				return createLineTextureTypeFromString(eDataType, initialValue);
			case NotationPackage.FILL_TEXTURE_TYPE:
				return createFillTextureTypeFromString(eDataType, initialValue);
			case NotationPackage.DEFINITION_TYPE:
				return createDefinitionTypeFromString(eDataType, initialValue);
			case NotationPackage.LAYOUT:
				return createLayoutFromString(eDataType, initialValue);
			case NotationPackage.ICON_TYPE:
				return createIconTypeFromString(eDataType, initialValue);
			case NotationPackage.AUDIENCE_TYPE:
				return createAudienceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NotationPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case NotationPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case NotationPackage.LINE_TEXTURE_TYPE:
				return convertLineTextureTypeToString(eDataType, instanceValue);
			case NotationPackage.FILL_TEXTURE_TYPE:
				return convertFillTextureTypeToString(eDataType, instanceValue);
			case NotationPackage.DEFINITION_TYPE:
				return convertDefinitionTypeToString(eDataType, instanceValue);
			case NotationPackage.LAYOUT:
				return convertLayoutToString(eDataType, instanceValue);
			case NotationPackage.ICON_TYPE:
				return convertIconTypeToString(eDataType, instanceValue);
			case NotationPackage.AUDIENCE_TYPE:
				return convertAudienceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationDefinition createNotationDefinition() {
		NotationDefinitionImpl notationDefinition = new NotationDefinitionImpl();
		return notationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDefinition createDiagramDefinition() {
		DiagramDefinitionImpl diagramDefinition = new DiagramDefinitionImpl();
		return diagramDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDElement createIDElement() {
		IDElementImpl idElement = new IDElementImpl();
		return idElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment createCompartment() {
		CompartmentImpl compartment = new CompartmentImpl();
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxOf createSyntaxOf() {
		SyntaxOfImpl syntaxOf = new SyntaxOfImpl();
		return syntaxOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureContainment createFigureContainment() {
		FigureContainmentImpl figureContainment = new FigureContainmentImpl();
		return figureContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roundtangle createRoundtangle() {
		RoundtangleImpl roundtangle = new RoundtangleImpl();
		return roundtangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square createSquare() {
		SquareImpl square = new SquareImpl();
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diamond createDiamond() {
		DiamondImpl diamond = new DiamondImpl();
		return diamond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triangle createTriangle() {
		TriangleImpl triangle = new TriangleImpl();
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cylinder createCylinder() {
		CylinderImpl cylinder = new CylinderImpl();
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cube createCube() {
		CubeImpl cube = new CubeImpl();
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline createPolyline() {
		PolylineImpl polyline = new PolylineImpl();
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualContainment createTextualContainment() {
		TextualContainmentImpl textualContainment = new TextualContainmentImpl();
		return textualContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeyword() {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue createAttributeValue() {
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceValue createReferenceValue() {
		ReferenceValueImpl referenceValue = new ReferenceValueImpl();
		return referenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyle() {
		LineStyleImpl lineStyle = new LineStyleImpl();
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureStyle createFigureStyle() {
		FigureStyleImpl figureStyle = new FigureStyleImpl();
		return figureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconStyle createIconStyle() {
		IconStyleImpl iconStyle = new IconStyleImpl();
		return iconStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderStyle createBorderStyle() {
		BorderStyleImpl borderStyle = new BorderStyleImpl();
		return borderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyle createTextStyle() {
		TextStyleImpl textStyle = new TextStyleImpl();
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTextureType createLineTextureTypeFromString(EDataType eDataType, String initialValue) {
		LineTextureType result = LineTextureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineTextureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillTextureType createFillTextureTypeFromString(EDataType eDataType, String initialValue) {
		FillTextureType result = FillTextureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillTextureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionType createDefinitionTypeFromString(EDataType eDataType, String initialValue) {
		DefinitionType result = DefinitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayoutFromString(EDataType eDataType, String initialValue) {
		Layout result = Layout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconType createIconTypeFromString(EDataType eDataType, String initialValue) {
		IconType result = IconType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIconTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudienceType createAudienceTypeFromString(EDataType eDataType, String initialValue) {
		AudienceType result = AudienceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAudienceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationPackage getNotationPackage() {
		return (NotationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NotationPackage getPackage() {
		return NotationPackage.eINSTANCE;
	}

} //NotationFactoryImpl

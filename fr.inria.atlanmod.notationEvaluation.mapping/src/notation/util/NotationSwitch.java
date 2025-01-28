/**
 */
package notation.util;

import notation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see notation.NotationPackage
 * @generated
 */
public class NotationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NotationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationSwitch() {
		if (modelPackage == null) {
			modelPackage = NotationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NotationPackage.NOTATION_DEFINITION: {
				NotationDefinition notationDefinition = (NotationDefinition)theEObject;
				T result = caseNotationDefinition(notationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.DIAGRAM_DEFINITION: {
				DiagramDefinition diagramDefinition = (DiagramDefinition)theEObject;
				T result = caseDiagramDefinition(diagramDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.ID_ELEMENT: {
				IDElement idElement = (IDElement)theEObject;
				T result = caseIDElement(idElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = caseIDElement(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseDiagramElement(node);
				if (result == null) result = caseIDElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseDiagramElement(relation);
				if (result == null) result = caseIDElement(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.COMPARTMENT: {
				Compartment compartment = (Compartment)theEObject;
				T result = caseCompartment(compartment);
				if (result == null) result = caseRelation(compartment);
				if (result == null) result = caseDiagramElement(compartment);
				if (result == null) result = caseIDElement(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseRelation(link);
				if (result == null) result = caseDiagramElement(link);
				if (result == null) result = caseIDElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.GRAPHICAL_ELEMENT: {
				GraphicalElement graphicalElement = (GraphicalElement)theEObject;
				T result = caseGraphicalElement(graphicalElement);
				if (result == null) result = caseIDElement(graphicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.SYNTAX_OF: {
				SyntaxOf syntaxOf = (SyntaxOf)theEObject;
				T result = caseSyntaxOf(syntaxOf);
				if (result == null) result = caseGraphicalElement(syntaxOf);
				if (result == null) result = caseIDElement(syntaxOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.ICON: {
				Icon icon = (Icon)theEObject;
				T result = caseIcon(icon);
				if (result == null) result = caseGraphicalElement(icon);
				if (result == null) result = caseIDElement(icon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseGraphicalElement(image);
				if (result == null) result = caseIDElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseGraphicalElement(composite);
				if (result == null) result = caseIDElement(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseGraphicalElement(label);
				if (result == null) result = caseIDElement(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseGraphicalElement(line);
				if (result == null) result = caseIDElement(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.FIGURE: {
				Figure figure = (Figure)theEObject;
				T result = caseFigure(figure);
				if (result == null) result = caseGraphicalElement(figure);
				if (result == null) result = caseIDElement(figure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.FIGURE_CONTAINMENT: {
				FigureContainment figureContainment = (FigureContainment)theEObject;
				T result = caseFigureContainment(figureContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseFigure(rectangle);
				if (result == null) result = caseGraphicalElement(rectangle);
				if (result == null) result = caseIDElement(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.ROUNDTANGLE: {
				Roundtangle roundtangle = (Roundtangle)theEObject;
				T result = caseRoundtangle(roundtangle);
				if (result == null) result = caseFigure(roundtangle);
				if (result == null) result = caseGraphicalElement(roundtangle);
				if (result == null) result = caseIDElement(roundtangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.SQUARE: {
				Square square = (Square)theEObject;
				T result = caseSquare(square);
				if (result == null) result = caseFigure(square);
				if (result == null) result = caseGraphicalElement(square);
				if (result == null) result = caseIDElement(square);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.DIAMOND: {
				Diamond diamond = (Diamond)theEObject;
				T result = caseDiamond(diamond);
				if (result == null) result = caseFigure(diamond);
				if (result == null) result = caseGraphicalElement(diamond);
				if (result == null) result = caseIDElement(diamond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.TRIANGLE: {
				Triangle triangle = (Triangle)theEObject;
				T result = caseTriangle(triangle);
				if (result == null) result = caseFigure(triangle);
				if (result == null) result = caseGraphicalElement(triangle);
				if (result == null) result = caseIDElement(triangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				T result = caseCircle(circle);
				if (result == null) result = caseFigure(circle);
				if (result == null) result = caseGraphicalElement(circle);
				if (result == null) result = caseIDElement(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.CYLINDER: {
				Cylinder cylinder = (Cylinder)theEObject;
				T result = caseCylinder(cylinder);
				if (result == null) result = caseFigure(cylinder);
				if (result == null) result = caseGraphicalElement(cylinder);
				if (result == null) result = caseIDElement(cylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.CUBE: {
				Cube cube = (Cube)theEObject;
				T result = caseCube(cube);
				if (result == null) result = caseFigure(cube);
				if (result == null) result = caseGraphicalElement(cube);
				if (result == null) result = caseIDElement(cube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.POLYLINE: {
				Polyline polyline = (Polyline)theEObject;
				T result = casePolyline(polyline);
				if (result == null) result = caseFigure(polyline);
				if (result == null) result = caseGraphicalElement(polyline);
				if (result == null) result = caseIDElement(polyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.TEXTUAL_CONTAINMENT: {
				TextualContainment textualContainment = (TextualContainment)theEObject;
				T result = caseTextualContainment(textualContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.TEXTUAL_ELEMENT: {
				TextualElement textualElement = (TextualElement)theEObject;
				T result = caseTextualElement(textualElement);
				if (result == null) result = caseIDElement(textualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = caseTextualElement(token);
				if (result == null) result = caseIDElement(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.KEYWORD: {
				Keyword keyword = (Keyword)theEObject;
				T result = caseKeyword(keyword);
				if (result == null) result = caseTextualElement(keyword);
				if (result == null) result = caseIDElement(keyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseTextualElement(value);
				if (result == null) result = caseIDElement(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = caseValue(attributeValue);
				if (result == null) result = caseTextualElement(attributeValue);
				if (result == null) result = caseIDElement(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.REFERENCE_VALUE: {
				ReferenceValue referenceValue = (ReferenceValue)theEObject;
				T result = caseReferenceValue(referenceValue);
				if (result == null) result = caseValue(referenceValue);
				if (result == null) result = caseTextualElement(referenceValue);
				if (result == null) result = caseIDElement(referenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.STYLE: {
				Style style = (Style)theEObject;
				T result = caseStyle(style);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.LINE_STYLE: {
				LineStyle lineStyle = (LineStyle)theEObject;
				T result = caseLineStyle(lineStyle);
				if (result == null) result = caseStyle(lineStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.FIGURE_STYLE: {
				FigureStyle figureStyle = (FigureStyle)theEObject;
				T result = caseFigureStyle(figureStyle);
				if (result == null) result = caseStyle(figureStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.ICON_STYLE: {
				IconStyle iconStyle = (IconStyle)theEObject;
				T result = caseIconStyle(iconStyle);
				if (result == null) result = caseStyle(iconStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.BORDER_STYLE: {
				BorderStyle borderStyle = (BorderStyle)theEObject;
				T result = caseBorderStyle(borderStyle);
				if (result == null) result = caseStyle(borderStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NotationPackage.TEXT_STYLE: {
				TextStyle textStyle = (TextStyle)theEObject;
				T result = caseTextStyle(textStyle);
				if (result == null) result = caseStyle(textStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotationDefinition(NotationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramDefinition(DiagramDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDElement(IDElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartment(Compartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicalElement(GraphicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntax Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntax Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntaxOf(SyntaxOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcon(Icon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigure(Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureContainment(FigureContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roundtangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roundtangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundtangle(Roundtangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Square</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Square</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSquare(Square object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diamond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diamond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiamond(Diamond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangle(Triangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinder(Cylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCube(Cube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyline(Polyline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualContainment(TextualContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualElement(TextualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyword(Keyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceValue(ReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle(Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyle(LineStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureStyle(FigureStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconStyle(IconStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderStyle(BorderStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextStyle(TextStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NotationSwitch

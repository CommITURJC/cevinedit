/**
 */
package notation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see notation.NotationFactory
 * @model kind="package"
 * @generated
 */
public interface NotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "notation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inria.atlanmod.fr/notationEvaluation/notation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "notation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotationPackage eINSTANCE = notation.impl.NotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link notation.impl.NotationDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.NotationDefinitionImpl
	 * @see notation.impl.NotationPackageImpl#getNotationDefinition()
	 * @generated
	 */
	int NOTATION_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_DEFINITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_DEFINITION__DIAGRAMS = 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notation.impl.DiagramDefinitionImpl <em>Diagram Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.DiagramDefinitionImpl
	 * @see notation.impl.NotationPackageImpl#getDiagramDefinition()
	 * @generated
	 */
	int DIAGRAM_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_DEFINITION__LEGEND = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_DEFINITION__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_DEFINITION__ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Allow Chunks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_DEFINITION__ALLOW_CHUNKS = 3;

	/**
	 * The feature id for the '<em><b>Targeted Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_DEFINITION__TARGETED_AUDIENCE = 4;

	/**
	 * The number of structural features of the '<em>Diagram Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Diagram Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notation.impl.IDElementImpl <em>ID Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.IDElementImpl
	 * @see notation.impl.NotationPackageImpl#getIDElement()
	 * @generated
	 */
	int ID_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>ID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notation.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.DiagramElementImpl
	 * @see notation.impl.NotationPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__ID = ID_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.NodeImpl
	 * @see notation.impl.NotationPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Graphical Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPHICAL_ELEMENT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.RelationImpl
	 * @see notation.impl.NotationPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = DIAGRAM_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.CompartmentImpl
	 * @see notation.impl.NotationPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__ID = RELATION__ID;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__LAYOUT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NODE_TYPE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.LinkImpl
	 * @see notation.impl.NotationPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = RELATION__ID;

	/**
	 * The feature id for the '<em><b>Graphical Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__GRAPHICAL_ELEMENT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.GraphicalElementImpl
	 * @see notation.impl.NotationPackageImpl#getGraphicalElement()
	 * @generated
	 */
	int GRAPHICAL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__ID = ID_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.SyntaxOfImpl <em>Syntax Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.SyntaxOfImpl
	 * @see notation.impl.NotationPackageImpl#getSyntaxOf()
	 * @generated
	 */
	int SYNTAX_OF = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_OF__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_OF__REFERRED_ELEMENT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Syntax Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_OF_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Syntax Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_OF_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.IconImpl
	 * @see notation.impl.NotationPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__STYLE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ICON_TYPE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.ImageImpl
	 * @see notation.impl.NotationPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Approximate Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__APPROXIMATE_REPRESENTATION = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.CompositeImpl
	 * @see notation.impl.NotationPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__LAYOUT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SUB_ELEMENTS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Shape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PRIMARY_SHAPE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.LabelImpl
	 * @see notation.impl.NotationPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_STYLE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.LineImpl
	 * @see notation.impl.NotationPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LINE_STYLE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.FigureImpl <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.FigureImpl
	 * @see notation.impl.NotationPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FIGURE_STYLE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BORDER_STYLE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FIGURE_CONTAINMENT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.FigureContainmentImpl <em>Figure Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.FigureContainmentImpl
	 * @see notation.impl.NotationPackageImpl#getFigureContainment()
	 * @generated
	 */
	int FIGURE_CONTAINMENT = 16;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CONTAINMENT__LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CONTAINMENT__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Figure Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CONTAINMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Figure Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_CONTAINMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notation.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.RectangleImpl
	 * @see notation.impl.NotationPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.RoundtangleImpl <em>Roundtangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.RoundtangleImpl
	 * @see notation.impl.NotationPackageImpl#getRoundtangle()
	 * @generated
	 */
	int ROUNDTANGLE = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDTANGLE__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDTANGLE__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDTANGLE__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDTANGLE__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Roundtangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDTANGLE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Roundtangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDTANGLE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.SquareImpl
	 * @see notation.impl.NotationPackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.DiamondImpl <em>Diamond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.DiamondImpl
	 * @see notation.impl.NotationPackageImpl#getDiamond()
	 * @generated
	 */
	int DIAMOND = 20;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Diamond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diamond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.TriangleImpl
	 * @see notation.impl.NotationPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 21;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.CircleImpl
	 * @see notation.impl.NotationPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 22;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.CylinderImpl
	 * @see notation.impl.NotationPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 23;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.CubeImpl <em>Cube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.CubeImpl
	 * @see notation.impl.NotationPackageImpl#getCube()
	 * @generated
	 */
	int CUBE = 24;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.PolylineImpl
	 * @see notation.impl.NotationPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ID = FIGURE__ID;

	/**
	 * The feature id for the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FIGURE_STYLE = FIGURE__FIGURE_STYLE;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BORDER_STYLE = FIGURE__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FIGURE_CONTAINMENT = FIGURE__FIGURE_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__POINTS = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.PointImpl
	 * @see notation.impl.NotationPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 26;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notation.impl.TextualContainmentImpl <em>Textual Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.TextualContainmentImpl
	 * @see notation.impl.NotationPackageImpl#getTextualContainment()
	 * @generated
	 */
	int TEXTUAL_CONTAINMENT = 27;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTAINMENT__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTAINMENT__LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Textual Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTAINMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Textual Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTAINMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notation.impl.TextualElementImpl <em>Textual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.TextualElementImpl
	 * @see notation.impl.NotationPackageImpl#getTextualElement()
	 * @generated
	 */
	int TEXTUAL_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT__ID = ID_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Textual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT_FEATURE_COUNT = ID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Textual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT_OPERATION_COUNT = ID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.TokenImpl
	 * @see notation.impl.NotationPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 29;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ID = TEXTUAL_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = TEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = TEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.KeywordImpl
	 * @see notation.impl.NotationPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 30;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__ID = TEXTUAL_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = TEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_OPERATION_COUNT = TEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.ValueImpl
	 * @see notation.impl.NotationPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 31;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = TEXTUAL_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = TEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = TEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.AttributeValueImpl
	 * @see notation.impl.NotationPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 32;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ID = VALUE__ID;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.ReferenceValueImpl
	 * @see notation.impl.NotationPackageImpl#getReferenceValue()
	 * @generated
	 */
	int REFERENCE_VALUE = 33;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE__ID = VALUE__ID;

	/**
	 * The number of structural features of the '<em>Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.StyleImpl
	 * @see notation.impl.NotationPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 34;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notation.impl.LineStyleImpl <em>Line Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.LineStyleImpl
	 * @see notation.impl.NotationPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 35;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__THICKNESS = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__COLOR = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__ORIENTATION = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__LENGTH = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__BRIGHTNESS = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__TEXTURE = STYLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.FigureStyleImpl <em>Figure Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.FigureStyleImpl
	 * @see notation.impl.NotationPackageImpl#getFigureStyle()
	 * @generated
	 */
	int FIGURE_STYLE = 36;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__WIDTH = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__HEIGHT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__ORIENTATION = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__BRIGHTNESS = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__FILL_COLOR = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__FILL_TEXTURE = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fill Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__FILL_ORIENTATION = STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fill Texture Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE__FILL_TEXTURE_COLOR = STYLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Figure Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Figure Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.IconStyleImpl <em>Icon Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.IconStyleImpl
	 * @see notation.impl.NotationPackageImpl#getIconStyle()
	 * @generated
	 */
	int ICON_STYLE = 37;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__WIDTH = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__HEIGHT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__ORIENTATION = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__BRIGHTNESS = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE__COLOR = STYLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Icon Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Icon Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.BorderStyleImpl <em>Border Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.BorderStyleImpl
	 * @see notation.impl.NotationPackageImpl#getBorderStyle()
	 * @generated
	 */
	int BORDER_STYLE = 38;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_STYLE__THICKNESS = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_STYLE__COLOR = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_STYLE__TEXTURE = STYLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Border Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Border Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.impl.TextStyleImpl <em>Text Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.impl.TextStyleImpl
	 * @see notation.impl.NotationPackageImpl#getTextStyle()
	 * @generated
	 */
	int TEXT_STYLE = 39;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_SIZE = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_NAME = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BOLD = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ITALIC = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Underlined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__UNDERLINED = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_COLOR = STYLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link notation.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.Color
	 * @see notation.impl.NotationPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 40;

	/**
	 * The meta object id for the '{@link notation.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.Orientation
	 * @see notation.impl.NotationPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 41;

	/**
	 * The meta object id for the '{@link notation.LineTextureType <em>Line Texture Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.LineTextureType
	 * @see notation.impl.NotationPackageImpl#getLineTextureType()
	 * @generated
	 */
	int LINE_TEXTURE_TYPE = 42;

	/**
	 * The meta object id for the '{@link notation.FillTextureType <em>Fill Texture Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.FillTextureType
	 * @see notation.impl.NotationPackageImpl#getFillTextureType()
	 * @generated
	 */
	int FILL_TEXTURE_TYPE = 43;

	/**
	 * The meta object id for the '{@link notation.DefinitionType <em>Definition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.DefinitionType
	 * @see notation.impl.NotationPackageImpl#getDefinitionType()
	 * @generated
	 */
	int DEFINITION_TYPE = 44;

	/**
	 * The meta object id for the '{@link notation.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.Layout
	 * @see notation.impl.NotationPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 45;

	/**
	 * The meta object id for the '{@link notation.IconType <em>Icon Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.IconType
	 * @see notation.impl.NotationPackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 46;

	/**
	 * The meta object id for the '{@link notation.AudienceType <em>Audience Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notation.AudienceType
	 * @see notation.impl.NotationPackageImpl#getAudienceType()
	 * @generated
	 */
	int AUDIENCE_TYPE = 47;


	/**
	 * Returns the meta object for class '{@link notation.NotationDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see notation.NotationDefinition
	 * @generated
	 */
	EClass getNotationDefinition();

	/**
	 * Returns the meta object for the attribute '{@link notation.NotationDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see notation.NotationDefinition#getType()
	 * @see #getNotationDefinition()
	 * @generated
	 */
	EAttribute getNotationDefinition_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link notation.NotationDefinition#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see notation.NotationDefinition#getDiagrams()
	 * @see #getNotationDefinition()
	 * @generated
	 */
	EReference getNotationDefinition_Diagrams();

	/**
	 * Returns the meta object for class '{@link notation.DiagramDefinition <em>Diagram Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Definition</em>'.
	 * @see notation.DiagramDefinition
	 * @generated
	 */
	EClass getDiagramDefinition();

	/**
	 * Returns the meta object for the attribute '{@link notation.DiagramDefinition#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend</em>'.
	 * @see notation.DiagramDefinition#getLegend()
	 * @see #getDiagramDefinition()
	 * @generated
	 */
	EAttribute getDiagramDefinition_Legend();

	/**
	 * Returns the meta object for the attribute '{@link notation.DiagramDefinition#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see notation.DiagramDefinition#getLevel()
	 * @see #getDiagramDefinition()
	 * @generated
	 */
	EAttribute getDiagramDefinition_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link notation.DiagramDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see notation.DiagramDefinition#getElements()
	 * @see #getDiagramDefinition()
	 * @generated
	 */
	EReference getDiagramDefinition_Elements();

	/**
	 * Returns the meta object for the attribute '{@link notation.DiagramDefinition#isAllowChunks <em>Allow Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Chunks</em>'.
	 * @see notation.DiagramDefinition#isAllowChunks()
	 * @see #getDiagramDefinition()
	 * @generated
	 */
	EAttribute getDiagramDefinition_AllowChunks();

	/**
	 * Returns the meta object for the attribute '{@link notation.DiagramDefinition#getTargetedAudience <em>Targeted Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targeted Audience</em>'.
	 * @see notation.DiagramDefinition#getTargetedAudience()
	 * @see #getDiagramDefinition()
	 * @generated
	 */
	EAttribute getDiagramDefinition_TargetedAudience();

	/**
	 * Returns the meta object for class '{@link notation.IDElement <em>ID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Element</em>'.
	 * @see notation.IDElement
	 * @generated
	 */
	EClass getIDElement();

	/**
	 * Returns the meta object for the attribute '{@link notation.IDElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see notation.IDElement#getID()
	 * @see #getIDElement()
	 * @generated
	 */
	EAttribute getIDElement_ID();

	/**
	 * Returns the meta object for class '{@link notation.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see notation.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for class '{@link notation.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see notation.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Node#getGraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphical Element</em>'.
	 * @see notation.Node#getGraphicalElement()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_GraphicalElement();

	/**
	 * Returns the meta object for class '{@link notation.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see notation.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link notation.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see notation.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link notation.Compartment#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see notation.Compartment#getLayout()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Layout();

	/**
	 * Returns the meta object for the reference '{@link notation.Compartment#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Type</em>'.
	 * @see notation.Compartment#getNodeType()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_NodeType();

	/**
	 * Returns the meta object for class '{@link notation.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see notation.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Link#getGraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphical Element</em>'.
	 * @see notation.Link#getGraphicalElement()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_GraphicalElement();

	/**
	 * Returns the meta object for class '{@link notation.GraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Element</em>'.
	 * @see notation.GraphicalElement
	 * @generated
	 */
	EClass getGraphicalElement();

	/**
	 * Returns the meta object for class '{@link notation.SyntaxOf <em>Syntax Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax Of</em>'.
	 * @see notation.SyntaxOf
	 * @generated
	 */
	EClass getSyntaxOf();

	/**
	 * Returns the meta object for the reference '{@link notation.SyntaxOf#getReferredElement <em>Referred Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Element</em>'.
	 * @see notation.SyntaxOf#getReferredElement()
	 * @see #getSyntaxOf()
	 * @generated
	 */
	EReference getSyntaxOf_ReferredElement();

	/**
	 * Returns the meta object for class '{@link notation.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see notation.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Icon#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see notation.Icon#getStyle()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_Style();

	/**
	 * Returns the meta object for the attribute '{@link notation.Icon#getIconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Type</em>'.
	 * @see notation.Icon#getIconType()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_IconType();

	/**
	 * Returns the meta object for class '{@link notation.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see notation.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link notation.Image#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see notation.Image#getPath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Path();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Image#getApproximateRepresentation <em>Approximate Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approximate Representation</em>'.
	 * @see notation.Image#getApproximateRepresentation()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_ApproximateRepresentation();

	/**
	 * Returns the meta object for class '{@link notation.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see notation.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the attribute '{@link notation.Composite#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see notation.Composite#getLayout()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link notation.Composite#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
	 * @see notation.Composite#getSubElements()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_SubElements();

	/**
	 * Returns the meta object for the reference '{@link notation.Composite#getPrimaryShape <em>Primary Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Shape</em>'.
	 * @see notation.Composite#getPrimaryShape()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_PrimaryShape();

	/**
	 * Returns the meta object for class '{@link notation.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see notation.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Label#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Style</em>'.
	 * @see notation.Label#getTextStyle()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_TextStyle();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see notation.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Text();

	/**
	 * Returns the meta object for class '{@link notation.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see notation.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Line#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style</em>'.
	 * @see notation.Line#getLineStyle()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_LineStyle();

	/**
	 * Returns the meta object for class '{@link notation.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see notation.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Figure#getFigureStyle <em>Figure Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Figure Style</em>'.
	 * @see notation.Figure#getFigureStyle()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_FigureStyle();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Figure#getBorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border Style</em>'.
	 * @see notation.Figure#getBorderStyle()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_BorderStyle();

	/**
	 * Returns the meta object for the containment reference '{@link notation.Figure#getFigureContainment <em>Figure Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Figure Containment</em>'.
	 * @see notation.Figure#getFigureContainment()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_FigureContainment();

	/**
	 * Returns the meta object for class '{@link notation.FigureContainment <em>Figure Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Containment</em>'.
	 * @see notation.FigureContainment
	 * @generated
	 */
	EClass getFigureContainment();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureContainment#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see notation.FigureContainment#getLayout()
	 * @see #getFigureContainment()
	 * @generated
	 */
	EAttribute getFigureContainment_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link notation.FigureContainment#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see notation.FigureContainment#getElements()
	 * @see #getFigureContainment()
	 * @generated
	 */
	EReference getFigureContainment_Elements();

	/**
	 * Returns the meta object for class '{@link notation.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see notation.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '{@link notation.Roundtangle <em>Roundtangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roundtangle</em>'.
	 * @see notation.Roundtangle
	 * @generated
	 */
	EClass getRoundtangle();

	/**
	 * Returns the meta object for class '{@link notation.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see notation.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for class '{@link notation.Diamond <em>Diamond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diamond</em>'.
	 * @see notation.Diamond
	 * @generated
	 */
	EClass getDiamond();

	/**
	 * Returns the meta object for class '{@link notation.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see notation.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for class '{@link notation.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see notation.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for class '{@link notation.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see notation.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for class '{@link notation.Cube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube</em>'.
	 * @see notation.Cube
	 * @generated
	 */
	EClass getCube();

	/**
	 * Returns the meta object for class '{@link notation.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see notation.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the containment reference list '{@link notation.Polyline#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see notation.Polyline#getPoints()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_Points();

	/**
	 * Returns the meta object for class '{@link notation.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see notation.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link notation.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see notation.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link notation.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see notation.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link notation.TextualContainment <em>Textual Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Containment</em>'.
	 * @see notation.TextualContainment
	 * @generated
	 */
	EClass getTextualContainment();

	/**
	 * Returns the meta object for the containment reference list '{@link notation.TextualContainment#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see notation.TextualContainment#getElements()
	 * @see #getTextualContainment()
	 * @generated
	 */
	EReference getTextualContainment_Elements();

	/**
	 * Returns the meta object for the attribute '{@link notation.TextualContainment#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see notation.TextualContainment#getLayout()
	 * @see #getTextualContainment()
	 * @generated
	 */
	EAttribute getTextualContainment_Layout();

	/**
	 * Returns the meta object for class '{@link notation.TextualElement <em>Textual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Element</em>'.
	 * @see notation.TextualElement
	 * @generated
	 */
	EClass getTextualElement();

	/**
	 * Returns the meta object for class '{@link notation.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see notation.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for class '{@link notation.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see notation.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for class '{@link notation.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see notation.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link notation.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see notation.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for class '{@link notation.ReferenceValue <em>Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Value</em>'.
	 * @see notation.ReferenceValue
	 * @generated
	 */
	EClass getReferenceValue();

	/**
	 * Returns the meta object for class '{@link notation.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see notation.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for class '{@link notation.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style</em>'.
	 * @see notation.LineStyle
	 * @generated
	 */
	EClass getLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link notation.LineStyle#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see notation.LineStyle#getThickness()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Thickness();

	/**
	 * Returns the meta object for the attribute '{@link notation.LineStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see notation.LineStyle#getColor()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link notation.LineStyle#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see notation.LineStyle#getOrientation()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link notation.LineStyle#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see notation.LineStyle#getLength()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Length();

	/**
	 * Returns the meta object for the attribute '{@link notation.LineStyle#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see notation.LineStyle#getBrightness()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link notation.LineStyle#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see notation.LineStyle#getTexture()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Texture();

	/**
	 * Returns the meta object for class '{@link notation.FigureStyle <em>Figure Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Style</em>'.
	 * @see notation.FigureStyle
	 * @generated
	 */
	EClass getFigureStyle();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see notation.FigureStyle#getWidth()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see notation.FigureStyle#getHeight()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_Height();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see notation.FigureStyle#getOrientation()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see notation.FigureStyle#getBrightness()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see notation.FigureStyle#getFillColor()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getFillTexture <em>Fill Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Texture</em>'.
	 * @see notation.FigureStyle#getFillTexture()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_FillTexture();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getFillOrientation <em>Fill Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Orientation</em>'.
	 * @see notation.FigureStyle#getFillOrientation()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_FillOrientation();

	/**
	 * Returns the meta object for the attribute '{@link notation.FigureStyle#getFillTextureColor <em>Fill Texture Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Texture Color</em>'.
	 * @see notation.FigureStyle#getFillTextureColor()
	 * @see #getFigureStyle()
	 * @generated
	 */
	EAttribute getFigureStyle_FillTextureColor();

	/**
	 * Returns the meta object for class '{@link notation.IconStyle <em>Icon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Style</em>'.
	 * @see notation.IconStyle
	 * @generated
	 */
	EClass getIconStyle();

	/**
	 * Returns the meta object for the attribute '{@link notation.IconStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see notation.IconStyle#getWidth()
	 * @see #getIconStyle()
	 * @generated
	 */
	EAttribute getIconStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link notation.IconStyle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see notation.IconStyle#getHeight()
	 * @see #getIconStyle()
	 * @generated
	 */
	EAttribute getIconStyle_Height();

	/**
	 * Returns the meta object for the attribute '{@link notation.IconStyle#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see notation.IconStyle#getOrientation()
	 * @see #getIconStyle()
	 * @generated
	 */
	EAttribute getIconStyle_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link notation.IconStyle#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see notation.IconStyle#getBrightness()
	 * @see #getIconStyle()
	 * @generated
	 */
	EAttribute getIconStyle_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link notation.IconStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see notation.IconStyle#getColor()
	 * @see #getIconStyle()
	 * @generated
	 */
	EAttribute getIconStyle_Color();

	/**
	 * Returns the meta object for class '{@link notation.BorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Style</em>'.
	 * @see notation.BorderStyle
	 * @generated
	 */
	EClass getBorderStyle();

	/**
	 * Returns the meta object for the attribute '{@link notation.BorderStyle#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see notation.BorderStyle#getThickness()
	 * @see #getBorderStyle()
	 * @generated
	 */
	EAttribute getBorderStyle_Thickness();

	/**
	 * Returns the meta object for the attribute '{@link notation.BorderStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see notation.BorderStyle#getColor()
	 * @see #getBorderStyle()
	 * @generated
	 */
	EAttribute getBorderStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link notation.BorderStyle#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see notation.BorderStyle#getTexture()
	 * @see #getBorderStyle()
	 * @generated
	 */
	EAttribute getBorderStyle_Texture();

	/**
	 * Returns the meta object for class '{@link notation.TextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Style</em>'.
	 * @see notation.TextStyle
	 * @generated
	 */
	EClass getTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link notation.TextStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see notation.TextStyle#getFontSize()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link notation.TextStyle#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see notation.TextStyle#getFontName()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontName();

	/**
	 * Returns the meta object for the attribute '{@link notation.TextStyle#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see notation.TextStyle#isBold()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Bold();

	/**
	 * Returns the meta object for the attribute '{@link notation.TextStyle#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see notation.TextStyle#isItalic()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Italic();

	/**
	 * Returns the meta object for the attribute '{@link notation.TextStyle#isUnderlined <em>Underlined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underlined</em>'.
	 * @see notation.TextStyle#isUnderlined()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Underlined();

	/**
	 * Returns the meta object for the attribute '{@link notation.TextStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see notation.TextStyle#getFontColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontColor();

	/**
	 * Returns the meta object for enum '{@link notation.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see notation.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link notation.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see notation.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link notation.LineTextureType <em>Line Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Texture Type</em>'.
	 * @see notation.LineTextureType
	 * @generated
	 */
	EEnum getLineTextureType();

	/**
	 * Returns the meta object for enum '{@link notation.FillTextureType <em>Fill Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Texture Type</em>'.
	 * @see notation.FillTextureType
	 * @generated
	 */
	EEnum getFillTextureType();

	/**
	 * Returns the meta object for enum '{@link notation.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition Type</em>'.
	 * @see notation.DefinitionType
	 * @generated
	 */
	EEnum getDefinitionType();

	/**
	 * Returns the meta object for enum '{@link notation.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see notation.Layout
	 * @generated
	 */
	EEnum getLayout();

	/**
	 * Returns the meta object for enum '{@link notation.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Icon Type</em>'.
	 * @see notation.IconType
	 * @generated
	 */
	EEnum getIconType();

	/**
	 * Returns the meta object for enum '{@link notation.AudienceType <em>Audience Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audience Type</em>'.
	 * @see notation.AudienceType
	 * @generated
	 */
	EEnum getAudienceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NotationFactory getNotationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link notation.impl.NotationDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.NotationDefinitionImpl
		 * @see notation.impl.NotationPackageImpl#getNotationDefinition()
		 * @generated
		 */
		EClass NOTATION_DEFINITION = eINSTANCE.getNotationDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION_DEFINITION__TYPE = eINSTANCE.getNotationDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTATION_DEFINITION__DIAGRAMS = eINSTANCE.getNotationDefinition_Diagrams();

		/**
		 * The meta object literal for the '{@link notation.impl.DiagramDefinitionImpl <em>Diagram Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.DiagramDefinitionImpl
		 * @see notation.impl.NotationPackageImpl#getDiagramDefinition()
		 * @generated
		 */
		EClass DIAGRAM_DEFINITION = eINSTANCE.getDiagramDefinition();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_DEFINITION__LEGEND = eINSTANCE.getDiagramDefinition_Legend();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_DEFINITION__LEVEL = eINSTANCE.getDiagramDefinition_Level();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_DEFINITION__ELEMENTS = eINSTANCE.getDiagramDefinition_Elements();

		/**
		 * The meta object literal for the '<em><b>Allow Chunks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_DEFINITION__ALLOW_CHUNKS = eINSTANCE.getDiagramDefinition_AllowChunks();

		/**
		 * The meta object literal for the '<em><b>Targeted Audience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_DEFINITION__TARGETED_AUDIENCE = eINSTANCE.getDiagramDefinition_TargetedAudience();

		/**
		 * The meta object literal for the '{@link notation.impl.IDElementImpl <em>ID Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.IDElementImpl
		 * @see notation.impl.NotationPackageImpl#getIDElement()
		 * @generated
		 */
		EClass ID_ELEMENT = eINSTANCE.getIDElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_ELEMENT__ID = eINSTANCE.getIDElement_ID();

		/**
		 * The meta object literal for the '{@link notation.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.DiagramElementImpl
		 * @see notation.impl.NotationPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '{@link notation.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.NodeImpl
		 * @see notation.impl.NotationPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Graphical Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__GRAPHICAL_ELEMENT = eINSTANCE.getNode_GraphicalElement();

		/**
		 * The meta object literal for the '{@link notation.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.RelationImpl
		 * @see notation.impl.NotationPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link notation.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.CompartmentImpl
		 * @see notation.impl.NotationPackageImpl#getCompartment()
		 * @generated
		 */
		EClass COMPARTMENT = eINSTANCE.getCompartment();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__LAYOUT = eINSTANCE.getCompartment_Layout();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__NODE_TYPE = eINSTANCE.getCompartment_NodeType();

		/**
		 * The meta object literal for the '{@link notation.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.LinkImpl
		 * @see notation.impl.NotationPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Graphical Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__GRAPHICAL_ELEMENT = eINSTANCE.getLink_GraphicalElement();

		/**
		 * The meta object literal for the '{@link notation.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.GraphicalElementImpl
		 * @see notation.impl.NotationPackageImpl#getGraphicalElement()
		 * @generated
		 */
		EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

		/**
		 * The meta object literal for the '{@link notation.impl.SyntaxOfImpl <em>Syntax Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.SyntaxOfImpl
		 * @see notation.impl.NotationPackageImpl#getSyntaxOf()
		 * @generated
		 */
		EClass SYNTAX_OF = eINSTANCE.getSyntaxOf();

		/**
		 * The meta object literal for the '<em><b>Referred Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTAX_OF__REFERRED_ELEMENT = eINSTANCE.getSyntaxOf_ReferredElement();

		/**
		 * The meta object literal for the '{@link notation.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.IconImpl
		 * @see notation.impl.NotationPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__STYLE = eINSTANCE.getIcon_Style();

		/**
		 * The meta object literal for the '<em><b>Icon Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__ICON_TYPE = eINSTANCE.getIcon_IconType();

		/**
		 * The meta object literal for the '{@link notation.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.ImageImpl
		 * @see notation.impl.NotationPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PATH = eINSTANCE.getImage_Path();

		/**
		 * The meta object literal for the '<em><b>Approximate Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__APPROXIMATE_REPRESENTATION = eINSTANCE.getImage_ApproximateRepresentation();

		/**
		 * The meta object literal for the '{@link notation.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.CompositeImpl
		 * @see notation.impl.NotationPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__LAYOUT = eINSTANCE.getComposite_Layout();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SUB_ELEMENTS = eINSTANCE.getComposite_SubElements();

		/**
		 * The meta object literal for the '<em><b>Primary Shape</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PRIMARY_SHAPE = eINSTANCE.getComposite_PrimaryShape();

		/**
		 * The meta object literal for the '{@link notation.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.LabelImpl
		 * @see notation.impl.NotationPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__TEXT_STYLE = eINSTANCE.getLabel_TextStyle();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '{@link notation.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.LineImpl
		 * @see notation.impl.NotationPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__LINE_STYLE = eINSTANCE.getLine_LineStyle();

		/**
		 * The meta object literal for the '{@link notation.impl.FigureImpl <em>Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.FigureImpl
		 * @see notation.impl.NotationPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Figure Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__FIGURE_STYLE = eINSTANCE.getFigure_FigureStyle();

		/**
		 * The meta object literal for the '<em><b>Border Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__BORDER_STYLE = eINSTANCE.getFigure_BorderStyle();

		/**
		 * The meta object literal for the '<em><b>Figure Containment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__FIGURE_CONTAINMENT = eINSTANCE.getFigure_FigureContainment();

		/**
		 * The meta object literal for the '{@link notation.impl.FigureContainmentImpl <em>Figure Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.FigureContainmentImpl
		 * @see notation.impl.NotationPackageImpl#getFigureContainment()
		 * @generated
		 */
		EClass FIGURE_CONTAINMENT = eINSTANCE.getFigureContainment();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_CONTAINMENT__LAYOUT = eINSTANCE.getFigureContainment_Layout();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE_CONTAINMENT__ELEMENTS = eINSTANCE.getFigureContainment_Elements();

		/**
		 * The meta object literal for the '{@link notation.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.RectangleImpl
		 * @see notation.impl.NotationPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '{@link notation.impl.RoundtangleImpl <em>Roundtangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.RoundtangleImpl
		 * @see notation.impl.NotationPackageImpl#getRoundtangle()
		 * @generated
		 */
		EClass ROUNDTANGLE = eINSTANCE.getRoundtangle();

		/**
		 * The meta object literal for the '{@link notation.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.SquareImpl
		 * @see notation.impl.NotationPackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '{@link notation.impl.DiamondImpl <em>Diamond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.DiamondImpl
		 * @see notation.impl.NotationPackageImpl#getDiamond()
		 * @generated
		 */
		EClass DIAMOND = eINSTANCE.getDiamond();

		/**
		 * The meta object literal for the '{@link notation.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.TriangleImpl
		 * @see notation.impl.NotationPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '{@link notation.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.CircleImpl
		 * @see notation.impl.NotationPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '{@link notation.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.CylinderImpl
		 * @see notation.impl.NotationPackageImpl#getCylinder()
		 * @generated
		 */
		EClass CYLINDER = eINSTANCE.getCylinder();

		/**
		 * The meta object literal for the '{@link notation.impl.CubeImpl <em>Cube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.CubeImpl
		 * @see notation.impl.NotationPackageImpl#getCube()
		 * @generated
		 */
		EClass CUBE = eINSTANCE.getCube();

		/**
		 * The meta object literal for the '{@link notation.impl.PolylineImpl <em>Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.PolylineImpl
		 * @see notation.impl.NotationPackageImpl#getPolyline()
		 * @generated
		 */
		EClass POLYLINE = eINSTANCE.getPolyline();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYLINE__POINTS = eINSTANCE.getPolyline_Points();

		/**
		 * The meta object literal for the '{@link notation.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.PointImpl
		 * @see notation.impl.NotationPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link notation.impl.TextualContainmentImpl <em>Textual Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.TextualContainmentImpl
		 * @see notation.impl.NotationPackageImpl#getTextualContainment()
		 * @generated
		 */
		EClass TEXTUAL_CONTAINMENT = eINSTANCE.getTextualContainment();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONTAINMENT__ELEMENTS = eINSTANCE.getTextualContainment_Elements();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_CONTAINMENT__LAYOUT = eINSTANCE.getTextualContainment_Layout();

		/**
		 * The meta object literal for the '{@link notation.impl.TextualElementImpl <em>Textual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.TextualElementImpl
		 * @see notation.impl.NotationPackageImpl#getTextualElement()
		 * @generated
		 */
		EClass TEXTUAL_ELEMENT = eINSTANCE.getTextualElement();

		/**
		 * The meta object literal for the '{@link notation.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.TokenImpl
		 * @see notation.impl.NotationPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '{@link notation.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.KeywordImpl
		 * @see notation.impl.NotationPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '{@link notation.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.ValueImpl
		 * @see notation.impl.NotationPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link notation.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.AttributeValueImpl
		 * @see notation.impl.NotationPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '{@link notation.impl.ReferenceValueImpl <em>Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.ReferenceValueImpl
		 * @see notation.impl.NotationPackageImpl#getReferenceValue()
		 * @generated
		 */
		EClass REFERENCE_VALUE = eINSTANCE.getReferenceValue();

		/**
		 * The meta object literal for the '{@link notation.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.StyleImpl
		 * @see notation.impl.NotationPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '{@link notation.impl.LineStyleImpl <em>Line Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.LineStyleImpl
		 * @see notation.impl.NotationPackageImpl#getLineStyle()
		 * @generated
		 */
		EClass LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__THICKNESS = eINSTANCE.getLineStyle_Thickness();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__COLOR = eINSTANCE.getLineStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__ORIENTATION = eINSTANCE.getLineStyle_Orientation();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__LENGTH = eINSTANCE.getLineStyle_Length();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__BRIGHTNESS = eINSTANCE.getLineStyle_Brightness();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__TEXTURE = eINSTANCE.getLineStyle_Texture();

		/**
		 * The meta object literal for the '{@link notation.impl.FigureStyleImpl <em>Figure Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.FigureStyleImpl
		 * @see notation.impl.NotationPackageImpl#getFigureStyle()
		 * @generated
		 */
		EClass FIGURE_STYLE = eINSTANCE.getFigureStyle();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__WIDTH = eINSTANCE.getFigureStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__HEIGHT = eINSTANCE.getFigureStyle_Height();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__ORIENTATION = eINSTANCE.getFigureStyle_Orientation();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__BRIGHTNESS = eINSTANCE.getFigureStyle_Brightness();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__FILL_COLOR = eINSTANCE.getFigureStyle_FillColor();

		/**
		 * The meta object literal for the '<em><b>Fill Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__FILL_TEXTURE = eINSTANCE.getFigureStyle_FillTexture();

		/**
		 * The meta object literal for the '<em><b>Fill Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__FILL_ORIENTATION = eINSTANCE.getFigureStyle_FillOrientation();

		/**
		 * The meta object literal for the '<em><b>Fill Texture Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_STYLE__FILL_TEXTURE_COLOR = eINSTANCE.getFigureStyle_FillTextureColor();

		/**
		 * The meta object literal for the '{@link notation.impl.IconStyleImpl <em>Icon Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.IconStyleImpl
		 * @see notation.impl.NotationPackageImpl#getIconStyle()
		 * @generated
		 */
		EClass ICON_STYLE = eINSTANCE.getIconStyle();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE__WIDTH = eINSTANCE.getIconStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE__HEIGHT = eINSTANCE.getIconStyle_Height();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE__ORIENTATION = eINSTANCE.getIconStyle_Orientation();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE__BRIGHTNESS = eINSTANCE.getIconStyle_Brightness();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE__COLOR = eINSTANCE.getIconStyle_Color();

		/**
		 * The meta object literal for the '{@link notation.impl.BorderStyleImpl <em>Border Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.BorderStyleImpl
		 * @see notation.impl.NotationPackageImpl#getBorderStyle()
		 * @generated
		 */
		EClass BORDER_STYLE = eINSTANCE.getBorderStyle();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_STYLE__THICKNESS = eINSTANCE.getBorderStyle_Thickness();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_STYLE__COLOR = eINSTANCE.getBorderStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_STYLE__TEXTURE = eINSTANCE.getBorderStyle_Texture();

		/**
		 * The meta object literal for the '{@link notation.impl.TextStyleImpl <em>Text Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.impl.TextStyleImpl
		 * @see notation.impl.NotationPackageImpl#getTextStyle()
		 * @generated
		 */
		EClass TEXT_STYLE = eINSTANCE.getTextStyle();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_SIZE = eINSTANCE.getTextStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_NAME = eINSTANCE.getTextStyle_FontName();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BOLD = eINSTANCE.getTextStyle_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__ITALIC = eINSTANCE.getTextStyle_Italic();

		/**
		 * The meta object literal for the '<em><b>Underlined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__UNDERLINED = eINSTANCE.getTextStyle_Underlined();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_COLOR = eINSTANCE.getTextStyle_FontColor();

		/**
		 * The meta object literal for the '{@link notation.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.Color
		 * @see notation.impl.NotationPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link notation.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.Orientation
		 * @see notation.impl.NotationPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link notation.LineTextureType <em>Line Texture Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.LineTextureType
		 * @see notation.impl.NotationPackageImpl#getLineTextureType()
		 * @generated
		 */
		EEnum LINE_TEXTURE_TYPE = eINSTANCE.getLineTextureType();

		/**
		 * The meta object literal for the '{@link notation.FillTextureType <em>Fill Texture Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.FillTextureType
		 * @see notation.impl.NotationPackageImpl#getFillTextureType()
		 * @generated
		 */
		EEnum FILL_TEXTURE_TYPE = eINSTANCE.getFillTextureType();

		/**
		 * The meta object literal for the '{@link notation.DefinitionType <em>Definition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.DefinitionType
		 * @see notation.impl.NotationPackageImpl#getDefinitionType()
		 * @generated
		 */
		EEnum DEFINITION_TYPE = eINSTANCE.getDefinitionType();

		/**
		 * The meta object literal for the '{@link notation.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.Layout
		 * @see notation.impl.NotationPackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '{@link notation.IconType <em>Icon Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.IconType
		 * @see notation.impl.NotationPackageImpl#getIconType()
		 * @generated
		 */
		EEnum ICON_TYPE = eINSTANCE.getIconType();

		/**
		 * The meta object literal for the '{@link notation.AudienceType <em>Audience Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notation.AudienceType
		 * @see notation.impl.NotationPackageImpl#getAudienceType()
		 * @generated
		 */
		EEnum AUDIENCE_TYPE = eINSTANCE.getAudienceType();

	}

} //NotationPackage

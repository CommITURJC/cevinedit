/**
 */
package mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inria.atlanmod.fr/notationEvaluation/mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link mapping.impl.MappingContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.MappingContainerImpl
	 * @see mapping.impl.MappingPackageImpl#getMappingContainer()
	 * @generated
	 */
	int MAPPING_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Node Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__NODE_MAPPINGS = 0;

	/**
	 * The feature id for the '<em><b>Relation Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__RELATION_MAPPINGS = 1;

	/**
	 * The feature id for the '<em><b>Navigation Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__NAVIGATION_MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Extension Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__EXTENSION_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Hierarchical Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS = 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.MappingElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.MappingElementImpl
	 * @see mapping.impl.MappingPackageImpl#getMappingElement()
	 * @generated
	 */
	int MAPPING_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.DiagramElementMappingImpl <em>Diagram Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.DiagramElementMappingImpl
	 * @see mapping.impl.MappingPackageImpl#getDiagramElementMapping()
	 * @generated
	 */
	int DIAGRAM_ELEMENT_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_MAPPING__ID = MAPPING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT = MAPPING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Containing Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS = MAPPING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_MAPPING_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diagram Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_MAPPING_OPERATION_COUNT = MAPPING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mapping.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.NodeMappingImpl
	 * @see mapping.impl.MappingPackageImpl#getNodeMapping()
	 * @generated
	 */
	int NODE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__ID = DIAGRAM_ELEMENT_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__ABSTRACT_ELEMENT = DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Containing Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__ABSTRACT_CONTAINING_CLASS = DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__NODE = DIAGRAM_ELEMENT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_FEATURE_COUNT = DIAGRAM_ELEMENT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_OPERATION_COUNT = DIAGRAM_ELEMENT_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mapping.impl.RelationMappingImpl <em>Relation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.RelationMappingImpl
	 * @see mapping.impl.MappingPackageImpl#getRelationMapping()
	 * @generated
	 */
	int RELATION_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__ID = DIAGRAM_ELEMENT_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__ABSTRACT_ELEMENT = DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Containing Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__ABSTRACT_CONTAINING_CLASS = DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING__RELATION = DIAGRAM_ELEMENT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_FEATURE_COUNT = DIAGRAM_ELEMENT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MAPPING_OPERATION_COUNT = DIAGRAM_ELEMENT_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mapping.impl.ExtensionMappingImpl <em>Extension Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.ExtensionMappingImpl
	 * @see mapping.impl.MappingPackageImpl#getExtensionMapping()
	 * @generated
	 */
	int EXTENSION_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MAPPING__ID = MAPPING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MAPPING__SUPER = MAPPING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MAPPING__SUB = MAPPING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MAPPING_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MAPPING_OPERATION_COUNT = MAPPING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mapping.impl.NavigationMappingImpl <em>Navigation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.NavigationMappingImpl
	 * @see mapping.impl.MappingPackageImpl#getNavigationMapping()
	 * @generated
	 */
	int NAVIGATION_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MAPPING__ID = MAPPING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MAPPING__FROM = MAPPING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MAPPING__TO = MAPPING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Navigation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MAPPING_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Navigation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MAPPING_OPERATION_COUNT = MAPPING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mapping.impl.NotationElementImpl <em>Notation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.NotationElementImpl
	 * @see mapping.impl.MappingPackageImpl#getNotationElement()
	 * @generated
	 */
	int NOTATION_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_ELEMENT__DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_ELEMENT__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Notation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.HierarchicalMappingImpl <em>Hierarchical Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.HierarchicalMappingImpl
	 * @see mapping.impl.MappingPackageImpl#getHierarchicalMapping()
	 * @generated
	 */
	int HIERARCHICAL_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MAPPING__ID = MAPPING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MAPPING__SUPER_ELEMENT = MAPPING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MAPPING__SUB_ELEMENT = MAPPING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hierarchical Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MAPPING_FEATURE_COUNT = MAPPING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hierarchical Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_MAPPING_OPERATION_COUNT = MAPPING_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mapping.MappingContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see mapping.MappingContainer
	 * @generated
	 */
	EClass getMappingContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingContainer#getNodeMappings <em>Node Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Mappings</em>'.
	 * @see mapping.MappingContainer#getNodeMappings()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_NodeMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingContainer#getRelationMappings <em>Relation Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Mappings</em>'.
	 * @see mapping.MappingContainer#getRelationMappings()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_RelationMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingContainer#getNavigationMappings <em>Navigation Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Mappings</em>'.
	 * @see mapping.MappingContainer#getNavigationMappings()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_NavigationMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingContainer#getExtensionMappings <em>Extension Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Mappings</em>'.
	 * @see mapping.MappingContainer#getExtensionMappings()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_ExtensionMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.MappingContainer#getHierarchicalMappings <em>Hierarchical Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchical Mappings</em>'.
	 * @see mapping.MappingContainer#getHierarchicalMappings()
	 * @see #getMappingContainer()
	 * @generated
	 */
	EReference getMappingContainer_HierarchicalMappings();

	/**
	 * Returns the meta object for class '{@link mapping.MappingElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see mapping.MappingElement
	 * @generated
	 */
	EClass getMappingElement();

	/**
	 * Returns the meta object for the attribute '{@link mapping.MappingElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see mapping.MappingElement#getID()
	 * @see #getMappingElement()
	 * @generated
	 */
	EAttribute getMappingElement_ID();

	/**
	 * Returns the meta object for class '{@link mapping.DiagramElementMapping <em>Diagram Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element Mapping</em>'.
	 * @see mapping.DiagramElementMapping
	 * @generated
	 */
	EClass getDiagramElementMapping();

	/**
	 * Returns the meta object for the reference '{@link mapping.DiagramElementMapping#getAbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Element</em>'.
	 * @see mapping.DiagramElementMapping#getAbstractElement()
	 * @see #getDiagramElementMapping()
	 * @generated
	 */
	EReference getDiagramElementMapping_AbstractElement();

	/**
	 * Returns the meta object for the reference '{@link mapping.DiagramElementMapping#getAbstractContainingClass <em>Abstract Containing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Containing Class</em>'.
	 * @see mapping.DiagramElementMapping#getAbstractContainingClass()
	 * @see #getDiagramElementMapping()
	 * @generated
	 */
	EReference getDiagramElementMapping_AbstractContainingClass();

	/**
	 * Returns the meta object for class '{@link mapping.NodeMapping <em>Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Mapping</em>'.
	 * @see mapping.NodeMapping
	 * @generated
	 */
	EClass getNodeMapping();

	/**
	 * Returns the meta object for the reference '{@link mapping.NodeMapping#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see mapping.NodeMapping#getNode()
	 * @see #getNodeMapping()
	 * @generated
	 */
	EReference getNodeMapping_Node();

	/**
	 * Returns the meta object for class '{@link mapping.RelationMapping <em>Relation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Mapping</em>'.
	 * @see mapping.RelationMapping
	 * @generated
	 */
	EClass getRelationMapping();

	/**
	 * Returns the meta object for the reference '{@link mapping.RelationMapping#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see mapping.RelationMapping#getRelation()
	 * @see #getRelationMapping()
	 * @generated
	 */
	EReference getRelationMapping_Relation();

	/**
	 * Returns the meta object for class '{@link mapping.ExtensionMapping <em>Extension Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Mapping</em>'.
	 * @see mapping.ExtensionMapping
	 * @generated
	 */
	EClass getExtensionMapping();

	/**
	 * Returns the meta object for the reference '{@link mapping.ExtensionMapping#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see mapping.ExtensionMapping#getSuper()
	 * @see #getExtensionMapping()
	 * @generated
	 */
	EReference getExtensionMapping_Super();

	/**
	 * Returns the meta object for the reference '{@link mapping.ExtensionMapping#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub</em>'.
	 * @see mapping.ExtensionMapping#getSub()
	 * @see #getExtensionMapping()
	 * @generated
	 */
	EReference getExtensionMapping_Sub();

	/**
	 * Returns the meta object for class '{@link mapping.NavigationMapping <em>Navigation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Mapping</em>'.
	 * @see mapping.NavigationMapping
	 * @generated
	 */
	EClass getNavigationMapping();

	/**
	 * Returns the meta object for the reference '{@link mapping.NavigationMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see mapping.NavigationMapping#getFrom()
	 * @see #getNavigationMapping()
	 * @generated
	 */
	EReference getNavigationMapping_From();

	/**
	 * Returns the meta object for the reference '{@link mapping.NavigationMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see mapping.NavigationMapping#getTo()
	 * @see #getNavigationMapping()
	 * @generated
	 */
	EReference getNavigationMapping_To();

	/**
	 * Returns the meta object for class '{@link mapping.NotationElement <em>Notation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation Element</em>'.
	 * @see mapping.NotationElement
	 * @generated
	 */
	EClass getNotationElement();

	/**
	 * Returns the meta object for the reference '{@link mapping.NotationElement#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram</em>'.
	 * @see mapping.NotationElement#getDiagram()
	 * @see #getNotationElement()
	 * @generated
	 */
	EReference getNotationElement_Diagram();

	/**
	 * Returns the meta object for the reference '{@link mapping.NotationElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see mapping.NotationElement#getElement()
	 * @see #getNotationElement()
	 * @generated
	 */
	EReference getNotationElement_Element();

	/**
	 * Returns the meta object for class '{@link mapping.HierarchicalMapping <em>Hierarchical Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical Mapping</em>'.
	 * @see mapping.HierarchicalMapping
	 * @generated
	 */
	EClass getHierarchicalMapping();

	/**
	 * Returns the meta object for the reference '{@link mapping.HierarchicalMapping#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Element</em>'.
	 * @see mapping.HierarchicalMapping#getSuperElement()
	 * @see #getHierarchicalMapping()
	 * @generated
	 */
	EReference getHierarchicalMapping_SuperElement();

	/**
	 * Returns the meta object for the reference '{@link mapping.HierarchicalMapping#getSubElement <em>Sub Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Element</em>'.
	 * @see mapping.HierarchicalMapping#getSubElement()
	 * @see #getHierarchicalMapping()
	 * @generated
	 */
	EReference getHierarchicalMapping_SubElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

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
		 * The meta object literal for the '{@link mapping.impl.MappingContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.MappingContainerImpl
		 * @see mapping.impl.MappingPackageImpl#getMappingContainer()
		 * @generated
		 */
		EClass MAPPING_CONTAINER = eINSTANCE.getMappingContainer();

		/**
		 * The meta object literal for the '<em><b>Node Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__NODE_MAPPINGS = eINSTANCE.getMappingContainer_NodeMappings();

		/**
		 * The meta object literal for the '<em><b>Relation Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__RELATION_MAPPINGS = eINSTANCE.getMappingContainer_RelationMappings();

		/**
		 * The meta object literal for the '<em><b>Navigation Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__NAVIGATION_MAPPINGS = eINSTANCE.getMappingContainer_NavigationMappings();

		/**
		 * The meta object literal for the '<em><b>Extension Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__EXTENSION_MAPPINGS = eINSTANCE.getMappingContainer_ExtensionMappings();

		/**
		 * The meta object literal for the '<em><b>Hierarchical Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS = eINSTANCE.getMappingContainer_HierarchicalMappings();

		/**
		 * The meta object literal for the '{@link mapping.impl.MappingElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.MappingElementImpl
		 * @see mapping.impl.MappingPackageImpl#getMappingElement()
		 * @generated
		 */
		EClass MAPPING_ELEMENT = eINSTANCE.getMappingElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ELEMENT__ID = eINSTANCE.getMappingElement_ID();

		/**
		 * The meta object literal for the '{@link mapping.impl.DiagramElementMappingImpl <em>Diagram Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.DiagramElementMappingImpl
		 * @see mapping.impl.MappingPackageImpl#getDiagramElementMapping()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT_MAPPING = eINSTANCE.getDiagramElementMapping();

		/**
		 * The meta object literal for the '<em><b>Abstract Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT = eINSTANCE.getDiagramElementMapping_AbstractElement();

		/**
		 * The meta object literal for the '<em><b>Abstract Containing Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS = eINSTANCE.getDiagramElementMapping_AbstractContainingClass();

		/**
		 * The meta object literal for the '{@link mapping.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.NodeMappingImpl
		 * @see mapping.impl.MappingPackageImpl#getNodeMapping()
		 * @generated
		 */
		EClass NODE_MAPPING = eINSTANCE.getNodeMapping();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_MAPPING__NODE = eINSTANCE.getNodeMapping_Node();

		/**
		 * The meta object literal for the '{@link mapping.impl.RelationMappingImpl <em>Relation Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.RelationMappingImpl
		 * @see mapping.impl.MappingPackageImpl#getRelationMapping()
		 * @generated
		 */
		EClass RELATION_MAPPING = eINSTANCE.getRelationMapping();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MAPPING__RELATION = eINSTANCE.getRelationMapping_Relation();

		/**
		 * The meta object literal for the '{@link mapping.impl.ExtensionMappingImpl <em>Extension Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.ExtensionMappingImpl
		 * @see mapping.impl.MappingPackageImpl#getExtensionMapping()
		 * @generated
		 */
		EClass EXTENSION_MAPPING = eINSTANCE.getExtensionMapping();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_MAPPING__SUPER = eINSTANCE.getExtensionMapping_Super();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_MAPPING__SUB = eINSTANCE.getExtensionMapping_Sub();

		/**
		 * The meta object literal for the '{@link mapping.impl.NavigationMappingImpl <em>Navigation Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.NavigationMappingImpl
		 * @see mapping.impl.MappingPackageImpl#getNavigationMapping()
		 * @generated
		 */
		EClass NAVIGATION_MAPPING = eINSTANCE.getNavigationMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_MAPPING__FROM = eINSTANCE.getNavigationMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_MAPPING__TO = eINSTANCE.getNavigationMapping_To();

		/**
		 * The meta object literal for the '{@link mapping.impl.NotationElementImpl <em>Notation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.NotationElementImpl
		 * @see mapping.impl.MappingPackageImpl#getNotationElement()
		 * @generated
		 */
		EClass NOTATION_ELEMENT = eINSTANCE.getNotationElement();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTATION_ELEMENT__DIAGRAM = eINSTANCE.getNotationElement_Diagram();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTATION_ELEMENT__ELEMENT = eINSTANCE.getNotationElement_Element();

		/**
		 * The meta object literal for the '{@link mapping.impl.HierarchicalMappingImpl <em>Hierarchical Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.HierarchicalMappingImpl
		 * @see mapping.impl.MappingPackageImpl#getHierarchicalMapping()
		 * @generated
		 */
		EClass HIERARCHICAL_MAPPING = eINSTANCE.getHierarchicalMapping();

		/**
		 * The meta object literal for the '<em><b>Super Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHICAL_MAPPING__SUPER_ELEMENT = eINSTANCE.getHierarchicalMapping_SuperElement();

		/**
		 * The meta object literal for the '<em><b>Sub Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHICAL_MAPPING__SUB_ELEMENT = eINSTANCE.getHierarchicalMapping_SubElement();

	}

} //MappingPackage

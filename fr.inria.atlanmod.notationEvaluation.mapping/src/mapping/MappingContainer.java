/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.MappingContainer#getNodeMappings <em>Node Mappings</em>}</li>
 *   <li>{@link mapping.MappingContainer#getRelationMappings <em>Relation Mappings</em>}</li>
 *   <li>{@link mapping.MappingContainer#getNavigationMappings <em>Navigation Mappings</em>}</li>
 *   <li>{@link mapping.MappingContainer#getExtensionMappings <em>Extension Mappings</em>}</li>
 *   <li>{@link mapping.MappingContainer#getHierarchicalMappings <em>Hierarchical Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getMappingContainer()
 * @model
 * @generated
 */
public interface MappingContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.NodeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Mappings</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingContainer_NodeMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeMapping> getNodeMappings();

	/**
	 * Returns the value of the '<em><b>Relation Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.RelationMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Mappings</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingContainer_RelationMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationMapping> getRelationMappings();

	/**
	 * Returns the value of the '<em><b>Navigation Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.NavigationMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Mappings</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingContainer_NavigationMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationMapping> getNavigationMappings();

	/**
	 * Returns the value of the '<em><b>Extension Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.ExtensionMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Mappings</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingContainer_ExtensionMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionMapping> getExtensionMappings();

	/**
	 * Returns the value of the '<em><b>Hierarchical Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.HierarchicalMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchical Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchical Mappings</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingContainer_HierarchicalMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<HierarchicalMapping> getHierarchicalMappings();

} // MappingContainer

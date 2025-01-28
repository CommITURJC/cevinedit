/**
 */
package mapping;

import notation.DiagramDefinition;
import notation.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.HierarchicalMapping#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link mapping.HierarchicalMapping#getSubElement <em>Sub Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getHierarchicalMapping()
 * @model
 * @generated
 */
public interface HierarchicalMapping extends MappingElement {
	/**
	 * Returns the value of the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Element</em>' reference.
	 * @see #setSuperElement(DiagramElement)
	 * @see mapping.MappingPackage#getHierarchicalMapping_SuperElement()
	 * @model
	 * @generated
	 */
	DiagramElement getSuperElement();

	/**
	 * Sets the value of the '{@link mapping.HierarchicalMapping#getSuperElement <em>Super Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Element</em>' reference.
	 * @see #getSuperElement()
	 * @generated
	 */
	void setSuperElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Sub Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Element</em>' reference.
	 * @see #setSubElement(DiagramDefinition)
	 * @see mapping.MappingPackage#getHierarchicalMapping_SubElement()
	 * @model
	 * @generated
	 */
	DiagramDefinition getSubElement();

	/**
	 * Sets the value of the '{@link mapping.HierarchicalMapping#getSubElement <em>Sub Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Element</em>' reference.
	 * @see #getSubElement()
	 * @generated
	 */
	void setSubElement(DiagramDefinition value);

} // HierarchicalMapping

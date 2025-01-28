/**
 */
package mapping;

import notation.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.NodeMapping#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getNodeMapping()
 * @model
 * @generated
 */
public interface NodeMapping extends DiagramElementMapping {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see mapping.MappingPackage#getNodeMapping_Node()
	 * @model
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link mapping.NodeMapping#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // NodeMapping

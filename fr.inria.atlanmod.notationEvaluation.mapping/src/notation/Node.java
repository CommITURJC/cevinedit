/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Node#getGraphicalElement <em>Graphical Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Graphical Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphical Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphical Element</em>' containment reference.
	 * @see #setGraphicalElement(GraphicalElement)
	 * @see notation.NotationPackage#getNode_GraphicalElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GraphicalElement getGraphicalElement();

	/**
	 * Sets the value of the '{@link notation.Node#getGraphicalElement <em>Graphical Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphical Element</em>' containment reference.
	 * @see #getGraphicalElement()
	 * @generated
	 */
	void setGraphicalElement(GraphicalElement value);

} // Node

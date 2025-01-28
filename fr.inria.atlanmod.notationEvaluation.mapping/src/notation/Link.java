/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Link#getGraphicalElement <em>Graphical Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Relation {
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
	 * @see notation.NotationPackage#getLink_GraphicalElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GraphicalElement getGraphicalElement();

	/**
	 * Sets the value of the '{@link notation.Link#getGraphicalElement <em>Graphical Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphical Element</em>' containment reference.
	 * @see #getGraphicalElement()
	 * @generated
	 */
	void setGraphicalElement(GraphicalElement value);

} // Link

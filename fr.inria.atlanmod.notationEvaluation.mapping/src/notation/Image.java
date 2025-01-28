/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Image#getPath <em>Path</em>}</li>
 *   <li>{@link notation.Image#getApproximateRepresentation <em>Approximate Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see notation.NotationPackage#getImage_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link notation.Image#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Approximate Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approximate Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approximate Representation</em>' containment reference.
	 * @see #setApproximateRepresentation(GraphicalElement)
	 * @see notation.NotationPackage#getImage_ApproximateRepresentation()
	 * @model containment="true"
	 * @generated
	 */
	GraphicalElement getApproximateRepresentation();

	/**
	 * Sets the value of the '{@link notation.Image#getApproximateRepresentation <em>Approximate Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approximate Representation</em>' containment reference.
	 * @see #getApproximateRepresentation()
	 * @generated
	 */
	void setApproximateRepresentation(GraphicalElement value);

} // Image

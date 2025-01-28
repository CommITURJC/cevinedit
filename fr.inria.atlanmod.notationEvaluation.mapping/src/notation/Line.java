/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Line#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' containment reference.
	 * @see #setLineStyle(LineStyle)
	 * @see notation.NotationPackage#getLine_LineStyle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link notation.Line#getLineStyle <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' containment reference.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

} // Line

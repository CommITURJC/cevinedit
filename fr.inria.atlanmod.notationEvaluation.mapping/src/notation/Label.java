/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Label#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link notation.Label#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' containment reference.
	 * @see #setTextStyle(TextStyle)
	 * @see notation.NotationPackage#getLabel_TextStyle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextStyle getTextStyle();

	/**
	 * Sets the value of the '{@link notation.Label#getTextStyle <em>Text Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style</em>' containment reference.
	 * @see #getTextStyle()
	 * @generated
	 */
	void setTextStyle(TextStyle value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TextualContainment)
	 * @see notation.NotationPackage#getLabel_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextualContainment getText();

	/**
	 * Sets the value of the '{@link notation.Label#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TextualContainment value);

} // Label

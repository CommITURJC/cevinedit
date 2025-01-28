/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.BorderStyle#getThickness <em>Thickness</em>}</li>
 *   <li>{@link notation.BorderStyle#getColor <em>Color</em>}</li>
 *   <li>{@link notation.BorderStyle#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getBorderStyle()
 * @model
 * @generated
 */
public interface BorderStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #setThickness(float)
	 * @see notation.NotationPackage#getBorderStyle_Thickness()
	 * @model default="0.5" required="true"
	 * @generated
	 */
	float getThickness();

	/**
	 * Sets the value of the '{@link notation.BorderStyle#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(float value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"BLACK"</code>.
	 * The literals are from the enumeration {@link notation.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see notation.Color
	 * @see #setColor(Color)
	 * @see notation.NotationPackage#getBorderStyle_Color()
	 * @model default="BLACK" required="true"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link notation.BorderStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see notation.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.LineTextureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' attribute.
	 * @see notation.LineTextureType
	 * @see #setTexture(LineTextureType)
	 * @see notation.NotationPackage#getBorderStyle_Texture()
	 * @model required="true"
	 * @generated
	 */
	LineTextureType getTexture();

	/**
	 * Sets the value of the '{@link notation.BorderStyle#getTexture <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' attribute.
	 * @see notation.LineTextureType
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(LineTextureType value);

} // BorderStyle

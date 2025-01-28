/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.LineStyle#getThickness <em>Thickness</em>}</li>
 *   <li>{@link notation.LineStyle#getColor <em>Color</em>}</li>
 *   <li>{@link notation.LineStyle#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link notation.LineStyle#getLength <em>Length</em>}</li>
 *   <li>{@link notation.LineStyle#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link notation.LineStyle#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getLineStyle()
 * @model
 * @generated
 */
public interface LineStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #setThickness(float)
	 * @see notation.NotationPackage#getLineStyle_Thickness()
	 * @model default="1" required="true"
	 * @generated
	 */
	float getThickness();

	/**
	 * Sets the value of the '{@link notation.LineStyle#getThickness <em>Thickness</em>}' attribute.
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
	 * @see notation.NotationPackage#getLineStyle_Color()
	 * @model default="BLACK" required="true"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link notation.LineStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see notation.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see notation.Orientation
	 * @see #setOrientation(Orientation)
	 * @see notation.NotationPackage#getLineStyle_Orientation()
	 * @model
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link notation.LineStyle#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see notation.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see notation.NotationPackage#getLineStyle_Length()
	 * @model
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link notation.LineStyle#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(int)
	 * @see notation.NotationPackage#getLineStyle_Brightness()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getBrightness();

	/**
	 * Sets the value of the '{@link notation.LineStyle#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(int value);

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
	 * @see notation.NotationPackage#getLineStyle_Texture()
	 * @model required="true"
	 * @generated
	 */
	LineTextureType getTexture();

	/**
	 * Sets the value of the '{@link notation.LineStyle#getTexture <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' attribute.
	 * @see notation.LineTextureType
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(LineTextureType value);

} // LineStyle

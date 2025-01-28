/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.IconStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link notation.IconStyle#getHeight <em>Height</em>}</li>
 *   <li>{@link notation.IconStyle#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link notation.IconStyle#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link notation.IconStyle#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getIconStyle()
 * @model
 * @generated
 */
public interface IconStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see notation.NotationPackage#getIconStyle_Width()
	 * @model required="true"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link notation.IconStyle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see notation.NotationPackage#getIconStyle_Height()
	 * @model required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link notation.IconStyle#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

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
	 * @see notation.NotationPackage#getIconStyle_Orientation()
	 * @model required="true"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link notation.IconStyle#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see notation.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(int)
	 * @see notation.NotationPackage#getIconStyle_Brightness()
	 * @model required="true"
	 * @generated
	 */
	int getBrightness();

	/**
	 * Sets the value of the '{@link notation.IconStyle#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
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
	 * @see notation.NotationPackage#getIconStyle_Color()
	 * @model required="true"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link notation.IconStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see notation.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // IconStyle

/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.FigureStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link notation.FigureStyle#getHeight <em>Height</em>}</li>
 *   <li>{@link notation.FigureStyle#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link notation.FigureStyle#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link notation.FigureStyle#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link notation.FigureStyle#getFillTexture <em>Fill Texture</em>}</li>
 *   <li>{@link notation.FigureStyle#getFillOrientation <em>Fill Orientation</em>}</li>
 *   <li>{@link notation.FigureStyle#getFillTextureColor <em>Fill Texture Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getFigureStyle()
 * @model
 * @generated
 */
public interface FigureStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see notation.NotationPackage#getFigureStyle_Width()
	 * @model default="1" required="true"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see notation.NotationPackage#getFigureStyle_Height()
	 * @model default="1" required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getHeight <em>Height</em>}' attribute.
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
	 * @see notation.NotationPackage#getFigureStyle_Orientation()
	 * @model required="true"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getOrientation <em>Orientation</em>}' attribute.
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
	 * @see notation.NotationPackage#getFigureStyle_Brightness()
	 * @model required="true"
	 * @generated
	 */
	int getBrightness();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(int value);

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * The default value is <code>"WHITE"</code>.
	 * The literals are from the enumeration {@link notation.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see notation.Color
	 * @see #setFillColor(Color)
	 * @see notation.NotationPackage#getFigureStyle_FillColor()
	 * @model default="WHITE" required="true"
	 * @generated
	 */
	Color getFillColor();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see notation.Color
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(Color value);

	/**
	 * Returns the value of the '<em><b>Fill Texture</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.FillTextureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Texture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Texture</em>' attribute.
	 * @see notation.FillTextureType
	 * @see #setFillTexture(FillTextureType)
	 * @see notation.NotationPackage#getFigureStyle_FillTexture()
	 * @model required="true"
	 * @generated
	 */
	FillTextureType getFillTexture();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getFillTexture <em>Fill Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Texture</em>' attribute.
	 * @see notation.FillTextureType
	 * @see #getFillTexture()
	 * @generated
	 */
	void setFillTexture(FillTextureType value);

	/**
	 * Returns the value of the '<em><b>Fill Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Orientation</em>' attribute.
	 * @see notation.Orientation
	 * @see #setFillOrientation(Orientation)
	 * @see notation.NotationPackage#getFigureStyle_FillOrientation()
	 * @model required="true"
	 * @generated
	 */
	Orientation getFillOrientation();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getFillOrientation <em>Fill Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Orientation</em>' attribute.
	 * @see notation.Orientation
	 * @see #getFillOrientation()
	 * @generated
	 */
	void setFillOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Fill Texture Color</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Texture Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Texture Color</em>' attribute.
	 * @see notation.Color
	 * @see #setFillTextureColor(Color)
	 * @see notation.NotationPackage#getFigureStyle_FillTextureColor()
	 * @model
	 * @generated
	 */
	Color getFillTextureColor();

	/**
	 * Sets the value of the '{@link notation.FigureStyle#getFillTextureColor <em>Fill Texture Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Texture Color</em>' attribute.
	 * @see notation.Color
	 * @see #getFillTextureColor()
	 * @generated
	 */
	void setFillTextureColor(Color value);

} // FigureStyle

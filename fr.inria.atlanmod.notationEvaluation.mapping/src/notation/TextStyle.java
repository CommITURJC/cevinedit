/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.TextStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link notation.TextStyle#getFontName <em>Font Name</em>}</li>
 *   <li>{@link notation.TextStyle#isBold <em>Bold</em>}</li>
 *   <li>{@link notation.TextStyle#isItalic <em>Italic</em>}</li>
 *   <li>{@link notation.TextStyle#isUnderlined <em>Underlined</em>}</li>
 *   <li>{@link notation.TextStyle#getFontColor <em>Font Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getTextStyle()
 * @model
 * @generated
 */
public interface TextStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(int)
	 * @see notation.NotationPackage#getTextStyle_FontSize()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link notation.TextStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * The default value is <code>"Times"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see notation.NotationPackage#getTextStyle_FontName()
	 * @model default="Times" required="true"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link notation.TextStyle#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(boolean)
	 * @see notation.NotationPackage#getTextStyle_Bold()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBold();

	/**
	 * Sets the value of the '{@link notation.TextStyle#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #isBold()
	 * @generated
	 */
	void setBold(boolean value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(boolean)
	 * @see notation.NotationPackage#getTextStyle_Italic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isItalic();

	/**
	 * Sets the value of the '{@link notation.TextStyle#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #isItalic()
	 * @generated
	 */
	void setItalic(boolean value);

	/**
	 * Returns the value of the '<em><b>Underlined</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underlined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underlined</em>' attribute.
	 * @see #setUnderlined(boolean)
	 * @see notation.NotationPackage#getTextStyle_Underlined()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnderlined();

	/**
	 * Sets the value of the '{@link notation.TextStyle#isUnderlined <em>Underlined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underlined</em>' attribute.
	 * @see #isUnderlined()
	 * @generated
	 */
	void setUnderlined(boolean value);

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' attribute.
	 * The default value is <code>"BLACK"</code>.
	 * The literals are from the enumeration {@link notation.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Color</em>' attribute.
	 * @see notation.Color
	 * @see #setFontColor(Color)
	 * @see notation.NotationPackage#getTextStyle_FontColor()
	 * @model default="BLACK"
	 * @generated
	 */
	Color getFontColor();

	/**
	 * Sets the value of the '{@link notation.TextStyle#getFontColor <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' attribute.
	 * @see notation.Color
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(Color value);

} // TextStyle

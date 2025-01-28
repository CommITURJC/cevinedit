/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Icon#getStyle <em>Style</em>}</li>
 *   <li>{@link notation.Icon#getIconType <em>Icon Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getIcon()
 * @model
 * @generated
 */
public interface Icon extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(IconStyle)
	 * @see notation.NotationPackage#getIcon_Style()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IconStyle getStyle();

	/**
	 * Sets the value of the '{@link notation.Icon#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(IconStyle value);

	/**
	 * Returns the value of the '<em><b>Icon Type</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Type</em>' attribute.
	 * @see notation.IconType
	 * @see #setIconType(IconType)
	 * @see notation.NotationPackage#getIcon_IconType()
	 * @model
	 * @generated
	 */
	IconType getIconType();

	/**
	 * Sets the value of the '{@link notation.Icon#getIconType <em>Icon Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Type</em>' attribute.
	 * @see notation.IconType
	 * @see #getIconType()
	 * @generated
	 */
	void setIconType(IconType value);

} // Icon

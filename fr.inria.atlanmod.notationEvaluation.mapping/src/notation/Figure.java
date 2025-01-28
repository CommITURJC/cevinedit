/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Figure#getFigureStyle <em>Figure Style</em>}</li>
 *   <li>{@link notation.Figure#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link notation.Figure#getFigureContainment <em>Figure Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getFigure()
 * @model abstract="true"
 * @generated
 */
public interface Figure extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Figure Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure Style</em>' containment reference.
	 * @see #setFigureStyle(FigureStyle)
	 * @see notation.NotationPackage#getFigure_FigureStyle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FigureStyle getFigureStyle();

	/**
	 * Sets the value of the '{@link notation.Figure#getFigureStyle <em>Figure Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Style</em>' containment reference.
	 * @see #getFigureStyle()
	 * @generated
	 */
	void setFigureStyle(FigureStyle value);

	/**
	 * Returns the value of the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Style</em>' containment reference.
	 * @see #setBorderStyle(BorderStyle)
	 * @see notation.NotationPackage#getFigure_BorderStyle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BorderStyle getBorderStyle();

	/**
	 * Sets the value of the '{@link notation.Figure#getBorderStyle <em>Border Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Style</em>' containment reference.
	 * @see #getBorderStyle()
	 * @generated
	 */
	void setBorderStyle(BorderStyle value);

	/**
	 * Returns the value of the '<em><b>Figure Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure Containment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure Containment</em>' containment reference.
	 * @see #setFigureContainment(FigureContainment)
	 * @see notation.NotationPackage#getFigure_FigureContainment()
	 * @model containment="true"
	 * @generated
	 */
	FigureContainment getFigureContainment();

	/**
	 * Sets the value of the '{@link notation.Figure#getFigureContainment <em>Figure Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Containment</em>' containment reference.
	 * @see #getFigureContainment()
	 * @generated
	 */
	void setFigureContainment(FigureContainment value);

} // Figure

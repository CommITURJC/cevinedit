/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.SyntaxOf#getReferredElement <em>Referred Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getSyntaxOf()
 * @model
 * @generated
 */
public interface SyntaxOf extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Element</em>' reference.
	 * @see #setReferredElement(DiagramElement)
	 * @see notation.NotationPackage#getSyntaxOf_ReferredElement()
	 * @model required="true"
	 * @generated
	 */
	DiagramElement getReferredElement();

	/**
	 * Sets the value of the '{@link notation.SyntaxOf#getReferredElement <em>Referred Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Element</em>' reference.
	 * @see #getReferredElement()
	 * @generated
	 */
	void setReferredElement(DiagramElement value);

} // SyntaxOf

/**
 */
package notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Composite#getLayout <em>Layout</em>}</li>
 *   <li>{@link notation.Composite#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link notation.Composite#getPrimaryShape <em>Primary Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see notation.Layout
	 * @see #setLayout(Layout)
	 * @see notation.NotationPackage#getComposite_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link notation.Composite#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see notation.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
	 * The list contents are of type {@link notation.GraphicalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' containment reference list.
	 * @see notation.NotationPackage#getComposite_SubElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GraphicalElement> getSubElements();

	/**
	 * Returns the value of the '<em><b>Primary Shape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Shape</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Shape</em>' reference.
	 * @see #setPrimaryShape(GraphicalElement)
	 * @see notation.NotationPackage#getComposite_PrimaryShape()
	 * @model required="true"
	 * @generated
	 */
	GraphicalElement getPrimaryShape();

	/**
	 * Sets the value of the '{@link notation.Composite#getPrimaryShape <em>Primary Shape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Shape</em>' reference.
	 * @see #getPrimaryShape()
	 * @generated
	 */
	void setPrimaryShape(GraphicalElement value);

} // Composite

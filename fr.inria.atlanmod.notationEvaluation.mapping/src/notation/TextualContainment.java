/**
 */
package notation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.TextualContainment#getElements <em>Elements</em>}</li>
 *   <li>{@link notation.TextualContainment#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getTextualContainment()
 * @model
 * @generated
 */
public interface TextualContainment extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link notation.TextualElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see notation.NotationPackage#getTextualContainment_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TextualElement> getElements();

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
	 * @see notation.NotationPackage#getTextualContainment_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link notation.TextualContainment#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see notation.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // TextualContainment

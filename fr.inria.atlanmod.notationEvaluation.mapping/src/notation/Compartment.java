/**
 */
package notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Compartment#getLayout <em>Layout</em>}</li>
 *   <li>{@link notation.Compartment#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends Relation {
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
	 * @see notation.NotationPackage#getCompartment_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link notation.Compartment#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see notation.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' reference.
	 * @see #setNodeType(Node)
	 * @see notation.NotationPackage#getCompartment_NodeType()
	 * @model
	 * @generated
	 */
	Node getNodeType();

	/**
	 * Sets the value of the '{@link notation.Compartment#getNodeType <em>Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' reference.
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(Node value);

} // Compartment

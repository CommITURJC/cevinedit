/**
 */
package mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.ExtensionMapping#getSuper <em>Super</em>}</li>
 *   <li>{@link mapping.ExtensionMapping#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getExtensionMapping()
 * @model
 * @generated
 */
public interface ExtensionMapping extends MappingElement {
	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(DiagramElementMapping)
	 * @see mapping.MappingPackage#getExtensionMapping_Super()
	 * @model
	 * @generated
	 */
	DiagramElementMapping getSuper();

	/**
	 * Sets the value of the '{@link mapping.ExtensionMapping#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(DiagramElementMapping value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference.
	 * @see #setSub(DiagramElementMapping)
	 * @see mapping.MappingPackage#getExtensionMapping_Sub()
	 * @model
	 * @generated
	 */
	DiagramElementMapping getSub();

	/**
	 * Sets the value of the '{@link mapping.ExtensionMapping#getSub <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(DiagramElementMapping value);

} // ExtensionMapping

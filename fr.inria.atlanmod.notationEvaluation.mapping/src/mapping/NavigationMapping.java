/**
 */
package mapping;

import notation.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.NavigationMapping#getFrom <em>From</em>}</li>
 *   <li>{@link mapping.NavigationMapping#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getNavigationMapping()
 * @model
 * @generated
 */
public interface NavigationMapping extends MappingElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DiagramElement)
	 * @see mapping.MappingPackage#getNavigationMapping_From()
	 * @model
	 * @generated
	 */
	DiagramElement getFrom();

	/**
	 * Sets the value of the '{@link mapping.NavigationMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DiagramElement)
	 * @see mapping.MappingPackage#getNavigationMapping_To()
	 * @model
	 * @generated
	 */
	DiagramElement getTo();

	/**
	 * Sets the value of the '{@link mapping.NavigationMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DiagramElement value);

} // NavigationMapping

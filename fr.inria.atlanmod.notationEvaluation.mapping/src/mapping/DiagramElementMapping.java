/**
 */
package mapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.DiagramElementMapping#getAbstractElement <em>Abstract Element</em>}</li>
 *   <li>{@link mapping.DiagramElementMapping#getAbstractContainingClass <em>Abstract Containing Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getDiagramElementMapping()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElementMapping extends MappingElement {
	/**
	 * Returns the value of the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Element</em>' reference.
	 * @see #setAbstractElement(EObject)
	 * @see mapping.MappingPackage#getDiagramElementMapping_AbstractElement()
	 * @model
	 * @generated
	 */
	EObject getAbstractElement();

	/**
	 * Sets the value of the '{@link mapping.DiagramElementMapping#getAbstractElement <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Element</em>' reference.
	 * @see #getAbstractElement()
	 * @generated
	 */
	void setAbstractElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Abstract Containing Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Containing Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Containing Class</em>' reference.
	 * @see #setAbstractContainingClass(EClass)
	 * @see mapping.MappingPackage#getDiagramElementMapping_AbstractContainingClass()
	 * @model
	 * @generated
	 */
	EClass getAbstractContainingClass();

	/**
	 * Sets the value of the '{@link mapping.DiagramElementMapping#getAbstractContainingClass <em>Abstract Containing Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Containing Class</em>' reference.
	 * @see #getAbstractContainingClass()
	 * @generated
	 */
	void setAbstractContainingClass(EClass value);

} // DiagramElementMapping

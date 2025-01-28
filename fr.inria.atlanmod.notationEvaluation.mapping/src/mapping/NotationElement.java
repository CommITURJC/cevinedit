/**
 */
package mapping;

import notation.DiagramDefinition;
import notation.DiagramElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.NotationElement#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link mapping.NotationElement#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getNotationElement()
 * @model
 * @generated
 */
public interface NotationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' reference.
	 * @see #setDiagram(DiagramDefinition)
	 * @see mapping.MappingPackage#getNotationElement_Diagram()
	 * @model
	 * @generated
	 */
	DiagramDefinition getDiagram();

	/**
	 * Sets the value of the '{@link mapping.NotationElement#getDiagram <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(DiagramDefinition value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(DiagramElement)
	 * @see mapping.MappingPackage#getNotationElement_Element()
	 * @model
	 * @generated
	 */
	DiagramElement getElement();

	/**
	 * Sets the value of the '{@link mapping.NotationElement#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(DiagramElement value);

} // NotationElement

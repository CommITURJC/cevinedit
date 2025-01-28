/**
 */
package notation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.NotationDefinition#getType <em>Type</em>}</li>
 *   <li>{@link notation.NotationDefinition#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getNotationDefinition()
 * @model
 * @generated
 */
public interface NotationDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.DefinitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see notation.DefinitionType
	 * @see #setType(DefinitionType)
	 * @see notation.NotationPackage#getNotationDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	DefinitionType getType();

	/**
	 * Sets the value of the '{@link notation.NotationDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see notation.DefinitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(DefinitionType value);

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link notation.DiagramDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see notation.NotationPackage#getNotationDefinition_Diagrams()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DiagramDefinition> getDiagrams();

} // NotationDefinition

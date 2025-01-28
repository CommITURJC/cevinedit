/**
 */
package notation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.DiagramDefinition#getLegend <em>Legend</em>}</li>
 *   <li>{@link notation.DiagramDefinition#getLevel <em>Level</em>}</li>
 *   <li>{@link notation.DiagramDefinition#getElements <em>Elements</em>}</li>
 *   <li>{@link notation.DiagramDefinition#isAllowChunks <em>Allow Chunks</em>}</li>
 *   <li>{@link notation.DiagramDefinition#getTargetedAudience <em>Targeted Audience</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getDiagramDefinition()
 * @model
 * @generated
 */
public interface DiagramDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' attribute.
	 * @see #setLegend(String)
	 * @see notation.NotationPackage#getDiagramDefinition_Legend()
	 * @model required="true"
	 * @generated
	 */
	String getLegend();

	/**
	 * Sets the value of the '{@link notation.DiagramDefinition#getLegend <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' attribute.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see notation.NotationPackage#getDiagramDefinition_Level()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link notation.DiagramDefinition#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link notation.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see notation.NotationPackage#getDiagramDefinition_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramElement> getElements();

	/**
	 * Returns the value of the '<em><b>Allow Chunks</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Chunks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Chunks</em>' attribute.
	 * @see #setAllowChunks(boolean)
	 * @see notation.NotationPackage#getDiagramDefinition_AllowChunks()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAllowChunks();

	/**
	 * Sets the value of the '{@link notation.DiagramDefinition#isAllowChunks <em>Allow Chunks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Chunks</em>' attribute.
	 * @see #isAllowChunks()
	 * @generated
	 */
	void setAllowChunks(boolean value);

	/**
	 * Returns the value of the '<em><b>Targeted Audience</b></em>' attribute.
	 * The literals are from the enumeration {@link notation.AudienceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeted Audience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeted Audience</em>' attribute.
	 * @see notation.AudienceType
	 * @see #setTargetedAudience(AudienceType)
	 * @see notation.NotationPackage#getDiagramDefinition_TargetedAudience()
	 * @model required="true"
	 * @generated
	 */
	AudienceType getTargetedAudience();

	/**
	 * Sets the value of the '{@link notation.DiagramDefinition#getTargetedAudience <em>Targeted Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targeted Audience</em>' attribute.
	 * @see notation.AudienceType
	 * @see #getTargetedAudience()
	 * @generated
	 */
	void setTargetedAudience(AudienceType value);

} // DiagramDefinition

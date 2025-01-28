/**
 */
package cevinedit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cevinedit.Diagram#getContainsElem <em>Contains Elem</em>}</li>
 *   <li>{@link cevinedit.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link cevinedit.Diagram#getModelExtension <em>Model Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see cevinedit.CevineditPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Elem</b></em>' containment reference list.
	 * The list contents are of type {@link cevinedit.PersonalizedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Elem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Elem</em>' containment reference list.
	 * @see cevinedit.CevineditPackage#getDiagram_ContainsElem()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonalizedElement> getContainsElem();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cevinedit.CevineditPackage#getDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cevinedit.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Extension</em>' attribute.
	 * @see #setModelExtension(String)
	 * @see cevinedit.CevineditPackage#getDiagram_ModelExtension()
	 * @model
	 * @generated
	 */
	String getModelExtension();

	/**
	 * Sets the value of the '{@link cevinedit.Diagram#getModelExtension <em>Model Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Extension</em>' attribute.
	 * @see #getModelExtension()
	 * @generated
	 */
	void setModelExtension(String value);

} // Diagram

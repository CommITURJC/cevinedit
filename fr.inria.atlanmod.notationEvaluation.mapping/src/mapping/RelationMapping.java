/**
 */
package mapping;

import notation.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapping.RelationMapping#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapping.MappingPackage#getRelationMapping()
 * @model
 * @generated
 */
public interface RelationMapping extends DiagramElementMapping {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see mapping.MappingPackage#getRelationMapping_Relation()
	 * @model
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link mapping.RelationMapping#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

} // RelationMapping

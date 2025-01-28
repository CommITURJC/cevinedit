/**
 */
package notation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link notation.Polyline#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see notation.NotationPackage#getPolyline()
 * @model
 * @generated
 */
public interface Polyline extends Figure {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link notation.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see notation.NotationPackage#getPolyline_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Polyline

/**
 */
package notation.impl;

import notation.GraphicalElement;
import notation.Image;
import notation.NotationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.ImageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link notation.impl.ImageImpl#getApproximateRepresentation <em>Approximate Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl extends GraphicalElementImpl implements Image {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApproximateRepresentation() <em>Approximate Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproximateRepresentation()
	 * @generated
	 * @ordered
	 */
	protected GraphicalElement approximateRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement getApproximateRepresentation() {
		return approximateRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproximateRepresentation(GraphicalElement newApproximateRepresentation, NotificationChain msgs) {
		GraphicalElement oldApproximateRepresentation = approximateRepresentation;
		approximateRepresentation = newApproximateRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION, oldApproximateRepresentation, newApproximateRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproximateRepresentation(GraphicalElement newApproximateRepresentation) {
		if (newApproximateRepresentation != approximateRepresentation) {
			NotificationChain msgs = null;
			if (approximateRepresentation != null)
				msgs = ((InternalEObject)approximateRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION, null, msgs);
			if (newApproximateRepresentation != null)
				msgs = ((InternalEObject)newApproximateRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION, null, msgs);
			msgs = basicSetApproximateRepresentation(newApproximateRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION, newApproximateRepresentation, newApproximateRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION:
				return basicSetApproximateRepresentation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.IMAGE__PATH:
				return getPath();
			case NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION:
				return getApproximateRepresentation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.IMAGE__PATH:
				setPath((String)newValue);
				return;
			case NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION:
				setApproximateRepresentation((GraphicalElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.IMAGE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION:
				setApproximateRepresentation((GraphicalElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotationPackage.IMAGE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case NotationPackage.IMAGE__APPROXIMATE_REPRESENTATION:
				return approximateRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //ImageImpl

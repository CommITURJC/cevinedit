/**
 */
package notation.impl;

import notation.DiagramElement;
import notation.NotationPackage;
import notation.SyntaxOf;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntax Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.SyntaxOfImpl#getReferredElement <em>Referred Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyntaxOfImpl extends GraphicalElementImpl implements SyntaxOf {
	/**
	 * The cached value of the '{@link #getReferredElement() <em>Referred Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredElement()
	 * @generated
	 * @ordered
	 */
	protected DiagramElement referredElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntaxOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.SYNTAX_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getReferredElement() {
		if (referredElement != null && referredElement.eIsProxy()) {
			InternalEObject oldReferredElement = (InternalEObject)referredElement;
			referredElement = (DiagramElement)eResolveProxy(oldReferredElement);
			if (referredElement != oldReferredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.SYNTAX_OF__REFERRED_ELEMENT, oldReferredElement, referredElement));
			}
		}
		return referredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement basicGetReferredElement() {
		return referredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredElement(DiagramElement newReferredElement) {
		DiagramElement oldReferredElement = referredElement;
		referredElement = newReferredElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SYNTAX_OF__REFERRED_ELEMENT, oldReferredElement, referredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.SYNTAX_OF__REFERRED_ELEMENT:
				if (resolve) return getReferredElement();
				return basicGetReferredElement();
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
			case NotationPackage.SYNTAX_OF__REFERRED_ELEMENT:
				setReferredElement((DiagramElement)newValue);
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
			case NotationPackage.SYNTAX_OF__REFERRED_ELEMENT:
				setReferredElement((DiagramElement)null);
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
			case NotationPackage.SYNTAX_OF__REFERRED_ELEMENT:
				return referredElement != null;
		}
		return super.eIsSet(featureID);
	}

} //SyntaxOfImpl

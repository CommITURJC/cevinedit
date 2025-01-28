/**
 */
package notation.impl;

import notation.GraphicalElement;
import notation.Link;
import notation.NotationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.LinkImpl#getGraphicalElement <em>Graphical Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends RelationImpl implements Link {
	/**
	 * The cached value of the '{@link #getGraphicalElement() <em>Graphical Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicalElement()
	 * @generated
	 * @ordered
	 */
	protected GraphicalElement graphicalElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement getGraphicalElement() {
		return graphicalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicalElement(GraphicalElement newGraphicalElement, NotificationChain msgs) {
		GraphicalElement oldGraphicalElement = graphicalElement;
		graphicalElement = newGraphicalElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.LINK__GRAPHICAL_ELEMENT, oldGraphicalElement, newGraphicalElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicalElement(GraphicalElement newGraphicalElement) {
		if (newGraphicalElement != graphicalElement) {
			NotificationChain msgs = null;
			if (graphicalElement != null)
				msgs = ((InternalEObject)graphicalElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.LINK__GRAPHICAL_ELEMENT, null, msgs);
			if (newGraphicalElement != null)
				msgs = ((InternalEObject)newGraphicalElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.LINK__GRAPHICAL_ELEMENT, null, msgs);
			msgs = basicSetGraphicalElement(newGraphicalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINK__GRAPHICAL_ELEMENT, newGraphicalElement, newGraphicalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.LINK__GRAPHICAL_ELEMENT:
				return basicSetGraphicalElement(null, msgs);
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
			case NotationPackage.LINK__GRAPHICAL_ELEMENT:
				return getGraphicalElement();
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
			case NotationPackage.LINK__GRAPHICAL_ELEMENT:
				setGraphicalElement((GraphicalElement)newValue);
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
			case NotationPackage.LINK__GRAPHICAL_ELEMENT:
				setGraphicalElement((GraphicalElement)null);
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
			case NotationPackage.LINK__GRAPHICAL_ELEMENT:
				return graphicalElement != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl

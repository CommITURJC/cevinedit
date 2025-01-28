/**
 */
package notation.impl;

import java.util.Collection;

import notation.Composite;
import notation.GraphicalElement;
import notation.Layout;
import notation.NotationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.CompositeImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link notation.impl.CompositeImpl#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link notation.impl.CompositeImpl#getPrimaryShape <em>Primary Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends GraphicalElementImpl implements Composite {
	/**
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Layout LAYOUT_EDEFAULT = Layout.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout = LAYOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubElements() <em>Sub Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicalElement> subElements;

	/**
	 * The cached value of the '{@link #getPrimaryShape() <em>Primary Shape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryShape()
	 * @generated
	 * @ordered
	 */
	protected GraphicalElement primaryShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.COMPOSITE__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicalElement> getSubElements() {
		if (subElements == null) {
			subElements = new EObjectContainmentEList<GraphicalElement>(GraphicalElement.class, this, NotationPackage.COMPOSITE__SUB_ELEMENTS);
		}
		return subElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement getPrimaryShape() {
		if (primaryShape != null && primaryShape.eIsProxy()) {
			InternalEObject oldPrimaryShape = (InternalEObject)primaryShape;
			primaryShape = (GraphicalElement)eResolveProxy(oldPrimaryShape);
			if (primaryShape != oldPrimaryShape) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NotationPackage.COMPOSITE__PRIMARY_SHAPE, oldPrimaryShape, primaryShape));
			}
		}
		return primaryShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement basicGetPrimaryShape() {
		return primaryShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryShape(GraphicalElement newPrimaryShape) {
		GraphicalElement oldPrimaryShape = primaryShape;
		primaryShape = newPrimaryShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.COMPOSITE__PRIMARY_SHAPE, oldPrimaryShape, primaryShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.COMPOSITE__SUB_ELEMENTS:
				return ((InternalEList<?>)getSubElements()).basicRemove(otherEnd, msgs);
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
			case NotationPackage.COMPOSITE__LAYOUT:
				return getLayout();
			case NotationPackage.COMPOSITE__SUB_ELEMENTS:
				return getSubElements();
			case NotationPackage.COMPOSITE__PRIMARY_SHAPE:
				if (resolve) return getPrimaryShape();
				return basicGetPrimaryShape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.COMPOSITE__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case NotationPackage.COMPOSITE__SUB_ELEMENTS:
				getSubElements().clear();
				getSubElements().addAll((Collection<? extends GraphicalElement>)newValue);
				return;
			case NotationPackage.COMPOSITE__PRIMARY_SHAPE:
				setPrimaryShape((GraphicalElement)newValue);
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
			case NotationPackage.COMPOSITE__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
				return;
			case NotationPackage.COMPOSITE__SUB_ELEMENTS:
				getSubElements().clear();
				return;
			case NotationPackage.COMPOSITE__PRIMARY_SHAPE:
				setPrimaryShape((GraphicalElement)null);
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
			case NotationPackage.COMPOSITE__LAYOUT:
				return layout != LAYOUT_EDEFAULT;
			case NotationPackage.COMPOSITE__SUB_ELEMENTS:
				return subElements != null && !subElements.isEmpty();
			case NotationPackage.COMPOSITE__PRIMARY_SHAPE:
				return primaryShape != null;
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
		result.append(" (layout: ");
		result.append(layout);
		result.append(')');
		return result.toString();
	}

} //CompositeImpl

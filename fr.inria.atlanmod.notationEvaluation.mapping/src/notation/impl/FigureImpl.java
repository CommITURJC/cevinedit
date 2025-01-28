/**
 */
package notation.impl;

import notation.BorderStyle;
import notation.Figure;
import notation.FigureContainment;
import notation.FigureStyle;
import notation.NotationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.FigureImpl#getFigureStyle <em>Figure Style</em>}</li>
 *   <li>{@link notation.impl.FigureImpl#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link notation.impl.FigureImpl#getFigureContainment <em>Figure Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FigureImpl extends GraphicalElementImpl implements Figure {
	/**
	 * The cached value of the '{@link #getFigureStyle() <em>Figure Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureStyle()
	 * @generated
	 * @ordered
	 */
	protected FigureStyle figureStyle;

	/**
	 * The cached value of the '{@link #getBorderStyle() <em>Border Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderStyle()
	 * @generated
	 * @ordered
	 */
	protected BorderStyle borderStyle;

	/**
	 * The cached value of the '{@link #getFigureContainment() <em>Figure Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureContainment()
	 * @generated
	 * @ordered
	 */
	protected FigureContainment figureContainment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.FIGURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureStyle getFigureStyle() {
		return figureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigureStyle(FigureStyle newFigureStyle, NotificationChain msgs) {
		FigureStyle oldFigureStyle = figureStyle;
		figureStyle = newFigureStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE__FIGURE_STYLE, oldFigureStyle, newFigureStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigureStyle(FigureStyle newFigureStyle) {
		if (newFigureStyle != figureStyle) {
			NotificationChain msgs = null;
			if (figureStyle != null)
				msgs = ((InternalEObject)figureStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.FIGURE__FIGURE_STYLE, null, msgs);
			if (newFigureStyle != null)
				msgs = ((InternalEObject)newFigureStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.FIGURE__FIGURE_STYLE, null, msgs);
			msgs = basicSetFigureStyle(newFigureStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE__FIGURE_STYLE, newFigureStyle, newFigureStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderStyle getBorderStyle() {
		return borderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBorderStyle(BorderStyle newBorderStyle, NotificationChain msgs) {
		BorderStyle oldBorderStyle = borderStyle;
		borderStyle = newBorderStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE__BORDER_STYLE, oldBorderStyle, newBorderStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderStyle(BorderStyle newBorderStyle) {
		if (newBorderStyle != borderStyle) {
			NotificationChain msgs = null;
			if (borderStyle != null)
				msgs = ((InternalEObject)borderStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.FIGURE__BORDER_STYLE, null, msgs);
			if (newBorderStyle != null)
				msgs = ((InternalEObject)newBorderStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.FIGURE__BORDER_STYLE, null, msgs);
			msgs = basicSetBorderStyle(newBorderStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE__BORDER_STYLE, newBorderStyle, newBorderStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureContainment getFigureContainment() {
		return figureContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigureContainment(FigureContainment newFigureContainment, NotificationChain msgs) {
		FigureContainment oldFigureContainment = figureContainment;
		figureContainment = newFigureContainment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE__FIGURE_CONTAINMENT, oldFigureContainment, newFigureContainment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigureContainment(FigureContainment newFigureContainment) {
		if (newFigureContainment != figureContainment) {
			NotificationChain msgs = null;
			if (figureContainment != null)
				msgs = ((InternalEObject)figureContainment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotationPackage.FIGURE__FIGURE_CONTAINMENT, null, msgs);
			if (newFigureContainment != null)
				msgs = ((InternalEObject)newFigureContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotationPackage.FIGURE__FIGURE_CONTAINMENT, null, msgs);
			msgs = basicSetFigureContainment(newFigureContainment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE__FIGURE_CONTAINMENT, newFigureContainment, newFigureContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.FIGURE__FIGURE_STYLE:
				return basicSetFigureStyle(null, msgs);
			case NotationPackage.FIGURE__BORDER_STYLE:
				return basicSetBorderStyle(null, msgs);
			case NotationPackage.FIGURE__FIGURE_CONTAINMENT:
				return basicSetFigureContainment(null, msgs);
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
			case NotationPackage.FIGURE__FIGURE_STYLE:
				return getFigureStyle();
			case NotationPackage.FIGURE__BORDER_STYLE:
				return getBorderStyle();
			case NotationPackage.FIGURE__FIGURE_CONTAINMENT:
				return getFigureContainment();
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
			case NotationPackage.FIGURE__FIGURE_STYLE:
				setFigureStyle((FigureStyle)newValue);
				return;
			case NotationPackage.FIGURE__BORDER_STYLE:
				setBorderStyle((BorderStyle)newValue);
				return;
			case NotationPackage.FIGURE__FIGURE_CONTAINMENT:
				setFigureContainment((FigureContainment)newValue);
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
			case NotationPackage.FIGURE__FIGURE_STYLE:
				setFigureStyle((FigureStyle)null);
				return;
			case NotationPackage.FIGURE__BORDER_STYLE:
				setBorderStyle((BorderStyle)null);
				return;
			case NotationPackage.FIGURE__FIGURE_CONTAINMENT:
				setFigureContainment((FigureContainment)null);
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
			case NotationPackage.FIGURE__FIGURE_STYLE:
				return figureStyle != null;
			case NotationPackage.FIGURE__BORDER_STYLE:
				return borderStyle != null;
			case NotationPackage.FIGURE__FIGURE_CONTAINMENT:
				return figureContainment != null;
		}
		return super.eIsSet(featureID);
	}

} //FigureImpl

/**
 */
package cevinedit.impl;

import cevinedit.CEViNEditRoot;
import cevinedit.CevineditPackage;
import cevinedit.Diagram;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CE Vi NEdit Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cevinedit.impl.CEViNEditRootImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link cevinedit.impl.CEViNEditRootImpl#getSourceMM <em>Source MM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CEViNEditRootImpl extends EObjectImpl implements CEViNEditRoot {
	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected Diagram diagram;

	/**
	 * The default value of the '{@link #getSourceMM() <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMM()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceMM() <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMM()
	 * @generated
	 * @ordered
	 */
	protected String sourceMM = SOURCE_MM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEViNEditRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CevineditPackage.Literals.CE_VI_NEDIT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		Diagram oldDiagram = diagram;
		diagram = newDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM, oldDiagram, newDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		if (newDiagram != diagram) {
			NotificationChain msgs = null;
			if (diagram != null)
				msgs = ((InternalEObject)diagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM, null, msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM, null, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceMM() {
		return sourceMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMM(String newSourceMM) {
		String oldSourceMM = sourceMM;
		sourceMM = newSourceMM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.CE_VI_NEDIT_ROOT__SOURCE_MM, oldSourceMM, sourceMM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM:
				return basicSetDiagram(null, msgs);
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
			case CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM:
				return getDiagram();
			case CevineditPackage.CE_VI_NEDIT_ROOT__SOURCE_MM:
				return getSourceMM();
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
			case CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case CevineditPackage.CE_VI_NEDIT_ROOT__SOURCE_MM:
				setSourceMM((String)newValue);
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
			case CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case CevineditPackage.CE_VI_NEDIT_ROOT__SOURCE_MM:
				setSourceMM(SOURCE_MM_EDEFAULT);
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
			case CevineditPackage.CE_VI_NEDIT_ROOT__DIAGRAM:
				return diagram != null;
			case CevineditPackage.CE_VI_NEDIT_ROOT__SOURCE_MM:
				return SOURCE_MM_EDEFAULT == null ? sourceMM != null : !SOURCE_MM_EDEFAULT.equals(sourceMM);
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
		result.append(" (sourceMM: ");
		result.append(sourceMM);
		result.append(')');
		return result.toString();
	}

} //CEViNEditRootImpl

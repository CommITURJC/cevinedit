/**
 */
package mapping.impl;

import mapping.DiagramElementMapping;
import mapping.ExtensionMapping;
import mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mapping.impl.ExtensionMappingImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link mapping.impl.ExtensionMappingImpl#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionMappingImpl extends MappingElementImpl implements ExtensionMapping {
	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected DiagramElementMapping super_;

	/**
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected DiagramElementMapping sub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.EXTENSION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementMapping getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (DiagramElementMapping)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.EXTENSION_MAPPING__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementMapping basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(DiagramElementMapping newSuper) {
		DiagramElementMapping oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.EXTENSION_MAPPING__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementMapping getSub() {
		if (sub != null && sub.eIsProxy()) {
			InternalEObject oldSub = (InternalEObject)sub;
			sub = (DiagramElementMapping)eResolveProxy(oldSub);
			if (sub != oldSub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.EXTENSION_MAPPING__SUB, oldSub, sub));
			}
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementMapping basicGetSub() {
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSub(DiagramElementMapping newSub) {
		DiagramElementMapping oldSub = sub;
		sub = newSub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.EXTENSION_MAPPING__SUB, oldSub, sub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.EXTENSION_MAPPING__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case MappingPackage.EXTENSION_MAPPING__SUB:
				if (resolve) return getSub();
				return basicGetSub();
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
			case MappingPackage.EXTENSION_MAPPING__SUPER:
				setSuper((DiagramElementMapping)newValue);
				return;
			case MappingPackage.EXTENSION_MAPPING__SUB:
				setSub((DiagramElementMapping)newValue);
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
			case MappingPackage.EXTENSION_MAPPING__SUPER:
				setSuper((DiagramElementMapping)null);
				return;
			case MappingPackage.EXTENSION_MAPPING__SUB:
				setSub((DiagramElementMapping)null);
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
			case MappingPackage.EXTENSION_MAPPING__SUPER:
				return super_ != null;
			case MappingPackage.EXTENSION_MAPPING__SUB:
				return sub != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtensionMappingImpl

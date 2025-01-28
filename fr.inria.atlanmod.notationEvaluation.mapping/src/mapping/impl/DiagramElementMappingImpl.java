/**
 */
package mapping.impl;

import mapping.DiagramElementMapping;
import mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mapping.impl.DiagramElementMappingImpl#getAbstractElement <em>Abstract Element</em>}</li>
 *   <li>{@link mapping.impl.DiagramElementMappingImpl#getAbstractContainingClass <em>Abstract Containing Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramElementMappingImpl extends MappingElementImpl implements DiagramElementMapping {
	/**
	 * The cached value of the '{@link #getAbstractElement() <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractElement()
	 * @generated
	 * @ordered
	 */
	protected EObject abstractElement;

	/**
	 * The cached value of the '{@link #getAbstractContainingClass() <em>Abstract Containing Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractContainingClass()
	 * @generated
	 * @ordered
	 */
	protected EClass abstractContainingClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.DIAGRAM_ELEMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAbstractElement() {
		if (abstractElement != null && abstractElement.eIsProxy()) {
			InternalEObject oldAbstractElement = (InternalEObject)abstractElement;
			abstractElement = eResolveProxy(oldAbstractElement);
			if (abstractElement != oldAbstractElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
			}
		}
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetAbstractElement() {
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractElement(EObject newAbstractElement) {
		EObject oldAbstractElement = abstractElement;
		abstractElement = newAbstractElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContainingClass() {
		if (abstractContainingClass != null && abstractContainingClass.eIsProxy()) {
			InternalEObject oldAbstractContainingClass = (InternalEObject)abstractContainingClass;
			abstractContainingClass = (EClass)eResolveProxy(oldAbstractContainingClass);
			if (abstractContainingClass != oldAbstractContainingClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS, oldAbstractContainingClass, abstractContainingClass));
			}
		}
		return abstractContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAbstractContainingClass() {
		return abstractContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractContainingClass(EClass newAbstractContainingClass) {
		EClass oldAbstractContainingClass = abstractContainingClass;
		abstractContainingClass = newAbstractContainingClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS, oldAbstractContainingClass, abstractContainingClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				if (resolve) return getAbstractElement();
				return basicGetAbstractElement();
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS:
				if (resolve) return getAbstractContainingClass();
				return basicGetAbstractContainingClass();
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
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				setAbstractElement((EObject)newValue);
				return;
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS:
				setAbstractContainingClass((EClass)newValue);
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
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				setAbstractElement((EObject)null);
				return;
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS:
				setAbstractContainingClass((EClass)null);
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
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				return abstractElement != null;
			case MappingPackage.DIAGRAM_ELEMENT_MAPPING__ABSTRACT_CONTAINING_CLASS:
				return abstractContainingClass != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramElementMappingImpl

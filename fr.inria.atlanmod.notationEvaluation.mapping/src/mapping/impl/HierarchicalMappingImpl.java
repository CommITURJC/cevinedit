/**
 */
package mapping.impl;

import mapping.HierarchicalMapping;
import mapping.MappingPackage;

import notation.DiagramDefinition;
import notation.DiagramElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchical Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mapping.impl.HierarchicalMappingImpl#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link mapping.impl.HierarchicalMappingImpl#getSubElement <em>Sub Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchicalMappingImpl extends MappingElementImpl implements HierarchicalMapping {
	/**
	 * The cached value of the '{@link #getSuperElement() <em>Super Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperElement()
	 * @generated
	 * @ordered
	 */
	protected DiagramElement superElement;

	/**
	 * The cached value of the '{@link #getSubElement() <em>Sub Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElement()
	 * @generated
	 * @ordered
	 */
	protected DiagramDefinition subElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchicalMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.HIERARCHICAL_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getSuperElement() {
		if (superElement != null && superElement.eIsProxy()) {
			InternalEObject oldSuperElement = (InternalEObject)superElement;
			superElement = (DiagramElement)eResolveProxy(oldSuperElement);
			if (superElement != oldSuperElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.HIERARCHICAL_MAPPING__SUPER_ELEMENT, oldSuperElement, superElement));
			}
		}
		return superElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement basicGetSuperElement() {
		return superElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperElement(DiagramElement newSuperElement) {
		DiagramElement oldSuperElement = superElement;
		superElement = newSuperElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.HIERARCHICAL_MAPPING__SUPER_ELEMENT, oldSuperElement, superElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDefinition getSubElement() {
		if (subElement != null && subElement.eIsProxy()) {
			InternalEObject oldSubElement = (InternalEObject)subElement;
			subElement = (DiagramDefinition)eResolveProxy(oldSubElement);
			if (subElement != oldSubElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.HIERARCHICAL_MAPPING__SUB_ELEMENT, oldSubElement, subElement));
			}
		}
		return subElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDefinition basicGetSubElement() {
		return subElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubElement(DiagramDefinition newSubElement) {
		DiagramDefinition oldSubElement = subElement;
		subElement = newSubElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.HIERARCHICAL_MAPPING__SUB_ELEMENT, oldSubElement, subElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.HIERARCHICAL_MAPPING__SUPER_ELEMENT:
				if (resolve) return getSuperElement();
				return basicGetSuperElement();
			case MappingPackage.HIERARCHICAL_MAPPING__SUB_ELEMENT:
				if (resolve) return getSubElement();
				return basicGetSubElement();
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
			case MappingPackage.HIERARCHICAL_MAPPING__SUPER_ELEMENT:
				setSuperElement((DiagramElement)newValue);
				return;
			case MappingPackage.HIERARCHICAL_MAPPING__SUB_ELEMENT:
				setSubElement((DiagramDefinition)newValue);
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
			case MappingPackage.HIERARCHICAL_MAPPING__SUPER_ELEMENT:
				setSuperElement((DiagramElement)null);
				return;
			case MappingPackage.HIERARCHICAL_MAPPING__SUB_ELEMENT:
				setSubElement((DiagramDefinition)null);
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
			case MappingPackage.HIERARCHICAL_MAPPING__SUPER_ELEMENT:
				return superElement != null;
			case MappingPackage.HIERARCHICAL_MAPPING__SUB_ELEMENT:
				return subElement != null;
		}
		return super.eIsSet(featureID);
	}

} //HierarchicalMappingImpl

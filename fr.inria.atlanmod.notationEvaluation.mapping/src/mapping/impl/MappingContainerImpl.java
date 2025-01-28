/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.ExtensionMapping;
import mapping.HierarchicalMapping;
import mapping.MappingContainer;
import mapping.MappingPackage;
import mapping.NavigationMapping;
import mapping.NodeMapping;
import mapping.RelationMapping;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mapping.impl.MappingContainerImpl#getNodeMappings <em>Node Mappings</em>}</li>
 *   <li>{@link mapping.impl.MappingContainerImpl#getRelationMappings <em>Relation Mappings</em>}</li>
 *   <li>{@link mapping.impl.MappingContainerImpl#getNavigationMappings <em>Navigation Mappings</em>}</li>
 *   <li>{@link mapping.impl.MappingContainerImpl#getExtensionMappings <em>Extension Mappings</em>}</li>
 *   <li>{@link mapping.impl.MappingContainerImpl#getHierarchicalMappings <em>Hierarchical Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingContainerImpl extends MinimalEObjectImpl.Container implements MappingContainer {
	/**
	 * The cached value of the '{@link #getNodeMappings() <em>Node Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeMapping> nodeMappings;

	/**
	 * The cached value of the '{@link #getRelationMappings() <em>Relation Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMapping> relationMappings;

	/**
	 * The cached value of the '{@link #getNavigationMappings() <em>Navigation Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationMapping> navigationMappings;

	/**
	 * The cached value of the '{@link #getExtensionMappings() <em>Extension Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionMapping> extensionMappings;

	/**
	 * The cached value of the '{@link #getHierarchicalMappings() <em>Hierarchical Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchicalMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<HierarchicalMapping> hierarchicalMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeMapping> getNodeMappings() {
		if (nodeMappings == null) {
			nodeMappings = new EObjectContainmentEList<NodeMapping>(NodeMapping.class, this, MappingPackage.MAPPING_CONTAINER__NODE_MAPPINGS);
		}
		return nodeMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationMapping> getRelationMappings() {
		if (relationMappings == null) {
			relationMappings = new EObjectContainmentEList<RelationMapping>(RelationMapping.class, this, MappingPackage.MAPPING_CONTAINER__RELATION_MAPPINGS);
		}
		return relationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationMapping> getNavigationMappings() {
		if (navigationMappings == null) {
			navigationMappings = new EObjectContainmentEList<NavigationMapping>(NavigationMapping.class, this, MappingPackage.MAPPING_CONTAINER__NAVIGATION_MAPPINGS);
		}
		return navigationMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionMapping> getExtensionMappings() {
		if (extensionMappings == null) {
			extensionMappings = new EObjectContainmentEList<ExtensionMapping>(ExtensionMapping.class, this, MappingPackage.MAPPING_CONTAINER__EXTENSION_MAPPINGS);
		}
		return extensionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HierarchicalMapping> getHierarchicalMappings() {
		if (hierarchicalMappings == null) {
			hierarchicalMappings = new EObjectContainmentEList<HierarchicalMapping>(HierarchicalMapping.class, this, MappingPackage.MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS);
		}
		return hierarchicalMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.MAPPING_CONTAINER__NODE_MAPPINGS:
				return ((InternalEList<?>)getNodeMappings()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER__RELATION_MAPPINGS:
				return ((InternalEList<?>)getRelationMappings()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER__NAVIGATION_MAPPINGS:
				return ((InternalEList<?>)getNavigationMappings()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER__EXTENSION_MAPPINGS:
				return ((InternalEList<?>)getExtensionMappings()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS:
				return ((InternalEList<?>)getHierarchicalMappings()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.MAPPING_CONTAINER__NODE_MAPPINGS:
				return getNodeMappings();
			case MappingPackage.MAPPING_CONTAINER__RELATION_MAPPINGS:
				return getRelationMappings();
			case MappingPackage.MAPPING_CONTAINER__NAVIGATION_MAPPINGS:
				return getNavigationMappings();
			case MappingPackage.MAPPING_CONTAINER__EXTENSION_MAPPINGS:
				return getExtensionMappings();
			case MappingPackage.MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS:
				return getHierarchicalMappings();
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
			case MappingPackage.MAPPING_CONTAINER__NODE_MAPPINGS:
				getNodeMappings().clear();
				getNodeMappings().addAll((Collection<? extends NodeMapping>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER__RELATION_MAPPINGS:
				getRelationMappings().clear();
				getRelationMappings().addAll((Collection<? extends RelationMapping>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER__NAVIGATION_MAPPINGS:
				getNavigationMappings().clear();
				getNavigationMappings().addAll((Collection<? extends NavigationMapping>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER__EXTENSION_MAPPINGS:
				getExtensionMappings().clear();
				getExtensionMappings().addAll((Collection<? extends ExtensionMapping>)newValue);
				return;
			case MappingPackage.MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS:
				getHierarchicalMappings().clear();
				getHierarchicalMappings().addAll((Collection<? extends HierarchicalMapping>)newValue);
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
			case MappingPackage.MAPPING_CONTAINER__NODE_MAPPINGS:
				getNodeMappings().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER__RELATION_MAPPINGS:
				getRelationMappings().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER__NAVIGATION_MAPPINGS:
				getNavigationMappings().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER__EXTENSION_MAPPINGS:
				getExtensionMappings().clear();
				return;
			case MappingPackage.MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS:
				getHierarchicalMappings().clear();
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
			case MappingPackage.MAPPING_CONTAINER__NODE_MAPPINGS:
				return nodeMappings != null && !nodeMappings.isEmpty();
			case MappingPackage.MAPPING_CONTAINER__RELATION_MAPPINGS:
				return relationMappings != null && !relationMappings.isEmpty();
			case MappingPackage.MAPPING_CONTAINER__NAVIGATION_MAPPINGS:
				return navigationMappings != null && !navigationMappings.isEmpty();
			case MappingPackage.MAPPING_CONTAINER__EXTENSION_MAPPINGS:
				return extensionMappings != null && !extensionMappings.isEmpty();
			case MappingPackage.MAPPING_CONTAINER__HIERARCHICAL_MAPPINGS:
				return hierarchicalMappings != null && !hierarchicalMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingContainerImpl

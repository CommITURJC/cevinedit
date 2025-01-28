/**
 */
package mapping.util;

import mapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mapping.MappingPackage
 * @generated
 */
public class MappingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingSwitch<Adapter> modelSwitch =
		new MappingSwitch<Adapter>() {
			@Override
			public Adapter caseMappingContainer(MappingContainer object) {
				return createMappingContainerAdapter();
			}
			@Override
			public Adapter caseMappingElement(MappingElement object) {
				return createMappingElementAdapter();
			}
			@Override
			public Adapter caseDiagramElementMapping(DiagramElementMapping object) {
				return createDiagramElementMappingAdapter();
			}
			@Override
			public Adapter caseNodeMapping(NodeMapping object) {
				return createNodeMappingAdapter();
			}
			@Override
			public Adapter caseRelationMapping(RelationMapping object) {
				return createRelationMappingAdapter();
			}
			@Override
			public Adapter caseExtensionMapping(ExtensionMapping object) {
				return createExtensionMappingAdapter();
			}
			@Override
			public Adapter caseNavigationMapping(NavigationMapping object) {
				return createNavigationMappingAdapter();
			}
			@Override
			public Adapter caseNotationElement(NotationElement object) {
				return createNotationElementAdapter();
			}
			@Override
			public Adapter caseHierarchicalMapping(HierarchicalMapping object) {
				return createHierarchicalMappingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mapping.MappingContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.MappingContainer
	 * @generated
	 */
	public Adapter createMappingContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.MappingElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.MappingElement
	 * @generated
	 */
	public Adapter createMappingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.DiagramElementMapping <em>Diagram Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.DiagramElementMapping
	 * @generated
	 */
	public Adapter createDiagramElementMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.NodeMapping <em>Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.NodeMapping
	 * @generated
	 */
	public Adapter createNodeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.RelationMapping <em>Relation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.RelationMapping
	 * @generated
	 */
	public Adapter createRelationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.ExtensionMapping <em>Extension Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.ExtensionMapping
	 * @generated
	 */
	public Adapter createExtensionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.NavigationMapping <em>Navigation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.NavigationMapping
	 * @generated
	 */
	public Adapter createNavigationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.NotationElement <em>Notation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.NotationElement
	 * @generated
	 */
	public Adapter createNotationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapping.HierarchicalMapping <em>Hierarchical Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapping.HierarchicalMapping
	 * @generated
	 */
	public Adapter createHierarchicalMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MappingAdapterFactory

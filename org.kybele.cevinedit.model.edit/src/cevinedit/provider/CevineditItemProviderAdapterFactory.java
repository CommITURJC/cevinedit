/**
 */
package cevinedit.provider;

import cevinedit.util.CevineditAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CevineditItemProviderAdapterFactory extends CevineditAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CevineditItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.CEViNEditRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEViNEditRootItemProvider ceViNEditRootItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.CEViNEditRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCEViNEditRootAdapter() {
		if (ceViNEditRootItemProvider == null) {
			ceViNEditRootItemProvider = new CEViNEditRootItemProvider(this);
		}

		return ceViNEditRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.Diagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramItemProvider diagramItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.Diagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramAdapter() {
		if (diagramItemProvider == null) {
			diagramItemProvider = new DiagramItemProvider(this);
		}

		return diagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.NodeEClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeEClassItemProvider nodeEClassItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.NodeEClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeEClassAdapter() {
		if (nodeEClassItemProvider == null) {
			nodeEClassItemProvider = new NodeEClassItemProvider(this);
		}

		return nodeEClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.LinkEClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEClassItemProvider linkEClassItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.LinkEClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkEClassAdapter() {
		if (linkEClassItemProvider == null) {
			linkEClassItemProvider = new LinkEClassItemProvider(this);
		}

		return linkEClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.CompartmentEReferenceCont} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentEReferenceContItemProvider compartmentEReferenceContItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.CompartmentEReferenceCont}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompartmentEReferenceContAdapter() {
		if (compartmentEReferenceContItemProvider == null) {
			compartmentEReferenceContItemProvider = new CompartmentEReferenceContItemProvider(this);
		}

		return compartmentEReferenceContItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.AffixedEReferenceCont} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffixedEReferenceContItemProvider affixedEReferenceContItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.AffixedEReferenceCont}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAffixedEReferenceContAdapter() {
		if (affixedEReferenceContItemProvider == null) {
			affixedEReferenceContItemProvider = new AffixedEReferenceContItemProvider(this);
		}

		return affixedEReferenceContItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.LabelEAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelEAttributeItemProvider labelEAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.LabelEAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLabelEAttributeAdapter() {
		if (labelEAttributeItemProvider == null) {
			labelEAttributeItemProvider = new LabelEAttributeItemProvider(this);
		}

		return labelEAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cevinedit.LinkEReferenceNonCont} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEReferenceNonContItemProvider linkEReferenceNonContItemProvider;

	/**
	 * This creates an adapter for a {@link cevinedit.LinkEReferenceNonCont}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkEReferenceNonContAdapter() {
		if (linkEReferenceNonContItemProvider == null) {
			linkEReferenceNonContItemProvider = new LinkEReferenceNonContItemProvider(this);
		}

		return linkEReferenceNonContItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (ceViNEditRootItemProvider != null) ceViNEditRootItemProvider.dispose();
		if (diagramItemProvider != null) diagramItemProvider.dispose();
		if (nodeEClassItemProvider != null) nodeEClassItemProvider.dispose();
		if (linkEClassItemProvider != null) linkEClassItemProvider.dispose();
		if (compartmentEReferenceContItemProvider != null) compartmentEReferenceContItemProvider.dispose();
		if (affixedEReferenceContItemProvider != null) affixedEReferenceContItemProvider.dispose();
		if (labelEAttributeItemProvider != null) labelEAttributeItemProvider.dispose();
		if (linkEReferenceNonContItemProvider != null) linkEReferenceNonContItemProvider.dispose();
	}

}

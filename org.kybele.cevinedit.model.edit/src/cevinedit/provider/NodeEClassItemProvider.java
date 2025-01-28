/**
 */
package cevinedit.provider;


import cevinedit.CevineditPackage;
import cevinedit.NodeEClass;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cevinedit.NodeEClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeEClassItemProvider
	extends PersonalizedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeEClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBackgroundColorPropertyDescriptor(object);
			addBorderColorPropertyDescriptor(object);
			addBorderTexturePropertyDescriptor(object);
			addBorderWidthPropertyDescriptor(object);
			addBrightnessPropertyDescriptor(object);
			addFigurePropertyDescriptor(object);
			addResizablePropertyDescriptor(object);
			addSizePropertyDescriptor(object);
			addLabelPlacementPropertyDescriptor(object);
			addLabelFontStylePropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addImagePathPropertyDescriptor(object);
			addListPointsPolygonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_backgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_backgroundColor_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__BACKGROUND_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Border Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_borderColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_borderColor_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__BORDER_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Border Texture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderTexturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_borderTexture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_borderTexture_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__BORDER_TEXTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Border Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_borderWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_borderWidth_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__BORDER_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Brightness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrightnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_brightness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_brightness_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__BRIGHTNESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Figure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFigurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_figure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_figure_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__FIGURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resizable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResizablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_resizable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_resizable_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__RESIZABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_size_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Placement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPlacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_labelPlacement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_labelPlacement_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__LABEL_PLACEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Font Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelFontStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_labelFontStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_labelFontStyle_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__LABEL_FONT_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_label_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_imagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_imagePath_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__IMAGE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the List Points Polygon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListPointsPolygonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeEClass_listPointsPolygon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeEClass_listPointsPolygon_feature", "_UI_NodeEClass_type"),
				 CevineditPackage.Literals.NODE_ECLASS__LIST_POINTS_POLYGON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NodeEClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeEClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NodeEClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NodeEClass_type") :
			getString("_UI_NodeEClass_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NodeEClass.class)) {
			case CevineditPackage.NODE_ECLASS__BACKGROUND_COLOR:
			case CevineditPackage.NODE_ECLASS__BORDER_COLOR:
			case CevineditPackage.NODE_ECLASS__BORDER_TEXTURE:
			case CevineditPackage.NODE_ECLASS__BORDER_WIDTH:
			case CevineditPackage.NODE_ECLASS__BRIGHTNESS:
			case CevineditPackage.NODE_ECLASS__FIGURE:
			case CevineditPackage.NODE_ECLASS__RESIZABLE:
			case CevineditPackage.NODE_ECLASS__SIZE:
			case CevineditPackage.NODE_ECLASS__LABEL_PLACEMENT:
			case CevineditPackage.NODE_ECLASS__LABEL_FONT_STYLE:
			case CevineditPackage.NODE_ECLASS__LABEL:
			case CevineditPackage.NODE_ECLASS__IMAGE_PATH:
			case CevineditPackage.NODE_ECLASS__LIST_POINTS_POLYGON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

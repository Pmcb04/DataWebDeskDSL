/**
 */
package dataWebDeskDSL.provider;


import dataWebDeskDSL.DataWebDeskDSLFactory;
import dataWebDeskDSL.DataWebDeskDSLPackage;
import dataWebDeskDSL.Page;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dataWebDeskDSL.Page} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PageItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageItemProvider(AdapterFactory adapterFactory) {
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

			addPagesReferencesPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addMannagmentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pages References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPagesReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_pagesReferences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_pagesReferences_feature", "_UI_Page_type"),
				 DataWebDeskDSLPackage.Literals.PAGE__PAGES_REFERENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_title_feature", "_UI_Page_type"),
				 DataWebDeskDSLPackage.Literals.PAGE__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mannagment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMannagmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_mannagment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_mannagment_feature", "_UI_Page_type"),
				 DataWebDeskDSLPackage.Literals.PAGE__MANNAGMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.PAGE__SOCIAL_MEDIAS);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.PAGE__PAGESEXTERNAL);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.PAGE__MULTIMEDIAS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Page)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_Page_type") :
			getString("_UI_Page_type") + " " + label;
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

		switch (notification.getFeatureID(Page.class)) {
			case DataWebDeskDSLPackage.PAGE__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataWebDeskDSLPackage.PAGE__SOCIAL_MEDIAS:
			case DataWebDeskDSLPackage.PAGE__PAGESEXTERNAL:
			case DataWebDeskDSLPackage.PAGE__MULTIMEDIAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.PAGE__SOCIAL_MEDIAS,
				 DataWebDeskDSLFactory.eINSTANCE.createSocialMedia()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.PAGE__PAGESEXTERNAL,
				 DataWebDeskDSLFactory.eINSTANCE.createPageExternal()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.PAGE__MULTIMEDIAS,
				 DataWebDeskDSLFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.PAGE__MULTIMEDIAS,
				 DataWebDeskDSLFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.PAGE__MULTIMEDIAS,
				 DataWebDeskDSLFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.PAGE__MULTIMEDIAS,
				 DataWebDeskDSLFactory.eINSTANCE.createImage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataWebDeskDSLEditPlugin.INSTANCE;
	}

}

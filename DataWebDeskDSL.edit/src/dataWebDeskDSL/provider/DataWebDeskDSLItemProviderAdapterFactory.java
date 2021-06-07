/**
 */
package dataWebDeskDSL.provider;

import dataWebDeskDSL.util.DataWebDeskDSLAdapterFactory;

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
public class DataWebDeskDSLItemProviderAdapterFactory extends DataWebDeskDSLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public DataWebDeskDSLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.Rol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolItemProvider rolItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.Rol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRolAdapter() {
		if (rolItemProvider == null) {
			rolItemProvider = new RolItemProvider(this);
		}

		return rolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.NormalPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalPageItemProvider normalPageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.NormalPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormalPageAdapter() {
		if (normalPageItemProvider == null) {
			normalPageItemProvider = new NormalPageItemProvider(this);
		}

		return normalPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.CreatePage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatePageItemProvider createPageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.CreatePage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreatePageAdapter() {
		if (createPageItemProvider == null) {
			createPageItemProvider = new CreatePageItemProvider(this);
		}

		return createPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.MainPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainPageItemProvider mainPageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.MainPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMainPageAdapter() {
		if (mainPageItemProvider == null) {
			mainPageItemProvider = new MainPageItemProvider(this);
		}

		return mainPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.DetailPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailPageItemProvider detailPageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.DetailPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDetailPageAdapter() {
		if (detailPageItemProvider == null) {
			detailPageItemProvider = new DetailPageItemProvider(this);
		}

		return detailPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.DeletePage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeletePageItemProvider deletePageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.DeletePage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeletePageAdapter() {
		if (deletePageItemProvider == null) {
			deletePageItemProvider = new DeletePageItemProvider(this);
		}

		return deletePageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.CRUDPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRUDPageItemProvider crudPageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.CRUDPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCRUDPageAdapter() {
		if (crudPageItemProvider == null) {
			crudPageItemProvider = new CRUDPageItemProvider(this);
		}

		return crudPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.IndexPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexPageItemProvider indexPageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.IndexPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndexPageAdapter() {
		if (indexPageItemProvider == null) {
			indexPageItemProvider = new IndexPageItemProvider(this);
		}

		return indexPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.SocialMedia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialMediaItemProvider socialMediaItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.SocialMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSocialMediaAdapter() {
		if (socialMediaItemProvider == null) {
			socialMediaItemProvider = new SocialMediaItemProvider(this);
		}

		return socialMediaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.WebSite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteItemProvider webSiteItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.WebSite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebSiteAdapter() {
		if (webSiteItemProvider == null) {
			webSiteItemProvider = new WebSiteItemProvider(this);
		}

		return webSiteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.DataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.PageExternal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageExternalItemProvider pageExternalItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.PageExternal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageExternalAdapter() {
		if (pageExternalItemProvider == null) {
			pageExternalItemProvider = new PageExternalItemProvider(this);
		}

		return pageExternalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.Video} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoItemProvider videoItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.Video}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVideoAdapter() {
		if (videoItemProvider == null) {
			videoItemProvider = new VideoItemProvider(this);
		}

		return videoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.Audio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioItemProvider audioItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.Audio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAudioAdapter() {
		if (audioItemProvider == null) {
			audioItemProvider = new AudioItemProvider(this);
		}

		return audioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataWebDeskDSL.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link dataWebDeskDSL.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
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
		if (rolItemProvider != null) rolItemProvider.dispose();
		if (normalPageItemProvider != null) normalPageItemProvider.dispose();
		if (createPageItemProvider != null) createPageItemProvider.dispose();
		if (mainPageItemProvider != null) mainPageItemProvider.dispose();
		if (detailPageItemProvider != null) detailPageItemProvider.dispose();
		if (deletePageItemProvider != null) deletePageItemProvider.dispose();
		if (crudPageItemProvider != null) crudPageItemProvider.dispose();
		if (indexPageItemProvider != null) indexPageItemProvider.dispose();
		if (socialMediaItemProvider != null) socialMediaItemProvider.dispose();
		if (webSiteItemProvider != null) webSiteItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (dataTypeItemProvider != null) dataTypeItemProvider.dispose();
		if (pageExternalItemProvider != null) pageExternalItemProvider.dispose();
		if (textItemProvider != null) textItemProvider.dispose();
		if (videoItemProvider != null) videoItemProvider.dispose();
		if (audioItemProvider != null) audioItemProvider.dispose();
		if (imageItemProvider != null) imageItemProvider.dispose();
	}

}

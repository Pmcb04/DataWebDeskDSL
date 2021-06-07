/**
 */
package dataWebDeskDSL.util;

import dataWebDeskDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public class DataWebDeskDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataWebDeskDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataWebDeskDSLPackage.eINSTANCE;
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
	protected DataWebDeskDSLSwitch<Adapter> modelSwitch =
		new DataWebDeskDSLSwitch<Adapter>() {
			@Override
			public Adapter caseRol(Rol object) {
				return createRolAdapter();
			}
			@Override
			public Adapter caseNormalPage(NormalPage object) {
				return createNormalPageAdapter();
			}
			@Override
			public Adapter caseCreatePage(CreatePage object) {
				return createCreatePageAdapter();
			}
			@Override
			public Adapter caseMainPage(MainPage object) {
				return createMainPageAdapter();
			}
			@Override
			public Adapter caseDetailPage(DetailPage object) {
				return createDetailPageAdapter();
			}
			@Override
			public Adapter caseDeletePage(DeletePage object) {
				return createDeletePageAdapter();
			}
			@Override
			public Adapter caseCRUDPage(CRUDPage object) {
				return createCRUDPageAdapter();
			}
			@Override
			public Adapter caseIndexPage(IndexPage object) {
				return createIndexPageAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseSocialMedia(SocialMedia object) {
				return createSocialMediaAdapter();
			}
			@Override
			public Adapter caseWebSite(WebSite object) {
				return createWebSiteAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter casePageExternal(PageExternal object) {
				return createPageExternalAdapter();
			}
			@Override
			public Adapter caseMultimedia(Multimedia object) {
				return createMultimediaAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseVideo(Video object) {
				return createVideoAdapter();
			}
			@Override
			public Adapter caseAudio(Audio object) {
				return createAudioAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
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
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Rol
	 * @generated
	 */
	public Adapter createRolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.NormalPage <em>Normal Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.NormalPage
	 * @generated
	 */
	public Adapter createNormalPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.CreatePage <em>Create Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.CreatePage
	 * @generated
	 */
	public Adapter createCreatePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.MainPage <em>Main Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.MainPage
	 * @generated
	 */
	public Adapter createMainPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.DetailPage <em>Detail Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.DetailPage
	 * @generated
	 */
	public Adapter createDetailPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.DeletePage <em>Delete Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.DeletePage
	 * @generated
	 */
	public Adapter createDeletePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.CRUDPage <em>CRUD Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.CRUDPage
	 * @generated
	 */
	public Adapter createCRUDPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.IndexPage <em>Index Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.IndexPage
	 * @generated
	 */
	public Adapter createIndexPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.SocialMedia <em>Social Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.SocialMedia
	 * @generated
	 */
	public Adapter createSocialMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.WebSite
	 * @generated
	 */
	public Adapter createWebSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.PageExternal <em>Page External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.PageExternal
	 * @generated
	 */
	public Adapter createPageExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Multimedia <em>Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Multimedia
	 * @generated
	 */
	public Adapter createMultimediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Audio
	 * @generated
	 */
	public Adapter createAudioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataWebDeskDSL.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataWebDeskDSL.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
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

} //DataWebDeskDSLAdapterFactory

/**
 */
package dataWebDeskDSL.impl;

import dataWebDeskDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebDeskDSLFactoryImpl extends EFactoryImpl implements DataWebDeskDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataWebDeskDSLFactory init() {
		try {
			DataWebDeskDSLFactory theDataWebDeskDSLFactory = (DataWebDeskDSLFactory)EPackage.Registry.INSTANCE.getEFactory(DataWebDeskDSLPackage.eNS_URI);
			if (theDataWebDeskDSLFactory != null) {
				return theDataWebDeskDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataWebDeskDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataWebDeskDSLPackage.ROL: return createRol();
			case DataWebDeskDSLPackage.NORMAL_PAGE: return createNormalPage();
			case DataWebDeskDSLPackage.CREATE_PAGE: return createCreatePage();
			case DataWebDeskDSLPackage.MAIN_PAGE: return createMainPage();
			case DataWebDeskDSLPackage.DETAIL_PAGE: return createDetailPage();
			case DataWebDeskDSLPackage.DELETE_PAGE: return createDeletePage();
			case DataWebDeskDSLPackage.CRUD_PAGE: return createCRUDPage();
			case DataWebDeskDSLPackage.INDEX_PAGE: return createIndexPage();
			case DataWebDeskDSLPackage.SOCIAL_MEDIA: return createSocialMedia();
			case DataWebDeskDSLPackage.WEB_SITE: return createWebSite();
			case DataWebDeskDSLPackage.ENTITY: return createEntity();
			case DataWebDeskDSLPackage.ATTRIBUTE: return createAttribute();
			case DataWebDeskDSLPackage.DATA_TYPE: return createDataType();
			case DataWebDeskDSLPackage.PAGE_EXTERNAL: return createPageExternal();
			case DataWebDeskDSLPackage.TEXT: return createText();
			case DataWebDeskDSLPackage.VIDEO: return createVideo();
			case DataWebDeskDSLPackage.AUDIO: return createAudio();
			case DataWebDeskDSLPackage.IMAGE: return createImage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataWebDeskDSLPackage.TYPE_TEXT:
				return createTypeTextFromString(eDataType, initialValue);
			case DataWebDeskDSLPackage.TYPE_AUDIO:
				return createTypeAudioFromString(eDataType, initialValue);
			case DataWebDeskDSLPackage.TYPE_IMAGE:
				return createTypeImageFromString(eDataType, initialValue);
			case DataWebDeskDSLPackage.TYPE_VIDEO:
				return createTypeVideoFromString(eDataType, initialValue);
			case DataWebDeskDSLPackage.TYPE_SOCIAL_MEDIA:
				return createTypeSocialMediaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataWebDeskDSLPackage.TYPE_TEXT:
				return convertTypeTextToString(eDataType, instanceValue);
			case DataWebDeskDSLPackage.TYPE_AUDIO:
				return convertTypeAudioToString(eDataType, instanceValue);
			case DataWebDeskDSLPackage.TYPE_IMAGE:
				return convertTypeImageToString(eDataType, instanceValue);
			case DataWebDeskDSLPackage.TYPE_VIDEO:
				return convertTypeVideoToString(eDataType, instanceValue);
			case DataWebDeskDSLPackage.TYPE_SOCIAL_MEDIA:
				return convertTypeSocialMediaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPage createNormalPage() {
		NormalPageImpl normalPage = new NormalPageImpl();
		return normalPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatePage createCreatePage() {
		CreatePageImpl createPage = new CreatePageImpl();
		return createPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainPage createMainPage() {
		MainPageImpl mainPage = new MainPageImpl();
		return mainPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailPage createDetailPage() {
		DetailPageImpl detailPage = new DetailPageImpl();
		return detailPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePage createDeletePage() {
		DeletePageImpl deletePage = new DeletePageImpl();
		return deletePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDPage createCRUDPage() {
		CRUDPageImpl crudPage = new CRUDPageImpl();
		return crudPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexPage createIndexPage() {
		IndexPageImpl indexPage = new IndexPageImpl();
		return indexPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialMedia createSocialMedia() {
		SocialMediaImpl socialMedia = new SocialMediaImpl();
		return socialMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebSite createWebSite() {
		WebSiteImpl webSite = new WebSiteImpl();
		return webSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageExternal createPageExternal() {
		PageExternalImpl pageExternal = new PageExternalImpl();
		return pageExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeText createTypeTextFromString(EDataType eDataType, String initialValue) {
		TypeText result = TypeText.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAudio createTypeAudioFromString(EDataType eDataType, String initialValue) {
		TypeAudio result = TypeAudio.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAudioToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeImage createTypeImageFromString(EDataType eDataType, String initialValue) {
		TypeImage result = TypeImage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeImageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVideo createTypeVideoFromString(EDataType eDataType, String initialValue) {
		TypeVideo result = TypeVideo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeVideoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSocialMedia createTypeSocialMediaFromString(EDataType eDataType, String initialValue) {
		TypeSocialMedia result = TypeSocialMedia.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSocialMediaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLPackage getDataWebDeskDSLPackage() {
		return (DataWebDeskDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataWebDeskDSLPackage getPackage() {
		return DataWebDeskDSLPackage.eINSTANCE;
	}

} //DataWebDeskDSLFactoryImpl

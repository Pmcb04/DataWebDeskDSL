/**
 */
package dataWebDeskDSL.impl;

import dataWebDeskDSL.Attribute;
import dataWebDeskDSL.Audio;
import dataWebDeskDSL.CRUDPage;
import dataWebDeskDSL.CreatePage;
import dataWebDeskDSL.DataType;
import dataWebDeskDSL.DataWebDeskDSLFactory;
import dataWebDeskDSL.DataWebDeskDSLPackage;
import dataWebDeskDSL.DeletePage;
import dataWebDeskDSL.DetailPage;
import dataWebDeskDSL.Entity;
import dataWebDeskDSL.Image;
import dataWebDeskDSL.IndexPage;
import dataWebDeskDSL.MainPage;
import dataWebDeskDSL.Multimedia;
import dataWebDeskDSL.NormalPage;
import dataWebDeskDSL.Page;
import dataWebDeskDSL.PageExternal;
import dataWebDeskDSL.Rol;
import dataWebDeskDSL.SocialMedia;
import dataWebDeskDSL.Text;
import dataWebDeskDSL.TypeAudio;
import dataWebDeskDSL.TypeImage;
import dataWebDeskDSL.TypeSocialMedia;
import dataWebDeskDSL.TypeText;
import dataWebDeskDSL.TypeVideo;
import dataWebDeskDSL.Video;
import dataWebDeskDSL.WebSite;

import dataWebDeskDSL.util.DataWebDeskDSLValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebDeskDSLPackageImpl extends EPackageImpl implements DataWebDeskDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multimediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTextEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAudioEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeImageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeVideoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSocialMediaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dataWebDeskDSL.DataWebDeskDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataWebDeskDSLPackageImpl() {
		super(eNS_URI, DataWebDeskDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataWebDeskDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataWebDeskDSLPackage init() {
		if (isInited) return (DataWebDeskDSLPackage)EPackage.Registry.INSTANCE.getEPackage(DataWebDeskDSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataWebDeskDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataWebDeskDSLPackageImpl theDataWebDeskDSLPackage = registeredDataWebDeskDSLPackage instanceof DataWebDeskDSLPackageImpl ? (DataWebDeskDSLPackageImpl)registeredDataWebDeskDSLPackage : new DataWebDeskDSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataWebDeskDSLPackage.createPackageContents();

		// Initialize created meta-data
		theDataWebDeskDSLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDataWebDeskDSLPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DataWebDeskDSLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDataWebDeskDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataWebDeskDSLPackage.eNS_URI, theDataWebDeskDSLPackage);
		return theDataWebDeskDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_Name() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Access() {
		return (EReference)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_NumeroPaginasAccesibles() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_NumeroEntidadesAccesibles() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalPage() {
		return normalPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreatePage() {
		return createPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainPage() {
		return mainPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailPage() {
		return detailPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletePage() {
		return deletePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRUDPage() {
		return crudPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRUDPage_Entity() {
		return (EReference)crudPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexPage() {
		return indexPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PagesReferences() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_SocialMedias() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Mannagment() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Pagesexternal() {
		return (EReference)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Multimedias() {
		return (EReference)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialMedia() {
		return socialMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialMedia_Name() {
		return (EAttribute)socialMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialMedia_User() {
		return (EAttribute)socialMediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebSite() {
		return webSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebSite_Pages() {
		return (EReference)webSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebSite_Roles() {
		return (EReference)webSiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebSite_Entities() {
		return (EReference)webSiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebSite_Datatype() {
		return (EReference)webSiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_PaginasMediasAccesibles() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_Name() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_EntitiesReferences() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Primarykey() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Crudpages() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Type() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_MaxValues() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Name() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageExternal() {
		return pageExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageExternal_Url() {
		return (EAttribute)pageExternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageExternal_Name() {
		return (EAttribute)pageExternalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultimedia() {
		return multimediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultimedia_Name() {
		return (EAttribute)multimediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Extension() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Extension() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Extension() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Extension() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeText() {
		return typeTextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAudio() {
		return typeAudioEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeImage() {
		return typeImageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeVideo() {
		return typeVideoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSocialMedia() {
		return typeSocialMediaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLFactory getDataWebDeskDSLFactory() {
		return (DataWebDeskDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rolEClass = createEClass(ROL);
		createEAttribute(rolEClass, ROL__NAME);
		createEReference(rolEClass, ROL__ACCESS);
		createEAttribute(rolEClass, ROL__NUMERO_PAGINAS_ACCESIBLES);
		createEAttribute(rolEClass, ROL__NUMERO_ENTIDADES_ACCESIBLES);

		normalPageEClass = createEClass(NORMAL_PAGE);

		createPageEClass = createEClass(CREATE_PAGE);

		mainPageEClass = createEClass(MAIN_PAGE);

		detailPageEClass = createEClass(DETAIL_PAGE);

		deletePageEClass = createEClass(DELETE_PAGE);

		crudPageEClass = createEClass(CRUD_PAGE);
		createEReference(crudPageEClass, CRUD_PAGE__ENTITY);

		indexPageEClass = createEClass(INDEX_PAGE);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PAGES_REFERENCES);
		createEReference(pageEClass, PAGE__SOCIAL_MEDIAS);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEReference(pageEClass, PAGE__MANNAGMENT);
		createEReference(pageEClass, PAGE__PAGESEXTERNAL);
		createEReference(pageEClass, PAGE__MULTIMEDIAS);

		socialMediaEClass = createEClass(SOCIAL_MEDIA);
		createEAttribute(socialMediaEClass, SOCIAL_MEDIA__NAME);
		createEAttribute(socialMediaEClass, SOCIAL_MEDIA__USER);

		webSiteEClass = createEClass(WEB_SITE);
		createEReference(webSiteEClass, WEB_SITE__PAGES);
		createEReference(webSiteEClass, WEB_SITE__ROLES);
		createEReference(webSiteEClass, WEB_SITE__ENTITIES);
		createEReference(webSiteEClass, WEB_SITE__DATATYPE);
		createEAttribute(webSiteEClass, WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES);
		createEAttribute(webSiteEClass, WEB_SITE__NAME);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__ENTITIES_REFERENCES);
		createEReference(entityEClass, ENTITY__PRIMARYKEY);
		createEReference(entityEClass, ENTITY__CRUDPAGES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__MAX_VALUES);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__NAME);

		pageExternalEClass = createEClass(PAGE_EXTERNAL);
		createEAttribute(pageExternalEClass, PAGE_EXTERNAL__URL);
		createEAttribute(pageExternalEClass, PAGE_EXTERNAL__NAME);

		multimediaEClass = createEClass(MULTIMEDIA);
		createEAttribute(multimediaEClass, MULTIMEDIA__NAME);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__EXTENSION);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__EXTENSION);

		audioEClass = createEClass(AUDIO);
		createEAttribute(audioEClass, AUDIO__EXTENSION);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__EXTENSION);

		// Create enums
		typeTextEEnum = createEEnum(TYPE_TEXT);
		typeAudioEEnum = createEEnum(TYPE_AUDIO);
		typeImageEEnum = createEEnum(TYPE_IMAGE);
		typeVideoEEnum = createEEnum(TYPE_VIDEO);
		typeSocialMediaEEnum = createEEnum(TYPE_SOCIAL_MEDIA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		normalPageEClass.getESuperTypes().add(this.getPage());
		createPageEClass.getESuperTypes().add(this.getCRUDPage());
		mainPageEClass.getESuperTypes().add(this.getPage());
		detailPageEClass.getESuperTypes().add(this.getCRUDPage());
		deletePageEClass.getESuperTypes().add(this.getCRUDPage());
		crudPageEClass.getESuperTypes().add(this.getPage());
		indexPageEClass.getESuperTypes().add(this.getCRUDPage());
		textEClass.getESuperTypes().add(this.getMultimedia());
		videoEClass.getESuperTypes().add(this.getMultimedia());
		audioEClass.getESuperTypes().add(this.getMultimedia());
		imageEClass.getESuperTypes().add(this.getMultimedia());

		// Initialize classes and features; add operations and parameters
		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Access(), this.getPage(), this.getPage_Mannagment(), "access", null, 1, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRol_NumeroPaginasAccesibles(), ecorePackage.getEInt(), "numeroPaginasAccesibles", null, 1, 1, Rol.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRol_NumeroEntidadesAccesibles(), ecorePackage.getEInt(), "numeroEntidadesAccesibles", null, 1, 1, Rol.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(normalPageEClass, NormalPage.class, "NormalPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createPageEClass, CreatePage.class, "CreatePage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainPageEClass, MainPage.class, "MainPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detailPageEClass, DetailPage.class, "DetailPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deletePageEClass, DeletePage.class, "DeletePage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crudPageEClass, CRUDPage.class, "CRUDPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCRUDPage_Entity(), this.getEntity(), this.getEntity_Crudpages(), "entity", null, 1, 1, CRUDPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexPageEClass, IndexPage.class, "IndexPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_PagesReferences(), this.getPage(), null, "pagesReferences", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_SocialMedias(), this.getSocialMedia(), null, "socialMedias", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Mannagment(), this.getRol(), this.getRol_Access(), "mannagment", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Pagesexternal(), this.getPageExternal(), null, "pagesexternal", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Multimedias(), this.getMultimedia(), null, "multimedias", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socialMediaEClass, SocialMedia.class, "SocialMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocialMedia_Name(), this.getTypeSocialMedia(), "name", null, 0, 1, SocialMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocialMedia_User(), ecorePackage.getEString(), "user", null, 0, 1, SocialMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webSiteEClass, WebSite.class, "WebSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebSite_Pages(), this.getPage(), null, "pages", null, 1, -1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebSite_Roles(), this.getRol(), null, "roles", null, 0, -1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebSite_Entities(), this.getEntity(), null, "entities", null, 1, -1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebSite_Datatype(), this.getDataType(), null, "datatype", null, 0, -1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_PaginasMediasAccesibles(), ecorePackage.getEFloat(), "paginasMediasAccesibles", null, 1, 1, WebSite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_Name(), ecorePackage.getEString(), "name", null, 1, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_EntitiesReferences(), this.getEntity(), null, "entitiesReferences", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Primarykey(), this.getAttribute(), null, "primarykey", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Crudpages(), this.getCRUDPage(), this.getCRUDPage_Entity(), "crudpages", null, 1, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Type(), this.getDataType(), null, "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_MaxValues(), ecorePackage.getEInt(), "maxValues", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageExternalEClass, PageExternal.class, "PageExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPageExternal_Url(), ecorePackage.getEString(), "url", null, 0, 1, PageExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageExternal_Name(), ecorePackage.getEString(), "name", null, 0, 1, PageExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multimediaEClass, Multimedia.class, "Multimedia", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultimedia_Name(), ecorePackage.getEString(), "name", null, 0, 1, Multimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Extension(), this.getTypeText(), "extension", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Extension(), this.getTypeVideo(), "extension", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudio_Extension(), this.getTypeAudio(), "extension", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Extension(), this.getTypeImage(), "extension", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeTextEEnum, TypeText.class, "TypeText");
		addEEnumLiteral(typeTextEEnum, TypeText.TXT);
		addEEnumLiteral(typeTextEEnum, TypeText.DOC);
		addEEnumLiteral(typeTextEEnum, TypeText.DOCX);

		initEEnum(typeAudioEEnum, TypeAudio.class, "TypeAudio");
		addEEnumLiteral(typeAudioEEnum, TypeAudio.MP3);
		addEEnumLiteral(typeAudioEEnum, TypeAudio.WAV);
		addEEnumLiteral(typeAudioEEnum, TypeAudio.WMA);

		initEEnum(typeImageEEnum, TypeImage.class, "TypeImage");
		addEEnumLiteral(typeImageEEnum, TypeImage.PNG);
		addEEnumLiteral(typeImageEEnum, TypeImage.JPG);
		addEEnumLiteral(typeImageEEnum, TypeImage.GIF);

		initEEnum(typeVideoEEnum, TypeVideo.class, "TypeVideo");
		addEEnumLiteral(typeVideoEEnum, TypeVideo.MP4);
		addEEnumLiteral(typeVideoEEnum, TypeVideo.AVI);
		addEEnumLiteral(typeVideoEEnum, TypeVideo.MKV);

		initEEnum(typeSocialMediaEEnum, TypeSocialMedia.class, "TypeSocialMedia");
		addEEnumLiteral(typeSocialMediaEEnum, TypeSocialMedia.FACEBOOK);
		addEEnumLiteral(typeSocialMediaEEnum, TypeSocialMedia.TWITTER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// MyDSLDoc
		createMyDSLDocAnnotations();
		// gmf.link
		createGmf_2Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.diagram
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (webSiteEClass,
		   source,
		   new String[] {
			   "constraints", "one_sm one_home no_pages_alone"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "constraints", "no_myself no_other_references no_more_CRUD index_details_together"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (rolEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/rol.svg"
		   });
		addAnnotation
		  (normalPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "border.width", "3",
			   "border.color", "207,89,25",
			   "border.style", "solid"
		   });
		addAnnotation
		  (createPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "border.width", "3",
			   "border.color", "207,204,25",
			   "border.style", "solid"
		   });
		addAnnotation
		  (mainPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "border.width", "3",
			   "border.color", "92,25,207",
			   "border.style", "solid"
		   });
		addAnnotation
		  (detailPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "border.width", "3",
			   "border.color", "25,55,207",
			   "border.style", "solid"
		   });
		addAnnotation
		  (deletePageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "border.width", "3",
			   "border.color", "207,25,25",
			   "border.style", "solid"
		   });
		addAnnotation
		  (crudPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "border.width", "3",
			   "border.color", "207,25,140",
			   "border.style", "solid"
		   });
		addAnnotation
		  (indexPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "border.width", "3",
			   "border.color", "25,207,94",
			   "border.style", "solid"
		   });
		addAnnotation
		  (socialMediaEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/redes-sociales.svg"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "border.width", "3",
			   "border.color", "25,204,207",
			   "border.style", "solid"
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/atributo.svg"
		   });
		addAnnotation
		  (dataTypeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/datatype.svg"
		   });
		addAnnotation
		  (pageExternalEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/url.svg"
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/file.svg"
		   });
		addAnnotation
		  (videoEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/video.svg"
		   });
		addAnnotation
		  (audioEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/audio.svg"
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/DataWebDeskDSL/icons/image.svg"
		   });
	}

	/**
	 * Initializes the annotations for <b>MyDSLDoc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMyDSLDocAnnotations() {
		String source = "MyDSLDoc";
		addAnnotation
		  (rolEClass,
		   source,
		   new String[] {
			   "Name", "Rol",
			   "Description", "Permite diferenciar los distintos tipos de usuarios de la aplicaci\u00f3n. Cada rol debe definir de forma obligatoria el atributo name. Adem\u00e1s debe tener acceso de 1 a m\u00e1s p\u00e1ginas"
		   });
		addAnnotation
		  (getRol_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (getRol_Access(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "*",
			   "Name", "access",
			   "Type", "reference"
		   });
		addAnnotation
		  (normalPageEClass,
		   source,
		   new String[] {
			   "Name", "NormalPage",
			   "Description", "P\u00e1ginas de tipo normal representadas en el modelo. "
		   });
		addAnnotation
		  (createPageEClass,
		   source,
		   new String[] {
			   "Name", "CreatePage",
			   "Description", "P\u00e1ginas de tipo create representadas en el modelo. "
		   });
		addAnnotation
		  (mainPageEClass,
		   source,
		   new String[] {
			   "Name", "MainPage",
			   "Description", "P\u00e1ginas de tipo main representadas en el modelo. "
		   });
		addAnnotation
		  (detailPageEClass,
		   source,
		   new String[] {
			   "Name", "DetailPage",
			   "Description", "P\u00e1ginas de tipo detail representadas en el modelo. "
		   });
		addAnnotation
		  (deletePageEClass,
		   source,
		   new String[] {
			   "Name", "DeletePage",
			   "Description", "P\u00e1ginas de tipo delete representadas en el modelo. "
		   });
		addAnnotation
		  (crudPageEClass,
		   source,
		   new String[] {
			   "Name", "CRUDPage",
			   "Description", "P\u00e1ginas de tipo CRUD representadas en el modelo. Est\u00e1 relacionado con alguna entidad (Entity).  Es superclase de DetailPage, DeletePage, IndexPage y  CreatePage."
		   });
		addAnnotation
		  (getCRUDPage_Entity(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "1",
			   "Name", "entity",
			   "Type", "reference"
		   });
		addAnnotation
		  (indexPageEClass,
		   source,
		   new String[] {
			   "Name", "IndexPage",
			   "Description", "P\u00e1ginas de tipo index representadas en el modelo. "
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "Name", "Page",
			   "Description", "Paginas representadas en el modelo. Cada p\u00e1gina est\u00e1 compuesta de calquier n\u00famero de redes sociales (SocialMedia), p\u00e1ginas externas (PageExternal) y archivos multimedia (Multimedia). Adem\u00e1s debe definir el atributo name y puede tener cualquier n\u00famero de referencias a otras p\u00e1ginas o a ella misma. Es superclase abstracta de MainPage, NormalPage y CRUDPage"
		   });
		addAnnotation
		  (getPage_PagesReferences(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "pagesReferences",
			   "Type", "reference"
		   });
		addAnnotation
		  (getPage_SocialMedias(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "socialMedias",
			   "Type", "composition"
		   });
		addAnnotation
		  (getPage_Title(),
		   source,
		   new String[] {
			   "Name", "title",
			   "Type", "EString"
		   });
		addAnnotation
		  (getPage_Mannagment(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "mannagment",
			   "Type", "reference"
		   });
		addAnnotation
		  (getPage_Pagesexternal(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "pagesexternal",
			   "Type", "reference"
		   });
		addAnnotation
		  (getPage_Multimedias(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "multimedia",
			   "Type", "reference"
		   });
		addAnnotation
		  (socialMediaEClass,
		   source,
		   new String[] {
			   "Name", "Social Media",
			   "Description", "Redes sociales modeladas en el sistema. De forma obligatoria debe definir los atributos user y name."
		   });
		addAnnotation
		  (getSocialMedia_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "TypeSocialMedia",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (getSocialMedia_User(),
		   source,
		   new String[] {
			   "Name", "user",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (webSiteEClass,
		   source,
		   new String[] {
			   "Authors", "Pedro Miguel Carmona Broncano & Rub\u00e9n Mar\u00edn Lucas",
			   "Last Updated", "28/05/2021",
			   "Name", "WebSite",
			   "Description", "Sitio web representado en el modelo. Est\u00e1 compuesto por una o varias entidades (Entity), por una o varias p\u00e1ginas (Page) y por cualquier n\u00famero de p\u00e1ginas (Page), roles (Roles) y tipos de dato (DataType). Define de forma obligatoria el atributo name."
		   });
		addAnnotation
		  (getWebSite_Pages(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "*",
			   "Name", "pages",
			   "Type", "composition"
		   });
		addAnnotation
		  (getWebSite_Roles(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "roles",
			   "Type", "composition"
		   });
		addAnnotation
		  (getWebSite_Entities(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "*",
			   "Name", "entities",
			   "Type", "composition"
		   });
		addAnnotation
		  (getWebSite_Datatype(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "dataType",
			   "Type", "composition"
		   });
		addAnnotation
		  (getWebSite_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "Name", "Entity",
			   "Description", "Represenata a los datos que pueden incluir las distintas p\u00e1ginas. Est\u00e1 relacionada con 1 o m\u00e1s p\u00e1ginas crud, adem\u00e1s de referenciar a cualquier numero de entidades y tener un primary key. Debe definir de forma obligatoria un name. Cada entity est\u00e1 compuesta  por uno o m\u00e1s atributos.  "
		   });
		addAnnotation
		  (getEntity_Attributes(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "*",
			   "Name", "attributes",
			   "Type", "composition"
		   });
		addAnnotation
		  (getEntity_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (getEntity_EntitiesReferences(),
		   source,
		   new String[] {
			   "Upper bound", "0",
			   "Lower bound", "*",
			   "Name", "entitiesReferences",
			   "Type", "reference"
		   });
		addAnnotation
		  (getEntity_Primarykey(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "1",
			   "Name", "primarykey",
			   "Type", "reference"
		   });
		addAnnotation
		  (getEntity_Crudpages(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "*",
			   "Name", "crudpages",
			   "Type", "reference"
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "Name", "Attribute",
			   "Description", "Permite definir los atributos de las entidades. Define de froma obligatoria los atributos name, value y maxvalues. Adem\u00e1s est\u00e1 relacionado con un tipo (type)"
		   });
		addAnnotation
		  (getAttribute_Type(),
		   source,
		   new String[] {
			   "Upper bound", "1",
			   "Lower bound", "1",
			   "Name", "trype",
			   "Type", "reference"
		   });
		addAnnotation
		  (getAttribute_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (getAttribute_Value(),
		   source,
		   new String[] {
			   "Name", "value",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (getAttribute_MaxValues(),
		   source,
		   new String[] {
			   "Name", "maxValues",
			   "Type", "EInt",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (dataTypeEClass,
		   source,
		   new String[] {
			   "Name", "Entity",
			   "Description", "Permite definir el tipo de datos de los atributos. Define de forma obligatoria el atributo name."
		   });
		addAnnotation
		  (getDataType_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (pageExternalEClass,
		   source,
		   new String[] {
			   "Name", "PageExternal",
			   "Description", "P\u00e1ginas externas modeladas en el sistema. De forma obligatoria debe definir los atributos url y name."
		   });
		addAnnotation
		  (getPageExternal_Url(),
		   source,
		   new String[] {
			   "Name", "url",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (getPageExternal_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (multimediaEClass,
		   source,
		   new String[] {
			   "Name", "Multimedia",
			   "Description", "Representa a los distintos datos que pueden contener las p\u00e1ginas. Define de forma obligatoria el atributo name. Es una superclase abstracta de Text, Video, Audio e Image"
		   });
		addAnnotation
		  (getMultimedia_Name(),
		   source,
		   new String[] {
			   "Name", "name",
			   "Type", "EString",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "Name", "Multimedia",
			   "Description", "Elemento de tipo texto representado en el modelo. "
		   });
		addAnnotation
		  (getText_Extension(),
		   source,
		   new String[] {
			   "Name", "extension",
			   "Type", "TypeText",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (videoEClass,
		   source,
		   new String[] {
			   "Name", "Video",
			   "Description", "Elemento de tipo video representado en el modelo."
		   });
		addAnnotation
		  (getVideo_Extension(),
		   source,
		   new String[] {
			   "Name", "extension",
			   "Type", "TypeText",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (audioEClass,
		   source,
		   new String[] {
			   "Name", "Audio",
			   "Description", "Elemento de tipo audio representado en el modelo."
		   });
		addAnnotation
		  (getAudio_Extension(),
		   source,
		   new String[] {
			   "Name", "extension",
			   "Type", "TypeText",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "Name", "Image",
			   "Description", "Elemento de tipo imagen representado en el modelo."
		   });
		addAnnotation
		  (getImage_Extension(),
		   source,
		   new String[] {
			   "Name", "extension",
			   "Type", "TypeText",
			   "Lower bound", "1",
			   "Upper bound", "1"
		   });
		addAnnotation
		  (typeTextEEnum,
		   source,
		   new String[] {
			   "Name", "TypeText",
			   "Description", "Representa el tipo de dato texto en el modelo."
		   });
		addAnnotation
		  (typeTextEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "Name", "txt",
			   "Value", "0"
		   });
		addAnnotation
		  (typeTextEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "Name", "doc",
			   "Value", "1"
		   });
		addAnnotation
		  (typeTextEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "Name", "docx",
			   "Value", "2"
		   });
		addAnnotation
		  (typeAudioEEnum,
		   source,
		   new String[] {
			   "Name", "TypeAudio",
			   "Description", "Representa el tipo de dato audio en el modelo."
		   });
		addAnnotation
		  (typeAudioEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "Name", "mp3",
			   "Value", "0"
		   });
		addAnnotation
		  (typeAudioEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "Name", "wav",
			   "Value", "1"
		   });
		addAnnotation
		  (typeAudioEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "Name", "wma",
			   "Value", "2"
		   });
		addAnnotation
		  (typeImageEEnum,
		   source,
		   new String[] {
			   "Name", "TypeImage",
			   "Description", "Representa el tipo de dato imagen en el modelo."
		   });
		addAnnotation
		  (typeImageEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "Name", "png",
			   "Value", "0"
		   });
		addAnnotation
		  (typeImageEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "Name", "jpg",
			   "Value", "1"
		   });
		addAnnotation
		  (typeImageEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "Name", "gif",
			   "Value", "2"
		   });
		addAnnotation
		  (typeVideoEEnum,
		   source,
		   new String[] {
			   "Name", "TypeVideo",
			   "Description", "Representa el tipo de dato video en el modelo."
		   });
		addAnnotation
		  (typeVideoEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "Name", "mp4",
			   "Value", "0"
		   });
		addAnnotation
		  (typeVideoEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "Name", "avi",
			   "Value", "1"
		   });
		addAnnotation
		  (typeVideoEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "Name", "mkv",
			   "Value", "2"
		   });
		addAnnotation
		  (typeSocialMediaEEnum,
		   source,
		   new String[] {
			   "Name", "TypeVideo",
			   "Description", "Representa el tipo de dato video en el modelo."
		   });
		addAnnotation
		  (typeSocialMediaEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "Name", "facebook",
			   "Value", "0"
		   });
		addAnnotation
		  (typeSocialMediaEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "Name", "twitter",
			   "Value", "1"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getRol_NumeroPaginasAccesibles(),
		   source,
		   new String[] {
			   "derivation", "if (self.access ->oclIsUndefined()) then 0\n\t\t\t\t\telse self.access -> size()\n\t\t\t\t\tendif"
		   });
		addAnnotation
		  (getRol_NumeroEntidadesAccesibles(),
		   source,
		   new String[] {
			   "derivation", "if (self.access->selectByKind(CRUDPage).entity->oclIsUndefined()) then 0\n\t\t\t\t\t\telse self.access->selectByKind(CRUDPage).entity->asSet() -> size()\n\t\t\t\t\t\tendif"
		   });
		addAnnotation
		  (webSiteEClass,
		   source,
		   new String[] {
			   "one_sm", "pages.socialMedias -> size() >= 1",
			   "one_home", "pages->selectByType(MainPage)->select(mannagment->size() = 0) -> size() = 1",
			   "no_pages_alone", "self.roles.access->asSet()->size()+1 = self.pages->size() "
		   });
		addAnnotation
		  (getWebSite_PaginasMediasAccesibles(),
		   source,
		   new String[] {
			   "derivation", "if (self.roles->size() = 0) then 0\n\t\t\t\t\t\t\t else (self.roles.numeroPaginasAccesibles -> sum() / self.roles -> size())\n\t\t\t\t\t\t\t endif"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "no_myself", "entitiesReferences->excludes(self) ",
			   "no_other_references", "entitiesReferences.entitiesReferences->excludes(self) ",
			   "no_more_CRUD", "crudpages->selectByType(CRUDPage)->size() = 1 implies crudpages->size() = 1",
			   "index_details_together", "\n\t\t\t\t\t((crudpages->selectByType(IndexPage)->size() = 1 implies crudpages->selectByType(DetailPage)->size() = 1) \n\t\t\t\t\tand  (crudpages->selectByType(DetailPage)->size() = 1  implies crudpages->selectByType(IndexPage)->size() = 1))"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getRol_Access(),
		   source,
		   new String[] {
			   "source", "access",
			   "target", "mannagment",
			   "style", "dot",
			   "width", "2"
		   });
		addAnnotation
		  (getPage_PagesReferences(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
		addAnnotation
		  (getEntity_EntitiesReferences(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
		addAnnotation
		  (getEntity_Primarykey(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
		addAnnotation
		  (getEntity_Crudpages(),
		   source,
		   new String[] {
			   "source", "crudpages",
			   "target", "entity",
			   "style", "dot",
			   "width", "2"
		   });
		addAnnotation
		  (getAttribute_Type(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getPage_SocialMedias(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getPage_Pagesexternal(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getPage_Multimedias(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getWebSite_Pages(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getWebSite_Roles(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getWebSite_Entities(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getWebSite_Datatype(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getEntity_Attributes(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (webSiteEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
	}

} //DataWebDeskDSLPackageImpl

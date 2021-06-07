/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DataWebDeskDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataWebDeskDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dataWebDeskDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataWebDeskDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataWebDeskDSLPackage eINSTANCE = dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.RolImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Numero Paginas Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NUMERO_PAGINAS_ACCESIBLES = 2;

	/**
	 * The feature id for the '<em><b>Numero Entidades Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NUMERO_ENTIDADES_ACCESIBLES = 3;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.PageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 8;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGES_REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SOCIAL_MEDIAS = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MANNAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGESEXTERNAL = 4;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MULTIMEDIAS = 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.NormalPageImpl <em>Normal Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.NormalPageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getNormalPage()
	 * @generated
	 */
	int NORMAL_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__PAGES_REFERENCES = PAGE__PAGES_REFERENCES;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__SOCIAL_MEDIAS = PAGE__SOCIAL_MEDIAS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__MANNAGMENT = PAGE__MANNAGMENT;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__PAGESEXTERNAL = PAGE__PAGESEXTERNAL;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE__MULTIMEDIAS = PAGE__MULTIMEDIAS;

	/**
	 * The number of structural features of the '<em>Normal Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.CreatePageImpl <em>Create Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.CreatePageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCreatePage()
	 * @generated
	 */
	int CREATE_PAGE = 2;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.MainPageImpl <em>Main Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.MainPageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getMainPage()
	 * @generated
	 */
	int MAIN_PAGE = 3;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.DetailPageImpl <em>Detail Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.DetailPageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDetailPage()
	 * @generated
	 */
	int DETAIL_PAGE = 4;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.DeletePageImpl <em>Delete Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.DeletePageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDeletePage()
	 * @generated
	 */
	int DELETE_PAGE = 5;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.CRUDPageImpl <em>CRUD Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.CRUDPageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCRUDPage()
	 * @generated
	 */
	int CRUD_PAGE = 6;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__PAGES_REFERENCES = PAGE__PAGES_REFERENCES;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__SOCIAL_MEDIAS = PAGE__SOCIAL_MEDIAS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__MANNAGMENT = PAGE__MANNAGMENT;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__PAGESEXTERNAL = PAGE__PAGESEXTERNAL;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__MULTIMEDIAS = PAGE__MULTIMEDIAS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__ENTITY = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CRUD Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__PAGES_REFERENCES = CRUD_PAGE__PAGES_REFERENCES;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__SOCIAL_MEDIAS = CRUD_PAGE__SOCIAL_MEDIAS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__MANNAGMENT = CRUD_PAGE__MANNAGMENT;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__PAGESEXTERNAL = CRUD_PAGE__PAGESEXTERNAL;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__MULTIMEDIAS = CRUD_PAGE__MULTIMEDIAS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Create Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PAGE_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__PAGES_REFERENCES = PAGE__PAGES_REFERENCES;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__SOCIAL_MEDIAS = PAGE__SOCIAL_MEDIAS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__MANNAGMENT = PAGE__MANNAGMENT;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__PAGESEXTERNAL = PAGE__PAGESEXTERNAL;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE__MULTIMEDIAS = PAGE__MULTIMEDIAS;

	/**
	 * The number of structural features of the '<em>Main Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE__PAGES_REFERENCES = CRUD_PAGE__PAGES_REFERENCES;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE__SOCIAL_MEDIAS = CRUD_PAGE__SOCIAL_MEDIAS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE__MANNAGMENT = CRUD_PAGE__MANNAGMENT;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE__PAGESEXTERNAL = CRUD_PAGE__PAGESEXTERNAL;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE__MULTIMEDIAS = CRUD_PAGE__MULTIMEDIAS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Detail Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_PAGE_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__PAGES_REFERENCES = CRUD_PAGE__PAGES_REFERENCES;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__SOCIAL_MEDIAS = CRUD_PAGE__SOCIAL_MEDIAS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__MANNAGMENT = CRUD_PAGE__MANNAGMENT;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__PAGESEXTERNAL = CRUD_PAGE__PAGESEXTERNAL;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__MULTIMEDIAS = CRUD_PAGE__MULTIMEDIAS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Delete Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PAGE_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.IndexPageImpl <em>Index Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.IndexPageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getIndexPage()
	 * @generated
	 */
	int INDEX_PAGE = 7;

	/**
	 * The feature id for the '<em><b>Pages References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__PAGES_REFERENCES = CRUD_PAGE__PAGES_REFERENCES;

	/**
	 * The feature id for the '<em><b>Social Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__SOCIAL_MEDIAS = CRUD_PAGE__SOCIAL_MEDIAS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Mannagment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__MANNAGMENT = CRUD_PAGE__MANNAGMENT;

	/**
	 * The feature id for the '<em><b>Pagesexternal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__PAGESEXTERNAL = CRUD_PAGE__PAGESEXTERNAL;

	/**
	 * The feature id for the '<em><b>Multimedias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__MULTIMEDIAS = CRUD_PAGE__MULTIMEDIAS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Index Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.SocialMediaImpl <em>Social Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.SocialMediaImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getSocialMedia()
	 * @generated
	 */
	int SOCIAL_MEDIA = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA__NAME = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA__USER = 1;

	/**
	 * The number of structural features of the '<em>Social Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.WebSiteImpl <em>Web Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.WebSiteImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getWebSite()
	 * @generated
	 */
	int WEB_SITE = 10;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__DATATYPE = 3;

	/**
	 * The feature id for the '<em><b>Paginas Medias Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.EntityImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Entities References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITIES_REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Primarykey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARYKEY = 3;

	/**
	 * The feature id for the '<em><b>Crudpages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CRUDPAGES = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.AttributeImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAX_VALUES = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.DataTypeImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.PageExternalImpl <em>Page External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.PageExternalImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPageExternal()
	 * @generated
	 */
	int PAGE_EXTERNAL = 14;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EXTERNAL__URL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EXTERNAL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Page External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_EXTERNAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.MultimediaImpl <em>Multimedia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.MultimediaImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getMultimedia()
	 * @generated
	 */
	int MULTIMEDIA = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Multimedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.TextImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = MULTIMEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__EXTENSION = MULTIMEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = MULTIMEDIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.VideoImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = MULTIMEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__EXTENSION = MULTIMEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = MULTIMEDIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.AudioImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__NAME = MULTIMEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__EXTENSION = MULTIMEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = MULTIMEDIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.impl.ImageImpl
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = MULTIMEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__EXTENSION = MULTIMEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = MULTIMEDIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.TypeText <em>Type Text</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.TypeText
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeText()
	 * @generated
	 */
	int TYPE_TEXT = 20;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.TypeAudio <em>Type Audio</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.TypeAudio
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeAudio()
	 * @generated
	 */
	int TYPE_AUDIO = 21;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.TypeImage <em>Type Image</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.TypeImage
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeImage()
	 * @generated
	 */
	int TYPE_IMAGE = 22;

	/**
	 * The meta object id for the '{@link dataWebDeskDSL.TypeVideo <em>Type Video</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.TypeVideo
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeVideo()
	 * @generated
	 */
	int TYPE_VIDEO = 23;


	/**
	 * The meta object id for the '{@link dataWebDeskDSL.TypeSocialMedia <em>Type Social Media</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWebDeskDSL.TypeSocialMedia
	 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeSocialMedia()
	 * @generated
	 */
	int TYPE_SOCIAL_MEDIA = 24;


	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see dataWebDeskDSL.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Rol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.Rol#getName()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_Name();

	/**
	 * Returns the meta object for the reference list '{@link dataWebDeskDSL.Rol#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access</em>'.
	 * @see dataWebDeskDSL.Rol#getAccess()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Access();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Rol#getNumeroPaginasAccesibles <em>Numero Paginas Accesibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Paginas Accesibles</em>'.
	 * @see dataWebDeskDSL.Rol#getNumeroPaginasAccesibles()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_NumeroPaginasAccesibles();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Rol#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Entidades Accesibles</em>'.
	 * @see dataWebDeskDSL.Rol#getNumeroEntidadesAccesibles()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_NumeroEntidadesAccesibles();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.NormalPage <em>Normal Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Page</em>'.
	 * @see dataWebDeskDSL.NormalPage
	 * @generated
	 */
	EClass getNormalPage();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.CreatePage <em>Create Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Page</em>'.
	 * @see dataWebDeskDSL.CreatePage
	 * @generated
	 */
	EClass getCreatePage();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.MainPage <em>Main Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Page</em>'.
	 * @see dataWebDeskDSL.MainPage
	 * @generated
	 */
	EClass getMainPage();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.DetailPage <em>Detail Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail Page</em>'.
	 * @see dataWebDeskDSL.DetailPage
	 * @generated
	 */
	EClass getDetailPage();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.DeletePage <em>Delete Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Page</em>'.
	 * @see dataWebDeskDSL.DeletePage
	 * @generated
	 */
	EClass getDeletePage();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.CRUDPage <em>CRUD Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRUD Page</em>'.
	 * @see dataWebDeskDSL.CRUDPage
	 * @generated
	 */
	EClass getCRUDPage();

	/**
	 * Returns the meta object for the reference '{@link dataWebDeskDSL.CRUDPage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see dataWebDeskDSL.CRUDPage#getEntity()
	 * @see #getCRUDPage()
	 * @generated
	 */
	EReference getCRUDPage_Entity();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.IndexPage <em>Index Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Page</em>'.
	 * @see dataWebDeskDSL.IndexPage
	 * @generated
	 */
	EClass getIndexPage();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see dataWebDeskDSL.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference list '{@link dataWebDeskDSL.Page#getPagesReferences <em>Pages References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pages References</em>'.
	 * @see dataWebDeskDSL.Page#getPagesReferences()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PagesReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.Page#getSocialMedias <em>Social Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Social Medias</em>'.
	 * @see dataWebDeskDSL.Page#getSocialMedias()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_SocialMedias();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dataWebDeskDSL.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the reference list '{@link dataWebDeskDSL.Page#getMannagment <em>Mannagment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mannagment</em>'.
	 * @see dataWebDeskDSL.Page#getMannagment()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Mannagment();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.Page#getPagesexternal <em>Pagesexternal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagesexternal</em>'.
	 * @see dataWebDeskDSL.Page#getPagesexternal()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pagesexternal();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.Page#getMultimedias <em>Multimedias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multimedias</em>'.
	 * @see dataWebDeskDSL.Page#getMultimedias()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Multimedias();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.SocialMedia <em>Social Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Media</em>'.
	 * @see dataWebDeskDSL.SocialMedia
	 * @generated
	 */
	EClass getSocialMedia();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.SocialMedia#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.SocialMedia#getName()
	 * @see #getSocialMedia()
	 * @generated
	 */
	EAttribute getSocialMedia_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.SocialMedia#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see dataWebDeskDSL.SocialMedia#getUser()
	 * @see #getSocialMedia()
	 * @generated
	 */
	EAttribute getSocialMedia_User();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site</em>'.
	 * @see dataWebDeskDSL.WebSite
	 * @generated
	 */
	EClass getWebSite();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.WebSite#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see dataWebDeskDSL.WebSite#getPages()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.WebSite#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see dataWebDeskDSL.WebSite#getRoles()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.WebSite#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see dataWebDeskDSL.WebSite#getEntities()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.WebSite#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see dataWebDeskDSL.WebSite#getDatatype()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.WebSite#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paginas Medias Accesibles</em>'.
	 * @see dataWebDeskDSL.WebSite#getPaginasMediasAccesibles()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_PaginasMediasAccesibles();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.WebSite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.WebSite#getName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_Name();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see dataWebDeskDSL.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWebDeskDSL.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see dataWebDeskDSL.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the reference list '{@link dataWebDeskDSL.Entity#getEntitiesReferences <em>Entities References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities References</em>'.
	 * @see dataWebDeskDSL.Entity#getEntitiesReferences()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntitiesReferences();

	/**
	 * Returns the meta object for the reference '{@link dataWebDeskDSL.Entity#getPrimarykey <em>Primarykey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primarykey</em>'.
	 * @see dataWebDeskDSL.Entity#getPrimarykey()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Primarykey();

	/**
	 * Returns the meta object for the reference list '{@link dataWebDeskDSL.Entity#getCrudpages <em>Crudpages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crudpages</em>'.
	 * @see dataWebDeskDSL.Entity#getCrudpages()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Crudpages();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dataWebDeskDSL.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link dataWebDeskDSL.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see dataWebDeskDSL.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dataWebDeskDSL.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Attribute#getMaxValues <em>Max Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Values</em>'.
	 * @see dataWebDeskDSL.Attribute#getMaxValues()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MaxValues();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see dataWebDeskDSL.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.PageExternal <em>Page External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page External</em>'.
	 * @see dataWebDeskDSL.PageExternal
	 * @generated
	 */
	EClass getPageExternal();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.PageExternal#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see dataWebDeskDSL.PageExternal#getUrl()
	 * @see #getPageExternal()
	 * @generated
	 */
	EAttribute getPageExternal_Url();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.PageExternal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.PageExternal#getName()
	 * @see #getPageExternal()
	 * @generated
	 */
	EAttribute getPageExternal_Name();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Multimedia <em>Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multimedia</em>'.
	 * @see dataWebDeskDSL.Multimedia
	 * @generated
	 */
	EClass getMultimedia();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Multimedia#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWebDeskDSL.Multimedia#getName()
	 * @see #getMultimedia()
	 * @generated
	 */
	EAttribute getMultimedia_Name();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see dataWebDeskDSL.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Text#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see dataWebDeskDSL.Text#getExtension()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Extension();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see dataWebDeskDSL.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Video#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see dataWebDeskDSL.Video#getExtension()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Extension();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see dataWebDeskDSL.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Audio#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see dataWebDeskDSL.Audio#getExtension()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Extension();

	/**
	 * Returns the meta object for class '{@link dataWebDeskDSL.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see dataWebDeskDSL.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link dataWebDeskDSL.Image#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see dataWebDeskDSL.Image#getExtension()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Extension();

	/**
	 * Returns the meta object for enum '{@link dataWebDeskDSL.TypeText <em>Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Text</em>'.
	 * @see dataWebDeskDSL.TypeText
	 * @generated
	 */
	EEnum getTypeText();

	/**
	 * Returns the meta object for enum '{@link dataWebDeskDSL.TypeAudio <em>Type Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Audio</em>'.
	 * @see dataWebDeskDSL.TypeAudio
	 * @generated
	 */
	EEnum getTypeAudio();

	/**
	 * Returns the meta object for enum '{@link dataWebDeskDSL.TypeImage <em>Type Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Image</em>'.
	 * @see dataWebDeskDSL.TypeImage
	 * @generated
	 */
	EEnum getTypeImage();

	/**
	 * Returns the meta object for enum '{@link dataWebDeskDSL.TypeVideo <em>Type Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Video</em>'.
	 * @see dataWebDeskDSL.TypeVideo
	 * @generated
	 */
	EEnum getTypeVideo();

	/**
	 * Returns the meta object for enum '{@link dataWebDeskDSL.TypeSocialMedia <em>Type Social Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Social Media</em>'.
	 * @see dataWebDeskDSL.TypeSocialMedia
	 * @generated
	 */
	EEnum getTypeSocialMedia();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataWebDeskDSLFactory getDataWebDeskDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.RolImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NAME = eINSTANCE.getRol_Name();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ACCESS = eINSTANCE.getRol_Access();

		/**
		 * The meta object literal for the '<em><b>Numero Paginas Accesibles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NUMERO_PAGINAS_ACCESIBLES = eINSTANCE.getRol_NumeroPaginasAccesibles();

		/**
		 * The meta object literal for the '<em><b>Numero Entidades Accesibles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NUMERO_ENTIDADES_ACCESIBLES = eINSTANCE.getRol_NumeroEntidadesAccesibles();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.NormalPageImpl <em>Normal Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.NormalPageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getNormalPage()
		 * @generated
		 */
		EClass NORMAL_PAGE = eINSTANCE.getNormalPage();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.CreatePageImpl <em>Create Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.CreatePageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCreatePage()
		 * @generated
		 */
		EClass CREATE_PAGE = eINSTANCE.getCreatePage();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.MainPageImpl <em>Main Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.MainPageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getMainPage()
		 * @generated
		 */
		EClass MAIN_PAGE = eINSTANCE.getMainPage();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.DetailPageImpl <em>Detail Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.DetailPageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDetailPage()
		 * @generated
		 */
		EClass DETAIL_PAGE = eINSTANCE.getDetailPage();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.DeletePageImpl <em>Delete Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.DeletePageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDeletePage()
		 * @generated
		 */
		EClass DELETE_PAGE = eINSTANCE.getDeletePage();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.CRUDPageImpl <em>CRUD Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.CRUDPageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCRUDPage()
		 * @generated
		 */
		EClass CRUD_PAGE = eINSTANCE.getCRUDPage();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_PAGE__ENTITY = eINSTANCE.getCRUDPage_Entity();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.IndexPageImpl <em>Index Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.IndexPageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getIndexPage()
		 * @generated
		 */
		EClass INDEX_PAGE = eINSTANCE.getIndexPage();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.PageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Pages References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGES_REFERENCES = eINSTANCE.getPage_PagesReferences();

		/**
		 * The meta object literal for the '<em><b>Social Medias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SOCIAL_MEDIAS = eINSTANCE.getPage_SocialMedias();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Mannagment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__MANNAGMENT = eINSTANCE.getPage_Mannagment();

		/**
		 * The meta object literal for the '<em><b>Pagesexternal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGESEXTERNAL = eINSTANCE.getPage_Pagesexternal();

		/**
		 * The meta object literal for the '<em><b>Multimedias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__MULTIMEDIAS = eINSTANCE.getPage_Multimedias();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.SocialMediaImpl <em>Social Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.SocialMediaImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getSocialMedia()
		 * @generated
		 */
		EClass SOCIAL_MEDIA = eINSTANCE.getSocialMedia();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_MEDIA__NAME = eINSTANCE.getSocialMedia_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_MEDIA__USER = eINSTANCE.getSocialMedia_User();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.WebSiteImpl <em>Web Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.WebSiteImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getWebSite()
		 * @generated
		 */
		EClass WEB_SITE = eINSTANCE.getWebSite();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__PAGES = eINSTANCE.getWebSite_Pages();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__ROLES = eINSTANCE.getWebSite_Roles();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__ENTITIES = eINSTANCE.getWebSite_Entities();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__DATATYPE = eINSTANCE.getWebSite_Datatype();

		/**
		 * The meta object literal for the '<em><b>Paginas Medias Accesibles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__PAGINAS_MEDIAS_ACCESIBLES = eINSTANCE.getWebSite_PaginasMediasAccesibles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__NAME = eINSTANCE.getWebSite_Name();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.EntityImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Entities References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITIES_REFERENCES = eINSTANCE.getEntity_EntitiesReferences();

		/**
		 * The meta object literal for the '<em><b>Primarykey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PRIMARYKEY = eINSTANCE.getEntity_Primarykey();

		/**
		 * The meta object literal for the '<em><b>Crudpages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CRUDPAGES = eINSTANCE.getEntity_Crudpages();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.AttributeImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Max Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MAX_VALUES = eINSTANCE.getAttribute_MaxValues();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.DataTypeImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.PageExternalImpl <em>Page External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.PageExternalImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPageExternal()
		 * @generated
		 */
		EClass PAGE_EXTERNAL = eINSTANCE.getPageExternal();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_EXTERNAL__URL = eINSTANCE.getPageExternal_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_EXTERNAL__NAME = eINSTANCE.getPageExternal_Name();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.MultimediaImpl <em>Multimedia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.MultimediaImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getMultimedia()
		 * @generated
		 */
		EClass MULTIMEDIA = eINSTANCE.getMultimedia();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIMEDIA__NAME = eINSTANCE.getMultimedia_Name();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.TextImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__EXTENSION = eINSTANCE.getText_Extension();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.VideoImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__EXTENSION = eINSTANCE.getVideo_Extension();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.AudioImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__EXTENSION = eINSTANCE.getAudio_Extension();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.impl.ImageImpl
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__EXTENSION = eINSTANCE.getImage_Extension();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.TypeText <em>Type Text</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.TypeText
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeText()
		 * @generated
		 */
		EEnum TYPE_TEXT = eINSTANCE.getTypeText();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.TypeAudio <em>Type Audio</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.TypeAudio
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeAudio()
		 * @generated
		 */
		EEnum TYPE_AUDIO = eINSTANCE.getTypeAudio();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.TypeImage <em>Type Image</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.TypeImage
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeImage()
		 * @generated
		 */
		EEnum TYPE_IMAGE = eINSTANCE.getTypeImage();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.TypeVideo <em>Type Video</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.TypeVideo
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeVideo()
		 * @generated
		 */
		EEnum TYPE_VIDEO = eINSTANCE.getTypeVideo();

		/**
		 * The meta object literal for the '{@link dataWebDeskDSL.TypeSocialMedia <em>Type Social Media</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWebDeskDSL.TypeSocialMedia
		 * @see dataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTypeSocialMedia()
		 * @generated
		 */
		EEnum TYPE_SOCIAL_MEDIA = eINSTANCE.getTypeSocialMedia();

	}

} //DataWebDeskDSLPackage

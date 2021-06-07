/**
 */
package dataWebDeskDSL.util;

import dataWebDeskDSL.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public class DataWebDeskDSLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DataWebDeskDSLValidator INSTANCE = new DataWebDeskDSLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dataWebDeskDSL";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DataWebDeskDSLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DataWebDeskDSLPackage.ROL:
				return validateRol((Rol)value, diagnostics, context);
			case DataWebDeskDSLPackage.NORMAL_PAGE:
				return validateNormalPage((NormalPage)value, diagnostics, context);
			case DataWebDeskDSLPackage.CREATE_PAGE:
				return validateCreatePage((CreatePage)value, diagnostics, context);
			case DataWebDeskDSLPackage.MAIN_PAGE:
				return validateMainPage((MainPage)value, diagnostics, context);
			case DataWebDeskDSLPackage.DETAIL_PAGE:
				return validateDetailPage((DetailPage)value, diagnostics, context);
			case DataWebDeskDSLPackage.DELETE_PAGE:
				return validateDeletePage((DeletePage)value, diagnostics, context);
			case DataWebDeskDSLPackage.CRUD_PAGE:
				return validateCRUDPage((CRUDPage)value, diagnostics, context);
			case DataWebDeskDSLPackage.INDEX_PAGE:
				return validateIndexPage((IndexPage)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case DataWebDeskDSLPackage.SOCIAL_MEDIA:
				return validateSocialMedia((SocialMedia)value, diagnostics, context);
			case DataWebDeskDSLPackage.WEB_SITE:
				return validateWebSite((WebSite)value, diagnostics, context);
			case DataWebDeskDSLPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case DataWebDeskDSLPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case DataWebDeskDSLPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAGE_EXTERNAL:
				return validatePageExternal((PageExternal)value, diagnostics, context);
			case DataWebDeskDSLPackage.MULTIMEDIA:
				return validateMultimedia((Multimedia)value, diagnostics, context);
			case DataWebDeskDSLPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case DataWebDeskDSLPackage.VIDEO:
				return validateVideo((Video)value, diagnostics, context);
			case DataWebDeskDSLPackage.AUDIO:
				return validateAudio((Audio)value, diagnostics, context);
			case DataWebDeskDSLPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case DataWebDeskDSLPackage.TYPE_TEXT:
				return validateTypeText((TypeText)value, diagnostics, context);
			case DataWebDeskDSLPackage.TYPE_AUDIO:
				return validateTypeAudio((TypeAudio)value, diagnostics, context);
			case DataWebDeskDSLPackage.TYPE_IMAGE:
				return validateTypeImage((TypeImage)value, diagnostics, context);
			case DataWebDeskDSLPackage.TYPE_VIDEO:
				return validateTypeVideo((TypeVideo)value, diagnostics, context);
			case DataWebDeskDSLPackage.TYPE_SOCIAL_MEDIA:
				return validateTypeSocialMedia((TypeSocialMedia)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRol(Rol rol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalPage(NormalPage normalPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normalPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreatePage(CreatePage createPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainPage(MainPage mainPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailPage(DetailPage detailPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detailPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeletePage(DeletePage deletePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deletePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUDPage(CRUDPage crudPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crudPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexPage(IndexPage indexPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialMedia(SocialMedia socialMedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(socialMedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebSite(WebSite webSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webSite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebSite_one_sm(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebSite_one_home(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebSite_no_pages_alone(webSite, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the one_sm constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_SITE__ONE_SM__EEXPRESSION = "pages.socialMedias -> size() >= 1";

	/**
	 * Validates the one_sm constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebSite_one_sm(WebSite webSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.WEB_SITE,
				 webSite,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "one_sm",
				 WEB_SITE__ONE_SM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_home constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_SITE__ONE_HOME__EEXPRESSION = "pages->selectByType(MainPage)->select(mannagment->size() = 0) -> size() = 1";

	/**
	 * Validates the one_home constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebSite_one_home(WebSite webSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.WEB_SITE,
				 webSite,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "one_home",
				 WEB_SITE__ONE_HOME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_pages_alone constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_SITE__NO_PAGES_ALONE__EEXPRESSION = "self.roles.access->asSet()->size()+1 = self.pages->size() ";

	/**
	 * Validates the no_pages_alone constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebSite_no_pages_alone(WebSite webSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.WEB_SITE,
				 webSite,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_pages_alone",
				 WEB_SITE__NO_PAGES_ALONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_no_myself(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_no_other_references(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_no_more_CRUD(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_index_details_together(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_myself constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NO_MYSELF__EEXPRESSION = "entitiesReferences->excludes(self) ";

	/**
	 * Validates the no_myself constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_no_myself(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_myself",
				 ENTITY__NO_MYSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_other_references constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NO_OTHER_REFERENCES__EEXPRESSION = "entitiesReferences.entitiesReferences->excludes(self) ";

	/**
	 * Validates the no_other_references constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_no_other_references(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_other_references",
				 ENTITY__NO_OTHER_REFERENCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_more_CRUD constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NO_MORE_CRUD__EEXPRESSION = "crudpages->selectByType(CRUDPage)->size() = 1 implies crudpages->size() = 1";

	/**
	 * Validates the no_more_CRUD constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_no_more_CRUD(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_more_CRUD",
				 ENTITY__NO_MORE_CRUD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the index_details_together constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__INDEX_DETAILS_TOGETHER__EEXPRESSION = "\n" +
		"\t\t\t\t\t((crudpages->selectByType(IndexPage)->size() = 1 implies crudpages->selectByType(DetailPage)->size() = 1) \n" +
		"\t\t\t\t\tand  (crudpages->selectByType(DetailPage)->size() = 1  implies crudpages->selectByType(IndexPage)->size() = 1))";

	/**
	 * Validates the index_details_together constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_index_details_together(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "index_details_together",
				 ENTITY__INDEX_DETAILS_TOGETHER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageExternal(PageExternal pageExternal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageExternal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultimedia(Multimedia multimedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multimedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideo(Video video, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(video, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudio(Audio audio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(audio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeText(TypeText typeText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAudio(TypeAudio typeAudio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeImage(TypeImage typeImage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeVideo(TypeVideo typeVideo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeSocialMedia(TypeSocialMedia typeSocialMedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DataWebDeskDSLValidator

/**
 */
package dataWebDeskDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public interface DataWebDeskDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataWebDeskDSLFactory eINSTANCE = dataWebDeskDSL.impl.DataWebDeskDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol</em>'.
	 * @generated
	 */
	Rol createRol();

	/**
	 * Returns a new object of class '<em>Normal Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Page</em>'.
	 * @generated
	 */
	NormalPage createNormalPage();

	/**
	 * Returns a new object of class '<em>Create Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Page</em>'.
	 * @generated
	 */
	CreatePage createCreatePage();

	/**
	 * Returns a new object of class '<em>Main Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Page</em>'.
	 * @generated
	 */
	MainPage createMainPage();

	/**
	 * Returns a new object of class '<em>Detail Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detail Page</em>'.
	 * @generated
	 */
	DetailPage createDetailPage();

	/**
	 * Returns a new object of class '<em>Delete Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Page</em>'.
	 * @generated
	 */
	DeletePage createDeletePage();

	/**
	 * Returns a new object of class '<em>CRUD Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRUD Page</em>'.
	 * @generated
	 */
	CRUDPage createCRUDPage();

	/**
	 * Returns a new object of class '<em>Index Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Page</em>'.
	 * @generated
	 */
	IndexPage createIndexPage();

	/**
	 * Returns a new object of class '<em>Social Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Media</em>'.
	 * @generated
	 */
	SocialMedia createSocialMedia();

	/**
	 * Returns a new object of class '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site</em>'.
	 * @generated
	 */
	WebSite createWebSite();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Page External</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page External</em>'.
	 * @generated
	 */
	PageExternal createPageExternal();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns a new object of class '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio</em>'.
	 * @generated
	 */
	Audio createAudio();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataWebDeskDSLPackage getDataWebDeskDSLPackage();

} //DataWebDeskDSLFactory

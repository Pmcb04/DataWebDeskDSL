/**
 */
package dataWebDeskDSL.tests;

import dataWebDeskDSL.CreatePage;
import dataWebDeskDSL.DataWebDeskDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreatePageTest extends CRUDPageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreatePageTest.class);
	}

	/**
	 * Constructs a new Create Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatePageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreatePage getFixture() {
		return (CreatePage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createCreatePage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CreatePageTest

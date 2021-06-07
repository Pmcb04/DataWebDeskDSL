/**
 */
package dataWebDeskDSL.tests;

import dataWebDeskDSL.CRUDPage;
import dataWebDeskDSL.DataWebDeskDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CRUD Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CRUDPageTest extends PageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CRUDPageTest.class);
	}

	/**
	 * Constructs a new CRUD Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CRUD Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CRUDPage getFixture() {
		return (CRUDPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createCRUDPage());
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

} //CRUDPageTest

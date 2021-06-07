/**
 */
package dataWebDeskDSL.tests;

import dataWebDeskDSL.DataWebDeskDSLFactory;
import dataWebDeskDSL.DetailPage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Detail Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailPageTest extends CRUDPageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DetailPageTest.class);
	}

	/**
	 * Constructs a new Detail Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Detail Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DetailPage getFixture() {
		return (DetailPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createDetailPage());
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

} //DetailPageTest

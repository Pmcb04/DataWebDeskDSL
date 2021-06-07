/**
 */
package dataWebDeskDSL.tests;

import dataWebDeskDSL.DataWebDeskDSLFactory;
import dataWebDeskDSL.IndexPage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Index Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexPageTest extends CRUDPageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndexPageTest.class);
	}

	/**
	 * Constructs a new Index Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Index Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndexPage getFixture() {
		return (IndexPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createIndexPage());
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

} //IndexPageTest

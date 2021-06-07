/**
 */
package dataWebDeskDSL.tests;

import dataWebDeskDSL.DataWebDeskDSLFactory;
import dataWebDeskDSL.DeletePage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delete Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeletePageTest extends CRUDPageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeletePageTest.class);
	}

	/**
	 * Constructs a new Delete Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delete Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeletePage getFixture() {
		return (DeletePage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createDeletePage());
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

} //DeletePageTest

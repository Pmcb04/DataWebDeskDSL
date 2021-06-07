/**
 */
package dataWebDeskDSL.tests;

import dataWebDeskDSL.DataWebDeskDSLFactory;
import dataWebDeskDSL.SocialMedia;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Social Media</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialMediaTest extends TestCase {

	/**
	 * The fixture for this Social Media test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialMedia fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SocialMediaTest.class);
	}

	/**
	 * Constructs a new Social Media test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialMediaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Social Media test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SocialMedia fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Social Media test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialMedia getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createSocialMedia());
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

} //SocialMediaTest

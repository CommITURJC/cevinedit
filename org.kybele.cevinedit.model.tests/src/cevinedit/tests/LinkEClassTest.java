/**
 */
package cevinedit.tests;

import cevinedit.CevineditFactory;
import cevinedit.LinkEClass;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link EClass</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkEClassTest extends PersonalizedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkEClassTest.class);
	}

	/**
	 * Constructs a new Link EClass test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link EClass test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkEClass getFixture() {
		return (LinkEClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CevineditFactory.eINSTANCE.createLinkEClass());
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

} //LinkEClassTest

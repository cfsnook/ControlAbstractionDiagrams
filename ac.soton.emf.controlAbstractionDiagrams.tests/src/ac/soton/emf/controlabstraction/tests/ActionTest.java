/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction.tests;

import ac.soton.emf.controlabstraction.Action;
import ac.soton.emf.controlabstraction.ControlabstractionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionTest extends AbstractNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionTest.class);
	}

	/**
	 * Constructs a new Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Action getFixture() {
		return (Action)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ControlabstractionFactory.eINSTANCE.createAction());
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

} //ActionTest

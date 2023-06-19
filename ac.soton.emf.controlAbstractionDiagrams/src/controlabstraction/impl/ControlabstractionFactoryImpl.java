/**
 */
package controlabstraction.impl;

import controlabstraction.AbstractNamedElement;
import controlabstraction.AbstractStatefulEntity;
import controlabstraction.Action;
import controlabstraction.Actor;
import controlabstraction.Agent;
import controlabstraction.Assumption;
import controlabstraction.Component;
import controlabstraction.ControlabstractionFactory;
import controlabstraction.ControlabstractionPackage;
import controlabstraction.ErrorType;
import controlabstraction.Failure;
import controlabstraction.State;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlabstractionFactoryImpl extends EFactoryImpl implements ControlabstractionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlabstractionFactory init() {
		try {
			ControlabstractionFactory theControlabstractionFactory = (ControlabstractionFactory)EPackage.Registry.INSTANCE.getEFactory(ControlabstractionPackage.eNS_URI);
			if (theControlabstractionFactory != null) {
				return theControlabstractionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlabstractionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlabstractionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ControlabstractionPackage.COMPONENT: return createComponent();
			case ControlabstractionPackage.AGENT: return createAgent();
			case ControlabstractionPackage.ASSUMPTION: return createAssumption();
			case ControlabstractionPackage.ACTION: return createAction();
			case ControlabstractionPackage.STATE: return createState();
			case ControlabstractionPackage.ABSTRACT_STATEFUL_ENTITY: return createAbstractStatefulEntity();
			case ControlabstractionPackage.ABSTRACT_NAMED_ELEMENT: return createAbstractNamedElement();
			case ControlabstractionPackage.ACTOR: return createActor();
			case ControlabstractionPackage.ERROR: return createError();
			case ControlabstractionPackage.FAILURE: return createFailure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ControlabstractionPackage.ERROR_TYPE:
				return createErrorTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ControlabstractionPackage.ERROR_TYPE:
				return convertErrorTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatefulEntity createAbstractStatefulEntity() {
		AbstractStatefulEntityImpl abstractStatefulEntity = new AbstractStatefulEntityImpl();
		return abstractStatefulEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNamedElement createAbstractNamedElement() {
		AbstractNamedElementImpl abstractNamedElement = new AbstractNamedElementImpl();
		return abstractNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public controlabstraction.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure createFailure() {
		FailureImpl failure = new FailureImpl();
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorTypeFromString(EDataType eDataType, String initialValue) {
		ErrorType result = ErrorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlabstractionPackage getControlabstractionPackage() {
		return (ControlabstractionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControlabstractionPackage getPackage() {
		return ControlabstractionPackage.eINSTANCE;
	}

} //ControlabstractionFactoryImpl
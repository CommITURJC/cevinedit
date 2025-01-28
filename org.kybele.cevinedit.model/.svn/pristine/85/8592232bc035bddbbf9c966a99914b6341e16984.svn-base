/**
 */
package cevinedit.impl;

import cevinedit.CevineditPackage;
import cevinedit.Diagram;
import cevinedit.PersonalizedElement;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cevinedit.impl.DiagramImpl#getContainsElem <em>Contains Elem</em>}</li>
 *   <li>{@link cevinedit.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link cevinedit.impl.DiagramImpl#getModelExtension <em>Model Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends EObjectImpl implements Diagram {
	/**
	 * The cached value of the '{@link #getContainsElem() <em>Contains Elem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsElem()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalizedElement> containsElem;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelExtension() <em>Model Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelExtension() <em>Model Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelExtension()
	 * @generated
	 * @ordered
	 */
	protected String modelExtension = MODEL_EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CevineditPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonalizedElement> getContainsElem() {
		if (containsElem == null) {
			containsElem = new EObjectContainmentEList<PersonalizedElement>(PersonalizedElement.class, this, CevineditPackage.DIAGRAM__CONTAINS_ELEM);
		}
		return containsElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelExtension() {
		return modelExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelExtension(String newModelExtension) {
		String oldModelExtension = modelExtension;
		modelExtension = newModelExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.DIAGRAM__MODEL_EXTENSION, oldModelExtension, modelExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CevineditPackage.DIAGRAM__CONTAINS_ELEM:
				return ((InternalEList<?>)getContainsElem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CevineditPackage.DIAGRAM__CONTAINS_ELEM:
				return getContainsElem();
			case CevineditPackage.DIAGRAM__NAME:
				return getName();
			case CevineditPackage.DIAGRAM__MODEL_EXTENSION:
				return getModelExtension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CevineditPackage.DIAGRAM__CONTAINS_ELEM:
				getContainsElem().clear();
				getContainsElem().addAll((Collection<? extends PersonalizedElement>)newValue);
				return;
			case CevineditPackage.DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case CevineditPackage.DIAGRAM__MODEL_EXTENSION:
				setModelExtension((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CevineditPackage.DIAGRAM__CONTAINS_ELEM:
				getContainsElem().clear();
				return;
			case CevineditPackage.DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CevineditPackage.DIAGRAM__MODEL_EXTENSION:
				setModelExtension(MODEL_EXTENSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CevineditPackage.DIAGRAM__CONTAINS_ELEM:
				return containsElem != null && !containsElem.isEmpty();
			case CevineditPackage.DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CevineditPackage.DIAGRAM__MODEL_EXTENSION:
				return MODEL_EXTENSION_EDEFAULT == null ? modelExtension != null : !MODEL_EXTENSION_EDEFAULT.equals(modelExtension);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", modelExtension: ");
		result.append(modelExtension);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl

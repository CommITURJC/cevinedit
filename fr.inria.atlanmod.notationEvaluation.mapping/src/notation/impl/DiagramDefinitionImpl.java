/**
 */
package notation.impl;

import java.util.Collection;

import notation.AudienceType;
import notation.DiagramDefinition;
import notation.DiagramElement;
import notation.NotationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.DiagramDefinitionImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link notation.impl.DiagramDefinitionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link notation.impl.DiagramDefinitionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link notation.impl.DiagramDefinitionImpl#isAllowChunks <em>Allow Chunks</em>}</li>
 *   <li>{@link notation.impl.DiagramDefinitionImpl#getTargetedAudience <em>Targeted Audience</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramDefinitionImpl extends MinimalEObjectImpl.Container implements DiagramDefinition {
	/**
	 * The default value of the '{@link #getLegend() <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected static final String LEGEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegend() <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected String legend = LEGEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElement> elements;

	/**
	 * The default value of the '{@link #isAllowChunks() <em>Allow Chunks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowChunks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_CHUNKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowChunks() <em>Allow Chunks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowChunks()
	 * @generated
	 * @ordered
	 */
	protected boolean allowChunks = ALLOW_CHUNKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetedAudience() <em>Targeted Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedAudience()
	 * @generated
	 * @ordered
	 */
	protected static final AudienceType TARGETED_AUDIENCE_EDEFAULT = AudienceType.EXPERT;

	/**
	 * The cached value of the '{@link #getTargetedAudience() <em>Targeted Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedAudience()
	 * @generated
	 * @ordered
	 */
	protected AudienceType targetedAudience = TARGETED_AUDIENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DIAGRAM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLegend() {
		return legend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegend(String newLegend) {
		String oldLegend = legend;
		legend = newLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_DEFINITION__LEGEND, oldLegend, legend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_DEFINITION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, NotationPackage.DIAGRAM_DEFINITION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowChunks() {
		return allowChunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowChunks(boolean newAllowChunks) {
		boolean oldAllowChunks = allowChunks;
		allowChunks = newAllowChunks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_DEFINITION__ALLOW_CHUNKS, oldAllowChunks, allowChunks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudienceType getTargetedAudience() {
		return targetedAudience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetedAudience(AudienceType newTargetedAudience) {
		AudienceType oldTargetedAudience = targetedAudience;
		targetedAudience = newTargetedAudience == null ? TARGETED_AUDIENCE_EDEFAULT : newTargetedAudience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.DIAGRAM_DEFINITION__TARGETED_AUDIENCE, oldTargetedAudience, targetedAudience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NotationPackage.DIAGRAM_DEFINITION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case NotationPackage.DIAGRAM_DEFINITION__LEGEND:
				return getLegend();
			case NotationPackage.DIAGRAM_DEFINITION__LEVEL:
				return getLevel();
			case NotationPackage.DIAGRAM_DEFINITION__ELEMENTS:
				return getElements();
			case NotationPackage.DIAGRAM_DEFINITION__ALLOW_CHUNKS:
				return isAllowChunks();
			case NotationPackage.DIAGRAM_DEFINITION__TARGETED_AUDIENCE:
				return getTargetedAudience();
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
			case NotationPackage.DIAGRAM_DEFINITION__LEGEND:
				setLegend((String)newValue);
				return;
			case NotationPackage.DIAGRAM_DEFINITION__LEVEL:
				setLevel((Integer)newValue);
				return;
			case NotationPackage.DIAGRAM_DEFINITION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends DiagramElement>)newValue);
				return;
			case NotationPackage.DIAGRAM_DEFINITION__ALLOW_CHUNKS:
				setAllowChunks((Boolean)newValue);
				return;
			case NotationPackage.DIAGRAM_DEFINITION__TARGETED_AUDIENCE:
				setTargetedAudience((AudienceType)newValue);
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
			case NotationPackage.DIAGRAM_DEFINITION__LEGEND:
				setLegend(LEGEND_EDEFAULT);
				return;
			case NotationPackage.DIAGRAM_DEFINITION__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case NotationPackage.DIAGRAM_DEFINITION__ELEMENTS:
				getElements().clear();
				return;
			case NotationPackage.DIAGRAM_DEFINITION__ALLOW_CHUNKS:
				setAllowChunks(ALLOW_CHUNKS_EDEFAULT);
				return;
			case NotationPackage.DIAGRAM_DEFINITION__TARGETED_AUDIENCE:
				setTargetedAudience(TARGETED_AUDIENCE_EDEFAULT);
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
			case NotationPackage.DIAGRAM_DEFINITION__LEGEND:
				return LEGEND_EDEFAULT == null ? legend != null : !LEGEND_EDEFAULT.equals(legend);
			case NotationPackage.DIAGRAM_DEFINITION__LEVEL:
				return level != LEVEL_EDEFAULT;
			case NotationPackage.DIAGRAM_DEFINITION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case NotationPackage.DIAGRAM_DEFINITION__ALLOW_CHUNKS:
				return allowChunks != ALLOW_CHUNKS_EDEFAULT;
			case NotationPackage.DIAGRAM_DEFINITION__TARGETED_AUDIENCE:
				return targetedAudience != TARGETED_AUDIENCE_EDEFAULT;
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
		result.append(" (Legend: ");
		result.append(legend);
		result.append(", Level: ");
		result.append(level);
		result.append(", allowChunks: ");
		result.append(allowChunks);
		result.append(", targetedAudience: ");
		result.append(targetedAudience);
		result.append(')');
		return result.toString();
	}

} //DiagramDefinitionImpl

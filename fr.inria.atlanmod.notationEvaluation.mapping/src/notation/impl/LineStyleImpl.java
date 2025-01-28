/**
 */
package notation.impl;

import notation.Color;
import notation.LineStyle;
import notation.LineTextureType;
import notation.NotationPackage;
import notation.Orientation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.LineStyleImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link notation.impl.LineStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link notation.impl.LineStyleImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link notation.impl.LineStyleImpl#getLength <em>Length</em>}</li>
 *   <li>{@link notation.impl.LineStyleImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link notation.impl.LineStyleImpl#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineStyleImpl extends StyleImpl implements LineStyle {
	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float THICKNESS_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected float thickness = THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final int BRIGHTNESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected int brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected static final LineTextureType TEXTURE_EDEFAULT = LineTextureType.INVISIBLE;

	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected LineTextureType texture = TEXTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.LINE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(float newThickness) {
		float oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_STYLE__THICKNESS, oldThickness, thickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_STYLE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_STYLE__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_STYLE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(int newBrightness) {
		int oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_STYLE__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTextureType getTexture() {
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexture(LineTextureType newTexture) {
		LineTextureType oldTexture = texture;
		texture = newTexture == null ? TEXTURE_EDEFAULT : newTexture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.LINE_STYLE__TEXTURE, oldTexture, texture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.LINE_STYLE__THICKNESS:
				return getThickness();
			case NotationPackage.LINE_STYLE__COLOR:
				return getColor();
			case NotationPackage.LINE_STYLE__ORIENTATION:
				return getOrientation();
			case NotationPackage.LINE_STYLE__LENGTH:
				return getLength();
			case NotationPackage.LINE_STYLE__BRIGHTNESS:
				return getBrightness();
			case NotationPackage.LINE_STYLE__TEXTURE:
				return getTexture();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.LINE_STYLE__THICKNESS:
				setThickness((Float)newValue);
				return;
			case NotationPackage.LINE_STYLE__COLOR:
				setColor((Color)newValue);
				return;
			case NotationPackage.LINE_STYLE__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case NotationPackage.LINE_STYLE__LENGTH:
				setLength((Float)newValue);
				return;
			case NotationPackage.LINE_STYLE__BRIGHTNESS:
				setBrightness((Integer)newValue);
				return;
			case NotationPackage.LINE_STYLE__TEXTURE:
				setTexture((LineTextureType)newValue);
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
			case NotationPackage.LINE_STYLE__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case NotationPackage.LINE_STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case NotationPackage.LINE_STYLE__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case NotationPackage.LINE_STYLE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case NotationPackage.LINE_STYLE__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
				return;
			case NotationPackage.LINE_STYLE__TEXTURE:
				setTexture(TEXTURE_EDEFAULT);
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
			case NotationPackage.LINE_STYLE__THICKNESS:
				return thickness != THICKNESS_EDEFAULT;
			case NotationPackage.LINE_STYLE__COLOR:
				return color != COLOR_EDEFAULT;
			case NotationPackage.LINE_STYLE__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case NotationPackage.LINE_STYLE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case NotationPackage.LINE_STYLE__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
			case NotationPackage.LINE_STYLE__TEXTURE:
				return texture != TEXTURE_EDEFAULT;
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
		result.append(" (thickness: ");
		result.append(thickness);
		result.append(", color: ");
		result.append(color);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", length: ");
		result.append(length);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(", texture: ");
		result.append(texture);
		result.append(')');
		return result.toString();
	}

} //LineStyleImpl

/**
 */
package notation.impl;

import notation.Color;
import notation.FigureStyle;
import notation.FillTextureType;
import notation.NotationPackage;
import notation.Orientation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.FigureStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link notation.impl.FigureStyleImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link notation.impl.FigureStyleImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link notation.impl.FigureStyleImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link notation.impl.FigureStyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link notation.impl.FigureStyleImpl#getFillTexture <em>Fill Texture</em>}</li>
 *   <li>{@link notation.impl.FigureStyleImpl#getFillOrientation <em>Fill Orientation</em>}</li>
 *   <li>{@link notation.impl.FigureStyleImpl#getFillTextureColor <em>Fill Texture Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureStyleImpl extends StyleImpl implements FigureStyle {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color FILL_COLOR_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected Color fillColor = FILL_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillTexture() <em>Fill Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillTexture()
	 * @generated
	 * @ordered
	 */
	protected static final FillTextureType FILL_TEXTURE_EDEFAULT = FillTextureType.NONE;

	/**
	 * The cached value of the '{@link #getFillTexture() <em>Fill Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillTexture()
	 * @generated
	 * @ordered
	 */
	protected FillTextureType fillTexture = FILL_TEXTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillOrientation() <em>Fill Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation FILL_ORIENTATION_EDEFAULT = Orientation.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getFillOrientation() <em>Fill Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation fillOrientation = FILL_ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillTextureColor() <em>Fill Texture Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillTextureColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color FILL_TEXTURE_COLOR_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getFillTextureColor() <em>Fill Texture Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillTextureColor()
	 * @generated
	 * @ordered
	 */
	protected Color fillTextureColor = FILL_TEXTURE_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.FIGURE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__ORIENTATION, oldOrientation, orientation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(Color newFillColor) {
		Color oldFillColor = fillColor;
		fillColor = newFillColor == null ? FILL_COLOR_EDEFAULT : newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__FILL_COLOR, oldFillColor, fillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillTextureType getFillTexture() {
		return fillTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillTexture(FillTextureType newFillTexture) {
		FillTextureType oldFillTexture = fillTexture;
		fillTexture = newFillTexture == null ? FILL_TEXTURE_EDEFAULT : newFillTexture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__FILL_TEXTURE, oldFillTexture, fillTexture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getFillOrientation() {
		return fillOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillOrientation(Orientation newFillOrientation) {
		Orientation oldFillOrientation = fillOrientation;
		fillOrientation = newFillOrientation == null ? FILL_ORIENTATION_EDEFAULT : newFillOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__FILL_ORIENTATION, oldFillOrientation, fillOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getFillTextureColor() {
		return fillTextureColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillTextureColor(Color newFillTextureColor) {
		Color oldFillTextureColor = fillTextureColor;
		fillTextureColor = newFillTextureColor == null ? FILL_TEXTURE_COLOR_EDEFAULT : newFillTextureColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FIGURE_STYLE__FILL_TEXTURE_COLOR, oldFillTextureColor, fillTextureColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.FIGURE_STYLE__WIDTH:
				return getWidth();
			case NotationPackage.FIGURE_STYLE__HEIGHT:
				return getHeight();
			case NotationPackage.FIGURE_STYLE__ORIENTATION:
				return getOrientation();
			case NotationPackage.FIGURE_STYLE__BRIGHTNESS:
				return getBrightness();
			case NotationPackage.FIGURE_STYLE__FILL_COLOR:
				return getFillColor();
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE:
				return getFillTexture();
			case NotationPackage.FIGURE_STYLE__FILL_ORIENTATION:
				return getFillOrientation();
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE_COLOR:
				return getFillTextureColor();
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
			case NotationPackage.FIGURE_STYLE__WIDTH:
				setWidth((Float)newValue);
				return;
			case NotationPackage.FIGURE_STYLE__HEIGHT:
				setHeight((Float)newValue);
				return;
			case NotationPackage.FIGURE_STYLE__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case NotationPackage.FIGURE_STYLE__BRIGHTNESS:
				setBrightness((Integer)newValue);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_COLOR:
				setFillColor((Color)newValue);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE:
				setFillTexture((FillTextureType)newValue);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_ORIENTATION:
				setFillOrientation((Orientation)newValue);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE_COLOR:
				setFillTextureColor((Color)newValue);
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
			case NotationPackage.FIGURE_STYLE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case NotationPackage.FIGURE_STYLE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case NotationPackage.FIGURE_STYLE__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case NotationPackage.FIGURE_STYLE__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE:
				setFillTexture(FILL_TEXTURE_EDEFAULT);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_ORIENTATION:
				setFillOrientation(FILL_ORIENTATION_EDEFAULT);
				return;
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE_COLOR:
				setFillTextureColor(FILL_TEXTURE_COLOR_EDEFAULT);
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
			case NotationPackage.FIGURE_STYLE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case NotationPackage.FIGURE_STYLE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case NotationPackage.FIGURE_STYLE__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case NotationPackage.FIGURE_STYLE__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
			case NotationPackage.FIGURE_STYLE__FILL_COLOR:
				return fillColor != FILL_COLOR_EDEFAULT;
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE:
				return fillTexture != FILL_TEXTURE_EDEFAULT;
			case NotationPackage.FIGURE_STYLE__FILL_ORIENTATION:
				return fillOrientation != FILL_ORIENTATION_EDEFAULT;
			case NotationPackage.FIGURE_STYLE__FILL_TEXTURE_COLOR:
				return fillTextureColor != FILL_TEXTURE_COLOR_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(", fillColor: ");
		result.append(fillColor);
		result.append(", fillTexture: ");
		result.append(fillTexture);
		result.append(", fillOrientation: ");
		result.append(fillOrientation);
		result.append(", fillTextureColor: ");
		result.append(fillTextureColor);
		result.append(')');
		return result.toString();
	}

} //FigureStyleImpl

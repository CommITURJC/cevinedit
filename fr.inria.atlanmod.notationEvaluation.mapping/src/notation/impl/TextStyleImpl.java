/**
 */
package notation.impl;

import notation.Color;
import notation.NotationPackage;
import notation.TextStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link notation.impl.TextStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link notation.impl.TextStyleImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link notation.impl.TextStyleImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link notation.impl.TextStyleImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link notation.impl.TextStyleImpl#isUnderlined <em>Underlined</em>}</li>
 *   <li>{@link notation.impl.TextStyleImpl#getFontColor <em>Font Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextStyleImpl extends StyleImpl implements TextStyle {
	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_SIZE_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected int fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = "Times";

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean italic = ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderlined() <em>Underlined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderlined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderlined() <em>Underlined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderlined()
	 * @generated
	 * @ordered
	 */
	protected boolean underlined = UNDERLINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color FONT_COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected Color fontColor = FONT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotationPackage.Literals.TEXT_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(int newFontSize) {
		int oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TEXT_STYLE__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TEXT_STYLE__FONT_NAME, oldFontName, fontName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TEXT_STYLE__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TEXT_STYLE__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderlined() {
		return underlined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderlined(boolean newUnderlined) {
		boolean oldUnderlined = underlined;
		underlined = newUnderlined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TEXT_STYLE__UNDERLINED, oldUnderlined, underlined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontColor(Color newFontColor) {
		Color oldFontColor = fontColor;
		fontColor = newFontColor == null ? FONT_COLOR_EDEFAULT : newFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.TEXT_STYLE__FONT_COLOR, oldFontColor, fontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.TEXT_STYLE__FONT_SIZE:
				return getFontSize();
			case NotationPackage.TEXT_STYLE__FONT_NAME:
				return getFontName();
			case NotationPackage.TEXT_STYLE__BOLD:
				return isBold();
			case NotationPackage.TEXT_STYLE__ITALIC:
				return isItalic();
			case NotationPackage.TEXT_STYLE__UNDERLINED:
				return isUnderlined();
			case NotationPackage.TEXT_STYLE__FONT_COLOR:
				return getFontColor();
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
			case NotationPackage.TEXT_STYLE__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case NotationPackage.TEXT_STYLE__FONT_NAME:
				setFontName((String)newValue);
				return;
			case NotationPackage.TEXT_STYLE__BOLD:
				setBold((Boolean)newValue);
				return;
			case NotationPackage.TEXT_STYLE__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case NotationPackage.TEXT_STYLE__UNDERLINED:
				setUnderlined((Boolean)newValue);
				return;
			case NotationPackage.TEXT_STYLE__FONT_COLOR:
				setFontColor((Color)newValue);
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
			case NotationPackage.TEXT_STYLE__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case NotationPackage.TEXT_STYLE__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case NotationPackage.TEXT_STYLE__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case NotationPackage.TEXT_STYLE__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case NotationPackage.TEXT_STYLE__UNDERLINED:
				setUnderlined(UNDERLINED_EDEFAULT);
				return;
			case NotationPackage.TEXT_STYLE__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
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
			case NotationPackage.TEXT_STYLE__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case NotationPackage.TEXT_STYLE__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case NotationPackage.TEXT_STYLE__BOLD:
				return bold != BOLD_EDEFAULT;
			case NotationPackage.TEXT_STYLE__ITALIC:
				return italic != ITALIC_EDEFAULT;
			case NotationPackage.TEXT_STYLE__UNDERLINED:
				return underlined != UNDERLINED_EDEFAULT;
			case NotationPackage.TEXT_STYLE__FONT_COLOR:
				return fontColor != FONT_COLOR_EDEFAULT;
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
		result.append(" (fontSize: ");
		result.append(fontSize);
		result.append(", fontName: ");
		result.append(fontName);
		result.append(", bold: ");
		result.append(bold);
		result.append(", italic: ");
		result.append(italic);
		result.append(", underlined: ");
		result.append(underlined);
		result.append(", fontColor: ");
		result.append(fontColor);
		result.append(')');
		return result.toString();
	}

} //TextStyleImpl

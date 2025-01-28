/**
 */
package cevinedit.impl;

import cevinedit.Brightness;
import cevinedit.CevineditPackage;
import cevinedit.Color;
import cevinedit.FontStyle;
import cevinedit.NodeEClass;
import cevinedit.NodeFigure;
import cevinedit.Placement;
import cevinedit.Texture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getBorderTexture <em>Border Texture</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#isResizable <em>Resizable</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getSize <em>Size</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getLabelPlacement <em>Label Placement</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getLabelFontStyle <em>Label Font Style</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link cevinedit.impl.NodeEClassImpl#getListPointsPolygon <em>List Points Polygon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeEClassImpl extends PersonalizedElementImpl implements NodeEClass {
	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color BACKGROUND_COLOR_EDEFAULT = Color.DEFAULT;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color BORDER_COLOR_EDEFAULT = Color.DEFAULT;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected Color borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderTexture() <em>Border Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderTexture()
	 * @generated
	 * @ordered
	 */
	protected static final Texture BORDER_TEXTURE_EDEFAULT = Texture.DEFAULT;

	/**
	 * The cached value of the '{@link #getBorderTexture() <em>Border Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderTexture()
	 * @generated
	 * @ordered
	 */
	protected Texture borderTexture = BORDER_TEXTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected int borderWidth = BORDER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final Brightness BRIGHTNESS_EDEFAULT = Brightness.DEFAULT;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected Brightness brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFigure() <em>Figure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected static final NodeFigure FIGURE_EDEFAULT = NodeFigure.DEFAULT;

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected NodeFigure figure = FIGURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResizable() <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizable()
	 * @generated
	 * @ordered
	 */
	protected boolean resizable = RESIZABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelPlacement() <em>Label Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final Placement LABEL_PLACEMENT_EDEFAULT = Placement.EXTERNAL;

	/**
	 * The cached value of the '{@link #getLabelPlacement() <em>Label Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPlacement()
	 * @generated
	 * @ordered
	 */
	protected Placement labelPlacement = LABEL_PLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelFontStyle() <em>Label Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle LABEL_FONT_STYLE_EDEFAULT = FontStyle.DEFAULT;

	/**
	 * The cached value of the '{@link #getLabelFontStyle() <em>Label Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFontStyle()
	 * @generated
	 * @ordered
	 */
	protected FontStyle labelFontStyle = LABEL_FONT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected String imagePath = IMAGE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getListPointsPolygon() <em>List Points Polygon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPointsPolygon()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_POINTS_POLYGON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListPointsPolygon() <em>List Points Polygon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPointsPolygon()
	 * @generated
	 * @ordered
	 */
	protected String listPointsPolygon = LIST_POINTS_POLYGON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CevineditPackage.Literals.NODE_ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(Color newBorderColor) {
		Color oldBorderColor = borderColor;
		borderColor = newBorderColor == null ? BORDER_COLOR_EDEFAULT : newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texture getBorderTexture() {
		return borderTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderTexture(Texture newBorderTexture) {
		Texture oldBorderTexture = borderTexture;
		borderTexture = newBorderTexture == null ? BORDER_TEXTURE_EDEFAULT : newBorderTexture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__BORDER_TEXTURE, oldBorderTexture, borderTexture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderWidth(int newBorderWidth) {
		int oldBorderWidth = borderWidth;
		borderWidth = newBorderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brightness getBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(Brightness newBrightness) {
		Brightness oldBrightness = brightness;
		brightness = newBrightness == null ? BRIGHTNESS_EDEFAULT : newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFigure getFigure() {
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigure(NodeFigure newFigure) {
		NodeFigure oldFigure = figure;
		figure = newFigure == null ? FIGURE_EDEFAULT : newFigure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__FIGURE, oldFigure, figure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResizable() {
		return resizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizable(boolean newResizable) {
		boolean oldResizable = resizable;
		resizable = newResizable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__RESIZABLE, oldResizable, resizable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placement getLabelPlacement() {
		return labelPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelPlacement(Placement newLabelPlacement) {
		Placement oldLabelPlacement = labelPlacement;
		labelPlacement = newLabelPlacement == null ? LABEL_PLACEMENT_EDEFAULT : newLabelPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__LABEL_PLACEMENT, oldLabelPlacement, labelPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getLabelFontStyle() {
		return labelFontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFontStyle(FontStyle newLabelFontStyle) {
		FontStyle oldLabelFontStyle = labelFontStyle;
		labelFontStyle = newLabelFontStyle == null ? LABEL_FONT_STYLE_EDEFAULT : newLabelFontStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__LABEL_FONT_STYLE, oldLabelFontStyle, labelFontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListPointsPolygon() {
		return listPointsPolygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListPointsPolygon(String newListPointsPolygon) {
		String oldListPointsPolygon = listPointsPolygon;
		listPointsPolygon = newListPointsPolygon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.NODE_ECLASS__LIST_POINTS_POLYGON, oldListPointsPolygon, listPointsPolygon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CevineditPackage.NODE_ECLASS__BACKGROUND_COLOR:
				return getBackgroundColor();
			case CevineditPackage.NODE_ECLASS__BORDER_COLOR:
				return getBorderColor();
			case CevineditPackage.NODE_ECLASS__BORDER_TEXTURE:
				return getBorderTexture();
			case CevineditPackage.NODE_ECLASS__BORDER_WIDTH:
				return getBorderWidth();
			case CevineditPackage.NODE_ECLASS__BRIGHTNESS:
				return getBrightness();
			case CevineditPackage.NODE_ECLASS__FIGURE:
				return getFigure();
			case CevineditPackage.NODE_ECLASS__RESIZABLE:
				return isResizable();
			case CevineditPackage.NODE_ECLASS__SIZE:
				return getSize();
			case CevineditPackage.NODE_ECLASS__LABEL_PLACEMENT:
				return getLabelPlacement();
			case CevineditPackage.NODE_ECLASS__LABEL_FONT_STYLE:
				return getLabelFontStyle();
			case CevineditPackage.NODE_ECLASS__LABEL:
				return getLabel();
			case CevineditPackage.NODE_ECLASS__IMAGE_PATH:
				return getImagePath();
			case CevineditPackage.NODE_ECLASS__LIST_POINTS_POLYGON:
				return getListPointsPolygon();
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
			case CevineditPackage.NODE_ECLASS__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__BORDER_COLOR:
				setBorderColor((Color)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__BORDER_TEXTURE:
				setBorderTexture((Texture)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__BRIGHTNESS:
				setBrightness((Brightness)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__FIGURE:
				setFigure((NodeFigure)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__RESIZABLE:
				setResizable((Boolean)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__SIZE:
				setSize((String)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__LABEL_PLACEMENT:
				setLabelPlacement((Placement)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__LABEL_FONT_STYLE:
				setLabelFontStyle((FontStyle)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__LABEL:
				setLabel((String)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case CevineditPackage.NODE_ECLASS__LIST_POINTS_POLYGON:
				setListPointsPolygon((String)newValue);
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
			case CevineditPackage.NODE_ECLASS__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__BORDER_TEXTURE:
				setBorderTexture(BORDER_TEXTURE_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__FIGURE:
				setFigure(FIGURE_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__RESIZABLE:
				setResizable(RESIZABLE_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__LABEL_PLACEMENT:
				setLabelPlacement(LABEL_PLACEMENT_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__LABEL_FONT_STYLE:
				setLabelFontStyle(LABEL_FONT_STYLE_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case CevineditPackage.NODE_ECLASS__LIST_POINTS_POLYGON:
				setListPointsPolygon(LIST_POINTS_POLYGON_EDEFAULT);
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
			case CevineditPackage.NODE_ECLASS__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__BORDER_COLOR:
				return borderColor != BORDER_COLOR_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__BORDER_TEXTURE:
				return borderTexture != BORDER_TEXTURE_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__BORDER_WIDTH:
				return borderWidth != BORDER_WIDTH_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__FIGURE:
				return figure != FIGURE_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__RESIZABLE:
				return resizable != RESIZABLE_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case CevineditPackage.NODE_ECLASS__LABEL_PLACEMENT:
				return labelPlacement != LABEL_PLACEMENT_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__LABEL_FONT_STYLE:
				return labelFontStyle != LABEL_FONT_STYLE_EDEFAULT;
			case CevineditPackage.NODE_ECLASS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CevineditPackage.NODE_ECLASS__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case CevineditPackage.NODE_ECLASS__LIST_POINTS_POLYGON:
				return LIST_POINTS_POLYGON_EDEFAULT == null ? listPointsPolygon != null : !LIST_POINTS_POLYGON_EDEFAULT.equals(listPointsPolygon);
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
		result.append(" (backgroundColor: ");
		result.append(backgroundColor);
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(", borderTexture: ");
		result.append(borderTexture);
		result.append(", borderWidth: ");
		result.append(borderWidth);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(", figure: ");
		result.append(figure);
		result.append(", resizable: ");
		result.append(resizable);
		result.append(", size: ");
		result.append(size);
		result.append(", labelPlacement: ");
		result.append(labelPlacement);
		result.append(", labelFontStyle: ");
		result.append(labelFontStyle);
		result.append(", label: ");
		result.append(label);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(", listPointsPolygon: ");
		result.append(listPointsPolygon);
		result.append(')');
		return result.toString();
	}

} //NodeEClassImpl

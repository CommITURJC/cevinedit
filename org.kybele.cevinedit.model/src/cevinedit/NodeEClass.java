/**
 */
package cevinedit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cevinedit.NodeEClass#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getBorderTexture <em>Border Texture</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getFigure <em>Figure</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#isResizable <em>Resizable</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getSize <em>Size</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getLabelPlacement <em>Label Placement</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getLabelFontStyle <em>Label Font Style</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getLabel <em>Label</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link cevinedit.NodeEClass#getListPointsPolygon <em>List Points Polygon</em>}</li>
 * </ul>
 * </p>
 *
 * @see cevinedit.CevineditPackage#getNodeEClass()
 * @model
 * @generated
 */
public interface NodeEClass extends PersonalizedElement {
	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The literals are from the enumeration {@link cevinedit.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see cevinedit.Color
	 * @see #setBackgroundColor(Color)
	 * @see cevinedit.CevineditPackage#getNodeEClass_BackgroundColor()
	 * @model
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see cevinedit.Color
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * The literals are from the enumeration {@link cevinedit.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see cevinedit.Color
	 * @see #setBorderColor(Color)
	 * @see cevinedit.CevineditPackage#getNodeEClass_BorderColor()
	 * @model
	 * @generated
	 */
	Color getBorderColor();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see cevinedit.Color
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(Color value);

	/**
	 * Returns the value of the '<em><b>Border Texture</b></em>' attribute.
	 * The literals are from the enumeration {@link cevinedit.Texture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Texture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Texture</em>' attribute.
	 * @see cevinedit.Texture
	 * @see #setBorderTexture(Texture)
	 * @see cevinedit.CevineditPackage#getNodeEClass_BorderTexture()
	 * @model
	 * @generated
	 */
	Texture getBorderTexture();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getBorderTexture <em>Border Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Texture</em>' attribute.
	 * @see cevinedit.Texture
	 * @see #getBorderTexture()
	 * @generated
	 */
	void setBorderTexture(Texture value);

	/**
	 * Returns the value of the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(int)
	 * @see cevinedit.CevineditPackage#getNodeEClass_BorderWidth()
	 * @model
	 * @generated
	 */
	int getBorderWidth();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(int value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * The literals are from the enumeration {@link cevinedit.Brightness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see cevinedit.Brightness
	 * @see #setBrightness(Brightness)
	 * @see cevinedit.CevineditPackage#getNodeEClass_Brightness()
	 * @model
	 * @generated
	 */
	Brightness getBrightness();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see cevinedit.Brightness
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(Brightness value);

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' attribute.
	 * The literals are from the enumeration {@link cevinedit.NodeFigure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' attribute.
	 * @see cevinedit.NodeFigure
	 * @see #setFigure(NodeFigure)
	 * @see cevinedit.CevineditPackage#getNodeEClass_Figure()
	 * @model
	 * @generated
	 */
	NodeFigure getFigure();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getFigure <em>Figure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' attribute.
	 * @see cevinedit.NodeFigure
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(NodeFigure value);

	/**
	 * Returns the value of the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resizable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resizable</em>' attribute.
	 * @see #setResizable(boolean)
	 * @see cevinedit.CevineditPackage#getNodeEClass_Resizable()
	 * @model
	 * @generated
	 */
	boolean isResizable();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#isResizable <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resizable</em>' attribute.
	 * @see #isResizable()
	 * @generated
	 */
	void setResizable(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see cevinedit.CevineditPackage#getNodeEClass_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Label Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link cevinedit.Placement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Placement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Placement</em>' attribute.
	 * @see cevinedit.Placement
	 * @see #setLabelPlacement(Placement)
	 * @see cevinedit.CevineditPackage#getNodeEClass_LabelPlacement()
	 * @model
	 * @generated
	 */
	Placement getLabelPlacement();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getLabelPlacement <em>Label Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Placement</em>' attribute.
	 * @see cevinedit.Placement
	 * @see #getLabelPlacement()
	 * @generated
	 */
	void setLabelPlacement(Placement value);

	/**
	 * Returns the value of the '<em><b>Label Font Style</b></em>' attribute.
	 * The literals are from the enumeration {@link cevinedit.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Font Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Font Style</em>' attribute.
	 * @see cevinedit.FontStyle
	 * @see #setLabelFontStyle(FontStyle)
	 * @see cevinedit.CevineditPackage#getNodeEClass_LabelFontStyle()
	 * @model
	 * @generated
	 */
	FontStyle getLabelFontStyle();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getLabelFontStyle <em>Label Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Font Style</em>' attribute.
	 * @see cevinedit.FontStyle
	 * @see #getLabelFontStyle()
	 * @generated
	 */
	void setLabelFontStyle(FontStyle value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see cevinedit.CevineditPackage#getNodeEClass_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see cevinedit.CevineditPackage#getNodeEClass_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>List Points Polygon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Points Polygon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Points Polygon</em>' attribute.
	 * @see #setListPointsPolygon(String)
	 * @see cevinedit.CevineditPackage#getNodeEClass_ListPointsPolygon()
	 * @model
	 * @generated
	 */
	String getListPointsPolygon();

	/**
	 * Sets the value of the '{@link cevinedit.NodeEClass#getListPointsPolygon <em>List Points Polygon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Points Polygon</em>' attribute.
	 * @see #getListPointsPolygon()
	 * @generated
	 */
	void setListPointsPolygon(String value);

} // NodeEClass

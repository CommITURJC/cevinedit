/**
 */
package cevinedit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cevinedit.CevineditFactory
 * @model kind="package"
 * @generated
 */
public interface CevineditPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cevinedit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cevinedit/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cevinedit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CevineditPackage eINSTANCE = cevinedit.impl.CevineditPackageImpl.init();

	/**
	 * The meta object id for the '{@link cevinedit.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.DiagramImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The meta object id for the '{@link cevinedit.impl.PersonalizedElementImpl <em>Personalized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.PersonalizedElementImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getPersonalizedElement()
	 * @generated
	 */
	int PERSONALIZED_ELEMENT = 2;

	/**
	 * The meta object id for the '{@link cevinedit.impl.NodeEClassImpl <em>Node EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.NodeEClassImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getNodeEClass()
	 * @generated
	 */
	int NODE_ECLASS = 3;

	/**
	 * The meta object id for the '{@link cevinedit.impl.LinkEClassImpl <em>Link EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.LinkEClassImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getLinkEClass()
	 * @generated
	 */
	int LINK_ECLASS = 4;

	/**
	 * The meta object id for the '{@link cevinedit.impl.CompartmentEReferenceContImpl <em>Compartment EReference Cont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.CompartmentEReferenceContImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getCompartmentEReferenceCont()
	 * @generated
	 */
	int COMPARTMENT_EREFERENCE_CONT = 5;

	/**
	 * The meta object id for the '{@link cevinedit.impl.AffixedEReferenceContImpl <em>Affixed EReference Cont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.AffixedEReferenceContImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getAffixedEReferenceCont()
	 * @generated
	 */
	int AFFIXED_EREFERENCE_CONT = 6;

	/**
	 * The meta object id for the '{@link cevinedit.impl.LabelEAttributeImpl <em>Label EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.LabelEAttributeImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getLabelEAttribute()
	 * @generated
	 */
	int LABEL_EATTRIBUTE = 7;

	/**
	 * The meta object id for the '{@link cevinedit.impl.LinkEReferenceNonContImpl <em>Link EReference Non Cont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.LinkEReferenceNonContImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getLinkEReferenceNonCont()
	 * @generated
	 */
	int LINK_EREFERENCE_NON_CONT = 8;

	/**
	 * The meta object id for the '{@link cevinedit.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.LinkImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 9;

	/**
	 * The meta object id for the '{@link cevinedit.impl.CEViNEditRootImpl <em>CE Vi NEdit Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.impl.CEViNEditRootImpl
	 * @see cevinedit.impl.CevineditPackageImpl#getCEViNEditRoot()
	 * @generated
	 */
	int CE_VI_NEDIT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VI_NEDIT_ROOT__DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Source MM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VI_NEDIT_ROOT__SOURCE_MM = 1;

	/**
	 * The number of structural features of the '<em>CE Vi NEdit Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VI_NEDIT_ROOT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Contains Elem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CONTAINS_ELEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Model Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MODEL_EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZED_ELEMENT__ICON = 1;

	/**
	 * The number of structural features of the '<em>Personalized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALIZED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__NAME = PERSONALIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__ICON = PERSONALIZED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__BACKGROUND_COLOR = PERSONALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__BORDER_COLOR = PERSONALIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__BORDER_TEXTURE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__BORDER_WIDTH = PERSONALIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__BRIGHTNESS = PERSONALIZED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__FIGURE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__RESIZABLE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__SIZE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Label Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__LABEL_PLACEMENT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__LABEL_FONT_STYLE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__LABEL = PERSONALIZED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__IMAGE_PATH = PERSONALIZED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>List Points Polygon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS__LIST_POINTS_POLYGON = PERSONALIZED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Node EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ECLASS_FEATURE_COUNT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__NAME = PERSONALIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__ICON = PERSONALIZED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__BRIGHTNESS = PERSONALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__COLOR = PERSONALIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__LABEL_FONT_STYLE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__SOURCE_DECORATION = PERSONALIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__TARGET_DECORATION = PERSONALIZED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__TEXTURE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__WIDTH = PERSONALIZED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__LABEL = PERSONALIZED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__SOURCE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS__TARGET = PERSONALIZED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Link EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ECLASS_FEATURE_COUNT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_EREFERENCE_CONT__NAME = PERSONALIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_EREFERENCE_CONT__ICON = PERSONALIZED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_EREFERENCE_CONT__COLLAPSIBLE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_EREFERENCE_CONT__LAYOUT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compartment EReference Cont</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_EREFERENCE_CONT_FEATURE_COUNT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_EREFERENCE_CONT__NAME = PERSONALIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_EREFERENCE_CONT__ICON = PERSONALIZED_ELEMENT__ICON;

	/**
	 * The number of structural features of the '<em>Affixed EReference Cont</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFIXED_EREFERENCE_CONT_FEATURE_COUNT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE__NAME = PERSONALIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE__ICON = PERSONALIZED_ELEMENT__ICON;

	/**
	 * The number of structural features of the '<em>Label EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EATTRIBUTE_FEATURE_COUNT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__NAME = PERSONALIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__ICON = PERSONALIZED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__BRIGHTNESS = PERSONALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__COLOR = PERSONALIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION = PERSONALIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__TARGET_DECORATION = PERSONALIZED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__TEXTURE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__WIDTH = PERSONALIZED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT__LABEL = PERSONALIZED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Link EReference Non Cont</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EREFERENCE_NON_CONT_FEATURE_COUNT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = PERSONALIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ICON = PERSONALIZED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BRIGHTNESS = PERSONALIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COLOR = PERSONALIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL_FONT_STYLE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE_DECORATION = PERSONALIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET_DECORATION = PERSONALIZED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXTURE = PERSONALIZED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__WIDTH = PERSONALIZED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = PERSONALIZED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = PERSONALIZED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link cevinedit.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.Color
	 * @see cevinedit.impl.CevineditPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 10;

	/**
	 * The meta object id for the '{@link cevinedit.Texture <em>Texture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.Texture
	 * @see cevinedit.impl.CevineditPackageImpl#getTexture()
	 * @generated
	 */
	int TEXTURE = 11;

	/**
	 * The meta object id for the '{@link cevinedit.Brightness <em>Brightness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.Brightness
	 * @see cevinedit.impl.CevineditPackageImpl#getBrightness()
	 * @generated
	 */
	int BRIGHTNESS = 12;

	/**
	 * The meta object id for the '{@link cevinedit.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.FontStyle
	 * @see cevinedit.impl.CevineditPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 13;

	/**
	 * The meta object id for the '{@link cevinedit.NodeFigure <em>Node Figure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.NodeFigure
	 * @see cevinedit.impl.CevineditPackageImpl#getNodeFigure()
	 * @generated
	 */
	int NODE_FIGURE = 14;

	/**
	 * The meta object id for the '{@link cevinedit.LinkFigure <em>Link Figure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.LinkFigure
	 * @see cevinedit.impl.CevineditPackageImpl#getLinkFigure()
	 * @generated
	 */
	int LINK_FIGURE = 15;

	/**
	 * The meta object id for the '{@link cevinedit.Placement <em>Placement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.Placement
	 * @see cevinedit.impl.CevineditPackageImpl#getPlacement()
	 * @generated
	 */
	int PLACEMENT = 16;

	/**
	 * The meta object id for the '{@link cevinedit.LayoutCompartment <em>Layout Compartment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cevinedit.LayoutCompartment
	 * @see cevinedit.impl.CevineditPackageImpl#getLayoutCompartment()
	 * @generated
	 */
	int LAYOUT_COMPARTMENT = 17;


	/**
	 * Returns the meta object for class '{@link cevinedit.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see cevinedit.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link cevinedit.Diagram#getContainsElem <em>Contains Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Elem</em>'.
	 * @see cevinedit.Diagram#getContainsElem()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_ContainsElem();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cevinedit.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Diagram#getModelExtension <em>Model Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Extension</em>'.
	 * @see cevinedit.Diagram#getModelExtension()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ModelExtension();

	/**
	 * Returns the meta object for class '{@link cevinedit.NodeEClass <em>Node EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node EClass</em>'.
	 * @see cevinedit.NodeEClass
	 * @generated
	 */
	EClass getNodeEClass();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see cevinedit.NodeEClass#getBackgroundColor()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see cevinedit.NodeEClass#getBorderColor()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getBorderTexture <em>Border Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Texture</em>'.
	 * @see cevinedit.NodeEClass#getBorderTexture()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_BorderTexture();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see cevinedit.NodeEClass#getBorderWidth()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see cevinedit.NodeEClass#getBrightness()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure</em>'.
	 * @see cevinedit.NodeEClass#getFigure()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_Figure();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#isResizable <em>Resizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resizable</em>'.
	 * @see cevinedit.NodeEClass#isResizable()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_Resizable();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see cevinedit.NodeEClass#getSize()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_Size();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getLabelPlacement <em>Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Placement</em>'.
	 * @see cevinedit.NodeEClass#getLabelPlacement()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_LabelPlacement();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getLabelFontStyle <em>Label Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Font Style</em>'.
	 * @see cevinedit.NodeEClass#getLabelFontStyle()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_LabelFontStyle();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see cevinedit.NodeEClass#getLabel()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_Label();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see cevinedit.NodeEClass#getImagePath()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_ImagePath();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.NodeEClass#getListPointsPolygon <em>List Points Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Points Polygon</em>'.
	 * @see cevinedit.NodeEClass#getListPointsPolygon()
	 * @see #getNodeEClass()
	 * @generated
	 */
	EAttribute getNodeEClass_ListPointsPolygon();

	/**
	 * Returns the meta object for class '{@link cevinedit.LinkEClass <em>Link EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link EClass</em>'.
	 * @see cevinedit.LinkEClass
	 * @generated
	 */
	EClass getLinkEClass();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.LinkEClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see cevinedit.LinkEClass#getSource()
	 * @see #getLinkEClass()
	 * @generated
	 */
	EAttribute getLinkEClass_Source();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.LinkEClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see cevinedit.LinkEClass#getTarget()
	 * @see #getLinkEClass()
	 * @generated
	 */
	EAttribute getLinkEClass_Target();

	/**
	 * Returns the meta object for class '{@link cevinedit.CompartmentEReferenceCont <em>Compartment EReference Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment EReference Cont</em>'.
	 * @see cevinedit.CompartmentEReferenceCont
	 * @generated
	 */
	EClass getCompartmentEReferenceCont();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.CompartmentEReferenceCont#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see cevinedit.CompartmentEReferenceCont#isCollapsible()
	 * @see #getCompartmentEReferenceCont()
	 * @generated
	 */
	EAttribute getCompartmentEReferenceCont_Collapsible();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.CompartmentEReferenceCont#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see cevinedit.CompartmentEReferenceCont#getLayout()
	 * @see #getCompartmentEReferenceCont()
	 * @generated
	 */
	EAttribute getCompartmentEReferenceCont_Layout();

	/**
	 * Returns the meta object for class '{@link cevinedit.AffixedEReferenceCont <em>Affixed EReference Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affixed EReference Cont</em>'.
	 * @see cevinedit.AffixedEReferenceCont
	 * @generated
	 */
	EClass getAffixedEReferenceCont();

	/**
	 * Returns the meta object for class '{@link cevinedit.LabelEAttribute <em>Label EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label EAttribute</em>'.
	 * @see cevinedit.LabelEAttribute
	 * @generated
	 */
	EClass getLabelEAttribute();

	/**
	 * Returns the meta object for class '{@link cevinedit.PersonalizedElement <em>Personalized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personalized Element</em>'.
	 * @see cevinedit.PersonalizedElement
	 * @generated
	 */
	EClass getPersonalizedElement();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.PersonalizedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cevinedit.PersonalizedElement#getName()
	 * @see #getPersonalizedElement()
	 * @generated
	 */
	EAttribute getPersonalizedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.PersonalizedElement#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see cevinedit.PersonalizedElement#getIcon()
	 * @see #getPersonalizedElement()
	 * @generated
	 */
	EAttribute getPersonalizedElement_Icon();

	/**
	 * Returns the meta object for class '{@link cevinedit.LinkEReferenceNonCont <em>Link EReference Non Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link EReference Non Cont</em>'.
	 * @see cevinedit.LinkEReferenceNonCont
	 * @generated
	 */
	EClass getLinkEReferenceNonCont();

	/**
	 * Returns the meta object for class '{@link cevinedit.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see cevinedit.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see cevinedit.Link#getBrightness()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see cevinedit.Link#getColor()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Color();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getLabelFontStyle <em>Label Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Font Style</em>'.
	 * @see cevinedit.Link#getLabelFontStyle()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_LabelFontStyle();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getSourceDecoration <em>Source Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Decoration</em>'.
	 * @see cevinedit.Link#getSourceDecoration()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_SourceDecoration();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getTargetDecoration <em>Target Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Decoration</em>'.
	 * @see cevinedit.Link#getTargetDecoration()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_TargetDecoration();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see cevinedit.Link#getTexture()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Texture();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see cevinedit.Link#getWidth()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Width();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.Link#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see cevinedit.Link#getLabel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Label();

	/**
	 * Returns the meta object for class '{@link cevinedit.CEViNEditRoot <em>CE Vi NEdit Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CE Vi NEdit Root</em>'.
	 * @see cevinedit.CEViNEditRoot
	 * @generated
	 */
	EClass getCEViNEditRoot();

	/**
	 * Returns the meta object for the containment reference '{@link cevinedit.CEViNEditRoot#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram</em>'.
	 * @see cevinedit.CEViNEditRoot#getDiagram()
	 * @see #getCEViNEditRoot()
	 * @generated
	 */
	EReference getCEViNEditRoot_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link cevinedit.CEViNEditRoot#getSourceMM <em>Source MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source MM</em>'.
	 * @see cevinedit.CEViNEditRoot#getSourceMM()
	 * @see #getCEViNEditRoot()
	 * @generated
	 */
	EAttribute getCEViNEditRoot_SourceMM();

	/**
	 * Returns the meta object for enum '{@link cevinedit.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see cevinedit.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link cevinedit.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture</em>'.
	 * @see cevinedit.Texture
	 * @generated
	 */
	EEnum getTexture();

	/**
	 * Returns the meta object for enum '{@link cevinedit.Brightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Brightness</em>'.
	 * @see cevinedit.Brightness
	 * @generated
	 */
	EEnum getBrightness();

	/**
	 * Returns the meta object for enum '{@link cevinedit.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see cevinedit.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the meta object for enum '{@link cevinedit.NodeFigure <em>Node Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Figure</em>'.
	 * @see cevinedit.NodeFigure
	 * @generated
	 */
	EEnum getNodeFigure();

	/**
	 * Returns the meta object for enum '{@link cevinedit.LinkFigure <em>Link Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Figure</em>'.
	 * @see cevinedit.LinkFigure
	 * @generated
	 */
	EEnum getLinkFigure();

	/**
	 * Returns the meta object for enum '{@link cevinedit.Placement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placement</em>'.
	 * @see cevinedit.Placement
	 * @generated
	 */
	EEnum getPlacement();

	/**
	 * Returns the meta object for enum '{@link cevinedit.LayoutCompartment <em>Layout Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Compartment</em>'.
	 * @see cevinedit.LayoutCompartment
	 * @generated
	 */
	EEnum getLayoutCompartment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CevineditFactory getCevineditFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cevinedit.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.DiagramImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Contains Elem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__CONTAINS_ELEM = eINSTANCE.getDiagram_ContainsElem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Model Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__MODEL_EXTENSION = eINSTANCE.getDiagram_ModelExtension();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.NodeEClassImpl <em>Node EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.NodeEClassImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getNodeEClass()
		 * @generated
		 */
		EClass NODE_ECLASS = eINSTANCE.getNodeEClass();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__BACKGROUND_COLOR = eINSTANCE.getNodeEClass_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__BORDER_COLOR = eINSTANCE.getNodeEClass_BorderColor();

		/**
		 * The meta object literal for the '<em><b>Border Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__BORDER_TEXTURE = eINSTANCE.getNodeEClass_BorderTexture();

		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__BORDER_WIDTH = eINSTANCE.getNodeEClass_BorderWidth();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__BRIGHTNESS = eINSTANCE.getNodeEClass_Brightness();

		/**
		 * The meta object literal for the '<em><b>Figure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__FIGURE = eINSTANCE.getNodeEClass_Figure();

		/**
		 * The meta object literal for the '<em><b>Resizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__RESIZABLE = eINSTANCE.getNodeEClass_Resizable();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__SIZE = eINSTANCE.getNodeEClass_Size();

		/**
		 * The meta object literal for the '<em><b>Label Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__LABEL_PLACEMENT = eINSTANCE.getNodeEClass_LabelPlacement();

		/**
		 * The meta object literal for the '<em><b>Label Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__LABEL_FONT_STYLE = eINSTANCE.getNodeEClass_LabelFontStyle();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__LABEL = eINSTANCE.getNodeEClass_Label();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__IMAGE_PATH = eINSTANCE.getNodeEClass_ImagePath();

		/**
		 * The meta object literal for the '<em><b>List Points Polygon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_ECLASS__LIST_POINTS_POLYGON = eINSTANCE.getNodeEClass_ListPointsPolygon();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.LinkEClassImpl <em>Link EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.LinkEClassImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getLinkEClass()
		 * @generated
		 */
		EClass LINK_ECLASS = eINSTANCE.getLinkEClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ECLASS__SOURCE = eINSTANCE.getLinkEClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ECLASS__TARGET = eINSTANCE.getLinkEClass_Target();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.CompartmentEReferenceContImpl <em>Compartment EReference Cont</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.CompartmentEReferenceContImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getCompartmentEReferenceCont()
		 * @generated
		 */
		EClass COMPARTMENT_EREFERENCE_CONT = eINSTANCE.getCompartmentEReferenceCont();

		/**
		 * The meta object literal for the '<em><b>Collapsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_EREFERENCE_CONT__COLLAPSIBLE = eINSTANCE.getCompartmentEReferenceCont_Collapsible();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_EREFERENCE_CONT__LAYOUT = eINSTANCE.getCompartmentEReferenceCont_Layout();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.AffixedEReferenceContImpl <em>Affixed EReference Cont</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.AffixedEReferenceContImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getAffixedEReferenceCont()
		 * @generated
		 */
		EClass AFFIXED_EREFERENCE_CONT = eINSTANCE.getAffixedEReferenceCont();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.LabelEAttributeImpl <em>Label EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.LabelEAttributeImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getLabelEAttribute()
		 * @generated
		 */
		EClass LABEL_EATTRIBUTE = eINSTANCE.getLabelEAttribute();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.PersonalizedElementImpl <em>Personalized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.PersonalizedElementImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getPersonalizedElement()
		 * @generated
		 */
		EClass PERSONALIZED_ELEMENT = eINSTANCE.getPersonalizedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONALIZED_ELEMENT__NAME = eINSTANCE.getPersonalizedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONALIZED_ELEMENT__ICON = eINSTANCE.getPersonalizedElement_Icon();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.LinkEReferenceNonContImpl <em>Link EReference Non Cont</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.LinkEReferenceNonContImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getLinkEReferenceNonCont()
		 * @generated
		 */
		EClass LINK_EREFERENCE_NON_CONT = eINSTANCE.getLinkEReferenceNonCont();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.LinkImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__BRIGHTNESS = eINSTANCE.getLink_Brightness();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__COLOR = eINSTANCE.getLink_Color();

		/**
		 * The meta object literal for the '<em><b>Label Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LABEL_FONT_STYLE = eINSTANCE.getLink_LabelFontStyle();

		/**
		 * The meta object literal for the '<em><b>Source Decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SOURCE_DECORATION = eINSTANCE.getLink_SourceDecoration();

		/**
		 * The meta object literal for the '<em><b>Target Decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TARGET_DECORATION = eINSTANCE.getLink_TargetDecoration();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXTURE = eINSTANCE.getLink_Texture();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__WIDTH = eINSTANCE.getLink_Width();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LABEL = eINSTANCE.getLink_Label();

		/**
		 * The meta object literal for the '{@link cevinedit.impl.CEViNEditRootImpl <em>CE Vi NEdit Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.impl.CEViNEditRootImpl
		 * @see cevinedit.impl.CevineditPackageImpl#getCEViNEditRoot()
		 * @generated
		 */
		EClass CE_VI_NEDIT_ROOT = eINSTANCE.getCEViNEditRoot();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CE_VI_NEDIT_ROOT__DIAGRAM = eINSTANCE.getCEViNEditRoot_Diagram();

		/**
		 * The meta object literal for the '<em><b>Source MM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CE_VI_NEDIT_ROOT__SOURCE_MM = eINSTANCE.getCEViNEditRoot_SourceMM();

		/**
		 * The meta object literal for the '{@link cevinedit.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.Color
		 * @see cevinedit.impl.CevineditPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link cevinedit.Texture <em>Texture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.Texture
		 * @see cevinedit.impl.CevineditPackageImpl#getTexture()
		 * @generated
		 */
		EEnum TEXTURE = eINSTANCE.getTexture();

		/**
		 * The meta object literal for the '{@link cevinedit.Brightness <em>Brightness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.Brightness
		 * @see cevinedit.impl.CevineditPackageImpl#getBrightness()
		 * @generated
		 */
		EEnum BRIGHTNESS = eINSTANCE.getBrightness();

		/**
		 * The meta object literal for the '{@link cevinedit.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.FontStyle
		 * @see cevinedit.impl.CevineditPackageImpl#getFontStyle()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFontStyle();

		/**
		 * The meta object literal for the '{@link cevinedit.NodeFigure <em>Node Figure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.NodeFigure
		 * @see cevinedit.impl.CevineditPackageImpl#getNodeFigure()
		 * @generated
		 */
		EEnum NODE_FIGURE = eINSTANCE.getNodeFigure();

		/**
		 * The meta object literal for the '{@link cevinedit.LinkFigure <em>Link Figure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.LinkFigure
		 * @see cevinedit.impl.CevineditPackageImpl#getLinkFigure()
		 * @generated
		 */
		EEnum LINK_FIGURE = eINSTANCE.getLinkFigure();

		/**
		 * The meta object literal for the '{@link cevinedit.Placement <em>Placement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.Placement
		 * @see cevinedit.impl.CevineditPackageImpl#getPlacement()
		 * @generated
		 */
		EEnum PLACEMENT = eINSTANCE.getPlacement();

		/**
		 * The meta object literal for the '{@link cevinedit.LayoutCompartment <em>Layout Compartment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cevinedit.LayoutCompartment
		 * @see cevinedit.impl.CevineditPackageImpl#getLayoutCompartment()
		 * @generated
		 */
		EEnum LAYOUT_COMPARTMENT = eINSTANCE.getLayoutCompartment();

	}

} //CevineditPackage

/**
 */
package cevinedit.impl;

import cevinedit.AffixedEReferenceCont;
import cevinedit.Brightness;
import cevinedit.CEViNEditRoot;
import cevinedit.CevineditFactory;
import cevinedit.CevineditPackage;
import cevinedit.Color;
import cevinedit.CompartmentEReferenceCont;
import cevinedit.Diagram;
import cevinedit.FontStyle;
import cevinedit.LabelEAttribute;
import cevinedit.LayoutCompartment;
import cevinedit.Link;
import cevinedit.LinkEClass;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.LinkFigure;
import cevinedit.NodeEClass;
import cevinedit.NodeFigure;
import cevinedit.PersonalizedElement;
import cevinedit.Placement;
import cevinedit.Texture;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CevineditPackageImpl extends EPackageImpl implements CevineditPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentEReferenceContEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affixedEReferenceContEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalizedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEReferenceNonContEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceViNEditRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brightnessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeFigureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkFigureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutCompartmentEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cevinedit.CevineditPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CevineditPackageImpl() {
		super(eNS_URI, CevineditFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CevineditPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CevineditPackage init() {
		if (isInited) return (CevineditPackage)EPackage.Registry.INSTANCE.getEPackage(CevineditPackage.eNS_URI);

		// Obtain or create and register package
		CevineditPackageImpl theCevineditPackage = (CevineditPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CevineditPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CevineditPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCevineditPackage.createPackageContents();

		// Initialize created meta-data
		theCevineditPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCevineditPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CevineditPackage.eNS_URI, theCevineditPackage);
		return theCevineditPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_ContainsElem() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Name() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_ModelExtension() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeEClass() {
		return nodeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_BackgroundColor() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_BorderColor() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_BorderTexture() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_BorderWidth() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_Brightness() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_Figure() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_Resizable() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_Size() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_LabelPlacement() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_LabelFontStyle() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_Label() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_ImagePath() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeEClass_ListPointsPolygon() {
		return (EAttribute)nodeEClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEClass() {
		return linkEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEClass_Source() {
		return (EAttribute)linkEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEClass_Target() {
		return (EAttribute)linkEClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentEReferenceCont() {
		return compartmentEReferenceContEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentEReferenceCont_Collapsible() {
		return (EAttribute)compartmentEReferenceContEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentEReferenceCont_Layout() {
		return (EAttribute)compartmentEReferenceContEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffixedEReferenceCont() {
		return affixedEReferenceContEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelEAttribute() {
		return labelEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalizedElement() {
		return personalizedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalizedElement_Name() {
		return (EAttribute)personalizedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalizedElement_Icon() {
		return (EAttribute)personalizedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEReferenceNonCont() {
		return linkEReferenceNonContEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Brightness() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Color() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_LabelFontStyle() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_SourceDecoration() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_TargetDecoration() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Texture() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Width() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Label() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEViNEditRoot() {
		return ceViNEditRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEViNEditRoot_Diagram() {
		return (EReference)ceViNEditRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEViNEditRoot_SourceMM() {
		return (EAttribute)ceViNEditRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTexture() {
		return textureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBrightness() {
		return brightnessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeFigure() {
		return nodeFigureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkFigure() {
		return linkFigureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlacement() {
		return placementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutCompartment() {
		return layoutCompartmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CevineditFactory getCevineditFactory() {
		return (CevineditFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ceViNEditRootEClass = createEClass(CE_VI_NEDIT_ROOT);
		createEReference(ceViNEditRootEClass, CE_VI_NEDIT_ROOT__DIAGRAM);
		createEAttribute(ceViNEditRootEClass, CE_VI_NEDIT_ROOT__SOURCE_MM);

		diagramEClass = createEClass(DIAGRAM);
		createEReference(diagramEClass, DIAGRAM__CONTAINS_ELEM);
		createEAttribute(diagramEClass, DIAGRAM__NAME);
		createEAttribute(diagramEClass, DIAGRAM__MODEL_EXTENSION);

		personalizedElementEClass = createEClass(PERSONALIZED_ELEMENT);
		createEAttribute(personalizedElementEClass, PERSONALIZED_ELEMENT__NAME);
		createEAttribute(personalizedElementEClass, PERSONALIZED_ELEMENT__ICON);

		nodeEClassEClass = createEClass(NODE_ECLASS);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__BACKGROUND_COLOR);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__BORDER_COLOR);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__BORDER_TEXTURE);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__BORDER_WIDTH);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__BRIGHTNESS);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__FIGURE);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__RESIZABLE);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__SIZE);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__LABEL_PLACEMENT);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__LABEL_FONT_STYLE);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__LABEL);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__IMAGE_PATH);
		createEAttribute(nodeEClassEClass, NODE_ECLASS__LIST_POINTS_POLYGON);

		linkEClassEClass = createEClass(LINK_ECLASS);
		createEAttribute(linkEClassEClass, LINK_ECLASS__SOURCE);
		createEAttribute(linkEClassEClass, LINK_ECLASS__TARGET);

		compartmentEReferenceContEClass = createEClass(COMPARTMENT_EREFERENCE_CONT);
		createEAttribute(compartmentEReferenceContEClass, COMPARTMENT_EREFERENCE_CONT__COLLAPSIBLE);
		createEAttribute(compartmentEReferenceContEClass, COMPARTMENT_EREFERENCE_CONT__LAYOUT);

		affixedEReferenceContEClass = createEClass(AFFIXED_EREFERENCE_CONT);

		labelEAttributeEClass = createEClass(LABEL_EATTRIBUTE);

		linkEReferenceNonContEClass = createEClass(LINK_EREFERENCE_NON_CONT);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__BRIGHTNESS);
		createEAttribute(linkEClass, LINK__COLOR);
		createEAttribute(linkEClass, LINK__LABEL_FONT_STYLE);
		createEAttribute(linkEClass, LINK__SOURCE_DECORATION);
		createEAttribute(linkEClass, LINK__TARGET_DECORATION);
		createEAttribute(linkEClass, LINK__TEXTURE);
		createEAttribute(linkEClass, LINK__WIDTH);
		createEAttribute(linkEClass, LINK__LABEL);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		textureEEnum = createEEnum(TEXTURE);
		brightnessEEnum = createEEnum(BRIGHTNESS);
		fontStyleEEnum = createEEnum(FONT_STYLE);
		nodeFigureEEnum = createEEnum(NODE_FIGURE);
		linkFigureEEnum = createEEnum(LINK_FIGURE);
		placementEEnum = createEEnum(PLACEMENT);
		layoutCompartmentEEnum = createEEnum(LAYOUT_COMPARTMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClassEClass.getESuperTypes().add(this.getPersonalizedElement());
		linkEClassEClass.getESuperTypes().add(this.getPersonalizedElement());
		linkEClassEClass.getESuperTypes().add(this.getLink());
		compartmentEReferenceContEClass.getESuperTypes().add(this.getPersonalizedElement());
		affixedEReferenceContEClass.getESuperTypes().add(this.getPersonalizedElement());
		labelEAttributeEClass.getESuperTypes().add(this.getPersonalizedElement());
		linkEReferenceNonContEClass.getESuperTypes().add(this.getPersonalizedElement());
		linkEReferenceNonContEClass.getESuperTypes().add(this.getLink());
		linkEClass.getESuperTypes().add(this.getPersonalizedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(ceViNEditRootEClass, CEViNEditRoot.class, "CEViNEditRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEViNEditRoot_Diagram(), this.getDiagram(), null, "diagram", null, 1, 1, CEViNEditRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEViNEditRoot_SourceMM(), ecorePackage.getEString(), "sourceMM", null, 1, 1, CEViNEditRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagram_ContainsElem(), this.getPersonalizedElement(), null, "containsElem", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_ModelExtension(), ecorePackage.getEString(), "modelExtension", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalizedElementEClass, PersonalizedElement.class, "PersonalizedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonalizedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PersonalizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalizedElement_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, PersonalizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClassEClass, NodeEClass.class, "NodeEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeEClass_BackgroundColor(), this.getColor(), "backgroundColor", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_BorderColor(), this.getColor(), "borderColor", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_BorderTexture(), this.getTexture(), "borderTexture", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_BorderWidth(), ecorePackage.getEInt(), "borderWidth", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_Brightness(), this.getBrightness(), "brightness", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_Figure(), this.getNodeFigure(), "figure", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_Resizable(), ecorePackage.getEBoolean(), "resizable", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_Size(), ecorePackage.getEString(), "size", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_LabelPlacement(), this.getPlacement(), "labelPlacement", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_LabelFontStyle(), this.getFontStyle(), "labelFontStyle", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_Label(), ecorePackage.getEString(), "label", null, 1, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeEClass_ListPointsPolygon(), ecorePackage.getEString(), "listPointsPolygon", null, 0, 1, NodeEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClassEClass, LinkEClass.class, "LinkEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkEClass_Source(), ecorePackage.getEString(), "source", null, 1, 1, LinkEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkEClass_Target(), ecorePackage.getEString(), "target", null, 1, 1, LinkEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentEReferenceContEClass, CompartmentEReferenceCont.class, "CompartmentEReferenceCont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompartmentEReferenceCont_Collapsible(), ecorePackage.getEBoolean(), "collapsible", null, 0, 1, CompartmentEReferenceCont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartmentEReferenceCont_Layout(), this.getLayoutCompartment(), "layout", null, 0, 1, CompartmentEReferenceCont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affixedEReferenceContEClass, AffixedEReferenceCont.class, "AffixedEReferenceCont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEAttributeEClass, LabelEAttribute.class, "LabelEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEReferenceNonContEClass, LinkEReferenceNonCont.class, "LinkEReferenceNonCont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Brightness(), this.getBrightness(), "brightness", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Color(), this.getColor(), "color", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_LabelFontStyle(), this.getFontStyle(), "labelFontStyle", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_SourceDecoration(), this.getLinkFigure(), "sourceDecoration", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_TargetDecoration(), this.getLinkFigure(), "targetDecoration", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Texture(), this.getTexture(), "texture", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Label(), ecorePackage.getEString(), "label", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.DEFAULT);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.CYAN);
		addEEnumLiteral(colorEEnum, Color.GRAY);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.ORANGE);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.YELLOW);

		initEEnum(textureEEnum, Texture.class, "Texture");
		addEEnumLiteral(textureEEnum, Texture.DEFAULT);
		addEEnumLiteral(textureEEnum, Texture.DASH);
		addEEnumLiteral(textureEEnum, Texture.DOT);
		addEEnumLiteral(textureEEnum, Texture.SOLID);

		initEEnum(brightnessEEnum, Brightness.class, "Brightness");
		addEEnumLiteral(brightnessEEnum, Brightness.DEFAULT);
		addEEnumLiteral(brightnessEEnum, Brightness.DARK);
		addEEnumLiteral(brightnessEEnum, Brightness.LIGHT);

		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.DEFAULT);
		addEEnumLiteral(fontStyleEEnum, FontStyle.BOLD);
		addEEnumLiteral(fontStyleEEnum, FontStyle.ITALIC);

		initEEnum(nodeFigureEEnum, NodeFigure.class, "NodeFigure");
		addEEnumLiteral(nodeFigureEEnum, NodeFigure.DEFAULT);
		addEEnumLiteral(nodeFigureEEnum, NodeFigure.ELLIPSE);
		addEEnumLiteral(nodeFigureEEnum, NodeFigure.POLYGON);
		addEEnumLiteral(nodeFigureEEnum, NodeFigure.RECTANGLE);
		addEEnumLiteral(nodeFigureEEnum, NodeFigure.ROUNDED);
		addEEnumLiteral(nodeFigureEEnum, NodeFigure.SVG);
		addEEnumLiteral(nodeFigureEEnum, NodeFigure.IMAGE);

		initEEnum(linkFigureEEnum, LinkFigure.class, "LinkFigure");
		addEEnumLiteral(linkFigureEEnum, LinkFigure.DEFAULT);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.ARROW);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.CLOSED_ARROW);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.FILLED_CLOSED_ARROW);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.RHOMB);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.FILLED_RHOMB);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.SQUARE);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.FILLED_SQUARE);
		addEEnumLiteral(linkFigureEEnum, LinkFigure.NONE);

		initEEnum(placementEEnum, Placement.class, "Placement");
		addEEnumLiteral(placementEEnum, Placement.EXTERNAL);
		addEEnumLiteral(placementEEnum, Placement.INTERNAL);
		addEEnumLiteral(placementEEnum, Placement.NONE);

		initEEnum(layoutCompartmentEEnum, LayoutCompartment.class, "LayoutCompartment");
		addEEnumLiteral(layoutCompartmentEEnum, LayoutCompartment.FREE);
		addEEnumLiteral(layoutCompartmentEEnum, LayoutCompartment.LIST);

		// Create resource
		createResource(eNS_URI);
	}

} //CevineditPackageImpl

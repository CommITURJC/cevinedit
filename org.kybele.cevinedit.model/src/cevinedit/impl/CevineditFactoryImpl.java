/**
 */
package cevinedit.impl;

import cevinedit.*;

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
public class CevineditFactoryImpl extends EFactoryImpl implements CevineditFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CevineditFactory init() {
		try {
			CevineditFactory theCevineditFactory = (CevineditFactory)EPackage.Registry.INSTANCE.getEFactory(CevineditPackage.eNS_URI);
			if (theCevineditFactory != null) {
				return theCevineditFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CevineditFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CevineditFactoryImpl() {
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
			case CevineditPackage.CE_VI_NEDIT_ROOT: return createCEViNEditRoot();
			case CevineditPackage.DIAGRAM: return createDiagram();
			case CevineditPackage.NODE_ECLASS: return createNodeEClass();
			case CevineditPackage.LINK_ECLASS: return createLinkEClass();
			case CevineditPackage.COMPARTMENT_EREFERENCE_CONT: return createCompartmentEReferenceCont();
			case CevineditPackage.AFFIXED_EREFERENCE_CONT: return createAffixedEReferenceCont();
			case CevineditPackage.LABEL_EATTRIBUTE: return createLabelEAttribute();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT: return createLinkEReferenceNonCont();
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
			case CevineditPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case CevineditPackage.TEXTURE:
				return createTextureFromString(eDataType, initialValue);
			case CevineditPackage.BRIGHTNESS:
				return createBrightnessFromString(eDataType, initialValue);
			case CevineditPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			case CevineditPackage.NODE_FIGURE:
				return createNodeFigureFromString(eDataType, initialValue);
			case CevineditPackage.LINK_FIGURE:
				return createLinkFigureFromString(eDataType, initialValue);
			case CevineditPackage.PLACEMENT:
				return createPlacementFromString(eDataType, initialValue);
			case CevineditPackage.LAYOUT_COMPARTMENT:
				return createLayoutCompartmentFromString(eDataType, initialValue);
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
			case CevineditPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case CevineditPackage.TEXTURE:
				return convertTextureToString(eDataType, instanceValue);
			case CevineditPackage.BRIGHTNESS:
				return convertBrightnessToString(eDataType, instanceValue);
			case CevineditPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			case CevineditPackage.NODE_FIGURE:
				return convertNodeFigureToString(eDataType, instanceValue);
			case CevineditPackage.LINK_FIGURE:
				return convertLinkFigureToString(eDataType, instanceValue);
			case CevineditPackage.PLACEMENT:
				return convertPlacementToString(eDataType, instanceValue);
			case CevineditPackage.LAYOUT_COMPARTMENT:
				return convertLayoutCompartmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeEClass createNodeEClass() {
		NodeEClassImpl nodeEClass = new NodeEClassImpl();
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEClass createLinkEClass() {
		LinkEClassImpl linkEClass = new LinkEClassImpl();
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEReferenceCont createCompartmentEReferenceCont() {
		CompartmentEReferenceContImpl compartmentEReferenceCont = new CompartmentEReferenceContImpl();
		return compartmentEReferenceCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffixedEReferenceCont createAffixedEReferenceCont() {
		AffixedEReferenceContImpl affixedEReferenceCont = new AffixedEReferenceContImpl();
		return affixedEReferenceCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelEAttribute createLabelEAttribute() {
		LabelEAttributeImpl labelEAttribute = new LabelEAttributeImpl();
		return labelEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEReferenceNonCont createLinkEReferenceNonCont() {
		LinkEReferenceNonContImpl linkEReferenceNonCont = new LinkEReferenceNonContImpl();
		return linkEReferenceNonCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEViNEditRoot createCEViNEditRoot() {
		CEViNEditRootImpl ceViNEditRoot = new CEViNEditRootImpl();
		return ceViNEditRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texture createTextureFromString(EDataType eDataType, String initialValue) {
		Texture result = Texture.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brightness createBrightnessFromString(EDataType eDataType, String initialValue) {
		Brightness result = Brightness.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrightnessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType, String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFigure createNodeFigureFromString(EDataType eDataType, String initialValue) {
		NodeFigure result = NodeFigure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeFigureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkFigure createLinkFigureFromString(EDataType eDataType, String initialValue) {
		LinkFigure result = LinkFigure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkFigureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placement createPlacementFromString(EDataType eDataType, String initialValue) {
		Placement result = Placement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutCompartment createLayoutCompartmentFromString(EDataType eDataType, String initialValue) {
		LayoutCompartment result = LayoutCompartment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutCompartmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CevineditPackage getCevineditPackage() {
		return (CevineditPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CevineditPackage getPackage() {
		return CevineditPackage.eINSTANCE;
	}

} //CevineditFactoryImpl

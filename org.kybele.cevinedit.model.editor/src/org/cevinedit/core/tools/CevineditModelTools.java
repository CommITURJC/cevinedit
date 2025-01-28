package org.cevinedit.core.tools;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import cevinedit.CEViNEditRoot;
import cevinedit.NodeEClass;
import cevinedit.NodeFigure;
import cevinedit.PersonalizedElement;
import cevinedit.presentation.CevineditEditor;

public class CevineditModelTools {
	protected Resource _cevineditModelResource = null;
	
	protected EPackage _metamodelRoot = null;
	protected CEViNEditRoot _modelRoot = null;
	
	public static EList<NodeEClass> getNodeEClassList(CevineditEditor editor)
	{
		EList<NodeEClass> listNodeEClass = new BasicEList<NodeEClass>();
		
		Resource _modelResource = editor.getCevineditModelResource();

		CEViNEditRoot _modelRoot = (CEViNEditRoot) _modelResource.getContents().get(0);
		
		EList<PersonalizedElement> _customizations = _modelRoot.getDiagram().getContainsElem();
		
		for (PersonalizedElement personalizedElement : _customizations) {
			if (personalizedElement instanceof NodeEClass)
			{
				listNodeEClass.add((NodeEClass) personalizedElement);
			}
		}
		
		return listNodeEClass;
	}
	
	public static EList<NodeEClass> getNodeEClassWithImageFigure(CevineditEditor editor)
	{
		EList<NodeEClass> listNodeEClassWithImageFigure = new BasicEList<NodeEClass>();
		
		for (NodeEClass nodeEClass : getNodeEClassList(editor)) {
			if (nodeEClass.getFigure().equals(NodeFigure.IMAGE))
			{
				listNodeEClassWithImageFigure.add(nodeEClass);
			}
		}
		
		return listNodeEClassWithImageFigure;
	}
	
	public static LinkedList<String> getNamesPersonalizedElements(CevineditEditor editor)
	{
		Resource _modelResource = editor.getCevineditModelResource();

		CEViNEditRoot _modelRoot = (CEViNEditRoot) _modelResource.getContents().get(0);
		
		EList<PersonalizedElement> _customizations = _modelRoot.getDiagram().getContainsElem();
		
		LinkedList<String> names = new LinkedList<>();
		
		for (PersonalizedElement personalizedElement : _customizations) 
		{

			names.add(personalizedElement.getName());
		}
		
		return names;
	}
	
}

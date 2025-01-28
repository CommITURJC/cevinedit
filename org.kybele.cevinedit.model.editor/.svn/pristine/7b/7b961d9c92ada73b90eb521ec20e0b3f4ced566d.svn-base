package org.cevinedit.editor.view.validators;

import org.eclipse.emf.common.util.EList;

import cevinedit.CEViNEditRoot;
import cevinedit.Diagram;
import cevinedit.PersonalizedElement;

public class CevineditValidator 
{
	public static boolean CevineditModelHasDiagram(CEViNEditRoot root)
	{
		if (root == null) return false;
		return (root.getDiagram() != null);
	}
	
	public static boolean CevineditModelHasElements(CEViNEditRoot root)
	{
		if (CevineditModelHasDiagram(root))
		{
			Diagram diagram = root.getDiagram();
			
			if (diagram.getContainsElem() == null) return false;
			
			if (diagram.getContainsElem().size()>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else return false;
	}
	
	public static boolean CevineditModelHasElementWithName(CEViNEditRoot root, String name_node)
	{
		if (CevineditModelHasDiagram(root))
		{
			EList<PersonalizedElement> list_elements = root.getDiagram().getContainsElem();
			
			for (PersonalizedElement personalizedElement : list_elements) 
			{
				if (personalizedElement.getName().equals(name_node))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
		}
		return false;
		
		
	}
}

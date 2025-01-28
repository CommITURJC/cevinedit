package org.cevinedit.core.model.comparator;

import cevinedit.Link;
import cevinedit.LinkEClass;
import cevinedit.NodeEClass;

public class CevineditModelComparator {

	public static boolean isEqualsNodeEClass2NodeEClass(NodeEClass a, NodeEClass b)
	{
		boolean equals = true;
		
		equals &= a.getBackgroundColor().getLiteral().equals(b.getBackgroundColor().getLiteral());
		equals &= a.getBorderColor().getLiteral().equals(b.getBorderColor().getLiteral());
		equals &= a.getBorderTexture().getLiteral().equals(b.getBorderTexture().getLiteral());
		equals &= a.getBorderWidth() == b.getBorderWidth();
		equals &= a.getBrightness().getLiteral().equals(b.getBrightness().getLiteral());
		equals &= a.getFigure().getLiteral().equals(b.getFigure().getLiteral());
		
		
		
		return equals;
		
	}
	
	public static boolean isEqualsLink2Link(Link a, Link b)
	{
		boolean equals = true;
		

		equals &= a.getBrightness().getLiteral().equals(b.getBrightness().getLiteral());
		equals &= a.getColor().getLiteral().equals(b.getColor().getLiteral());
		
		equals &= a.getSourceDecoration().getLiteral().equals(b.getSourceDecoration().getLiteral());
		equals &= a.getTargetDecoration().getLiteral().equals(b.getTargetDecoration().getLiteral());
		equals &= a.getTexture().getLiteral().equals(b.getTexture().getLiteral());
		equals &= a.getWidth() == b.getWidth();
		
		return equals;
		
	}	
}

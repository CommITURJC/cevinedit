package es.kybele.cevinedit.translators.cevinedit2notation;

import java.util.LinkedList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.Point;
import cevinedit.NodeEClass;
import cevinedit.NodeFigure;
import notation.GraphicalElement;
import notation.NotationFactory;

public class Utils {

	public static EClass findEClassByNameInEPackage(EPackage ePackage, String eClassName)
	{
		for(EClassifier eClassifier : ePackage.getEClassifiers())
		{
			if (eClassifier.getName().toLowerCase().equals(eClassName.toLowerCase()) && eClassifier instanceof EClass)
			{
				return (EClass) eClassifier;
			}
		}
		for(EPackage ePackageChild : ePackage.getESubpackages())
		{
			return findEClassByNameInEPackage(ePackageChild, eClassName);
		}
		
		return null;
	}
	
	public static EClass findEClassByNameInResource(Resource ecoreResource, String eClassName)
	{
		EPackage rootEPackage = (EPackage) ecoreResource.getContents().get(0);
		
		if (rootEPackage != null)
		{
			return findEClassByNameInEPackage(rootEPackage, eClassName);
		}
		return null;
	}
		
	public static GraphicalElement discoverGraphicalElement(NodeEClass nodeEClass)
	{
		NotationFactory notationFactory = NotationFactory.eINSTANCE;
		if (nodeEClass.getFigure().equals(NodeFigure.POLYGON))
		{
			
			String listPoints = nodeEClass.getListPointsPolygon();

			String [] stringPoints = listPoints.split(";");
			
			LinkedList<Point> pointList = new LinkedList<Point>(); 
			
			for(String stringPoint : stringPoints)
			{
				if (!stringPoint.equals(""))
				{
					String[] stringPointParts = stringPoint.split(",");
					int x = Integer.parseInt(stringPointParts[0]);
					int y = Integer.parseInt(stringPointParts[1]);
					pointList.add(new Point(x, y));
				}
			}			
			if (pointList.size()<4)
			{
				return notationFactory.createTriangle();
			}
			if (pointList.size() == 3)
			{
				return notationFactory.createTriangle();
			}
			if (pointList.size() == 5)
			{
				int x_min = pointList.get(0).x;
				int x_max = pointList.get(0).x;
				int y_min = pointList.get(0).y;
				int y_max = pointList.get(0).y;
				LinkedList<Integer> y_list = new LinkedList<Integer>(); 
				LinkedList<Integer> x_list = new LinkedList<Integer>();
				for(Point point : pointList)
				{
					if (!y_list.contains(point.y))
					{
						y_list.add(point.y);
					}
					if (!x_list.contains(point.x))
					{
						x_list.add(point.x);
					}					
					
					if (point.x < x_min)
					{
						x_min = point.x;
					}
					if (point.x > x_max)
					{
						x_max = point.x;
					}
					if (point.y < y_min)
					{
						y_min = point.y;
					}
					if (point.y > y_max)
					{
						y_max = point.y;
					}					
				}				
				int height = y_max - y_min;
				int width = x_max - x_min;
				if (y_list.size() >= 3 && x_list.size() >= 4)
				{
					return notationFactory.createPolyline();
				}
				else if (y_list.size() == 3 && x_list.size() == 3)
				{
					return notationFactory.createDiamond();
				}
				else
				{
					if (x_list.size() == 2)
					{
						if (height == width)
						{
							return notationFactory.createSquare();
						}
						else
						{
							return notationFactory.createRectangle();
						}
					}
				}
				
			}
		}
		return notationFactory.createPolyline();
	}
}

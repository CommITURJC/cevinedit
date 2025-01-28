package org.cevinedit.core.eugenia;

import java.util.LinkedList;
import java.util.List;

public class EugeniaFigure {
	public static String FIGURE_RECTANGLE = "rectangle";
	public static String FIGURE_ELLIPSE = "ellipse";
	public static String FIGURE_ROUNDED = "rounded";
	public static String FIGURE_SVG = "svg";
	public static String FIGURE_POLYGON = "polygon";
	public static String FIGURE_DEFAULT = "default";
	public static String FIGURE_IMAGE = "image";
	
	public static List<String> list()
	{
		LinkedList<String> figures = new LinkedList<>();
		
		figures.add(FIGURE_RECTANGLE);
		figures.add(FIGURE_ELLIPSE);
		figures.add(FIGURE_ROUNDED);
		figures.add(FIGURE_SVG);
		figures.add(FIGURE_POLYGON);
		figures.add(FIGURE_DEFAULT);
		figures.add(FIGURE_IMAGE);
		
		return figures;
	}
	
	public static boolean isFigure(String figure)
	{
		return list().contains(figure);
	}
	
	public static String checkFigure(String figure)
	{
		return (figure.equals(FIGURE_DEFAULT)) ? FIGURE_RECTANGLE : figure;
	}
}

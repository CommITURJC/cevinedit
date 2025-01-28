package org.cevinedit.core.eugenia;

import java.util.LinkedList;
import java.util.List;

public class EugeniaBorderStyle
{
	public static String BORDER_STYLE_SOLID = "solid";
	public static String BORDER_STYLE_DASH = "dash";
	public static String BORDER_STYLE_DOT = "dot";
	public static String BORDER_DEFAULT = "default";
	public static List<String> list()
	{
		LinkedList<String> styles = new LinkedList<>();
		
		styles.add(BORDER_STYLE_SOLID);
		styles.add(BORDER_STYLE_DASH);
		styles.add(BORDER_STYLE_DOT);
		styles.add(BORDER_DEFAULT);
		return styles;
	}
	
	public static boolean isBorderStyle(String style)
	{
		return list().contains(style);
	}
	
	public static String checkStyle(String style)
	{
		return (style.equals(BORDER_DEFAULT)) ? BORDER_STYLE_SOLID : style;
	}
}

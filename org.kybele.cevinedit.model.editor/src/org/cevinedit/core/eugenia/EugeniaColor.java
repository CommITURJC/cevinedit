package org.cevinedit.core.eugenia;

import java.util.LinkedList;
import java.util.List;

import cevinedit.Brightness;

public class EugeniaColor 
{
	
	public static String COLOR_BLACK = "black";
	public static String COLOR_BLUE = "blue";
	public static String COLOR_CYAN = "cyan";
	public static String COLOR_GRAY = "gray";
	public static String COLOR_GREEN = "green";
	public static String COLOR_ORANGE = "orange";
	public static String COLOR_RED = "red";
	public static String COLOR_WHITE = "white";
	public static String COLOR_YELLOW = "yellow";
	public static String COLOR_DEFAULT = "default";
	
	

	public static List<String> list()
	{
		LinkedList<String> figures = new LinkedList<>();
		
		figures.add(COLOR_BLACK);
		figures.add(COLOR_BLUE);
		figures.add(COLOR_CYAN);
		figures.add(COLOR_GRAY);
		figures.add(COLOR_GREEN);
		figures.add(COLOR_ORANGE);
		figures.add(COLOR_RED);
		figures.add(COLOR_WHITE);
		figures.add(COLOR_YELLOW);
		figures.add(COLOR_DEFAULT);
		
		return figures;
	}
	
	public static boolean isFigure(String figure)
	{
		return list().contains(figure);
	}
	
	public static String checkColor(String figure)
	{
		return (figure.equals(COLOR_DEFAULT)) ? COLOR_WHITE : figure;
	}
	
	public static int[] ColorToRGB(String color)
	{
		color = color.toLowerCase();
		int rgb[] = new int[3];
		if (color.equals(COLOR_BLACK)) rgb = new int[]{0,0,0};
		if (color.equals(COLOR_BLUE)) rgb = new int[]{0,0,255};
		if (color.equals(COLOR_CYAN)) rgb = new int[]{0,255,255};
		if (color.equals(COLOR_GRAY)) rgb = new int[]{192,192,192};
		if (color.equals(COLOR_GREEN)) rgb = new int[]{0,255,0};
		if (color.equals(COLOR_ORANGE)) rgb = new int[]{255,128,0};
		if (color.equals(COLOR_RED)) rgb = new int[]{255,0,0};
		if (color.equals(COLOR_WHITE)) rgb = new int[]{255,255,255};		
		if (color.equals(COLOR_YELLOW)) rgb = new int[]{255,255,0};			
		if (color.equals(COLOR_DEFAULT)) rgb = new int[]{255,255,255};	
		return rgb;
	}
	
	public static int[] ColorToRGBWithBrightness(String color, String brightness)
	{
		color = color.toLowerCase();

		int rgb[] = new int[3];
		
		if (color.equals(COLOR_BLACK)) rgb = new int[]{0,0,0};
		if (color.equals(COLOR_WHITE)) rgb = new int[]{255,255,255};
		if (color.equals(COLOR_DEFAULT)) rgb = new int[]{255,255,255};
		if (color.equals(COLOR_BLUE))
		{
			if (brightness.equals(Brightness.LIGHT.getLiteral()))
			{
				rgb = new int[]{150,150,255};
			}
			else if (brightness.equals(Brightness.DARK.getLiteral()))
			{
				rgb = new int[]{0,0,130};
			}
			else
			{
				rgb = new int[]{0,0,255};
			}
		}
		if (color.equals(COLOR_CYAN))
		{
			if (brightness.equals(Brightness.LIGHT.getLiteral()))
			{
				rgb = new int[]{200,255,255};
			}
			else if (brightness.equals(Brightness.DARK.getLiteral()))
			{
				rgb = new int[]{0,180,180};
			}
			else
			{
				rgb = new int[]{0,255,255};
			}
		}		

		if (color.equals(COLOR_GRAY))
		{
			if (brightness.equals(Brightness.LIGHT.getLiteral()))
			{
				rgb = new int[]{245,245,245};
			}
			else if (brightness.equals(Brightness.DARK.getLiteral()))
			{
				rgb = new int[]{83,83,83};
			}
			else
			{
				rgb = new int[]{192,192,192};
			}
		}
		
		if (color.equals(COLOR_GREEN))
		{
			if (brightness.equals(Brightness.LIGHT.getLiteral()))
			{
				rgb = new int[]{196,255,196};
			}
			else if (brightness.equals(Brightness.DARK.getLiteral()))
			{
				rgb = new int[]{0,130,0};
			}
			else
			{
				rgb = new int[]{0,255,0};
			}
		}
		
		if (color.equals(COLOR_ORANGE))
		{
			if (brightness.equals(Brightness.LIGHT.getLiteral()))
			{
				rgb = new int[]{255,205,155};
			}
			else if (brightness.equals(Brightness.DARK.getLiteral()))
			{
				rgb = new int[]{187,94,0};
			}
			else
			{
				rgb = new int[]{255,128,0};
			}
		}		

		if (color.equals(COLOR_RED))
		{
			if (brightness.equals(Brightness.LIGHT.getLiteral()))
			{
				rgb = new int[]{255,132,132};
			}
			else if (brightness.equals(Brightness.DARK.getLiteral()))
			{
				rgb = new int[]{160,0,0};
			}
			else
			{
				rgb = new int[]{255,0,0};
			}
		}	
		

		if (color.equals(COLOR_YELLOW))
		{
			if (brightness.equals(Brightness.LIGHT.getLiteral()))
			{
				rgb = new int[]{255,255,170};
			}
			else if (brightness.equals(Brightness.DARK.getLiteral()))
			{
				rgb = new int[]{190,190,0};
			}
			else
			{
				rgb = new int[]{255,255,0};	
			}
		}		

		return rgb;
	}	
}

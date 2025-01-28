package org.cevinedit.core.eugenia;

import java.util.LinkedList;
import java.util.List;

public class EugeniaLabelPlacement {
	public static String LABEL_PLACEMENT_NONE = "none";
	public static String LABEL_PLACEMENT_INTERNAL = "internal";
	public static String LABEL_PLACEMENT_EXTERNAL = "external";
	
	public static List<String> list()
	{
		LinkedList<String> placements = new LinkedList<>();
		
		placements.add(LABEL_PLACEMENT_NONE);
		placements.add(LABEL_PLACEMENT_INTERNAL);
		placements.add(LABEL_PLACEMENT_EXTERNAL);

		
		return placements;
	}
	
	public static boolean isLabelPlacement(String style)
	{
		return list().contains(style);
	}	
}

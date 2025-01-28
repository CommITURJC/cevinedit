package org.cevinedit.config;

public class CevineditConfig 
{
	public static String getFolderNameOfEcoreGenerated()
	{
		return ".ecore_generated";
	}
	
	public static String getFolderNameOfEcoreOriginal()
	{
		return ".ecore_original";
	}
	
	public static String getFolderNameOfImages()
	{
		return ".images";
	}	
	
	public static String getFolderNameOfLanguages()
	{
		return "/lang/";
	}
	
	public static String getDefaultLanguage()
	{
		return "EN";
	}
	
	public static String getPathToEcoreOriginal()
	{
		return "/.ecore_original/original.ecore";
	}
	
	public static String getProjectPathToEcoreOriginal(String projectName)
	{
		return projectName + getPathToEcoreOriginal();
	}
}

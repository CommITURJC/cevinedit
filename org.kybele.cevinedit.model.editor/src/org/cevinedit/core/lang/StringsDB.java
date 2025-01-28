package org.cevinedit.core.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;

import org.cevinedit.config.CevineditConfig;
import org.cevinedit.editor.view.toolgenerator.CevineditToolGenerator;

public class StringsDB 
{
	Hashtable<String, String> texts = null;
	
	public StringsDB(String lang)
	{
		this.texts = new Hashtable<>();
		this.loadFile(lang);
	}
	
	public void processLine(String line)
	{
		String[] parts = line.split("=");
		
		String key = parts[0].trim();
		String text = parts[1].trim();
		
		this.texts.put(key, text);
	}
		
	public void loadFile(String lang)
	{
		String fileName = getFileNameByLang(lang);
		InputStream streamFileLang = StringsDB.class.getResourceAsStream(fileName);

	    BufferedReader reader = new BufferedReader(new InputStreamReader(streamFileLang));

	    StringBuffer buf = new StringBuffer();
	    String str = "";                        
	        try 
	        {
				while ((str = reader.readLine()) != null) 
				{ 
					processLine(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}               
	    
	
		
	}
	
	private static String getFileNameByLang(String lang)
	{

			return CevineditConfig.getFolderNameOfLanguages()+lang+".txt";

		

	}
	
	public String getText(String page, String key)
	{
		String keyText = page.toLowerCase() +"_"+key;
		
		return this.texts.get(keyText);
	}
}

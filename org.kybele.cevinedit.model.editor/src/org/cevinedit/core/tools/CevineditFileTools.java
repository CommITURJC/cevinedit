package org.cevinedit.core.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class CevineditFileTools {

	public static String get_actual_directory()
	{
		return (new File("")).getAbsolutePath();
	}
	
	public static File get_actual_directory_file()
	{
		return (new File(new File("").getAbsolutePath()));
		
	}
	
	public static File new_directory(String name)
	{
		File f = new File(get_actual_directory()+File.separator+name);
		
		f.mkdir();
		return f;
	}
	
	public static File new_file_actual_path(String name)
	{
		File f = new File(get_actual_directory()+File.separator+name);
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
	public static File new_file(String path)
	{
		File f = new File(path);
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
	public static void write_to_file(String file, String content)
	{
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new_file(file));
			writer.print(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			writer.close();
		}
		
		
        
	}
	
	public static String generate_string_from_lines(String lines[])
	{
		String s = "";
		for (String string : lines) {
			s += string +"\n";
		}
		return s;
	}
	
	public static void write_to_file(String file, String lines[])
	{
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new_file(file));
			writer.print(generate_string_from_lines(lines));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			writer.close();
		}
		
		
        
	}	
	

	
	public static String read_file(String file)
	{
		String content = "";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(get_actual_directory()+File.separator+file));
			String line = null;
			while ((line = reader.readLine()) != null) {
			    content +=line+"\n";
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}
	
	public static String[] read_file_lines(String file)
	{
		return read_file(file).split("\n");
	}
	
	public static String get_file_name(String path)
	{
		return path.substring(path.lastIndexOf("/")+1, path.lastIndexOf("."));
	}
	
	public static String[] get_subpaths_slash(String path)
	{
		return path.split("/");
	}
	
	public static String[] get_subpaths_point(String path)
	{
		return path.split("\\.");
	}
	
	public static String get_import(String path)
	{
		return path.replaceAll("/", ".").replaceAll(".java", "");
	}
	
	public static String get_package(String path)
	{
		return path.substring(0, path.lastIndexOf("."));
	}
	
	public static String get_class_name(String path)
	{
		return path.substring(path.lastIndexOf(".")+1);
	}
}

package org.cevinedit.core.tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class CevineditEcoreTools {


	public static EModelElement EObject2EModelElement(EObject _eobject)
	{
		return (EModelElement) _eobject;
	}	
	
	public static EClass EObject2EClass(EObject _eobject)
	{
		return (EClass) _eobject;
	}
	
	public static EAttribute EObject2EAttribute(EObject _eobject)
	{
		return (EAttribute) _eobject;
	}	
	
	public static EPackage EObject2EPackage(EObject _eobject)
	{
		return (EPackage) _eobject;
	}	
	
	public static EReference EObject2EReference(EObject _eobject)
	{
		return (EReference) _eobject;
	}		
	
	public static EAnnotation createEAnnotation(EObject _eobject, String _source)
	{
		if (_eobject instanceof EModelElement)
		{
			EAnnotation _eannotation = EcoreFactory.eINSTANCE.createEAnnotation();
			
			_eannotation.setEModelElement(EObject2EModelElement(_eobject));
			_eannotation.setSource(_source);
			EObject2EModelElement(_eobject).getEAnnotations().add(_eannotation);
			return _eannotation;
		}

		return null;		
	}
	
	public static boolean isSomething(EObject _eobject, Class _class)
	{
		return _eobject.getClass().equals(_class);
	}
	
	public static boolean isEClass(EObject _eobject)
	{
		return (_eobject instanceof EClass);
	}	

	public static boolean isEReference(EObject _eobject)
	{
		return (_eobject instanceof EReference);
	}

	public static boolean isEReferenceContainement(EObject _eobject)
	{
		if (isEReference(_eobject))
		{
			return EObject2EReference(_eobject).isContainment();
		}
		return false;
	}
	
	public static boolean isEReferenceNoContainement(EObject _eobject)
	{
		if (isEReference(_eobject))
		{
			return !EObject2EReference(_eobject).isContainment();
		}
		return false;
	}	
	
	public static boolean isEAttribute(EObject _eobject)
	{
		return (_eobject instanceof EAttribute);
	}
	
	public static boolean isEPackage(EObject _eobject)
	{
		return (_eobject instanceof EPackage);
	}
	
	public static String generate_ns_uri(String url, String path)
	{
		return "http://"+url+"/"+path;
	}
	
	public static String generate_ns_uri(String base, String []paths, int limit)
	{
		String http_path = "http://"+base+"/";
		int c = 0;
		for (String path : paths) 
		{				
			if (c>0) http_path += "/";
			http_path += path;
			if (limit == c) break;
			c++;
		}
		return http_path;
	}
	
	public static EPackage generate_root_package(String url, String name)
	{
		EPackage _epackage = EcoreFactory.eINSTANCE.createEPackage();
		
		_epackage.setName(name);
		_epackage.setNsPrefix(name);
		_epackage.setNsURI(generate_ns_uri(url, name));
		
		return _epackage;
	}
	
	public static List<EPackage> generate_epackages(String []paths)
	{
		ArrayList<EPackage> epackages_list = new ArrayList<>();
		
		int c = 0;
		for (String path : paths) 
		{

			EPackage p = EcoreFactory.eINSTANCE.createEPackage();
			p.setName(path);
			p.setNsPrefix(path);
			p.setNsURI(generate_ns_uri("www.arcangel.com", paths, c));
			
			if (epackages_list.size()>0)
			{

				epackages_list.get(c-1).getESubpackages().add(p);
			}
			epackages_list.add(p);
			c++;
		}
		
		return epackages_list;
	}
	
	public static boolean saveResource(Resource resource)
	{
		try 
		{
	      resource.save(Collections.EMPTY_MAP);
	      return true;
	    } 
		catch (IOException e) 
		{
			return false;
	    }
	}
	
	public static Resource generate_ecore(String path_ecore, String name_ecore, String url)
	{
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("ecore", new XMIResourceFactoryImpl());
	    
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    Resource resource = resSet.createResource(URI.createFileURI(path_ecore+"\\"+name_ecore+".ecore"));

	    resource.getContents().add(generate_root_package(url, name_ecore));
	    
	    saveResource(resource);
	    
	    return resource;
	    
	}
	
	public static Resource newEcore(String path_ecore, String name_ecore, String url)
	{
		return generate_ecore(path_ecore, name_ecore, url);
	}
	
	public static Resource loadEcore(String path_ecore)
	{
		ResourceSet rs = new ResourceSetImpl(); 

		// Register the default resource factory -- only needed for stand-alone! 
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl()); 

		// Register the package -- only needed for stand-alone! 
		EcorePackage ecorePackage = EcorePackage.eINSTANCE; 

		// Get the URI of the model file. 
		URI _uri = URI.createFileURI(path_ecore); 

		// Demand load the resource for this file. 
		Resource resource = rs.getResource(_uri, true); 

		return resource;

	}
	
	public static void generate_ecore(List<Class> _class_list)
	{
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    
	    Hashtable<String, EPackage> epackage_list = new Hashtable<>();
	    
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("ecore", new XMIResourceFactoryImpl());
	    
	    
	    
	   for (Class _class : _class_list) 
	   {
		   
		   String _classname = _class.getName();

		   
		   String _packagename = CevineditFileTools.get_package(_class.getName());

		   
		   
		   String []_subpaths = CevineditFileTools.get_subpaths_point(_packagename);
		   ArrayList<EPackage> _packages = (ArrayList<EPackage>) generate_epackages(_subpaths); 
		   
		   EClass _eclass = EcoreFactory.eINSTANCE.createEClass();
		   _eclass.setName(CevineditFileTools.get_class_name(_class.getName()));
		   
		   Class _parent = _class.getSuperclass();
		   EClass _eclass_parent = null;
		   if (_parent != null)
		   {
			   _eclass_parent = EcoreFactory.eINSTANCE.createEClass();
			   _eclass_parent.setName(CevineditFileTools.get_class_name(_parent.getName()));
			   String []_subpaths_parent = CevineditFileTools.get_subpaths_point(CevineditFileTools.get_package(_parent.getName()));
			   ArrayList<EPackage> _packages_parent = (ArrayList<EPackage>) generate_epackages(_subpaths); 
			   _packages.get(_packages.size()-1).getEClassifiers().add(_eclass_parent);
			   for (EPackage ePackage : _packages_parent) 
			   {
				if (!epackage_list.containsKey(ePackage.getName()))
				{
					epackage_list.put(ePackage.getName(), ePackage);

					if (ePackage.getESuperPackage() != null)
					{
						EPackage parent = epackage_list.get(ePackage.getESuperPackage().getName());
					
						parent.getESubpackages().add(ePackage);
					}
				}			   
			   }
			   epackage_list.get(_packages.get(_packages.size()-1).getName()).getEClassifiers().add(_eclass_parent);
		   
		   }
		   if (_parent != null)
			  _eclass.getESuperTypes().add(_eclass_parent);
		   //_packages.get(_packages.size()-1).getEClassifiers().add(_eclass);
		   for (EPackage ePackage : _packages) 
		   {
			if (!epackage_list.containsKey(ePackage.getName()))
			{
				epackage_list.put(ePackage.getName(), ePackage);


				if (ePackage.getESuperPackage() != null)
				{
					EPackage parent = epackage_list.get(ePackage.getESuperPackage().getName());
				
					parent.getESubpackages().add(ePackage);
				}
			}
		}
		   
		   epackage_list.get(_packages.get(_packages.size()-1).getName()).getEClassifiers().add(_eclass);
		   

	   }
	    
	    
	    
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    

	    // create a resource
	    Resource resource = resSet.createResource(URI
	        .createURI("swt.ecore"));

	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    
	    EPackage first = epackage_list.get("org");

	    
	    resource.getContents().add(first);
	    
	    // now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	}
	
	public static List<EReference> getEClassEReferencesNoContainement(EClass eclass)
	{
		LinkedList<EReference> listEReferenceNoContainement = new LinkedList<>();
		
		for(EReference ereference : eclass.getEAllReferences())
		{
			if (CevineditEcoreTools.isEReferenceNoContainement(ereference))
			{
				listEReferenceNoContainement.add(ereference);
			}
		}
		
		return listEReferenceNoContainement;
	}
	
	public static int numberOfEClassEReferencesNoContainement(EClass eclass)
	{
		return getEClassEReferencesNoContainement(eclass).size();
	}
	
	public static String[] EReferenceList2StringArray(List<EReference> list)
	{
		LinkedList<String> list_ereference_names = new LinkedList<>(); 
		for(EReference ereference : list)
		{
			list_ereference_names.add(ereference.getName());
		}
		
		return list_ereference_names.toArray(new String[]{});
	}
}

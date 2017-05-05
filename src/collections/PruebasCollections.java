package collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ejemplosCursoJava.Persona;

public class PruebasCollections {
	public static void main(String args[])
	{
		Set<Integer> s = new HashSet();
		s.add(1);
		s.add(3);
		
		System.out.println(s.isEmpty());
		System.out.println(s.contains(new Integer(1)));
		
		
		Map <String, String> map = new HashMap();
		
		map.put("Francia ", "Paris");
		map.put("España", "Madrid");
		System.out.println(map.containsValue("Paris"));
		System.out.println(map.containsKey("Francia"));
		for (String c : map.values())	
			System.out.println(c);
		
		List<String> lst = new LinkedList<String>();
				

		 lst.add("Mercury");
		 lst.add("Venus");
		 lst.add("Earth");
		 lst.add("JavaSoft ");
		 lst.add("Mars");
		 lst.add("Jupiter");
		 lst.add("Saturn");
		 lst.add("Uranus");
		 lst.add("Neptune");
		 lst.add("Pluto");

		 for(String elemento : lst)
			 System.out.println(elemento);

		 Iterator it = lst.iterator();
		    while (it.hasNext()) {
		    	System.out.println(it.next());	
		    }
		}
		
	}


package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization {
	
	public static Map<String, Integer> marksMap;
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	
	public static void main(String[] args) {
		// 1. using HashMap class
		
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>(); //using Map Interface
		System.out.println(map1);
		System.out.println(map2);
		
		//2. static way : static hashmap
		System.out.println(HashMapInitialization.marksMap.get("B"));
		
		//3. Immutable map with only single entry
		Map<String, Integer> map3 = Collections.singletonMap("test", 300);
		System.out.println(map3.get("test"));
		System.out.println(map3);
		//map3.put("test3", 400);// unsupported Exception as this is a singletonMap
		
		//4. JDK 8: 
		// Creating 2D Array of Strings using Stream and collecting in the form Map
		/*
		 * Map<String, String> map4 = Stream.of(new String[][] {"Tom", "A Grade"}
		 * {"Naveen", "A+ Grade"}, }).collect(Collectors.toMap(data -> data[0],
		 * data[1])); System.out.println(map4.get("Tom"));
		 */
		
		// create an empty map    
	      Map<String, String> emptymap = Collections.emptyMap();
	      System.out.println("Created empty immutable map: "+emptymap); 
	      emptymap.put("1","value"); // try to add elements
		
		
		
				
		
		
		
		
		
	}

}

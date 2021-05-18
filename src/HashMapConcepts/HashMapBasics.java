package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// no order- no indexing
		// stores Value in Key-Value <k,v>
		// key cannot be duplicate
		// only 1 null key, but can store multiple null values
		// It is not thread-Safe, unsynchronized
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New-Delhi");
		capitalMap.put("UK", "London");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("null", "Duplicate");
		capitalMap.put("null", "Russia");
		capitalMap.put("France", "null");
		capitalMap.put("Germany", "null");
		capitalMap.remove("France");
		
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get("Germany"));
		System.out.println(capitalMap.get("France"));
		
		// Using Iterator: over the Keys: by using keySet
		
		Iterator<String> it = capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key = " + key + " Value = " + value);
		}
		System.out.println("======================================");
		// Using Iterator: over the set(pair): by using entrySet
		
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> entry = it1.next();
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		
		System.out.println("======================================");
		// Iterate HashMap using java 8 for each and lambda:
		
		capitalMap.forEach((k,v) -> System.out.println("Key = " + k + " Value = " + v));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

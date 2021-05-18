package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New-Delhi");
		capitalMap.put("UK", "London");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("null", "Duplicate");
		capitalMap.put("null", "Russia");

		System.out.println("Map Size: " + capitalMap.size());

		Iterator it = capitalMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + "=" + pairs.getValue());
		}
		System.out.println("----------------------------");
		// Convert hashmap keys into ArrayList
		List<String> countryList = new ArrayList<String>(capitalMap.keySet());
		System.out.println(countryList);
		for (String t : countryList) {
			System.out.println(t);
		}
		// Convert hashmap values into ArrayList
		List<String> capitalValueList = new ArrayList<String>(capitalMap.values());
		System.out.println(capitalValueList);
		for (String a : capitalValueList) {
			System.out.println(a);
		}
	}

}

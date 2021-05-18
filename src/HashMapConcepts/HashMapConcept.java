package HashMapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("A", 76);
		marks.put("B", 85);
		marks.put("C", 100);
		marks.put("D", 35);
		marks.put("A", 150);
		
		marks.put(null, 100);
		marks.put(null, 200);
		
		

	}

}

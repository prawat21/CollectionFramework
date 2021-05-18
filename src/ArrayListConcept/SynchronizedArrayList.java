package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		//1. Collections.synchronizedList -- it's a method
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		// we don't need explicit Synchronization in adding/remove values from this list.
		
		// To fetch/traverse the values from this list--we have to use explicit Synchronization
		

		synchronized (namesList) {

			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//2. copyOnWriteArrayList -- it's a class: ThreadSafe/synchronized already
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Puneet");
		empList.add("Garima");
		empList.add("Ananya");
		empList.add("Ridhima");
		// we don't need explicit Synchronization for any Operation(adding/remove/traversing)
		
		Iterator<String> it = empList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
				
	}

}

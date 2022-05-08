package LinkedListConcept;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		System.out.println(linkedList.size());
		linkedList.add(10);
		linkedList.add(100);
		// Traversing the List
		for (Integer num : linkedList)
			System.out.println(num);

		// LinkedListMethods
		linkedList.add(1000);
		linkedList.add(1, null);
		System.out.println(linkedList);
		linkedList.addFirst(51);
		linkedList.addLast(10000);
		System.out.println(linkedList);
		System.out.println(linkedList.contains(1000));// true
		System.out.println(linkedList.element());// 51
		System.out.println(linkedList.getFirst()); // 51
		// linkedList.clear();
		System.out.println(linkedList.peekFirst());// 51
		linkedList.set(2, 111);
		System.out.println(linkedList);
		System.out.println(linkedList.size()); // 6
		Collections.sort(linkedList); // ascending order
		System.out.println(linkedList);
		Collections.reverse(linkedList); // descending order
		System.out.println(linkedList);
	}

}

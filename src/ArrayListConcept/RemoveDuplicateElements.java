package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,3,2,3,4,5,6,7,4,5,6,2,1));
		
		// 1. LinkedHashSet

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersList = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersList);
		
		// 2. JDK8 - stream:
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,10,20,3,2,3,4,5,6,7,4,5,6,10,20,2,1));
		List<Integer> uniquemarksList = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniquemarksList);
	}

}

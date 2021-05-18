package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		// 1. Sort and then Equals:
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("B", "A", "C" , "D", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C" , "D", "E"));
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1);
		
		System.out.println(l1.equals(l2)); //false
		
		//2. compare two list and find out the additional elements
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C" , "D", "F"));
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C" , "D", "E"));
		
		//l3.removeAll(l4);
		//System.out.println(l3);
		
		//3. find out the missing elements
		
		l4.removeAll(l3);
		System.out.println(l4); //E
		
		//4. find out common elements:
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java", "PHP", "C#" , "Ruby", "Python"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Python", "Java", "C#" , "Hello"));
		
		lang2.retainAll(lang1);
		System.out.println(lang2);
		
		
		
		
	}

}

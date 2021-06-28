package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("Puneet");//0
		ar1.add("Garima");//1
		ar1.add("Ananya");//2
		ar1.add("Rini");//3
		ar1.add("Laddoo");//4
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Automation");//0
		ar2.add("TestLEAD");//1
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		System.out.println("-----------------------------------");
		ar1.addAll(1, ar2);// Inserting the List to particular Index
		System.out.println(ar1);
		System.out.println("-----------------------------------");
		//ar1.clear();// for clear arrayList
		//System.out.println(ar1);
		//System.out.println("-----------------------------------");
		
		@SuppressWarnings("unchecked")
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		System.out.println(ar1.contains("Puneet"));//Returns boolean T/F
		System.out.println(ar2.contains("Puneet"));
		
		System.out.println(ar1.indexOf("Rini") > 1);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Pen", "Parrot","Pen","Love", "Copy", "Love","Testing"));
		System.out.println(list1);
		int i = list1.lastIndexOf("Testing");
		System.out.println(i);
		//System.out.println(list1.remove(2));//Remove particular element at given Index
		//System.out.println(list1);
		
		list1.remove("Pen"); // Remove particular element
		System.out.println(list1);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2 ==0);// To print Odd number from List
		System.out.println(numbers);
		
		numbers.removeIf(num -> num%2 !=0);// To print even numbers from List
		System.out.println(numbers);
		
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Pen", "Parrot","Pen","Love", "Copy", "Love","Testing"));
		System.out.println(list2);
		list2.retainAll(Collections.singleton("Love"));
		System.out.println(list2);
		
		// How to create the subList from ArrayList
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 7));
		System.out.println(subList);
		
		ArrayList<String> newlist = new ArrayList<String>(Arrays.asList("Pen", "Parrot","Mobile","Automate", "Copy", "Love","Testing"));
		Object arr[] = newlist.toArray();
		System.out.println(Arrays.toString(arr));
		
		for (Object o : arr) {
			System.out.println(o);
			//System.out.println((String)o);// for pure string values
		}
	}

}

package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Array List is a default Class and behaves like a dynamic array
		ArrayList<Object> ar = new ArrayList<>();
		ar.add(100);// index[0]
		ar.add(111);// index[1]
		ar.add("Rini");// index[2]
		ar.add("Puneet");// index[3]
		ar.add(2.2);// index[4]
		ar.add("Testing");// index[5]

		System.out.println(ar);
		System.out.println(ar.get(3));
		System.out.println(ar.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size() - 1));

		ar.add(444);// index[6]
		ar.add(333);// index[7]
		System.out.println(ar.size());
		System.out.println("-----------------------------");
		ar.add(3, "Rawat");
		System.out.println(ar);
		System.out.println("-----------------------------");

		// List with other Collection:
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(numbers);

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("GARIMA", "PUNEET", "LADDOO", "ANANYA"));
		System.out.println(names);
		System.out.println(names.size());
		System.out.println("-----------------------------");

		// ArrayList: Printing elements using Loop

		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i <= 5; i++) {
			num.add(i);
			System.out.println(num.get(i) + " " );// printing all elements one by one
		}
		System.out.println("Print all the elements: " + num); // print all the elements
		
		System.out.println("-----------------------------");
		num.remove(3);
		System.out.println(num); // remove element from index 3
		//num.clear();
		System.out.println(num.isEmpty());//false
		
		int lastIndex = num.lastIndexOf(7);
		System.out.println(lastIndex); // -1
		

	}

}

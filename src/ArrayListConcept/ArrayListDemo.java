package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Array List is a default Class and behaves like a dynamic array
		ArrayList<Object> ar = new ArrayList<>();
		ar.add(100);//index[0]
		ar.add(111);//index[1]
		ar.add("Rini");//index[2]
		ar.add("Puneet");//index[3]
		ar.add(2.2);//index[4]
		ar.add("Testing");//index[5]
		
		System.out.println(ar);
		System.out.println(ar.get(3));
		System.out.println(ar.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size()-1));
		
		ar.add(444);//index[6]
		ar.add(333);//index[7]
		System.out.println(ar.size());
		System.out.println("-----------------------------");
		ar.add(3, "Rawat");
		System.out.println(ar);
		System.out.println("-----------------------------");
		
		
		//List with other Collection:
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("JAVA","PUNEET","LADDOO","Hello"));
		System.out.println(names);
		System.out.println(names.size());
	}

}

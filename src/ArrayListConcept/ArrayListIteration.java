package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Puneet");//0
		studentList.add("Garima");//1
		studentList.add("Ananya");//2
		studentList.add("Rini");//3
		studentList.add("Laddoo");//4
		
		// Typical For Loop:
		for (int i = 0; i < studentList.size(); i++)
		{
			System.out.println(studentList.get(i));
		}
		
		System.out.println("----------");
		// for Each Loop:
		for (String s : studentList)
		{
			System.out.println(s);
		}
		
		System.out.println("----------");
		
		// JDK - 8 streams with lambda:
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		//Iterator
		System.out.println("----------");
		Iterator<String> it = studentList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}

package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<>(20);  
		//Default Virtual Capacity of ArrayList is 10. We can change it by pass the any value to the Constructor/ArrayList
		
		System.out.println(ar.size());// Physical Capacity is Zero
		
		ar.add(100);
		System.out.println(ar.size());// Physical Capacity is 'One'
		ar.add(100);
		ar.add(200);
		ar.add(300);

	}

}

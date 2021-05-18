package ArrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();// Only Integers Values are allowed
		marksList.add(100);
		System.out.println(marksList);
		
		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(100.0);
		System.out.println(arD);
		
		ArrayList<String> arS = new ArrayList<String>();
		arS.add("Puneet Loves GYM");
		arS.clone();
		System.out.println(arS);
		//arS.clear();
		

	}

}

package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ProgramForArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Print using for loop
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		// Print in square bracket like an array
		System.out.println(list);

		// Print using for each loop
		for (int list1 : list) {

			System.out.println(list1);
		}

		//print using Iterator
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		}

}
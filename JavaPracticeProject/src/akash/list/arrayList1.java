package akash.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class arrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();

		// add some elements in this list
		myList.add(12); // 0
		myList.add(45); // 01
		myList.add(67); // 02
		myList.add(45); // 03
		myList.add(89); // 04
		myList.add(79); // 05
		myList.add(9); // 06

		System.out.println("My list: " + myList); // print list value in array form
		myList.remove(5); // it remove 5 number index value that is 79
		System.out.println("After remove index of 5 " + myList);
		myList.add(3, 63);// add new aliment(63) at 3 number index
		System.out.println("after adding 63 at 3 index list: " + myList);
		System.out.println("Size of list: " + myList.size()); // return size of list like 7
		System.out.println("listis empty or not: " + myList.isEmpty()); // return list is Empty or not (True / False)
		// myList.clear(); // it clear all elements from the list.
		// System.out.println(myList);
		System.out.println("list has 45 nomber : " + myList.contains(45)); // it check the give number is in list or not
																			// (True / false)

		// to iterate with this data we have iterator
		Iterator<Integer> it = myList.iterator();

		// ".hasNext" it check the next element is present or not if yes loop continues
		// if no loop break
		System.out.println("\nThis is Iterat the list\n");
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}

package akash.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		// this is Linked List Same as Array list and Vector
		// but Slower then Array list
		// and memory location structure is different then Array list
		LinkedList<String> myList = new LinkedList<String>();

		// add some elements in this list
		myList.add("Akash"); // 0
		myList.add("Aneri"); // 01
		myList.add("Janki"); // 02
		myList.add("Hiya"); // 03
		myList.add("Drashti"); // 04
		myList.add("Jay"); // 05
		myList.add("Priyansh"); // 06

		System.out.println("My list: " + myList); // print list value in array form
		myList.remove(5); // it remove 5 number index value that is "Jay"
		System.out.println("After remove index of 5 " + myList);
		myList.add(3, "Ajay");// add new aliment("Ajay") at 3 number index
		System.out.println("after adding Ajay at 3 index list: " + myList);
		System.out.println("Size of list: " + myList.size()); // return size of list like 7
		System.out.println("list is empty : " + myList.isEmpty()); // return list is Empty or not (True / False)
		// myList.clear(); // it clear all elements from the list.
		// System.out.println(myList);
		System.out.println("list contains Jay : " + myList.contains("Jay")); // it check the give string is in list or
																				// not
																				// (True / false)

		// to iterate with this data we have iterator
		Iterator<String> it = myList.iterator();

		// ".hasNext" it check the next element is present or not if yes loop continues
		// if no loop break
		System.out.println("\nThis is Iterat the list\n");
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove(); // this is not happened in for-each loop
		}
		System.out.println(myList);

	}

}

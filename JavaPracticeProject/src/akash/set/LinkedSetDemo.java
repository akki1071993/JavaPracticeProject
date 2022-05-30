package akash.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		Set<String> set = new  LinkedHashSet<String>();
		
		set.add("Zinda");
		set.add("Aneri");
		set.add("Kunal");
		set.add("Mayank");
		set.add("sachin");
		set.add("Akash");
		System.out.println(set); //Original Set
		set.remove("Kunal");
		System.out.println(set);//After removing "Kunal"
		set.add("Kunal");
		System.out.println(set); //After Adding "Kunal"
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

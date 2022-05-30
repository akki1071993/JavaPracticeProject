package akash.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(65);
		set.add(20);
		set.add(9);
		set.add(35);
		set.add(19);
		
		System.out.println(set.size()); // give size of Hash set
		System.out.println(set.remove(9)); // Remove 9 from Hash set
		System.out.println(set.add(85)); // add new value in Hash set
		
		
		System.out.println(set);
		
		Iterator<Integer> it =  set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}

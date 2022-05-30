package akash.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Zinda");
		set.add("aneri");
		//set.add(null); null value can't store in Tree-Set
		set.add("Mayank");
		set.add("sachin");
		set.add("Akash");
		
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
		}

	}

}

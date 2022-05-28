package akash.stringDemo;

public class StringDemo {

	public static void main(String[] args) {

		// String is sequence of characters.

		/*
		 * We can create immutable string by use of String, Means we can't change the
		 * value of String in heap memory All methods of StringBuffer are unsynchronized
		 * That Means it faster the StringBuffer but not thread safe
		 */
		char ch[] = { 'A', 'k', 'a', 's', 'h' };
		String obj = new String(ch);
		System.out.println(obj);

		// Declare the string with value both are same
		String s = new String("Akash");
		System.out.println(s);

		String s1 = "Akash";
		System.out.println(s1);

		// We can change the value of s1
		s1 = "Mahant";
		System.out.println(s1);

		String s6 = "Akash";
		s.concat(" Mahant");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects

		
		System.out.println(s);
	}

}

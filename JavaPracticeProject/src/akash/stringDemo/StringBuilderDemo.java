package akash.stringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		/*
		 * We can create mutable string by use of StringBuilder, 
		 * Means we can change the value of StringBuilder 
		 * All methods of StringBuilder are unsynchronized 
		 * That Means it faster the StringBuffer but not thread safe
		 * all methods of string builder and string buffer are same the only difference is
		 * string buffer methods are synchronized where as String builder methods are 
		 * not synchronized
		 */
		
		
		String s1 = new String ("Akash Atulbhai");
		
		//convert String to string builder		
		StringBuilder  sb = new StringBuilder(s1);
		
		System.out.println(sb);
		
		sb.append(" Mahant");
		System.out.println(sb);
		

	}

}

package akash.stringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {

		/*
		 * We can create mutable string by use of StringBuffer, 
		 * Means we can change the value of StringBuffer 
		 * All methods of StringBuffer are synchronized 
		 * That Means it slower the StringBulider but thread safe
		 */

		 
		
		StringBuffer s1 = new StringBuffer("Akash Atulbhai Mahant");
		System.out.println(s1 + " length is " + s1.length());

		s1.append(" MCA"); // this function not happened in normal string
		System.out.println(s1 + " length is " + s1.length());

		System.out.println("Replace the value: " + s1.replace(6, 14, "A"));

		System.out.println(s1 + " length is " + s1.length());

		System.out.println(s1.reverse());
		System.out.println(s1.delete(0, 4));
		System.out.println(s1.reverse());

		
		
		String s2 = "Akash";
		//convert String to StringBuffer
		StringBuffer obj = new StringBuffer(s2);

		obj.append(" Atulbhai Mahant");

		System.out.println(obj);
	}

}

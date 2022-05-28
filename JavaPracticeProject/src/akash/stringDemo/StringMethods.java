package akash.stringDemo;

public class StringMethods {

	public static void main(String[] args) {
		// A|k|a|s|h| |A|t|u|l| b| h| a| i | _| M| a| h| a| n| t|
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

		String s1 = "Akash Atulbhai Mahant";

		String s2 = "        Akki Mahant";
		
	

		System.out.println("Original String 1: " + s1);
		System.out.println("String of length: " + s1.length()); // Check length of string
		System.out.println("String of Character at index 19 is : " + s1.charAt(19));// Check the index value of given
		System.out.println("String of Replace character 'A' to 'a': " + s1.replace('A', 'a')); // Replace character
		System.out.println("String convert in to upper case: " + s1.toUpperCase());// convert in to upper case
		System.out.println("String convert in to Lower case: " + s1.toLowerCase()); // convert in to Lower case
		System.out.println("String of Remove white spaces: " + s2.strip()); // Removed white spaces. //
		System.out.println("Compare with other// string: " + s1.compareTo("Akash Atullbhai Mahant")); // String comparison
		System.out.println("Check the index value of 'i': " + s1.indexOf('i'));
		System.out.println("last index of t " + s1.lastIndexOf('t')); // check last index of character
		System.out.println("" + s1.contains("bhai"));// Returns true if and only if this string contains the specified
		System.err.println("Replace the value: " + s1.replace('A','B') );
													

		String s3 = "apple-ball-cat-dog-egg-akash";
		String array[] = s3.split("-"); 	

		for (String i : array) {
			System.out.println((char) (i.charAt(0) - 32)
					+ (i.substring(1, i.length() - 1) + (char) (i.charAt(i.length() - 1) - 32)));
			/*
			 * this formula print first and last character of word convert into capital
			 * letter
			 */

		}

	}

}

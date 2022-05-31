package akash.searchEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class searchEmaiId {

	public static void main(String[] args) {

		List<String> email = new ArrayList<String>();

		email.add("akash@gmail.com");
		email.add("vijay@gmail.com");
		email.add("shubham@gmail.com");
		email.add("Dinesh143@gmail.com");
		email.add("pushpa62@gmail.com");
		email.add("jay56@gmail.com");
		email.add("mala@gmail.com");
		email.add("kushpPatel@gmail.com");

		try {
			String emailPattern = "^(.+)@(.+)$";
			Pattern pattern = Pattern.compile(emailPattern);

			String searchinString;
			int count = 0;
			Scanner s = new Scanner(System.in);

			System.out.println("Enter your email Id: ");
			searchinString = s.nextLine();

			Matcher matcher = pattern.matcher(searchinString);
			if (matcher.matches()) {
				for (String string : email) {
					if (string.compareTo(searchinString) == 0) {
						count = 0;
						break;
					} else
						count++;
				}

				if (count == 0)
					System.out.println("\"" + searchinString + "\"" + " is successfully found ! ");
				else
					System.out.println("Sorry \"" + searchinString + "\"" + " is not found ! ");
				
				

			} else
				System.out.println("\"" + searchinString + "\"" + " is not valid email.\nPlease try again !");
		} catch (Exception e) {
			System.out.println("Sorry somthing is worng");
			System.out.println("Error:" + e.getMessage());
		} finally {
			System.out.println("\n\nHappy to serve you ! See you again !");
		}

	}

}

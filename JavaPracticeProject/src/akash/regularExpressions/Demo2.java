package akash.regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args) {

		// Mobile number pattern with country code +91
		String mobileNoForIndia = "[+91]{3}[0-9]{10}";
		Scanner s = new Scanner(System.in);
		Pattern pt = Pattern.compile(mobileNoForIndia);

		System.out.println("Enter your mobile number: ");
		String mobileNo = s.nextLine();

		Matcher match = pt.matcher(mobileNo);

		if (match.matches()) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("not valid mobile number");
		}

	}
}

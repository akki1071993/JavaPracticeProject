package akash.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {

		String myPattern = "[a-zA-Z0-9]*"; // this is original pattern
		String input = "AkU9Tgc876";

		Pattern pt = Pattern.compile(myPattern); // Create pattern from original pattern
		Matcher match = pt.matcher(input);

		if (match.matches()) {
			System.out.println("Pattern match");
		} else {
			System.out.println("no pattern match");
		}
	}
}

package akash.regularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {

	public static void main(String[] args) {

		String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}"; // this is PAN card pattern
		List<String> emaillist = new ArrayList<String>();

		emaillist.add("DCUPM0550E");
		emaillist.add("ACUPM05D0E");
		emaillist.add("OPUPM09506");
		emaillist.add("MJKLS0850T");
		emaillist.add("AkyOp8549W");

		Pattern pt = Pattern.compile(regex); // Create pattern from original pattern

		for (String i : emaillist) {

			Matcher match = pt.matcher(i);
			if (match.matches()) {
				System.out.println("This is valide PAN Card: "+i);
			} else {
				System.out.println("This is not valide PAN Card: "+i);
			}
		}
	}
}

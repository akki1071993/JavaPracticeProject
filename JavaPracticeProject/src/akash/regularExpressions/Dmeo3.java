package akash.regularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dmeo3 {

	public static void main(String[] args) {

		
		ArrayList<String> emaillist=new ArrayList<String>();  
		
		String emailPattern = "^(.+)@(.+)$";
		
		emaillist.add("qwe@gmail.com");
		emaillist.add("akashgmail.com");
		emaillist.add("Viajy7895@gmail.com");
		emaillist.add("poal@ymail.com");
		emaillist.add("@gmail.com");
		emaillist.add("akashmahant143@gmail.com");
		emaillist.add("gmail.com");
		emaillist.add("fasal@yahoo.com");
		emaillist.add("ft85@ymail.com");
		emaillist.add("@gmail");		
		
		
		Pattern pattern = Pattern.compile(emailPattern);

		for (String i : emaillist) {
			Matcher matcher = pattern.matcher(i);
			if (matcher.matches()) {
				System.out.println("Valid:" + i);
			} else {
				System.out.println("not valid:" + i);
			}

		}
	}

}

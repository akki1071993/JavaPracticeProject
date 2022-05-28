package akash.searchEmail;

import java.util.Scanner;

public class searchEmaiId {

	public static void main(String[] args) {
		String Array[] = { "qwe.gmail.com", "xrtyye.gmail.com", "uhh.gmail.com", "ghjk.gmail.com", "j.gmail.com",
				"lkj.gmail.com", "okjj.gmail.com", "rgkm.gmail.com", "ojh.gmail.com", "rjp.gmail.com",
				"plk.gmail.com" };
		
		String searchinString = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your email Id");
		searchinString = s.nextLine();
		
		for (String i : Array) {
			
			if(i.equals(searchinString)) {
				System.out.println("Email found");
				break;
			}
			else {
				System.out.println("Email not found");
			}
						
		}

	}

}

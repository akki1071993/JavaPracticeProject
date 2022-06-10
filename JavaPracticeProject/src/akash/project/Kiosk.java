package akash.project;

import java.util.Scanner;
import java.util.ArrayList;

public class Kiosk {
	private static ArrayList<String> lst = new ArrayList<>();

	public static void addFile() {
		System.out.println("Enter file Name to add the file");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		lst.add(s);
		System.out.println("File Added Successfully");
		keyRepository();
	}

	public static void deleteFile() {
		System.out.println("Enter file Name to Delete");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).equals(s)) {
				lst.remove(i);
				System.out.println("File found and deleted");
				keyRepository();
			}
		}
		System.out.println("FileNot found");
		keyRepository();

	}

	public static void searchFile() {
		System.out.println("Enter file Name to Search");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (String str : lst) {
			if (str.equals(s)) {
				System.out.println("File " + s + " found");
				keyRepository();
			}
		}
		System.out.println("FileNot found");
		keyRepository();
	}

	public static void keyRepository() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose a Operation");
		System.out.println("1. Add a File");
		System.out.println("2. Delete a File");
		System.out.println("3. Search a File");  
		int input = sc.nextInt();				
		if (input == 1) {
			addFile();
		} else if (input == 2) {
			deleteFile();
		} else {
			searchFile();	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Company Lockers Pvt Ltd");
		keyRepository();

	}

}

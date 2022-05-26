package akash.oops;

public class Student {
	int rollNo = 0;
	String name = null;
	int class_no = 0;
	char std = 0;

// This is constructor for student class
	public Student(int rollNo, String name, int class_no, char std) {
		this.rollNo = rollNo;
		this.name = name;
		this.class_no = class_no;
		this.std = std;
	}

	public void displayData() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Class: " + class_no);
		System.out.println("Stander: " + std);
	}

	public void projeckOn() {
		System.out.println("Project is on");
	}

	public void classTiming() {
		if (class_no <= 4) {
			System.out.println("School timing is 9 AM to 2 PM");
		} else if (class_no <= 10) {
			System.out.println("School timing is 11 AM to 4 PM");
		} else if (class_no <= 12) {
			System.out.println("School timing is 12 AM to 6 PM");
		}
	}
}

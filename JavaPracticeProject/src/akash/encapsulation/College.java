package akash.encapsulation;

public class College {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setRollNo(104);
		s1.setName("Akash");
		s1.setDepartment("BCA");

		System.out.println("Student Name:" + s1.getName() + "\n" + "Student Roll Number: " + s1.getRollNo() + "\n"
				+ "Student Department: " + s1.getDepartment());

		// by using Constructor  
		Student s2 = new Student(105,"Jay","MCA");

		if (s2.getName() != null) {
		System.out.println("Student Name:" + s2.getName() + "\n" + "Student Roll Number: " + s2.getRollNo() + "\n"
				+ "Student Department: " + s2.getDepartment());
		}

	}
}

package akash.encapsulation;

public class Student {
	private int rollNo;
	private String name;
	private String department;

	// to give access create getter and setter methods

	public Student() {
	}

	public Student(int rollNo, String name, String department) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
	}

	// get method always return a value from same data-type
	public int getRollNo() {
		return rollNo;
	}

	// setter method always void and have at least have one parameter
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

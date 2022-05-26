package akash.oops;

public class School {
	public static void main(String[] args) {

		Student student1 = new Student(4, "Akash", 1, 'A');
		Student student2 = new Student(15, "Jay", 8, 'F');
		Student student3 = new Student(18, "Vijay",12, 'C');

		student1.displayData();
		student1.projeckOn();
		student1.classTiming();
		
		student2.displayData();
		student2.projeckOn();
		student2.classTiming();
		
		student3.displayData();
		student3.projeckOn();
		student3.classTiming();
	}

}

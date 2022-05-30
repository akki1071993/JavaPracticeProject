package akash.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Employee> data = new ArrayList<Employee>();

		data.add(new Employee(422, "Akash A Mahant", "ak@gmail.com"));
		data.add(new Employee(203, "Aneri A Mahant", "annu@gmail.com"));
		data.add(new Employee(845, "Janki A Achary", "jk@gmail.com"));
		data.add(new Employee(652, "vijay A Soni", "vijay@gmail.com"));
		data.add(new Employee(298, "lalit A Patel", "lPPatel@gmail.com"));

		for (Employee employee : data) {
			System.out.println(
					"Id: " + employee.geteId() + " Name: " + employee.getName() + " Email:" + employee.getEmailId());
		}
	}
}

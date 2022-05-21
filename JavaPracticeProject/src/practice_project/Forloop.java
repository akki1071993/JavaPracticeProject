package practice_project;

public class Forloop {

	public static void main(String[] args) {
		
		int a[] = { 5, 10, 15, 20, 25 };
		int sum = 0;

		// for loop
		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}

		// for-each loop
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println("Sum of array numbers");
		System.out.println(sum);

	}

}

package practice_project;
import java.util.Scanner;
class Sum {
	
	static int Add(int x, int y) {
		return x + y;
	}

	static float Add(float x, float y) {
		return x + y;
	}

	static float Add(float x, int y) {
		return x + y;
	}
	
	static String Add(float x, int y, String s) {
		return x + y + " "+s;
	}
}

public class Overloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enete First paramiter");
		int a = sc.nextInt();
		System.out.println("Enete Second paramiter");
		int b = sc.nextInt();
		
		System.out.println(Sum.Add(a,b));
		System.out.println(Sum.Add(10.5f, 20.5f));
		System.out.println(Sum.Add(10.50f, 20));
		System.out.println(Sum.Add(10.75f, 20,"This is"));
	}
}



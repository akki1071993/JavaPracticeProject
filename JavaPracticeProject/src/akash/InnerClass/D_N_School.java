package akash.InnerClass;

public class D_N_School {

	public static void main(String[] args) {
		
		School s = new School() {
			
		
			public void SchoolType() {
				System.out.println("Lower School");
				
			}
			public void SchoolTime() {
				System.out.println("11:00 Am to 5:00 Pm");
				
			}
			public void SchoolAddress() {
				System.out.println("Anand 388500");
				
			}
		};
		
		s.SchoolAddress();
		s.SchoolTime();
		s.SchoolType();

	}

}

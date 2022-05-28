package akash.InnerClass;

public class T_B_HighSchool {

	public static void main(String[] args) {
		
		School s = new School() {
			
			
			public void SchoolType() {
				System.out.println("Primery School");
				
			}
			
			
			public void SchoolTime() {
				System.out.println("9:00 AM to 2:00 PM");
				
			}
			
			
			public void SchoolAddress() {
				System.out.println("Station Road Anand 388001");
				
			}
			
			
		};
		
		s.SchoolTime();
		s.SchoolType();
		s.SchoolAddress();
	

	}

}

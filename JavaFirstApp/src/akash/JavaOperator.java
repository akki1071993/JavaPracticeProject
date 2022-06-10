package akash;

public class JavaOperator {
	public static void main(String[] args) {
				
		System.out.println("------Java Arithmetic Operators---------");
		int a=10;  
		int b=5;  
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0
		
		System.out.println("------Java Unary Operator Example: ~ and !-----------");
		int p=10;  
		int q=-10;  
		boolean y=true;  
		boolean s=false;  
		System.out.println(~p);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~q);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!y);//false (opposite of boolean value)  
		System.out.println(!s);//true  
		
		System.out.println("--------------(++ and --)----------------");
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		System.out.println("-Prefix increment------------Postfix increment---");
		// Prefix increment
		int prefix =10;  	
		System.out.println( ++prefix ); //11
		System.out.println(prefix); //11
		
		// Postfix increment
		int postfix =10;  
		System.out.println(postfix++ ); //10
		System.out.println(postfix);//11
		  
		
		
		System.out.println("---------Java Arithmetic Operator Example------------");
		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
		
		
		
		
		short p1=2;  
		short p2=5;  
		int min=(p1<p2)?p1:p2;  
		System.out.println(min);
		
		p1 = (short) (p1+p2);
		System.out.println(p1);
		
		
		//the below comment will be executed  
		// \u000d System.out.println("Java comment is executed!!");  
	
		
		
	}

}

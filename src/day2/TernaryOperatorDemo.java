package day2;

public class TernaryOperatorDemo {
	
	public static void main(String[]args) {
		
		//6. Conditional or ternary operator  ?, :  
		
		int age = 15;
		String result = (age >=18) ? "Eligible to vote" : "Not eligible!!";
		System.out.println(result);
		
		int a =25, b = 10;
		//System.out.printf("intial value of a %d and b %d", a,b);
		System.out.println("intial value of a is: " + a + "and b is: " + b);
		
		a = a + b;//35
		b= a- b;//25
		a = a-b;
		
		System.out.printf("final value of a %d and b &d", a,b);
		
	}

}

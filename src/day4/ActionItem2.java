package day4;

public class ActionItem2 {
	
	
	public static void main(String[]arays) {
		
		
		System.out.println("Factorial is : " + doFactorial(9));
		
		System.out.println("Fahrenheit value is : " + convertToFahrenheit(42));
		
	}
	
	//doFactorial is a method 
	//int number is boolean 
	public static int doFactorial(int number) {
		//declare a new int type variable
		int factorial = 1;
		while(number > 1) {
			factorial *=number;//we are multiplying subsequent values with factorial
			number --;//decrementing the given number in every iteration
		}
		
		return factorial;//returning the calculated value
		
	}
	
	public static double convertToFahrenheit(int celcius) {
		double fahrenheit;
		fahrenheit = ((celcius * 9)/5)+ 32;//conversion formula
		return fahrenheit;
	}
	

}

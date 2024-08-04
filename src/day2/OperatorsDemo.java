package day2;

public class OperatorsDemo {
	
	public static void main(String[]args) {
		
		//1. Arithmetic operators
	//there is 5 types of arithmetic operators:
			//+, -, * ,/, %
		
		int a = 20, b= 10;
		
		System.out.println("sum of a and b is :" + (a+b));//answer is 30.
		System.out.println("Diff of a and b is :" + (a-b));//answer is 10.
		System.out.println("Multi of a and b is :" + (a*b));//answer is 200.
		System.out.println("Divided of a and b is :" + (a/b));//answer is 2.
		System.out.println("Modolus of a and b is :" + (a%b));//answer is 0.
		
		//2. Relational operators/ comparison operators
		        // >, <, >=, <=, !=(not equal), ==
		//Returns boolean value -true or false
		
		 
		
		System.out.println("===Relational Operators===".repeat (3));
		
		//int a = 20, b = 10;
		
		System.out.println(a>b);//true
		System.out.println(a<b);//False
		System.out.println(a>=b);//true
		System.out.println(a<=b);//False
		System.out.println(a==b);//False
		System.out.println(a!=b);//true
		
		//3. logical operators
		//there is only three types of logical operators
		//&&(logical and operators) ||(logical long operators) !(not equal)
		//returns a boolean value
		//works between 2 boolean values
		System.out.println("===Logical Operators===".repeat (3));
		
		boolean x = true, y = false;
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println( !x);//false
		System.out.println( !y);//true
		
		
		
		
		
		
		
		
	}

}

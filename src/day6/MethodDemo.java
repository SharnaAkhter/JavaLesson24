package day6;

/*1. method name is a user defined name 
 * but it should be display the intent of performing an action
 * 2. method may or may not return any value
 * 3. method may or may not be accept parameters
 * methods can be invoked through objects
 * a method is created to perform some actions
 * 
 */

public class MethodDemo {
	//1 no params and no return
	
	public void methodOne() {
		System.out.println("hey, we are learning method!");
	}
	
	//2. no params return value
	public String methodTwo() {
		String a = "hello.";
		String b = "How are you?";
		return a + b;
	}
	
	//3. accepts a param but does not return
	public void methodThree(String name) {
		System.out.println(name + ", How are you?");
	}
	//4. accepting params and returning values
	public int add(int a, int b) {
		return (a+ b);
	}

}

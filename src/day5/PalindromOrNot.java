package day5;

public class PalindromOrNot {
	
	public static void main(String[]args) {
		int orginalNumber = 8654301, reverse = 0;
		
		System.out.println("The orginal number is: "  + orginalNumber);
		int number =orginalNumber;
		
		while(number !=0) {
			
			int remainder = number % 10;
			
			reverse = reverse * 10 + remainder;
			
			number = number/10;
		}
		
		System.out.println("The reverse is: "  + reverse);
		if (orginalNumber == reverse) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("Not a palindrome");
			
		}
	}

}

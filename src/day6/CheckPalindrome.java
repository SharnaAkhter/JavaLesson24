package day6;

public class CheckPalindrome {
	//q6
	public static void main(String[]args) {
		
		String input = "Oracle";
		System.out.println("Given string is a palindrom = " + isPalindrom(input));
		String doubtfullInput = "This is my string with special character:*&^%$#@!";
		String result = doubtfullInput.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
		
	}
	
	public static boolean isPalindrom(String str) {
		String reversed = " ";
		for(int i = str.length()-1;i >=0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);
	}

}

package day3;

public class SwitchStatementDemo {
	
	public static void main(String[]args) {
		//DAY 3 STARTED WITH IF STATEMENT
		/* Conditional statements
		 * 
		 * if 
		 * if else
		 * switch statements
		 * 
		 */
		/**SYNTAX OF SWITCH STATEMENT
		 switch(variable) {
		case 1 : {
			//code
			break;
		}
		case 2 :{
			//code
			break;
		}
		
		default:
		{
			//code
		}
		*/
		
		int num = 1;
	switch(num) {
	case 1:{
		System.out.println("Monday");
		break;
	}
	
	case 2:{
		System.out.println("Tuesday");
		break;
	}
	
	case 3:{
		System.out.println("Wednesday");
		break;
	}
	default:{
		System.out.println("This is not any day of the week");
	}
	
	
	
	
	}
	
	System.out.println("out of switch statement");
	
	determineBrowser("chrome");
	
		
		
		
		
		
	}
	
	/*write a switch statement to determine
	 *  which browser to launched?
	 * The browser options are:Chrome,firefox,edge
	 */
	//browserName inside string is parameter
	//determineBrowser is method
	//what is method- it's independent code which can be executed independently
	//void is return name
	public static void determineBrowser(String browserName) {
		switch(browserName) {
		case "chrome":{
			System.out.println("Lauch chrome browser");
			break;
		}
		case "firefox":{
			System.out.println("Lauch firefox browser");
			break;
		}
		case "edge":{
			System.out.println("Lauch edge browser");
			break;
		}
		default:{
			System.out.println("This browser is not supported");
		}
			
		}
		
		
		
	}
	
}



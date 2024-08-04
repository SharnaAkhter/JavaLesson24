package day5;

public class PrintDayNumber {
	
	public static void main(String[]args) {
		
		String dayName = "Monday".toLowerCase();
		
	switch(dayName) {
	case "Monday":{
		System.out.println("Day One");
		break;
	}
	case "Wednesday":{
		System.out.println("Day two");
		break;
	}
	case "Tednesday":{
		System.out.println("Day three");
		break;
	}
	case "Thrusday":{
		System.out.println("Day four");
		break;
	}
	case "Friday":{
		System.out.println("Day five");
		break;
	}
	case "Saturday":{
		System.out.println("Day six");
		break;
	}
	case "Sunday":{
		System.out.println("Day Seven");
		break;
	}
	default:{
		System.out.println("invalid day name");
		//return;
	}
	
	
	}
		
		
		
	}

}

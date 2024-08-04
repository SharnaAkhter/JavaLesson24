package day4;

public class HowManyTimesNumberRepeatInArray {
	
	
	public static void main(String[]args) {
		int a[]= {10,30,40,30,30,40,45,50,20,10};
		int numLookingFor = 99;
		int count = 0;
		
		for(int value :a) {
			if(value ==numLookingFor) {
				count++;
			}
		}
		
		System.out.println(numLookingFor + " is present " + count + " times. ");
	}
	

}

package day6;

public class ActionItem4 {
	
	public static void main(String[]args) {
		
	/*	//q1 find sum of elements in an int array:
		int[] myArray = {23,6,8,34,87,53,88};
		int sum = 0;
		for(int value : myArray) {
			sum = sum + value;
			
		}
		
		System.out.println("The sum of all the elements of myArray is: " + sum);
		*/
		
		//q2. print even and odd numbers from an array
		int[] arr = {2,7,3,78,23,44,66,35};
		System.out.println("printing all the odd numbers: ");
		for(int i=0;i<arr.length; i++) {
			if(arr[i] % 2 !=0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("printing all the even numbers: ");
		for(int i=0;i<arr.length; i++) {
			if(arr[i] % 2 ==0) {
				System.out.print(arr[i] + " ");
			}
		}
		
	
	}
	
	
	
	
	
	
	

}

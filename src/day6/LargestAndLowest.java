package day6;
import java.util.Arrays;
public class LargestAndLowest {
	//q4 and q5
	public static void main(String[]args) {
		int arr[] = {3,8,8,9,2,67,34};
		//using iteration(greedy approach):
		int mini = arr[0];
		int max = arr[0];
		
		for(int i =0; i <arr.length; i++) {
			if (arr[i] < mini) {
				mini = arr[i];
				
			}else if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("The minimum number is: " + mini);
		System.out.println("The maximum number is: " + max);
		
		//using predefined functions/library
		int minimum = Arrays.stream(arr).min().getAsInt();
		int maximum = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("minimum is: " + minimum);
		System.out.println("maximum is: " + maximum);
	}

}

package day4;

public class TwoDimensionArray {
	public static void main(String[]args) {
		
		//declaration 
		int a[][] = new int[3][2];
		
		//assigning values to the cells
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=600;
		a[1][1]=700;
		
		
		a[2][0]=800;
		a[2][1]=900;
		//extracting signle value
		System.out.println(a[1][1]);
		
		int b [][]= {{1,2,10},{3,4,23},{5,6,24,67,45}};
		System.out.println(b[2][1]);
		
		for(int i =0;i<a.length;i++) {
			for(int j =0; j <a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Printing all the values from b array");
		for(int i=0;i<b.length;i++) {
			for(int j=0; j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		System.out.println("Extracting all the values using enhanced for loop");
		for(int arr[]:b) {
			for(int var:arr) {
				System.out.println(var + " ");
			}
			System.out.println();
		}
		
	}

}

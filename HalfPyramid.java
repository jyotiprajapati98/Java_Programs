/*
		*
		**
		***
		****
		****
*/
import java.util.Scanner;
class HalfPyramid{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Rows and Column for Half Pyramid , row nad column should equal for pattern");
		int rows = scan.nextInt();
		int column = scan.nextInt();
		
		//Logic for pattern
		for(int i=0;i<rows;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}
}

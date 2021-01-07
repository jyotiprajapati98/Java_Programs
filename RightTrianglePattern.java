import java.util.Scanner;
class RightTrianglePattern{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Rows and Column for Half Pyramid , row nad column should equal");
		int rows = scan.nextInt();
		//int column = scan.nextInt();
		
		//logic for pattern
		
		//outer loop
		for(int i=0;i<rows;i++){
			
			//we need space
			for(int j=i;j<rows;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
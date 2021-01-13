import java.util.Scanner;
class DownwardTringlePattern{
	public static void main(String args[]){
		System.out.print("Enter number for rows-->");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
		//logic
		
		for(int i=row-1;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
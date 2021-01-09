import java.util.Scanner;
class PyramidStarPattern{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter rows and columns");
		int rows = scan.nextInt();
		int t=0;
		//logic
		for(int i = 1 ; i<rows;++i,t=0){
			
			//for spaces
			for(int j =1;j<= rows-i;++j){
				System.out.print(" ");
			}
			while(t!=2*i-1){
				System.out.print("*");
				t=t+1;
			}
			System.out.println("");
		}
		
	}
}
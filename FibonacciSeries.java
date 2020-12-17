import java.util.Scanner;
class FibonacciSeries{
	static int num1 =0 , num2 = 1 ,sum =0;
	static void printFibo(int limit){
		System.out.println("Your Fibo Series limit is "+limit);
			//print first and second term
			System.out.print(num1 + " " +num2);
				
			//start for loop from second because already 2 numbers printed
			
			for(int i=2;i<limit;i++){
			sum = num1 + num2;
			System.out.print(" "+sum);
			num1=num2;
			num2=sum;
			}
	}
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for fibo series");
		int limit = scan.nextInt();
		printFibo(limit);
	}
}
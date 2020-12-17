import java.util.Scanner;
class RecursiveFibo{
	static int num1=0,num2=1,sum=0;
	static void printFibo(int count){
		if(count>0){
			sum = num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(" "+sum);
			printFibo(count-1);
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the limit for Fibonacci series");
		int count = scan.nextInt();
		//because 2 numbers alrea printed
		System.out.print(num1+ " "+num2);
		printFibo(count-2);
	}
}
import java.util.Scanner;
class FactorialByRecursion{
	static int f =1;
	static int fact(int n){
		if(n==0){
			return 1;
		}
		else{
			return(n * fact(n-1));
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for the factorial -->");
		int num = scan.nextInt();
		int result = fact(num);
		System.out.println("factorial of the "+num+ " is ---> "+result);
	}
}
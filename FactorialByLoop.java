import java.util.Scanner;
class FactorialByLoop{
	static int fact=1;
	public static int fact(int n){
		
		if(n==0){
			return 1;
		}
		
		for(int i=1;i<=n;i++){
				fact = fact *i;
				
		}
		return fact;	
		
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for factorial");
		int num = scan.nextInt();
		int result = fact(num);
		System.out.println("factorial of "+num+" is ---> "+result);
	}
}
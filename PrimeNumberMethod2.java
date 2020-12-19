import java.util.Scanner;
class PrimeNumberMethod2{
	
	//method for prime number evaluation
	public static Boolean checkPrime(int number){
		if(number<1){
			return false;
		}
		for(int i = 2;i <Math.sqrt(number);i++){
			if(number % i ==0){
				return false;
			}
		}
		return true;
	}
	
	//main class
	public static void main(String agrs[]){
		Scanner scan = new Scanner(System.in);//Scanner object for user input
		System.out.println("Enter number of checking");
		int number = scan.nextInt();
		if(checkPrime(number)){
			System.out.println(number+" is prime number");
		}
		else{
			System.out.println(number+" not a prime number ");
		}
	}
}
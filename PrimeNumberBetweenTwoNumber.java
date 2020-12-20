import java.util.Scanner;
class PrimeNumberBetweenTwoNumber{
	
	static int flag = 0;
	
	public static void checkPrime(int n1 , int n2){
		for(int i = n1;i<= n2;i++){
			
			//this if is for checkng the number because 0 and 1 is not a prime number 
			if(i == 0 || i==1){
				continue;
			}
			flag=1;
			
			//we check from 2 to till limit
			for(int j = 2; j<= i / 2 ;j++){
				if( i % j == 0){
					flag =  0;
					break;
				}
			}
			//flag = 1 mean i is prime nummber else not a prime number
			if(flag == 1){
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		//user inputs
		System.out.println("Enter two number and find out the prime number between them");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("List of the numbers between " +num1+" and "+num2);
		//call a method to check the prime numbers 
		checkPrime(num1,num2);
	}
}
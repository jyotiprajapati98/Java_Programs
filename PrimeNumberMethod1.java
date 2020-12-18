import java.util.Scanner;

class PrimeNumberMethod1{
	static int temp = 0, flag=0;
	static void checkPrime(int num){
		temp = num/2;
		System.out.println("value of num/2 is ="+temp);
		if(num==0||num==1){
			System.out.println(num +" is not a prime number");
		}
		else{
			for(int i = 2;i<=temp;i++){
				if(num%i==0){
					System.out.println(num+" is not prime");
					flag = 1;
					break;
				}
			}
			if(flag==0){
				System.out.println(num+" num is prime");
			}
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number for prime number checking");
		int num = scan.nextInt();
		checkPrime(num);
	}
}
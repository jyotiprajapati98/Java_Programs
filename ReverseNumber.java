import java.util.Scanner;
class ReverseNumber{
	static int rev = 0;
	public static void reverse(int n){
		int rev = 0;
		while(n!=0){
			int rem = n % 10; // moduls result after division(reminder)
			rev= rev * 10 + rem;
			n = n/10;
		}
		System.out.println("reverse of number is "+rev);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for reverse");
		int number = scan.nextInt();
		reverse(number);
	}
	
}
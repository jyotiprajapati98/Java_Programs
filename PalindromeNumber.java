import java.util.Scanner;
class PalindromeNumber{
	static int rem , sum =0 , temp;
	static void checkPalindome(int num){
		temp = num;
		while(num>0){
			rem = num % 10;
			sum = (sum * 10) +rem;
			num = num /10;
		}
		if(temp==sum){
			System.out.println(temp+" is Palindrome ");
		}
		else{
			System.out.println(temp+" is not a palindrome");
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check Palindrome ");
		int number = scan.nextInt();
		checkPalindome(number);
	}
}
import java.util.Scanner;
class PalindromeNumberString{
	public static void main(String args[]){
		String s , reverse ="";
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string or number");
		s=scan.nextLine();
		int length = s.length();
		
		for(int i = length-1;i>=0;i--){
			reverse = reverse + s.charAt(i);
		}
		if(s.equals(reverse)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	
	}
}
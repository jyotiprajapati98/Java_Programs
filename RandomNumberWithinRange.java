import java.lang.Math;
import java.util.Scanner;
class RandomNumberWithinRange{
	public static void main(String agrs[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minmum and Maximum values for random number generation");
		int min = scan.nextInt();
		int max = scan.nextInt();
		
		System.out.println("Random number between the "+ min + " and "+max+ " --->");
		double num1 = Math.random()*(max-min+1)+min;
		System.out.println("1st number -->"+num1);
		
		double num2 = Math.random()*(max-min+1)+min;
		System.out.println("2nd number -->"+num2);
	}
}
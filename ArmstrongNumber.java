import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong number");
		int number = scan.nextInt();
		
		//checking for Armstring number 
		int temp, count = 0;
		int reminder;
		temp = number;
		if(number==0){
			System.out.println("enter grater than 0");
		}
		while(number>0){
				reminder = number % 10;
				number = number /10;
				count = count+(reminder*reminder*reminder);
		}
		if(temp == count){
				System.out.println("Armstrong number");
		}
			else{
				System.out.println("Not Armstrong number");
			}
	}
}
import java.util.Random;
class RandomNumberByRandomClass{
	public static void main(String args[]){
		Random random = new Random();
		
		//here 50 and 500 are upper bound
		int x = random.nextInt(50);
		int y = random.nextInt(500);
		System.out.println("Integers-->");
		System.out.println("1st number "+x);
		System.out.println("2nd number "+y);
		
		System.out.println("Double-->");
		double d1 = random.nextDouble();
		double  d2 = random.nextDouble();
		System.out.println("1st number "+d1);
		System.out.println("2nd number "+d2);
		
		System.out.println("Float-->");
		float f1 = random.nextFloat();
		float  f2 = random.nextFloat();
		System.out.println("1st number "+f1);
		System.out.println("2nd number "+f2);
		
		System.out.println("Long-->");
		long l1 = random.nextLong();
		long  l2 = random.nextLong();
		System.out.println("1st number "+l1);
		System.out.println("2nd number "+l2);
		
		System.out.println("Boolean-->");
		boolean b1 = random.nextBoolean();
		boolean  b2 = random.nextBoolean();
		System.out.println("1st number "+b1);
		System.out.println("2nd number "+b2);
	}
}
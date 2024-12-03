package practice6;

public class PrimeRange {
	
	public static void main(String args[]) {
		range();
		SinglePrimeNumber();
	}
	
	public static boolean PrimeNumber(int n) {
		
		for(int i=2;i< n/2;i++) {
			if(n % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void range() {
		for(int i = 3; i<=19;i++) {
			//PrimeNumber(i);
			if(PrimeNumber(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static  boolean SinglePrimeNumber() {
		int number = 9;
		
		for (int i=2; i<number; i++) {
			
			if(number % i == 0) {
				System.out.println("Not a Prime Number");
				return false;
			}
			else
				System.out.println("Number is prime Number");
			return true;
		}
		
		return false;
	}
	
	static boolean SinglePrimeNumber1() {
		int number = 9;
		for(int i=2; i < number; i++)
			if(number % i == 0)
				return false;
		
		return true;
			
	}

}

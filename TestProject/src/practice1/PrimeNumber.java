package practice1;

public class PrimeNumber {
	
	public static void main(String args[]) {
		
		System.out.println(numberPrime(11));
		primeRange(100);
		
	}
	
	public static boolean numberPrime(int number) {
		
		for(int i = 2 ;i<number; i++) {
			if(number % 2 == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void primeRange(int number) {
		
		for(int i= 2; i<=number;i++) {
			if(numberPrime(i))
				System.out.println(i);
		}
	}
}
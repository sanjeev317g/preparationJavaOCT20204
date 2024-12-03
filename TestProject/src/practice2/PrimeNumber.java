package practice2;

public class PrimeNumber {
	
	public static void main(String args[]) {
		
			System.out.println(primeNum(7));
			
			primeRange(20);
		}
	
	public static boolean primeNum(int number) {
		
		for(int i=2; i<number; i++) {
			if(number % i == 0 ) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void primeRange(int number) {
		
		for(int i=0;i<=number;i++) {
			if(primeNum(i)) {
				System.out.println(i);
			}
		}
	}
	
		
}



package practice4;

public class PrimeNumber {
	
	public static void main(String args[]) {
		
		prime(15);
		//RangePrime();

	
	}
		public static boolean prime(int num) {
			
			for(int i=2;i<num/2; i++) {
				if(num % 2 == 0) {
					System.out.println("Not a prime number");
					return false;
				}
				else {
					System.out.println("Prime Number");
					return true;
				}
			}
			
			return false;
	}
		
		public static boolean primeRange(int n) {
			for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
		}
		
		public static void RangePrime() {
			
			for (int i = 2; i <= 19; i++) {
	            if (primeRange(i)) {
	                System.out.print(i + " ");
	            }
	        }
			
		}
		
		
		

}

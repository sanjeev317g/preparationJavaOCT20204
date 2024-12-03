package practice2;

public class palindromeNumber {
	
	public static void main(String args[]) {
		
		int number = 12321;
		
		int rev = 0;
		
		int r = 0;
		
		
		
		while(number != 0) {
			
			r = number % 10;
			
			rev = rev * 10 + r;
			
			number = number / 10;
			
		}
		
		System.out.println(rev);
	}

}

package practice1;

public class ReverseNumberSecondType {
	
	public static void main(String args[]) {
		
		int number = 12345;
		
		int rev = 0;
		
		for(int i = 1 ; i <= 5 ;i ++) {
			
		int r = number % 10;
		
		rev = rev * 10 + r;
		
		number = number / 10;
		}
		
		System.out.println(rev);
		
		reverseNumber();
		
	}
	
	public static void reverseNumber() {
		
		int number = 6789;
		
		int rev = 0;
		
		int r = 0;
		
		while(number > 0) {
			
			r = number % 10;
			
			rev = rev * 10 + r;
			
			number = number / 10;
			
			
		}
		
		System.out.println(rev);
	}

}

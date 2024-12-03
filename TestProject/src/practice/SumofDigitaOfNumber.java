package practice;

public class SumofDigitaOfNumber {
	
	public static void main(String args[]) {
		
		int number = 123456;
		int count = 0;
		String numbers = Integer.toString(number);
		System.out.println(numbers.length());
		for(int i=0;i<=numbers.length();i++) {
			
			count = number % 10 + count;
			
			number = number /10;
		}
		
		System.out.println(count);

	}

}

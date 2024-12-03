package practice2;

public class SumOfNumbers {
	
	public static void main (String args[]) {
		
		int number = 12345;
		
		int lenght = Integer.toString(number).length();
		
		int total = 0;
		
		int digit;
		
		for(int i=0;i<=lenght;i++) {
			
			digit = number % 10;
			
			total = total + digit;
			
			number = number / 10;
		}
		
		System.out.println(total);
		Sumofnumber();
	}
	
	public static void Sumofnumber() {
		
		int number = 123456;
		
		int digit = 0;
		
		int total = 0;
		
		while(number != 0) {
			
			digit = number % 10;
			
			total = total + digit;
			
			number = number / 10;
			
		}
		
		System.out.println(total);
	}

}

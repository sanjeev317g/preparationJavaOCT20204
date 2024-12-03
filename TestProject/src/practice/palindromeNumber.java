package practice;

public class palindromeNumber {
	
	public static void main(String args[]) {
		
		String str = "ABBAA";
		
		StringBuffer sb = new StringBuffer(str);
		if(sb.reverse().toString().equals(str)) {
			System.out.println("its word palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		palindromNumber();
		
		palindromNumber1();
		
		palindrone2();
		
		palindrone3();
		
	}
	
	public static void palindromNumber() {
		int n = 1212121;
		int digit,temp;
		int reverse = 0 ;
		temp=n;
		while(n != 0) {
			digit = n % 10;
			reverse = (reverse * 10 )+ digit;
			n = n/10;
			
		}
		
		if (temp == reverse) {
			System.out.println("its palindrome");
			System.out.println("temp" + temp);
		}
		else
			System.out.println("Not a palindrone");
		System.out.println("temp" + temp);
	}
	
	public static void palindromNumber1() {
		
		int number = 12121;
		int reminder = 0;
		int reverse = 0;
		int temp = number;
		while(number > 0)
		{
			reminder = number % 10;
			
			reverse = (reverse * 10) + reminder;
			
			number = number/10;
			
		}
		
		if (temp == reverse) {
			System.out.println("its palindrone");
		}
		else {
			System.out.println("not b palindrone");

		}
		System.out.println("Reverse" +reverse);
		
		
	}
	
	public static void palindrone2() {
		
		int reminder = 0;
		int number = 121;
		int reverse = 0;
		int temp = number;
		while(number!=0) {
			
			
			reminder = number%10;
			System.out.println("Reminder Number "+reminder);
			reverse = reverse *10 + reminder;
			System.out.println("reverse number " + reverse);
			
			number = number/10;
		}
		if(temp == reverse) {
			System.out.println("p");
		}
		else
			System.out.println("n");
	}
	
	public static void palindrone3() {
		int number = 1231;
		int reminder = 0;
		int reverse = 0;
		int temp = number;
		while(number != 0) {
			reminder = number % 10;
			reverse = reverse *10 + reminder;
			number = number /10;
		}
		if (temp == reverse) {
			System.out.println("pp");
		}
		else
			System.out.println("NN");
	}

}

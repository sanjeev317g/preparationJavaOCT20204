package practice;

public class palindromeNumber1 {
	
	public class ReverseNumber {
	    public static void main(String[] args) {
	        int number = 12345;  // Change this number to test other cases
	        //int reversed = reverseNumber(number);
	        System.out.println("Original Number: " + number);
	       // System.out.println("Reversed Number: " + reversed);
	    }

	    // Method to reverse a number
	    public static void reverseNumber(int num) {
	        int reversed = 0;

	        // Reverse the number
	        while (num != 0) {
	            int digit = num % 10;  // Extract the last digit
	            reversed = reversed * 10 + digit;  // Add the digit to the reversed number
	            num /= 10;  // Remove the last digit from the number
	        }

	        //return reversed;
	        System.out.println(reversed);
	    }
	}











}

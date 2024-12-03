package practice;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		int first = 10;
		int second = 20;
		
		first = first+second;
		second = first - second;
		first = first - second;
		
		System.out.println("first "+ first + "second "+ second);

	}

}

package practice1;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		
		//Swap two numbers
		int a = 15;
		int b = 30;
		
		a = a + b;
		b = a - b;
		
		a = a - b;
		
		System.out.println("a was 10 :" + a+ " "+ "b was 20:"+ b);
	}

}

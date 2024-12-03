package practice;

public class ReverseNumber {
	
	public static void main(String args[]) {
		int number = 12345;
		System.out.print("From Main ");
		for(int i=Integer.toString(number).length();i>0;i--) {
			
			System.out.print(i);
		}
		
		reverse();
	}
	
	public static void reverse() {
		int number = 12345;
		
		int rever;
		
		while(number != 0) {
			rever = number % 10;
			System.out.println(rever);
			number = number /10;
		}
	}

}

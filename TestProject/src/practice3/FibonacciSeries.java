package practice3;

public class FibonacciSeries {
	
	public static void main (String args[]) {
		
		//0,1,1,2,3,5,8,13
		
		int num = 0;
		int num1 = 1;
		int num3 = 0;
		
		for(int i=1;i<10;i++) {
			
			num3 = num+num1;
			System.out.println("Finonacci Serice "+ num3);
			num = num1;
			num1 = num3;
			
		}
	}

}
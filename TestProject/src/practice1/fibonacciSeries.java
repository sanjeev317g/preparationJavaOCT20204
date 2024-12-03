package practice1;

public class fibonacciSeries {
	
	// print 0,1,1,2,3,5,8,13,21
	public static void main(String args[]) {
		
		int number = 15;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for(int i=2;i<=number;i++) {
			num3 = num1+num2;
			System.out.println(num1);
			
			num1 = num2;
			num2 = num3;
		}
	}

}


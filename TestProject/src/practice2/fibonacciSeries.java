package practice2;

public class fibonacciSeries {
	public static void main(String args[]) {
		int number = 20;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		
		for(int i=0;i<=number;i++) {
			
			num3 = num1+num2;
			
			System.out.println(num1);
			num1 = num2;
			num2 = num3;
		}
	}

}

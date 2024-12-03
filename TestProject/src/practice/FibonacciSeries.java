package practice;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		System.out.println("Printing Fibonacci");
		
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<=5;i++) {
			
			int num3 = num1 + num2;
			
			System.out.println(num3);
			
			num1 = num2;
			num2 = num3;
		}
		FibonacciSeries fs = new FibonacciSeries();
				fs.FibonacciSeries1();
		
	}
	
	public void FibonacciSeries1() {
		int num = 0;
		int num1 = 1;
		int num3 = 0;
		System.out.println(num);
		System.out.println(num1);
		for(int i=0;i<15;i++) {
			num3 = num+num1;
			System.out.println("FibonacciSeries " + num3);
			num = num1;
			num1 = num3;
			
		}

	}

}

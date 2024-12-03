package practice;

public class PerfectNumber {
	
	public static void main(String args[]) {
		
		int number = 28;
		int sum = 0;
		System.out.print ("Print divisiable :");
		for(int i=1;i<=number/2;i++) {
			if(number % i == 0) {
				
				sum = sum + i;
				
				System.out.println(i);
			}
		}
		
		System.out.println("Sum"+sum);
	}

}

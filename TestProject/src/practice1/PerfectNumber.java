package practice1;

public class PerfectNumber {
	
	public static void main(String args[]) {
		
		int number = 6;
		
		int sum = 0;
		
		for(int i=1;i<number;i++) {
			
			if(number % i ==0)
				sum = sum + i;
		}
		
		if(number == sum) {
			System.out.println(number + " is a perfect number");
		}
		else {
			System.out.println(number + " is not a perfect number");
		}
	}

}

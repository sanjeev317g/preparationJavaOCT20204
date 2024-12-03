package practice;

public class primeNumbers {
	
	public static void main(String args[]) {
		int number = 100;
		System.out.println("Prime numbers between 2 - 100 :");
		for(int i=2;i<number;i++) {
			if(i%2 == 0 || i%3 ==0) {
				//System.out.println("Not a Prime Number ");
			}
			else {
				
				System.out.print(i+",");
			}
		}
	}
	
	public static boolean prime(int number) {
		
		if(number<1) {
			return false;
		}
		if(number==2 ||number==3) {
			return true;
		}
		if(number %2 ==0 || number% 3 ==0) {
			return false;
		}
		for(int i=5;i*5<=number;i+=6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
		}
		
		return true;
		
	}

}

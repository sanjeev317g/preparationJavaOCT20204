package practice;

public class PrimeNumberInRange {
	
	public static void main(String args[]) {
		int n = 9;
		int m = n/2;
		int flag = 0;
		for(int i=0;i<=m;i++) {
			int aa = n%2;
			if(n%2==0) {
				System.out.println(n + " is not prime number");
				flag = 1;
				break;
			}
		}
		if(flag == 0 ) {
			System.out.println(n +" is a prime number");
		}
	}

}
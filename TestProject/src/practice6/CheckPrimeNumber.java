package practice6;

public class CheckPrimeNumber {
	
	public static void main(String args[]) {
		int n = 9;
        System.out.println(isPrime(n));
	}
	
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check divisibility from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}

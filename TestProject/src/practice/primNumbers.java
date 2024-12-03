package practice;

public class primNumbers {
	
	public static void main(String args[]) {
		boolean prime = prime();
		System.out.println(prime);

	}
	
	public static boolean prime() {
		int prime = 97;
		for(int i=2;i <= Math.sqrt(prime); i++) {

			if(prime % i == 0)
			{
				return false;
			}
		} return true;
	}

}

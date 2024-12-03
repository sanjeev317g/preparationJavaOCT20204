package practice;

public class MissingNumberInArray {
	
	public static void main(String args[]) {
		int[] missing = {1,2,3,4,5,6,7,9};
		
		int n = missing.length +1;
		
		int total = n*(n+1)/2;
		
		for(int num:missing) {
			total -= num;
		}
		System.out.println(total);
				
	}

}

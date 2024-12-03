package practice;

public class LargestSmallest {
	
	public static void main(String args[]) {
		
		int[] a = {1,4,5,7,9};
		
		int max = a[0];
		
		int min = a[0];
		
		for(int aa:a) {
			
			if(aa > max) {
				max = aa;
			}
			if(aa < min) {
				min = aa;
			}
		}
		
		System.out.println(max + " "+ min);
	}

}

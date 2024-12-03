package practice1;

public class MissingNumber {
	
	public static void main(String args[]) {
		
		int[] a = {1,2,3,5,6};
		
		int aa = a.length+1;
		
		
		int bb = aa * (aa +1)/ 2;
		
		System.out.println(bb);
		
		int sum =0;
		
		for(int cc: a) {
			sum = sum + cc;
		}
		
		int missingnumber = sum - bb;
		
		System.out.println(missingnumber);
		
		
	}

}

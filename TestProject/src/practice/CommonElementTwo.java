package practice;

public class CommonElementTwo {
	
	public static void main(String args[]) {
		int[] a = {1,3,5,7,9,0,10};
		int[] b = {10,30,50,60,3,1};
		int value = 0;
		
		for(int aa:a) {
			for(int bb:b) {
				if(aa == bb) {
					System.out.println(bb);
				}
			}
		}

		
		
		
	}

}

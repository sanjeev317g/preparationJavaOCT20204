package OCT26;

public class CommonElementsFromTwoArrays {
	
	public static void main (String args[]) {
		
		int[] a = {1,3,5,7,9,0,10};
		int[] b = {10,30,50,60,3,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					System.out.println(b[j]);
				}
			}
		}
	}

}

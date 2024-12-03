package practice;

public class InputAndOutPut {
	
	public static void main(String args[]) {
		
		//Input 1122345566
		
		int[] a = {1,1,2,2,3,4,5,5,6,6};
		
		for(int i=1;i<a.length;i++) {
			
			int count = 0;
			
			for(int j=0;j<a.length;j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println(a[i]);
			}

		}
		
		
	}

}

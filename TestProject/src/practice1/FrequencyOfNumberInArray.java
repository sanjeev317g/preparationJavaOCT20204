package practice1;

public class FrequencyOfNumberInArray {
	
	public static void main(String args[]) {
		
		int[] a = {1,2,3,4,5,6,7,2,2,3,4,4,5,6};
		
		for(int i =0;i<a.length;i++) {
			
			int count = 0;
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count == 1)
			System.out.println(a[i] + "| " + count);
			if(count > 1)
				System.out.println(a[i] + "|" + count);
		}
	}

}

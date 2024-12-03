package practice;

public class RemoveDuplicateAndPrintCompleteArray {
	
	public static void main(String args[]) {
		
		int[] original = {2,2,3,4,1,5,6,7,7,8,9};
		
		for(int i=0;i<original.length;i++) {
			
			for(int j=i+1;j<original.length;j++) {
				
				if(original[i] == original[j]) {
					
					original[j] = -1;
					
				}
			}
		}
		
		for(int i=0;i<original.length;i++) {
			if(original[i] != -1) {
				System.out.println(original[i]);
			}
		}
	}

}

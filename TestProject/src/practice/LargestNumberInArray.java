package practice;

public class LargestNumberInArray {
	
	public static void main(String args[]) {
		
		int[] largNumber = {1,5,10,15,18,21,20};
		
		int temp = 0;
		
		for(int i=0;i<largNumber.length;i++) {
			if(largNumber[i] > temp) {
				temp = largNumber[i];
			}
			
		}
		System.out.println(temp);
		
	}

}

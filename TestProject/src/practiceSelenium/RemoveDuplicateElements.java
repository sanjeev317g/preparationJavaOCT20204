package practiceSelenium;

public class RemoveDuplicateElements {
	
	public static void main(String arg[]) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,1,2,2,3,4,5,};
		
		String str = "";
		
		for(int i=0;i<numbers.length;i++) {
			
			int count = 0;
			
			for(int j=0;j<numbers.length;j++) {
				if(numbers[i] == numbers[j]) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println(numbers[i]);
			}

		}
	}

}

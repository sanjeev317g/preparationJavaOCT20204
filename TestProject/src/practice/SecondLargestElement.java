package practice;

public class SecondLargestElement {
	
	public static void main(String args[]) {
		
		int[] largest = {1,4,5,2,7,8,3,9,10,47,100,48};
		
		int temp=0;
		int secondLargest = temp;
		
		for(int i=0; i<largest.length; i++) {
			if(largest[i] > temp) {
				secondLargest = temp;
				temp = largest[i];
			}
			else if(largest[i] > secondLargest && largest[i] != temp) {
				secondLargest = largest[i];
			}

			
		}
		System.out.println("Largest Number "+temp);
		System.out.println("Second LArget " + secondLargest);
		largest();
		
	}
	
	public static void largest() {
		int[] largest = {12,35,1,10,34,1};
		int first = 0;
		int second = 0;
		for(int num:largest) {
			if(num>first) {
				second = first;
				first=num;
			}else if(num > second && num != first) {
				second = num;
			}
		}
		System.out.println(second);
	}

}

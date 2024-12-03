package practiceSelenium;

public class MaxMinOfUnSortedArray {
	
	public static void main(String args[]) {
		
		int[] original = {1,45,67,98,455,678};
		
		int min = original[0];
		
		int max = original[0];
		
		for(int i=0;i<original.length;i++) {
			
			if(original[i] < min) {
				min = original[i];
			}
			
			if(original[i]>max) {
				max = original[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}

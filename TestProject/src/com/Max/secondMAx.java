package com.Max;

public class secondMAx {
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,8,9,78};
		int temp = 0;
		int secondMax = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] > temp) {
				secondMax = temp;
				temp = a[i];
				
			}
		}
		System.out.println(temp);
		System.out.println(secondMax);
	
	}

}

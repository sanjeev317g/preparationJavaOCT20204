package com.Max;

public class MaxNumber {
	public static void main(String[] args) {
		int a[] = {1,2,3,5,10,12,19,17};
		int temp = 0;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]>temp) {
				temp = a[i];
			}
		}
		System.out.print(temp);
	}

}
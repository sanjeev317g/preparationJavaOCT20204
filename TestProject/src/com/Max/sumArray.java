package com.Max;

public class sumArray {
	public static void main(String args[]) {
		int a[] = {10,20,30};
		int total =0;
		Object aa[] = {a, 'c',"match"};
		for(int i=0;i<a.length;i++) {
			total = total +a[i];
		}
		System.out.println(total);
	}

}

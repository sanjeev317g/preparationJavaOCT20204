package com.Max;

public class privatevarMeth {
	
	private int a = 100;
	public static void main (String args[]) {
		abc();
		privatevarMeth a = new privatevarMeth();
		 a.xyz();
		 a.aaa();
	}
	
	private static String abc() {
		String str = "50";
		return str;
	}
	
	private void xyz() {
		int a = 100;
		System.out.println(a);
				
	}
	
	public void aaa() {
		System.out.println("TEst");
	}
	
	void defaults() {
		System.out.println("Default function");
	}
	

}

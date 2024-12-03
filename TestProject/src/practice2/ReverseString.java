package practice2;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String str = "automation";
		
		StringBuffer str1 = new StringBuffer();
		str1.append(str);
		
		System.out.println(str1.reverse());
		
		reverseString();
	}
	
	public static void reverseString() {
		
		String str = "Testing";
		
		char[] c = str.toCharArray();
		
		String st = "";
		
		for(int i = c.length-1; i>=0; i --) {
			System.out.print(c[i]);
			
			st += c[i];
		}
		
		//System.out.print(st);
	}

}

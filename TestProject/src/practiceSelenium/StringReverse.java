package practiceSelenium;

public class StringReverse {
	
	public static void main(String args[]) {
		
		String str = "Automation";
		
		String reverse = "";
		
		char[] c = str.toCharArray();
		
		for(int i=c.length-1;i>0;i--) {
			
			reverse = reverse + c[i];
		}
		
		System.out.println(reverse);
	}

}

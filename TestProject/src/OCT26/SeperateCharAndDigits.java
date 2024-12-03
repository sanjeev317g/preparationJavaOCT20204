package OCT26;

public class SeperateCharAndDigits {
	
	public static void main(String args[]) {
		
		String str = "Test123";
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				
			}
			else {
				System.out.println(c);
			}
		}
		
	}

}

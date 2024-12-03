package OCT26;

public class FirstNoneRepetativechar {
	
	public static void main(String args[]) {
		
		String str = "Automation";
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println(str.indexOf(c));
				System.out.println("....");
				System.out.println(str.lastIndexOf(c));
			}
		}

	}

}

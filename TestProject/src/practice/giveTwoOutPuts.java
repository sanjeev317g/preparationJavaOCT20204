package practice;

public class giveTwoOutPuts {
	
	public static void main(String args[]) {
		
		String str = "subbu123raj";
		
		StringBuffer bf = new StringBuffer();
		
		StringBuffer bf1 = new StringBuffer();
		
		//"subburaj" "123"
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(Character.isDigit(c)) {
				bf.append(c);
			}
			
			else {
				bf1.append(c);
			}
			
		}
		
		System.out.println(bf.toString());
		
		System.out.println(bf1.toString());
	}

}

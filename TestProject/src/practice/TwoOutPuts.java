package practice;

public class TwoOutPuts {
	
	public static void main(String args[]) {
		
		String str = "aBACbcEDed";
		
		StringBuffer bf = new StringBuffer();
		
		StringBuffer bf1 = new StringBuffer();
		
		for(char c:str.toCharArray()) {
			
			if(Character.isLowerCase(c)) {
				bf.append(c);
			}
			
			else
				bf1.append(c);
		

		}
		System.out.println(bf.toString());
		
		System.out.println(bf1.toString());
	}
	

}

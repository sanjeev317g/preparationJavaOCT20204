package practice;

public class OccurencesOfCharactersInString {
	
	public static void main(String args[]) {
		
		String str = "AAutomation";
		str = str.toLowerCase();
		int count = 0;
		char[] cStr = str.toCharArray();
		for(int i=0;i<cStr.length;i++) {
			if(cStr[i] == 'a') {
			count = count + 1;
			}
		}
		System.out.println(count);
		
	}

}

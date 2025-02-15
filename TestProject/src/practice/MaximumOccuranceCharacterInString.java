package practice;

public class MaximumOccuranceCharacterInString {
	
	public static void main(String args[]) {
		
		String str = "Sucessful".toLowerCase();
		
		int[] frequency = new int[256];
		
		int maxCount = 0;
		
		char maxCharacter = 0;
		
		for(int i=0;i< str.length();i++) {
			
			char currentChar = str.charAt(i);
			frequency[currentChar]++;
			
			if(frequency[currentChar] > maxCount) {
				maxCount = frequency[currentChar];
				maxCharacter = currentChar;
			}
		}
		
		System.out.println(maxCharacter);
		System.out.println(maxCount);
		
		CharFromString();
		maxCharCount();
		
	}
	
	public static void CharFromString() {
		
		String str = "Automation";
		
		char[] c = str.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			//System.out.println(c[i]);
		}
	}
	
	public static void maxCharCount() {
		String str = "Automation";
		int[] frequency = new int[256];
		int maxCount = 0;
		char maxChar =0;
		
		for(char c: str.toCharArray()) {
			frequency[c]++;
			
			if(frequency[c] > maxCount) {
				maxCount = frequency[c];
				maxChar = c;
				
				
			}
		}

System.out.println(maxChar);
	}

}

package practice;

public class Anagram {
	static String Ana1 = "List en";
	static String Ana2 = "Silent";
	static StringBuilder spaces = new StringBuilder();
	
	public static void main(String args[]) {
		
		
		
		StringBuilder first = removeSpace(Ana1);
		StringBuilder second = removeSpace(Ana2);
		int[] first_count =charCount(first);
		int[] second_count = charCount(second);
		
		if(first_count == second_count) {
			System.out.println("String are Anagram");
		}
		else {
			System.out.println("String are not Anagram");
		}
		

	}
	
	public static StringBuilder removeSpace(String str) {
		str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				spaces.append(c);
			}
		}
		return spaces;
	}
	
//	public static String loweCase(String str) {
//		
//		String str1 = str.toLowerCase();
//		
//		return str1;
//	}
	
	public static int[] charCount(StringBuilder strB) {
		int charCount[] = new int[26];
		for(int i=0;i <strB.length();i++) {
			charCount[strB.charAt(i) - 'a']++;
		}
		return charCount;
	}

}

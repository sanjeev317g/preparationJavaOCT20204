package practice;

public class VowelsAndConsonants {
	
	public static void main(String args[]) {
		
		String str1 = "Automation";
		String str = str1.toLowerCase();
		int vowelcount = 0;
		int consonants = 0;
		for(int i=0;i<str.length();i++) {
			char[] ch = str.toCharArray();
			if(ch[i] == 'a' || ch[i] == 'e' ||ch[i] == 'i'||ch[i] == 'o' || ch[i] == 'u') {
				
				vowelcount++;
				System.out.println(ch[i]);
			}
			else {
				consonants++;
				
			}
		}
		
		System.out.println(vowelcount);
		
		System.out.println(consonants);

}

}

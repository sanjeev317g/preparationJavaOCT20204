package OCT26;

import java.util.Arrays;

public class Anagram {
	
	
	
	public static void main(String args[]) {
		
		String str1 = "listen";
		String str2 = "silent";
		
		if(str1.toLowerCase().length() == str2.toLowerCase().length()) {
			System.out.println("Anagram first condition satisfied");
		}
		else {
			System.out.println("Not an Anagram");
		}
		
		char[] str_l = str1.toCharArray();
		char[] str_s = str2.toCharArray();
		Arrays.sort(str_l);
		Arrays.sort(str_s);
		if(Arrays.equals(str_l, str_s))
		{
			System.out.println("its an Anagram");
		}
		
		
		
		
		
	}

}

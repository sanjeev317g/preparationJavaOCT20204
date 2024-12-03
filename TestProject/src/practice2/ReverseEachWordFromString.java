package practice2;

public class ReverseEachWordFromString {
	
	public static void main(String args[]) {
		
		String str = "Java is good programming language";
		
		String[] word = str.split(" ");
		
		String reverseword = " ";
		
		String rword = "";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<word.length;i++) {
			char[] c = word[i].toCharArray();
			for(int j=c.length-1; j>=0; j--) {
				reverseword+=c[j];
			}
			reverseword = reverseword + " ";
//			reverseword.
		}
		//sb.append(reverseword + " ");
		System.out.println(reverseword);
	}

}

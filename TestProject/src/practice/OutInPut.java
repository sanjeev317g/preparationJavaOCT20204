package practice;

public class OutInPut {
	
	public static void main(String args[]) {
		
		// Input 32400121200 Output - 00003241212
		
		String input = "32400121200";
		
		int zeroCount = 0;
		
		StringBuffer bf = new StringBuffer();
		StringBuffer bf1 = new StringBuffer();
		
		for(char c: input.toCharArray()) {
			if(c == '0') {
				zeroCount = zeroCount +1;
				bf.append(c);
			}
			else {
				bf1.append(c);
			}
		}
		
		bf.append(bf1);
		
		bf1.append(bf);
		
		System.out.println(bf);
		
		System.out.println(bf1);
		
		

	}

}

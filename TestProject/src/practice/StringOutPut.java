package practice;

public class StringOutPut {
	
	public static void main(String args[]) {
		
		// aabbccdd out a2b2c2d2
		
		sttr();
		
		String str = "aabbccdd";
		
		int count = 1;
		

		
		StringBuffer sb = new StringBuffer();
		
		for(int i =1;i<str.length(); i++) {
			
			if(str.charAt(i) == str.charAt(i-1)) {
				
					count++;
			}else {
			sb.append(str.charAt(i-1)).append(count);
			count =1;
			}
			
			

	}
		sb.append(str.charAt(str.length() - 1)).append(count);
		System.out.println(sb.toString());

}
	
	public static void sttr() {
		
		String str1 = "eeffgghhii";
		
		StringBuffer sb = new StringBuffer();
		
		int count = 1;
		
		for(int i=1; i<str1.length();i++){
			
			if(str1.charAt(i) == str1.charAt(i-1)) {
				count++;
				
			}
			else {
				sb.append(str1.charAt(i-1)).append(count);
				count = 1;
			}
		}
		sb.append(str1.charAt(str1.length() -1)).append(count);
		System.out.println(sb.toString());
		
	}
}
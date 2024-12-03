package practice1;

public class DuplicateCharinString {
	
	public static void main(String args[]) {
		
		String str = "Sucess";
		
		str.toLowerCase();
		
		char[] c = str.toCharArray();
		
		int total = 0;
		
		for(int i=0;i<=c.length;i++) {
			for(int j=0; j<=i;j++) {
				if(c[i] == c[j]) {
					total = total +1;
					System.out.println(c[j] +" :" + total);
				}
			
				
			}
			
			total = 0;
			
		}
	}

}

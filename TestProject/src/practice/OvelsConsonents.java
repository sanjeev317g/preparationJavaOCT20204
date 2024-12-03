package practice;

public class OvelsConsonents {
	
	public static void main(String args[]) {
		
		String str = "Automation";
		
		int vovels = 0;
		
		int consonents = 0;
		
		StringBuffer sb = new StringBuffer();
		
		for(char c:str.toCharArray()) {
			
			if(c == 'a' || c == 'e' || c== 'i' || c=='o'|| c=='u') {
				vovels++;
				sb.append(c);
			}
			else {
				consonents++;
			}
		}
		
		System.out.println(vovels + sb.toString());
		System.out.println(consonents);
	}

}

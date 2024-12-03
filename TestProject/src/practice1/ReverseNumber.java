package practice1;

public class ReverseNumber {
	
	public static void main(String args[]) {
		
		int number = 12345;
		StringBuffer sb = new StringBuffer();
		
		String number_str = Integer.toString(number);
		
		for(int i = 1;i <=number_str.length(); i++) {
			int num = number % 10;
			sb.append(num);
			number = number /10;
		}
		
		System.out.println(sb);
	}

}

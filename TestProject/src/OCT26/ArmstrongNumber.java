package OCT26;

public class ArmstrongNumber {
	
	public static void main(String args[]) {
		
		int num = 153;
		
		int num1 = 153;
		
		int length = Integer.toString(num1).length();
		
		int count = 0;
		int count1 = 1;
		while(num != 0) {
			int lnumber = num % 10;
			
			for(int i = 0;i<length;i++) {
				
				count1 = lnumber * count1;
				
				
			}
			count = count + count1;
			
			num = num / 10;
			count1 = 1;
		}
		System.out.println(count);
		
	}

}

package practice;

public class ArmstrongNumber {
	
	public static void main(String args[]) {
	
	int armstrong = 153;
	int armstrongNo = armstrong;
	int armstrong_length = Integer.toString(armstrong).length(); 
	int count = 1;
	int total = 0;
	while(armstrong != 0) {
		int lastdigit = armstrong % 10; //extract last digit
		for(int i=1;i<=armstrong_length;i++) {
			count = lastdigit * count;
		}
		total = count + total;	
		count = 1;
		armstrong = armstrong / 10;
		
	}
	if(total == armstrongNo){
		System.out.println("Number is Armstrong Number ");
	}
	else{
		System.out.println("Number is not Armstring Number ");
	}
	
	}
}

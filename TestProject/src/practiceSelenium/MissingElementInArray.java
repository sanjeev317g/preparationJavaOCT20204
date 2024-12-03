package practiceSelenium;

public class MissingElementInArray {
	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,4,6,7};
		
		int lengths = a.length +1;
		
		int length_cal = lengths * (lengths +1 ) / 2;
		
		int sum = 0;
		
		// sum of the array i.e 1+2+3+4+6+7
		//length_cal -sum
		
		int missingElement = 0;
		
		for(int i=0;i<a.length;i++) {
			
			sum = sum + a[i];
		}
		
		missingElement = sum - length_cal;
		
		System.out.println("missing " + missingElement);
	}

}

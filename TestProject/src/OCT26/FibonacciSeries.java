package OCT26;

public class FibonacciSeries {
	
	public static void main (String args[]) {
		
		//0,1,1,2,3,5,8,13
		
		int n1 = 0;
		
		int n2 = 1;
		
		int n3 = 0;
		
		for(int i=0;i<14;i++) {
		
			n3 = n1 + n2;
			
			System.out.println("Febanacci Serice :" + n3);
			
			n1 = n2;
			
			n2 = n3;
		
		
		
		}
	}

}

package practice;

public class SearchElementInArray {
	
	public static void main(String args[]) {
		
		if(search() == true) {
			System.out.println("Index exists");
		}
		else
			System.out.println("Index Does not exits");
	}
	
	public static boolean search() {
		
		int[] a = {1,2,3,4,5,6,8,99};
		
		int search = 2;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] == search) {
				System.out.println(i);
				return true;
			}

		}
		return false;
		
		
	}

}

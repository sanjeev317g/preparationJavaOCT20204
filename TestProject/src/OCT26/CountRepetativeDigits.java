package OCT26;

import java.util.HashSet;
import java.util.Set;

public class CountRepetativeDigits {
	
	public static void main (String args[]) {

		
		int[] a = {1,1,2,2,3,4,5,5,6,6};
		int count = 0;
		Set<Integer> set = new HashSet<>();
		
		
		for(int i =0; i<a.length; i++) {
			
			if(set.contains(a[i])) {
				
			}
			else {
			for(int j = 0; j<a.length;j++) {
				
				if(a[i] == a[j])
					count = count + 1;
			}
			set.add(a[i]);
			System.out.println(a[i]+ " "+ count);
			count = 0;
			}
		}
	}

}
package practice;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String args[]) {
		
		ArrayList <Integer> al = new ArrayList();
		
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(9);
		al.add(5);
		
		ArrayList <Integer> al1 = new ArrayList();
		
		for(int i=1;i<al.size();i++) {
			int count = 0;
			for(int j=0+i;j<al.size();j++) {
				int a = al.get(i);
				if(al.get(i) == al.get(j)) {
					count++;
				}
			}
			
			if(count == 1) {
				al1.add(al.get(i));
			}
		}

		System.out.println(al1);

	}

}

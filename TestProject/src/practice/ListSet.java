package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {
	
	public static void main(String args[]) {
		
		// List and Set are interfaces
		//ArrayList and HashSet are Classe
		// public class ArrayList implements List 
		// public class HastSet implements Set 
		
		List al = new ArrayList();
		
		al.add("a");
		al.add("a");
		al.add("b");
		al.add(1);
		al.add(2);
		
		Set set = new HashSet();
		set.add("a");
		set.add("b");
		set.add("a");
		set.add(1);
		set.add(1);
		
		System.out.println(al);
		
		System.out.println(set);
	}

}

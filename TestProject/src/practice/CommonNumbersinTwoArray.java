package practice;

public class CommonNumbersinTwoArray {
	
	public static void main(String args[]) {
		int[] value = {1,2,3,4,5,6};
		int[] value1 = {3,7,8,9,10,4};
		
		for(int i=0;i<value.length;i++) {
			for(int j=0;j<value1.length;j++)
			{
				if(value[i] == value1[j]) {
					System.out.println("common "+value1[j]);
				}
			}
		}
	}

}

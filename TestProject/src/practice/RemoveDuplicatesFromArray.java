package practice;

public class RemoveDuplicatesFromArray {
	
	public static void main(String args[]) {
//		
//		int array[] =  {2,2,3,4,1,5,6,7,7,8,9};
//		
//		int duplicate[] = removeDuplicates(array);
//		
//		
//		System.out.print("Array after removing duplicates: ");
//        for (int i = 0; i < duplicate.length; i++) {
//            if (duplicate[i] != -1) {  // Skip the placeholder (-1)
//                System.out.print(duplicate[i] + " ");
//            }
//        }
		
		int[] original = {2,2,3,4,1,5,6,7,7,8,9};
		
		int duplicated1[] = new int[original.length];
				
		for(int i=0;i<original.length;i++) {
			
			for(int j=i+1;j<original.length;j++) {
				if(original[i] == original[j]) {
					original[j]=-1;
					
				}
			}
			
		}
		for(int i=0;i<original.length;i++) {
			if(original[i] != -1) {
				System.out.println(original[i]);
			}
		}		
		
	}
	
public static int[] removeDuplicates(int[] array) {
        int n = array.length;

        // Outer loop to pick elements one by one
        for (int i = 0; i < n; i++) {
            // Inner loop to compare the picked element with the rest of the array
            for (int j = i + 1; j < n; j++) {
                // If a duplicate is found, replace the duplicate with -1 (or any placeholder)
                if (array[i] == array[j]) {
                    array[j] = -1;  // Mark as duplicate
                }
            }
        }

        // Return the array with duplicates marked as -1
        return array;
    }
}



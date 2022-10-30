package product;

import java.util.Arrays;

public class MaxProductOf3Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-10, -3, 5, 6, -20};
        int n = arr.length;
 
        int max = maxProduct(arr, n);
 
        if (max == -1) {
            System.out.println("No Triplet Exists");
        } else {
            System.out.println("Maximum product is " + max);
        }
 
    }


	
	/* Function to find a maximum product of a triplet
	   in array of integers of size n */
	    static int maxProduct(int arr[], int n) {
	        // if size is less than 3, no triplet exists
	        if (n < 3) {
	            return -1;
	        }
	 
	        // Sort the array in ascending order
	        Arrays.sort(arr);
	 
	        // Return the maximum of product of last three
	        // elements and product of first two elements
	        // and last element
	        return Math.max(arr[0] * arr[1] * arr[n - 1],
	                arr[n - 1] * arr[n - 2] * arr[n - 3]);
	    }

}

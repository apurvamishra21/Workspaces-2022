package elements;

import org.testng.annotations.Test;

public class Plus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] intList = { 5, 20, 32, 7, 9 };
		  /*int sum = 0;
		  for (int i = 0; i < intList.length; i++) {
		    intList[i]++;
		    System.out.println("intList [" + i + "]: " + intList[i]);
		    sum += intList[i];
		  }
		  System.out.println(sum);
		}*/
		
		Plus1 obj = new Plus1();
	           
	        // number of elements in array
	        int n = 4;
	   
	        // array elements, index of array
	        // should be 1 based, hence, 0 is
	        // added here at arr[0]
	        int arr[] = {0, 1, 9, 3, 9};
	   
	        obj.sum(arr, n);
	   
	        // If 1 was appended at head
	        // of array then, print it
	        if (arr[0] > 0)
	            System.out.print(arr[0] + ", ");
	 
	        int i;
	        for (i = 1; i <= n; i++) {
	            System.out.print(arr[i]);
	   
	            if (i < n)
	                System.out.print(", ");
	        }
	 
	}
	
	
	
	// function to add one and print the array
    void sum(int[] arr, int n)
    {
        int i = n;
   
        // if array element is less than 9, then
        // simply add 1 to this.
        if (arr[i] < 9) {
            arr[i] = arr[i] + 1;
            return;
        }
           
        // if array element is greater than 9,
        // replace it with 0 and decrement i
        arr[i] = 0;
        i--;
         
        // recursive function
        sum(arr, i);
    }
    
    
  //@Test
  	public static int[] plusOne(int[] digits) {
  		
  		int n = digits.length;
  		for(int i = n-1 ; i >= 0 ; i--) {
  			if(digits[i] < 9) {
  				digits[i]++;
  				return digits;
  			}
  			digits[i] = 0;
  		}
  		int[] new_number = new int[n+1];
  		new_number[0] = 1;
  		return new_number;
  	
  		
  		
  	}
   
    
    }

//An array is good if there is an element in the array that equals to the sum of all other elements. 1-based indexing is considered for the array.	
	



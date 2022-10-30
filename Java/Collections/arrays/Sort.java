package arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Sort {

	//@Test
	public void dnso()
	{
		Integer[] arr1 = {10 , 20 , 30 , 5 , 8 , 2 ,1 };
		for(Integer i : arr1)
		{
			System.out.println(i + " ");
		}
		System.out.println("\n----------------------");
		Arrays.sort(arr1);
		for(Integer i : arr1)
		{
			System.out.println(i + " ");
		}
		
	}
	
	@Test
	public void cso()
	{
		Integer[] arr1 = {10 , 20 , 30 , 5 , 8 , 2 ,1 };
		for(Integer i : arr1)
		{
			System.out.println(i + " ");
		}
		System.out.println("\n----------------------");
		//Arrays.sort(arr1 , );
		for(Integer i : arr1)
		{
			System.out.println(i + " ");
		}
		
	}
	
	

}

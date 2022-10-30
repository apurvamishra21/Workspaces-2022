package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	//@Test
	public void regular() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anu");
		names.add("Abhi");
		names.add("Shakti");
		names.add("Devi");
		names.add("shiv");
		
		int count = 0;
		for(int i = 0; i < names.size() ; i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	
	//@Test
	public void streamFilters()
	{
		//approach1
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anu");
		names.add("Abhi");
		names.add("Shakti");
		names.add("Devi");
		names.add("shiv");
		
		int count = 0;
		
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		
		//approach 2
		/*long d = Stream.of("Anu" ,"Abhi" ,"Shakti" ,"Devi" , "shiv" ).filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);*/
		
		//print all names of ArrayList
		//names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		//if we have to limit it to first name
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		}
	
	//@Test
	public void streamMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anu");
		names.add("Abhi");
		names.add("Shakti");
		//print names which have last letter as 'a' with UpperCase
		Stream.of("Abhijeet" , "Don" , "Alekhya" , "Adam" , "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		//print names which have first letter as a with uppercase and sorted
		List<String> names1 = Arrays.asList("Abhijeet" , "Don" , "Alekhya" , "Adam" , "Rama");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		Stream<String> newStream = Stream.concat(names.stream() , names1.stream());
		newStream.sorted().forEach(s -> System.out.println(s));
		
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Ad77am"));
		System.out.println(flag);
		
		Assert.assertTrue(flag);
		
		
	}
	
	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Abhijeet" , "Don" , "Alekhya" , "Adam" , "Rama")
				.filter(s -> s.startsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		//System.out.println(ls.get(1));
		//unique nos from array
		List<Integer> values = Arrays.asList(3 , 2 , 2 , 7 , 5 , 7 , 9);
		//values.stream().distinct().forEach(s -> System.out.println(s));
		
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
		
	}
	

}

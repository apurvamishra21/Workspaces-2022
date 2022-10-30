package characters;

public class TestIndex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "swadheenta";
		String s1 = "";
		
		System.out.println(s);
		/*System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('b'));
		
		System.out.println(s.charAt(5));*/
		//System.out.println(s.charAt(21));//siobe
		//System.out.println(s.charAt(-7));//siobe
		
		//System.out.println(s.chars());//java.util.stream.IntPipeline$Head@3fb4f649
		//System.out.println(s.toCharArray());//swadheenta
		//System.out.println(s.matches(s1));F
		//System.out.println(s.matches(s));T
		
		char[] chars=new char[s.length()];
		s.getChars(0, s.length(), chars, 0);
		String s3=new String(chars);
		System.out.println("Print chars:"+s3);
		
		for (int i = 0; i < s.length(); i++) {
		    System.out.print(s.charAt(i));
		}
		System.out.println();
		s.chars()
        .mapToObj(i -> (char)i)
        .forEach(System.out::print);
		

	}

}

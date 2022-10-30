package characters;

import java.util.HashMap;
import java.util.Map.Entry;

public class RevStrWoAffectingSpChars {

	/*// Input : str = "Ab,c,de!$"               o/p : ed,c,bA!$
	public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "S@3jakd*nd%4*ksdkj12";
        String str = "";
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                str = str + s.charAt(i);
            } else {

                map.put(s.charAt(i), new Integer(s.indexOf(s.charAt(i))));

            }
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {

            str = str.substring(0, entry.getValue()) + entry.getKey() + str.substring(entry.getValue(), str.length());

        }
        System.out.println(str);
    }

}*/
	
	/*public static void main(String[] args) {
	       reverseString("T@E$J#A%S");
	}

	//S@A$JE@T
	private static void reverseString(String s){
	    int len = s.length();
	    char[] arr = new char[len];
	    for(int i=0; i<len; i++){
	        char ch = s.charAt(i);
	        if(Character.isAlphabetic(ch)){
	            arr[len-1-i] = ch;
	        }else{
	            arr[i] = ch;
	        }
	    }

	    System.out.println(new String(arr));
	    
	    String a = "ab$cd";
        char[] b = a.toCharArray();
        int c = b.length;
        for (int i = 0; i < c / 2; i++) {
            if (Character.isAlphabetic(b[i]) || Character.isDigit(b[i])) {
                char temp = b[i];
                b[i] = b[c - i - 1];
                b[c - i - 1] = temp;
            }
        }
    System.out.println(String.valueOf(b));*/
	
	

   /* public static void rev(char s[], int l, int r)
    {
        for (int i = l; i < r / 2; i++) {
            char temp = s[i];
            s[i] = s[r - 1 - i];
            s[r - 1 - i] = temp;
        }
    }
    public static void reverse(char s[])
    {
        // creating character array of size
        // equal to length of string
        char[] temp = new char[s.length];
        int x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                || s[i] >= 'A' && s[i] <= 'Z') {
                // storing elements in array
                temp[x] = s[i];
                x++;
            }
        }
 
        // reversing the character array
        rev(temp, 0, x);
 
        x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                || s[i] >= 'A' && s[i] <= 'Z') {
                // updating the origional string
                s[i] = temp[x];
                x++;
            }
        }
 
        String revStr = new String(s);
        System.out.println("reversed string is: " + revStr);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String str = "Ab,c,de!$";
        char[] charArray = str.toCharArray();
        reverse(charArray);
    }
}*/
	public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;
 
        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;
 
            // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();
 
        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);
 
        System.out.println("Output string: " + revStr);
    }
}


  

	

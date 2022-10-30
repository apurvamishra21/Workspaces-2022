package characters;

import org.testng.annotations.Test;

public class RevStrWoAffectingSpChars_MulStrings {

	 // Input : str = "Ab,c,de!$"               o/p : ed,c,bA!$
    public static void main(String[] args) {
        String input = "Ab,c,de!$ Abhi$hek";
        String[] inputStringArray = input.split("\\ ");
        for(int i = inputStringArray.length-1; i>=0; i--) {
            char[] strArray = inputStringArray[i].toCharArray();
            reverseIgnoreSpecialCharacters(strArray);
            System.out.print(" ");
        }
        
    }
   
    public static void reverseIgnoreSpecialCharacters(char[] charArray) {
        int j = charArray.length-1;
        int k = 0;
        for(int i = charArray.length-1; i>=0;  i--) {
            if(!(charArray[i] >= 65 && charArray[i] <=90) || !(charArray[i] >= 97 && charArray[i] <=122)) {
                charArray[j] = charArray[i];
                System.out.print(charArray[j]);
                j--;
                
            }
            else {
                charArray[k] = charArray[i];
                System.out.print(charArray[k]);
                k++;
            }       
        }   
    }
}



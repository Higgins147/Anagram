import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		
		String word1 = "ANT";
		String word2 = "TAN";
        
		char[] chars1 = word1.toCharArray();
        Arrays.sort(chars1);
        String word1sorted = new String(chars1);
        System.out.println(word1sorted);
			
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars2);
        String word2sorted = new String(chars2);
        System.out.println(word2sorted);
        
        if(word1sorted.equals(word2sorted))
        {
        	System.out.println("Anagram Found");
        }
        else
        {
        	System.out.println("Anagram Not Found");
        }
	}
}
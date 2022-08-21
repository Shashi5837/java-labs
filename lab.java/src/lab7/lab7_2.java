package lab7;
import java.util.HashMap;



public class lab7_2 {
	public HashMap<Character, Integer> countCharacter(char[] arr) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char character : arr) {
			if (charCount.containsKey(character)) {
				charCount.put(character, charCount.get(character) + 1);
			}else {
				charCount.put(character, 1);
			}
		}
		return charCount;
	}
	public static void main(String[] args) {
		lab7_2 ex2 = new lab7_2();
		char[] arr = "HelloWorld".toCharArray();
		System.out.println(ex2.countCharacter(arr));
	}
}
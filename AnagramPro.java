//Check whether two strings are anagram or not

import java.util.Arrays;


public class AnagramPro {

	/**
	 * @param args
	 */
	public static boolean isAnagram(String s1,String s2){
		char [] s1char = s1.toCharArray();
		char [] s2char = s2.toCharArray();
		
		Arrays.sort(s1char);
		Arrays.sort(s2char);
		
		String newS1 = new String(s1char);
		String newS2 = new String(s2char);
		
		return newS1.equals(newS2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = AnagramPro.isAnagram("abcd","abc d");
		System.out.print(result);

	}

}

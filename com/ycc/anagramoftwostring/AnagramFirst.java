package com.ycc.anagramoftwostring;
//Check whether two strings are anagram
import java.util.Arrays;

public class AnagramFirst {
	public static boolean anagramMethodFirst(String s1,String s2){
		if(s1 == null && s2 == null)
			return true;
		if(s1 == null && s2 != null)
			return false;
		if(s1 != null && s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false;
		char [] s1arr = s1.toCharArray();
		char [] s2arr = s2.toCharArray();
		
		Arrays.sort(s1arr);
		Arrays.sort(s2arr);
		
		String newS1 = new String(s1arr);
		String newS2 = new String(s2arr);
		
		if(newS1.length() == newS2.length() && newS1.equals(newS2))
			return true;
		return false;
	}
	public static void main(String [] args){
		boolean flag;
		String s1 = new String("h");
		String s2 = new String("h");
		flag = anagramMethodFirst(s1,s2);
		
		System.out.print(flag);
	}
}

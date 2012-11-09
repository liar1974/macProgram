package com.ycc.anagramoftwostring;
//Check whether two strings are anagram or not by general method
public class AnagramSecond {

	/**
	 * @param args
	 */
	public static boolean anagramMethodSecond(String s1, String s2){
		if(s1 == null && s2 == null)
			return true;
		if(s1 == null && s2 != null)
			return false;
		if(s1 != null && s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false;
		
		int [] charNum = new int [256];
		
		for(int i = 0; i < s1.length(); i++){
			charNum[s1.charAt(i)] ++;
		}
		
		for(int i = 0; i < s2.length(); i++){
			charNum[s2.charAt(i)] --;
			if(charNum[s2.charAt(i)] < 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		String s1 = new String("dddaaa");
		String s2 = new String("ddaaaa");
		flag = anagramMethodSecond(s1,s2);
		
		System.out.print(flag);
	}

}

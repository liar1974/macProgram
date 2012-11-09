package com.ycc.permutationstring;
import java.util.*;
public class PermutationString {

	/**
	 * @param args
	 */
	public static ArrayList <String> storePermutation(String target){
		ArrayList <String> permutation = new ArrayList <String>();
		if(target == null)
			return null;
		else if (target.length() == 0){
			permutation.add("");
			return permutation;
		}
		
		char first = target.charAt(0);
		String remainder = target.substring(1);
		
		ArrayList <String> words = storePermutation(remainder);
		for(String word : words){
			for(int i = 0; i <= word.length(); i++){
				permutation.add(insertChar(word,i,first));
			}
		}
		
		return permutation;
	}
	
	public static String insertChar(String a, int j, char c){
		String start = a.substring(0,j);
		String end = a.substring(j);
		return start + c + end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> resultPermutation;
		resultPermutation = PermutationString.storePermutation("123");
		
		for(int i = 0; i < resultPermutation.size(); i++)
			System.out.print("("+resultPermutation.get(i)+")");
	}

}

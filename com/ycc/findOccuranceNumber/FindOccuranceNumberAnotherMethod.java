package com.ycc.findOccuranceNumber;
import java.util.*;

public class FindOccuranceNumberAnotherMethod {

	/**
	 * @param args
	 */
	public static int occuranceNumber(int k, int [] a){
		HashMap <Integer, Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0; i < a.length; i++){
			if(hm.containsKey(a[i])){
				int count = hm.get(a[i]);
				count++;
				hm.put(a[i], count);
			}else
				hm.put(a[i], 1);
		}
		
		if(hm.containsKey(k))
			return hm.get(k);
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,4,4,4,4,5};
		int occuranceNo = FindOccuranceNumberAnotherMethod.occuranceNumber(5, a);
		System.out.println(occuranceNo);
	}

}

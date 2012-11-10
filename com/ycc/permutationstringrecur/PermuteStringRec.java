package com.ycc.permutationstringrecur;
//Permutation of string. It works for duplicate char array
public class PermuteStringRec {

	/**
	 * @param args
	 */
	public static void swap(char [] array, int a, int b){
		char tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	public static void permuteMethod(char [] array, int first, int num){
		if(num <= 1){
			System.out.println(new String(array));
			return;
		}
		
		for(int i = first; i < first + num; i++){
			if(first != i && array[first] == array[i])
				continue;
			swap(array,first,i);
			permuteMethod(array,first+1,num-1);
			swap(array,first,i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target = new String("abc");
		for(int i = 0; i <= target.length(); i++){
			for(int j = i+1; j <= target.length(); j++){
				String newSubString = target.substring(i,j);
				char [] arr = newSubString.toCharArray();
				permuteMethod(arr,0,arr.length);
			}
		}
		
	}

}

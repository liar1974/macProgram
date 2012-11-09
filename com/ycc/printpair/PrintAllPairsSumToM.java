package com.ycc.printpair;

public class PrintAllPairsSumToM {

	/**
	 * @param args
	 */
	public static void printAllPairs(int [] sortArray, int target){
		int leftIndex = 0;
		int rightIndex = sortArray.length-1;
		
		while(leftIndex < rightIndex){
			int totalSum = sortArray[leftIndex] + sortArray[rightIndex];
			if(totalSum == target){
				System.out.print("("+sortArray[leftIndex]+","+sortArray[rightIndex]+")");
				leftIndex++;
				rightIndex--;
			}else if(totalSum < target){
				leftIndex++;
			}else
				rightIndex--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sortArray = {1,1,2,2,4,5,6,7,8,8,9};
		PrintAllPairsSumToM.printAllPairs(sortArray, 10);
	}

}

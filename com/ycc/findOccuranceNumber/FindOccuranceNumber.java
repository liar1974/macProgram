package com.ycc.findOccuranceNumber;
//Find the occurance of target number in array number by binary search
public class FindOccuranceNumber {

	/**
	 * @param args
	 */
	public static int occuranceNumber(int k, int [] a, int beginIndex, int endIndex){
		if(beginIndex > endIndex)
			return 0;
		if(k < a[beginIndex])
			return 0;
		if(k > a[endIndex])
			return 0;
		if(k == a[beginIndex] && k == a[endIndex])
			return endIndex - beginIndex + 1;
		int mid = (beginIndex + endIndex) >> 1;
		if(k == a[mid])
			return 1 + occuranceNumber(k,a,beginIndex,mid-1) + occuranceNumber(k,a,mid+1,endIndex);
		else if(k < a[mid])
			return occuranceNumber(k,a,beginIndex,mid-1);
		else
			return occuranceNumber(k,a,mid+1,endIndex);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a ={1,1,2,2,2,2,2,2,2,2,2,2,2};
		System.out.println(FindOccuranceNumber.occuranceNumber(2, a, 0, a.length-1));
	}

}

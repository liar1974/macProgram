package com.ycc.findBigN;
// Find the Nth big number in an array by O(n)
public class findBigNthNumber {

	/**
	 * @param args
	 */
	public static int partition(int [] a, int begin, int last){
		if(begin < last){
			int i = begin;
			int j = last;
			int x = a[begin];
			while(i < j){
				while(i < j && x < a[j])
					j--;
				if(i < j)
					a[i++] = a[j];
				while(i < j && x > a[i])
					i++;
				if(i < j)
					a[j--] = a[i];
			}
			a[i] = x;
			return i;
		}
		return -1;
	}
	public static int findNthNumber(int [] a, int l, int r, int k){
		if(l == r)
			return a[l];
		if(l > r)
			return -1;
		int i = partition(a,l,r);
		int j = i - l +1;
		if(j == k)
			return a[i];
		else if(j > k)
			return findNthNumber(a,l,i,k);
		else
			return findNthNumber(a,i+1,r,k-j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,3,6,7,8,1,10,12,11,4,9,5,13};
		int target = findNthNumber(a,0,12,5);
		System.out.print(target);
	}

}

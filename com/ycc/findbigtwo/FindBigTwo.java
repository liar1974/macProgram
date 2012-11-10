package com.ycc.findbigtwo;
//Find two biggest number in an array 
public class FindBigTwo {
	public static int [] findTwoNumber(int [] a){
		int max = a[0];
		int max_s = a[1];
		int [] b = new int[2];
		
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max_s = max;
				max = a[i];
			}else if(a[i] < max && a[i] > max_s){
				max_s = a[i];
			}
		}
		b[0] = max;
		b[1] = max_s;
		
		return b;
	}
	public static void main(String [] args){
		int [] a ={1,3,4,9,5,6,7,8,2,10,16,13};
		int [] b = new int [2];
		b = findTwoNumber(a);
		System.out.print(b[0]+" "+b[1]);
	}
}

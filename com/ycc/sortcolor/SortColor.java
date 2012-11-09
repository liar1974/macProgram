package com.ycc.sortcolor;

public class SortColor {

	/**
	 * @param args
	 */
	public static void sortMethod(char [] A){
		int p = -1;
		int r = A.length;
		for(int q = 0; q < r; q++){
			if(A[q] == 'R'){
				p++;
				swap(A,p,q);
			}else if(A[q] == 'G'){
				r--;
				swap(A,q,r);
				q--;
			}
		}
	}
	
	public static void swap(char [] A,int i, int j){
		char tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] A = {'R','G','B','G','G','R','B','B','R','G','G','B','B','B','R','R','B','G'};
		sortMethod(A);
		System.out.print(new String(A));
	}

}

package com.ycc.eatriceopt;


// This is the same as EatRice.java. But space is O(m+n)
public class OptEatRice {


	
	public int max(int a, int b){
		return a > b ? a : b;
	}
	 
	    public int findMaxSeq(int [][]Matrix) {
	    	if(Matrix.length == 0)
	    		return -1;
	    	
	    	int row = Matrix.length;
	    	int col = Matrix[0].length;
	    	
	    	for(int i = 0; i <= row - 1; i++){
	    		for(int j = 0; j <= col - 1; j++){
	    			if(Matrix[i][j] < 0)
	    				return -1;
	    		}
	    	}
	    	int [] B = new int[col];
	    	B[0] = Matrix[0][0];
	    	for(int i = 1; i <= col - 1; i++)
	    		B[i] = Matrix[0][i] + B[i-1];
	    	
	    	for(int i = 1; i <= row - 1; i++){
	    		for(int j = 0; j <= col - 1; j++){
	    			if(j == 0){
	    				B[j] = Matrix[i][j] + B[j];
	    			}else{
	    				B[j] = max(Matrix[i][j]+B[j], Matrix[i][j]+B[j-1]);
	    			}
	    		}
	    	}
	        
	        return B[col-1];
	    }
	 
	    
	 
	    public static void main(String[] args) {
	        OptEatRice test = new OptEatRice();
	        int[][] Matrix = {};
	        System.out.printf("The max value is: %d \n", test.findMaxSeq(Matrix));
	       
	        System.out.println();
	       
	    }

}

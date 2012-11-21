package com.ycc.eatrice;
// chess_board eat rice. Find the max rice. Using DP. Time complexity is O(mn)  space is O(mn)
public class EatRice {
	
	private int[][] Matrix = { { 2, 2, 3, 0}, { 0, 3, 1, 1 }, { 1, 2, 2, 1 }, { 4, 1, 2, 2 } };
	private  int[][] B = new int[4][4];	
	private int x,y;
	
	public EatRice(int n, int m){
		x = n;
		y = m;
	}
	
	public int max(int a, int b){
		return a > b ? a : b;
	}
	 
	    public int findMaxSeq(int i, int j) {
	        if (i == x && j == y) {
	            B[x][y] = Matrix[x][y];
	            return B[x][y];
	        }
	        int left, up;
	        left = i > x ? findMaxSeq(i - 1, j) : 0;
	        up = j > y ? findMaxSeq(i, j - 1) : 0;
	        B[j][i] = max(left, up) + Matrix[i][j];
	        return B[j][i];
	    }
	 
	    public void PathPrint(int i, int j) {
	        if (i == x && j == y) {
	            System.out.printf("(%d, %d) = %d,", x, y, Matrix[x][y]);
	            return;
	        }
	        int up = j > 0 ? B[i][j - 1] : 0;
	        if (up == B[i][j] - Matrix[j][i])
	            PathPrint(i, j - 1);
	        else
	            PathPrint(i - 1, j);
	        System.out.printf("(%d, %d) = %d,",  j, i, Matrix[j][i]);
	    }
	 
	    public static void main(String[] args) {
	        EatRice test = new EatRice(0, 0);
	        System.out.printf("The max value is: %d \nThe path is: ", test.findMaxSeq(3, 3));
	        test.PathPrint(3, 3);
	       
	    }
	 
	}
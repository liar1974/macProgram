package com.ycc.treeoperation;

public class TreeOperation {

	/**
	 * @param args
	 */
	public static int evaluation(Node root){
		//int result = 0;
		if(root.left == null && root.right == null){
			return root.value;
			
		}
		else{
			int leftVal = evaluation(root.left);
			int rightVal = evaluation(root.right);
			switch(root.s_value){
			case '+': return leftVal + rightVal; 
			case '-': return leftVal - rightVal; 
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root = new Node('+');
        root.left = new Node('-');
        root.right = new Node(8);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        
        int result = evaluation(root);
        System.out.println(result);
	}

}

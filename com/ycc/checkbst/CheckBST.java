package com.ycc.checkbst;

//import java.util.ArrayList;

public class CheckBST {

	/**
	 * @param args
	 */
	public static TreeNode minValue = null;
	public boolean isOrderTra(TreeNode root){
		if(root == null)
			return true;
		if(!isOrderTra(root.left))
			return false;
		if(minValue != null && minValue.data > root.data)
			return false;
		minValue = root;
		
		return isOrderTra(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.left.right.right = new TreeNode(5);
		
		root.right = new TreeNode(9);
		root.right.left = new TreeNode(8);
		root.right.left.left = new TreeNode(18);
		root.right.right = new TreeNode(10);
		root.right.right.right = new TreeNode(11);
		
		CheckBST cb = new CheckBST();
		flag = cb.isOrderTra(root);
		
		System.out.println(flag);
		
	}

}

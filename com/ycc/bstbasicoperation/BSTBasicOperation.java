package com.ycc.bstbasicoperation;
// basic operation for binary search tree
public class BSTBasicOperation {

	/**
	 * @param args
	 */
	//Find the min node of the BST
	public static TreeNode findMin(TreeNode root){
		if(root == null)
			return null;
		if(root.left == null)
			return root;
		return findMin(root.left);
	}
	//Find the max node of the BST
	public static TreeNode findMax(TreeNode root){
		if(root == null)
			return null;
		if(root.right == null)
			return root;
		return findMax(root.right);
	}
	//Insert node to the BST by iterative
	public static void insert(TreeNode root, int node){
		TreeNode newNode = new TreeNode(node);
		if(root == null){
			root = newNode;
		}else{
			TreeNode currentNode = root;
			TreeNode parentNode;
			while(true){
				parentNode = currentNode;
				if(node < currentNode.data){
					currentNode = currentNode.left;
					if(currentNode == null){
						parentNode.left = newNode;
						return;
					}
				}else{
					currentNode = currentNode.right;
					if(currentNode == null){
						parentNode.right = newNode;
						return;
					}
				}
			}
		}
	}
	//Insert the node to the BST by recursive
	public static TreeNode insertRec(TreeNode root, int node){
		if(root == null)
			return new TreeNode(node);
		else if(node < root.data)
			root.left = insertRec(root.left,node);
		else if(node > root.data)
			root.right = insertRec(root.right, node);
		else
			;
        return root;
	}
	//Tree inorder traverse
	public static void inOrder(TreeNode root){
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+"->");
		inOrder(root.right);
	}
	//Remove the node by recursive
	public static TreeNode remove(int x, TreeNode t) {
		if(t == null)
			return null;
		if(t.data > x)
			t.left = remove(x,t.left);
		else if(t.data < x)
			t.right = remove(x,t.right);
		else if(t.left != null && t.right != null){
			t.data = findMin(t.right).data;
			t.right = remove(t.data,t.right);
		}else
			t = (t.left != null)?t.left:t.right;
		
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(9);
		root.left = new TreeNode(5);
		root.right = new TreeNode(14);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(6);
		root.left.left.left = new TreeNode(2);
		root.left.left.right = new TreeNode(4);
		
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(16);
		root.right.left.left = new TreeNode(11);
		root.right.left.right = new TreeNode(13);
		
		root.right.right.left = new TreeNode(15);
		
		inOrder(root);
		System.out.println();
		TreeNode minNode = findMin(root);
		System.out.println(minNode.data);
		TreeNode maxNode = findMax(root);
		System.out.println(maxNode.data);
		insert(root,8);
		insert(root,1);
		inOrder(root);
		TreeNode t = remove(4,root);
		System.out.println();
		inOrder(t);
		TreeNode t2 = insertRec(root,4);
		System.out.println();
		inOrder(t2);
		
	}

}

import java.util.*;
public class inOrderTravel {

	/**
	 * @param args
	 */
	protected static void iterativeInorder2(treeNode p) {
		Stack <treeNode> stack = new Stack<treeNode>();
	    treeNode node = p;
	    while(node != null || stack.size() > 0){
	    	while(node != null){
	    		stack.push(node);
	    		node = node.left;
	    	}
	    	if(stack.size() > 0){
	    		node = stack.pop();
	    		System.out.println(node.value);
	    		node = node.right;
	    	}
	    }
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeNode root = new treeNode(1);
		root.left = new treeNode(2);
		root.left.left = new treeNode(3);
		
		iterativeInorder2(root);
	}

}

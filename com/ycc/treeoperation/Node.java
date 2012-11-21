package com.ycc.treeoperation;

public class Node {
	int value;
	  char s_value;
	  Node left;
	  Node right;
	  
	  public Node(char s){
	    s_value=s;
	    left=null;
	    right=null;
	  }
	  
	  public Node(int value){
	    this.value=value;
	    left=null;
	    right=null;
	  }
}

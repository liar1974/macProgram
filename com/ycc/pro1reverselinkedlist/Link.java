package com.ycc.pro1reverselinkedlist;

public class Link {
	int value;
	Link next;
	
	public Link(int value){
		this.value = value;
		this.next = null;
	}
	
	public String toString(){
		Link cur = this;
		String outPut="";
		while(cur != null){
			outPut += cur.value+"-->";
			cur = cur.next;
		}
		
		return outPut;
	}
	
}

package com.ycc.addnumber;

public class linkNode {
	private int data;
	private linkNode next;
	public linkNode(int data){
		this.data = data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getData(){
		return this.data;
	}
	public void setNext(linkNode next){
		this.next = next;
	}
	public linkNode getNext(){
		return this.next;
	}
}

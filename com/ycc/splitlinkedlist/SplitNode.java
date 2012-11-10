package com.ycc.splitlinkedlist;
//Split the linked list into two linked list
public class SplitNode {

	/**
	 * @param args
	 */
	public static Node splitMethod(Node node,int x){
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		
		while(node != null){
			Node next = node.next;
			node.next = null;
			if(node.data < x){
				if(beforeStart == null){
					beforeStart = node;
					beforeEnd = beforeStart;
				}else{
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}else{
				if(afterStart == null){
					afterStart = node;
					afterEnd = afterStart;
				}else{
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		
		if(beforeStart == null)
			return afterStart;
		
		beforeEnd.next = afterStart;
		
		return beforeStart;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		n1.next = new Node(3);
		n1.next.next = new Node(9);
		n1.next.next.next = new Node(7);
		n1.next.next.next.next = new Node(10);
		n1.next.next.next.next.next = new Node(4);
		n1.next.next.next.next.next.next = new Node(5);
		n1.next.next.next.next.next.next.next = new Node(6);
		
		Node head = splitMethod(n1,5);
		
		while(head != null){
			System.out.print(head.data + "-->");
			head = head.next;
		}
	}

}

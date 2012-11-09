package com.ycc.pro1reverselinkedlist;

public class LinkListReverseTest {

	/**
	 * @param args
	 */
	public static Link reverse(Link L){
		if(L == null || L.next == null)
			return L;
		
		Link remainingLink = reverse(L.next);
		Link cur = remainingLink;
		
		while(cur.next != null)
			cur = cur.next;
		
		cur.next = L;
		L.next = null;
		
		return remainingLink;
	}
	public static Link reverseIterative(Link L){
		Link node1 = L;
		Link node2 = null;
		Link bufnode;
		
		while(node1 != null){
			bufnode = node1;
			node1 = node1.next;
			bufnode.next = node2;
			node2 = bufnode;
		}
		
		return node2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Link myLink = new Link(1);
		myLink.next = new Link(2);
		myLink.next.next = new Link(3);
		myLink.next.next.next = new Link(4);
		
		System.out.println(myLink.toString());
		System.out.println("Recursive method:");
		System.out.println(reverse(myLink).toString());
		System.out.println("Iterative method:");
		//System.out.println(reverse(myLink).toString());

	}

}

package com.ycc.addnumber;
// add two linked list for example (1->2->3) + (2->4->5) = (3->6->8)
public class linkNodeTest {
	public linkNode addTwoLinkList(linkNode l1, linkNode l2, int carry){
		if(l1 == null && l2 == null){
			if(carry == 0)
				return null;
			else{
				linkNode result = new linkNode(carry);
			//	result.setData(carry);
				return result;
			}
		}
		linkNode result = new linkNode(carry);
		int value = carry;
		
		if(l1 != null)
			value += l1.getData();
		
		if(l2 != null)
			value += l2.getData();
		
		result.setData(value%10);
		
		linkNode more = addTwoLinkList(l1 == null ? null : l1.getNext(), l2 == null ? null : l2.getNext(), value > 10 ? 1 : 0);
		result.setNext(more);
		
		return result;
	}
	public static void main(String [] args){
		linkNode l1 = new linkNode(1);
		linkNode a1 = new linkNode(9);
		linkNode a2 = new linkNode(5);
		
		linkNode l2 = new linkNode(2);
		linkNode b1 = new linkNode(3);
		linkNode b2 = new linkNode(4);
		
		l1.setNext(a1);
		a1.setNext(a2);
		
		l2.setNext(b1);
		b1.setNext(b2);
		
		linkNodeTest lnt = new linkNodeTest();
		
		linkNode head = lnt.addTwoLinkList(l1, l2, 0);
		
		while(head != null){
			System.out.print(head.getData()+"--->");
			head = head.getNext();
		}
	}
}

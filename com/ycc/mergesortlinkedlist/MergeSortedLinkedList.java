package com.ycc.mergesortlinkedlist;



public class MergeSortedLinkedList {

	/**
	 * @param args
	 */
	public static ListNode mergeMethod(ListNode l1, ListNode l2){
		ListNode dummy = new ListNode(0);
		ListNode currentNode = dummy;
		
		while(l1 != null || l2 != null){
			if(l1 != null && l2 != null){
				if(l1.val < l2.val){
					currentNode.next = l1;
					l1 = l1.next;
				}else{
					currentNode.next = l2;
					l2 = l2.next;
				}
			}else if(l1 == null){
				currentNode.next = l2;
				l2 = l2.next;
			}else{
				currentNode.next = l1;
				l1 = l1.next;
			}
			currentNode = currentNode.next;
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(0);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(2);
		l1.next.next.next = new ListNode(3);
		l1.next.next.next.next = new ListNode(4);
		l1.next.next.next.next.next = new ListNode(5);
		
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(1);
		l2.next.next = new ListNode(2);
		l2.next.next.next = new ListNode(3);
		l2.next.next.next.next = new ListNode(4);
		l2.next.next.next.next.next = new ListNode(5);
		
		ListNode targetNode = mergeMethod(l1,l2);
		
		while(targetNode != null){
			System.out.print(targetNode.val + "-->");
			targetNode = targetNode.next;
		}
	}

}

package com.ycc.pro0201;

import java.util.*;

public class DeleteDupNode {
	
/*	public static void deleteDup(Node head){
		HashMap <Integer, Boolean> hm = new HashMap<Integer,Boolean>();
		
		Node previous = null;
		Node n = head;
		
		while(n != null){
			if(hm.containsKey(n.value)){
				previous.next = n.next;
			}else{
				hm.put(n.value, true);
				previous = n;
			}
			//previous = n;
			n = n.next;
		}
		
		Node runner = head;
		while(runner != null){
			System.out.print(runner.value+"-->");
			runner = runner.next;
		}
	}
	*/
	public static void deleteDup2(Node head){
		
		Node current = head;
		Node runner = current;
		while(current != null){
			while(runner.next != null){
				if(current.value == runner.next.value){
					runner.next = runner.next.next;
				}else
					runner = runner.next;
			}
			current = current.next;
			runner = current;
		}
	}
	public static void main(String []args){
		Node n1 = new Node(1);
		n1.next = new Node(1);
		n1.next.next = new Node(1);
		n1.next.next.next = new Node(4);
		n1.next.next.next.next = new Node(5);
		n1.next.next.next.next.next = new Node(4);
		n1.next.next.next.next.next.next = new Node(6);
		n1.next.next.next.next.next.next.next = new Node(4);
		n1.next.next.next.next.next.next.next.next = new Node(6);
		
		Node runner = n1;
		while(runner != null){
			System.out.print(runner.value+"-->");
			runner = runner.next;
		}
		
		System.out.println();
		//deleteDup(n1);
		
		deleteDup2(n1);
		while(n1 != null){
			System.out.print(n1.value+"-->");
			n1 = n1.next;
		}
	}
}

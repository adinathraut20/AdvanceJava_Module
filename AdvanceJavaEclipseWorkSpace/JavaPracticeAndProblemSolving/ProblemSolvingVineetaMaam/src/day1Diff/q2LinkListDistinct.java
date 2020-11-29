/* 2. Given two linked lists, your task is to complete the function makeUnion(),
that returns the union of two linked lists. This union should include all the
distinct elements only.Example 1:
Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 1 2 3 4 6 8 9
*/

package day1Diff;

import java.util.HashSet;
import java.util.Iterator;


class Node{
	int data;
	Node nextNd;
	public Node() {
		super();
		nextNd = null;
	}
	
	public Node(int data) {
		super();
		this.data = data;
		this.nextNd = null;
	}

	public Node(int data, Node nd) {
		super();
		this.data = data;
		this.nextNd = nd;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getnextNd() {
		return nextNd;
	}
	public void setnextNd(Node nd) {
		this.nextNd = nd;
	}
	
}

class Linklist{
	Node head;

	public Linklist() {
		super();
		head = null;
	}
	void insertNodeAtEnd(int  d) {
		Node nd = new Node(d);
		if(head == null) {
			head = nd;
		}
		else {
			Node temp = head;
			while(temp.getnextNd()!=null) {
				temp = temp.getnextNd();
			}
			temp.setnextNd(nd);
		}
		
	}
	void insertNodeAtBeg(int d) {
		Node nd = new Node(d);
		if(head == null) {
			head = nd;
		}
		else {
			nd.setnextNd(head);
			head = nd;
		}
	}
	void traversal1() {
		if(head==null) {
			
		}
		else {
			Node temp = head;
			while(temp.getnextNd() != null) {
				System.out.print(temp.getData()+" ");
				
				temp = temp.getnextNd();
				
			}
			
			System.out.println(temp.getData());
		
		}
	}
	HashSet<Integer> traversal(HashSet<Integer> hSet) {
		if(head==null) {
			return null;
		}
		else {
			Node temp = head;
			while(temp.getnextNd() != null) {
			//	System.out.println(temp.getData());
				hSet.add(temp.getData());
				temp = temp.getnextNd();
				
			}
			hSet.add(temp.getData());
		//	System.out.println(temp.getData());
			return hSet;
		}
	}
}


public class q2LinkListDistinct {
	public static void main(String[] args) {
		
		Linklist li = new Linklist();
		li.insertNodeAtEnd(9);
		li.insertNodeAtEnd(6);
		li.insertNodeAtEnd(4);
		li.insertNodeAtEnd(3);
		li.insertNodeAtEnd(2);
		li.insertNodeAtEnd(8);
		
		Linklist li1 = new Linklist();
		
		li1.insertNodeAtBeg(2);
		li1.insertNodeAtBeg(6);
		li1.insertNodeAtBeg(8);
		li1.insertNodeAtBeg(2);
		li1.insertNodeAtBeg(1);
		HashSet<Integer> hSet1 = new HashSet<Integer>();
		
		
		hSet1 = li.traversal(hSet1);
		System.out.println("  ");
		hSet1 = li1.traversal(hSet1);
		
		Linklist ld = new Linklist();
		Iterator<Integer> itr = hSet1.iterator();
		
		while(itr.hasNext()) {
			int d = itr.next();
			ld.insertNodeAtEnd(d);
		}
		//System.out.println(" ");
		ld.traversal1();
		
		
	}
}

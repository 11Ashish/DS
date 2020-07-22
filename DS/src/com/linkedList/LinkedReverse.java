package com.linkedList;

//Recursive Java program to reverse 
//a linked list 
public class LinkedReverse { 
	static Node head; // head of list 
	
	static class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	static Node reverse(Node head) 
	{ 
		if (head == null || head.next == null) 
			return head; 

		/* reverse the rest list and put 
		the first element at the end */
		Node rest = reverse(head.next); 
		head.next.next = head; 

		
		head.next = null; 

		/* fix the head pointer */
		return rest; 
	} 

	/* Function to print linked list */
	static void print() 
	{ 
		Node temp = head; 
		while (temp != null) { 
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	static void push(int data) 
	{ 
		Node temp = new Node(data); 
		temp.next = head; 
		head = temp; 
	} 
	
	public static Node reverseIteration(Node head){
		if(head==null)
			return head;
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}

	static Node reverse2(Node head)  
    {  
        if (head == null || head.next == null)  
            return head;  
  
        /* reverse the rest list and put  
        the first element at the end */
        Node rest = reverse(head.next);  
        head.next.next = head;  
  
        /* tricky step -- see the diagram */
        head.next = null;  
  
        /* fix the head pointer */
        return rest;  
    }  

/* Driver program to test above function*/
public static void main(String args[]) 
{ 
	/* Start with the empty list */
	
	push(20); 
	push(4); 
	push(15); 
	push(85); 

	System.out.println("Given linked list"); 
	print(); 

	head = reverse(head); 

	System.out.println("Reversed Linked list"); 
	print(); 
	head = reverseIteration(head); 

	System.out.println("Reversed Linked list"); 
	print(); 
	
	head = reverse2(head); 

	System.out.println("Reversed Linked list"); 
	print(); 
	
} 
} 


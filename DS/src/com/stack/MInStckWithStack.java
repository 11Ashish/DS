package com.stack;
import java.util.Stack; 



class MinStckWithStack { 
	Stack<Integer> min = new Stack<>(); 
	Stack<Integer> super1=new Stack<>(); 

	void push(int x) 
	{ 
		if (super1.isEmpty() == true) { 
			super1.push(x); 
			min.push(x); 
		} 
		else { 
			super1.push(x); 
			int y = min.pop(); 
			min.push(y); 
			if (x < y) 
				min.push(x); 
			else
				min.push(y); 
		} 
	} 


	public Integer pop() 
	{ 
		int x = super1.pop(); 
		min.pop(); 
		return x; 
	} 


	int getMin() 
	{ 
		int x = min.pop(); 
		min.push(x); 
		return x; 
	} 


	public static void main(String[] args) 
	{ 
		MinStckWithStack s = new MinStckWithStack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		System.out.println(s.getMin()); 
		s.push(5); 
		System.out.println(s.getMin()); 
	} 
} 


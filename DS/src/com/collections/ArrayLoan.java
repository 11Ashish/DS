package com.collections;

import java.util.ArrayList;

class Loan{
	 int data;
	
}
class AutoLoan extends Loan{
	int j;
	public void m1(){
		System.out.println(j);
	}
}
class HomeLoan extends Loan{
	int j;
	public void m1(){
		System.out.println(j);
	}
}
public class ArrayLoan {
	static ArrayList<Loan> al=new ArrayList();
	public static void  m1(Loan l){
		
		if(l instanceof AutoLoan){
			al.add(l);
		}
		else{
			al.add(l);
		}
		
	}
public static void main(String[] args) {
	

	//ArrayList<Loan> al=new ArrayList();
	Loan l1=new AutoLoan();
	m1(l1);
	Loan l=new HomeLoan();
	m1(l);
	System.out.println(al);
}
}

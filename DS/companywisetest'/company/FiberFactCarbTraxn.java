package company;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.ArrayList;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

//Traxn company
public class FiberFactCarbTraxn {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       ArrayList<String> al=new ArrayList<String>();
       
       /* int numberOfDays = in.nextInt();
        
        if(numberOfDays>=1 &&numberOfDays<=20){
        	  String ingredient="";
        	
        for (int i = 0; i < numberOfDays; i++) {
             ingredient = in.next();
           
             }*/
       String[] aa={"FATOil","FATCheese", "FATEgg", "FIBERSpinach" ,"CARBRice", "FIBERBeans"};
        System.out.println(aa.length);
        
      
        for(int i=0;i<aa.length;i++){
        	al.add(aa[i]);
        	
        	printDis(al);
        }
        
        
    }
    

    private static void printDis(ArrayList a) {
		ArrayList s1=new ArrayList();
		for(int i=0;i<a.size();i++){
			s1.add(a.get(i));
			m2(s1);
			System.out.println("Hello" +s1);
		}
		
		//m2(s);
		
	}

	private static void m2(ArrayList<String> s) {
		
		int v1=0,v2=0,v3=0;
	
		if(s.size()==1 || s.size()==2){
			System.out.print("0 ");
		}
		else{
			if(s.size()>=3){
				for(int i=0;i<s.size();i++){
					if(s.get(i).startsWith("FIBER"))
						v1++;
					if(s.get(i).startsWith("FAT"))
						v2++;
					if(s.get(i).startsWith("CARB"))
						v3++;
					if(v1==2 || v2==2 || v3==2){
						
						System.out.print("1 ");
						
							if(v1==2){
							for(int j=0;j<s.size();j++){
								
							if(s.get(j).startsWith("FIBER"))
								// arr[i]=j;
							s.remove(j);
							}
							}
							if(v2==2){
								for(int j=0;j<s.size();j++){
									
								if(s.get(j).startsWith("FAT"))
									// arr[i]=j;
								s.remove(j);
								}
							}
								if(v3==2){
									for(int j=0;j<s.size();j++){
										
									if(s.get(j).startsWith("CARB"))
										// arr[i]=j;
									s.remove(j);
									}
							}
							
						
						
					}
				
							
							
					else
						System.out.print("0 ");
				}
			}
			s.remove(0);
		}
	}

	
}

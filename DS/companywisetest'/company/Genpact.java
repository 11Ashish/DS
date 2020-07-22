package company;

import java.util.Arrays;
import java.util.List;

public class Genpact {
	/*static final String sample="simple";
	String output=sample+"sample";
	void m1(){
		if("simplesample"==output){
			System.out.println("hiiiiiii");
		}
		else
			System.out.println("else");
	}*/
	static Integer  ic=0;
	
public static void main(String[] args) {
Genpact g=new Genpact();
String s="ABC";
mymethod(s);
System.out.println(s);

//g.m1();
int a=1;
int b=2;
int c=3;
a|=4;
b>>=1;
c<<=1;
a*=c;
System.out.println(a);
System.out.println(a+" "+b+" "+c);
g.ForEACHLooP();



}

private  void ForEACHLooP() {
	List<String> al=Arrays.asList("a","b","c");
	//final Integer  ic=0;
	al.stream().forEach(i->{
		i+=ic;
	});
	System.out.println(ic);
}

private static void mymethod(String s) {
	// TODO Auto-generated method stub
	s="DEF";
	System.out.println(s);
	
}
}

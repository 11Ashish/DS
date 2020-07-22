package company;
import java.util.Stack;

public class Brackmatching {
public static void main(String[] args) {
	char exp[] = {'{','(',')','}','[',']','('}; 
	 if (areParenthesisBalanced(exp)) 
         System.out.println("Balanced "); 
       else
         System.out.println("Not Balanced ");   
 
}
private static boolean isMatching(char ch1,char ch2){
	if(ch1=='{' && ch2=='}')
		return true;
	if(ch1=='[' && ch2==']')
		return true;
	if(ch1=='(' && ch2==')')
		return true;
	return false;
}

private static boolean areParenthesisBalanced(char[] exp) {
	Stack<Character> s=new Stack();
	
	for(int i=0;i<exp.length;i++){
		if(exp[i]=='{' || exp[i]=='[' || exp[i]=='('){
			s.push(exp[i]);
		}
		
		if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
        { 
		
			if(s.isEmpty())
				return false;
			else if(!isMatching(s.pop(), exp[i]))
				return false;
		}
	}	
	
	 if (s.isEmpty()) 
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false; 
         }  
}
}

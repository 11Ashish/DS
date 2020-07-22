package company;

public class MaxiLexicographicSubstringGenpact {
//Java Program to find the lexicographically maximum substring;
	
	public static String LexicographicMaxString(String s){
		String mx="";
		for(int i=0;i<s.length();i++){
			if(mx.compareTo(s.substring(i))<=0){
				mx=s.substring(i);
			}
			
		}
		return mx ;
	}
	
	public static void main(String[] args) {
		String str="ababaa";
		System.out.println(LexicographicMaxString(str));
	}
}

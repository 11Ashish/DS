package company;

public class StringCompress {
public static void main(String[] args) {
	String s="aaaaaaabaabbbccccc";
	String s1="ad";
	String s2="hhhgggfftttlllls";
	System.out.println("compressed string    "+ m1(s));
	System.out.println("compressed string    "+ m1(s1));
	System.out.println("compressed string    "+ m1(s2));
}

private static String m1(String s) {
	int count=1;
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length()-1;i++){
	
		if(s.charAt(i)==s.charAt(i+1)){
			count++;
			
		}
		else{
			
			if(count==1){
				sb.append(s.charAt(i));
				count=1;
			}
			else{
			sb.append(s.charAt(i)).append(count);
			count=1;
			}
		}
	}
	if(count==1){
		sb.append(s.charAt(s.length()-1));
	}
	else{
	sb.append(s.charAt(s.length()-1)).append(count);
	
	}
	return sb.toString();
}
}

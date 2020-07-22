package company;
import java.util.ArrayList;
import java.util.List;
//Genpact.
public class MaxDifferenceGenpact {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	/*l.add(7);
	l.add(1);
	l.add(2);
	l.add(5);*/
	//Expected Output 8
	l.add(7);
	l.add(2);
	l.add(3);
	l.add(10);
	
	l.add(2);
	l.add(4);
	l.add(8);
	l.add(1);
	int k=maxDifference(l);
	System.out.println(k);
	
}
public static int maxDifference(List<Integer> px) {
    // Write your code here
    int[] a=px.stream().mapToInt(i->i).toArray();

    int max=0;
    for(int i=0;i<a.length-1;i++){
    if(a[i]<=a[i+1]){
        max=a[i+1]-a[i];
      //  int j=i+1;
         // while(j==0)
        for(int j=i+1;j>0;j--)  
        {
             int val=0;
        	 if(a[j-1]<a[j]){
              val= a[i+1]-a[j-1];
              if(val>max){
                  max=val;
              }
        	 }
             //j=j-1;
            
          }

    }
}
return max;
    }
}


